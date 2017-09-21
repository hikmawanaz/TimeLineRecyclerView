package com.arbaini.recyclerviewtimeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView RVContainer;

     RVAdapter adapter;
    public ArrayList<TransactionModel> listContentArr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RVContainer = (RecyclerView) findViewById(R.id.rv_adapter);

        RVContainer.setLayoutManager(new LinearLayoutManager(this));

populateRecyclerViewValues();

        adapter = new RVAdapter(listContentArr);




        RVContainer.setAdapter(adapter);


    }


    private void populateRecyclerViewValues() {

        for(int iter=1;iter<=20;iter++) {


            if((iter%2) == 0)
            {
                TransactionModel model = new TransactionModel(iter,1);
                listContentArr.add(model);


            }else{

                TransactionModel model2 = new TransactionModel(iter,2);
                listContentArr.add(model2);

            }

        }

    }

}
