package X;

/* renamed from: X.9K9  reason: invalid class name */
public final class AnonymousClass9K9 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K9(Object obj, Object obj2, AnonymousClass4D7 r4, int i, boolean z) {
        super(2, r4);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9K9, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A03;
        Object obj3 = this.A02;
        boolean z = this.A04;
        switch (i2) {
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
        return new AnonymousClass9K9(obj2, obj3, r8, i, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9K9) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.9K9, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r13.A00 = r6;
        r0 = X.1Eo.A00(r13, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        X.0eS.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r0 != r2) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x004a;
                case 2: goto L_0x0076;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A00
            r1 = 1
            if (r0 != 0) goto L_0x0072
            X.0eS.A00(r14)
            java.lang.Object r5 = r13.A03
            X.6lC r5 = (X.C316156lC) r5
            X.07U r0 = X.07U.A04
            java.lang.Object r4 = r13.A02
            boolean r8 = r13.A04
            r6 = 0
            r7 = 27
            X.JTe r3 = new X.JTe
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A00 = r1
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r0, r5, r13, r3)
        L_0x0027:
            if (r0 != r2) goto L_0x0097
            return r2
        L_0x002a:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A00
            r6 = 1
            if (r0 != 0) goto L_0x0072
            X.0eS.A00(r14)
            r0 = 781540647(0x2e955d27, float:6.792283E-11)
            X.0nL r5 = new X.0nL
            r5.<init>(r0)
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            boolean r12 = r13.A04
            r10 = 0
            r11 = 5
            X.JTc r7 = new X.JTc
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x006b
        L_0x004a:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A00
            r6 = 1
            if (r0 != 0) goto L_0x0072
            X.0eS.A00(r14)
            r0 = 750(0x2ee, float:1.051E-42)
            X.0nL r5 = new X.0nL
            r5.<init>(r0)
            java.lang.Object r4 = r13.A03
            com.instagram.mainfeed.network.FeedCacheCoordinator r4 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r4
            java.lang.Object r3 = r13.A02
            X.1UO r3 = (X.1UO) r3
            boolean r1 = r13.A04
            r0 = 0
            X.JTY r7 = new X.JTY
            r7.<init>(r3, r4, r0, r1)
        L_0x006b:
            r13.A00 = r6
            java.lang.Object r0 = X.1Eo.A00(r13, r5, r7)
            goto L_0x0027
        L_0x0072:
            X.0eS.A00(r14)
            goto L_0x0097
        L_0x0076:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r13.A00
            r7 = 1
            if (r0 == 0) goto L_0x00ac
            X.0eS.A00(r14)
        L_0x0080:
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x0097
            X.7fq r0 = X.C337187fq.A00
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 == 0) goto L_0x009a
            java.lang.Object r1 = r13.A03
            X.6hr r1 = (X.C314226hr) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L_0x0094:
            X.C314226hr.A0H(r1, r0, r7)
        L_0x0097:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x009a:
            X.7fo r0 = X.C337167fo.A00
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 == 0) goto L_0x0097
            java.lang.Object r1 = r13.A03
            X.6hr r1 = (X.C314226hr) r1
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0094
        L_0x00ac:
            X.0eS.A00(r14)
            X.6ny r6 = X.C317866ny.AQR
            java.lang.Object r5 = r13.A03
            X.6hr r5 = (X.C314226hr) r5
            com.instagram.common.session.UserSession r4 = r5.A0F
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319643614322224(0x81088600001e30, double:3.0320270969390155E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0097
            X.0eM r0 = r5.A0a
            java.lang.Object r1 = r0.getValue()
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r1 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r1
            java.lang.Object r0 = r13.A02
            X.6nw r0 = (X.C317846nw) r0
            r13.A00 = r7
            java.lang.Object r14 = r1.A02(r0, r6, r13, r7)
            if (r14 != r2) goto L_0x0080
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9K9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
