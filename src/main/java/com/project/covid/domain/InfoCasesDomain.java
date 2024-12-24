package com.project.covid.domain;

public class InfoCasesDomain {

    private long total;
    private long news;


    public InfoCasesDomain() {
    }

    public InfoCasesDomain(long total, long news) {
        this.total = total;
        this.news = news;
    }


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getNews() {
        return news;
    }

    public void setNews(long news) {
        this.news = news;
    }
}
