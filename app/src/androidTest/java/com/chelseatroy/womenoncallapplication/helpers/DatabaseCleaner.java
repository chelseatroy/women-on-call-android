package com.chelseatroy.womenoncallapplication.helpers;

import android.content.Context;
import android.net.Uri;
import android.support.test.InstrumentationRegistry;

public class DatabaseCleaner {
    public static int clean() {
        Context targetContext= InstrumentationRegistry.getTargetContext();
        return targetContext
                .getContentResolver()
                .delete(Uri.parse("hi"), null, null);
    }
}