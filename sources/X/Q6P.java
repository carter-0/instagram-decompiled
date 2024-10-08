package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.catalyst.modules.storage.AsyncStorageModule;

public final class Q6P extends SQLiteOpenHelper {
    public static Q6P A02;
    public Context A00;
    public SQLiteDatabase A01;

    public static synchronized void A01(Q6P q6p) {
        synchronized (q6p) {
            SQLiteDatabase sQLiteDatabase = q6p.A01;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                q6p.A01.close();
                q6p.A01 = null;
            }
        }
    }

    public static synchronized boolean A02(Q6P q6p) {
        boolean deleteDatabase;
        synchronized (q6p) {
            A01(q6p);
            deleteDatabase = q6p.A00.deleteDatabase("RKStorage");
        }
        return deleteDatabase;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockFinish
        jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:8:0x000f
        	at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75)
        	at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108)
        	at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472)
        	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27)
        */
    public final synchronized void A03() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.A01     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0035
        L_0x000c:
            r3 = 0
            r2 = 0
            goto L_0x0012
        L_0x000f:
            A02(r4)     // Catch:{ SQLiteException -> 0x0019 }
        L_0x0012:
            android.database.sqlite.SQLiteDatabase r0 = r4.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0019 }
            r4.A01 = r0     // Catch:{ SQLiteException -> 0x0019 }
            goto L_0x002b
        L_0x0019:
            r3 = move-exception
            r0 = 30
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            X.Pxe.A1F()     // Catch:{ all -> 0x0038 }
        L_0x0023:
            int r2 = r2 + 1
            r0 = 2
            if (r2 >= r0) goto L_0x002b
            if (r2 <= 0) goto L_0x0012
            goto L_0x000f
        L_0x002b:
            android.database.sqlite.SQLiteDatabase r2 = r4.A01     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0037
            r0 = 6291456(0x600000, double:3.1083923E-317)
            r2.setMaximumSize(r0)     // Catch:{ all -> 0x0038 }
        L_0x0035:
            monitor-exit(r4)
            return
        L_0x0037:
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6P.A03():void");
    }

    public static SQLiteDatabase A00(AsyncStorageModule asyncStorageModule) {
        SQLiteDatabase sQLiteDatabase;
        Q6P q6p = asyncStorageModule.mReactDatabaseSupplier;
        synchronized (q6p) {
            q6p.A03();
            sQLiteDatabase = q6p.A01;
        }
        return sQLiteDatabase;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            A02(this);
            onCreate(sQLiteDatabase);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0fa.A00(-1817878435);
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
        AnonymousClass0fa.A00(1097570610);
    }
}
