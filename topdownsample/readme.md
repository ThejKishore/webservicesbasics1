[Top-Down approach reference](http://www.memorylack.com/2011/06/top-down-jax-ws-web-service-provider.html)

----JAXB data Object creating 

```java
xjc -wsdl ./wsdl/company.wsdl -p com.memorylack.www.ws.model
```


---- Creating Webservice client/service from the cmd 
This is used in top down approach, by service providing team for creating actual service as well as by consuming team to create client.

```java
wsimport -d ./generated -s ./src -p test ./wsdl/company.wsdl 
```

---- creating wsdl from implementation from the cmd
This is used in bottom up approach to generate wsdl and share it across.
```java
wsgen -verbose -keep -cp . test.EmployeeLookupServiceEndpoint  -r ../bottomup -wsdl
```