package X;

import android.os.Bundle;

public abstract class S92 {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle A00(android.content.ContentResolver r9, android.net.Uri r10, android.os.Bundle r11, X.C10549Ru3 r12, java.lang.String r13) {
        /*
            r5 = 0
            java.lang.String r2 = r10.getAuthority()
            if (r2 == 0) goto L_0x00e1
            android.content.pm.PackageManager r1 = r12.A00
            r0 = 131072(0x20000, float:1.83671E-40)
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r2, r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r3 = r0.packageName
            if (r3 == 0) goto L_0x00c9
            r0 = 64
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x00bb }
            if (r0 == 0) goto L_0x00bb
            android.content.pm.Signature[] r1 = r0.signatures
            if (r1 == 0) goto L_0x00bb
            int r0 = r1.length
            if (r0 == 0) goto L_0x00bb
            com.google.common.collect.ImmutableSet r8 = com.google.common.collect.ImmutableSet.A04(r1)
            if (r8 == 0) goto L_0x00bb
            com.google.common.collect.ImmutableSetMultimap r0 = r12.A02
            com.google.common.collect.ImmutableSet r4 = r0.AXL(r3)
            X.3kO r2 = r8.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r1 = r2.next()
            com.google.common.collect.ImmutableSet r0 = r12.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x004c
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x0034
        L_0x004c:
            r0 = 1838451259(0x6d948a3b, float:5.7463615E27)
            android.content.ContentProviderClient r1 = X.0fM.A00(r9, r10, r0)
            if (r1 == 0) goto L_0x0062
            android.os.Bundle r0 = r1.call(r13, r5, r11)     // Catch:{ all -> 0x005d }
            r1.close()
            return r0
        L_0x005d:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x0062:
            java.lang.String r0 = "Failed to acquire client"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0069:
            java.lang.String r6 = "Untrusted provider package "
            java.lang.String r5 = " ["
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r8.iterator()
        L_0x0075:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r8.next()
            android.content.pm.Signature r0 = (android.content.pm.Signature) r0
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r1 = 0
            int r0 = r4.length     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r2.update(r4, r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            byte[] r1 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r7.add(r0)
            goto L_0x0075
        L_0x009e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x00a4:
            java.lang.String r1 = ", "
            X.3El r0 = new X.3El
            r0.<init>(r1)
            java.lang.String r1 = r0.A02(r7)
            java.lang.String r0 = "]"
            java.lang.String r1 = X.002.A11(r6, r3, r5, r1, r0)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            java.lang.String r1 = "No signature for package "
            java.lang.String r0 = " resolving authority "
            java.lang.String r1 = X.002.A0u(r1, r3, r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00c9:
            java.lang.String r0 = "No package name for authority "
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00d5:
            java.lang.String r0 = "No provider for authority "
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "No authority in URI "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r10, r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S92.A00(android.content.ContentResolver, android.net.Uri, android.os.Bundle, X.Ru3, java.lang.String):android.os.Bundle");
    }

    public static void A01(Bundle bundle, AnonymousClass1Tr r5, String str) {
        String str2;
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("@exception@");
        if (bundle2 != null) {
            Throwable A01 = r5.A00(bundle2).A01();
            String message = A01.getMessage();
            String A16 = C51968G9o.A16(A01);
            if (message != null) {
                str2 = 002.A0R(": ", message);
            } else {
                str2 = "";
            }
            throw new Exception(002.A11("Exception in provider when invoking ", str, "(): ", A16, str2), A01);
        }
    }
}
