package com.oollab.www.oollabretrofit2example.Http.Schema;

/**
 * Created by iamkimpj on 2017-07-03.
 */

public class _SchemaBase {
    protected _Head head;

    class _Head {
        protected String encodeType;
        protected String status;
        protected String errorMessage;
    }

    public boolean isSuccess() {
        return this.head.status.equals( "200" );
    }

    public String errorMessage() {
        return this.head.errorMessage;
    }
}
