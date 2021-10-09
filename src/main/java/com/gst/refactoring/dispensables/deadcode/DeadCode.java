package com.gst.refactoring.dispensables.deadcode;

import java.util.ArrayList;
import java.util.List;

public class DeadCode {
    //field
    private String title;
    private String description;
    private String category;
    private List<NewsEntity> listNews = new ArrayList<>();


    private void addNews(NewsEntity newsEntity) {
        listNews.add(newsEntity);
    }

    public NewsEntity getNews(String title) {
        //variable
        String name = "Nguyễn Văn A";
        for (NewsEntity news : listNews) {
            if (news.getTitle().equals(title)) {
                return news;
            }
        }
        return new NewsEntity();
    }

    //    parameter
    public NewsEntity getNewsByCategory(String title, String category) {
        for (NewsEntity news : listNews) {
            if (news.getCategory().equals(category)) {
                return news;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DeadCode deadCode = new DeadCode();
        NewsEntity newsEntity = getNewsEntity();
        deadCode.addNews(newsEntity);
        NewsEntity news = deadCode.getNews("Chào ngày mới");
        System.out.println(news);
    }

    private String getCateName() {
        return "Tin mới";
    }

    private static NewsEntity getNewsEntity() {
        NewsEntity newsEntity = new NewsEntity();
        newsEntity.setTitle("Chào ngày mới");
        newsEntity.setCategory("tin tức");
        newsEntity.setDescription("không có gì");
        return newsEntity;
    }

    public class StringUtil {

        public String rename(String name) {
            return name.replace(" ", "");
        }
    }

    public class Category {

        public String getCateName() {
            return "tin mới";
        }
    }

    public class DeadCodeCollapse extends DeadCode {
        
    }
    public static class NewsEntity {
        private String title;
        private String description;
        private String category;

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

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }
}
