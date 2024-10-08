package X;

import java.util.List;

/* renamed from: X.J6l  reason: case insensitive filesystem */
public final class C59103J6l extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59103J6l(int i, List list, 0sP r4) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 11:
            case 31:
            case 32:
                this.A01 = r4;
                this.A02 = list;
                break;
            default:
                this.A02 = r4;
                this.A01 = list;
                break;
        }
    }

    public static C59103J6l A00(C286575Wy r1, Object obj, Object obj2, int i) {
        C59103J6l j6l = new C59103J6l(i, obj, obj2);
        r1.FLL(j6l);
        return j6l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: X.5vk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v199, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v23 */
    /* JADX WARNING: type inference failed for: r3v79, types: [java.lang.Object, X.0Js] */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: type inference failed for: r11v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02bd, code lost:
        if (r4 != null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x071d, code lost:
        r2.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0797, code lost:
        return r1.invoke(X.C51966G9m.A19(r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x081e, code lost:
        if (X.C51966G9m.A1X(r1) == false) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0821, code lost:
        if (r2 == false) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0823, code lost:
        r2 = r6.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0825, code lost:
        if (r4 == false) goto L_0x0843;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0827, code lost:
        r1 = X.RDS.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0829, code lost:
        r2.A0B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x082c, code lost:
        if (r3 == false) goto L_0x083c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x082e, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0830, code lost:
        r6.A03 = r0;
        r5.A0B(X.RER.A03);
        X.C7421QCk.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x083c, code lost:
        r0 = r6.A02.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0843, code lost:
        r1 = X.RDS.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0846, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0bc7, code lost:
        if (X.QDN.A0X(X.S9Y.A01((X.C8924RFs) null, ((com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1).A04.A01, r2, r10, r3, r11, (java.lang.String) null), r6, r8, r9, r5) == false) goto L_0x0bc9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0bf3, code lost:
        X.0qQ.A0F(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0bfa, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0cea, code lost:
        r1 = "viewContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ced, code lost:
        r1 = "loggingContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0cef, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0cf6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0d1a, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025d, code lost:
        if (r8.A0h != true) goto L_0x025f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r32) {
        /*
            r31 = this;
            r4 = r31
            r0 = r32
            int r1 = r4.A00
            switch(r1) {
                case 0: goto L_0x0ca7;
                case 1: goto L_0x0c63;
                case 2: goto L_0x0afb;
                case 3: goto L_0x08a5;
                case 4: goto L_0x0878;
                case 5: goto L_0x0cfc;
                case 6: goto L_0x0848;
                case 7: goto L_0x07bc;
                case 8: goto L_0x07a9;
                case 9: goto L_0x0798;
                case 10: goto L_0x0798;
                case 11: goto L_0x0785;
                case 12: goto L_0x075e;
                case 13: goto L_0x07a9;
                case 14: goto L_0x0722;
                case 15: goto L_0x0713;
                case 16: goto L_0x06ee;
                case 17: goto L_0x06bb;
                case 18: goto L_0x069b;
                case 19: goto L_0x0009;
                case 20: goto L_0x061f;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x0009;
                case 24: goto L_0x0009;
                case 25: goto L_0x0568;
                case 26: goto L_0x052a;
                case 27: goto L_0x04f5;
                case 28: goto L_0x04cc;
                case 29: goto L_0x0009;
                case 30: goto L_0x04c0;
                case 31: goto L_0x0785;
                case 32: goto L_0x0785;
                case 33: goto L_0x04a2;
                case 34: goto L_0x048b;
                case 35: goto L_0x047d;
                case 36: goto L_0x0465;
                case 37: goto L_0x0459;
                case 38: goto L_0x0449;
                case 39: goto L_0x0d18;
                case 40: goto L_0x0d18;
                case 41: goto L_0x0074;
                case 42: goto L_0x0d18;
                case 43: goto L_0x0057;
                case 44: goto L_0x0048;
                case 45: goto L_0x0048;
                case 46: goto L_0x0009;
                case 47: goto L_0x0030;
                case 48: goto L_0x0030;
                case 49: goto L_0x0020;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r2 = r4.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r4.A01
            java.lang.Object r0 = X.C51966G9m.A19(r0, r3)
            java.lang.Object r3 = r2.invoke(r1, r0)
            return r3
        L_0x0020:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r2 = r4.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r4.A01
            X.GmJ r1 = (X.C53333GmJ) r1
            java.lang.String r1 = r1.A0F
            goto L_0x071d
        L_0x0030:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r4.A01
            X.0sK r3 = (X.0sK) r3
            java.lang.Object r1 = r4.A02
            X.Hnf r1 = (X.C55799Hnf) r1
            int r1 = r1.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r3.invoke(r0, r2, r1)
            goto L_0x0d18
        L_0x0048:
            java.lang.Object r2 = r4.A01
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r4.A02
            java.lang.String r1 = X.DbS.A0q(r1)
            r2.invoke(r1, r0)
            goto L_0x0d18
        L_0x0057:
            int r5 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r3 = r4.A01
            X.5vd r3 = (X.C299665vd) r3
            java.lang.Object r2 = r4.A02
            X.5vQ r2 = (X.C299575vQ) r2
            X.5vJ r0 = r2.Be5()
            java.lang.String r1 = r0.A03
            X.6DK r2 = (X.AnonymousClass6DK) r2
            X.Gle r0 = r2.A01
            java.lang.String r0 = r0.A02
            r3.DY5(r1, r0, r5)
            goto L_0x0d18
        L_0x0074:
            X.JLe r0 = (X.C59480JLe) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r1 = r4.A02
            X.GgM r1 = (X.C52969GgM) r1
            java.lang.Object r9 = r4.A01
            android.content.Context r9 = (android.content.Context) r9
            r2 = 1
            X.0qQ.A0B(r9, r2)
            X.HpE r1 = r1.A03
            boolean r4 = r0 instanceof X.C64511LdD
            if (r4 == 0) goto L_0x009e
            X.4Cq r2 = r1.A0G
            r10 = 0
            r11 = 48
            X.MHH r5 = new X.MHH
            r6 = r5
            r7 = r0
            r8 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0099:
            X.AnonymousClass7TE.A1Z(r5, r2)
            goto L_0x0d18
        L_0x009e:
            boolean r4 = r0 instanceof X.ILR
            if (r4 == 0) goto L_0x00bc
            X.ILR r0 = (X.ILR) r0
            X.HkH r4 = r1.A03
            java.lang.String r0 = r0.A00
            java.lang.Integer r3 = r1.A0C
            X.0qQ.A0B(r3, r2)
            com.instagram.common.session.UserSession r2 = r4.A00
            X.1Xj r1 = X.DbV.A0U(r2, r0)
            if (r1 == 0) goto L_0x0d18
            X.4DU r0 = r4.A01
            X.I2F.A02(r1, r0, r2, r3)
            goto L_0x0d18
        L_0x00bc:
            boolean r4 = r0 instanceof X.ILS
            if (r4 == 0) goto L_0x00df
            X.ILS r0 = (X.ILS) r0
            X.Hzb r5 = r1.A06
            java.lang.String r0 = r0.A00
            X.4DU r4 = r1.A0B
            java.lang.String r3 = X.C56505Hzb.A00(r5, r0)
            if (r3 == 0) goto L_0x0d18
            X.1ud r2 = X.1ua.A0G
            com.instagram.common.session.UserSession r1 = r5.A00
            android.content.Context r0 = X.C51966G9m.A0P(r1)
            X.1ua r0 = r2.A01(r0, r1)
            r0.A0L(r4, r3)
            goto L_0x0d18
        L_0x00df:
            boolean r4 = r0 instanceof X.ILT
            if (r4 == 0) goto L_0x0103
            X.ILT r0 = (X.ILT) r0
            X.0sP r2 = r1.A0E
            java.lang.String r3 = r0.A00
            java.lang.Object r2 = r2.invoke(r3)
            X.1Xj r2 = (X.1Xj) r2
            if (r2 != 0) goto L_0x00f9
            X.1E8 r0 = r1.A0A
            X.1Xj r2 = r0.A02(r3)
            if (r2 == 0) goto L_0x0d18
        L_0x00f9:
            r2.AHi()
            com.instagram.common.session.UserSession r0 = r1.A09
            r2.AE7(r0)
            goto L_0x0d18
        L_0x0103:
            boolean r4 = r0 instanceof X.ILV
            if (r4 == 0) goto L_0x016a
            X.ILV r0 = (X.ILV) r0
            com.instagram.barcelona.feed.post.data.PostViewStateRepository r7 = r1.A02
            java.lang.String r6 = r0.A02
            int r3 = r0.A00
            X.5vR r5 = r0.A01
            X.4DU r4 = r1.A0B
            X.05G r2 = r7.A01
        L_0x0115:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = X.C51975G9x.A0p(r6, r5, r0)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0115
            X.5vR r0 = X.C299585vR.Expanded
            if (r5 != r0) goto L_0x0d18
            com.instagram.common.session.UserSession r0 = r7.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r4, r0)
            X.1Xj r1 = X.DbV.A0U(r0, r6)
            if (r1 == 0) goto L_0x0d18
            java.lang.String r0 = "barcelona_post_more_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x03bb
            java.lang.String r0 = X.1Xv.A06(r0)
            X.G9t.A1J(r2, r0)
            X.C51969G9p.A19(r2, r4)
            java.lang.String r0 = X.DbY.A0a()
            X.C51965G9l.A1K(r2, r0)
            java.lang.Long r0 = X.C51974G9v.A0U(r1)
            X.C51965G9l.A1H(r2, r0)
            java.lang.Long r1 = X.DbS.A0j(r3)
            java.lang.String r0 = "m_ix"
            r2.A9F(r0, r1)
            r2.Cgf()
            goto L_0x0d18
        L_0x016a:
            boolean r4 = r0 instanceof X.C57008ILa
            if (r4 == 0) goto L_0x01b8
            X.ILa r0 = (X.C57008ILa) r0
            X.1E8 r8 = r1.A0A
            java.lang.String r7 = r0.A01
            X.1Xj r12 = r8.A02(r7)
            if (r12 == 0) goto L_0x0d18
            java.lang.String r6 = r0.A05
            if (r6 == 0) goto L_0x0d18
            X.0sP r5 = r1.A0F
            java.lang.Object r4 = r5.invoke(r6)
            int r17 = X.AnonymousClass7TE.A0M(r4)
            java.lang.String r4 = r0.A00
            if (r4 == 0) goto L_0x03c0
            X.1Xj r10 = r8.A02(r7)
            if (r10 == 0) goto L_0x0d18
            java.lang.Object r2 = r5.invoke(r6)
            int r15 = X.AnonymousClass7TE.A0M(r2)
            X.08y r5 = X.09i.A0A
            X.IXd r3 = new X.IXd
            r3.<init>()
            java.lang.String r12 = r0.A02
            java.lang.String r13 = r0.A04
            java.lang.String r14 = r0.A03
            boolean r2 = r0.A06
            X.4DU r11 = r1.A0B
            r0 = 0
            X.Glm r8 = new X.Glm
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.A0A(r3, r0, r8, r4)
            goto L_0x0d18
        L_0x01b8:
            boolean r4 = r0 instanceof X.C64512LdE
            if (r4 == 0) goto L_0x01d6
            X.LdE r0 = (X.C64512LdE) r0
            X.0sP r3 = r1.A0E
            java.lang.String r2 = r0.A00
            java.lang.Object r8 = r3.invoke(r2)
            if (r8 == 0) goto L_0x0d18
            X.4Cq r2 = r1.A0G
            r9 = 0
            r10 = 47
            X.MHH r5 = new X.MHH
            r6 = r0
            r7 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0099
        L_0x01d6:
            boolean r4 = r0 instanceof X.ILZ
            if (r4 == 0) goto L_0x022c
            X.ILZ r0 = (X.ILZ) r0
            com.instagram.common.session.UserSession r12 = r1.A09
            X.17i r3 = X.17h.A00(r12)
            java.lang.String r2 = r0.A04
            com.instagram.user.model.User r19 = r3.A02(r2)
            if (r19 == 0) goto L_0x0d18
            java.lang.String r3 = r0.A03
            r11 = 0
            X.0sP r2 = r1.A0E
            java.lang.Object r13 = r2.invoke(r3)
            X.1Xj r13 = (X.1Xj) r13
            if (r13 != 0) goto L_0x01fd
            X.1E8 r2 = r1.A0A
            X.1Xj r13 = r2.A02(r3)
        L_0x01fd:
            java.lang.String r2 = r1.A0D
            X.0xF r10 = r0.A00
            X.4DU r1 = r1.A0B
            java.lang.String r26 = r1.getModuleName()
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A01
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r2
            r24 = r11
            r25 = r11
            r27 = r1
            r28 = r0
            r29 = r11
            r30 = r11
            X.FH6.A07(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0d18
        L_0x022c:
            boolean r4 = r0 instanceof X.ILU
            if (r4 == 0) goto L_0x02c4
            X.ILU r0 = (X.ILU) r0
            X.0sP r3 = r1.A0E
            java.lang.String r4 = r0.A01
            java.lang.Object r11 = r3.invoke(r4)
            X.1Xj r11 = (X.1Xj) r11
            if (r11 != 0) goto L_0x0248
            X.1E8 r3 = r1.A0A
            X.1Xj r11 = r3.A02(r4)
            if (r11 != 0) goto L_0x0248
            goto L_0x0d18
        L_0x0248:
            com.instagram.barcelona.feed.post.data.PostViewStateRepository r6 = r1.A02
            java.lang.String r13 = r0.A00
            X.4DU r7 = r1.A0B
            java.lang.String r12 = r11.getId()
            if (r12 == 0) goto L_0x0419
            X.3gp r8 = r11.A1T()
            if (r8 == 0) goto L_0x025f
            boolean r0 = r8.A0h
            r1 = 1
            if (r0 == r2) goto L_0x0260
        L_0x025f:
            r1 = 0
        L_0x0260:
            r0 = 0
            if (r1 == 0) goto L_0x02c2
            java.lang.String r14 = r8.A0G
        L_0x0265:
            X.4oA r1 = X.C51966G9m.A0x(r11)
            if (r1 == 0) goto L_0x02ba
            X.4o8 r1 = r1.BtE()
            if (r1 == 0) goto L_0x02ba
            X.1Xj r4 = r1.Bj4()
            if (r4 == 0) goto L_0x02bb
            X.3gp r9 = r4.A1T()
            if (r9 == 0) goto L_0x02bc
            boolean r1 = r9.A0h
            if (r1 != r2) goto L_0x02bc
            java.lang.String r3 = r9.A0G
        L_0x0283:
            X.4oA r1 = X.C51966G9m.A0x(r4)
            if (r1 == 0) goto L_0x02c0
            X.4o8 r1 = r1.BtE()
            if (r1 == 0) goto L_0x02c0
            X.1Xj r1 = r1.Bj4()
            if (r1 == 0) goto L_0x02c0
            X.3gp r10 = r1.A1T()
            if (r10 == 0) goto L_0x02a1
            boolean r1 = r10.A0h
            if (r1 != r2) goto L_0x02a1
            java.lang.String r0 = r10.A0G
        L_0x02a1:
            java.lang.String[] r0 = new java.lang.String[]{r14, r3, r0}
            java.util.List r15 = X.C51967G9n.A0s(r0)
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0d18
            X.4Cq r2 = r6.A01
            r16 = 0
            X.ImK r5 = new X.ImK
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0099
        L_0x02ba:
            r4 = r0
        L_0x02bb:
            r9 = r0
        L_0x02bc:
            r3 = r0
            if (r4 == 0) goto L_0x02c0
            goto L_0x0283
        L_0x02c0:
            r10 = r0
            goto L_0x02a1
        L_0x02c2:
            r14 = r0
            goto L_0x0265
        L_0x02c4:
            boolean r4 = r0 instanceof X.ILW
            if (r4 == 0) goto L_0x0391
            X.ILW r0 = (X.ILW) r0
            com.instagram.common.session.UserSession r6 = r1.A09
            r4 = 17
            X.IwM r5 = new X.IwM
            r5.<init>(r6, r4)
            java.lang.Class<com.instagram.barcelona.feed.post.data.PostRepository> r4 = com.instagram.barcelona.feed.post.data.PostRepository.class
            java.lang.Object r5 = r6.A01(r4, r5)
            com.instagram.barcelona.feed.post.data.PostRepository r5 = (com.instagram.barcelona.feed.post.data.PostRepository) r5
            java.lang.String r4 = r0.A00
            java.lang.String r13 = r0.A02
            java.lang.String r0 = r0.A01
            X.4DU r6 = r1.A0B
            com.instagram.common.session.UserSession r8 = r5.A00
            X.1Xj r9 = X.DbV.A0U(r8, r4)
            if (r9 == 0) goto L_0x041e
            r7 = 0
            if (r13 == 0) goto L_0x038e
            java.lang.String r15 = X.C51965G9l.A0u(r13)
        L_0x02f2:
            if (r0 == 0) goto L_0x038a
            java.lang.String r16 = X.C51965G9l.A0u(r0)
        L_0x02f8:
            boolean r1 = X.HVN.A00(r9, r6)
            X.1se r0 = X.1sd.A00(r8)
            r0.A02(r9, r3)
            X.4oA r0 = X.C51966G9m.A0x(r9)
            if (r0 == 0) goto L_0x0372
            java.lang.Boolean r0 = r0.CF7()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            if (r0 == 0) goto L_0x0372
            r0 = 49
            X.MMP r1 = new X.MMP
            r1.<init>(r8, r0)
            java.lang.Class<X.HDm> r0 = X.C54437HDm.class
            java.lang.Object r11 = r8.A01(r0, r1)
            X.HDm r11 = (X.C54437HDm) r11
            java.lang.String r14 = X.C51970G9q.A0j(r9)
            com.instagram.common.session.UserSession r1 = r11.A01
            X.1Xj r12 = X.DbV.A0U(r1, r14)
            if (r12 == 0) goto L_0x033a
            X.C54437HDm.A00(r11, r14, r13, r3)
            boolean r0 = X.HVN.A00(r12, r6)
            if (r0 == 0) goto L_0x0364
            X.HVO.A00(r1, r12, r6, r2)
        L_0x033a:
            X.4oA r2 = X.C51966G9m.A0x(r9)
            if (r2 == 0) goto L_0x0353
            X.Xni r0 = X.C274354oA.A00
            X.HB4 r1 = r0.A00()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A0L = r0
            X.4oA r0 = r1.A01()
            X.C21519Xdl.A00(r2, r0)
        L_0x0353:
            r9.AE7(r8)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r8)
            X.INU r0 = new X.INU
            r0.<init>()
            r1.A00(r0)
            goto L_0x0d18
        L_0x0364:
            X.4Cq r0 = r11.A01
            X.MGN r10 = new X.MGN
            r15 = r7
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7TE.A1Z(r10, r0)
            goto L_0x033a
        L_0x0372:
            if (r1 == 0) goto L_0x0378
            X.HVO.A00(r8, r9, r6, r3)
            goto L_0x033a
        L_0x0378:
            r18 = -1
            java.lang.String r17 = X.DbT.A0x(r9)
            java.lang.String r11 = "sfplt_in_menu"
            r10 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r19 = r3
            X.I7O.A05(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x033a
        L_0x038a:
            r16 = r7
            goto L_0x02f8
        L_0x038e:
            r15 = r7
            goto L_0x02f2
        L_0x0391:
            boolean r2 = r0 instanceof X.ILX
            if (r2 == 0) goto L_0x03ab
            X.ILX r0 = (X.ILX) r0
            X.HDU r6 = r1.A01
            java.lang.String r8 = r0.A02
            java.lang.String r9 = r0.A01
            int r11 = r0.A00
            X.4DU r7 = r1.A0B
            X.4Cq r2 = r6.A01
            r10 = 0
            com.instagram.barcelona.feed.post.data.PostPollRepository$votePoll$1 r5 = new com.instagram.barcelona.feed.post.data.PostPollRepository$votePoll$1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0099
        L_0x03ab:
            boolean r2 = r0 instanceof X.ILQ
            if (r2 == 0) goto L_0x0426
            X.4Cq r2 = r1.A0G
            r4 = 0
            r3 = 23
            X.MGZ r5 = new X.MGZ
            r5.<init>((java.lang.Object) r0, (java.lang.Object) r1, (X.AnonymousClass4D7) r4, (int) r3)
            goto L_0x0099
        L_0x03bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03c0:
            java.lang.String r14 = r0.A02
            java.lang.String r6 = r0.A04
            java.lang.String r5 = r0.A03
            boolean r4 = r0.A06
            com.instagram.common.session.UserSession r10 = r1.A09
            X.4DU r13 = r1.A0B
            r11 = 0
            r15 = r6
            r16 = r5
            r18 = r4
            r19 = r3
            X.HVE.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.3gp r0 = r12.A1T()
            if (r0 == 0) goto L_0x0d18
            java.lang.String r0 = r0.A0d
            if (r0 == 0) goto L_0x0d18
            X.1Xy r0 = r12.A0C
            X.DT0 r3 = r0.C5j()
            if (r3 == 0) goto L_0x03f7
            X.4oA r0 = X.C51966G9m.A0x(r12)
            if (r0 == 0) goto L_0x03f3
            java.lang.String r11 = r0.By8()
        L_0x03f3:
            X.5vk r11 = X.C54846HVd.A00(r3, r10, r11)
        L_0x03f7:
            if (r4 == 0) goto L_0x0d18
            if (r11 == 0) goto L_0x0d18
            java.lang.String r0 = r11.A02
            if (r0 == 0) goto L_0x0d18
            X.6CV r0 = r1.A04
            com.instagram.common.session.UserSession r5 = r0.A05
            X.0Tu r0 = X.0Tu.A05
            r3 = 36322581372807451(0x810b32000d291b, double:3.033884947234477E-306)
            boolean r0 = X.182.A06(r0, r5, r3)
            if (r0 == 0) goto L_0x0d18
            X.HkI r0 = r1.A05
            X.05G r0 = r0.A00
            X.AnonymousClass7TF.A1O(r0, r2)
            goto L_0x0d18
        L_0x0419:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x041e:
            java.lang.String r1 = "Could not find media with this ID"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0426:
            boolean r2 = r0 instanceof X.ILY
            if (r2 == 0) goto L_0x0444
            X.ILY r0 = (X.ILY) r0
            com.instagram.barcelona.search.data.SearchTopicsRepository r1 = r1.A07
            java.lang.String r4 = r0.A02
            java.lang.String r2 = r0.A03
            java.lang.String r3 = r0.A01
            java.lang.String r5 = r0.A00
            java.util.Map r0 = r1.A00
            X.0sn r6 = X.0sn.A00
            X.GlS r1 = new X.GlS
            r1.<init>(r2, r3, r4, r5, r6)
            r0.put(r2, r1)
            goto L_0x0d18
        L_0x0444:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0449:
            X.5dM r0 = (X.C289295dM) r0
            long r1 = r0.A00
            java.lang.Object r0 = r4.A02
            X.C51971G9r.A1N(r0, r1)
            java.lang.Object r0 = r4.A01
            X.DbS.A1U(r0)
            goto L_0x0d18
        L_0x0459:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r2 = r4.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r4.A01
            goto L_0x071d
        L_0x0465:
            java.lang.Object r0 = r4.A02
            X.GZX r0 = (X.GZX) r0
            X.Ga7 r2 = new X.Ga7
            r2.<init>(r0)
            java.lang.Object r1 = r4.A01
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r1.addTouchExplorationStateChangeListener(r2)
            r0 = 12
            X.GOz r3 = new X.GOz
            r3.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1)
            return r3
        L_0x047d:
            java.lang.Object r1 = r4.A01
            X.C51965G9l.A1W(r1, r0)
            java.lang.Object r1 = r4.A02
            X.5Oz r1 = (X.C284945Oz) r1
            r1.Epw(r0)
            goto L_0x0d18
        L_0x048b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r2 = r4.A01
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r4.A02
            X.Glv r1 = (X.C53309Glv) r1
            if (r1 == 0) goto L_0x04a0
            java.lang.String r1 = r1.A05
        L_0x049b:
            r2.invoke(r0, r1)
            goto L_0x0d18
        L_0x04a0:
            r1 = 0
            goto L_0x049b
        L_0x04a2:
            X.5VN r0 = (X.AnonymousClass5VN) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            java.lang.Object r1 = X.C51966G9m.A18(r1)
            X.Gn7 r1 = (X.C53377Gn7) r1
            X.Glv r1 = r1.A01
            if (r1 == 0) goto L_0x0d18
            java.lang.Object r3 = r4.A02
            X.H0y r3 = (X.C54154H0y) r3
            java.lang.String r2 = r1.A05
            r1 = 0
            X.C54154H0y.A00(r0, r3, r2, r1)
            goto L_0x0d18
        L_0x04c0:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r4.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A01
            goto L_0x078f
        L_0x04cc:
            android.view.View r0 = (android.view.View) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r2 = r0.getTag()
            r1 = 720(0x2d0, float:1.009E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            X.Jpp r2 = (X.C60704Jpp) r2
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            java.lang.Object r0 = r4.A02
            X.4gU r0 = (X.C270284gU) r0
            r0.getValue()
            java.lang.Object r0 = r4.A01
            X.6wg r0 = (X.C322956wg) r0
            X.C64173LSa.A01(r1, r2, r0, r3, r3)
            goto L_0x0d18
        L_0x04f5:
            android.view.View r0 = (android.view.View) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r3 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.reels.ui.views.ReelItemViewBinder.Holder"
            X.0qQ.A0C(r3, r0)
            X.3N1 r3 = (X.AnonymousClass3N1) r3
            java.lang.Object r2 = r4.A01
            r0 = 54
            X.MIW r1 = new X.MIW
            r1.<init>(r2, r0)
            java.lang.Object r0 = r4.A02
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.AnonymousClass7TF.A1C(r3, r5, r0)
            X.C64021LJi.A00(r0, r3, r1)
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r0 = r3.A03
            X.3N0 r1 = r0.getHolder()
            X.HDR r0 = X.HDR.A00
            X.C64021LJi.A01(r0, r1)
            goto L_0x0d18
        L_0x052a:
            java.lang.Object r0 = r4.A02
            X.K86 r0 = (X.K86) r0
            X.0eM r0 = r0.A08
            java.lang.Object r3 = r0.getValue()
            X.Jiz r3 = (X.C60301Jiz) r3
            java.lang.Object r2 = r4.A01
            X.MPr r2 = (X.C66385MPr) r2
            X.Jxs r2 = (X.C61142Jxs) r2
            X.Gn3 r0 = r2.A00
            int r7 = r0.A01
            X.Jw9 r4 = r2.A01
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x054e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0560
            java.lang.Object r0 = r1.next()
            X.N4E r0 = (X.N4E) r0
            java.lang.String r0 = r0.A05
            r6.add(r0)
            goto L_0x054e
        L_0x0560:
            java.lang.Integer r5 = r2.A02
            r8 = 1
            r3.A02(r4, r5, r6, r7, r8)
            goto L_0x0d18
        L_0x0568:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L_0x0d18
            java.lang.Object r3 = r4.A02
            X.K86 r3 = (X.K86) r3
            java.lang.Object r1 = r4.A01
            X.MPq r1 = (X.C66384MPq) r1
            X.Gp2 r1 = (X.C53470Gp2) r1
            int r7 = r1.A00
            X.Jw9 r11 = r1.A01
            java.lang.String r13 = r1.A03
            java.lang.String r9 = r1.A02
            java.util.List r8 = r1.A04
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            android.os.Bundle r2 = r3.requireArguments()
            r1 = 4485(0x1185, float:6.285E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r14 = X.C320236s2.A01(r2, r1)
            r1 = 4482(0x1182, float:6.28E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r15 = X.C320236s2.A01(r2, r1)
            r1 = 4483(0x1183, float:6.282E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r18 = X.C320236s2.A01(r2, r1)
            r1 = 4484(0x1184, float:6.283E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r16 = X.C320236s2.A01(r2, r1)
            X.0eM r1 = r3.A07
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r1)
            android.content.Context r2 = r3.requireContext()
            android.content.Context r1 = r3.getContext()
            int r1 = X.2Yu.A0E(r1)
            int r23 = r2.getColor(r1)
            r6 = 2131953066(0x7f1305aa, float:1.9542592E38)
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[]{r18}
            X.HsR r1 = new X.HsR
            r1.<init>(r5, r6)
            java.lang.String r20 = X.C56259HvT.A01(r3, r1)
            r6 = 2131953065(0x7f1305a9, float:1.954259E38)
            java.lang.Object[] r5 = new java.lang.Object[]{r18}
            X.HsR r1 = new X.HsR
            r1.<init>(r5, r6)
            java.lang.String r19 = X.C56259HvT.A01(r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r22 = 0
            com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1 r10 = new com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1
            r21 = r8
            r24 = r7
            r17 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.AnonymousClass7TE.A1Z(r10, r1)
            X.0eM r1 = r3.A08
            java.lang.Object r6 = r1.getValue()
            X.Jiz r6 = (X.C60301Jiz) r6
            java.lang.Object r1 = r11.A01
            X.N4E r1 = (X.N4E) r1
            java.lang.String r5 = r1.A05
            X.0qQ.A0B(r5, r2)
            X.LPB r1 = r6.A00
            r1.A05(r5, r7)
            X.MRT r1 = r3.A01
            if (r1 == 0) goto L_0x0618
            r1.DI6(r0)
        L_0x0618:
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r4, r0)
            goto L_0x0d18
        L_0x061f:
            X.6Gb r6 = X.C51968G9o.A0L(r0)
            java.lang.Object r7 = r4.A01
            X.4gU r7 = (X.C270284gU) r7
            java.lang.Object r0 = r7.getValue()
            X.Jvy r0 = (X.C61060Jvy) r0
            boolean r0 = r0.A04
            r5 = 0
            if (r0 == 0) goto L_0x0676
            X.0sK r0 = X.C55381Hgn.A00
            r6.Cf4(r5, r0)
        L_0x0637:
            java.lang.Object r0 = r7.getValue()
            X.Jvy r0 = (X.C61060Jvy) r0
            java.lang.Object r10 = r0.A01
            java.util.List r10 = (java.util.List) r10
            X.JES r1 = X.JES.A00
            java.lang.Object r9 = r4.A02
            int r8 = r10.size()
            r0 = 19
            X.J6l r4 = new X.J6l
            r4.<init>((int) r0, (java.lang.Object) r10, (java.lang.Object) r1)
            r3 = 4
            X.MP6 r2 = new X.MP6
            r2.<init>(r10, r3)
            r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            X.GaB r0 = new X.GaB
            r0.<init>((int) r3, (java.lang.Object) r10, (java.lang.Object) r9)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r1)
            r6.CfA(r4, r2, r0, r8)
            java.lang.Object r0 = r7.getValue()
            X.Jvy r0 = (X.C61060Jvy) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0d18
            X.0sK r0 = X.C55381Hgn.A01
            r6.Cf4(r5, r0)
            goto L_0x0d18
        L_0x0676:
            java.lang.Object r0 = r4.A02
            X.5tX r0 = (X.C298505tX) r0
            X.0eM r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            X.7I6 r3 = (X.AnonymousClass7I6) r3
            java.lang.Object r0 = r7.getValue()
            X.Jvy r0 = (X.C61060Jvy) r0
            boolean r0 = r0.A03
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
            short r2 = X.JVT.A00(r0)
            r1 = 895692010(0x35632cea, float:8.462945E-7)
            X.02m r0 = r3.A06
            r0.markerEnd(r1, r2)
            goto L_0x0637
        L_0x069b:
            java.lang.Object r0 = r4.A02
            boolean r0 = r0 instanceof X.C64477Lce
            java.lang.Object r1 = r4.A01
            X.61R r1 = (X.AnonymousClass61R) r1
            if (r0 == 0) goto L_0x06b5
            if (r1 == 0) goto L_0x06ad
            r1.EFK()
            r1.E2p()
        L_0x06ad:
            r0 = 9
            X.GP2 r3 = new X.GP2
            r3.<init>(r1, r0)
            return r3
        L_0x06b5:
            if (r1 == 0) goto L_0x06ad
            r1.stop()
            goto L_0x06ad
        L_0x06bb:
            X.5Q3 r0 = (X.AnonymousClass5Q3) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r3 = r4.A01
            X.6Ff r3 = (X.C304786Ff) r3
            r6 = 0
            long r14 = X.C289325dP.A00(r6, r6)
            float r2 = X.C51969G9p.A00(r0)
            java.lang.Object r1 = r4.A02
            X.4gU r1 = (X.C270284gU) r1
            float r1 = X.C51971G9r.A03(r1)
            float r2 = r2 * r1
            long r16 = X.C289325dP.A00(r2, r6)
            r1 = 1086324736(0x40c00000, float:6.0)
            float r10 = r0.F06(r1)
            r8 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = 3
            r6 = r0
            r7 = r3
            r9 = r8
            r12 = r5
            r6.AQi(r7, r8, r9, r10, r11, r12, r13, r14, r16)
            goto L_0x0d18
        L_0x06ee:
            X.C51965G9l.A1U(r0)
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r4.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r7 = 0
            X.0Tu r2 = X.DbS.A0J(r4, r7)
            r0 = 36887025975689962(0x830c8e001a02ea, double:3.390841986933362E-306)
            java.lang.String r6 = X.182.A04(r2, r4, r0)
            X.2EG r5 = X.2EG.A0K
            X.SUL r2 = new X.SUL
            r2.<init>(r3, r4, r5, r6, r7)
            r2.A0A()
            goto L_0x0d18
        L_0x0713:
            java.lang.Object r2 = r4.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r4.A01
            X.Jvt r1 = (X.C61055Jvt) r1
            java.lang.Object r1 = r1.A00
        L_0x071d:
            r2.invoke(r1, r0)
            goto L_0x0d18
        L_0x0722:
            X.5ch r0 = (X.C288915ch) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            boolean r0 = r0.CTr()
            if (r0 == 0) goto L_0x074b
            java.lang.Object r0 = r4.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r1 = r0.A00
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            X.C51967G9n.A16(r1, r0)
            java.lang.Object r0 = r4.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r1 = r0.A00
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x0746:
            r1.Epw(r0)
            goto L_0x0d18
        L_0x074b:
            java.lang.Object r0 = r4.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r1 = r0.A00
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Object r0 = r4.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            goto L_0x0746
        L_0x075e:
            X.6Gb r7 = X.C51968G9o.A0L(r0)
            java.lang.Object r6 = r4.A01
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x076a
            X.0sn r6 = X.0sn.A00
        L_0x076a:
            java.lang.Object r5 = r4.A02
            X.Izu r1 = X.C58931Izu.A00
            int r4 = r6.size()
            r3 = 0
            r0 = 11
            X.J6l r2 = new X.J6l
            r2.<init>((int) r0, (java.util.List) r6, (X.0sP) r1)
            r1 = 1
            X.GaB r0 = new X.GaB
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r5)
            X.C51967G9n.A12(r7, r0, r3, r2, r4)
            goto L_0x0d18
        L_0x0785:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r4.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A02
        L_0x078f:
            java.lang.Object r0 = X.C51966G9m.A19(r0, r2)
            java.lang.Object r3 = r1.invoke(r0)
            return r3
        L_0x0798:
            java.lang.Object r1 = r4.A01
            X.GSY r1 = (X.GSY) r1
            java.lang.Object r2 = r1.A01
            if (r2 == 0) goto L_0x0d18
            java.lang.Object r1 = r4.A02
            X.0sL r1 = (X.0sL) r1
            r1.invoke(r2, r0)
            goto L_0x0d18
        L_0x07a9:
            java.lang.Object r1 = r4.A01
            X.5Qa r1 = (X.C285165Qa) r1
            r0 = 0
            r1.AHc(r0)
            java.lang.Object r0 = r4.A02
            X.5Uk r0 = (X.C286225Uk) r0
            if (r0 == 0) goto L_0x0d18
            r0.hide()
            goto L_0x0d18
        L_0x07bc:
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            java.lang.Object r6 = r4.A02
            X.QCk r6 = (X.C7421QCk) r6
            X.2gB r5 = r6.A08
            java.lang.Object r1 = r4.A01
            X.2Fk r1 = (X.2Fk) r1
            r5.A0D(r1)
            if (r0 != 0) goto L_0x07eb
            X.RER r0 = X.RER.Error
            r5.A0B(r0)
            X.2Fj r1 = r6.A09
            r3 = 0
            r6 = -1
            r0 = 711(0x2c7, float:9.96E-43)
            java.lang.String r5 = X.Pxd.A00(r0)
            X.LG6 r2 = new X.LG6
            r4 = r3
            r8 = r6
            r10 = r6
            r12 = r6
            r2.<init>(r3, r4, r5, r6, r8, r10, r12)
            r1.A0B(r2)
            goto L_0x0d18
        L_0x07eb:
            com.fbpay.w3c.CardDetails r1 = r0.A00
            java.lang.String r3 = r1.A05
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x07f4
            r3 = r2
        L_0x07f4:
            r6.A04 = r3
            java.lang.String r1 = r1.A0A
            if (r1 == 0) goto L_0x07fb
            r2 = r1
        L_0x07fb:
            r6.A05 = r2
            if (r3 != 0) goto L_0x0809
            java.lang.String r0 = "cardNetwork"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0809:
            X.RGo r1 = X.C11334SNo.A00(r3)
            r6.A01 = r1
            boolean r2 = r0.A05
            r4 = 0
            if (r2 != 0) goto L_0x0820
            java.lang.String r1 = r0.A02
            X.0qQ.A07(r1)
            boolean r1 = X.C51966G9m.A1X(r1)
            r3 = 1
            if (r1 != 0) goto L_0x0846
        L_0x0820:
            r3 = 0
            if (r2 != 0) goto L_0x0846
        L_0x0823:
            X.2Fj r2 = r6.A0A
            if (r4 == 0) goto L_0x0843
            X.RDS r1 = X.RDS.A02
        L_0x0829:
            r2.A0B(r1)
            if (r3 == 0) goto L_0x083c
            java.lang.String r0 = r0.A02
        L_0x0830:
            r6.A03 = r0
            X.RER r0 = X.RER.InvalidInput
            r5.A0B(r0)
            X.C7421QCk.A01(r6)
            goto L_0x0d18
        L_0x083c:
            X.S7C r0 = r6.A02
            java.lang.String r0 = r0.A04()
            goto L_0x0830
        L_0x0843:
            X.RDS r1 = X.RDS.A04
            goto L_0x0829
        L_0x0846:
            r4 = 1
            goto L_0x0823
        L_0x0848:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0d18
            java.lang.Object r0 = r4.A02
            X.QhO r0 = (X.C8130QhO) r0
            X.00Y r1 = r0.A01
            if (r1 != 0) goto L_0x0860
            java.lang.String r0 = "requestPermissionLauncher"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0860:
            r0 = 27
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A02(r0)
            java.lang.Object r0 = r4.A01
            X.QDR r0 = (X.QDR) r0
            X.2Fj r1 = r0.A09
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.A0B(r0)
            goto L_0x0d18
        L_0x0878:
            java.lang.String r5 = X.C41847B3o.A1E(r0)
            java.lang.Object r3 = r4.A02
            X.QhN r3 = (X.C8129QhN) r3
            com.facebookpay.logging.LoggingContext r2 = r3.A06
            if (r2 != 0) goto L_0x088e
            java.lang.String r0 = "loggingContext"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x088e:
            r1 = 0
            java.lang.String r0 = "see_receipt"
            X.C8129QhN.A02(r2, r3, r0, r1)
            X.RRM r1 = X.AnonymousClass2E0.A07()
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            r1.A01(r0, r5)
            goto L_0x0d18
        L_0x08a5:
            java.lang.Object r0 = r4.A02
            X.QhQ r0 = (X.C8132QhQ) r0
            X.QDN r5 = r0.A0B
            if (r5 != 0) goto L_0x08b1
            java.lang.String r15 = "ecpViewModel"
            goto L_0x0bf3
        L_0x08b1:
            java.lang.Object r13 = r4.A01
            X.RH6 r13 = (X.RH6) r13
            androidx.fragment.app.Fragment r2 = r0.mParentFragment
            if (r2 == 0) goto L_0x0af6
            android.view.ContextThemeWrapper r8 = r0.A01
            if (r8 != 0) goto L_0x08c1
            java.lang.String r15 = "viewContext"
            goto L_0x0bf3
        L_0x08c1:
            r6 = 0
            X.0qQ.A0B(r13, r6)
            r4 = 1
            r12 = 2
            r11 = 3
            X.2Fj r1 = r5.A11
            java.lang.Object r0 = r1.A02()
            java.lang.String r15 = "Required value was null."
            if (r0 == 0) goto L_0x0af1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r14 = r0.A0A
            java.lang.Object r0 = r1.A02()
            if (r0 == 0) goto L_0x0aec
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r10 = r0.A08
            java.lang.Object r0 = r1.A02()
            if (r0 == 0) goto L_0x0ae7
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r3 = r0.A05
            r0 = 0
            if (r3 == 0) goto L_0x08f1
            java.lang.String r9 = r3.A00
            if (r9 != 0) goto L_0x08ff
        L_0x08f1:
            java.lang.Object r3 = r1.A02()
            if (r3 == 0) goto L_0x0ae2
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r3 = r3.A05
            if (r3 == 0) goto L_0x09bd
            java.lang.String r9 = r3.A02
        L_0x08ff:
            com.facebookpay.logging.LoggingContext r7 = r5.A1P
            java.lang.Object r3 = r1.A02()
            if (r3 == 0) goto L_0x0add
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r3 = r3.A04
            X.RFs r3 = r3.A01
            r18 = r7
            r19 = r14
            r20 = r10
            r21 = r9
            r22 = r0
            r17 = r3
            r16 = r0
            android.os.Bundle r3 = X.S9Y.A01(r16, r17, r18, r19, r20, r21, r22)
            int r10 = r13.ordinal()
            if (r10 == r12) goto L_0x0ac2
            if (r10 == r11) goto L_0x0a8d
            r9 = 4
            if (r10 == r9) goto L_0x0a24
            r3 = 10
            if (r10 == r3) goto L_0x09de
            r3 = 15
            if (r10 != r3) goto L_0x0d18
            java.lang.Object r3 = r1.A02()
            if (r3 == 0) goto L_0x09d9
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            java.lang.String r11 = r3.A0A
            java.lang.Object r3 = r1.A02()
            if (r3 == 0) goto L_0x09d4
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            java.lang.String r10 = r3.A08
            java.lang.Object r3 = r1.A02()
            if (r3 == 0) goto L_0x09cf
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r3 = r3.A05
            if (r3 == 0) goto L_0x0956
            java.lang.String r9 = r3.A00
            if (r9 != 0) goto L_0x0964
        L_0x0956:
            java.lang.Object r3 = r1.A02()
            if (r3 == 0) goto L_0x09ca
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r3 = r3.A05
            if (r3 == 0) goto L_0x09bb
            java.lang.String r9 = r3.A02
        L_0x0964:
            java.lang.Object r3 = r1.A02()
            if (r3 == 0) goto L_0x09c5
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r3 = r3.A04
            X.RFs r8 = r3.A06
            java.lang.Object r1 = r1.A02()
            if (r1 == 0) goto L_0x09c0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r1 = r1.A04
            X.RFs r12 = r1.A01
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            r1 = 476(0x1dc, float:6.67E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r5.putBoolean(r1, r4)
            r1 = 478(0x1de, float:6.7E-43)
            java.lang.String r3 = X.Pxd.A00(r1)
            r1 = 488(0x1e8, float:6.84E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r5.putString(r3, r1)
            r1 = 331(0x14b, float:4.64E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5.putParcelable(r1, r7)
            r13 = r7
            r14 = r11
            r15 = r10
            r16 = r9
            r17 = r0
            r11 = r8
            android.os.Bundle r0 = X.S9Y.A01(r11, r12, r13, r14, r15, r16, r17)
            r5.putAll(r0)
            r0 = 698(0x2ba, float:9.78E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.C11336SNr.A00(r5, r2, r0, r4, r6)
            goto L_0x0d18
        L_0x09bb:
            r9 = r0
            goto L_0x0964
        L_0x09bd:
            r9 = r0
            goto L_0x08ff
        L_0x09c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x09c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x09ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x09cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x09d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x09d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x09de:
            X.QDL r9 = r5.A1O
            java.util.List r6 = r9.A07()
            java.util.List r16 = r9.A09()
            X.SNr r10 = X.C11336SNr.A00
            java.lang.Object r0 = r1.A02()
            if (r0 == 0) goto L_0x0a1f
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            X.RFs r4 = r0.A01
            r0 = 94
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r6, r0)
            r0 = 8
            X.TY1 r3 = new X.TY1
            r3.<init>(r5, r0)
            r0 = 9
            X.TY1 r1 = new X.TY1
            r1.<init>(r5, r0)
            boolean r0 = r9.A06
            r17 = r3
            r18 = r1
            r19 = r0
            r14 = r7
            r15 = r6
            r13 = r4
            r12 = r2
            r11 = r8
            r10.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0d18
        L_0x0a1f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0a24:
            X.SUj r0 = r5.A0I
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxContactItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxContactItem) r0
            if (r0 == 0) goto L_0x0d18
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x0d18
            r0 = 918(0x396, float:1.286E-42)
            java.lang.String r10 = X.Pxd.A00(r0)
            r0 = 626(0x272, float:8.77E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.Sto r9 = r0.A03
            X.QDH r0 = r5.A1Q
            X.SEB r11 = r0.A03()
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r0 = 331(0x14b, float:4.64E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.put(r0, r7)
            java.lang.String r0 = "TARGET_NAME"
            r6.put(r0, r1)
            java.lang.String r4 = "extra_data"
            java.lang.Object r1 = r6.get(r4)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0a70
            boolean r0 = r1 instanceof X.C62650uo
            if (r0 == 0) goto L_0x0a6c
            boolean r0 = r1 instanceof X.AnonymousClass0s2
            if (r0 == 0) goto L_0x0a70
        L_0x0a6c:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0a74
        L_0x0a70:
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
        L_0x0a74:
            X.SUU.A0A(r11, r1)
            r6.put(r4, r1)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r6)
            X.0qQ.A07(r0)
            r9.Cgl(r10, r0)
            X.QDU r1 = r5.A1K
            X.SUj r0 = r5.A0I
            r1.D5K(r3, r8, r2, r0)
            goto L_0x0d18
        L_0x0a8d:
            X.QDS r1 = r5.A1U
            X.2gB r0 = r1.A06
            java.lang.Object r0 = r0.A02()
            X.SUj r0 = (X.SUj) r0
            if (r0 == 0) goto L_0x0a9d
            java.lang.Object r0 = r0.A01
            if (r0 != 0) goto L_0x0d18
        L_0x0a9d:
            r0 = 643(0x283, float:9.01E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.STa.A03(r5, r0)
            X.2Fj r1 = r1.A0A
            com.facebookpay.form.fragment.model.FeatureConfiguration r0 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r0.<init>(r4, r6, r6)
            X.0qQ.A0B(r1, r4)
            android.os.Bundle r0 = X.S9Y.A00(r1, r0, r7)
            r3.putAll(r0)
            r0 = 697(0x2b9, float:9.77E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.C11336SNr.A00(r3, r2, r0, r4, r6)
            goto L_0x0d18
        L_0x0ac2:
            X.QDT r1 = r5.A1R
            X.2gB r1 = r1.A08
            java.lang.Object r1 = r1.A02()
            X.SUj r1 = (X.SUj) r1
            if (r1 == 0) goto L_0x0ad8
            java.lang.Object r1 = r1.A01
            X.RuU r1 = (X.C10575RuU) r1
            if (r1 == 0) goto L_0x0ad8
            java.lang.Object r0 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
        L_0x0ad8:
            X.QDN.A0X(r3, r8, r2, r5, r0)
            goto L_0x0d18
        L_0x0add:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0ae2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0ae7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0aec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0af1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0af6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0afb:
            X.SUj r0 = (X.SUj) r0
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.Object r3 = r0.A01
            r1 = r3
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r1 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r1
            r16 = 0
            if (r1 == 0) goto L_0x0c0a
            X.RH6 r2 = r1.BJZ()
        L_0x0b0e:
            X.RH6 r1 = X.RH6.A07
            java.lang.String r15 = "viewContext"
            java.lang.String r14 = "Required value was null."
            java.lang.String r13 = "ecpViewModel"
            if (r2 != r1) goto L_0x0bc9
            java.lang.Object r1 = r4.A02
            X.QhQ r1 = (X.C8132QhQ) r1
            X.QDN r9 = r1.A0B
            if (r9 == 0) goto L_0x0c5b
            androidx.fragment.app.Fragment r8 = r1.mParentFragment
            if (r8 == 0) goto L_0x0c56
            android.view.ContextThemeWrapper r6 = r1.A01
            if (r6 == 0) goto L_0x0bf3
            X.QDT r2 = r9.A1R
            boolean r1 = r3 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            if (r1 == 0) goto L_0x0c06
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r3 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r3
            if (r3 == 0) goto L_0x0c06
            java.lang.String r10 = r3.A0F
        L_0x0b34:
            X.2Fj r1 = r2.A0D
            java.lang.Object r1 = r1.A02()
            X.SUj r1 = (X.SUj) r1
            r5 = 0
            if (r1 == 0) goto L_0x0b6e
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0b6e
            java.util.Iterator r3 = r1.iterator()
        L_0x0b49:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0c03
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.SUj r1 = (X.SUj) r1
            java.lang.Object r1 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
            if (r1 == 0) goto L_0x0c00
            java.lang.String r1 = r1.Asm()
        L_0x0b60:
            boolean r1 = X.0qQ.A0K(r10, r1)
            if (r1 == 0) goto L_0x0b49
        L_0x0b66:
            X.SUj r2 = (X.SUj) r2
            if (r2 == 0) goto L_0x0b6e
            java.lang.Object r5 = r2.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r5 = (com.facebookpay.paymentmethod.model.PaymentMethod) r5
        L_0x0b6e:
            X.0qQ.A0B(r8, r7)
            X.2Fj r12 = r9.A11
            java.lang.Object r1 = r12.A02()
            if (r1 == 0) goto L_0x0c51
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r10 = r1.A0A
            java.lang.Object r1 = r12.A02()
            if (r1 == 0) goto L_0x0c4c
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r3 = r1.A08
            java.lang.Object r1 = r12.A02()
            if (r1 == 0) goto L_0x0c47
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r1.A05
            if (r1 == 0) goto L_0x0b97
            java.lang.String r11 = r1.A00
            if (r11 != 0) goto L_0x0ba5
        L_0x0b97:
            java.lang.Object r1 = r12.A02()
            if (r1 == 0) goto L_0x0c42
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r1.A05
            if (r1 == 0) goto L_0x0bfe
            java.lang.String r11 = r1.A02
        L_0x0ba5:
            com.facebookpay.logging.LoggingContext r2 = r9.A1P
            java.lang.Object r1 = r12.A02()
            if (r1 == 0) goto L_0x0c3d
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r1 = r1.A04
            X.RFs r1 = r1.A01
            r20 = r3
            r21 = r11
            r22 = r16
            r18 = r2
            r19 = r10
            r17 = r1
            android.os.Bundle r1 = X.S9Y.A01(r16, r17, r18, r19, r20, r21, r22)
            boolean r1 = X.QDN.A0X(r1, r6, r8, r9, r5)
            if (r1 != 0) goto L_0x0d18
        L_0x0bc9:
            java.lang.Object r9 = r4.A01
            X.TiK r9 = (X.C13844TiK) r9
            java.lang.Object r8 = r4.A02
            X.QhQ r8 = (X.C8132QhQ) r8
            androidx.fragment.app.Fragment r10 = r8.mParentFragment
            if (r10 == 0) goto L_0x0c38
            android.view.ContextThemeWrapper r6 = r8.A01
            if (r6 == 0) goto L_0x0bf3
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r8.A0A
            java.lang.String r15 = "ecpPaymentRequest"
            if (r2 == 0) goto L_0x0bf3
            java.lang.String r11 = r2.A0A
            java.lang.String r5 = r2.A08
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r2.A05
            if (r1 == 0) goto L_0x0bfb
            java.lang.String r4 = r1.A00
            if (r4 != 0) goto L_0x0bed
            java.lang.String r4 = r1.A02
        L_0x0bed:
            com.facebookpay.logging.LoggingContext r3 = r8.A0C
            if (r3 != 0) goto L_0x0c0e
            java.lang.String r15 = "loggingContext"
        L_0x0bf3:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0bfb:
            r4 = r16
            goto L_0x0bed
        L_0x0bfe:
            r11 = 0
            goto L_0x0ba5
        L_0x0c00:
            r1 = r5
            goto L_0x0b60
        L_0x0c03:
            r2 = r5
            goto L_0x0b66
        L_0x0c06:
            r10 = r16
            goto L_0x0b34
        L_0x0c0a:
            r2 = r16
            goto L_0x0b0e
        L_0x0c0e:
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r1 = r2.A04
            X.RFs r2 = r1.A01
            r1 = 40
            java.lang.String r22 = X.Pxd.A00(r1)
            r20 = r5
            r21 = r4
            r18 = r3
            r19 = r11
            r17 = r2
            android.os.Bundle r1 = X.S9Y.A01(r16, r17, r18, r19, r20, r21, r22)
            r9.AGm(r1, r6, r10, r0)
            boolean r0 = r9.Ern()
            if (r0 == 0) goto L_0x0d18
            X.QDN r0 = r8.A0B
            if (r0 == 0) goto L_0x0c5b
            r0.A0s(r7)
            goto L_0x0d18
        L_0x0c38:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0c3d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0c42:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0c47:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0c4c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0c51:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0c56:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x0c5b:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c63:
            X.SUj r0 = (X.SUj) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r5 = r4.A01
            X.TiK r5 = (X.C13844TiK) r5
            java.lang.Object r6 = r4.A02
            X.QhQ r6 = (X.C8132QhQ) r6
            androidx.fragment.app.Fragment r4 = r6.mParentFragment
            if (r4 == 0) goto L_0x0ca2
            android.view.ContextThemeWrapper r3 = r6.A01
            r7 = 0
            if (r3 == 0) goto L_0x0cea
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r6.A0A
            java.lang.String r1 = "ecpPaymentRequest"
            if (r2 == 0) goto L_0x0cef
            java.lang.String r10 = r2.A0A
            java.lang.String r11 = r2.A08
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r2.A05
            if (r1 == 0) goto L_0x0ca0
            java.lang.String r12 = r1.A00
            if (r12 != 0) goto L_0x0c8e
            java.lang.String r12 = r1.A02
        L_0x0c8e:
            com.facebookpay.logging.LoggingContext r9 = r6.A0C
            if (r9 == 0) goto L_0x0ced
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r1 = r2.A04
            X.RFs r8 = r1.A01
            java.lang.String r13 = "ECPBottomSheetContentFragment"
            android.os.Bundle r1 = X.S9Y.A01(r7, r8, r9, r10, r11, r12, r13)
            r5.AR6(r1, r3, r4, r0)
            goto L_0x0d18
        L_0x0ca0:
            r12 = r7
            goto L_0x0c8e
        L_0x0ca2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ca7:
            X.SUj r0 = (X.SUj) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r5 = r4.A01
            X.TiK r5 = (X.C13844TiK) r5
            java.lang.Object r6 = r4.A02
            X.QhQ r6 = (X.C8132QhQ) r6
            androidx.fragment.app.Fragment r4 = r6.mParentFragment
            if (r4 == 0) goto L_0x0cf7
            android.view.ContextThemeWrapper r3 = r6.A01
            r7 = 0
            if (r3 == 0) goto L_0x0cea
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r6.A0A
            java.lang.String r1 = "ecpPaymentRequest"
            if (r2 == 0) goto L_0x0cef
            java.lang.String r10 = r2.A0A
            java.lang.String r11 = r2.A08
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r2.A05
            if (r1 == 0) goto L_0x0ce8
            java.lang.String r12 = r1.A00
            if (r12 != 0) goto L_0x0cd2
            java.lang.String r12 = r1.A02
        L_0x0cd2:
            com.facebookpay.logging.LoggingContext r9 = r6.A0C
            if (r9 == 0) goto L_0x0ced
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r1 = r2.A04
            X.RFs r8 = r1.A01
            r1 = 40
            java.lang.String r13 = X.Pxd.A00(r1)
            android.os.Bundle r1 = X.S9Y.A01(r7, r8, r9, r10, r11, r12, r13)
            r5.D5K(r1, r3, r4, r0)
            goto L_0x0d18
        L_0x0ce8:
            r12 = r7
            goto L_0x0cd2
        L_0x0cea:
            java.lang.String r1 = "viewContext"
            goto L_0x0cef
        L_0x0ced:
            java.lang.String r1 = "loggingContext"
        L_0x0cef:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0cf7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0cfc:
            X.SUj r0 = (X.SUj) r0
            boolean r1 = X.SUj.A0T(r0)
            if (r1 != 0) goto L_0x0d0a
            boolean r1 = X.SUj.A0V(r0)
            if (r1 == 0) goto L_0x0d18
        L_0x0d0a:
            java.lang.Object r2 = r4.A01
            X.Qep r2 = (X.C8002Qep) r2
            X.0qQ.A0A(r0)
            java.lang.Object r1 = r4.A02
            X.QFQ r1 = (X.QFQ) r1
            r2.A0B(r1, r0)
        L_0x0d18:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59103J6l.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59103J6l(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
