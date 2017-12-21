var PortalModule=angular.module('PortalModule',['ngRoute']);

PortalModule.config(function($routeProvider){

$routeProvider.when("/",{
  templateUrl:'app/portalindex.html'
})
.when("/register",{
  templateUrl:'app/user/register.html'
})
.when("/login",{
  templateUrl:'app/portalindex.html'
})
})



PortalModule.controller('NavigationController',['$scope',function($scope){
  this.existingUser=true;

  this.userController=function(existance)
  {
    this.existingUser=existance;
  }



}])
