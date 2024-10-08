package X;

/* renamed from: X.Kww  reason: case insensitive filesystem */
public abstract class C63436Kww {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r7) {
        /*
            r6 = 0
            if (r7 == 0) goto L_0x005d
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r5 = r0.getExtensionFromMimeType(r7)
            if (r5 != 0) goto L_0x005c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x005c
            java.lang.String r2 = X.DbY.A0j(r7)
            java.lang.String r1 = "/"
            X.11S r0 = new X.11S
            r0.<init>(r1)
            r4 = 0
            java.util.List r2 = r0.A03(r2)
            boolean r0 = r2.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0059
            java.util.ListIterator r1 = X.C51968G9o.A18(r2)
        L_0x002e:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0059
            int r0 = X.DbX.A06(r1)
            if (r0 == 0) goto L_0x002e
            java.util.List r0 = X.DbX.A0y(r2, r1)
        L_0x003e:
            java.lang.String[] r2 = X.DbU.A1b(r0, r4)
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L_0x005d
            r1 = r2[r3]
            java.lang.String r0 = "heic"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "heif"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
        L_0x0058:
            return r1
        L_0x0059:
            X.0sn r0 = X.0sn.A00
            goto L_0x003e
        L_0x005c:
            return r5
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63436Kww.A00(java.lang.String):java.lang.String");
    }
}
