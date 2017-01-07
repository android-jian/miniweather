package com.miniweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2017/1/7.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
