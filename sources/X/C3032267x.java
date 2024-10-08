package X;

import android.net.Uri;
import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;

/* renamed from: X.67x  reason: invalid class name and case insensitive filesystem */
public final class C3032267x implements 29o {
    public final Mailbox A00;

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map B3P(com.instagram.common.session.UserSession r10, java.io.File r11) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            X.0eM r0 = X.C55334Hg2.A00
            java.lang.Object r0 = r0.getValue()
            com.facebook.instagram.msys.InstagramDatabaseRedactor r0 = (com.facebook.instagram.msys.InstagramDatabaseRedactor) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.facebook.msys.mca.Mailbox r3 = r9.A00
            monitor-enter(r3)
            com.facebook.msys.mci.Database r8 = r3.mDatabase     // Catch:{ all -> 0x017d }
            java.lang.String r1 = "mDatabase is null when calling Mailbox#getDatabase"
            if (r8 == 0) goto L_0x0177
            monitor-exit(r3)
            android.os.ConditionVariable r7 = new android.os.ConditionVariable
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.Opn r5 = new X.Opn
            r5.<init>(r7, r0, r11, r6)
            X.TOF r0 = new X.TOF
            r0.<init>()
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            com.facebook.msys.mci.DatabaseConnection r1 = r8.mReadWriteConnection
            if (r1 != 0) goto L_0x0053
            java.lang.Runnable r0 = X.XYA.A00
        L_0x0042:
            r3.execute(r0)
            r7.block()
            r2.addAll(r6)
            java.lang.String r0 = "task_trackers.txt"
            java.io.File r7 = new java.io.File
            r7.<init>(r11, r0)
            goto L_0x0059
        L_0x0053:
            X.PXx r0 = new X.PXx
            r0.<init>(r5, r1)
            goto L_0x0042
        L_0x0059:
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ FileNotFoundException -> 0x0098 }
            r5.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0098 }
            com.facebook.msys.mci.TaskTracker r0 = com.facebook.msys.mci.TaskTracker.TRACKER_UTILITY     // Catch:{ all -> 0x008e }
            java.lang.Class<com.facebook.msys.mci.TaskTracker> r6 = com.facebook.msys.mci.TaskTracker.class
            monitor-enter(r6)     // Catch:{ all -> 0x008e }
            com.facebook.msys.mci.TaskTracker r0 = com.facebook.msys.mci.TaskTracker.TRACKER_DATABASE     // Catch:{ IOException -> 0x0078 }
            com.facebook.msys.mci.TaskTracker.printTaskTracker(r5, r0)     // Catch:{ IOException -> 0x0078 }
            com.facebook.msys.mci.TaskTracker r0 = com.facebook.msys.mci.TaskTracker.TRACKER_NETWORK     // Catch:{ IOException -> 0x0078 }
            com.facebook.msys.mci.TaskTracker.printTaskTracker(r5, r0)     // Catch:{ IOException -> 0x0078 }
            com.facebook.msys.mci.TaskTracker r0 = com.facebook.msys.mci.TaskTracker.TRACKER_UTILITY     // Catch:{ IOException -> 0x0078 }
            com.facebook.msys.mci.TaskTracker.printTaskTracker(r5, r0)     // Catch:{ IOException -> 0x0078 }
            com.facebook.msys.mci.TaskTracker r0 = com.facebook.msys.mci.TaskTracker.TRACKER_MAIN     // Catch:{ IOException -> 0x0078 }
            com.facebook.msys.mci.TaskTracker.printTaskTracker(r5, r0)     // Catch:{ IOException -> 0x0078 }
            goto L_0x0080
        L_0x0078:
            r3 = move-exception
            java.lang.String r1 = "TaskTracker"
            java.lang.String r0 = "TaskTracker failed to dump state"
            X.0KC.A0J(r1, r0, r3)     // Catch:{ all -> 0x008b }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x008e }
            r5.flush()     // Catch:{ all -> 0x008e }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0098 }
            r2.add(r7)     // Catch:{ FileNotFoundException -> 0x0098 }
            goto L_0x00a0
        L_0x008b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x0098 }
        L_0x0097:
            throw r1     // Catch:{ FileNotFoundException -> 0x0098 }
        L_0x0098:
            r3 = move-exception
            java.lang.String r1 = "MsysBugReporter"
            java.lang.String r0 = "Unable to dump task trackers to file"
            android.util.Log.w(r1, r0, r3)
        L_0x00a0:
            java.lang.String r0 = "DirectMsysLogs.txt"
            java.io.File r5 = new java.io.File
            r5.<init>(r11, r0)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e7 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x00e7 }
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch:{ all -> 0x00e0 }
            r6.<init>(r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String[] r0 = X.O5G.A02     // Catch:{ all -> 0x00e0 }
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x00e0 }
            java.lang.String[] r0 = X.O5G.A01     // Catch:{ all -> 0x00e0 }
            java.lang.Process r0 = r1.exec(r0)     // Catch:{ all -> 0x00e0 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00e0 }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ all -> 0x00e0 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00e0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e0 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x00e0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e0 }
        L_0x00ce:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00d8
            r6.flush()     // Catch:{ all -> 0x00e0 }
            goto L_0x00dc
        L_0x00d8:
            r6.println(r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x00ce
        L_0x00dc:
            r3.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00ef
        L_0x00e0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ IOException -> 0x00e7 }
            throw r0     // Catch:{ IOException -> 0x00e7 }
        L_0x00e7:
            r3 = move-exception
            java.lang.String r1 = "IgMsysBugReportLogFileMapProvider"
            java.lang.String r0 = "could not collect logcat logs"
            X.0KC.A0F(r1, r0, r3)
        L_0x00ef:
            r2.add(r5)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36322766056925594(0x810b5d0015299a, double:3.034001742214454E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 != 0) goto L_0x011e
            r0 = 36322766056335764(0x810b5d000c2994, double:3.034001741841443E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x011e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r9.A00(r10, r11, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r9.A00(r10, r11, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r9.A00(r10, r11, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r9.A00(r10, r11, r0, r2)
        L_0x011e:
            r0 = 36322766056860057(0x810b5d00142999, double:3.034001742173008E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 != 0) goto L_0x0150
            r0 = 36322766056401301(0x810b5d000d2995, double:3.034001741882889E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x0150
            r0 = 35
            X.Pm0 r1 = new X.Pm0
            r1.<init>(r10, r0)
            java.lang.Class<X.67w> r0 = X.C3032167w.class
            java.lang.Object r0 = r10.A01(r0, r1)
            X.67w r0 = (X.C3032167w) r0
            java.io.File[] r0 = r0.A00(r11)
            if (r0 != 0) goto L_0x0172
            java.lang.String r1 = "IgMsysBugReportLogFileMapProvider"
            java.lang.String r0 = "Failed to copy Msys logcat log files"
            X.0KC.A0C(r1, r0)
        L_0x0150:
            r2.size()
            java.util.Iterator r3 = r2.iterator()
        L_0x0157:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r2 = r3.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r1 = r2.getName()
            android.net.Uri r0 = android.net.Uri.fromFile(r2)
            r4.put(r1, r0)
            r2.getName()
            goto L_0x0157
        L_0x0172:
            X.018.A18(r2, r0)
            goto L_0x0150
        L_0x0176:
            return r4
        L_0x0177:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x017d }
            r0.<init>(r1)     // Catch:{ all -> 0x017d }
            throw r0     // Catch:{ all -> 0x017d }
        L_0x017d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3032267x.B3P(com.instagram.common.session.UserSession, java.io.File):java.util.Map");
    }

    public final boolean CK5(UserSession userSession, String str) {
        return true;
    }

    public final void Epo(long j) {
    }

    public final String getTag() {
        return "IgMsysBugReportLogFileMapProvider";
    }

    private final void A00(UserSession userSession, File file, Integer num, List list) {
        String str;
        int i;
        File file2 = new File(file, "msys_debug");
        if (file2.exists() || file2.mkdirs()) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "reverb_db";
                    break;
                case 2:
                    str = "crypto_db";
                    break;
                case 3:
                    str = "incoming_db";
                    break;
                default:
                    str = "encrypted_backups_db";
                    break;
            }
            File file3 = new File(file2, 002.A0R(str, ".bin"));
            1bj r2 = C65291bk.A00;
            if (r2 == null) {
                0qQ.A0F("plugin");
                throw AnonymousClass00P.createAndThrow();
            }
            String obj = Uri.fromFile(file3).toString();
            0qQ.A07(obj);
            switch (intValue) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                default:
                    i = 4;
                    break;
            }
            int EB5 = r2.EB5(userSession, obj, i);
            if (EB5 == 0) {
                list.add(file3);
            } else {
                0KC.A0O("IgMsysBugReportLogFileMapProvider", "copyAndRedactDatabase for DB %d failed with error code: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(EB5)});
            }
        } else {
            0KC.A0C("IgMsysBugReportLogFileMapProvider", "Failed to create msys debug file directory: msys_debug");
        }
    }

    public C3032267x(Mailbox mailbox) {
        this.A00 = mailbox;
    }
}
