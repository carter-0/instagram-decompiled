package X;

/* renamed from: X.MHg  reason: case insensitive filesystem */
public final class C66190MHg extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66190MHg(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(3, r4);
        this.A04 = i;
        this.A03 = obj;
        this.A05 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        int i;
        C66190MHg mHg;
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj3;
        switch (this.A04) {
            case 0:
                mHg = new C66190MHg(r7, (C262224Cq) this.A05);
                mHg.A02 = obj;
                mHg.A03 = obj2;
                break;
            case 1:
                obj4 = this.A03;
                obj5 = null;
                i = 1;
                break;
            default:
                obj4 = this.A03;
                obj5 = this.A05;
                i = 2;
                break;
        }
        mHg = new C66190MHg(obj4, obj5, r7, i);
        mHg.A01 = obj;
        mHg.A02 = obj2;
        return mHg.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MHg, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
        X.0eS.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r10.A00 = 1;
        r0 = r3.emit(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r0 != r5) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r1 = r10.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r10.A00
            r6 = 1
            switch(r1) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0049;
                default: goto L_0x000a;
            }
        L_0x000a:
            if (r0 != 0) goto L_0x00a3
            X.0eS.A00(r11)
            java.lang.Object r3 = r10.A01
            X.02o r3 = (X.02o) r3
            java.lang.Object r2 = r10.A02
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = "IgDataStore"
            java.lang.String r0 = "IOException thrown when reading from DataStore"
            X.0KC.A0F(r1, r0, r2)
            X.0sm r1 = X.0Yt.A0E()
            r0 = 0
            r10.A01 = r0
        L_0x0029:
            r10.A00 = r6
            java.lang.Object r0 = r3.emit(r1, r10)
        L_0x002f:
            if (r0 != r5) goto L_0x00a6
            return r5
        L_0x0032:
            if (r0 != 0) goto L_0x00a3
            X.0eS.A00(r11)
            java.lang.Object r3 = r10.A02
            X.02o r3 = (X.02o) r3
            java.lang.Object r2 = r10.A03
            X.Hzs r2 = (X.C56521Hzs) r2
            java.lang.Object r0 = r10.A05
            X.4Cq r0 = (X.C262224Cq) r0
            X.L5k r1 = new X.L5k
            r1.<init>(r2, r0)
            goto L_0x0029
        L_0x0049:
            if (r0 != 0) goto L_0x00a3
            X.0eS.A00(r11)
            java.lang.Object r7 = r10.A01
            X.02o r7 = (X.02o) r7
            java.lang.Object r9 = r10.A02
            X.L5l r9 = (X.C63753L5l) r9
            java.lang.Object r8 = r10.A03
            androidx.paging.PageFetcher r8 = (androidx.paging.PageFetcher) r8
            androidx.paging.PageFetcherSnapshot r0 = r9.A00
            r3 = 0
            X.0r6 r2 = r0.A09
            r1 = 11
            X.JUv r0 = new X.JUv
            r0.<init>(r1, r3)
            X.0pz r4 = X.JTO.A1I(r0, r2)
            X.LNp r0 = r8.A01
            X.La8 r3 = new X.La8
            r3.<init>(r0, r8)
            androidx.paging.PageFetcherSnapshot r0 = r9.A00
            X.La5 r2 = new X.La5
            r2.<init>(r8, r0)
            X.MJb r1 = X.C66220MJb.A00
            X.Hzs r0 = new X.Hzs
            r0.<init>(r2, r3, r1, r4)
            r10.A00 = r6
            java.lang.Object r0 = r7.emit(r0, r10)
            goto L_0x002f
        L_0x0086:
            java.lang.Object r0 = r10.A03
            X.5KZ r0 = (X.AnonymousClass5KZ) r0
            java.lang.String r1 = r0.A01
            r0 = 2
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = "Error reading from DataStore: "
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.Kfm r1 = new X.Kfm
            r1.<init>(r0, r2)
            java.lang.Object r0 = r10.A05
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.2Og.A01(r1, r0)
            throw r1
        L_0x00a3:
            X.0eS.A00(r11)
        L_0x00a6:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66190MHg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66190MHg(AnonymousClass4D7 r3, C262224Cq r4) {
        super(3, r3);
        this.A04 = 0;
        this.A05 = r4;
        this.A01 = null;
    }
}
