package cn.mrain22.article.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 频道(TbChannel)实体类
 *
 * @author Xiuming Lee
 * @since 2019-06-13 15:06:57
 */
@Entity
@Table(name="tb_channel")
public class Channel implements Serializable {
    private static final long serialVersionUID = -98378552284220189L;
    //ID
    private String id;
    //频道名称
    private String name;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}