package xlh.mall.project4.util;

import java.util.ArrayList;
import java.util.List;
//分页对象：是对前台展示数据的封装
public class PageList<T> {
    //总数据条数
    private long total;
    //当前页数据
    private List<T> rows = new ArrayList<>();

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageList{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    //提供有参构造方法，方便测试
    public PageList(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
    //除了有参构造方法，还需要提供一个无参构造方法
    public PageList() {
    }
}
