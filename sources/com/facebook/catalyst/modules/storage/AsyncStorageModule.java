package com.facebook.catalyst.modules.storage;

import X.002;
import X.0I1;
import X.AnonymousClass0fa;
import X.AnonymousClass7TE;
import X.C12214SpE;
import X.C12947TFg;
import X.C12948TFh;
import X.C13167TNz;
import X.C13567Tcn;
import X.Pxh;
import X.Q6P;
import X.QZK;
import X.S8O;
import X.TIU;
import X.TIV;
import X.TIW;
import X.TIX;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.intent.IntentModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

@ReactModule(name = "AsyncSQLiteDBStorage")
public class AsyncStorageModule extends NativeAsyncSQLiteDBStorageSpec {
    public static final int MAX_SQL_KEYS = 999;
    public final C13167TNz mExecutor;
    public Q6P mReactDatabaseSupplier;
    public boolean mShuttingDown;

    public void initialize() {
        this.mShuttingDown = false;
    }

    public void invalidate() {
        this.mShuttingDown = true;
    }

    private boolean ensureDatabase() {
        if (this.mShuttingDown) {
            return false;
        }
        this.mReactDatabaseSupplier.A03();
        return true;
    }

    public void clear(Callback callback) {
        this.mExecutor.execute(new C12947TFg(this, callback));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clearSensitiveData() {
        /*
            r4 = this;
            X.Q6P r3 = r4.mReactDatabaseSupplier
            monitor-enter(r3)
            r3.A03()     // Catch:{ all -> 0x0012 }
            android.database.sqlite.SQLiteDatabase r2 = r3.A01     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = "catalystLocalStorage"
            r0 = 0
            r2.delete(r1, r0, r0)     // Catch:{ all -> 0x0014 }
            X.Q6P.A01(r3)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0023
        L_0x0012:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            throw r0     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            boolean r0 = X.Q6P.A02(r3)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "Clearing and deleting database RKStorage failed"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x0025 }
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r3)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.modules.storage.AsyncStorageModule.clearSensitiveData():void");
    }

    public void getAllKeys(Callback callback) {
        this.mExecutor.execute(new C12948TFh(this, callback));
    }

    /* renamed from: lambda$clear$4$com-facebook-catalyst-modules-storage-AsyncStorageModule  reason: not valid java name */
    public /* synthetic */ void m15lambda$clear$4$comfacebookcatalystmodulesstorageAsyncStorageModule(Callback callback) {
        this.mReactDatabaseSupplier.A03();
        try {
            Q6P q6p = this.mReactDatabaseSupplier;
            synchronized (q6p) {
                q6p.A03();
                q6p.A01.delete("catalystLocalStorage", (String) null, (String[]) null);
            }
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            0I1.A06("ReactNative", e.getMessage(), e);
            Pxh.A1E(callback, S8O.A00(e.getMessage()));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        X.Q6P.A00(r18).setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.AnonymousClass0fa.A03(X.Q6P.A00(r18), -1792006843);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r1 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        r2 = X.S8O.A01(r0);
     */
    /* renamed from: lambda$multiMerge$3$com-facebook-catalyst-modules-storage-AsyncStorageModule  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m18lambda$multiMerge$3$comfacebookcatalystmodulesstorageAsyncStorageModule(com.facebook.react.bridge.Callback r19, com.facebook.react.bridge.ReadableArray r20) {
        /*
            r18 = this;
            java.lang.String r3 = "ReactNative"
            boolean r0 = r18.ensureDatabase()
            r5 = 1
            r4 = 0
            r15 = 0
            if (r0 != 0) goto L_0x001b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "Database Error"
            com.facebook.react.bridge.WritableNativeMap r2 = X.S8O.A00(r0)
        L_0x0013:
            r1[r4] = r2
        L_0x0015:
            r0 = r19
            r0.invoke(r1)
            return
        L_0x001b:
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x00fa }
            r0 = -1319712794(0xffffffffb156c7e6, float:-3.1254728E-9)
            X.AnonymousClass0fa.A01(r1, r0)     // Catch:{ Exception -> 0x00fa }
            r8 = 0
        L_0x0026:
            r2 = r20
            int r0 = r2.size()     // Catch:{ Exception -> 0x00fa }
            if (r8 >= r0) goto L_0x00df
            com.facebook.react.bridge.ReadableArray r0 = r2.getArray(r8)     // Catch:{ Exception -> 0x00fa }
            int r1 = r0.size()     // Catch:{ Exception -> 0x00fa }
            r0 = 2
            if (r1 == r0) goto L_0x0040
            java.lang.String r0 = "Invalid Value"
            X.S8O.A00(r0)     // Catch:{ Exception -> 0x00fa }
            goto L_0x012e
        L_0x0040:
            com.facebook.react.bridge.ReadableArray r0 = r2.getArray(r8)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = r0.getString(r4)     // Catch:{ Exception -> 0x00fa }
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "Invalid key"
            X.S8O.A00(r0)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0116
        L_0x0051:
            com.facebook.react.bridge.ReadableArray r0 = r2.getArray(r8)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = r0.getString(r5)     // Catch:{ Exception -> 0x00fa }
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "Invalid Value"
            X.S8O.A00(r0)     // Catch:{ Exception -> 0x00fa }
            goto L_0x011e
        L_0x0062:
            android.database.sqlite.SQLiteDatabase r10 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x00fa }
            com.facebook.react.bridge.ReadableArray r0 = r2.getArray(r8)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r6 = r0.getString(r4)     // Catch:{ Exception -> 0x00fa }
            com.facebook.react.bridge.ReadableArray r0 = r2.getArray(r8)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r7 = r0.getString(r5)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r2 = "value"
            java.lang.String[] r12 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x00fa }
            java.lang.String[] r14 = new java.lang.String[]{r6}     // Catch:{ Exception -> 0x00fa }
            java.lang.String r11 = "catalystLocalStorage"
            java.lang.String r13 = "key=?"
            r9 = 0
            r16 = r15
            r17 = r15
            android.database.Cursor r1 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00fa }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0098
            java.lang.String r9 = r1.getString(r4)     // Catch:{ all -> 0x00da }
        L_0x0098:
            r1.close()     // Catch:{ Exception -> 0x00fa }
            if (r9 == 0) goto L_0x00ac
            org.json.JSONObject r1 = X.C66580MXl.A17(r9)     // Catch:{ Exception -> 0x00fa }
            org.json.JSONObject r0 = X.C66580MXl.A17(r7)     // Catch:{ Exception -> 0x00fa }
            X.C9240RUr.A00(r1, r0)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x00fa }
        L_0x00ac:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x00fa }
            r1.<init>()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = "key"
            r1.put(r0, r6)     // Catch:{ Exception -> 0x00fa }
            r1.put(r2, r7)     // Catch:{ Exception -> 0x00fa }
            r0 = 1742503061(0x67dc7c95, float:2.0824375E24)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ Exception -> 0x00fa }
            r0 = 5
            long r6 = r10.insertWithOnConflict(r11, r15, r1, r0)     // Catch:{ Exception -> 0x00fa }
            r0 = 336032825(0x14077439, float:6.838679E-27)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ Exception -> 0x00fa }
            r1 = -1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
            int r8 = r8 + 1
            goto L_0x0026
        L_0x00d4:
            java.lang.String r0 = "Database Error"
            X.S8O.A00(r0)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0126
        L_0x00da:
            r0 = move-exception
            r1.close()     // Catch:{ Exception -> 0x00fa }
            throw r0     // Catch:{ Exception -> 0x00fa }
        L_0x00df:
            android.database.sqlite.SQLiteDatabase r0 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x00fa }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x00fa }
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x00f4 }
            r0 = -1792006843(0xffffffff95302545, float:-3.5572317E-26)
            X.AnonymousClass0fa.A03(r1, r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object[] r1 = new java.lang.Object[r4]
            goto L_0x0015
        L_0x00f4:
            r0 = move-exception
            com.facebook.react.bridge.WritableNativeMap r2 = X.S8O.A01(r0)
            goto L_0x0112
        L_0x00fa:
            r0 = move-exception
            com.facebook.react.bridge.WritableNativeMap r2 = X.S8O.A01(r0)     // Catch:{ all -> 0x0142 }
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x010a }
            r0 = 972034491(0x39f011bb, float:4.5789577E-4)
            X.AnonymousClass0fa.A03(r1, r0)     // Catch:{ Exception -> 0x010a }
            goto L_0x0112
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            X.0I1.A06(r3, r0, r1)
        L_0x0112:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            goto L_0x0013
        L_0x0116:
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x0139 }
            r0 = -1519686114(0xffffffffa56b6e1e, float:-2.042031E-16)
            goto L_0x0135
        L_0x011e:
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x0139 }
            r0 = -1918849126(0xffffffff8da0af9a, float:-9.903036E-31)
            goto L_0x0135
        L_0x0126:
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x0139 }
            r0 = 1769009068(0x6970efac, float:1.8204626E25)
            goto L_0x0135
        L_0x012e:
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x0139 }
            r0 = 344804555(0x148d4ccb, float:1.4267651E-26)
        L_0x0135:
            X.AnonymousClass0fa.A03(r1, r0)     // Catch:{ Exception -> 0x0139 }
            return
        L_0x0139:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            X.0I1.A06(r3, r0, r1)
            return
        L_0x0142:
            r2 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = X.Q6P.A00(r18)     // Catch:{ Exception -> 0x014e }
            r0 = 1535260569(0x5b823799, float:7.3305754E16)
            X.AnonymousClass0fa.A03(r1, r0)     // Catch:{ Exception -> 0x014e }
            throw r2
        L_0x014e:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            X.0I1.A06(r3, r0, r1)
            java.lang.String r0 = r1.getMessage()
            X.S8O.A00(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.modules.storage.AsyncStorageModule.m18lambda$multiMerge$3$comfacebookcatalystmodulesstorageAsyncStorageModule(com.facebook.react.bridge.Callback, com.facebook.react.bridge.ReadableArray):void");
    }

    /* renamed from: lambda$multiRemove$2$com-facebook-catalyst-modules-storage-AsyncStorageModule  reason: not valid java name */
    public /* synthetic */ void m19lambda$multiRemove$2$comfacebookcatalystmodulesstorageAsyncStorageModule(Callback callback, ReadableArray readableArray) {
        WritableNativeMap writableNativeMap;
        Object[] objArr;
        if (!ensureDatabase()) {
            objArr = new Object[1];
            writableNativeMap = S8O.A00("Database Error");
        } else {
            try {
                AnonymousClass0fa.A01(Q6P.A00(this), -1407854361);
                for (int i = 0; i < readableArray.size(); i += 999) {
                    int min = Math.min(readableArray.size() - i, 999);
                    SQLiteDatabase A00 = Q6P.A00(this);
                    String[] strArr = new String[min];
                    Arrays.fill(strArr, "?");
                    String A0g = 002.A0g("key IN (", TextUtils.join(", ", strArr), ")");
                    String[] strArr2 = new String[min];
                    for (int i2 = 0; i2 < min; i2++) {
                        strArr2[i2] = readableArray.getString(i + i2);
                    }
                    A00.delete("catalystLocalStorage", A0g, strArr2);
                }
                Q6P.A00(this).setTransactionSuccessful();
                try {
                    AnonymousClass0fa.A03(Q6P.A00(this), -972876014);
                    objArr = new Object[0];
                } catch (Exception e) {
                    writableNativeMap = S8O.A01(e);
                    objArr = new Object[1];
                    objArr[0] = writableNativeMap;
                    callback.invoke(objArr);
                }
            } catch (Exception e2) {
                writableNativeMap = S8O.A01(e2);
                try {
                    AnonymousClass0fa.A03(Q6P.A00(this), 1752303544);
                } catch (Exception e3) {
                    0I1.A06("ReactNative", e3.getMessage(), e3);
                }
            } catch (Throwable th) {
                try {
                    AnonymousClass0fa.A03(Q6P.A00(this), -1599465599);
                    throw th;
                } catch (Exception e4) {
                    0I1.A06("ReactNative", e4.getMessage(), e4);
                    S8O.A00(e4.getMessage());
                    throw th;
                }
            }
            callback.invoke(objArr);
        }
        objArr[0] = writableNativeMap;
        callback.invoke(objArr);
    }

    /* renamed from: lambda$multiSet$1$com-facebook-catalyst-modules-storage-AsyncStorageModule  reason: not valid java name */
    public /* synthetic */ void m20lambda$multiSet$1$comfacebookcatalystmodulesstorageAsyncStorageModule(Callback callback, ReadableArray readableArray) {
        WritableNativeMap writableNativeMap;
        Object[] objArr;
        SQLiteDatabase A00;
        int i;
        if (!ensureDatabase()) {
            objArr = new Object[1];
            writableNativeMap = S8O.A00("Database Error");
        } else {
            SQLiteStatement compileStatement = Q6P.A00(this).compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                AnonymousClass0fa.A01(Q6P.A00(this), -824699907);
                int i2 = 0;
                while (i2 < readableArray.size()) {
                    if (readableArray.getArray(i2).size() != 2) {
                        S8O.A00("Invalid Value");
                        A00 = Q6P.A00(this);
                        i = 1016877367;
                    } else if (readableArray.getArray(i2).getString(0) == null) {
                        S8O.A00("Invalid key");
                        try {
                            A00 = Q6P.A00(this);
                            i = 1248867808;
                        } catch (Exception e) {
                            0I1.A06("ReactNative", e.getMessage(), e);
                            return;
                        }
                    } else if (readableArray.getArray(i2).getString(1) == null) {
                        S8O.A00("Invalid Value");
                        A00 = Q6P.A00(this);
                        i = -724467645;
                    } else {
                        compileStatement.clearBindings();
                        compileStatement.bindString(1, readableArray.getArray(i2).getString(0));
                        compileStatement.bindString(2, readableArray.getArray(i2).getString(1));
                        AnonymousClass0fa.A00(-2080068103);
                        compileStatement.execute();
                        AnonymousClass0fa.A00(1103680520);
                        i2++;
                    }
                    AnonymousClass0fa.A03(A00, i);
                    return;
                }
                Q6P.A00(this).setTransactionSuccessful();
                try {
                    AnonymousClass0fa.A03(Q6P.A00(this), -793606700);
                    objArr = new Object[0];
                } catch (Exception e2) {
                    writableNativeMap = S8O.A01(e2);
                    objArr = new Object[1];
                    objArr[0] = writableNativeMap;
                    callback.invoke(objArr);
                }
            } catch (Exception e3) {
                writableNativeMap = S8O.A01(e3);
                try {
                    AnonymousClass0fa.A03(Q6P.A00(this), 965872284);
                } catch (Exception e4) {
                    0I1.A06("ReactNative", e4.getMessage(), e4);
                }
            } catch (Throwable th) {
                try {
                    AnonymousClass0fa.A03(Q6P.A00(this), -992102922);
                    throw th;
                } catch (Exception e5) {
                    0I1.A06("ReactNative", e5.getMessage(), e5);
                    S8O.A00(e5.getMessage());
                    throw th;
                }
            }
            callback.invoke(objArr);
        }
        objArr[0] = writableNativeMap;
        callback.invoke(objArr);
    }

    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(S8O.A00("Invalid key"), null);
        } else {
            this.mExecutor.execute(new TIX(this, callback, readableArray));
        }
    }

    public void multiMerge(ReadableArray readableArray, Callback callback) {
        this.mExecutor.execute(new TIV(this, callback, readableArray));
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.database.sqlite.SQLiteOpenHelper, X.Q6P] */
    public AsyncStorageModule(QZK qzk, Executor executor) {
        super(qzk);
        this.mShuttingDown = false;
        C13567Tcn tcn = qzk.A00;
        if (tcn == null) {
            tcn = new C12214SpE(qzk);
            qzk.A00 = tcn;
        }
        this.mExecutor = new C13167TNz(tcn, executor);
        Q6P q6p = Q6P.A02;
        Q6P q6p2 = q6p;
        if (q6p == null) {
            Context applicationContext = qzk.getApplicationContext();
            ? sQLiteOpenHelper = new SQLiteOpenHelper(applicationContext, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
            sQLiteOpenHelper.A00 = applicationContext;
            Q6P.A02 = sQLiteOpenHelper;
            q6p2 = sQLiteOpenHelper;
        }
        this.mReactDatabaseSupplier = q6p2;
    }

    /* renamed from: lambda$getAllKeys$5$com-facebook-catalyst-modules-storage-AsyncStorageModule  reason: not valid java name */
    public /* synthetic */ void m16lambda$getAllKeys$5$comfacebookcatalystmodulesstorageAsyncStorageModule(Callback callback) {
        Object[] objArr;
        if (!ensureDatabase()) {
            objArr = new Object[]{S8O.A00("Database Error"), null};
        } else {
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            Cursor query = Q6P.A00(this).query("catalystLocalStorage", new String[]{"key"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            try {
                if (query.moveToFirst()) {
                    do {
                        writableNativeArray.pushString(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
                objArr = new Object[]{null, writableNativeArray};
            } catch (Exception e) {
                callback.invoke(S8O.A01(e), null);
                query.close();
                return;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        callback.invoke(objArr);
    }

    /* renamed from: lambda$multiGet$0$com-facebook-catalyst-modules-storage-AsyncStorageModule  reason: not valid java name */
    public /* synthetic */ void m17lambda$multiGet$0$comfacebookcatalystmodulesstorageAsyncStorageModule(Callback callback, ReadableArray readableArray) {
        Object[] objArr;
        Callback callback2 = callback;
        if (!ensureDatabase()) {
            objArr = new Object[]{S8O.A00("Database Error"), null};
        } else {
            String[] strArr = {"key", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
            HashSet A1F = AnonymousClass7TE.A1F();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            int i = 0;
            while (true) {
                ReadableArray readableArray2 = readableArray;
                if (i >= readableArray2.size()) {
                    break;
                }
                int min = Math.min(readableArray2.size() - i, 999);
                SQLiteDatabase A00 = Q6P.A00(this);
                String[] strArr2 = new String[min];
                Arrays.fill(strArr2, "?");
                String A0g = 002.A0g("key IN (", TextUtils.join(", ", strArr2), ")");
                int i2 = i;
                String[] strArr3 = new String[min];
                for (int i3 = 0; i3 < min; i3++) {
                    strArr3[i3] = readableArray2.getString(i + i3);
                }
                Cursor query = A00.query("catalystLocalStorage", strArr, A0g, strArr3, (String) null, (String) null, (String) null);
                A1F.clear();
                try {
                    if (query.getCount() != readableArray2.size()) {
                        while (i < i2 + min) {
                            A1F.add(readableArray2.getString(i));
                            i++;
                        }
                    }
                    if (query.moveToFirst()) {
                        do {
                            WritableNativeArray writableNativeArray2 = new WritableNativeArray();
                            writableNativeArray2.pushString(query.getString(0));
                            writableNativeArray2.pushString(query.getString(1));
                            writableNativeArray.pushArray(writableNativeArray2);
                            A1F.remove(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    Iterator it = A1F.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        WritableNativeArray writableNativeArray3 = new WritableNativeArray();
                        writableNativeArray3.pushString(A18);
                        writableNativeArray3.pushNull();
                        writableNativeArray.pushArray(writableNativeArray3);
                    }
                    A1F.clear();
                    i = i2 + 999;
                } catch (Exception e) {
                    callback2.invoke(S8O.A01(e), null);
                    query.close();
                    return;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            objArr = new Object[]{null, writableNativeArray};
        }
        callback2.invoke(objArr);
    }

    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            Pxh.A1E(callback, S8O.A00("Invalid key"));
        } else {
            this.mExecutor.execute(new TIW(this, callback, readableArray));
        }
    }

    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            Pxh.A1E(callback, S8O.A00("Invalid key"));
        } else {
            this.mExecutor.execute(new TIU(this, callback, readableArray));
        }
    }

    public AsyncStorageModule(QZK qzk) {
        this(qzk, AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
