package com.oollab.www.oollabretrofit2example.Http.Schema;

import android.util.Log;

/**
 * Created by iamkimpj on 2017-07-03.
 */

public class TestSchema extends _SchemaBase {
    private _Body body;

    private class _Body {
        public String key;
        public String value;
    }



    public TestSchema () {
        Log.d("test","Test Schema start!");

    }

    public void test() {

        Log.d("test", this.body.value );
        Log.d("test", this.head.status );



    }
}
