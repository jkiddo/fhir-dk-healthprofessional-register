
package dk.sst;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeventyFiveYearsRuleStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeventyFiveYearsRuleStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSubjectTo75YearsRule"/>
 *     &lt;enumeration value="SubjectTo75YearsRule"/>
 *     &lt;enumeration value="ExemptionFrom75YearsRuleGranted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeventyFiveYearsRuleStatus")
@XmlEnum
public enum SeventyFiveYearsRuleStatus {

    @XmlEnumValue("NotSubjectTo75YearsRule")
    NOT_SUBJECT_TO_75_YEARS_RULE("NotSubjectTo75YearsRule"),
    @XmlEnumValue("SubjectTo75YearsRule")
    SUBJECT_TO_75_YEARS_RULE("SubjectTo75YearsRule"),
    @XmlEnumValue("ExemptionFrom75YearsRuleGranted")
    EXEMPTION_FROM_75_YEARS_RULE_GRANTED("ExemptionFrom75YearsRuleGranted");
    private final String value;

    SeventyFiveYearsRuleStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeventyFiveYearsRuleStatus fromValue(String v) {
        for (SeventyFiveYearsRuleStatus c: SeventyFiveYearsRuleStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
