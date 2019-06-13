package cn.mrain22.qa.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (TbPl)实体类
 *
 * @author Xiuming Lee
 * @since 2019-06-13 13:57:21
 */
@Entity
@Table(name="tb_pl")
public class Pl implements Serializable {
    private static final long serialVersionUID = -38663599233754503L;
    //问题ID
    private String problemid;
    //标签ID
    private String labelid;


    public String getProblemid() {
        return problemid;
    }

    public void setProblemid(String problemid) {
        this.problemid = problemid;
    }

    public String getLabelid() {
        return labelid;
    }

    public void setLabelid(String labelid) {
        this.labelid = labelid;
    }

}