package ew.demo.common;


import java.util.Map;

/**
 * BootStrap Table查询条件
 */
public class QueryParam {
    private  int  offset;
    private  int  limit;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}