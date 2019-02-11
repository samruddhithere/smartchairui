package com.myapplication.smartchairui;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapplication.smartchairui.model.books;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by samruddhi on 4/2/19.
 */
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    private List<books> booksList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

            public TextView title, year;

            public ImageView image;

            public MyViewHolder(View view) {

                super(view);
                title = (TextView) view.findViewById(R.id.text1);
                year = (TextView) view.findViewById(R.id.text2);
                image = (ImageView)view.findViewById(R.id.image);
            }
        }


        public BookAdapter(List<books> booksList) {
            this.booksList = booksList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.book_list_row, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            books books = booksList.get(position);
            holder.title.setText(books.getName());
            holder.year.setText(books.getYear());
            Picasso.get().load(R.drawable.index).into(holder.image);
        }

        @Override
        public int getItemCount() {
            return booksList.size();
        }
    }
