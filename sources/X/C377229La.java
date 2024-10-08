package X;

/* renamed from: X.9La  reason: invalid class name and case insensitive filesystem */
public final class C377229La extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377229La(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.2Dp, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x038c, code lost:
        r0 = r1.findViewById(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0391, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0397, code lost:
        return X.2b1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03e6, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0412, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36318307879491661L) != false) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0072, code lost:
        if (r4.A00(r5) == false) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0424, code lost:
        if (r0.A09 == null) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x048e, code lost:
        if (((java.lang.Boolean) r0.getValue()).booleanValue() == false) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0490, code lost:
        r0 = r1.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0494, code lost:
        if (r0 == false) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0498, code lost:
        r0 = ((java.lang.Boolean) r1.A01.getValue()).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04df, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f6, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05ec, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0117, code lost:
        if (X.182.A06(r3, r4, r1) == false) goto L_0x04f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0398;
                case 1: goto L_0x0040;
                case 2: goto L_0x0051;
                case 3: goto L_0x0076;
                case 4: goto L_0x0087;
                case 5: goto L_0x0093;
                case 6: goto L_0x00a4;
                case 7: goto L_0x00b0;
                case 8: goto L_0x00dd;
                case 9: goto L_0x011b;
                case 10: goto L_0x0127;
                case 11: goto L_0x0132;
                case 12: goto L_0x014a;
                case 13: goto L_0x0331;
                case 14: goto L_0x01a9;
                case 15: goto L_0x01c3;
                case 16: goto L_0x01f7;
                case 17: goto L_0x0215;
                case 18: goto L_0x0232;
                case 19: goto L_0x0267;
                case 20: goto L_0x02a8;
                case 21: goto L_0x02d1;
                case 22: goto L_0x0309;
                case 23: goto L_0x031c;
                case 24: goto L_0x0365;
                case 25: goto L_0x036d;
                case 26: goto L_0x0375;
                case 27: goto L_0x037d;
                case 28: goto L_0x0385;
                case 29: goto L_0x03a4;
                case 30: goto L_0x03af;
                case 31: goto L_0x03ba;
                case 32: goto L_0x03ca;
                case 33: goto L_0x03db;
                case 34: goto L_0x03e7;
                case 35: goto L_0x0419;
                case 36: goto L_0x04a5;
                case 37: goto L_0x0467;
                case 38: goto L_0x0476;
                case 39: goto L_0x04e1;
                case 40: goto L_0x04f7;
                case 41: goto L_0x0513;
                case 42: goto L_0x0523;
                case 43: goto L_0x0537;
                case 44: goto L_0x0553;
                case 45: goto L_0x0597;
                case 46: goto L_0x05f0;
                case 47: goto L_0x0605;
                case 48: goto L_0x0618;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A01
            X.2ED r4 = (X.2ED) r4
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Map r0 = r4.A0F
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03a3
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            X.1aU r1 = (X.1aU) r1
            X.0eM r0 = r4.A0H
            java.lang.Object r0 = r0.getValue()
            X.4fh r0 = (X.C269794fh) r0
            X.1aU r0 = r1.A0P(r0)
            r5.put(r2, r0)
            goto L_0x001a
        L_0x0040:
            java.lang.Object r3 = r3.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314906265455492(0x81043700010b84, double:3.0290311784399214E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x04f2
        L_0x0051:
            java.lang.Object r5 = r3.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            boolean r1 = X.AnonymousClass431.A01(r5)
            r0 = 0
            if (r1 == 0) goto L_0x04f2
            X.7QC r4 = X.AnonymousClass7QC.A00
            X.0qQ.A0B(r5, r0)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36313312832653173(0x8102c400020775, double:3.028023485119496E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            if (r1 == 0) goto L_0x04f2
            boolean r1 = r4.A00(r5)
            if (r1 != 0) goto L_0x04f2
            goto L_0x0496
        L_0x0076:
            java.lang.Object r3 = r3.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317070929040148(0x81062f00021314, double:3.0304001204072585E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x04f2
        L_0x0087:
            java.lang.Object r1 = r3.A01
            com.instagram.direct.capabilities.Capabilities r1 = (com.instagram.direct.capabilities.Capabilities) r1
            X.9Gx r0 = X.C376179Gx.RAVEN_VISUAL_MESSAGING
            boolean r0 = r1.A00(r0)
            goto L_0x04f2
        L_0x0093:
            java.lang.Object r3 = r3.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342154672778773187(0x20810144000002c3, double:4.058517290584503E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x04f2
        L_0x00a4:
            java.lang.Object r1 = r3.A01
            com.instagram.direct.capabilities.Capabilities r1 = (com.instagram.direct.capabilities.Capabilities) r1
            X.9Gx r0 = X.C376179Gx.STICKER
            boolean r0 = r1.A00(r0)
            goto L_0x04f2
        L_0x00b0:
            java.lang.Object r4 = r3.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r3.A01(r4)
            X.16V r2 = r0.A0J()
            X.16V r1 = X.16V.A05
            r0 = 0
            if (r2 != r1) goto L_0x04f2
            com.instagram.user.model.User r1 = r3.A01(r4)
            X.4Cl r1 = r1.A03
            java.lang.Boolean r1 = r1.CUy()
            if (r1 == 0) goto L_0x04f2
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x04f2
            X.0Tu r3 = X.0Tu.A05
            r1 = 36311027909984675(0x8100b0000101a3, double:3.026578490823293E-306)
            goto L_0x0113
        L_0x00dd:
            java.lang.Object r4 = r3.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = r0.A01(r4)
            X.16V r2 = r3.A0J()
            X.16V r1 = X.16V.A05
            r0 = 0
            if (r2 != r1) goto L_0x04f2
            X.4Cl r1 = r3.A03
            X.4os r3 = r1.AyK()
            if (r3 == 0) goto L_0x04f2
            com.instagram.api.schemas.ActionButtonPartnerType r2 = com.instagram.api.schemas.ActionButtonPartnerType.FBE
            com.instagram.api.schemas.ActionButtonPartnerType r1 = r3.Bap()
            if (r2 != r1) goto L_0x04f2
            java.lang.String r2 = r3.AmM()
            java.lang.String r1 = "book_now"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04f2
            X.0Tu r3 = X.0Tu.A05
            r1 = 36313768099055855(0x81032e000008ef, double:3.028311397425763E-306)
        L_0x0113:
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x04f2
            goto L_0x0496
        L_0x011b:
            java.lang.Object r1 = r3.A01
            com.instagram.direct.capabilities.Capabilities r1 = (com.instagram.direct.capabilities.Capabilities) r1
            X.9Gx r0 = X.C376179Gx.P2M_PAYMENT_REQUEST
            boolean r0 = r1.A00(r0)
            goto L_0x04f2
        L_0x0127:
            java.lang.Object r0 = r3.A01
            X.7Ki r0 = (X.C329817Ki) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.MYd r5 = X.AnonymousClass6FA.A00(r0)
            return r5
        L_0x0132:
            java.lang.Object r0 = r3.A01
            X.7Kf r0 = (X.C329787Kf) r0
            com.instagram.common.session.UserSession r10 = r0.A04
            android.app.Activity r6 = r0.A00
            android.content.Context r7 = r0.A01
            android.widget.FrameLayout r8 = r0.A02
            X.6iJ r11 = r0.A06
            X.0iw r9 = r0.A03
            java.lang.String r12 = r0.A0F
            X.7Kr r5 = new X.7Kr
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x014a:
            java.lang.Object r2 = r3.A01
            X.7Kf r2 = (X.C329787Kf) r2
            boolean r0 = r2.A0T
            if (r0 == 0) goto L_0x0363
            com.instagram.common.session.UserSession r9 = r2.A04
            android.content.Context r6 = r2.A01
            android.widget.FrameLayout r1 = r2.A02
            r0 = 2131430574(0x7f0b0cae, float:1.8482853E38)
            android.view.View r7 = r1.requireViewById(r0)
            X.0qQ.A07(r7)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            X.0iw r8 = r2.A03
            android.app.Activity r13 = r2.A00
            X.7Hr r10 = r2.A0C
            r0 = 2
            X.0qQ.A0B(r7, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36316435273748851(0x81059b00001173, double:3.029998129441464E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x01a3
            r0 = 36316435273814388(0x81059b00011174, double:3.02999812948291E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x01a3
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r0)
            X.0qQ.A07(r14)
            X.OZg r12 = new X.OZg
            r15 = r8
            r16 = r9
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r11.add(r12)
        L_0x01a3:
            X.7Kk r5 = new X.7Kk
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x01a9:
            java.lang.Object r2 = r3.A01
            X.7Kf r2 = (X.C329787Kf) r2
            android.widget.FrameLayout r1 = r2.A02
            r0 = 2131436204(0x7f0b22ac, float:1.8494272E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.7Hs r0 = r2.A0D
            X.OLs r5 = new X.OLs
            r5.<init>(r1, r0)
            return r5
        L_0x01c3:
            java.lang.Object r2 = r3.A01
            X.7Kf r2 = (X.C329787Kf) r2
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x0363
            java.util.Set r0 = X.C329867Kn.A0M
            android.content.Context r6 = r2.A01
            com.instagram.common.session.UserSession r9 = r2.A04
            X.0iw r8 = r2.A03
            android.widget.FrameLayout r1 = r2.A02
            r0 = 2131432326(0x7f0b1386, float:1.8486406E38)
            android.view.View r7 = r1.requireViewById(r0)
            X.0qQ.A07(r7)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            X.7Hq r10 = r2.A0B
            X.3t2 r0 = r2.A0E
            X.3t1 r11 = X.AnonymousClass6W3.A01(r0)
            X.0sa r0 = r2.A0R
            java.lang.Object r12 = r0.invoke()
            java.util.List r12 = (java.util.List) r12
            X.7Kn r5 = new X.7Kn
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x01f7:
            java.lang.Object r1 = r3.A01
            X.7Kf r1 = (X.C329787Kf) r1
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x0363
            android.content.Context r2 = r1.A01
            android.widget.FrameLayout r1 = r1.A02
            r0 = 2131435483(0x7f0b1fdb, float:1.849281E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.7Kq r5 = new X.7Kq
            r5.<init>(r2, r0)
            return r5
        L_0x0215:
            java.lang.Object r2 = r3.A01
            X.7Kf r2 = (X.C329787Kf) r2
            com.instagram.common.session.UserSession r8 = r2.A04
            android.widget.FrameLayout r1 = r2.A02
            r0 = 2131436230(0x7f0b22c6, float:1.8494325E38)
            android.view.View r6 = r1.findViewById(r0)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            X.0iw r7 = r2.A03
            X.7Wn r9 = r2.A07
            X.7Hn r10 = r2.A09
            X.7Kg r5 = new X.7Kg
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0232:
            java.lang.Object r2 = r3.A01
            X.7Kf r2 = (X.C329787Kf) r2
            android.widget.FrameLayout r1 = r2.A02
            r0 = 2131436235(0x7f0b22cb, float:1.8494335E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.0qQ.A07(r9)
            android.view.ViewStub r9 = (android.view.ViewStub) r9
            android.app.Activity r6 = r2.A00
            android.content.Context r0 = r2.A01
            android.content.Context r7 = r0.getApplicationContext()
            X.0qQ.A07(r7)
            com.instagram.common.session.UserSession r10 = r2.A04
            X.0sa r12 = r2.A0S
            X.7Ht r11 = r2.A08
            r0 = 2131436175(0x7f0b228f, float:1.8494213E38)
            android.view.View r8 = r1.requireViewById(r0)
            X.0qQ.A07(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            X.7Ko r5 = new X.7Ko
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x0267:
            java.lang.Object r2 = r3.A01
            X.7Kf r2 = (X.C329787Kf) r2
            boolean r0 = r2.A0Y
            if (r0 == 0) goto L_0x0363
            X.3t2 r1 = r2.A0E
            boolean r0 = X.AnonymousClass6W3.A08(r1)
            if (r0 == 0) goto L_0x0363
            X.3t1 r13 = X.AnonymousClass6W3.A01(r1)
            android.content.Context r7 = r2.A01
            com.instagram.common.session.UserSession r11 = r2.A04
            X.0iw r10 = r2.A03
            android.app.Activity r6 = r2.A00
            android.widget.FrameLayout r1 = r2.A02
            r0 = 2131442139(0x7f0b39db, float:1.850631E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.0qQ.A07(r9)
            android.view.ViewStub r9 = (android.view.ViewStub) r9
            X.7Hp r12 = r2.A0A
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r7)
            X.0qQ.A07(r8)
            X.0sa r0 = r2.A0R
            java.lang.Object r14 = r0.invoke()
            java.util.List r14 = (java.util.List) r14
            X.7Kl r5 = new X.7Kl
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L_0x02a8:
            java.lang.Object r4 = r3.A01
            X.7Kf r4 = (X.C329787Kf) r4
            com.instagram.common.session.UserSession r3 = r4.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326914993961034(0x810f230000384a, double:3.0366255467020946E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0363
            android.app.Activity r2 = r4.A00
            android.widget.FrameLayout r1 = r4.A02
            r0 = 2131432393(0x7f0b13c9, float:1.8486542E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.7Kj r5 = new X.7Kj
            r5.<init>(r2, r0, r3)
            return r5
        L_0x02d1:
            java.lang.Object r3 = r3.A01
            X.7Jr r3 = (X.C329647Jr) r3
            X.7Jt r2 = r3.A07
            boolean r0 = r2 instanceof X.AnonymousClass7K6
            r6 = 0
            if (r0 == 0) goto L_0x03e4
            X.7K6 r2 = (X.AnonymousClass7K6) r2
            if (r2 == 0) goto L_0x03e4
            X.7K7 r1 = r2.A00
            X.0sa r0 = r3.A0J
            java.lang.Object r5 = r0.invoke()
            java.lang.String r5 = (java.lang.String) r5
            r7 = 0
            r8 = 1
            X.7K7 r4 = new X.7K7
            r9 = r7
            r4.<init>(r5, r6, r7, r8, r9)
            X.9IV r0 = r3.A01
            java.lang.Object r0 = r0.A01
            X.7JZ r0 = (X.AnonymousClass7JZ) r0
            if (r0 == 0) goto L_0x0307
            X.75i r0 = r0.A01
        L_0x02fc:
            r2.A05(r0, r4)
            r2.A02()
            r2.A05(r6, r1)
            goto L_0x03e4
        L_0x0307:
            r0 = r6
            goto L_0x02fc
        L_0x0309:
            java.lang.Object r0 = r3.A01
            X.7Iy r0 = (X.C329457Iy) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            if (r0 == 0) goto L_0x0363
            android.view.View r5 = r0.getView()
            return r5
        L_0x031c:
            X.7J1 r2 = X.AnonymousClass7J1.A00
            java.lang.Object r1 = r3.A01
            X.7J4 r1 = (X.AnonymousClass7J4) r1
            com.instagram.common.session.UserSession r0 = r1.A03
            boolean r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0363
            X.7Io r0 = r1.A04
            android.view.View r5 = r0.Ajg()
            return r5
        L_0x0331:
            java.lang.Object r2 = r3.A01
            X.7Kf r2 = (X.C329787Kf) r2
            boolean r0 = r2.A0U
            if (r0 == 0) goto L_0x0363
            X.3t2 r0 = r2.A0E
            boolean r0 = X.AnonymousClass6W3.A08(r0)
            if (r0 == 0) goto L_0x0363
            java.lang.String r10 = r2.A0G
            boolean r0 = X.00l.A0W(r10)
            if (r0 != 0) goto L_0x0363
            com.instagram.common.typedurl.ImageUrl r9 = r2.A05
            android.widget.FrameLayout r1 = r2.A02
            r0 = 2131430654(0x7f0b0cfe, float:1.8483015E38)
            android.view.View r6 = r1.requireViewById(r0)
            X.0qQ.A07(r6)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            X.0iw r7 = r2.A03
            com.instagram.common.session.UserSession r8 = r2.A04
            X.7Km r5 = new X.7Km
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0363:
            r5 = 0
            return r5
        L_0x0365:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440519(0x7f0b3387, float:1.8503024E38)
            goto L_0x038c
        L_0x036d:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440520(0x7f0b3388, float:1.8503026E38)
            goto L_0x038c
        L_0x0375:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440521(0x7f0b3389, float:1.8503028E38)
            goto L_0x038c
        L_0x037d:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440527(0x7f0b338f, float:1.850304E38)
            goto L_0x038c
        L_0x0385:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440535(0x7f0b3397, float:1.8503056E38)
        L_0x038c:
            android.view.View r0 = r1.findViewById(r0)
            r5 = 0
            if (r0 == 0) goto L_0x03a3
            X.3oV r5 = X.2b1.A00(r0)
            return r5
        L_0x0398:
            java.lang.Object r0 = r3.A01
            X.1dx r0 = (X.1dx) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.A4A r5 = new X.A4A
            r5.<init>(r0)
        L_0x03a3:
            return r5
        L_0x03a4:
            java.lang.Object r0 = r3.A01
            X.7J3 r0 = (X.AnonymousClass7J3) r0
            X.7Io r0 = r0.A05
            android.view.View r5 = r0.Ajg()
            return r5
        L_0x03af:
            java.lang.Object r0 = r3.A01
            X.7J3 r0 = (X.AnonymousClass7J3) r0
            X.7Iq r0 = r0.A06
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r5 = r0.BZe()
            return r5
        L_0x03ba:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440513(0x7f0b3381, float:1.8503011E38)
            android.view.View r0 = r1.findViewById(r0)
            X.3oV r5 = X.2b1.A00(r0)
            return r5
        L_0x03ca:
            java.lang.Object r0 = r3.A01
            X.7KE r0 = (X.AnonymousClass7KE) r0
            X.0sP r0 = r0.A00
            r1 = 0
            java.lang.Object r0 = r0.invoke(r1)
            X.B2B r0 = (X.B2B) r0
            X.AnonymousClass7ON.A02(r1, r0)
            goto L_0x03e4
        L_0x03db:
            java.lang.Object r0 = r3.A01
            X.7KI r0 = (X.AnonymousClass7KI) r0
            X.0sa r0 = r0.A04
            r0.invoke()
        L_0x03e4:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x03e7:
            java.lang.Object r4 = r3.A01
            X.794 r4 = (X.AnonymousClass794) r4
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x04df
            X.7IJ r1 = r4.A00
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x04df
            X.3t2 r0 = r4.A04
            boolean r0 = r0 instanceof X.AnonymousClass9HR
            if (r0 == 0) goto L_0x0496
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0416
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318307879491661(0x81074f0000184d, double:3.031182372853595E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0416
            goto L_0x0496
        L_0x0416:
            boolean r0 = r4.A08
            goto L_0x0494
        L_0x0419:
            java.lang.Object r4 = r3.A01
            X.794 r4 = (X.AnonymousClass794) r4
            X.7Kg r0 = r4.A03
            if (r0 == 0) goto L_0x0426
            X.OHv r0 = r0.A09
            r1 = 1
            if (r0 != 0) goto L_0x0427
        L_0x0426:
            r1 = 0
        L_0x0427:
            r0 = 0
            if (r1 == 0) goto L_0x04f2
            X.7Rr r1 = r4.A02
            X.0eM r1 = r1.A0G
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x04f2
            boolean r1 = r4.A05()
            if (r1 == 0) goto L_0x04f2
            X.3t2 r1 = r4.A04
            boolean r1 = r1 instanceof X.AnonymousClass9HR
            X.7IJ r3 = r4.A00
            if (r1 == 0) goto L_0x0452
            X.2FW r0 = r4.A00()
            boolean r0 = r3.A01(r0)
            goto L_0x04f2
        L_0x0452:
            X.2FW r2 = r4.A00()
            boolean r1 = r4.A07
            if (r1 != 0) goto L_0x0460
            boolean r1 = r4.A01()
            if (r1 == 0) goto L_0x0461
        L_0x0460:
            r0 = 1
        L_0x0461:
            boolean r0 = r3.A02(r2, r0)
            goto L_0x04f2
        L_0x0467:
            java.lang.Object r1 = r3.A01
            X.795 r1 = (X.AnonymousClass795) r1
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0498
            X.7Rr r0 = r1.A02
            X.0eM r0 = r0.A06
            goto L_0x0484
        L_0x0476:
            java.lang.Object r1 = r3.A01
            X.795 r1 = (X.AnonymousClass795) r1
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0498
            X.7Rr r0 = r1.A02
            X.0eM r0 = r0.A0G
        L_0x0484:
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04df
            boolean r0 = r1.A05()
        L_0x0494:
            if (r0 == 0) goto L_0x04df
        L_0x0496:
            r0 = 1
            goto L_0x04f2
        L_0x0498:
            X.0eM r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x04f2
        L_0x04a5:
            java.lang.Object r5 = r3.A01
            X.795 r5 = (X.AnonymousClass795) r5
            X.7Kg r0 = r5.A03
            if (r0 == 0) goto L_0x04df
            X.OHv r0 = r0.A09
            if (r0 == 0) goto L_0x04df
            X.7Rr r0 = r5.A02
            X.0eM r0 = r0.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04df
            X.3t2 r0 = r5.A04
            boolean r0 = r0 instanceof X.AnonymousClass9HR
            X.7IK r4 = r5.A00
            X.2FW r3 = r5.A00()
            if (r0 == 0) goto L_0x04d2
            boolean r0 = r4.A01(r3)
            goto L_0x04f2
        L_0x04d2:
            boolean r2 = r5.A07
            X.0sa r1 = r5.A05
            boolean r0 = r5.A01()
            boolean r0 = r4.A02(r3, r1, r2, r0)
            goto L_0x04f2
        L_0x04df:
            r0 = 0
            goto L_0x04f2
        L_0x04e1:
            java.lang.Object r0 = r3.A01
            X.7Qp r0 = (X.C331337Qp) r0
            com.instagram.common.session.UserSession r3 = r0.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315795324866095(0x81050600130e2f, double:3.0295934231911416E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x04f2:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x04f7:
            java.lang.Object r2 = r3.A01
            X.7Ko r2 = (X.C329877Ko) r2
            X.0eM r0 = r2.A0A
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440710(0x7f0b3446, float:1.8503411E38)
            android.view.View r5 = r1.requireViewById(r0)
            X.0qQ.A07(r5)
            android.view.View$OnClickListener r0 = r2.A05
            X.AnonymousClass0fU.A00(r0, r5)
            return r5
        L_0x0513:
            java.lang.Object r0 = r3.A01
            X.7Ko r0 = (X.C329877Ko) r0
            android.view.ViewStub r0 = r0.A06
            android.view.View r5 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r5, r0)
            return r5
        L_0x0523:
            java.lang.Object r0 = r3.A01
            X.7Ko r0 = (X.C329877Ko) r0
            X.0eM r0 = r0.A0A
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440711(0x7f0b3447, float:1.8503413E38)
            android.view.View r5 = r1.requireViewById(r0)
            return r5
        L_0x0537:
            java.lang.Object r2 = r3.A01
            X.7Ko r2 = (X.C329877Ko) r2
            X.0eM r0 = r2.A0A
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440712(0x7f0b3448, float:1.8503415E38)
            android.view.View r5 = r1.requireViewById(r0)
            X.0qQ.A07(r5)
            android.view.View$OnClickListener r0 = r2.A05
            X.AnonymousClass0fU.A00(r0, r5)
            return r5
        L_0x0553:
            android.content.IntentFilter r0 = X.AnonymousClass439.A0I
            java.lang.Object r9 = r3.A01
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            android.content.Context r6 = X.C60960kU.A00
            X.0qQ.A07(r6)
            X.1Ng r7 = X.AnonymousClass1Nd.A00(r9)
            X.43A r0 = X.AnonymousClass43A.A00
            X.2Eo r1 = X.2Eo.A04
            X.43G r10 = X.AnonymousClass43B.A00(r9, r0, r1)
            X.43H r0 = X.AnonymousClass43H.A00
            X.43G r11 = X.AnonymousClass43B.A00(r9, r0, r1)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            X.2Eo[] r4 = X.2Eo.values()
            int r3 = r4.length
            r2 = 0
        L_0x057b:
            if (r2 >= r3) goto L_0x058b
            r1 = r4[r2]
            X.43I r0 = X.AnonymousClass43I.A00
            X.43G r0 = X.AnonymousClass43B.A00(r9, r0, r1)
            r13.put(r1, r0)
            int r2 = r2 + 1
            goto L_0x057b
        L_0x058b:
            X.14i r8 = X.14i.A08
            X.2Dm r12 = X.1bJ.A00(r9)
            X.439 r5 = new X.439
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x0597:
            java.lang.Object r7 = r3.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.util.List r11 = X.1bJ.A00
            X.2Dp r10 = new X.2Dp
            r10.<init>()
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = "DirectThreadStoreImpl.create"
            X.0lp r2 = X.0lq.A00(r0)
            android.content.Context r6 = X.C60960kU.A00     // Catch:{ all -> 0x05e9 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x05e9 }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x05e9 }
            r0 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            boolean r0 = X.182.A06(r3, r7, r0)     // Catch:{ all -> 0x05e9 }
            r9 = 0
            if (r0 == 0) goto L_0x05cf
            X.08y r0 = X.09i.A0A     // Catch:{ all -> 0x05e9 }
            boolean r0 = r0.A09(r7)     // Catch:{ all -> 0x05e9 }
            if (r0 == 0) goto L_0x05cf
            X.Pva r9 = X.C67252Mkm.A00(r7)     // Catch:{ all -> 0x05e9 }
        L_0x05cf:
            X.0nx r1 = X.C61610nw.A00()     // Catch:{ all -> 0x05e9 }
            java.lang.Class<X.1bC> r0 = X.1bC.class
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05e9 }
            r1.A01 = r0     // Catch:{ all -> 0x05e9 }
            X.0vF r8 = new X.0vF     // Catch:{ all -> 0x05e9 }
            r8.<init>(r1)     // Catch:{ all -> 0x05e9 }
            X.2Dr r5 = new X.2Dr     // Catch:{ all -> 0x05e9 }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x05e9 }
            r2.close()
            return r5
        L_0x05e9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05eb }
        L_0x05eb:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x05f0:
            X.438 r1 = X.AnonymousClass436.A00
            java.lang.Object r0 = r3.A01
            X.2ED r0 = (X.2ED) r0
            com.instagram.common.session.UserSession r0 = r0.A09
            X.435 r0 = r1.A00(r0)
            android.os.Looper r0 = r0.A02()
            X.4fh r5 = X.C318146oT.A00(r0)
            return r5
        L_0x0605:
            java.lang.Object r0 = r3.A01
            X.2ED r0 = (X.2ED) r0
            X.1aS r1 = r0.A06
            X.0eM r0 = r0.A0H
            java.lang.Object r0 = r0.getValue()
            X.4fh r0 = (X.C269794fh) r0
            X.1aU r5 = r1.A0P(r0)
            return r5
        L_0x0618:
            java.lang.Object r0 = r3.A01
            X.2ED r0 = (X.2ED) r0
            com.instagram.common.session.UserSession r2 = r0.A09
            java.lang.Class<X.436> r1 = X.AnonymousClass436.class
            X.437 r0 = X.AnonymousClass437.A00
            java.lang.Object r0 = r2.A01(r1, r0)
            X.435 r0 = (X.AnonymousClass435) r0
            android.os.Handler r5 = r0.A01()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377229La.invoke():java.lang.Object");
    }
}
