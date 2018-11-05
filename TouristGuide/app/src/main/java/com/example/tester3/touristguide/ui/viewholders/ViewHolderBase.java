package com.example.tester3.touristguide.ui.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class ViewHolderBase <T> extends RecyclerView.ViewHolder {

    public ViewHolderBase(View itemView) {
        super(itemView);
    }

    public abstract void bind (T item);
}
