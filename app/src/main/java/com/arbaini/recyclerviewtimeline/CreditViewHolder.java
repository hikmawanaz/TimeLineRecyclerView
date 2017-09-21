package com.arbaini.recyclerviewtimeline;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by xplore on 9/21/17.
 */

public class CreditViewHolder extends RecyclerView.ViewHolder {

    private TextView balancecredit;

    public CreditViewHolder(View itemView) {
        super(itemView);

        balancecredit = itemView.findViewById(R.id.tv_credit_balance);

    }

    public TextView getBalancecredit() {
        return balancecredit;
    }

    public void setBalancecredit(TextView balancecredit) {
        this.balancecredit = balancecredit;
    }
}
