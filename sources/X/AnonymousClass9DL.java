package X;

import java.util.concurrent.Callable;

/* renamed from: X.9DL  reason: invalid class name */
public final class AnonymousClass9DL implements Callable {
    public final /* synthetic */ AnonymousClass3JY A00;
    public final /* synthetic */ AnonymousClass9DI A01;

    public AnonymousClass9DL(AnonymousClass3JY r1, AnonymousClass9DI r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        if (r0.equals(r4) == false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            X.9DI r7 = r10.A01
            X.9DG r6 = r7.A00
            X.3JY r5 = r10.A00
            java.lang.String r4 = r5.A00
            r3 = r6
            X.9DF r3 = (X.AnonymousClass9DF) r3
            X.9DN r1 = r3.A01()
            if (r1 != 0) goto L_0x007e
            r8 = 0
        L_0x0012:
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x00d9
            r0 = 2
            if (r8 == r2) goto L_0x00ce
            if (r8 == r0) goto L_0x0061
            r8 = 0
        L_0x001c:
            java.util.List r0 = X.AnonymousClass9DK.A01
            r0.remove(r5)
            X.9DN r2 = r3.A01()
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = r3.A03()
            java.io.File r2 = r2.Bnd(r0)
            if (r2 == 0) goto L_0x005f
            X.9DJ r0 = r3.A02()
            r0.A00(r2)
        L_0x0038:
            java.lang.String r7 = "OLD"
            java.lang.String r6 = "LATEST"
            if (r2 != 0) goto L_0x004d
            java.lang.Class<X.9DI> r3 = X.AnonymousClass9DI.class
            if (r8 != 0) goto L_0x0043
            r7 = r6
        L_0x0043:
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r0 = "Unable to get file path for %s file"
        L_0x0049:
            X.0KC.A0B(r3, r0, r2)
            return r1
        L_0x004d:
            boolean r0 = r2.isFile()
            if (r0 != 0) goto L_0x00c6
            java.lang.Class<X.9DI> r3 = X.AnonymousClass9DI.class
            if (r8 != 0) goto L_0x0058
            r7 = r6
        L_0x0058:
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r0 = "File wasn't a file for %s file"
            goto L_0x0049
        L_0x005f:
            r2 = r1
            goto L_0x0038
        L_0x0061:
            java.util.List r2 = X.AnonymousClass9DK.A00
            boolean r0 = r2.contains(r5)
            if (r0 != 0) goto L_0x007c
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x007c
            r2.add(r5)
            X.3z9 r2 = X.AnonymousClass9DI.A02
            X.Alv r0 = new X.Alv
            r0.<init>(r5, r7)
            r2.execute(r0)
        L_0x007c:
            r8 = 1
            goto L_0x001c
        L_0x007e:
            java.lang.String r0 = r3.A03()
            java.io.File r0 = r1.Bnd(r0)
            if (r0 == 0) goto L_0x00ce
            X.9DJ r9 = r3.A02()
            android.content.SharedPreferences r8 = r9.A01
            if (r8 != 0) goto L_0x009b
            android.content.Context r2 = r9.A00
            r1 = 0
            java.lang.String r0 = "asset_preferences"
            android.content.SharedPreferences r8 = r2.getSharedPreferences(r0, r1)
            r9.A01 = r8
        L_0x009b:
            X.95S r0 = r9.A03
            if (r0 != 0) goto L_0x00b1
            java.lang.String r2 = "md5"
            X.95S r1 = X.AnonymousClass95R.A04
            java.lang.String r0 = r9.A04
            X.95T r0 = r1.A00(r0)
            X.95T r0 = r0.A00(r2)
            X.95S r0 = (X.AnonymousClass95S) r0
            r9.A03 = r0
        L_0x00b1:
            java.lang.String r1 = r0.toString()
            r0 = 0
            java.lang.String r0 = r8.getString(r1, r0)
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r0.equals(r4)
            r8 = 3
            if (r0 != 0) goto L_0x0012
        L_0x00c3:
            r8 = 2
            goto L_0x0012
        L_0x00c6:
            java.lang.String r0 = r5.A01
            X.9DP r1 = new X.9DP
            r1.<init>(r2, r0, r4, r8)
            return r1
        L_0x00ce:
            r1 = 0
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x00d9
            X.9DP r1 = X.AnonymousClass9DI.A00(r5, r7)
        L_0x00d9:
            java.util.List r0 = X.AnonymousClass9DK.A01
            r0.remove(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9DL.call():java.lang.Object");
    }
}
