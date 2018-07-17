package com.example.android.newsapp;

/**
 * Created by fiona on 15/07/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    public ArticleAdapter(Context context, ArrayList<Article> pArticles) {
        //we call the super class (ArrayAdaptor's) constructor
        super(context, 0, pArticles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        Article currentArticle = getItem(position);

        /**
         * Code for formatting article date
         */

        // get date for current article
        String apiDate = currentArticle.getArticleDate();

        // convert raw date into a Date Object
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss'Z'");
        Date dateObject = null;
        try {
            dateObject = simpleDateFormat.parse(apiDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        // Format the date string
        String formattedDate = formatDate(dateObject);

        // Display the date of the current article in that TextView
        dateView.setText(formattedDate);

        /**
         * Code for current title
         */
        // get TITLE for current article
        String title = currentArticle.getArticleTitle();

        // Find the TextView with view ID TITLE
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.article_title);

        // Display the TITLE of the current article in that TextView
        titleTextView.setText(title);

        /**
         * Code for current section name
         */

        // get SECTION for current article
        String section = currentArticle.getArticleSection();

        // Find the TextView with view ID SECTION
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_name);

        // Display the SECTION of the current article in that TextView
        sectionTextView.setText(section);

        /**
         * Code for current article's author
         */
        // get AUTHOR for current article
        String author = currentArticle.getArticleAuthor();

        // Find the TextView with view ID AUTHOR
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_name);

        // Display the AUTHOR of the current article in that TextView
        authorTextView.setText(author);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}