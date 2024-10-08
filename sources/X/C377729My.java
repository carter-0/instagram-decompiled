package X;

/* renamed from: X.9My  reason: invalid class name and case insensitive filesystem */
public final class C377729My extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377729My(Object obj, Object obj2, Object obj3, String str, int i) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01be, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x00fe;
                case 2: goto L_0x0143;
                case 3: goto L_0x0165;
                case 4: goto L_0x01bf;
                case 5: goto L_0x008d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r10 = r11.A01
            X.3Id r10 = (X.C239783Id) r10
            java.util.List r0 = r10.BG8()
            r6 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.Object r9 = r11.A02
            X.0r1 r9 = (X.0r1) r9
            java.lang.Object r8 = r11.A03
            X.1Ck r8 = (X.1Ck) r8
            java.lang.String r7 = r11.A04
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L_0x001f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r3 = r5.next()
            int r2 = r4 + 1
            if (r4 < 0) goto L_0x00f6
            com.instagram.common.typedurl.ImageUrlBase r3 = (com.instagram.common.typedurl.ImageUrlBase) r3
            r1 = 0
            if (r4 != 0) goto L_0x0033
            r1 = 1
        L_0x0033:
            r0 = 0
            boolean r0 = X.1Ck.A00(r3, r8, r7, r0, r1)
            r9.A00 = r0
            r4 = r2
            goto L_0x001f
        L_0x003c:
            java.util.List r0 = r10.CE3()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r5 = r11.A02
            X.0r1 r5 = (X.0r1) r5
            java.lang.Object r4 = r11.A03
            X.1Ck r4 = (X.1Ck) r4
            java.lang.String r3 = r11.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r0 = r2.next()
            int r1 = r6 + 1
            if (r6 < 0) goto L_0x00f6
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = X.1Ck.A01(r0, r4, r3, r6)
            r5.A00 = r0
            r6 = r1
            goto L_0x0050
        L_0x0068:
            java.lang.Object r0 = r11.A03
            java.util.List r6 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r6)
            java.lang.Object r3 = r11.A02
            X.385 r3 = (X.AnonymousClass385) r3
            java.lang.String r5 = r11.A04
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r7 = 0
            X.SSM r2 = new X.SSM
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r1 = r11.A01
            X.9Ep r1 = (X.C375679Ep) r1
            X.TL8 r0 = new X.TL8
            r0.<init>(r1, r2)
            r0.run()
            goto L_0x01bc
        L_0x008d:
            java.lang.Object r0 = r11.A01
            X.3Id r0 = (X.C239783Id) r0
            java.util.List r0 = r0.BPh()
            if (r0 == 0) goto L_0x01bc
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r1.next()
            X.DSg r0 = (X.C46251DSg) r0
            java.util.List r0 = r0.Bni()
            if (r0 != 0) goto L_0x00b4
            X.0sn r0 = X.0sn.A00
        L_0x00b4:
            X.018.A16(r0, r2)
            goto L_0x00a0
        L_0x00b8:
            java.lang.Object r9 = r11.A02
            X.0r1 r9 = (X.0r1) r9
            java.lang.Object r8 = r11.A03
            X.1Ck r8 = (X.1Ck) r8
            java.lang.String r7 = r11.A04
            java.util.Iterator r6 = r2.iterator()
            r5 = 0
        L_0x00c7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r4 = r6.next()
            int r3 = r5 + 1
            if (r5 < 0) goto L_0x00f6
            X.DTI r4 = (X.DTI) r4
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r4.BFv()
            if (r2 == 0) goto L_0x00e8
            r1 = 0
            if (r5 != 0) goto L_0x00e1
            r1 = 1
        L_0x00e1:
            r0 = 0
            boolean r0 = X.1Ck.A00(r2, r8, r7, r0, r1)
            r9.A00 = r0
        L_0x00e8:
            X.1Xj r0 = r4.CDp()
            if (r0 == 0) goto L_0x00f4
            boolean r0 = X.1Ck.A01(r0, r8, r7, r5)
            r9.A00 = r0
        L_0x00f4:
            r5 = r3
            goto L_0x00c7
        L_0x00f6:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fe:
            java.lang.Object r5 = r11.A03
            com.instagram.common.uigraph.UiGraph r5 = (com.instagram.common.uigraph.UiGraph) r5
            java.util.Map r6 = r5.A04
            java.lang.String r4 = r11.A04
            boolean r0 = r6.containsKey(r4)
            if (r0 == 0) goto L_0x0128
            r2 = 1
            r1 = 22
            X.9Mm r0 = new X.9Mm
            r0.<init>(r4, r5, r1)
            com.instagram.common.uigraph.UiGraph.A00(r5, r0, r2)
        L_0x0117:
            java.lang.Object r3 = r11.A01
            r2 = 1
            X.0qQ.A0B(r3, r2)
            r1 = 7
            X.9Mu r0 = new X.9Mu
            r0.<init>(r5, r3, r4, r1)
            com.instagram.common.uigraph.UiGraph.A00(r5, r0, r2)
            goto L_0x01bc
        L_0x0128:
            X.Tnz r3 = r5.A02
            X.0fA r2 = r5.A03
            java.lang.Object r1 = r11.A02
            X.0sP r1 = (X.0sP) r1
            X.3Vc r0 = new X.3Vc
            r0.<init>(r3, r2, r1)
            monitor-enter(r6)
            r6.put(r4, r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            X.0V2 r0 = r5.A09
            r0.FIA(r4)
            goto L_0x0117
        L_0x0140:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0143:
            java.lang.Object r0 = r11.A02
            X.A7s r0 = (X.C39752A7s) r0
            android.widget.ImageView r1 = r0.A06
            if (r1 == 0) goto L_0x0150
            r0 = 8
            r1.setVisibility(r0)
        L_0x0150:
            java.lang.Object r0 = r11.A01
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            java.lang.Object r0 = r11.A03
            X.7NJ r0 = (X.AnonymousClass7NJ) r0
            X.7NL r0 = r0.A01
            java.lang.String r1 = r11.A04
            java.util.Set r0 = r0.A00
            r0.remove(r1)
            goto L_0x01bc
        L_0x0165:
            java.lang.Object r0 = r11.A02
            X.6ST r0 = (X.AnonymousClass6ST) r0
            X.AnonymousClass3YV.A05(r0)
            X.1xC r3 = X.1xC.A01
            X.6ap r1 = new X.6ap
            r1.<init>()
            java.lang.String r0 = r11.A04
            r1.A0D = r0
            java.lang.Object r2 = r11.A01
            X.1Xj r2 = (X.1Xj) r2
            com.instagram.common.typedurl.ImageUrl r0 = r2.A1Q()
            r1.A09 = r0
            r1.A03()
            X.Dc2 r1 = r1.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            r3.A00(r0)
            java.lang.Object r4 = r11.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            com.instagram.user.model.User r0 = r2.A2A(r4)
            if (r0 == 0) goto L_0x01ac
            java.lang.String r3 = r0.getId()
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            X.5m9 r1 = X.C294255m9.A04
            X.6uk r0 = new X.6uk
            r0.<init>(r1, r3)
            r2.A00(r0)
        L_0x01ac:
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r4)
            java.lang.String r2 = r4.A06
            X.5m9 r1 = X.C294255m9.A04
            X.6uk r0 = new X.6uk
            r0.<init>(r1, r2)
            r3.A00(r0)
        L_0x01bc:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x01bf:
            java.lang.String r5 = r11.A04
            java.lang.Object r4 = r11.A02
            X.5KJ r4 = (X.AnonymousClass5KJ) r4
            java.lang.Object r0 = r11.A03
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r3 = r11.A01
            java.lang.Object r2 = r0.invoke(r3)
            java.util.List r2 = (java.util.List) r2
            r0 = 7
            X.Iw3 r1 = new X.Iw3
            r1.<init>(r5, r3, r0)
            r0 = 4
            X.5KY r0 = X.AnonymousClass5KP.A00(r4, r2, r1, r0)
            X.5KZ r1 = new X.5KZ
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377729My.invoke():java.lang.Object");
    }
}
