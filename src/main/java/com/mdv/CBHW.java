package com.mdv;


import com.coinbase.api.*;
import com.coinbase.api.exception.*;
import com.coinbase.api.entity.*;

import java.io.IOException;
import java.util.List;

public class CBHW {

    public static void main(String[] args){

        Coinbase cb = new CoinbaseBuilder()
                .withApiKey(Configuration.getInstance().getAPIkey(), Configuration.getInstance().getAPISecret())
                .build();


        try {
            TransactionsResponse r = cb.getTransactions();

            r.getTotalCount(); // 45
            r.getCurrentPage(); // 1
            r.getNumPages(); // 2
            //assert r.getNumPages() == 2;

            List<Transaction> txs = r.getTransactions();

            txs.get(0).getId();

            TransactionsResponse page_2 = cb.getTransactions(1);

            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CoinbaseException e) {
            e.printStackTrace();
        }



    }
}
