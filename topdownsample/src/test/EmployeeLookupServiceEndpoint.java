package test;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class EmployeeLookupServiceEndpoint implements EmployeeLookupService {

    @Override
    public EmployeeInfoWrapper employeeLookup(EmployeeIdWrapper employeeIdList) {
        return null;
    }


    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/EmployeeLookupservice", new EmployeeLookupServiceEndpoint());
    }
}
