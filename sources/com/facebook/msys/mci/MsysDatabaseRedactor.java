package com.facebook.msys.mci;

import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public interface MsysDatabaseRedactor {

    public interface ProgressCallback {
    }

    int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str);

    int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str, ProgressCallback progressCallback);
}
