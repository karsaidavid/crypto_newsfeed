package com.example.karsa.crypto_newsfeed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Article> articleList = new ArrayList<>();
    private RecyclerView recyclerView;


    public FeedActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ArticleAdapter mAdapter;


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new ArticleAdapter(articleList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareDataforTest();



    }


    private void prepareDataforTest() {
        Article article = new Article("Study: Pump and Dump Schemes Account for $7 Million of Monthly Trade Volume", "A recent study by Imperial College London analysts claims that crypto pump and dump scams account for $7 million in trade volume each month.", "2015","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);

        article = new Article("Report: Number of Routers Affected by Crypto Malware Doubled Since August, Reaching 415K", "A security researcher claims that the number of MikroTik routers affected by cryptojacking malware has doubled since August 2018.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);
        article = new Article("US Crypto Exchange Coinbase Adds Support for Zcash on Retail Platform and Mobile Apps", "U.S. crypto exchange Coinbase has extended support for Zcash to Coinbase.com and its Android and iOS apps.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);
        article = new Article("Report: Number of Routers Affected by Crypto Malware Doubled Since August, Reaching 415K", "A security researcher claims that the number of MikroTik routers affected by cryptojacking malware has doubled since August 2018.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);
        article = new Article("US Crypto Exchange Coinbase Adds Support for Zcash on Retail Platform and Mobile Apps", "U.S. crypto exchange Coinbase has extended support for Zcash to Coinbase.com and its Android and iOS apps.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);
        article = new Article("Report: Number of Routers Affected by Crypto Malware Doubled Since August, Reaching 415K", "A security researcher claims that the number of MikroTik routers affected by cryptojacking malware has doubled since August 2018.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);
        article = new Article("US Crypto Exchange Coinbase Adds Support for Zcash on Retail Platform and Mobile Apps", "U.S. crypto exchange Coinbase has extended support for Zcash to Coinbase.com and its Android and iOS apps.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);
        article = new Article("Report: Number of Routers Affected by Crypto Malware Doubled Since August, Reaching 415K", "A security researcher claims that the number of MikroTik routers affected by cryptojacking malware has doubled since August 2018.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);
        article = new Article("US Crypto Exchange Coinbase Adds Support for Zcash on Retail Platform and Mobile Apps", "U.S. crypto exchange Coinbase has extended support for Zcash to Coinbase.com and its Android and iOS apps.", "32132","https://images.theconversation.com/files/38926/original/5cwx89t4-1389586191.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip");
        articleList.add(article);


        //mAdapter.notifyDataSetChanged();
    }
}

