package X;

/* renamed from: X.Pf0  reason: case insensitive filesystem */
public final class C73556Pf0 extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73556Pf0(String str, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Pf0, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        int i;
        int i2 = this.A00;
        String str = this.A01;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C73556Pf0(str, r5, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            X.0eS.A00(r5)
            java.lang.String r1 = r4.A01
            if (r0 == 0) goto L_0x005a
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0053 }
            java.lang.Process r0 = r0.exec(r1)     // Catch:{ IOException -> 0x0053 }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0053 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0053 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0053 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0053 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0053 }
            X.2U6 r1 = new X.2U6     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            X.2U8 r0 = new X.2U8     // Catch:{ all -> 0x004c }
            r0.<init>(r1)     // Catch:{ all -> 0x004c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x004c }
        L_0x0031:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ all -> 0x004c }
            r3.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "\n"
            r3.append(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0031
        L_0x0044:
            r2.close()     // Catch:{ IOException -> 0x0053 }
            java.lang.String r0 = X.DbT.A10(r3)
            return r0
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x0053 }
            throw r0     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            return r0
        L_0x005a:
            r0 = 1
            android.graphics.Bitmap r0 = android.media.ThumbnailUtils.createVideoThumbnail(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73556Pf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73556Pf0) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
