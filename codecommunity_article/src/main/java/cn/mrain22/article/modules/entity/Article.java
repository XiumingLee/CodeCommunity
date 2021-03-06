package cn.mrain22.article.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * 文章(TbArticle)实体类
 *
 * @author Xiuming Lee
 * @since 2019-06-13 15:03:06
 */
@Entity
@Table(name="tb_article")
public class Article implements Serializable {
    private static final long serialVersionUID = -20506585763243250L;
    //ID
    private String id;
    //专栏ID
    private String columnid;
    //用户ID
    private String userid;
    //标题
    private String title;
    //文章正文
    private String content;
    //文章封面
    private String image;
    //发表日期
    private Date createtime;
    //修改日期
    private Date updatetime;
    //是否公开
    private String publiced;
    //是否置顶
    private String top;
    //浏览量
    private Integer visits;
    //点赞数
    private Integer thumbup;
    //评论数
    private Integer comment;
    //审核状态
    private String state;
    //所属频道
    private String channelid;
    //URL
    private String url;
    //类型
    private String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColumnid() {
        return columnid;
    }

    public void setColumnid(String columnid) {
        this.columnid = columnid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getPublic() {
        return publiced;
    }

    public void setPublic(String publiced) {
        this.publiced = publiced;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    public Integer getThumbup() {
        return thumbup;
    }

    public void setThumbup(Integer thumbup) {
        this.thumbup = thumbup;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}