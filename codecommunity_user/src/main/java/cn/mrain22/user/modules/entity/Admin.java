package cn.mrain22.user.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 管理员(TbAdmin)实体类
 *
 * @author Xiuming Lee
 * @since 2019-06-13 15:12:32
 */
@Entity
@Table(name="tb_admin")
public class Admin implements Serializable {
    private static final long serialVersionUID = -47252359429995549L;
    //ID
    private String id;
    //登陆名称
    private String loginname;
    //密码
    private String password;
    //状态
    private String state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}