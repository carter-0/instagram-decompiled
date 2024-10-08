package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.3Rk  reason: invalid class name and case insensitive filesystem */
public abstract class C241843Rk {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r6, X.AnonymousClass3RC r7) {
        /*
            java.lang.Integer r1 = r7.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x000c
            java.lang.Integer r1 = r7.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x00af
        L_0x000c:
            android.content.pm.PackageInfo r0 = r7.A01
            if (r0 == 0) goto L_0x00af
            android.content.pm.PackageInfo r0 = r7.A01
            android.content.pm.Signature[] r2 = r0.signatures
            if (r2 == 0) goto L_0x004f
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x004f
            r5 = 0
            r0 = r2[r5]
            byte[] r4 = r0.toByteArray()
            java.lang.String r3 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0028 }
            goto L_0x0040
        L_0x0028:
            java.lang.String r0 = "org.apache.harmony.security.fortress.Services"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x003c }
            java.lang.String r1 = "setNeedRefresh"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x003c }
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x003c }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x003c }
            r2.invoke(r1, r0)     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
        L_0x0040:
            int r0 = r4.length     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            r1.update(r4, r5, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            byte[] r1 = r1.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            r0 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0051 }
            goto L_0x0052
        L_0x004f:
            r5 = 0
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            java.lang.Object r1 = X.AnonymousClass3RD.A00
            X.3RX r1 = (X.AnonymousClass3RX) r1
            X.3RA r0 = X.AnonymousClass3RA.A00(r6)
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set r1 = r1.A07
            if (r0 != 0) goto L_0x008b
            X.0ck r3 = X.AnonymousClass0PK.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r1.next()
            X.0PH r0 = (X.0PH) r0
            java.util.Set r0 = r3.A00(r0)
            r2.addAll(r0)
            goto L_0x0076
        L_0x008a:
            r1 = r2
        L_0x008b:
            java.util.Iterator r1 = r1.iterator()
        L_0x008f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r1.next()
            X.0PH r0 = (X.0PH) r0
            java.lang.String r0 = r0.A00
            r4.add(r0)
            goto L_0x008f
        L_0x00a1:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r4)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00b0
            java.lang.Integer r0 = X.AnonymousClass05K.A15
        L_0x00ad:
            r7.A02 = r0
        L_0x00af:
            return
        L_0x00b0:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241843Rk.A00(android.content.Context, X.3RC):void");
    }

    public static boolean A01(Context context, AnonymousClass3RB r4, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(context.getPackageName())) {
            return true;
        }
        AnonymousClass3RC A01 = r4.A01(context, str, 64);
        A00(context, A01);
        if (A01.A02 == AnonymousClass05K.A15) {
            return true;
        }
        return false;
    }
}
