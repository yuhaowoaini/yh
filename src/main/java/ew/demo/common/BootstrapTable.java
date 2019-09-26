package ew.demo.common;

import java.util.List;

public class BootstrapTable {
    private long total;
    private List<?> rows;

    public BootstrapTable(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "BootstrapTable{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
