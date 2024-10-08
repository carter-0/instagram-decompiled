package X;

/* renamed from: X.9Jt  reason: invalid class name and case insensitive filesystem */
public final class C376899Jt extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376899Jt(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Jt, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new C376899Jt(obj2, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C376899Jt) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.9Jt, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        X.0eS.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (r0 != r5) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            switch(r1) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0040;
                default: goto L_0x000a;
            }
        L_0x000a:
            if (r0 != 0) goto L_0x0054
            X.0eS.A00(r7)
            java.lang.Object r0 = r6.A02
            X.2Nw r0 = (X.2Nw) r0
            r6.A00 = r4
            java.lang.Object r0 = X.2Nw.A00(r0, r6)
        L_0x0019:
            if (r0 != r5) goto L_0x0057
        L_0x001b:
            return r5
        L_0x001c:
            if (r0 != 0) goto L_0x0054
            X.0eS.A00(r7)
            X.1R9 r0 = X.AnonymousClass1R9.A03
            X.0r6 r3 = r0.A00
            java.lang.Object r1 = r6.A02
            r0 = 30
            X.PeH r2 = new X.PeH
            r2.<init>(r1, r0)
            r6.A00 = r4
            java.lang.String r1 = "dogfooding_init_collect"
            com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2 r0 = new com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2
            r0.<init>(r1, r2)
            java.lang.Object r0 = r3.collect(r0, r6)
            if (r0 == r5) goto L_0x001b
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0019
        L_0x0040:
            if (r0 != 0) goto L_0x0054
            X.0eS.A00(r7)
            java.lang.Object r0 = r6.A02
            X.49d r0 = (X.C2613249d) r0
            com.meta.analytics.gnv.vista.core.CoreVistaManager r1 = r0.A01
            X.4Cq r0 = r0.A03
            r6.A00 = r4
            java.lang.Object r0 = r1.A01(r0, r6)
            goto L_0x0019
        L_0x0054:
            X.0eS.A00(r7)
        L_0x0057:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376899Jt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
