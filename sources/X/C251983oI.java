package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.3oI  reason: invalid class name and case insensitive filesystem */
public abstract class C251983oI {
    public static final AnonymousClass1V5 Companion = new Object();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    public boolean allowMainThreadQueries;
    public C21287XSs autoCloser;
    public Map autoMigrationSpecs = new LinkedHashMap();
    public final Map backingFieldMap;
    public 1VY internalOpenHelper;
    public Executor internalQueryExecutor;
    public Executor internalTransactionExecutor;
    public final 1VK invalidationTracker = createInvalidationTracker();
    public List mCallbacks;
    public volatile 1W6 mDatabase;
    public final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public final ThreadLocal suspendingTransactionId = new ThreadLocal();
    public final Map typeConverters;
    public boolean writeAheadLoggingEnabled;

    public abstract void clearAllTables();

    public AnonymousClass1WV compileStatement(String str) {
        0qQ.A0B(str, 0);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().CGp().AIZ(str);
    }

    public abstract 1VK createInvalidationTracker();

    public abstract 1VY createOpenHelper(1VI r1);

    public abstract List getAutoMigrations(Map map);

    public abstract Set getRequiredAutoMigrationSpecs();

    public abstract Map getRequiredTypeConverters();

    public Object getTypeConverter(Class cls) {
        0qQ.A0B(cls, 0);
        return this.typeConverters.get(cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        r3.set(r2);
        r9.autoMigrationSpecs.put(r5, r4.get(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(X.1VI r10) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.1VY r0 = r9.createOpenHelper(r10)
            r9.internalOpenHelper = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x0018:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r5 = r6.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.util.List r4 = r10.A05
            int r0 = r4.size()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x004f
        L_0x002e:
            int r1 = r2 + -1
            java.lang.Object r0 = r4.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r5.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x004b
            r3.set(r2)
            java.util.Map r1 = r9.autoMigrationSpecs
            java.lang.Object r0 = r4.get(r2)
            r1.put(r5, r0)
            goto L_0x0018
        L_0x004b:
            if (r1 < 0) goto L_0x004f
            r2 = r1
            goto L_0x002e
        L_0x004f:
            java.lang.String r2 = "A required auto migration spec ("
            java.lang.String r1 = r5.getCanonicalName()
            java.lang.String r0 = ") is missing in the database configuration."
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0061:
            java.util.List r0 = r10.A05
            int r0 = r0.size()
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x007f
        L_0x006b:
            int r1 = r0 + -1
            boolean r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0077
            if (r1 < 0) goto L_0x007f
            r0 = r1
            goto L_0x006b
        L_0x0077:
            java.lang.String r1 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x007f:
            java.util.Map r0 = r9.autoMigrationSpecs
            java.util.List r0 = r9.getAutoMigrations(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0089:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r5 = r6.next()
            X.1VF r5 = (X.AnonymousClass1VF) r5
            X.1VB r4 = r10.A01
            int r0 = r5.startVersion
            int r3 = r5.endVersion
            java.util.Map r2 = r4.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r1 = r2.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x00b3
            X.0sm r1 = X.0Yt.A0E()
        L_0x00b3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x0089
        L_0x00bd:
            X.1VF[] r0 = new X.AnonymousClass1VF[]{r5}
            r4.A00(r0)
            goto L_0x0089
        L_0x00c5:
            java.lang.Class<X.1Va> r1 = X.AnonymousClass1Va.class
            X.1VY r0 = r9.getOpenHelper()
            r1.isInstance(r0)
            java.lang.Class<X.1Vb> r1 = X.AnonymousClass1Vb.class
            X.1VY r0 = r9.getOpenHelper()
            r1.isInstance(r0)
            java.lang.Integer r1 = r10.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2 = 0
            if (r1 != r0) goto L_0x00df
            r2 = 1
        L_0x00df:
            X.1VY r0 = r9.getOpenHelper()
            r0.Er1(r2)
            java.util.List r0 = r10.A06
            r9.mCallbacks = r0
            java.util.concurrent.Executor r0 = r10.A09
            r9.internalQueryExecutor = r0
            java.util.concurrent.Executor r1 = r10.A0A
            X.1Vc r0 = new X.1Vc
            r0.<init>(r1)
            r9.internalTransactionExecutor = r0
            boolean r0 = r10.A0C
            r9.allowMainThreadQueries = r0
            r9.writeAheadLoggingEnabled = r2
            java.util.Map r0 = r9.getRequiredTypeConverters()
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x010e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r7 = r0.iterator()
        L_0x012a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r6 = r7.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.util.List r3 = r10.A07
            int r0 = r3.size()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x0161
        L_0x0140:
            int r1 = r2 + -1
            java.lang.Object r0 = r3.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r6.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x015d
            r4.set(r2)
            java.util.Map r1 = r9.typeConverters
            java.lang.Object r0 = r3.get(r2)
            r1.put(r6, r0)
            goto L_0x012a
        L_0x015d:
            if (r1 < 0) goto L_0x0161
            r2 = r1
            goto L_0x0140
        L_0x0161:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "A required type converter ("
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ") for "
            r1.append(r0)
            java.lang.String r0 = r5.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = " is missing in the database configuration."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0189:
            java.util.List r3 = r10.A07
            int r0 = r3.size()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x01bf
        L_0x0193:
            int r1 = r2 + -1
            boolean r0 = r4.get(r2)
            if (r0 == 0) goto L_0x019f
            if (r1 < 0) goto L_0x01bf
            r2 = r1
            goto L_0x0193
        L_0x019f:
            java.lang.Object r2 = r3.get(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unexpected type converter "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251983oI.init(X.1VI):void");
    }

    public void internalInitInvalidationTracker(1W6 r4) {
        0qQ.A0B(r4, 0);
        1VK r1 = this.invalidationTracker;
        synchronized (r1.A02) {
            if (r1.A0D) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
            } else {
                r4.AT6("PRAGMA temp_store = MEMORY;");
                r4.AT6("PRAGMA recursive_triggers='ON';");
                r4.AT6("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                r1.A02(r4);
                r1.A0C = r4.AIZ("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                r1.A0D = true;
            }
        }
    }

    public final Cursor query(AnonymousClass1WA r2) {
        0qQ.A0B(r2, 0);
        return query(r2, (CancellationSignal) null);
    }

    public Object runInTransaction(Callable callable) {
        0qQ.A0B(callable, 0);
        beginTransaction();
        try {
            Object call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            internalEndTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map map) {
        0qQ.A0B(map, 0);
        this.autoMigrationSpecs = map;
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final Map getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public final Map getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        0qQ.A07(readLock);
        return readLock;
    }

    public 1VK getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public 1VY getOpenHelper() {
        1VY r0 = this.internalOpenHelper;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("internalOpenHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        0qQ.A0F("internalQueryExecutor");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ThreadLocal getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        0qQ.A0F("internalTransactionExecutor");
        throw AnonymousClass00P.createAndThrow();
    }

    public boolean isOpen() {
        Boolean bool;
        1W5 r0 = this.mDatabase;
        if (r0 != null) {
            bool = Boolean.valueOf(r0.A00.isOpen());
        } else {
            bool = null;
        }
        return 0qQ.A0K(bool, true);
    }

    public final boolean isOpenInternal() {
        1W5 r0 = this.mDatabase;
        if (r0 == null || !r0.A00.isOpen()) {
            return false;
        }
        return true;
    }

    public C251983oI() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        0qQ.A07(synchronizedMap);
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        1W5 CGp = getOpenHelper().CGp();
        this.invalidationTracker.A02(CGp);
        SQLiteDatabase sQLiteDatabase = CGp.A00;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            AnonymousClass0fa.A02(sQLiteDatabase, 532084787);
        } else {
            CGp.ADK();
        }
    }

    /* access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().CGp().ASV();
        if (!inTransaction()) {
            1VK r3 = this.invalidationTracker;
            if (r3.A06.compareAndSet(false, true)) {
                r3.A01.getQueryExecutor().execute(r3.A03);
            }
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            0qQ.A07(writeLock);
            writeLock.lock();
            try {
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public boolean inTransaction() {
        return getOpenHelper().CGp().A00.inTransaction();
    }

    public final boolean isMainThread$room_runtime_release() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().CGp().A00.setTransactionSuccessful();
    }

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        internalEndTransaction();
    }

    public Cursor query(AnonymousClass1WA r8, CancellationSignal cancellationSignal) {
        0qQ.A0B(r8, 0);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        CancellationSignal cancellationSignal2 = cancellationSignal;
        1W5 CGp = getOpenHelper().CGp();
        if (cancellationSignal == null) {
            return CGp.E5j(r8);
        }
        SQLiteDatabase sQLiteDatabase = CGp.A00;
        String ByV = r8.ByV();
        String[] strArr = 1W5.A02;
        AL7 al7 = new AL7(r8);
        0qQ.A0B(strArr, 2);
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(al7, ByV, strArr, (String) null, cancellationSignal2);
        0qQ.A07(rawQueryWithFactory);
        return rawQueryWithFactory;
    }

    public void runInTransaction(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            internalEndTransaction();
        }
    }

    public Cursor query(String str, Object[] objArr) {
        0qQ.A0B(str, 0);
        return getOpenHelper().CGp().E5j(new 1W8(str, objArr));
    }
}
