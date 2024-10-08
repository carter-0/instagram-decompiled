package com.facebook.instagram.msys;

import X.0dV;
import com.facebook.msys.mci.MsysDatabaseRedactor;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public class InstagramDatabaseRedactor implements MsysDatabaseRedactor {
    public static native int copyAndRedactDatabaseNative(SqliteHolder sqliteHolder, String str, MsysDatabaseRedactor.ProgressCallback progressCallback);

    public int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str) {
        return copyAndRedactDatabaseNative(sqliteHolder, str, (MsysDatabaseRedactor.ProgressCallback) null);
    }

    static {
        0dV.A0C("instagramDatabaseRedactor-jni");
    }

    public int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str, MsysDatabaseRedactor.ProgressCallback progressCallback) {
        return copyAndRedactDatabaseNative(sqliteHolder, str, progressCallback);
    }
}
