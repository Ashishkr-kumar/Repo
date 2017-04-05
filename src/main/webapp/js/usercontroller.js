app
		.controller(
				'userController',
				function($scope, $http, $location, $cookies, $timeout,
						userModel) {
					$scope.users = [];
					$scope.usersIncentive = [];
					$scope.resources=[];
					$scope.resetData = [];
					$scope.logindata = [];
					$scope.loader =false;
					$scope.msg=null;
					$scope.incentiveList=[];
					$scope.doLogin = function(loginForm) {
						if (loginForm.$valid) {
							$scope.formSubmitted = false;
							var login = {
								'email' : $scope.email,
								'password' : $scope.password
							};
							$scope.loader =true;
								userModel
								.doLogin(login)
								.then(
										function(data) {
											$scope.users = data.data;
											console.log(data);
											if ($scope.users != null) {
												if ($scope.users.resetPasswordInd == true) {
													$location
															.path('/changepassword');
												}else {
													$location
															.path('/profile');
												}
											} else {
												
												$scope.msg = "Invalid username or password";
												$scope.loader=false;
											}
										});
						} else {
							$scope.formSubmitted = true;
							console.log('Error');
						}
					};
					$scope.doSignup = function(signupForm) {
						var signup = {
							'fname' : $scope.fname,
							'lname' : $scope.lname,
							'email' : $scope.email,
							'mobile' : $scope.mobile,
							'password' : $scope.password
						};
						userModel.doSignup(signup).then(function() {
							$location.path('/');
						});
					};

					$scope.doResetPassword = function(resetpasswordForm) {
						if (resetpasswordForm.$valid) {
							$scope.formSubmitted = false;
							var resetdata = {
								'email' : $scope.email
							};
							$scope.loader =true;
								userModel
								.doResetPassword(resetdata)
								.then(
										function(data) {
									
											$scope.resetData = data.data;
											if($scope.resetData !=null){
											$scope.msg = "Your password has been reseted sucessfully";
											alert($scope.msg);
											$location.path('/');
											}else{
												$scope.msg = "Invalid email address";
												$scope.loader=false;
											}
											
							});
						} else {
							$scope.formSubmitted = true;
							$scope.msg = 'Please enter valid email address';
							console.log('Error');
						}
					};

					$scope.doLogout = function() {
						userModel.doUserLogout();
						$scope.msg = 'Logged out sucessfully';
						$scope.loader =true;
						$location.path('/');
					};

					$scope.viewprofile = function() {
						userModel.viewprofile().then(function(data) {
							console.log(JSON.stringify(data.data));
							$scope.users = data.data;
							$scope.loader =true;
							console.log($scope.users);
							$location.path('/profile');
						});
					};
					$scope.rewardPointReport = function(rewardpointForm) {
						
						var point = {
							'rewardPoint' : $scope.rewardpoint
						};
						if (rewardpointForm.$valid) {
							$scope.formSubmitted = false;
						$scope.loader =true;
						console.log('alert1');
						console.log(point);
						userModel.rewardPointReport(point).then(function() {
							$location.path('/profile');
						});
						}else {
							$scope.formSubmitted = true;
							$scope.msg = 'Please enter Reward point';
							console.log('Error');
						}
					};
					$scope.doContactForm = function(contactForm) {
						var contact = {
							'name' : $scope.name,
							'mobile' : $scope.mobile,
							'email' : $scope.email,
							'requirement' : $scope.requirement
						};
						userModel.doContactForm(contact).then(function() {
							$location.path('/profile');
						});
					};
					$scope.doChangePassword = function(changePasswordForm) {
						var password = {
							'currentPassword' : $scope.passw.cupassword,
							'newPassword' : $scope.passw.npassword,
							'cPassword' : $scope.passw.cpassword
						};
							userModel.doChangePassword(password).then(function(data) {
								$location.path('/');
							});
					};
				});