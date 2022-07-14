package com.ll;

import java.util.Map;

public class WiseSaying {
    int id;
    String maxim;
    String author;

    public WiseSaying(int id, String maxim, String author) {
        this.id = id;
        this.maxim = maxim;
        this.author = author;
    }
    public WiseSaying(Map<String, Object> map) {
        this.id = (int) map.get("id");
        this.maxim = (String) map.get("content");
        this.author = (String) map.get("author");
    }


    @Override
    public String toString() {
        return "WiseSaying{" +
                "id=" + id +
                ", maxim='" + maxim + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String toJson() {
        return """
                 {
                     "id": %d,
                     "content": "%s",
                     "author": "%s"
                 }
                 """
                .stripIndent()
                .formatted(id, maxim, author)
                .trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof WiseSaying == false) return false;

        WiseSaying other = (WiseSaying) o;

        if (this.id != other.id) return false;
        if (this.maxim.equals(other.maxim) == false) return false;
        if (this.author.equals(other.author) == false) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (maxim != null ? maxim.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
