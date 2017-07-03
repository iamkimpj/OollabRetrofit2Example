package com.oollab.www.oollabretrofit2example.Http;


import com.oollab.www.oollabretrofit2example.Http.Schema.TestSchema;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by iamkimpj on 2017-07-03.
 */

public interface API {
    @GET("/api/test/path")
    Call<TestSchema> connTest();
}
