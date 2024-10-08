package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.39r  reason: invalid class name */
public final class AnonymousClass39r implements Runnable {
    public static final String A04 = AnonymousClass389.A01("ForceStopRunnable");
    public static final long A05 = TimeUnit.DAYS.toMillis(3650);
    public int A00 = 0;
    public final Context A01;
    public final AnonymousClass385 A02;
    public final C2378839p A03;

    public static void A00(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + A05;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r9.endTransaction();
        r8.release(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0306, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0307, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r7.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0314, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r1 = r4.A00 + 1;
        r4.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x031c, code lost:
        if (r1 >= 3) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x031f, code lost:
        X.AnonymousClass389.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        java.lang.Thread.sleep(((long) r4.A00) * 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0339, code lost:
        if (((android.os.UserManager) r6.getSystemService(android.os.UserManager.class)).isUserUnlocked() != false) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x033b, code lost:
        r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x033d, code lost:
        X.AnonymousClass389.A00();
        android.util.Log.e(r3, r1, r2);
        r0 = new java.lang.IllegalStateException(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0349, code lost:
        r1 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0194, code lost:
        X.AnonymousClass389.A00();
        r15 = true;
        r7.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r10 = r7.A05();
        r9 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a7, code lost:
        if (r9.hasNext() == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a9, code lost:
        r10.CmC(-1, (java.lang.String) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b5, code lost:
        r7.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r7.endTransaction();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0314 A[ExcHandler: SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException (r2v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:29:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021 A[LOOP:0: B:9:0x0021->B:166:0x0021, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r4 = r17
            X.385 r5 = r4.A02     // Catch:{ all -> 0x035d }
            X.38C r1 = r5.A02     // Catch:{ all -> 0x035d }
            java.lang.String r0 = r1.A04     // Catch:{ all -> 0x035d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x0012
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x035d }
            goto L_0x0021
        L_0x0012:
            android.content.Context r0 = r4.A01     // Catch:{ all -> 0x035d }
            boolean r0 = X.C2379739z.A00(r0, r1)     // Catch:{ all -> 0x035d }
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x035d }
            if (r0 != 0) goto L_0x0021
        L_0x001d:
            r5.A06()
            return
        L_0x0021:
            android.content.Context r6 = r4.A01     // Catch:{ SQLiteException -> 0x034c }
            r2 = 0
            X.0qQ.A0B(r6, r2)     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r1 = "androidx.work.workdb"
            java.io.File r0 = r6.getDatabasePath(r1)     // Catch:{ SQLiteException -> 0x034c }
            X.0qQ.A07(r0)     // Catch:{ SQLiteException -> 0x034c }
            boolean r0 = r0.exists()     // Catch:{ SQLiteException -> 0x034c }
            if (r0 == 0) goto L_0x00e0
            X.AnonymousClass389.A00()     // Catch:{ SQLiteException -> 0x034c }
            java.io.File r10 = r6.getDatabasePath(r1)     // Catch:{ SQLiteException -> 0x034c }
            X.0qQ.A07(r10)     // Catch:{ SQLiteException -> 0x034c }
            java.io.File r0 = r6.getNoBackupFilesDir()     // Catch:{ SQLiteException -> 0x034c }
            X.0qQ.A07(r0)     // Catch:{ SQLiteException -> 0x034c }
            java.io.File r9 = new java.io.File     // Catch:{ SQLiteException -> 0x034c }
            r9.<init>(r0, r1)     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String[] r12 = X.C10053Rlq.A01     // Catch:{ SQLiteException -> 0x034c }
            r11 = 3
            int r1 = X.0se.A0L(r11)     // Catch:{ SQLiteException -> 0x034c }
            r0 = 16
            if (r1 >= r0) goto L_0x0059
            r1 = 16
        L_0x0059:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ SQLiteException -> 0x034c }
            r8.<init>(r1)     // Catch:{ SQLiteException -> 0x034c }
            r7 = 0
        L_0x005f:
            r1 = r12[r7]     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r0 = r10.getPath()     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ SQLiteException -> 0x034c }
            java.io.File r3 = new java.io.File     // Catch:{ SQLiteException -> 0x034c }
            r3.<init>(r0)     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r0 = r9.getPath()     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ SQLiteException -> 0x034c }
            java.io.File r1 = new java.io.File     // Catch:{ SQLiteException -> 0x034c }
            r1.<init>(r0)     // Catch:{ SQLiteException -> 0x034c }
            X.0eP r0 = new X.0eP     // Catch:{ SQLiteException -> 0x034c }
            r0.<init>(r3, r1)     // Catch:{ SQLiteException -> 0x034c }
            java.lang.Object r1 = r0.A00     // Catch:{ SQLiteException -> 0x034c }
            java.lang.Object r0 = r0.A01     // Catch:{ SQLiteException -> 0x034c }
            r8.put(r1, r0)     // Catch:{ SQLiteException -> 0x034c }
            int r7 = r7 + 1
            if (r7 < r11) goto L_0x005f
            X.0eP r0 = new X.0eP     // Catch:{ SQLiteException -> 0x034c }
            r0.<init>(r10, r9)     // Catch:{ SQLiteException -> 0x034c }
            java.util.Map r0 = X.0Yt.A0C(r8, r0)     // Catch:{ SQLiteException -> 0x034c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ SQLiteException -> 0x034c }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ SQLiteException -> 0x034c }
        L_0x009c:
            boolean r0 = r9.hasNext()     // Catch:{ SQLiteException -> 0x034c }
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r9.next()     // Catch:{ SQLiteException -> 0x034c }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ SQLiteException -> 0x034c }
            java.lang.Object r8 = r0.getKey()     // Catch:{ SQLiteException -> 0x034c }
            java.io.File r8 = (java.io.File) r8     // Catch:{ SQLiteException -> 0x034c }
            java.lang.Object r7 = r0.getValue()     // Catch:{ SQLiteException -> 0x034c }
            java.io.File r7 = (java.io.File) r7     // Catch:{ SQLiteException -> 0x034c }
            boolean r0 = r8.exists()     // Catch:{ SQLiteException -> 0x034c }
            if (r0 == 0) goto L_0x009c
            boolean r0 = r7.exists()     // Catch:{ SQLiteException -> 0x034c }
            if (r0 == 0) goto L_0x00d9
            X.AnonymousClass389.A00()     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r3 = X.C10053Rlq.A00     // Catch:{ SQLiteException -> 0x034c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x034c }
            r1.<init>()     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r0 = "Over-writing contents of "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x034c }
            r1.append(r7)     // Catch:{ SQLiteException -> 0x034c }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteException -> 0x034c }
            android.util.Log.w(r3, r0)     // Catch:{ SQLiteException -> 0x034c }
        L_0x00d9:
            r8.renameTo(r7)     // Catch:{ SQLiteException -> 0x034c }
            X.AnonymousClass389.A00()     // Catch:{ SQLiteException -> 0x034c }
            goto L_0x009c
        L_0x00e0:
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x035d }
            java.lang.String r3 = A04     // Catch:{ all -> 0x035d }
            r16 = 0
            androidx.work.impl.WorkDatabase r7 = r5.A04     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r11 = r6.getSystemService(r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            android.app.job.JobScheduler r11 = (android.app.job.JobScheduler) r11     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.util.ArrayList r13 = X.AnonymousClass39O.A00(r11, r6)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.392 r8 = r7.A02()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.3A6 r8 = (X.AnonymousClass3A6) r8     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r1 = "SELECT DISTINCT work_spec_id FROM SystemIdInfo"
            java.util.TreeMap r0 = X.1WY.A08     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.1WY r9 = X.1Wa.A00(r1, r2)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.3oI r0 = r8.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0.assertNotSuspendingTransaction()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r10 = 0
            r12 = 1
            android.database.Cursor r1 = r0.query((X.AnonymousClass1WA) r9, (android.os.CancellationSignal) r10)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            int r0 = r1.getCount()     // Catch:{ all -> 0x030c }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x030c }
            r8.<init>(r0)     // Catch:{ all -> 0x030c }
        L_0x0117:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x012d
            boolean r0 = r1.isNull(r2)     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x0125
            r0 = r10
            goto L_0x0129
        L_0x0125:
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x030c }
        L_0x0129:
            r8.add(r0)     // Catch:{ all -> 0x030c }
            goto L_0x0117
        L_0x012d:
            r1.close()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r9.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r15 = 0
            if (r13 == 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r0 = 0
            goto L_0x013d
        L_0x0139:
            int r0 = r13.size()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x013d:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r9.<init>(r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r13 == 0) goto L_0x0180
            boolean r0 = r13.isEmpty()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 != 0) goto L_0x0180
            java.util.Iterator r14 = r13.iterator()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x014e:
            boolean r0 = r14.hasNext()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 == 0) goto L_0x0180
            java.lang.Object r13 = r14.next()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            android.app.job.JobInfo r13 = (android.app.job.JobInfo) r13     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r10 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r13.getExtras()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r1 == 0) goto L_0x0178
            boolean r0 = r1.containsKey(r10)     // Catch:{ NullPointerException -> 0x0178, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            r1.getInt(r0, r2)     // Catch:{ NullPointerException -> 0x0178, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r0 = r1.getString(r10)     // Catch:{ NullPointerException -> 0x0178, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.0qQ.A0B(r0, r12)     // Catch:{ NullPointerException -> 0x0178, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r9.add(r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x014e
        L_0x0178:
            int r0 = r13.getId()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.AnonymousClass39O.A01(r11, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x014e
        L_0x0180:
            java.util.Iterator r1 = r8.iterator()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x0184:
            boolean r0 = r1.hasNext()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r1.next()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            boolean r0 = r9.contains(r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 != 0) goto L_0x0184
            X.AnonymousClass389.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r15 = 1
            r7.beginTransaction()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.38z r10 = r7.A05()     // Catch:{ all -> 0x0307 }
            java.util.Iterator r9 = r8.iterator()     // Catch:{ all -> 0x0307 }
        L_0x01a3:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0307 }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0307 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0307 }
            r0 = -1
            r10.CmC(r0, r8)     // Catch:{ all -> 0x0307 }
            goto L_0x01a3
        L_0x01b5:
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0307 }
            r7.endTransaction()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x01bb:
            X.38z r11 = r7.A05()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.394 r10 = r7.A04()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r7.beginTransaction()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.util.ArrayList r1 = r11.Bow()     // Catch:{ all -> 0x0307 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0307 }
            r12 = 0
            if (r0 != 0) goto L_0x01f4
            r12 = 1
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x0307 }
        L_0x01d6:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0307 }
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0307 }
            X.3DG r1 = (X.AnonymousClass3DG) r1     // Catch:{ all -> 0x0307 }
            X.39t r0 = X.C2379139t.ENQUEUED     // Catch:{ all -> 0x0307 }
            java.lang.String r8 = r1.A0M     // Catch:{ all -> 0x0307 }
            r11.Elp(r0, r8)     // Catch:{ all -> 0x0307 }
            r0 = -512(0xfffffffffffffe00, float:NaN)
            r11.Ely(r8, r0)     // Catch:{ all -> 0x0307 }
            r0 = -1
            r11.CmC(r0, r8)     // Catch:{ all -> 0x0307 }
            goto L_0x01d6
        L_0x01f4:
            X.3C5 r10 = (X.AnonymousClass3C5) r10     // Catch:{ all -> 0x0307 }
            X.3oI r9 = r10.A01     // Catch:{ all -> 0x0307 }
            r9.assertNotSuspendingTransaction()     // Catch:{ all -> 0x0307 }
            X.1Vg r8 = r10.A02     // Catch:{ all -> 0x0307 }
            X.1WV r1 = r8.acquire()     // Catch:{ all -> 0x0307 }
            r9.beginTransaction()     // Catch:{ all -> 0x0307 }
            r1.ATQ()     // Catch:{ all -> 0x02ff }
            r9.setTransactionSuccessful()     // Catch:{ all -> 0x02ff }
            r9.endTransaction()     // Catch:{ all -> 0x0307 }
            r8.release(r1)     // Catch:{ all -> 0x0307 }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0307 }
            r7.endTransaction()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r12 != 0) goto L_0x021a
            if (r15 == 0) goto L_0x021c
        L_0x021a:
            r16 = 1
        L_0x021c:
            X.39p r8 = r5.A05     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            androidx.work.impl.WorkDatabase r0 = r8.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.395 r0 = r0.A01()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r11 = "reschedule_needed"
            java.lang.Long r0 = r0.BOY(r11)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 == 0) goto L_0x0252
            long r12 = r0.longValue()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r9 = 1
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0252
            X.AnonymousClass389.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r5.A07()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.3u6 r2 = new X.3u6     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r2.<init>(r11, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x0247:
            androidx.work.impl.WorkDatabase r0 = r8.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.395 r0 = r0.A01()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0.CNV(r2)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x001d
        L_0x0252:
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0 = 31
            if (r9 < r0) goto L_0x025c
            r10 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x025c:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r8.<init>()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r1 = androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0.<init>(r6, r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r8.setComponent(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r0 = "ACTION_FORCE_STOP_RESCHEDULE"
            r8.setAction(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0 = -1
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r6, r0, r8, r10)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0 = 30
            if (r9 < r0) goto L_0x02cb
            if (r1 == 0) goto L_0x027e
            r1.cancel()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x027e:
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r6.getSystemService(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0 = 0
            java.util.List r11 = r1.getHistoricalProcessExitReasons(r0, r2, r2)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r11 == 0) goto L_0x02f3
            boolean r0 = r11.isEmpty()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 != 0) goto L_0x02f3
            X.39p r0 = r4.A03     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            androidx.work.impl.WorkDatabase r0 = r0.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.395 r1 = r0.A01()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r0 = "last_force_stop_ms"
            java.lang.Long r0 = r1.BOY(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r0 == 0) goto L_0x02a8
            long r9 = r0.longValue()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x02aa
        L_0x02a8:
            r9 = 0
        L_0x02aa:
            r8 = 0
        L_0x02ab:
            int r0 = r11.size()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            if (r8 >= r0) goto L_0x02f3
            java.lang.Object r2 = r11.get(r8)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            android.app.ApplicationExitInfo r2 = (android.app.ApplicationExitInfo) r2     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            int r1 = r2.getReason()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r0 = 10
            if (r1 != r0) goto L_0x02c8
            long r1 = r2.getTimestamp()     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x02c8
            goto L_0x02da
        L_0x02c8:
            int r8 = r8 + 1
            goto L_0x02ab
        L_0x02cb:
            if (r1 != 0) goto L_0x02f3
            A00(r6)     // Catch:{ IllegalArgumentException | SecurityException -> 0x02d1, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x02da
        L_0x02d1:
            r1 = move-exception
            X.AnonymousClass389.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r0 = "Ignoring exception"
            android.util.Log.w(r3, r0, r1)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x02da:
            X.AnonymousClass389.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r5.A07()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.39p r8 = r4.A03     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.lang.String r0 = "last_force_stop_ms"
            X.3u6 r2 = new X.3u6     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r2.<init>(r0, r1)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x0247
        L_0x02f3:
            if (r16 == 0) goto L_0x001d
            X.AnonymousClass389.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            java.util.List r0 = r5.A07     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            X.C255313tv.A00(r7, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x001d
        L_0x02ff:
            r0 = move-exception
            r9.endTransaction()     // Catch:{ all -> 0x0307 }
            r8.release(r1)     // Catch:{ all -> 0x0307 }
            throw r0     // Catch:{ all -> 0x0307 }
        L_0x0307:
            r0 = move-exception
            r7.endTransaction()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            goto L_0x0313
        L_0x030c:
            r0 = move-exception
            r1.close()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
            r9.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x0313:
            throw r0     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0314 }
        L_0x0314:
            r2 = move-exception
            int r0 = r4.A00     // Catch:{ all -> 0x035d }
            int r1 = r0 + 1
            r4.A00 = r1     // Catch:{ all -> 0x035d }
            r0 = 3
            if (r1 < r0) goto L_0x031f
            goto L_0x032d
        L_0x031f:
            r2 = 300(0x12c, double:1.48E-321)
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x035d }
            int r0 = r4.A00     // Catch:{ all -> 0x035d }
            long r0 = (long) r0     // Catch:{ all -> 0x035d }
            long r0 = r0 * r2
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0021 }
            goto L_0x0021
        L_0x032d:
            java.lang.Class<android.os.UserManager> r0 = android.os.UserManager.class
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch:{ all -> 0x035d }
            android.os.UserManager r0 = (android.os.UserManager) r0     // Catch:{ all -> 0x035d }
            boolean r0 = r0.isUserUnlocked()     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x0349
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
        L_0x033d:
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x035d }
            android.util.Log.e(r3, r1, r2)     // Catch:{ all -> 0x035d }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x035d }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x035d }
            goto L_0x035c
        L_0x0349:
            java.lang.String r1 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"
            goto L_0x033d
        L_0x034c:
            r2 = move-exception
            java.lang.String r1 = "Unexpected SQLite exception during migrations"
            X.AnonymousClass389.A00()     // Catch:{ all -> 0x035d }
            java.lang.String r0 = A04     // Catch:{ all -> 0x035d }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x035d }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x035d }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x035d }
        L_0x035c:
            throw r0     // Catch:{ all -> 0x035d }
        L_0x035d:
            r1 = move-exception
            X.385 r0 = r4.A02
            r0.A06()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39r.run():void");
    }

    public AnonymousClass39r(Context context, AnonymousClass385 r3) {
        this.A01 = context.getApplicationContext();
        this.A02 = r3;
        this.A03 = r3.A05;
    }
}
