package com.facebook.msys.mdm;

import X.C66595MYh;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public class DatabaseExtensionsRegister {
    public static native void registerDatabaseExtensionsNative(SqliteHolder sqliteHolder);

    static {
        C66595MYh.A00();
    }
}
