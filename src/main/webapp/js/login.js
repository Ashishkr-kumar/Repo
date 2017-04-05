var app=angular.module('loginApp',['ngRoute']);
app.config(['$routeProvider',
            function($routeProvider) {
              $routeProvider.
                when('/loggedin', {
                  templateUrl: 'index.jsp',
                  controller: 'AddOrderController'
                }).
                otherwise({
                  redirectTo: '/addOrder'
                });
            }]);


app.factory('myService', function() {
	 var savedData = {};
	 function set(data) {
	   savedData = data;
	 }
	 function get() {
	  return savedData;
	 }

	 return {
	  set: set,
	  get: get
	 };

	});

app.controller('loginController', function($scope,$http,$location,myService) {
	
	$scope.userProfile=[];
	
$scope.login=function(){
		
		$scope.login={'email':$scope.email,
				      'password':$scope.password
				     };
		console.log($scope.login);
		$http({
			method : 'POST',
			url : 'rest/service/verifyLogin',
			headers: {'Content-Type': 'application/json'},
			data    : $scope.login
		}).success(function(data, status, headers, config) {
			var response=data;
			if(response=="passwordChange"){
				window.location.href='passwordchange.html';
				//$scope.changepassword($scope.email);
				//alert($scope.email);
			}else if(response=="success"){
				alert(myService.set($scope.email));
				myService.set($scope.email);
				alert($scope.loggedin($scope.email));
				window.location.href = 'profile.html';
				
			}
			else{
				window.location.href='index.html';
			}
			console.log("logged in successfully");
		}).error(function(data, status, headers, config) {
			console.log("login fail");
		});
		
	};
	
	$scope.loggedin=function(){
		alert('insideloggedin');
		$scope.emailProfile=myService.get();
		var res = $http.get('rest/service/getProfile?email='+emailProfile, 
				{
					action : 'getProfile'
				});
				res.success(function(data, status, headers, config) {
					$scope.userProfile = data;
					console.log($scope.userProfile);
				});
				res.error(function(data, status, headers, config) {
					console.log("Error while getting the profile information");
				});
	};
	
	$scope.changepassword=function(email){
		$scope.password={
				'email':email,
				'currentPassword':$scope.cPassword,
			      'newPassword':$scope.nPassword,
			      'cPassword':$scope.coPassword
			     };
	console.log($scope.password);
	$http({
		method : 'PUT',
		url : 'rest/service/changePassword',
		headers: {'Content-Type': 'application/json'},
		data    : $scope.password
	}).success(function(data, status, headers, config) {
		alert('password changed successfully');
		console.log("logged in successfully");
	}).error(function(data, status, headers, config) {
		console.log("login fail");
	});
	
};
});




app.controller('registrationController', function($scope,$http) {
	registrationData={};
	$scope.register=function(){
		
		$scope.registrationData = {
				'fname' : $scope.fname,
				'lname' : $scope.lname,
				'email' : $scope.email,
				'mobile' : $scope.mobile,
				'sex':$scope.sex,
				'password':$scope.password,
		        'repassword':$scope.repassword
			};
			console.log($scope.employeeData);
			$http({
				method : 'POST',
				url : 'rest/service/register',
				headers: {'Content-Type': 'application/json'},
				data    : $scope.registrationData
			}).success(function(data, status, headers, config) {
				console.log("emp added");
			}).error(function(data, status, headers, config) {
				console.log("emp adding failed");
			});
	};
});


app.controller('resetPasswordController',function($scope, $http) {
	
	$scope.reset=function(){
		$scope.resetData={
				'email' : $scope.email,
		};
		$http({
			method : 'PUT',
			url : 'rest/service/resetPassword',
			headers: {'Content-Type': 'application/json'},
			data    : $scope.resetData
		}).success(function(data, status, headers, config) {
			//$scope.person = data;
			console.log(data);
		}).error(function(data, status, headers, config) {
			// called asynchronously if an error occurs
			// or server returns response with an error status.
		});
	};
});