app
		.controller(
				'userController',
				function($scope, $http, $location, $cookies, $timeout,
						userModel) {

					$scope.users = [];
					$scope.msg=null;
					$scope.calculateIncentive = function(incentiveForm) {
						var incentiveData = {
								'month' : $scope.month,
								'users' : $scope.users
						};
						console.log($scope.users);
						userModel.calculateIncentive(incentiveData).then(function() {
							$location.path('/profile');
						});
					};
				});