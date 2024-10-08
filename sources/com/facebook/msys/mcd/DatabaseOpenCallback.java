package com.facebook.msys.mcd;

import X.AnonymousClass7TF;
import X.C66595MYh;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public class DatabaseOpenCallback extends Database.OpenCallback {
    private native boolean onConfigNative(SqliteHolder sqliteHolder, int i, boolean z, long j);

    static {
        C66595MYh.A00();
    }

    public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
        onConfig(sqliteHolder, i, databaseConnectionSettings);
        return AnonymousClass7TF.A1P(onConfigNative(sqliteHolder, i, z, j) ? 1 : 0);
    }
}
