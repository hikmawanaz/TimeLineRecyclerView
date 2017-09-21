package com.arbaini.recyclerviewtimeline;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by xplore on 9/21/17.
 */

public class DebetViewHolder extends RecyclerView.ViewHolder {

    private TextView balancedebet;

    public DebetViewHolder(View itemView) {
        super(itemView);

        balancedebet = itemView.findViewById(R.id.tv_debet_balance);
    }

    public TextView getBalancedebet() {
        return balancedebet;
    }

    public void setBalancedebet(TextView balancedebet) {
        this.balancedebet = balancedebet;
    }
}
