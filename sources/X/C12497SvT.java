package X;

/* renamed from: X.SvT  reason: case insensitive filesystem */
public final class C12497SvT implements C13620Tdm {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12497SvT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[Catch:{ Exception -> 0x008f, all -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eva(X.C11330SNj r11, X.S32 r12, byte[] r13) {
        /*
            r10 = this;
            int r0 = r10.A00
            if (r0 == 0) goto L_0x0099
            java.lang.String r5 = "BIO"
            boolean r4 = X.AnonymousClass7TG.A1Z(r11, r13)
            r2 = 0
            long r0 = r11.A01     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x007b
            java.lang.String r6 = r11.A04     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            java.lang.String r3 = "VALID"
            boolean r3 = r6.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            if (r3 == 0) goto L_0x007b
            java.lang.Object r3 = r10.A02     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            X.Sus r3 = (X.C12460Sus) r3     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            java.lang.String r9 = r3.A06     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x007b
            java.lang.String r8 = r11.A03     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            boolean r0 = r8.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            if (r0 != 0) goto L_0x0049
            java.util.Map r0 = r11.A08     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            X.RpJ r0 = (X.C10259RpJ) r0     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            if (r0 == 0) goto L_0x007b
            long r0 = r0.A00     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x007b
        L_0x0049:
            boolean r0 = r8.equals(r5)     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r10.A01     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            X.Rug r1 = (X.C10586Rug) r1
            if (r1 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r0 = r2
            goto L_0x005e
        L_0x0058:
            X.SNj r0 = r1.A01     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r0.A03     // Catch:{ Exception -> 0x008f, all -> 0x008a }
        L_0x005e:
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            if (r0 == 0) goto L_0x0072
            java.security.Signature r0 = r1.A02     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = X.C11096S9x.A00(r0, r13, r4)     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            goto L_0x0086
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            throw r0     // Catch:{ Exception -> 0x008f, all -> 0x008a }
        L_0x0072:
            X.SSZ r0 = X.SOC.A01()     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            java.lang.String r1 = r0.A08(r11, r13)     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            goto L_0x0086
        L_0x007b:
            X.TQW r0 = new X.TQW     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            r0.<init>()     // Catch:{ Exception -> 0x008f, all -> 0x008a }
            r1 = r2
            X.TQg r2 = new X.TQg
            r2.<init>(r11, r0)
        L_0x0086:
            r12.A00(r1, r2)
            return
        L_0x008a:
            r0 = move-exception
            r12.A00(r2, r2)
            throw r0
        L_0x008f:
            r1 = move-exception
            X.TQg r0 = new X.TQg
            r0.<init>(r11, r1)
            r12.A00(r2, r0)
            return
        L_0x0099:
            r4 = 0
            java.lang.Object r3 = r10.A01     // Catch:{ Exception -> 0x00c5 }
            X.QDE r3 = (X.QDE) r3     // Catch:{ Exception -> 0x00c5 }
            java.security.Signature r2 = X.QDE.A00(r3, r11)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r1 = r11.A03     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "BIO"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00b9
            X.Sup r1 = new X.Sup     // Catch:{ Exception -> 0x00c5 }
            r1.<init>(r10, r11, r12, r13)     // Catch:{ Exception -> 0x00c5 }
            java.lang.Object r0 = r10.A02     // Catch:{ Exception -> 0x00c5 }
            X.RsH r0 = (X.C10440RsH) r0     // Catch:{ Exception -> 0x00c5 }
            r3.A03(r1, r0, r11, r2)     // Catch:{ Exception -> 0x00c5 }
            return
        L_0x00b9:
            r2.getClass()     // Catch:{ Exception -> 0x00c5 }
            r0 = 1
            java.lang.String r0 = X.C11096S9x.A00(r2, r13, r0)     // Catch:{ Exception -> 0x00c5 }
            r12.A00(r0, r4)     // Catch:{ Exception -> 0x00c5 }
            return
        L_0x00c5:
            r0 = move-exception
            r12.A00(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12497SvT.Eva(X.SNj, X.S32, byte[]):void");
    }
}
