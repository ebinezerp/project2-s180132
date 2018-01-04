// UserModule.service('UserService',['$http',function($http){
//
//       this.emailExisted=function(email) {
//              $http.get()
//
//       }
//
// }])


UserModule.factory('UserService',['$http',function($http){

     var UserService={};

     UserService.emailExisted=function(email)
     {

     }

  return UserService;
}])
