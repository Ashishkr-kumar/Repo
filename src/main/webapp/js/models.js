app.factory('userModel', [ '$http', '$cookies', '$location',
		function($http, $cookies, $location) {
			var userModel = {};

			/**
			 * Check if the credentials are correct from server and return the
			 * promise back to the controller
			 * 
			 * @param {array}
			 *            loginData
			 * @return {promise}
			 */
			userModel.doLogin = function(login) {
				console.log('hi');
				console.log(login);
				return $http({
					method : 'POST',
					url : 'rest/service/verifyLogin',
					headers : {
						'Content-Type' : 'application/json'
					},
					data : {
						email : login.email,
						password : login.password
					}
				}).success(function(data, status, headers, config) {
					console.log('inside model');
					console.log("logged in successfully");
					$cookies.put('auth', JSON.stringify(data));
				}).error(function(data, status, headers, config) {
					console.log("login fail");
					console.log(data);
				});
				
			};
			userModel.doSignup = function(signup) {
				return $http({
					method : 'POST',
					url : 'rest/service/register',
					headers : {
						'Content-Type' : 'application/json'
					},
					data : signup
				}).success(function(data, status, headers, config) {
					console.log("emp added");
				}).error(function(data, status, headers, config) {
					console.log("emp adding failed");
				});

			};
			
			userModel.doResetPassword = function(resetdata) {
				return $http({
					method : 'PUT',
					url : 'rest/service/resetPassword',
					headers : {
						'Content-Type' : 'application/json'
					},
					data : {
						email : resetdata.email
					}
				}).success(function(data, status, headers, config) {
					console.log(data);
					console.log('reseted');
				}).error(function(data, status, headers, config) {
					console.log('Hiiii');
					console.log(data);
					
					console.log(status);
					console.log(headers);
					console.log(config);
				});
			};

			userModel.viewprofile = function() {
				var user = userModel.getUserObject();
				console.log(user.email);
				return $http({
					method : 'GET',
					url : 'rest/service/getProfile?email=' + user.email,
					headers : {
						'Content-Type' : 'application/json'
					},
				}).success(function(response) {

					console.log('Profile page');
					console.log(response);
					$cookies.put('profile', JSON.stringify(response));
				}).error(function(data, status, headers, config) {
					console.log("login fail");
					console.log(data, status, headers);
					alert(data);
				});
			};
			userModel.rewardPointReport = function(point) {
				var user = userModel.getUserObject();
				console.log('rewardpoint report');
				console.log(user.email);
				return $http({
					method : 'PUT',
					url : 'rest/service/genrateReport',
					headers : {
						'Content-Type' : 'application/json'
					},
					data : {
						rewardPoint : point.rewardPoint,
						email : user.email
					}
				}).success(function(response) {
					console.log('Voucher Genrated');
					console.log(response);
				}).error(function(data, status, headers, config) {
					console.log("Voucher Genration fail");
					console.log(data, status, headers);
					alert(data);
				});
			};
			userModel.doContactForm = function(contact) {
				return $http({
					method : 'POST',
					url : 'rest/service/contact',
					headers : {
						'Content-Type' : 'application/json'
					},
					data : contact
				}).success(function(response) {
					console.log("Contected successfully");
				}).error(function(data, status, headers, config) {
					console.log("login fail");
					console.log(data, status, headers);
					alert(data);
				});
			};
			userModel.doChangePassword = function(password) {
				var user = userModel.getUserObject();
				return $http({
					method : 'PUT',
					url : 'rest/service/changePassword?email=' + user.email,
					headers : {
						'Content-Type' : 'application/json'
					},
					data : password
				}).success(function(data, status, headers, config) {
					alert('password changed successfully');
					console.log("logged in successfully");
				}).error(function(data, status, headers, config) {
					console.log("login fail");
				});
			};
			/**
			 * Return whether the user is logged in or not based on the cookie
			 * set during the login
			 * 
			 * @return {boolean}
			 */
			userModel.getAuthStatus = function() {
				var status = $cookies.get('auth');
				if (status) {
					return true;
				} else {
					return false;
				}
			};

			/**
			 * Get the user object converted from string to JSON
			 * 
			 * @return {user object}
			 */
			userModel.getUserObject = function() {
				var userObj = angular.fromJson($cookies.get('auth'));
				return userObj;
			};
			userModel.getProfileObject = function() {
				var profileObj = angular.fromJson($cookies.get('profile'));
				return profileObj;
			};

			/**
			 * Close the session of the current user and delete the cookie set
			 * for him
			 * 
			 * @return boolean
			 */
			userModel.doUserLogout = function() {
				$cookies.remove('auth');
				$cookies.remove('profile');
			};

			return userModel;
		} ]);

// # sourceMappingURL=models.js.map
