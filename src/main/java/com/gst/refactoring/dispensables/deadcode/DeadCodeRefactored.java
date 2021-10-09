package com.gst.refactoring.dispensables.deadcode;

import java.util.ArrayList;
import java.util.List;

public class DeadCodeRefactored {
    private List<NewsEntity> listNews = new ArrayList<>();

    private void addNews(NewsEntity newsEntity) {
        listNews.add(newsEntity);
    }

    public NewsEntity getNews(String title) {
        for (NewsEntity news : listNews) {
            if (news.getTitle().equals(title)) {
                return news;
            }
        }
        return new NewsEntity();
    }

    public static void main(String[] args) {
        DeadCodeRefactored deadCode = new DeadCodeRefactored();
        NewsEntity newsEntity = getNewsEntity();
        deadCode.addNews(newsEntity);
        NewsEntity news = deadCode.getNews("Chào ngày mới");
        System.out.println(news);
    }

    private static NewsEntity getNewsEntity() {
        NewsEntity newsEntity = new NewsEntity();
        newsEntity.setTitle("Chào ngày mới");
        newsEntity.setDescription("không có gì");
        return newsEntity;
    }

    public static class NewsEntity {
        private String title;
        private String description;
        private String source;
        private String country;

        public NewsEntity() {
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        public String getCateName() {
            return "tin mới";
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
