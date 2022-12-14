package com.lucasfarias_yanbatista.semocapp;

//import android.content.Context;
//import android.view.GestureDetector;
//import android.view.MotionEvent;
//import android.view.View;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;

// Tentativa de Uso do RecyclerView:

//public class RecyclerViewClickListener implements RecyclerView.OnItemTouchListener {
//    private OnItemClickListener mListener;
//    GestureDetector mGestureDetector;
//
//    public interface OnItemClickListener {
//        public void onItemClick(View view, int position);
//
//        public void onLongItemClick(View view, int position);
//    }
//
//    public RecyclerViewClickListener(Context context, final RecyclerView recyclerView, OnItemClickListener listener) {
//        mListener = listener;
//        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
//            @Override
//            public boolean onSingleTapUp(MotionEvent e) {
//                return true;
//            }
//
//            @Override
//            public void onLongPress(MotionEvent e) {
//                View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
//                if (child != null && mListener != null) {
//                    mListener.onLongItemClick(child, recyclerView.getChildAdapterPosition(child));
//                }
//            }
//        });
//    }
//
//    @Override
//    public boolean onInterceptTouchEvent(@NonNull RecyclerView view, @NonNull MotionEvent e) {
//        View childView = view.findChildViewUnder(e.getX(), e.getY());
//        if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
//            mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
//
//    }
//
//    @Override
//    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//    }
//}
