package cn.mrain22.user.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (TbFollow)实体类
 *
 * @author Xiuming Lee
 * @since 2019-06-13 15:12:32
 */
@Entity
@Table(name="tb_follow")
public class Follow implements Serializable {
    private static final long serialVersionUID = -75136007415112017L;
    //用户ID
    private String userid;
    //被关注用户ID
    private String targetuser;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTargetuser() {
        return targetuser;
    }

    public void setTargetuser(String targetuser) {
        this.targetuser = targetuser;
    }

}