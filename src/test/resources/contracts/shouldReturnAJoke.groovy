package contracts;

org.springframework.cloud.contract.spec.Contract.make {
  request {
    method 'GET'
    url 'http://localhost:7070/chuck'
  }
response {
  status 200
 }
}