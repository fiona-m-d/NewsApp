package com.example.android.newsapp;

/**
 * Created by fiona on 15/07/2018.
 */

public class Article {

    /**
     * Title string
     */
    private String mArticleTitle;

    /**
     * Section string
     */
    private String mArticleSection;

    /**
     * Author string
     */
    private String mArticleAuthor;

    /**
     * Article date
     */
    private String mArticleDate;

    /**
     * Url link
     */
    private String mArticleUrl;

    /**
     * Create a new Article object.
     */
    public Article(String articleTitle, String articleSection, String articleAuthor, String articleDate, String articleUrl) {
        mArticleTitle = articleTitle;
        mArticleSection = articleSection;
        mArticleAuthor = articleAuthor;
        mArticleDate = articleDate;
        mArticleUrl = articleUrl;
    }

    /**
     * Get the title
     */
    public String getArticleTitle() {

        return mArticleTitle;
    }

    /**
     * Get the section
     */
    public String getArticleSection() {

        return mArticleSection;
    }

    /**
     * Get the author
     */
    public String getArticleAuthor() {

        return mArticleAuthor;
    }

    /**
     * Get the date
     */
    public String getArticleDate() {

        return mArticleDate;
    }

    /**
     * Get the url
     */
    public String getArticleUrl() {

        return mArticleUrl;
    }
}

