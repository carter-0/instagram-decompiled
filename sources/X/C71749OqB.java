package X;

/* renamed from: X.OqB  reason: case insensitive filesystem */
public final class C71749OqB implements C74436Pur {
    public static final C71749OqB A00 = new Object();

    public final String BdN() {
        return "zstd_notif_decompression";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E4V(X.N31 r12) {
        /*
            r11 = this;
            r2 = 0
            X.0qQ.A0B(r12, r2)
            X.Ptr r5 = r12.A06
            X.Ptr r6 = r12.A05
            boolean r0 = r5 instanceof X.N4x
            java.lang.String r4 = "decompression failed, plugin expects type \"ByteArray\" not \"String\""
            if (r0 == 0) goto L_0x001b
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r4)
            X.0qQ.A0B(r1, r2)
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            return r0
        L_0x001b:
            boolean r0 = r5 instanceof X.N4w
            if (r0 == 0) goto L_0x003b
            com.facebook.zstd.ZstdInputStream r0 = com.facebook.zstd.ZstdInputStream.$redex_init_class
            X.N4w r5 = (X.N4w) r5
            byte[] r1 = r5.A00
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            com.facebook.zstd.ZstdInputStream r3 = new com.facebook.zstd.ZstdInputStream
            r3.<init>(r0)
            byte[] r0 = X.C11108SAj.A01(r3)     // Catch:{ all -> 0x0065 }
            r3.close()
            X.N4w r5 = new X.N4w
            r5.<init>(r0)
        L_0x003b:
            boolean r0 = r6 instanceof X.N4x
            if (r0 == 0) goto L_0x004c
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r4)
            X.0qQ.A0B(r1, r2)
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            return r0
        L_0x004c:
            boolean r0 = r6 instanceof X.N4w
            if (r0 == 0) goto L_0x0074
            com.facebook.zstd.ZstdInputStream r0 = com.facebook.zstd.ZstdInputStream.$redex_init_class
            X.N4w r6 = (X.N4w) r6
            byte[] r1 = r6.A00
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            com.facebook.zstd.ZstdInputStream r3 = new com.facebook.zstd.ZstdInputStream
            r3.<init>(r0)
            byte[] r0 = X.C11108SAj.A01(r3)     // Catch:{ all -> 0x0065 }
            goto L_0x006c
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x006c:
            r3.close()
            X.N4w r6 = new X.N4w
            r6.<init>(r0)
        L_0x0074:
            android.content.Context r3 = r12.A03
            com.facebook.pushlite.model.PushInfraMetaData r4 = r12.A04
            java.lang.String r8 = r12.A07
            java.lang.Integer r7 = r12.A00
            boolean r9 = r12.A02
            r10 = 1
            X.AnonymousClass7TG.A0w(r2, r3, r4, r8)
            X.N31 r2 = new X.N31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71749OqB.E4V(X.N31):java.lang.Object");
    }

    public final boolean Esm(N31 n31) {
        0qQ.A0B(n31, 0);
        return 0qQ.A0K(n31.A04.A01, "zstd");
    }
}
