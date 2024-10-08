package X;

/* renamed from: X.PmT  reason: case insensitive filesystem */
public final class C73949PmT extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73949PmT(Object obj, Object obj2, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.N3k] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0413, code lost:
        r3.Epw(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0642, code lost:
        r1.CfA((X.0sP) null, r6, X.AnonymousClass5PI.A02(r2), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x07bd, code lost:
        r4.A06(r2, r3);
        r1.A0N(r4, "event_payload");
        X.C51969G9p.A1G(r1, r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x07ca, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x07f7, code lost:
        r3 = (X.QNI) r0.A01;
        r3.A07((java.lang.String) r1.A00, X.Pxd.A00(841));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0810, code lost:
        return r5.A00((X.S4g) r4, r3, r0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0104, code lost:
        r3.DvU(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x018f, code lost:
        r3.invoke(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x022f, code lost:
        X.C333717a0.A02(r5, r0, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x032f, code lost:
        if (r6.A07 != r2) goto L_0x0331;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x0792;
                case 1: goto L_0x07a8;
                case 2: goto L_0x07cb;
                case 3: goto L_0x0019;
                case 4: goto L_0x07e6;
                case 5: goto L_0x005b;
                case 6: goto L_0x0811;
                case 7: goto L_0x00bb;
                case 8: goto L_0x00db;
                case 9: goto L_0x00f0;
                case 10: goto L_0x0109;
                case 11: goto L_0x0109;
                case 12: goto L_0x0125;
                case 13: goto L_0x014a;
                case 14: goto L_0x016b;
                case 15: goto L_0x0180;
                case 16: goto L_0x0194;
                case 17: goto L_0x01ec;
                case 18: goto L_0x020e;
                case 19: goto L_0x0234;
                case 20: goto L_0x028a;
                case 21: goto L_0x028a;
                case 22: goto L_0x02a8;
                case 23: goto L_0x0379;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x039c;
                case 27: goto L_0x03c9;
                case 28: goto L_0x0418;
                case 29: goto L_0x0432;
                case 30: goto L_0x04a8;
                case 31: goto L_0x083a;
                case 32: goto L_0x04be;
                case 33: goto L_0x054f;
                case 34: goto L_0x0577;
                case 35: goto L_0x05b2;
                case 36: goto L_0x0621;
                case 37: goto L_0x064c;
                case 38: goto L_0x084d;
                case 39: goto L_0x0865;
                case 40: goto L_0x067f;
                case 41: goto L_0x06ab;
                case 42: goto L_0x06f7;
                case 43: goto L_0x0722;
                case 44: goto L_0x0741;
                case 45: goto L_0x08e5;
                case 46: goto L_0x0766;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r0.A02
            X.F3u r2 = (X.C49729F3u) r2
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r0.A03
            r2.A05(r1, r0)
        L_0x0016:
            X.0gF r1 = X.C60340gF.A00
        L_0x0018:
            return r1
        L_0x0019:
            java.lang.String r2 = X.C41847B3o.A1E(r1)
            java.lang.String r8 = r0.A03
            if (r8 == 0) goto L_0x0016
            java.lang.Object r7 = r0.A02
            com.facebookpay.offsite.base.CheckoutHandler r7 = (com.facebookpay.offsite.base.CheckoutHandler) r7
            X.OV5 r1 = r7.A0T
            com.facebookpay.offsite.models.message.OffsiteData r6 = new com.facebookpay.offsite.models.message.OffsiteData
            r6.<init>(r2)
            android.util.LruCache r5 = r1.A00
            int r2 = r5.size()
            r1 = 20
            if (r2 != r1) goto L_0x003b
            r1 = 10
            r5.trimToSize(r1)
        L_0x003b:
            X.ONC r4 = new X.ONC
            r4.<init>(r8)
            long r2 = java.lang.System.currentTimeMillis()
            X.ONO r1 = new X.ONO
            r1.<init>(r6, r2)
            r5.put(r4, r1)
            X.REu r1 = X.C8902REu.CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_SUCCESS
            java.lang.Object r0 = r0.A01
            java.util.Map r0 = (java.util.Map) r0
            r7.A0H(r1, r0)
            X.2Fj r0 = r7.A0O
            r0.A0A(r8)
            goto L_0x0016
        L_0x005b:
            X.SUj r1 = (X.SUj) r1
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r2 = r0.A02
            X.2gB r2 = (X.AnonymousClass2gB) r2
            java.lang.Object r1 = r2.A02()
            X.SUj r1 = (X.SUj) r1
            boolean r1 = X.SUj.A0V(r1)
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r1 = r2.A02()
            X.SUj r1 = (X.SUj) r1
            java.lang.Object r5 = r1.A01
            r5.getClass()
            X.SJH r5 = (X.SJH) r5
            java.util.List r4 = r5.A02
            java.lang.String r3 = r0.A03
            X.Pqd r1 = X.C74197Pqd.A00
            java.util.List r9 = X.C11296SKe.A01(r3, r4, r1)
            java.util.List r10 = r5.A04
            java.util.List r11 = r5.A03
            java.util.List r12 = r5.A01
            X.QSO r6 = r5.A00
            r7 = 0
            boolean r14 = r5.A09
            boolean r15 = r5.A08
            java.lang.String r8 = r5.A06
            java.util.List r13 = r5.A07
            X.SJH r5 = new X.SJH
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.SUj r1 = X.SUj.A09(r5)
            r2.A0B(r1)
        L_0x00a7:
            java.lang.Object r0 = r0.A01
            X.2Fk r0 = (X.2Fk) r0
            r2.A0D(r0)
            goto L_0x0016
        L_0x00b0:
            boolean r1 = X.SUj.A0S(r1)
            if (r1 == 0) goto L_0x0016
            java.lang.Object r2 = r0.A02
            X.2gB r2 = (X.AnonymousClass2gB) r2
            goto L_0x00a7
        L_0x00bb:
            java.lang.Object r1 = r0.A01
            X.Xzg r1 = (X.C22331Xzg) r1
            java.lang.String r3 = r0.A03
            java.lang.Object r0 = r0.A02
            X.4gU r0 = (X.C270284gU) r0
            java.lang.Object r0 = r0.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            boolean r0 = r0.A0D
            r10 = r0 ^ 1
            r2 = 0
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r1.DNV(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0016
        L_0x00db:
            X.5vR r1 = (X.C299585vR) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A01
            X.5vd r3 = (X.C299665vd) r3
            java.lang.String r2 = r0.A03
            java.lang.Object r0 = r0.A02
            X.5vQ r0 = (X.C299575vQ) r0
            X.6Cw r0 = (X.C304286Cw) r0
            int r0 = r0.A00
            goto L_0x0104
        L_0x00f0:
            X.5vR r1 = (X.C299585vR) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A01
            X.5vd r3 = (X.C299665vd) r3
            java.lang.String r2 = r0.A03
            java.lang.Object r0 = r0.A02
            X.5vQ r0 = (X.C299575vQ) r0
            X.6Cy r0 = (X.C304306Cy) r0
            int r0 = r0.A00
        L_0x0104:
            r3.DvU(r1, r2, r0)
            goto L_0x0016
        L_0x0109:
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r2 = r0.A02
            X.5V6 r2 = (X.AnonymousClass5V6) r2
            X.5V5 r2 = (X.AnonymousClass5V5) r2
            android.view.View r2 = r2.A00
            r2.performHapticFeedback(r3)
            java.lang.Object r2 = r0.A01
            X.5vd r2 = (X.C299665vd) r2
            java.lang.String r0 = r0.A03
            r2.DbP(r0, r1)
            goto L_0x0016
        L_0x0125:
            int r3 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Object r2 = r0.A01
            X.5Tq r2 = (X.C286025Tq) r2
            java.lang.String r1 = "learn_more_span"
            java.util.List r1 = r2.A06(r1, r3, r3)
            java.lang.Object r1 = X.00k.A0J(r1)
            X.62b r1 = (X.C3022062b) r1
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r1.A02
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r0.A03
            r1.invoke(r0)
            goto L_0x0016
        L_0x014a:
            X.62f r1 = (X.C3022462f) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.String r4 = r0.A03
            if (r4 == 0) goto L_0x0016
            java.lang.Object r3 = r0.A02
            X.5ZB r3 = (X.AnonymousClass5ZB) r3
            java.lang.Object r2 = r0.A01
            X.5Oz r2 = (X.C284945Oz) r2
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0016
            X.5Tq r0 = X.C303866Bc.A01(r3, r4)
            r2.Epw(r0)
            goto L_0x0016
        L_0x016b:
            int r4 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Object r3 = r0.A01
            X.0sK r3 = (X.0sK) r3
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r0.A02
            X.Gle r0 = (X.C53292Gle) r0
            java.lang.String r2 = r0.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x018f
        L_0x0180:
            X.C51965G9l.A1U(r1)
            java.lang.Object r3 = r0.A02
            X.0sK r3 = (X.0sK) r3
            java.lang.Object r1 = r0.A01
            java.lang.String r2 = r0.A03
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
        L_0x018f:
            r3.invoke(r1, r2, r0)
            goto L_0x0016
        L_0x0194:
            X.2WA r1 = (X.AnonymousClass2WA) r1
            r12 = 0
            X.0qQ.A0B(r1, r12)
            java.lang.Object r4 = r0.A02
            X.7fJ r4 = (X.C336867fJ) r4
            java.lang.Object r2 = r0.A01
            X.2Wb r2 = (X.2Wb) r2
            android.content.Context r3 = X.C243803a8.A00(r2)
            java.lang.String r5 = r0.A03
            android.view.View r2 = r1.A00
            X.0qQ.A06(r2)
            X.2WX r0 = X.C336867fJ.A0F
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = 2131972799(0x7f1352bf, float:1.9582616E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r3, r0)
            r0 = 2131238955(0x7f08202b, float:1.8094203E38)
            android.graphics.drawable.Drawable r7 = r3.getDrawable(r0)
            r0 = 2
            X.PHP r9 = new X.PHP
            r9.<init>(r3, r4, r5, r0)
            r6 = 0
            r18 = 1
            X.8rI r5 = new X.8rI
            r8 = r6
            r10 = r6
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.add(r5)
            com.instagram.common.session.UserSession r0 = r4.A03
            X.8Ov r0 = X.C66581MXm.A0c(r3, r0, r6, r1, r12)
            r0.showAsDropDown(r2)
            goto L_0x0016
        L_0x01ec:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r5 = r0.A01
            X.7a0 r5 = (X.C333717a0) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            X.AnonymousClass7TG.A1N(r4, r3)
            if (r1 == 0) goto L_0x020b
            X.02m r2 = X.C51965G9l.A0l()
            r1 = 309476254(0x12723b9e, float:7.643522E-28)
            java.lang.String r0 = "block_account_screen_cancel_click"
            r2.markerPoint(r1, r0)
        L_0x020b:
            java.lang.String r0 = "block_accounts_cancel"
            goto L_0x022f
        L_0x020e:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r5 = r0.A01
            X.7a0 r5 = (X.C333717a0) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            X.AnonymousClass7TG.A1N(r4, r3)
            if (r1 == 0) goto L_0x022d
            X.02m r2 = X.C51965G9l.A0l()
            r1 = 309476254(0x12723b9e, float:7.643522E-28)
            java.lang.String r0 = "restrict_account_screen_cancel_click"
            r2.markerPoint(r1, r0)
        L_0x022d:
            java.lang.String r0 = "restrict_accounts_cancel"
        L_0x022f:
            X.C333717a0.A02(r5, r0, r4, r3)
            goto L_0x0016
        L_0x0234:
            X.7aH r1 = (X.C333867aH) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.String r5 = r0.A03
            java.lang.Object r3 = r0.A01
            X.9JD r3 = (X.AnonymousClass9JD) r3
            java.lang.String r4 = r3.A03
            boolean r3 = X.0qQ.A0K(r5, r4)
            if (r3 == 0) goto L_0x0249
            r4 = 0
        L_0x0249:
            X.7dj r3 = X.C335067cK.A01(r1, r5, r4)
            if (r3 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            X.GgO r1 = (X.C52971GgO) r1
            X.7a3 r4 = r1.A09
            java.lang.String r7 = r3.A0K
            java.lang.String r8 = r3.A0J
            java.lang.String r9 = r3.A0N
            if (r9 != 0) goto L_0x025e
            r9 = r7
        L_0x025e:
            com.instagram.user.model.User r5 = r3.A0C
            java.lang.Long r6 = r3.A0I
            boolean r10 = r3.A0i
            X.7fs r0 = r3.A03
            r12 = 0
            boolean r11 = X.AnonymousClass7TF.A1V(r0)
            X.571 r0 = r3.A08
            if (r0 == 0) goto L_0x0270
            r12 = 1
        L_0x0270:
            r4.A03(r5, r6, r7, r8, r9, r10, r11, r12)
            X.05G r0 = r1.A0S
            r9 = 0
            java.util.UUID r8 = java.util.UUID.randomUUID()
            X.7d7 r6 = new X.7d7
            r11 = r2
            r6.<init>(r7, r8, r9, r11)
            r0.Epw(r6)
            X.05G r3 = r1.A0O
            X.7bn r1 = X.C334737bn.A00
            goto L_0x0413
        L_0x028a:
            X.2WA r1 = (X.AnonymousClass2WA) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r5 = r0.A02
            X.GOK r5 = (X.GOK) r5
            java.lang.Object r2 = r0.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            android.view.View r1 = r1.A00
            X.0qQ.A06(r1)
            java.lang.String r6 = r0.A03
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r4 = r5.A07
            com.instagram.common.session.UserSession r3 = r5.A04
            X.GOK.A00(r1, r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x02a8:
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            r12 = 0
            X.0qQ.A0B(r1, r12)
            java.lang.Object r2 = r0.A02
            X.Ab1 r2 = (X.C40368Ab1) r2
            X.8Cl r10 = r2.A07
            X.LD4 r11 = r2.A03
            android.content.Context r9 = r2.A01
            boolean r14 = r2.A0A
            java.lang.String r8 = r2.A09
            com.instagram.common.session.UserSession r7 = r2.A02
            java.lang.String r13 = r0.A03
            X.9cJ r6 = r2.A05
            java.lang.String r5 = r2.A08
            java.lang.Object r4 = r0.A01
            X.GnY r4 = (X.C53401GnY) r4
            X.A6R r3 = r2.A06
            boolean r2 = X.DbW.A1Y(r11)
            X.1ud r0 = X.1ua.A0G
            X.1ua r15 = r0.A01(r9, r7)
            com.instagram.model.direct.DirectShareTarget r0 = r11.A00
            if (r14 != 0) goto L_0x02f2
            boolean r16 = X.C59797JYq.A0G(r7, r0)
            if (r16 != 0) goto L_0x02f2
            r15.A0E(r1)
            r16 = r4
            r17 = r7
            r18 = r11
            r19 = r6
            r20 = r1
            r21 = r5
            r22 = r13
            X.C59797JYq.A0A(r16, r17, r18, r19, r20, r21, r22)
        L_0x02f2:
            java.lang.String r16 = "Required value was null."
            if (r14 == 0) goto L_0x034b
            boolean r5 = X.C59797JYq.A0I(r7, r8)
            if (r5 == 0) goto L_0x0319
            java.lang.String r2 = r1.A33
            if (r2 == 0) goto L_0x0016
            X.1pL r9 = X.C66551pM.A00()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r1.A13
            r13 = 0
            r17 = r1
            r18 = r2
            r19 = r12
            r15 = r6
            r16 = r3
            r14 = r11
            r12 = r7
            r11 = r0
            r10 = r4
            r9.EMG(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0016
        L_0x0319:
            if (r0 == 0) goto L_0x0920
            X.1pG r3 = X.AnonymousClass1pH.A00()
            X.Mew r3 = r3.E52(r7)
            X.7Z7 r11 = r3.A00(r0)
            r17 = 0
            if (r6 == 0) goto L_0x0331
            boolean r3 = r6.A07
            r20 = 1
            if (r3 == r2) goto L_0x0348
        L_0x0331:
            r20 = 0
            if (r6 != 0) goto L_0x0348
            r2 = 0
        L_0x0336:
            X.3tI r13 = X.C59797JYq.A00(r7, r6)
            r14 = r0
            r15 = r1
            r16 = r10
            r18 = r8
            r19 = r2
            r12 = r9
            r11.EMI(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0016
        L_0x0348:
            java.lang.String r2 = r6.A00
            goto L_0x0336
        L_0x034b:
            boolean r2 = r1.A5w
            if (r2 != 0) goto L_0x0374
            boolean r2 = X.C59797JYq.A0G(r7, r0)
            if (r2 == 0) goto L_0x0374
            if (r0 == 0) goto L_0x0925
            r15.A0E(r1)
            r16 = r4
            r17 = r7
            r18 = r11
            r19 = r6
            r20 = r1
            r21 = r5
            r22 = r13
            X.C59797JYq.A0A(r16, r17, r18, r19, r20, r21, r22)
            com.instagram.model.direct.DirectThreadKey r0 = r0.A00()
            X.C64008LIv.A00(r7, r0, r1, r15)
            goto L_0x0016
        L_0x0374:
            r15.A0B(r1)
            goto L_0x0016
        L_0x0379:
            X.6Gb r1 = (X.C305006Gb) r1
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.lang.Object r5 = r0.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A02
            X.0sP r3 = (X.0sP) r3
            X.Pnb r2 = X.C74010Pnb.A00
            int r7 = r5.size()
            r0 = 3
            X.J6k r6 = new X.J6k
            r6.<init>((int) r0, (java.util.List) r5, (X.0sP) r2)
            X.JJa r2 = new X.JJa
            r2.<init>(r4, r5, r3, r8)
            goto L_0x0642
        L_0x039c:
            X.QWO r1 = (X.QWO) r1
            r9 = 0
            X.0qQ.A0B(r1, r9)
            java.lang.Object r3 = r0.A02
            X.OZG r3 = (X.OZG) r3
            java.lang.String r6 = r0.A03
            X.OZG.A00(r3, r1, r6)
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            if (r4 == 0) goto L_0x0016
            java.lang.String r2 = "xfb_should_show_biig_ads_event_sharing_consent_at_thread_entry(business_ig_id:$business_ig_id,consumer_ig_id:$consumer_ig_id)"
            boolean r0 = r1.hasFieldValue(r2)
            if (r0 == 0) goto L_0x0016
            boolean r0 = r1.getCoercedBooleanField(r9, r2)
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r5 = r3.A01
            r8 = 0
            java.lang.String r7 = "DETECTED_OUTCOME_THREAD_ENTRY_ENTRYPOINT"
            X.OP2.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0016
        L_0x03c9:
            X.7aH r1 = (X.C333867aH) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.String r5 = r0.A03
            java.lang.Object r3 = r0.A01
            X.9JD r3 = (X.AnonymousClass9JD) r3
            java.lang.String r4 = r3.A03
            boolean r3 = X.0qQ.A0K(r5, r4)
            if (r3 == 0) goto L_0x03de
            r4 = 0
        L_0x03de:
            X.7dj r3 = X.C335067cK.A01(r1, r5, r4)
            if (r3 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            X.JjH r1 = (X.C60314JjH) r1
            X.7a3 r4 = r1.A04
            java.lang.String r7 = r3.A0K
            java.lang.String r8 = r3.A0J
            java.lang.String r9 = r3.A0N
            if (r9 != 0) goto L_0x03f3
            r9 = r7
        L_0x03f3:
            com.instagram.user.model.User r5 = r3.A0C
            java.lang.Long r6 = r3.A0I
            boolean r10 = r3.A0i
            X.7fs r0 = r3.A03
            r12 = 0
            boolean r11 = X.AnonymousClass7TF.A1V(r0)
            X.571 r0 = r3.A08
            if (r0 == 0) goto L_0x0405
            r12 = 1
        L_0x0405:
            r4.A03(r5, r6, r7, r8, r9, r10, r11, r12)
            X.05G r3 = r1.A0E
            java.util.UUID r0 = java.util.UUID.randomUUID()
            X.9cy r1 = new X.9cy
            r1.<init>(r7, r0, r2)
        L_0x0413:
            r3.Epw(r1)
            goto L_0x0016
        L_0x0418:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r0.A01
            X.OOB r4 = (X.OOB) r4
            java.lang.String r3 = r0.A03
            X.0qQ.A0A(r1)
            X.Njv r2 = X.C69356Njv.A07
            X.ObS r2 = r4.A05(r2, r3, r1)
            java.lang.Object r1 = r0.A02
            r0 = 16
            X.C71087ObS.A01(r2, r1, r0)
            goto L_0x0016
        L_0x0432:
            X.3lr r1 = (X.C250663lr) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.String r2 = "primary_family_device_id"
            java.lang.String r2 = r1.getOptionalStringField(r3, r2)
            if (r2 == 0) goto L_0x0488
            java.lang.String r1 = r0.A03
            boolean r2 = r2.equalsIgnoreCase(r1)
            java.lang.Object r5 = r0.A02
            X.OyT r5 = (X.C72203OyT) r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r5.A00 = r4
            X.0eM r1 = r5.A0F
            X.Mex r3 = X.C66580MXl.A0U(r1)
            boolean r1 = r3.A0G()
            if (r1 == 0) goto L_0x046d
            if (r2 == 0) goto L_0x0485
            java.lang.String r2 = "YES"
        L_0x0460:
            java.lang.String r1 = "PRIMARY_DEVICE"
            r3.A0D(r1, r2)
            java.lang.String r1 = "DATA_RETRIEVAL_SUCCESS"
            r3.A0B(r1)
            r3.A08()
        L_0x046d:
            X.0eM r1 = r5.A0D
            X.Mex r3 = X.C66580MXl.A0U(r1)
            java.lang.String r2 = "V3_PRIMARY_DEVICE_API_CALL"
            boolean r1 = r3.A0G()
            if (r1 == 0) goto L_0x047e
            r3.A0B(r2)
        L_0x047e:
            java.lang.Object r0 = r0.A01
            X.C51965G9l.A1W(r0, r4)
            goto L_0x0016
        L_0x0485:
            java.lang.String r2 = "NO"
            goto L_0x0460
        L_0x0488:
            java.lang.Object r0 = r0.A02
            X.OyT r0 = (X.C72203OyT) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r2 = r0.getValue()
            X.NUL r2 = (X.NUL) r2
            java.lang.String r1 = "Graphql primaryDeviceId is null"
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "DATA_RETRIEVAL_FAIL"
            r2.A0B(r0)
            java.lang.String r0 = "FAILURE_REASON"
            X.C66913Mex.A04(r2, r0, r1)
            goto L_0x0016
        L_0x04a8:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r4 = r0.A02
            X.6ap r4 = (X.C310336ap) r4
            java.lang.Object r3 = r0.A01
            X.OJa r3 = (X.OJa) r3
            java.lang.String r2 = r0.A03
            X.PbG r0 = new X.PbG
            r0.<init>(r3, r4, r1, r2)
            X.11Z.A02(r0)
            goto L_0x0016
        L_0x04be:
            X.EVJ r1 = (X.EVJ) r1
            if (r1 == 0) goto L_0x0016
            int r2 = r1.ordinal()
            r8 = 0
            if (r2 == r8) goto L_0x0530
            r1 = 1
            if (r2 == r1) goto L_0x0512
            r1 = 2
            if (r2 == r1) goto L_0x0504
            r1 = 3
            if (r2 != r1) goto L_0x0016
            java.lang.Object r4 = r0.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r0.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.0cT r0 = com.instagram.direct.stella.permission.StellaPermissionActivity.A01
            X.0wW r0 = X.DbS.A0S(r4)
            com.instagram.common.session.UserSession r3 = X.0Gl.A01(r0)
            if (r3 == 0) goto L_0x0501
            X.0Tu r2 = X.0Tu.A05
            r0 = 36888494852801318(0x830de400000326, double:3.3917709107332766E-306)
            java.lang.String r7 = X.182.A04(r2, r3, r0)
        L_0x04f1:
            X.2EG r6 = X.2EG.A3P
            X.SUL r3 = new X.SUL
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r0 = "smart_glasses_provider_linking"
            r3.A0S = r0
            r3.A0A()
            goto L_0x0016
        L_0x0501:
            java.lang.String r7 = "https://www.meta.com/help/435816818859195"
            goto L_0x04f1
        L_0x0504:
            java.lang.Object r3 = r0.A02
            android.app.Activity r3 = (android.app.Activity) r3
            X.0cT r0 = com.instagram.direct.stella.permission.StellaPermissionActivity.A01
            android.content.Intent r0 = X.DbS.A09()
            r3.setResult(r8, r0)
            goto L_0x052b
        L_0x0512:
            java.lang.Object r3 = r0.A02
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r1 = r0.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r2 = r1.A06
            java.lang.String r1 = r0.A03
            X.0cT r0 = com.instagram.direct.stella.permission.StellaPermissionActivity.A01
            X.O0B.A00(r2, r1)
            android.content.Intent r1 = X.DbS.A09()
            r0 = -1
            r3.setResult(r0, r1)
        L_0x052b:
            r3.finish()
            goto L_0x0016
        L_0x0530:
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0cT r0 = com.instagram.direct.stella.permission.StellaPermissionActivity.A01
            X.E0w r2 = new X.E0w
            r2.<init>()
            X.0hq r0 = r1.getSupportFragmentManager()
            X.0s1 r1 = new X.0s1
            r1.<init>(r0)
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            r1.A0A(r2, r0)
            r1.A00()
            goto L_0x0016
        L_0x054f:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r1 = (com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r4 = r0.A01
            java.lang.Object r5 = r0.A02
            java.lang.String r6 = r0.A03
            r7 = 0
            r8 = 22
            X.JaI r3 = new X.JaI
            r3.<init>(r4, r5, r6, r7, r8)
            X.FfX r2 = new X.FfX
            r2.<init>(r3)
            X.Exv r0 = new X.Exv
            r0.<init>(r2)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.A00(r0, r1)
            X.FfW r0 = X.C49853F9s.A07
            r1.A03(r0)
            goto L_0x0016
        L_0x0577:
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.String r3 = r0.A03
            int r1 = r3.length()
            boolean r2 = X.AnonymousClass7TF.A1Q(r1)
            r1 = 0
            if (r2 != 0) goto L_0x0594
            boolean r2 = X.00l.A0d(r5, r3, r4)
            if (r2 == 0) goto L_0x0594
            X.REf r1 = X.C8888REf.SESSION_TOKEN
            return r1
        L_0x0594:
            java.lang.Object r2 = r0.A01
            X.11S r2 = (X.11S) r2
            if (r2 == 0) goto L_0x05a3
            boolean r2 = r2.A07(r5)
            if (r2 == 0) goto L_0x05a3
            X.REf r1 = X.C8888REf.USER_ID
            return r1
        L_0x05a3:
            java.lang.Object r0 = r0.A02
            X.11S r0 = (X.11S) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A07(r5)
            if (r0 == 0) goto L_0x0018
            X.REf r1 = X.C8888REf.USERNAME
            return r1
        L_0x05b2:
            X.ONr r4 = X.C66581MXm.A0h(r1)
            java.lang.Object r5 = r0.A01
            X.PLA r5 = (X.PLA) r5
            boolean r1 = r5.A03
            java.lang.Integer r1 = X.JTP.A0j(r1)
            int r1 = r1.intValue()
            if (r1 == 0) goto L_0x061e
            java.lang.String r2 = "off"
        L_0x05c8:
            java.lang.String r1 = "camera_status"
            r4.A03(r1, r2)
            boolean r1 = r5.A04
            java.lang.Integer r1 = X.JTP.A0j(r1)
            int r1 = r1.intValue()
            if (r1 == 0) goto L_0x061b
            java.lang.String r2 = "off"
        L_0x05db:
            java.lang.String r1 = "microphone_status"
            r4.A03(r1, r2)
            java.lang.Object r3 = r0.A02
            X.Ods r3 = (X.C71142Ods) r3
            java.lang.Integer r1 = r3.A0L
            int r1 = r1.intValue()
            switch(r1) {
                case 0: goto L_0x0614;
                case 1: goto L_0x0611;
                default: goto L_0x05ed;
            }
        L_0x05ed:
            java.lang.String r2 = "backgrounded"
        L_0x05ef:
            java.lang.String r1 = "screen_mode"
            r4.A03(r1, r2)
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "action"
            r4.A03(r0, r1)
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x060e
            r0 = 0
        L_0x0600:
            java.lang.String r1 = "current_face_effect_id"
            r4.A03(r1, r0)
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "reason"
            r4.A03(r0, r1)
            goto L_0x0016
        L_0x060e:
            java.lang.String r0 = r3.A0M
            goto L_0x0600
        L_0x0611:
            java.lang.String r2 = "minimized"
            goto L_0x05ef
        L_0x0614:
            r1 = 290(0x122, float:4.06E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            goto L_0x05ef
        L_0x061b:
            java.lang.String r2 = "on"
            goto L_0x05db
        L_0x061e:
            java.lang.String r2 = "on"
            goto L_0x05c8
        L_0x0621:
            X.6Gb r1 = X.C51968G9o.A0L(r1)
            java.lang.Object r5 = r0.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A02
            X.0sP r3 = (X.0sP) r3
            X.Ppw r2 = X.C74155Ppw.A00
            int r7 = r5.size()
            r0 = 26
            X.PqS r6 = new X.PqS
            r6.<init>((int) r0, (java.util.List) r5, (X.0sP) r2)
            r0 = 1
            X.JJa r2 = new X.JJa
            r2.<init>(r4, r5, r3, r0)
        L_0x0642:
            X.5PJ r2 = X.AnonymousClass5PI.A02(r2)
            r0 = 0
            r1.CfA(r0, r6, r2, r7)
            goto L_0x0016
        L_0x064c:
            X.6Gb r8 = X.C51968G9o.A0L(r1)
            java.lang.Object r7 = r0.A02
            com.google.common.collect.ImmutableList r7 = (com.google.common.collect.ImmutableList) r7
            X.Ppx r2 = X.C74156Ppx.A00
            java.lang.String r6 = r0.A03
            java.lang.Object r5 = r0.A01
            X.0sP r5 = (X.0sP) r5
            X.Ppy r1 = X.C74157Ppy.A00
            int r4 = r7.size()
            r0 = 28
            X.PqS r3 = new X.PqS
            r3.<init>((int) r0, (java.util.List) r7, (X.0sP) r2)
            r0 = 29
            X.PqS r2 = new X.PqS
            r2.<init>((int) r0, (java.util.List) r7, (X.0sP) r1)
            r1 = 2
            X.JJa r0 = new X.JJa
            r0.<init>(r6, r7, r5, r1)
            X.5PJ r0 = X.AnonymousClass5PI.A02(r0)
            r8.CfA(r3, r2, r0, r4)
            goto L_0x0016
        L_0x067f:
            X.2WA r1 = (X.AnonymousClass2WA) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r6 = r0.A02
            X.GvQ r6 = (X.C53859GvQ) r6
            boolean r2 = r6.A09
            if (r2 != 0) goto L_0x069d
            java.lang.Object r5 = r0.A01
            X.2Wa r5 = (X.2Wa) r5
            java.lang.String r4 = r0.A03
            r3 = 10
            X.Iwc r2 = new X.Iwc
            r2.<init>(r4, r3)
            r5.A03(r2)
        L_0x069d:
            X.0sL r2 = r6.A08
            android.view.View r1 = r1.A00
            X.0qQ.A06(r1)
            java.lang.String r0 = r0.A03
            r2.invoke(r1, r0)
            goto L_0x0016
        L_0x06ab:
            X.IIT r1 = (X.IIT) r1
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.String r3 = r0.A03
            java.lang.Object r2 = r0.A02
            X.Guf r2 = (X.C53812Guf) r2
            java.lang.Integer r2 = r2.A04
            int r4 = r2.intValue()
            r6 = 0
            if (r4 != r5) goto L_0x06e3
            X.XSY r9 = X.XSY.BELLS_STACKED
            X.HOw r12 = X.C54691HOw.OUTLINE
            X.HOv r11 = X.C54690HOv.SIZE_24
            X.XRa r13 = X.C21255XRa.A1o
            X.IcM r8 = new X.IcM
            r10 = r6
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x06ce:
            r7 = r6
        L_0x06cf:
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            X.Gv9 r5 = new X.Gv9
            r9 = r6
            r10 = r3
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A00(r5)
            goto L_0x0016
        L_0x06e3:
            r8 = r6
            r2 = 1
            if (r4 != r2) goto L_0x06ce
            X.XSY r10 = X.XSY.CARET_RIGHT
            X.HOw r13 = X.C54691HOw.OUTLINE
            X.HOv r12 = X.C54690HOv.SIZE_24
            X.XRa r14 = X.C21255XRa.A1o
            X.IcM r7 = new X.IcM
            r9 = r7
            r11 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x06cf
        L_0x06f7:
            X.OFk r1 = (X.C70663OFk) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r4 = r0.A01
            X.HIO r4 = (X.HIO) r4
            java.lang.String r2 = r4.A00
            if (r2 != 0) goto L_0x0712
            java.lang.Object r2 = r0.A02
            X.I4d r2 = (X.C56604I4d) r2
            android.content.Context r3 = r2.A00
            r2 = 2131966342(0x7f133986, float:1.956952E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r2)
        L_0x0712:
            r1.A01 = r2
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1.A02 = r2
            java.lang.String r0 = r0.A03
            r1.A00 = r0
            X.0sa r0 = r4.A01
            r1.A03 = r0
            goto L_0x0016
        L_0x0722:
            int r3 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Object r2 = r0.A01
            X.5Tq r2 = (X.C286025Tq) r2
            java.lang.String r1 = r0.A03
            java.util.List r1 = r2.A06(r1, r3, r3)
            java.lang.Object r1 = X.00k.A0J(r1)
            if (r1 == 0) goto L_0x0016
            java.lang.Object r0 = r0.A02
            X.Psc r0 = (X.C74302Psc) r0
            if (r0 == 0) goto L_0x0016
            r0.Dwi()
            goto L_0x0016
        L_0x0741:
            X.I6E r5 = X.I6E.A00
            java.lang.Object r1 = r0.A02
            X.GHO r1 = (X.GHO) r1
            com.instagram.common.session.UserSession r4 = r1.A01
            X.4DU r3 = r1.A02
            X.4bN r1 = r1.A00
            X.1Xj r2 = r1.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r5.A03(r3, r4, r2, r1)
            java.lang.Object r1 = r0.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.2V1 r1 = r1.A05
            android.content.Context r1 = r1.A0C
            X.0qQ.A07(r1)
            java.lang.String r0 = r0.A03
            X.FH7.A03(r1, r0)
            goto L_0x0016
        L_0x0766:
            java.lang.Object r6 = r0.A02
            X.GwV r6 = (X.C53925GwV) r6
            com.instagram.common.session.UserSession r1 = r6.A02
            X.Hqf r5 = X.C55252Heh.A00(r1)
            java.lang.Object r4 = r0.A01
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            android.content.Context r3 = X.C243803a8.A00(r4)
            X.HJx r1 = r6.A03
            X.4bN r1 = r1.A06
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x0790
            java.lang.String r2 = r1.A30()
        L_0x0784:
            int r1 = r6.A00
            java.lang.String r0 = r0.A03
            r5.A00(r3, r2, r0, r1)
            X.C53925GwV.A05(r4, r6)
            goto L_0x0016
        L_0x0790:
            r2 = 0
            goto L_0x0784
        L_0x0792:
            X.1Ln r1 = (X.1Ln) r1
            X.N1A r4 = new X.N1A
            r4.<init>()
            java.lang.Object r2 = r0.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r4, r2)
            X.C66582MXn.A1B(r4, r2)
            java.lang.String r3 = r0.A03
            java.lang.String r2 = "view_name"
            goto L_0x07bd
        L_0x07a8:
            X.1Ln r1 = (X.1Ln) r1
            X.N16 r4 = new X.N16
            r4.<init>()
            java.lang.Object r2 = r0.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r4, r2)
            X.C66582MXn.A1B(r4, r2)
            java.lang.String r3 = r0.A03
            java.lang.String r2 = "target_name"
        L_0x07bd:
            r4.A06(r2, r3)
            java.lang.String r2 = "event_payload"
            r1.A0N(r4, r2)
            java.lang.Object r0 = r0.A01
            X.C51969G9p.A1G(r1, r0)
            return r1
        L_0x07cb:
            X.34S r1 = (X.AnonymousClass34S) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.SNY r2 = (X.SNY) r2
            X.0eM r2 = r2.A02
            java.lang.Object r5 = r2.getValue()
            X.S0b r5 = (X.C10901S0b) r5
            java.lang.Object r4 = r1.A01
            if (r4 != 0) goto L_0x07f7
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x07e6:
            X.34S r1 = (X.AnonymousClass34S) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.Stc r2 = (X.Stc) r2
            X.S0b r5 = r2.A03
            java.lang.Object r4 = r1.A01
            X.0qQ.A06(r4)
        L_0x07f7:
            X.S4g r4 = (X.S4g) r4
            java.lang.Object r3 = r0.A01
            X.QNI r3 = (X.QNI) r3
            java.lang.Object r2 = r1.A00
            java.lang.String r2 = (java.lang.String) r2
            r1 = 841(0x349, float:1.178E-42)
            java.lang.String r1 = X.Pxd.A00(r1)
            r3.A07(r2, r1)
            java.lang.String r0 = r0.A03
            X.Qna r1 = r5.A00(r4, r3, r0)
            return r1
        L_0x0811:
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r2 = 0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = new com.instagram.igds.components.search.IgdsInlineSearchBox
            r1.<init>(r5, r2, r3)
            java.lang.String r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            r1.setHint((java.lang.String) r4)
            int r0 = X.DbV.A01(r5)
            r1.setSearchGlyphColor(r0)
            X.PHd r0 = new X.PHd
            r0.<init>(r3, r2)
            r1.A02 = r0
            return r1
        L_0x083a:
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            X.7SD r1 = (X.AnonymousClass7SD) r1
            java.lang.String r0 = r0.A03
            boolean r0 = X.C308556Us.A0A(r2, r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x084d:
            java.lang.String r2 = X.C41847B3o.A1E(r1)
            java.lang.String r1 = r0.A03
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x085c
            java.lang.Object r1 = r0.A02
            return r1
        L_0x085c:
            java.lang.Object r0 = r0.A01
            X.X9L r0 = (X.X9L) r0
            java.util.List r1 = r0.Bqs(r2)
            return r1
        L_0x0865:
            X.ULE r1 = (X.ULE) r1
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.lang.Object r5 = r0.A01
            X.JwH r5 = (X.C61079JwH) r5
            java.lang.String r6 = r0.A03
            java.lang.Object r4 = r0.A02
            X.68u r4 = (X.C3034368u) r4
            r9 = 1
            X.DbZ.A0t(r9, r5, r6, r4)
            java.util.List r3 = r1.A04
            java.util.Iterator r2 = r3.iterator()
            r7 = 0
        L_0x0880:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0897
            java.lang.Object r0 = r2.next()
            X.N3k r0 = (X.C68169N3k) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0898
            int r7 = r7 + 1
            goto L_0x0880
        L_0x0897:
            r7 = -1
        L_0x0898:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1D(r3)
            java.lang.Object r6 = r3.get(r7)
            X.N3k r6 = (X.C68169N3k) r6
            java.lang.String r3 = r5.A02
            java.lang.Object r0 = r5.A00
            java.util.HashMap r0 = (java.util.HashMap) r0
            X.0qQ.A0B(r3, r8)
            X.0qQ.A0B(r0, r9)
            X.JwH r2 = new X.JwH
            r2.<init>((X.C3034368u) r4, (java.lang.String) r3, (java.util.HashMap) r0)
            r0 = 479(0x1df, float:6.71E-43)
            X.ULy r5 = new X.ULy
            r5.<init>(r2, r0)
            com.instagram.api.schemas.ProductTaggingFeedComponentType r4 = r6.A02
            java.lang.String r3 = r6.A03
            int r2 = r6.A00
            X.0qQ.A0B(r4, r8)
            X.0qQ.A0B(r3, r9)
            X.N3k r0 = new X.N3k
            r0.<init>()
            r0.A02 = r4
            r0.A03 = r3
            r0.A00 = r2
            r0.A01 = r5
            r10.set(r7, r0)
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r8 = r1.A01
            X.Jw0 r7 = r1.A00
            java.util.List r11 = r1.A03
            boolean r12 = r1.A05
            java.lang.String r9 = r1.A02
            X.ULE r1 = X.ULE.A00(r7, r8, r9, r10, r11, r12)
            return r1
        L_0x08e5:
            X.2Uy r1 = (X.C70762Uy) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            android.view.MotionEvent r4 = r1.A00
            X.0qQ.A0A(r4)
            X.0qQ.A0B(r4, r2)
            int r2 = r4.getAction()
            if (r2 != 0) goto L_0x091e
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.util.List r2 = r3.A3Q()
            boolean r2 = X.AnonymousClass7TE.A1b(r2)
            if (r2 == 0) goto L_0x091e
            java.lang.Object r2 = r0.A02
            X.GHU r2 = (X.GHU) r2
            X.JTB r2 = r2.A07
            java.lang.String r0 = r0.A03
            android.view.View$OnTouchListener r2 = r2.Dlw(r3, r0)
            android.view.View r0 = r1.A01
            boolean r0 = r2.onTouch(r0, r4)
        L_0x0919:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x091e:
            r0 = 0
            goto L_0x0919
        L_0x0920:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0925:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73949PmT.invoke(java.lang.Object):java.lang.Object");
    }
}
