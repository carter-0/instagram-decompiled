package X;

/* renamed from: X.VuB  reason: case insensitive filesystem */
public final class C18559VuB {
    public static final Integer A03 = AnonymousClass05K.A0N;
    public final 0wc A00;
    public final C292875jf A01;
    public final C18452Vs0 A02;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r11) {
        /*
            r10 = this;
            X.Vs0 r3 = r10.A02
            r9 = 0
            java.lang.String r6 = ""
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r11 == 0) goto L_0x0058
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0058
            java.util.Locale r2 = java.util.Locale.US
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r0 = r0.getTimeInMillis()
            long r0 = X.AnonymousClass7TE.A0P(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%d"
            java.lang.String r7 = java.lang.String.format(r2, r0, r1)
            X.5jf r0 = r3.A00
            X.5ke r0 = r0.A00()
            if (r0 == 0) goto L_0x0053
            int r2 = r0.A00
            if (r2 < 0) goto L_0x0053
            java.lang.String r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0053
            com.facebook.cryptopub.CryptoPubNative r0 = X.C18452Vs0.A03     // Catch:{ Exception -> 0x0067 }
            byte[] r1 = r0.encrypt(r2, r1, r11, r7)     // Catch:{ Exception -> 0x0067 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ Exception -> 0x0067 }
            X.VYy r8 = new X.VYy     // Catch:{ Exception -> 0x0067 }
            r8.<init>(r6, r0, r9, r4)     // Catch:{ Exception -> 0x0067 }
            goto L_0x006b
        L_0x0053:
            X.VYy r8 = X.C18452Vs0.A00(r11, r7)
            goto L_0x006b
        L_0x0058:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "Empty password passed in"
            X.V1x r0 = new X.V1x
            r0.<init>((java.lang.String) r1, (java.lang.Integer) r2)
            X.VYy r3 = new X.VYy
            r3.<init>(r6, r11, r0, r4)
            goto L_0x008e
        L_0x0067:
            X.VYy r8 = X.C18452Vs0.A00(r11, r7)
        L_0x006b:
            X.5jf r0 = r3.A00
            X.5ke r0 = r0.A00()
            java.lang.String r6 = "%s:%s:%s:%s"
            java.lang.String r1 = "#PWD_TRANSIENT"
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r2 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x00d7
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r5, r7, r11}
            java.lang.String r2 = java.lang.String.format(r2, r6, r0)
            X.V1x r0 = r8.A03
            X.VYy r3 = new X.VYy
            r3.<init>(r1, r2, r0, r4)
        L_0x008e:
            X.0wc r1 = r10.A00
            java.lang.String r0 = "instagram_client_password_encryption_encrypt_attempt"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            X.5jf r0 = r10.A01
            X.5ke r0 = r0.A00()
            if (r0 == 0) goto L_0x00ca
            java.lang.String r5 = r0.A02
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x00a7:
            int r0 = r3.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "version"
            r4.A9F(r0, r1)
            java.lang.String r0 = "key"
            r4.AAJ(r0, r5)
            java.lang.String r0 = "key_id"
            r4.A9F(r0, r2)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "tag"
            r4.AAJ(r0, r1)
            r4.Cgf()
            java.lang.String r0 = r3.A01
            return r0
        L_0x00ca:
            r0 = 41
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r0 = 457(0x1c9, float:6.4E-43)
            java.lang.String r5 = X.C273654mx.A00(r0)
            goto L_0x00a7
        L_0x00d7:
            int r5 = X.C18452Vs0.A02
            X.V1x r4 = r8.A03
            if (r4 == 0) goto L_0x00e4
            java.lang.Integer r2 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x011d
            r5 = 1
        L_0x00e4:
            if (r4 == 0) goto L_0x0102
            java.lang.Integer r2 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0102
        L_0x00ec:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = r8.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r7, r0}
            java.lang.String r0 = java.lang.String.format(r3, r6, r0)
            X.VYy r3 = new X.VYy
            r3.<init>(r1, r0, r4, r5)
            goto L_0x008e
        L_0x0102:
            java.lang.Integer r0 = r3.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x010e;
                case 2: goto L_0x0111;
                case 3: goto L_0x0114;
                case 4: goto L_0x0117;
                case 5: goto L_0x011a;
                default: goto L_0x010b;
            }
        L_0x010b:
            java.lang.String r1 = "#PWD_ENC"
            goto L_0x00ec
        L_0x010e:
            java.lang.String r1 = "#PWD_FB4A"
            goto L_0x00ec
        L_0x0111:
            java.lang.String r1 = "#PWD_TALK"
            goto L_0x00ec
        L_0x0114:
            java.lang.String r1 = "#PWD_INSTAGRAM"
            goto L_0x00ec
        L_0x0117:
            java.lang.String r1 = "#PWD_WORKPLACE"
            goto L_0x00ec
        L_0x011a:
            java.lang.String r1 = "#PWD_MSGR"
            goto L_0x00ec
        L_0x011d:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x00e4
            r5 = 0
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18559VuB.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Vs0, java.lang.Object] */
    public C18559VuB(0lg r4) {
        C292875jf r2 = C292875jf.A01;
        if (r2 == null) {
            r2 = new C292875jf(C60960kU.A00);
            C292875jf.A01 = r2;
        }
        Integer num = A03;
        C18452Vs0.A02 = 4;
        ? obj = new Object();
        obj.A00 = r2;
        obj.A01 = num;
        this.A02 = obj;
        this.A01 = r2;
        0qQ.A0B(r4, 0);
        AnonymousClass0kM r1 = new AnonymousClass0kM(r4);
        r1.A01 = 1Rm.A00().A00;
        this.A00 = r1.A00();
    }
}
