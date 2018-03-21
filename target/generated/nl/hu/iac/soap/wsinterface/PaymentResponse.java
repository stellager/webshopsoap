
package nl.hu.iac.soap.wsinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="succes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "succes"
})
@XmlRootElement(name = "paymentResponse")
public class PaymentResponse {

    @XmlElement(required = true)
    protected String succes;

    /**
     * Gets the value of the succes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucces() {
        return succes;
    }

    /**
     * Sets the value of the succes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucces(String value) {
        this.succes = value;
    }

}
