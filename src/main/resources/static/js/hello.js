var urlpath;
var usuario;
var categoria;
var editora;
var loja;
var regra;
var livro;

angular.module('hello', ['ngRoute'])
	.controller('MainController', function($scope, $route, $routeParams, $location) {
	     $scope.$route = $route;
	     $scope.$location = $location;
	     $scope.$routeParams = $routeParams;
	 })

.controller('HomeCtrl', function($scope, $rootScope, $location) {
    $scope.usuario = this.usuario;
    $rootScope.activetab = $location.path();
})
	 
.controller('categoriaCtrl', function($scope, $rootScope, $location) {
    $scope.categoria = this.categoria;
    $rootScope.activetab = $location.path();
})

.controller('editoraCtrl', function($scope, $rootScope, $location) {
    $scope.editora = this.editora;
    $rootScope.activetab = $location.path();
})

.controller('lojaCtrl', function($scope, $rootScope, $location) {
    $scope.loja = this.loja;
    $rootScope.activetab = $location.path();
})

.controller('regraCtrl', function($scope, $rootScope, $location) {
    $scope.regra = this.regra;
    $rootScope.activetab = $location.path();
})

.controller('livroCtrl', function($scope, $rootScope, $location) {
    $scope.livro = this.livro;
    $rootScope.activetab = $location.path();
})

.config(function($routeProvider, $locationProvider){
  
   $locationProvider.html5Mode(true);
 
   $routeProvider
 
   .when('/', {
      templateUrl : '/views/home.html',
      controller     : 'HomeCtrl',
   })
 
   .when('/sobre', {
      templateUrl : '/views/sobre.html',
      controller  : 'SobreCtrl',
   })
 
   .when('/contato', {
      templateUrl : '/views/contato.html',
      controller  : 'ContatoCtrl',
   })
 
   .otherwise ({ redirectTo: '/' });
});