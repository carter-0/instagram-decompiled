package com.facebook.msys.mci;

import X.AnonymousClass669;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;

public class Database {
    public NativeHolder mNativeHolder;
    public volatile DatabaseConnection mReadWriteConnection;

    public class OpenCallback {
        public void onConfig(SqliteHolder sqliteHolder, int i, DatabaseConnectionSettings databaseConnectionSettings) {
        }

        public void onOpen(boolean z, Throwable th) {
            if (th != null) {
                throw new RuntimeException(th);
            }
        }

        public boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
            onConfig(sqliteHolder, i, databaseConnectionSettings);
            return true;
        }
    }

    public interface SchemaDeployer {
        int upgrade(SqliteHolder sqliteHolder);
    }

    public interface VirtualTableModuleRegistrator {
        int register(SqliteHolder sqliteHolder);
    }

    public class InitializedCallback {
        public void onInit(SqliteHolder sqliteHolder) {
        }
    }

    static {
        AnonymousClass669.A00();
    }

    public Database(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
