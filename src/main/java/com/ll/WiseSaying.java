package com.ll;

public class WiseSaying {
    int id;
    String maxim;
    String author;

    public WiseSaying(int id, String maxim, String author) {
        this.id = id;
        this.maxim = maxim;
        this.author = author;
    }

    @Override
    public String toString() {
        return "WiseSaying{" +
                "id=" + id +
                ", maxim='" + maxim + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
