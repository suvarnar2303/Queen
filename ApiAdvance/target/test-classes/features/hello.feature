Feature: print hello world

  Scenario: hello Wrold scenrio
   Given ulr 'https://reqres.in/api/users?page=2'
   When method get
   Then status 200
