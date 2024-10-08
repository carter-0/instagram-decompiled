package X;

/* renamed from: X.733  reason: invalid class name */
public final class AnonymousClass733 {
    public static final AnonymousClass733 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r13 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass735 A00(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            r2 = 1
            X.0qQ.A0B(r11, r2)
            if (r9 == 0) goto L_0x0009
            r7 = 1
            if (r13 != 0) goto L_0x000a
        L_0x0009:
            r7 = 0
        L_0x000a:
            r1 = r10
            if (r10 != 0) goto L_0x000e
            r1 = r11
        L_0x000e:
            java.lang.String r0 = ".gif"
            boolean r0 = X.00l.A0d(r1, r0, r2)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "gif"
        L_0x0018:
            java.lang.String r1 = "webp"
            boolean r2 = X.0qQ.A0K(r0, r1)
            if (r7 == 0) goto L_0x003f
            if (r9 == 0) goto L_0x0039
            int r1 = X.AnonymousClass0Ke.A00(r9)
            r0 = 2016(0x7e0, float:2.825E-42)
            if (r1 < r0) goto L_0x0036
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x002c:
            X.WXW r1 = new X.WXW
            r1.<init>(r11, r0)
        L_0x0031:
            X.734 r1 = (X.AnonymousClass734) r1
        L_0x0033:
            X.735 r1 = (X.AnonymousClass735) r1
            return r1
        L_0x0036:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x002c
        L_0x0039:
            X.73J r1 = new X.73J
            r1.<init>(r11)
            goto L_0x0031
        L_0x003f:
            if (r12 == 0) goto L_0x005f
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            byte[] r1 = X.C272134kB.A03(r0)
            if (r2 == 0) goto L_0x005a
            r0 = 0
            com.facebook.animated.webp.WebPImage r0 = com.facebook.animated.webp.WebPImage.createFromByteArray(r1, r0)
        L_0x0051:
            X.0qQ.A0A(r0)
            X.WXT r1 = new X.WXT
            r1.<init>(r0)
            goto L_0x0033
        L_0x005a:
            com.facebook.animated.gif.GifImage r0 = com.facebook.animated.gif.GifImage.createFromByteArray(r1)
            goto L_0x0051
        L_0x005f:
            if (r2 == 0) goto L_0x0067
            X.73J r1 = new X.73J
            r1.<init>(r11)
            goto L_0x0033
        L_0x0067:
            X.WXV r1 = new X.WXV
            r1.<init>(r11)
            goto L_0x0033
        L_0x006d:
            if (r10 != 0) goto L_0x0070
            r10 = r11
        L_0x0070:
            java.lang.String r0 = ".webp"
            boolean r0 = X.00l.A0d(r10, r0, r2)
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "webp"
            goto L_0x0018
        L_0x007b:
            X.0eM r0 = X.C18444Vrr.A02     // Catch:{ IOException -> 0x00e8 }
            java.lang.Object r6 = r0.getValue()     // Catch:{ IOException -> 0x00e8 }
            X.Vrr r6 = (X.C18444Vrr) r6     // Catch:{ IOException -> 0x00e8 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00e8 }
            r0.<init>(r11)     // Catch:{ IOException -> 0x00e8 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00e8 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00e8 }
            int r5 = r6.A00     // Catch:{ IOException -> 0x00e8 }
            byte[] r3 = new byte[r5]     // Catch:{ IOException -> 0x00e8 }
            if (r5 < r5) goto L_0x00d8
            boolean r0 = r4.markSupported()     // Catch:{ IOException -> 0x00e8 }
            if (r0 == 0) goto L_0x00b9
            r4.mark(r5)     // Catch:{ all -> 0x00b4 }
            if (r5 < 0) goto L_0x00ac
            r2 = 0
        L_0x009f:
            if (r2 >= r5) goto L_0x00c9
            int r0 = r5 - r2
            int r1 = r4.read(r3, r2, r0)     // Catch:{ all -> 0x00b4 }
            r0 = -1
            if (r1 == r0) goto L_0x00c9
            int r2 = r2 + r1
            goto L_0x009f
        L_0x00ac:
            java.lang.String r1 = "len is negative"
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x00b4 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            r4.reset()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e7
        L_0x00b9:
            if (r5 < 0) goto L_0x00e0
            r2 = 0
        L_0x00bc:
            if (r2 >= r5) goto L_0x00cc
            int r0 = r5 - r2
            int r1 = r4.read(r3, r2, r0)     // Catch:{ IOException -> 0x00e8 }
            r0 = -1
            if (r1 == r0) goto L_0x00cc
            int r2 = r2 + r1
            goto L_0x00bc
        L_0x00c9:
            r4.reset()     // Catch:{ IOException -> 0x00e8 }
        L_0x00cc:
            X.Vu0 r0 = r6.A01     // Catch:{ IOException -> 0x00e8 }
            X.VvZ r1 = r0.A00(r3, r2)     // Catch:{ IOException -> 0x00e8 }
            X.VvZ r0 = X.C18637VvZ.A02     // Catch:{ IOException -> 0x00e8 }
            if (r1 == r0) goto L_0x00ea
            r0 = r1
            goto L_0x00ea
        L_0x00d8:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e7
        L_0x00e0:
            java.lang.String r0 = "len is negative"
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch:{ IOException -> 0x00e8 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00e8 }
        L_0x00e7:
            throw r1     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            X.VvZ r0 = X.C18637VvZ.A02
        L_0x00ea:
            java.lang.String r0 = r0.A00
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass733.A00(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):X.735");
    }
}
