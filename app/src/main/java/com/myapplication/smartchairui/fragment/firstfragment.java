package com.myapplication.smartchairui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.myapplication.smartchairui.BookAdapter;
import com.myapplication.smartchairui.R;
import com.myapplication.smartchairui.model.books;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samruddhi on 3/2/19.
 */

public class firstfragment extends Fragment {

    List<books> booksList = new ArrayList<>();
    RecyclerView recyclerView;
    BookAdapter bookAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.first,null);
        recyclerView = layout.findViewById(R.id.recycler_view);
        bookAdapter = new BookAdapter(booksList);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new BookAdapter(booksList));
        preparedata();

        return layout;


    }
    public void preparedata(){

        books books = new books("b1","2001","http://i.imgur.com/DvpvklR.png");
        booksList.add(books);
        books = new books("b2","2002","http://i.imgur.com/DvpvklR.png");
        booksList.add(books);
        books = new books("b3","2003","http://i.imgur.com/DvpvklR.png");
        booksList.add(books);
        books = new books("b4","2004","http://i.imgur.com/DvpvklR.png");
        booksList.add(books);
        books = new books("b1","2001","http://i.imgur.com/DvpvklR.png");
        booksList.add(books);
        books = new books("b1","2001","http://i.imgur.com/DvpvklR.png");
        booksList.add(books);

     bookAdapter.notifyDataSetChanged();
    }
}
