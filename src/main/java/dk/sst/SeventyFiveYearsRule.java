
package dk.sst;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeventyFiveYearsRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeventyFiveYearsRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DoesNotApply"/>
 *     &lt;enumeration value="Applies"/>
 *     &lt;enumeration value="NotSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeventyFiveYearsRule")
@XmlEnum
public enum SeventyFiveYearsRule {

    @XmlEnumValue("DoesNotApply")
    DOES_NOT_APPLY("DoesNotApply"),
    @XmlEnumValue("Applies")
    APPLIES("Applies"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified");
    private final String value;

    SeventyFiveYearsRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeventyFiveYearsRule fromValue(String v) {
        for (SeventyFiveYearsRule c: SeventyFiveYearsRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
