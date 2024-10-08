package X;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.zzl;

/* renamed from: X.3Ql  reason: invalid class name and case insensitive filesystem */
public final class C241713Ql {
    public static C241713Ql A01;
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if ((r0.flags & 129) == 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r6 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(android.content.pm.PackageInfo r6, boolean r7) {
        /*
            r3 = 1
            r5 = 0
            if (r7 == 0) goto L_0x0063
            if (r6 == 0) goto L_0x003a
            java.lang.String r1 = r6.packageName
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
        L_0x0018:
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            if (r0 == 0) goto L_0x0023
            int r0 = r0.flags
            r0 = r0 & 129(0x81, float:1.81E-43)
            r7 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            android.content.pm.Signature[] r1 = r6.signatures
            if (r1 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x005a
            com.google.android.gms.common.zzj[] r4 = X.C241733Qw.A00
        L_0x002c:
            int r0 = r1.length
            if (r0 == r3) goto L_0x003b
            r0 = 503(0x1f7, float:7.05E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = "Package has more than one signature."
            android.util.Log.w(r1, r0)
        L_0x003a:
            return r5
        L_0x003b:
            r2 = 0
            r0 = r1[r5]
            byte[] r0 = r0.toByteArray()
            com.google.android.gms.common.zzk r1 = new com.google.android.gms.common.zzk
            r1.<init>(r0)
        L_0x0047:
            int r0 = r4.length
            if (r2 >= r0) goto L_0x003a
            r0 = r4[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0057
            r0 = r4[r2]
            if (r0 == 0) goto L_0x003a
            return r3
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x005a:
            com.google.android.gms.common.zzj[] r0 = X.C241733Qw.A00
            r0 = r0[r5]
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[]{r0}
            goto L_0x002c
        L_0x0063:
            if (r6 == 0) goto L_0x003a
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241713Ql.A01(android.content.pm.PackageInfo, boolean):boolean");
    }

    public C241713Ql(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C241713Ql A00(Context context) {
        AnonymousClass3Qk.A02(context);
        synchronized (C241713Ql.class) {
            if (A01 == null) {
                zzl zzl = C241723Qm.A01;
                synchronized (C241723Qm.class) {
                    if (C241723Qm.A00 != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        C241723Qm.A00 = context.getApplicationContext();
                    }
                }
                A01 = new C241713Ql(context);
            }
        }
        return A01;
    }
}
