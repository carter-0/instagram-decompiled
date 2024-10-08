package com.facebook.msys.mcs;

import X.C66595MYh;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

@Deprecated
public class Messaging {
    public static native boolean setContactSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2);

    public static native boolean setMailboxSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, String str, String str2, Integer num7);

    static {
        C66595MYh.A00();
    }
}
