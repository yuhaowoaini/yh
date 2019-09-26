package ew.demo.model;

public class BaseModelExample {
    private int rowIndex;
    private int Pagesize;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getPagesize() {
        return Pagesize;
    }

    public void setPagesize(int pagesize) {
        Pagesize = pagesize;
    }

    @Override
    public String toString() {
        return "BaseModelExample{" +
                "rowIndex=" + rowIndex +
                ", Pagesize=" + Pagesize +
                '}';
    }
}
