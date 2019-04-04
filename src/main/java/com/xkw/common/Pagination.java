package com.xkw.common;

import java.util.List;

public class Pagination<T> {

    private int currentPage = 1;

    private int totalPage;

    private int pageSize = 10;

    private int totalSize;

    private int start = 0;

    private List<T> items;

    public Pagination(int currentPage, int pageSize, int totalSize, List<T> items) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalSize = totalSize;
        this.items = items;
    }

    public Pagination() {

    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        this.setStart((currentPage - 1) * pageSize);
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }
}
