app.controller('navController', ['$scope', '$location', 'userModel', function($scope, $location, userModel) {
    /*Variables*/
    angular.extend($scope, {
        user: userModel.getUserObject(),
        /*users:userModel.getProfileObject(),*/
        navUrl: [{
            link: 'Home',
            url: '/home',  
        }, {
        	link: 'View Profile',
            url: '/profile'
        }, {
            link: 'Reward Points',
            url: '/points'
        }, {
            link: 'About Us',
            url: '/about'
        }]
    });

    /*Methods*/
    angular.extend($scope, {
        doLogout: function() {
            userModel.doUserLogout();
            $location.path('/');
        },
        checkActiveLink: function(routeLink) {
            if ($location.path() == routeLink) {
                return 'make-active';
            }
        }
    });
}]);