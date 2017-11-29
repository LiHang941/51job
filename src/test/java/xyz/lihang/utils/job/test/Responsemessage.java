package xyz.lihang.utils.job.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "responsemessage")
@XmlType
public  class Responsemessage implements Serializable {
    private Resultbody resultbody;

    public Resultbody getResultbody() {
        return resultbody;
    }

    public void setResultbody(Resultbody resultbody) {
        this.resultbody = resultbody;
    }
}