package cn.mrain22.friend.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (TbFriend)实体类
 *
 * @author Xiuming Lee
 * @since 2019-06-13 15:09:27
 */
@Entity
@Table(name="tb_friend")
public class Friend implements Serializable {
    private static final long serialVersionUID = -13873092101970276L;
    //用户ID
    private String userid;
    //好友ID
    private String friendid;
    //是否互相喜欢
    private String like;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFriendid() {
        return friendid;
    }

    public void setFriendid(String friendid) {
        this.friendid = friendid;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

}