var PortalModule=angular.module('PortalModule',['ngRoute']);

PortalModule.config(function($routeProvider){

$routeProvider.when("/",{
  templateUrl:'app/portalindex.html'
})
})
