package com.facebook.msys.mci;

import X.AnonymousClass669;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public class DatabaseUtils {
    public static native int restoreFromExistingDatabase(SqliteHolder sqliteHolder, String str);

    static {
        AnonymousClass669.A00();
    }
}
