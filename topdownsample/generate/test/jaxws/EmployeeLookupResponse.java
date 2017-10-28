
package test.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "employeeLookupResponse", namespace = "http://test/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeLookupResponse", namespace = "http://test/")
public class EmployeeLookupResponse {

    @XmlElement(name = "return", namespace = "")
    private test.EmployeeInfoWrapper _return;

    /**
     * 
     * @return
     *     returns EmployeeInfoWrapper
     */
    public test.EmployeeInfoWrapper getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(test.EmployeeInfoWrapper _return) {
        this._return = _return;
    }

}
