package sg.whyqokhttp;

import android.util.Log;

import sg.whyqokhttp.BuildConfig;

public class Logs {

    public static void e(String tag, String value) {
        if (BuildConfig.DEBUG)
            Log.e(tag, value);
    }

    public static void d(String tag, String value) {
        if (BuildConfig.DEBUG)
            Log.d(tag, value);
    }

    public static void i(String tag, String value) {
        if (BuildConfig.DEBUG)
            Log.d(tag, value);
    }
}
