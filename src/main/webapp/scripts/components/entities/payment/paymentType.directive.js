'use strict';

angular.module('membershipApp')
	.directive('paymentType', function() {
		return {
			restrict: 'E',
		    scope: {
		    	labelSize: '=labelSize',
		    	payment: '=model',
		    	waiting: '=waiting'
		    },
		    controller: function($scope){
		    	$scope.payment = $scope.payment != null ? $scope.payment : 'Cash';
		    },
            templateUrl: 'scripts/components/entities/payment/paymentType.html'
        };
	});