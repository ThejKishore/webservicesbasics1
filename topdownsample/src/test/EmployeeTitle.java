
package test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeTitle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeTitle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CEO"/>
 *     &lt;enumeration value="Manger"/>
 *     &lt;enumeration value="Supervisor"/>
 *     &lt;enumeration value="Clerk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeTitle")
@XmlEnum
public enum EmployeeTitle {

    CEO("CEO"),
    @XmlEnumValue("Manger")
    MANGER("Manger"),
    @XmlEnumValue("Supervisor")
    SUPERVISOR("Supervisor"),
    @XmlEnumValue("Clerk")
    CLERK("Clerk");
    private final String value;

    EmployeeTitle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeTitle fromValue(String v) {
        for (EmployeeTitle c: EmployeeTitle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
