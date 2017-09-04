package com.example.admin.databindingapplication.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentRecyclerAdapter<D> extends RecyclerView.Adapter<CommentRecyclerAdapter.ViewHolder>{
    private Context context;
    private List<D> list;
    private Map<Class<?>, Pair<Integer, Integer>> map;

    public CommentRecyclerAdapter(Context context, List<D> list, int layoutId, int variableId) {
        this.context = context;
        this.list = list;
        map = new HashMap<>();
        map.put(null, Pair.create(layoutId, variableId));
    }

    public CommentRecyclerAdapter(Context context, List<D> list, Map<Class<?>, Pair<Integer, Integer>> map) {
        this.context = context;
        this.list = list;
        this.map = map;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(context), viewType, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        D d = list.get(position);
        Pair<Integer, Integer> pair;
        if (map.size() == 1) {
            pair = map.get(null);
        } else {
            pair = map.get(d.getClass());
        }
        holder.binding.setVariable(pair.second, d);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (map.size() == 1) {
            return map.get(null).first;
        } else {
            return map.get(list.get(position).getClass()).first;
        }
    }

    public void add(D d) {
        add(list.size(), d);
    }

    public void  add(int position, D d) {
        if (d == null) {
            return;
        }
        list.add(position, d);
        notifyItemInserted(position);
    }

    public void remove(D d) {
        int index = list.indexOf(d);
        remove(index);
    }

    public void remove(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }

    public void addAll(Collection<? extends D> collection) {
        addAll(list.size(), collection);
    }

    public void addAll(int position, Collection<? extends D> collection) {
        if (collection == null) {
            return;
        }
        list.addAll(position, collection);
        notifyItemRangeInserted(position, collection.size());
    }

    public void clear() {
        int size = list.size();
        list.clear();
        notifyItemRangeRemoved(0, size);
    }

    public D getItem(int position) {
        return list.get(position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;

        public ViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
//            if (binding instanceof HeaderItemBinding) {
//                ((HeaderItemBinding) binding).pager.setOnTouchListener(new View.OnTouchListener() {
//                    @Override
//                    public boolean onTouch(View v, MotionEvent event) {
//                        ((ViewGroup) v).requestDisallowInterceptTouchEvent(true);
//                        return false;
//                    }
//                });
//            }
        }
    }
}
