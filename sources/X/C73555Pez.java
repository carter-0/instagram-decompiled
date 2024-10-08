package X;

/* renamed from: X.Pez  reason: case insensitive filesystem */
public final class C73555Pez extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73555Pez(int i, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Pez, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        int i;
        switch (this.A01) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return new C73555Pez(i, r4);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Pez, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        X.0eS.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r0 != r4) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r1 = r6.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            switch(r1) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0033;
                case 2: goto L_0x0043;
                default: goto L_0x000a;
            }
        L_0x000a:
            if (r0 != 0) goto L_0x0063
            X.0eS.A00(r7)
            X.1R9 r0 = X.AnonymousClass1R9.A03
            X.0Ud r3 = r0.A02
            X.PeK r2 = X.C73528PeK.A00
            r6.A00 = r5
            java.lang.String r1 = "dogfooding_notification_collect"
            com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2 r0 = new com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2
            r0.<init>(r1, r2)
            java.lang.Object r0 = r3.collect(r0, r6)
        L_0x0022:
            if (r0 != r4) goto L_0x0066
            return r4
        L_0x0025:
            if (r0 != 0) goto L_0x0063
            X.0eS.A00(r7)
            r0 = 300(0x12c, double:1.48E-321)
            r6.A00 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r6, r0)
            goto L_0x0022
        L_0x0033:
            if (r0 != 0) goto L_0x0063
            X.0eS.A00(r7)
            com.instagram.preferences.device.AppRestartLoggerPrefs r1 = com.instagram.preferences.device.AppRestartLoggerPrefs.A00
            X.PpI r0 = X.C74115PpI.A00
            r6.A00 = r5
            java.lang.Object r0 = r1.A02(r6, r0)
            goto L_0x0022
        L_0x0043:
            if (r0 == 0) goto L_0x004d
            X.0eS.A00(r7)
        L_0x0048:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x004d:
            X.0eS.A00(r7)
            X.0eM r0 = X.C70712Um.A02
            java.lang.Object r1 = r0.getValue()
            X.0pa r1 = (X.C61770pa) r1
            X.PeJ r0 = X.C73527PeJ.A00
            r6.A00 = r5
            java.lang.Object r0 = r1.collect(r0, r6)
            if (r0 != r4) goto L_0x0048
            return r4
        L_0x0063:
            X.0eS.A00(r7)
        L_0x0066:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73555Pez.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73555Pez) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
