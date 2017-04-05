var registrationApp = angular.module("registrationApp", []);

registrationApp.controller("registrationController", function($scope,$http) {
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
