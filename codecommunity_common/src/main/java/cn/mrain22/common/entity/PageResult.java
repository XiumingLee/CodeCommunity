package cn.mrain22.common.entity;

import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/15 18:23
 * @Version 1.0
 * @Describe: 用于返回分页结果
 */
public class PageResult<T> {
    /** 总共的多少条数据*/
    private Long total;
    /** 总共多少页*/
    private int pages;
    /** 数据列表*/
    private List<T> rows;

    private PageResult(Long total,int pages, List<T> rows) {
        this.total = total;
        this.pages = pages;
        this.rows = rows;
    }

    public static <T> PageResult<T> of(Long total,int pages, List<T> rows){
        return new PageResult(total,pages,rows);
    }
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
