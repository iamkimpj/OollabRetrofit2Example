package com.oollab.www.oollabretrofit2example.Http;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by iamkimpj on 2017-07-03.
 */

public class Conn {
    private static final String host = "https://jumoim-171709.appspot.com";

    private Conn() {}

    private static class Singleton {
        private static final Conn instance = new Conn();
    }

    public static Conn ready() {

        return Singleton.instance;
    }

    public API api( )
    {
        String host = this.host;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(host)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(API.class);
    }
}
