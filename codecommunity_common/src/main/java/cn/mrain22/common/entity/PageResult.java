package cn.mrain22.common.entity;

import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/15 18:23
 * @Version 1.0
 * @Describe: 用于返回分页结果
 */
public class PageResult<T> {
    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
