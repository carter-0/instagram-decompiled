package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SJ9 {
    public final Context A00;
    public final C10933S1m A01;
    public final AnonymousClass1QD A02;
    public final C60870jn A03;
    public final C60870jn A04;
    public final C60880jp A05;

    public SJ9(Context context, AnonymousClass1QD r3, C13563Tcc tcc, C60870jn r5, C60870jn r6, C60880jp r7) {
        0Pj r0 = C49849F9o.A01;
        this.A00 = context;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r3;
        this.A01 = new C10933S1m(tcc, r5, r6);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.QYJ, X.S6F] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019b, code lost:
        if (r11 == null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019f, code lost:
        r11.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0168, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0169, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017d, code lost:
        r0 = r7.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0181, code lost:
        if (r0 == null) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0183, code lost:
        r0 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0187, code lost:
        X.0wb.A06("PhoneIdRequester", r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018a, code lost:
        if (r11 != null) goto L_0x018c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x019e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017d A[Catch:{ all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.19i A00(java.lang.String r18) {
        /*
            r17 = this;
            java.lang.String r7 = ".provider.phoneid"
            java.lang.String r4 = "PhoneIdRequester"
            r5 = r17
            X.0jn r6 = r5.A03
            X.19i r2 = r6.A00()
            java.lang.String r0 = "contentproviders"
            X.QYK r3 = new X.QYK
            r1 = r18
            r3.<init>(r2, r1, r0)
            monitor-enter(r6)
            monitor-exit(r6)
            r13 = 0
            X.QYJ r2 = new X.QYJ
            r2.<init>(r1)
            java.lang.String r8 = X.002.A0R(r1, r7)
            android.content.Context r9 = r5.A00
            android.content.ContentResolver r7 = r9.getContentResolver()
            r11 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x016b }
            r6 = 0
            X.0Um.A00(r8, r6, r0)     // Catch:{ Exception -> 0x016b }
            android.content.ContentProviderClient r11 = r7.acquireUnstableContentProviderClient(r8)     // Catch:{ Exception -> 0x016b }
            if (r11 != 0) goto L_0x0035
            return r13
        L_0x0035:
            android.content.pm.PackageManager r0 = r9.getPackageManager()     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r8, r6)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            java.lang.String r7 = "content provider package name conflict. Expected:"
            if (r0 == 0) goto L_0x0161
            java.lang.String r6 = r0.packageName     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            boolean r0 = r1.equals(r6)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r0 == 0) goto L_0x0156
            boolean r0 = X.C49849F9o.A00(r9, r1)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r0 == 0) goto L_0x014f
            java.lang.String r0 = "content://"
            java.lang.String r0 = X.002.A0R(r0, r8)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            android.net.Uri r12 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r14 = r13
            r15 = r13
            r16 = r13
            android.database.Cursor r7 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r7 == 0) goto L_0x0148
            boolean r0 = r7.moveToFirst()     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r0 == 0) goto L_0x0148
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r3.A00 = r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r2.A00 = r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            java.lang.String r0 = "COL_PHONE_ID"
            int r6 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            java.lang.String r0 = "COL_TIMESTAMP"
            int r1 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            java.lang.String r0 = "COL_ORIGIN"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r6 < 0) goto L_0x00c1
            if (r1 < 0) goto L_0x00c1
            java.lang.String r9 = r7.getString(r6)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r0 < 0) goto L_0x009a
            java.lang.String r8 = r7.getString(r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            goto L_0x009b
        L_0x009a:
            r8 = r13
        L_0x009b:
            if (r9 == 0) goto L_0x00bc
            int r0 = r9.length()     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r0 <= 0) goto L_0x00bc
            if (r1 == 0) goto L_0x00bc
            int r0 = r1.length()     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            if (r0 <= 0) goto L_0x00bc
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            X.19i r6 = new X.19i     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r6.<init>(r9, r0, r8)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r3.A00 = r6     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            X.S1m r0 = r5.A01     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r0.A00(r3)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            goto L_0x00c6
        L_0x00bc:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r3.A01 = r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            goto L_0x00c5
        L_0x00c1:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            r3.A01 = r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
        L_0x00c5:
            r6 = r13
        L_0x00c6:
            java.lang.String r0 = "COL_SFDID"
            int r10 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            java.lang.String r0 = "COL_SFDID_CREATION_TS"
            int r1 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            java.lang.String r0 = "COL_SFDID_GP"
            int r9 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            java.lang.String r0 = "COL_SFDID_GA"
            int r8 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r10 < 0) goto L_0x012f
            if (r1 < 0) goto L_0x012f
            if (r9 < 0) goto L_0x012f
            if (r8 < 0) goto L_0x012f
            java.lang.String r0 = r7.getString(r10)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            java.lang.String r10 = r7.getString(r9)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            java.lang.String r9 = r7.getString(r8)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r0 == 0) goto L_0x012c
            int r0 = r0.length()     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r0 == 0) goto L_0x012c
            if (r1 == 0) goto L_0x012c
            int r0 = r1.length()     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r0 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            int r0 = r10.length()     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r0 == 0) goto L_0x012c
            if (r9 == 0) goto L_0x012c
            int r0 = r9.length()     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r0 == 0) goto L_0x012c
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            X.Ru6 r8 = new X.Ru6     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            r8.<init>(r0, r10, r9)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            r2.A00 = r8     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            X.S1m r1 = r5.A01     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            java.lang.Integer r0 = X.AnonymousClass05K.A15     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            r2.A01 = r0     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            X.0jn r0 = r1.A00     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            monitor-exit(r0)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            goto L_0x0133
        L_0x012c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            goto L_0x0131
        L_0x012f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ Exception -> 0x0146, all -> 0x019e }
        L_0x0131:
            r2.A01 = r0     // Catch:{ Exception -> 0x0146, all -> 0x019e }
        L_0x0133:
            boolean r0 = r7.moveToNext()     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r0 == 0) goto L_0x0142
            X.1QD r0 = r5.A02     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "Multiple records in cursor"
            X.0wb.A06(r4, r0, r13)     // Catch:{ Exception -> 0x0146, all -> 0x019e }
        L_0x0142:
            r7.close()     // Catch:{ Exception -> 0x0146, all -> 0x019e }
            goto L_0x018c
        L_0x0146:
            r7 = move-exception
            goto L_0x016d
        L_0x0148:
            java.lang.String r0 = "empty Cursor object from package "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r1)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            throw r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
        L_0x014f:
            java.lang.String r0 = "app signature mismatch"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            throw r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
        L_0x0156:
            java.lang.String r0 = " Found:"
            java.lang.String r0 = X.002.A0u(r7, r1, r0, r6)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            throw r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
        L_0x0161:
            java.lang.String r0 = " Found: No provider info."
            java.lang.IllegalArgumentException r0 = X.Pxg.A0c(r7, r1, r0)     // Catch:{ Exception -> 0x0168, all -> 0x019e }
            throw r0     // Catch:{ Exception -> 0x0168, all -> 0x019e }
        L_0x0168:
            r7 = move-exception
            r6 = r13
            goto L_0x016d
        L_0x016b:
            r7 = move-exception
            r6 = r13
        L_0x016d:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019a }
            r3.A00 = r0     // Catch:{ all -> 0x019a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019a }
            r2.A00 = r0     // Catch:{ all -> 0x019a }
            X.1QD r0 = r5.A02     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0187
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x019a }
        L_0x0187:
            X.0wb.A06(r4, r0, r7)     // Catch:{ all -> 0x019a }
        L_0x018a:
            if (r11 == 0) goto L_0x018f
        L_0x018c:
            r11.release()
        L_0x018f:
            X.0jp r0 = r5.A05
            if (r0 == 0) goto L_0x0199
            r0.A03(r3)
            r0.A03(r2)
        L_0x0199:
            return r6
        L_0x019a:
            r0 = move-exception
            if (r11 == 0) goto L_0x01a2
            goto L_0x019f
        L_0x019e:
            r0 = move-exception
        L_0x019f:
            r11.release()
        L_0x01a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJ9.A00(java.lang.String):X.19i");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.19i A01() {
        /*
            r6 = this;
            X.0jn r5 = r6.A04
            if (r5 == 0) goto L_0x0018
            X.0jd r3 = r5.A00
            monitor-enter(r3)
            android.content.SharedPreferences r2 = r3.A01     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = "phone_id_synced"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x0015 }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0018
            goto L_0x005a
        L_0x0015:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0018:
            java.util.ArrayList r4 = r6.A02()
            java.util.List r0 = X.SMi.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0022:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()
            int r1 = r4.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x0022
            r4.remove(r1)
            r0 = 0
            r4.add(r0, r2)
            goto L_0x0022
        L_0x003b:
            java.util.Iterator r1 = r4.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            X.19i r0 = r6.A00(r0)
            if (r0 == 0) goto L_0x003f
            if (r5 == 0) goto L_0x0060
            r5.A01()
            return r0
        L_0x0055:
            if (r5 == 0) goto L_0x005a
            r5.A01()
        L_0x005a:
            X.0jn r0 = r6.A03
            X.19i r0 = r0.A00()
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJ9.A01():X.19i");
    }

    public final ArrayList A02() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Context context = this.A00;
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        String packageName = context.getPackageName();
        for (PackageInfo next : installedPackages) {
            String str = next.packageName;
            if (!str.equals(packageName)) {
                Set set = AnonymousClass0PZ.A00;
                0Pj r0 = C49849F9o.A01;
                if (set.contains(str) && C49849F9o.A00(context, str)) {
                    A1C.add(next.packageName);
                }
            }
        }
        return A1C;
    }

    public final void A03() {
        ArrayList A022 = A02();
        C60870jn r3 = this.A04;
        if (r3 != null) {
            A022.size();
        }
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (A00(A18) == null) {
                Intent A09 = DbS.A09();
                A09.setAction("com.facebook.GET_PHONE_ID");
                A09.setPackage(A18);
                int i = 134217728;
                if (Build.VERSION.SDK_INT >= 30) {
                    i = 201326592;
                }
                Context context = this.A00;
                PendingIntent activity = PendingIntent.getActivity(context, 0, DbS.A09(), i);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable("auth", activity);
                context.sendOrderedBroadcast(A09, (String) null, new Q65(this.A01, new QYK(this.A03.A00(), A18, "broadcasts"), this.A05), (Handler) null, 1, (String) null, A0a);
            } else if (r3 != null) {
                r3.A01();
            }
        }
        if (r3 != null) {
            r3.A01();
        }
    }
}
