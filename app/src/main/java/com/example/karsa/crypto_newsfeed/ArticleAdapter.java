package com.example.karsa.crypto_newsfeed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.MyViewHolder> {

    private List<Article> articleList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, text, date;
        public ImageView imageurl;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.article_title);
            text = (TextView) view.findViewById(R.id.article_text);
            date = (TextView) view.findViewById(R.id.article_date);
            //imageurl = (ImageView) view.findViewById(R.id.article_image);
        }
    }


    public ArticleAdapter(List<Article> articleList) {
        this.articleList = articleList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_viz, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Article article = articleList.get(position);
        holder.title.setText(article.getTitle());
        holder.text.setText(article.getText());
        holder.date.setText(article.getText());
        //holder.imageurl.se(article.getImageurl());

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }
}