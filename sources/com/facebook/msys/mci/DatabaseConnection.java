package com.facebook.msys.mci;

import X.AnonymousClass669;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;

public class DatabaseConnection {
    public final NativeHolder mNativeHolder;

    public interface DatabaseRunnable {
        void run(SqliteHolder sqliteHolder);
    }

    public native void execute(DatabaseRunnable databaseRunnable);

    public native int getMode();

    static {
        AnonymousClass669.A00();
    }

    public DatabaseConnection(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
