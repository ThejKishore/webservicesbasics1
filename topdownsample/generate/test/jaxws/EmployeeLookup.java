
package test.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "employeeLookup", namespace = "http://test/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeLookup", namespace = "http://test/")
public class EmployeeLookup {

    @XmlElement(name = "arg0", namespace = "")
    private test.EmployeeIdWrapper arg0;

    /**
     * 
     * @return
     *     returns EmployeeIdWrapper
     */
    public test.EmployeeIdWrapper getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(test.EmployeeIdWrapper arg0) {
        this.arg0 = arg0;
    }

}
