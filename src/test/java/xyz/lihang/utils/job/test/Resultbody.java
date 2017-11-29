package xyz.lihang.utils.job.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "resultbody")
@XmlType
public class Resultbody implements Serializable {
    private List<ApiXml> item;

    public List<ApiXml> getList() {
        return item;
    }

    public void setList(List<ApiXml> item) {
        this.item = item;
    }
}
