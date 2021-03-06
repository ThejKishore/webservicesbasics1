
package test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "employeeLookupService", targetNamespace = "http://www.memorylack.com/company")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeLookupService {


    /**
     * 
     * @param employeeIdList
     * @return
     *     returns test.EmployeeInfoWrapper
     */
    @WebMethod(action = "http://www.memorylack.com/company/employeeLookup")
    @WebResult(name = "EmployeeInfoList", targetNamespace = "http://www.memorylack.com/company", partName = "employeeInfoList")
    public EmployeeInfoWrapper employeeLookup(
        @WebParam(name = "EmployeeIdList", targetNamespace = "http://www.memorylack.com/company", partName = "employeeIdList")
        EmployeeIdWrapper employeeIdList);

}
