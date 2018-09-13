package contracts;

org.springframework.cloud.contract.spec.Contract.make {
	label("shouldReturnAMockedJoke")
  request {
    method 'GET'
    urlPath '/chuck'
  }
response {
  status OK()
  headers{
	  contentType(applicationJson())
  }
  body(
    id: $(anyNumber()),
	fact: $(anyNonEmptyString())
  )
  
 }
}