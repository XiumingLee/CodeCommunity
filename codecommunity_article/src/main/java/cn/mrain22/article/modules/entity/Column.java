package cn.mrain22.article.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * 专栏(TbColumn)实体类
 *
 * @author Xiuming Lee
 * @since 2019-06-13 15:07:07
 */
@Entity
@Table(name="tb_column")
public class Column implements Serializable {
    private static final long serialVersionUID = 328296034382998094L;
    //ID
    private String id;
    //专栏名称
    private String name;
    //专栏简介
    private String summary;
    //用户ID
    private String userid;
    //申请日期
    private Date createtime;
    //审核日期
    private Date checktime;
    //状态
    private String state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}