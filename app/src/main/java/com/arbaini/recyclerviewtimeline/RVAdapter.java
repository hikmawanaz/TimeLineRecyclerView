package com.arbaini.recyclerviewtimeline;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xplore on 9/21/17.
 */

public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<TransactionModel> items = new ArrayList<>();

    public RVAdapter(List<TransactionModel> items) {
        this.items = items;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case 1:
                View v1 = inflater.inflate(R.layout.item_credit, parent, false);
                viewHolder = new CreditViewHolder(v1);
                break;
            default:
                View v2 = inflater.inflate(R.layout.item_debet, parent, false);
                viewHolder = new DebetViewHolder(v2);
                break;
        }
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (holder.getItemViewType()){
            case 1:
                CreditViewHolder creditViewHolder = (CreditViewHolder) holder;
                TransactionModel creditbalances = (TransactionModel) items.get(position);
                int balance = creditbalances.getBalance();
                creditViewHolder.getBalancecredit().setText(String.valueOf(balance));
                break;
            default:
                DebetViewHolder debetViewHolder = (DebetViewHolder) holder;
                TransactionModel debetbalances = (TransactionModel) items.get(position);
                int balance2 = debetbalances.getBalance();
                debetViewHolder.getBalancedebet().setText(String.valueOf(balance2));
                break;
        }



    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getTipeView();
    }
}
