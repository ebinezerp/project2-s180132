var UserModule=angular.module('UserModule',[]);

UserModule.controller('UserController',function(){
  // creating emply user object and binding to the user controller
  this.user={};
  var regCtrl=this;

  this.register=function()
  {
    // using below console statement we can check the user object has binded data or not
     //console.log(regCtrl.user);
  }
})
