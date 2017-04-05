/**/
var app = angular.module('myApp', [ 'ngRoute', 'ngCookies' ]);
app.config([ '$routeProvider', '$locationProvider',
		function($routeProvider, $locationProvider) {
			$routeProvider.when('/', {
				templateUrl : 'templates/login.html',
				controller : 'userController'
			});
			$routeProvider.when('/forgotpassword', {
				templateUrl : 'templates/resetPassword.html',
				controller : 'userController'
			});
			$routeProvider.when('/changepassword', {
				templateUrl : 'templates/changepassword.html',
				controller : 'userController',
				authenticated : true
			});
			$routeProvider.when('/signup', {
				templateUrl : 'templates/signup.html',
				controller : 'userController'
			});
			$routeProvider.when('/profile', {
				templateUrl : 'templates/dashboard.html',
				controller : 'userController',
				authenticated : true
			});
			$routeProvider.when('/home', {
				templateUrl : 'templates/home.html',
				controller : 'userController',
				authenticated : true
			});
			$routeProvider.when('/points', {
				templateUrl : 'templates/voucher.html',
				controller : 'userController',
				authenticated : true
			});
			$routeProvider.when('/about', {
				templateUrl : 'templates/contactus.html',
				controller : 'userController',
				authenticated : true
			});
			$routeProvider.when('/logout', {
				templateUrl : 'templates/logout.html',
				controller : 'userController',
				authenticated : true
			});

			$routeProvider.otherwise('/');
		}

]);

app.run([ "$rootScope", "$location", 'userModel',
		function($rootScope, $location, userModel) {
			$rootScope.$on("$routeChangeStart", function(event, next, current) {
				if (next.$$route.authenticated) {
					if (!userModel.getAuthStatus()) {
						$location.path('/');
					}
				}

				if (next.$$route.originalPath == '/') {
					console.log('Login Page');
					if (userModel.getAuthStatus()) {
						$location.path(current.$$route.originalPath);
					}
				}
			});
		} ]);