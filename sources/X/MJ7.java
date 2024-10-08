package X;

public final class MJ7 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ7(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v28, types: [X.RVp, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f3, code lost:
        ((X.2bu) r0.getValue()).DbJ((X.AnonymousClass4UE) r5.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0181, code lost:
        return r3.A00(r2, new X.C51797G2g(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0303, code lost:
        r0 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x032f, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0334, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r22 = this;
            r5 = r22
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x0026;
                case 2: goto L_0x0026;
                case 3: goto L_0x0026;
                case 4: goto L_0x0026;
                case 5: goto L_0x0026;
                case 6: goto L_0x0026;
                case 7: goto L_0x0026;
                case 8: goto L_0x0026;
                case 9: goto L_0x0007;
                case 10: goto L_0x003c;
                case 11: goto L_0x0050;
                case 12: goto L_0x0007;
                case 13: goto L_0x0066;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x006e;
                case 17: goto L_0x007e;
                case 18: goto L_0x00ed;
                case 19: goto L_0x0102;
                case 20: goto L_0x0007;
                case 21: goto L_0x013c;
                case 22: goto L_0x0157;
                case 23: goto L_0x0168;
                case 24: goto L_0x0007;
                case 25: goto L_0x0182;
                case 26: goto L_0x0194;
                case 27: goto L_0x0194;
                case 28: goto L_0x01a0;
                case 29: goto L_0x01aa;
                case 30: goto L_0x01c0;
                case 31: goto L_0x01fe;
                case 32: goto L_0x0233;
                case 33: goto L_0x0241;
                case 34: goto L_0x0290;
                case 35: goto L_0x029a;
                case 36: goto L_0x02a8;
                case 37: goto L_0x02b6;
                case 38: goto L_0x0007;
                case 39: goto L_0x02c6;
                case 40: goto L_0x02e3;
                case 41: goto L_0x02f0;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x02fb;
                case 45: goto L_0x0306;
                case 46: goto L_0x0329;
                case 47: goto L_0x0335;
                case 48: goto L_0x0343;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r4 = r0.invoke()
            if (r4 != 0) goto L_0x0025
        L_0x0013:
            java.lang.Object r0 = r5.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0039
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0039
            X.2YQ r4 = r1.getDefaultViewModelCreationExtras()
        L_0x0025:
            return r4
        L_0x0026:
            java.lang.Object r0 = r5.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0032
            java.lang.Object r4 = r0.invoke()
            if (r4 != 0) goto L_0x0025
        L_0x0032:
            java.lang.Object r0 = r5.A02
            X.2YQ r4 = X.JTU.A08(r0)
            return r4
        L_0x0039:
            X.2YP r4 = X.AnonymousClass2YP.A00
            return r4
        L_0x003c:
            java.lang.Object r0 = r5.A02
            X.KUo r0 = (X.C61991KUo) r0
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r0 = r5.A01
            com.instagram.api.schemas.MusicProduct r0 = (com.instagram.api.schemas.MusicProduct) r0
            X.KCw r4 = new X.KCw
            r4.<init>(r0, r1)
            return r4
        L_0x0050:
            java.lang.Object r3 = r5.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r5.A01
            X.7aR r2 = (X.C333967aR) r2
            X.5mt r1 = X.C294695ms.A00(r3)
            X.2f1 r0 = X.AnonymousClass2f1.A00(r3)
            com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository r4 = new com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository
            r4.<init>(r3, r0, r1, r2)
            return r4
        L_0x0066:
            java.lang.Object r0 = r5.A02
            X.E6l r0 = (X.C47525E6l) r0
            X.0eM r0 = r0.A0A
            goto L_0x00f3
        L_0x006e:
            java.lang.Object r2 = r5.A01
            X.F3p r2 = (X.C49725F3p) r2
            java.lang.Object r0 = r5.A02
            X.GmF r0 = (X.C53329GmF) r0
            com.instagram.user.model.User r1 = r0.A01
            r0 = 0
            r2.A01(r1, r0, r0)
            goto L_0x0332
        L_0x007e:
            java.lang.Object r6 = r5.A01
            X.F2T r6 = (X.F2T) r6
            java.lang.Object r0 = r5.A02
            X.GmA r0 = (X.C53324GmA) r0
            X.3UM r2 = r0.A01
            int r0 = r0.A00
            r11 = 0
            X.0qQ.A0B(r2, r11)
            X.E7a r3 = r6.A01
            com.instagram.user.model.User r8 = r2.CCd()
            X.0qQ.A0B(r8, r11)
            X.7aW r7 = r3.A02
            r4 = 3
            X.G2b r9 = new X.G2b
            r9.<init>(r3, r4)
            r1 = 8
            X.G4U r10 = new X.G4U
            r10.<init>(r3, r1)
            r12 = r11
            r7.A06(r8, r9, r10, r11, r12)
            java.lang.String r3 = r2.getId()
            X.2om r5 = r6.A02
            java.lang.String r7 = r5.A02
            r1 = 3171(0xc63, float:4.444E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r1)
            r8 = 0
            r1 = 2
            X.0qQ.A0B(r3, r1)
            X.0qQ.A0B(r7, r4)
            java.lang.String r11 = ""
            java.lang.String r6 = r2.getAlgorithm()
            java.lang.String r1 = r2.CDC()
            if (r1 == 0) goto L_0x00cd
            r11 = r1
        L_0x00cd:
            java.lang.String r16 = r2.BxN()
            java.lang.String r17 = r2.C8Y()
            com.instagram.user.model.User r1 = r2.CCd()
            java.lang.String r15 = X.C230012om.A00(r1)
            r21 = -1
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r18 = r3
            r20 = r0
            X.C230012om.A06(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0332
        L_0x00ed:
            java.lang.Object r0 = r5.A02
            com.instagram.newsfeed.fragment.NewsfeedFragment r0 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r0
            X.0eM r0 = r0.A08
        L_0x00f3:
            java.lang.Object r1 = r0.getValue()
            X.2bu r1 = (X.2bu) r1
            java.lang.Object r0 = r5.A01
            X.4UE r0 = (X.AnonymousClass4UE) r0
            r1.DbJ(r0)
            goto L_0x0332
        L_0x0102:
            java.lang.Object r0 = r5.A02
            X.Dcv r0 = (X.C46352Dcv) r0
            X.0eM r1 = r0.A0H
            java.lang.Object r0 = r1.getValue()
            X.DgC r0 = (X.C46509DgC) r0
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.0qQ.A07(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.getValue()
            X.DgC r0 = (X.C46509DgC) r0
            java.util.concurrent.atomic.AtomicReference r0 = r0.A03
            java.lang.Object r1 = r0.get()
            X.0qQ.A07(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JV1 r0 = (X.JV1) r0
            java.lang.Object r0 = r0.A05
            X.JV2 r0 = (X.JV2) r0
            X.JV7 r4 = new X.JV7
            r4.<init>((X.JV2) r0, (java.lang.String) r2, (java.lang.String) r1)
            return r4
        L_0x013c:
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = X.00k.A0L(r0)
            boolean r0 = r1 instanceof X.GRB
            if (r0 == 0) goto L_0x0332
            X.GRB r1 = (X.GRB) r1
            if (r1 == 0) goto L_0x0332
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0332
            java.lang.Object r0 = r5.A02
            X.DbS.A1U(r0)
            goto L_0x0332
        L_0x0157:
            java.lang.Object r0 = r5.A02
            X.8ZA r0 = (X.AnonymousClass8ZA) r0
            java.lang.Object r4 = r5.A01
            X.8Z0 r0 = r0.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<X.Dgy> r2 = X.C46556Dgy.class
            r1 = 31
            goto L_0x0178
        L_0x0168:
            java.lang.Object r0 = r5.A02
            X.8ZA r0 = (X.AnonymousClass8ZA) r0
            java.lang.Object r4 = r5.A01
            X.8Z0 r0 = r0.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<X.Dd7> r2 = X.Dd7.class
            r1 = 32
        L_0x0178:
            X.G2g r0 = new X.G2g
            r0.<init>(r4, r1)
            X.3pa r4 = r3.A00(r2, r0)
            return r4
        L_0x0182:
            java.lang.Object r2 = r5.A02
            X.6D9 r2 = (X.AnonymousClass6D9) r2
            java.lang.Object r0 = r5.A01
            X.5Oz r0 = (X.C284945Oz) r0
            boolean r1 = X.C51971G9r.A1W(r0)
            r0 = 0
            r2.A02(r0, r1)
            goto L_0x0332
        L_0x0194:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
            X.Hns r0 = (X.C55812Hns) r0
            X.4bN r0 = r0.A01
            goto L_0x032f
        L_0x01a0:
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94m r4 = new X.94m
            r4.<init>(r0)
            return r4
        L_0x01aa:
            X.02m r1 = X.C51965G9l.A0l()
            java.lang.Object r0 = r5.A02
            X.LB6 r0 = (X.LB6) r0
            X.0eM r0 = r0.A09
            r0.getValue()
            r0 = 424096228(0x194731e4, float:1.0298134E-23)
            X.3zy r4 = new X.3zy
            r4.<init>(r1, r0)
            return r4
        L_0x01c0:
            java.lang.Object r1 = r5.A02
            X.LB6 r1 = (X.LB6) r1
            X.0eM r0 = r1.A09
            java.lang.Object r10 = r0.getValue()
            X.94O r10 = (X.AnonymousClass94O) r10
            java.lang.Object r5 = r5.A01
            X.3zt r5 = (X.C258943zt) r5
            X.0eM r0 = r1.A08
            java.lang.Object r9 = r0.getValue()
            X.3zi r9 = (X.C258833zi) r9
            X.0eM r0 = r1.A06
            java.lang.Object r8 = r0.getValue()
            X.3zy r8 = (X.C258993zy) r8
            X.0eM r0 = r1.A02
            java.lang.Object r7 = r0.getValue()
            X.AT8 r7 = (X.AT8) r7
            X.0eM r0 = r1.A00
            java.lang.Object r6 = r0.getValue()
            X.406 r6 = (X.AnonymousClass406) r6
            X.0eM r0 = r1.A05
            java.lang.Object r11 = X.AnonymousClass7TE.A14(r0)
            X.3z9 r11 = (X.C258483z9) r11
            X.407 r4 = new X.407
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x01fe:
            java.lang.Object r0 = r5.A02
            X.LB6 r0 = (X.LB6) r0
            X.0eM r4 = r0.A09
            java.lang.Object r0 = r4.getValue()
            X.94O r0 = (X.AnonymousClass94O) r0
            X.0gq r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x022c
            r0 = 2342163361498145112(0x2081092b00082158, double:4.065884587568514E-152)
            boolean r0 = r3.Agw(r0)
            if (r0 != r2) goto L_0x022c
            java.lang.Object r1 = r4.getValue()
            X.94O r1 = (X.AnonymousClass94O) r1
            X.L8L r0 = new X.L8L
            r0.<init>(r1)
            X.0eM r0 = r0.A01
        L_0x0227:
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x022c:
            java.lang.Object r0 = r5.A01
            X.A7I r0 = (X.A7I) r0
            X.0eM r0 = r0.A03
            goto L_0x0227
        L_0x0233:
            java.lang.Object r1 = r5.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            X.94s r4 = new X.94s
            r4.<init>(r1, r0)
            return r4
        L_0x0241:
            java.lang.Object r2 = r5.A01
            X.3zZ r2 = (X.C258743zZ) r2
            boolean r0 = r2.CaD()
            if (r0 == 0) goto L_0x025e
            X.RVp r1 = new X.RVp
            r1.<init>()
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.S4A r0 = X.C9265RVq.A00(r0)
            X.So9 r4 = new X.So9
            r4.<init>(r1, r0, r2)
            return r4
        L_0x025e:
            X.TXo r9 = X.C13379TXo.A00
            X.TXp r8 = X.C13380TXp.A00
            X.TXq r7 = X.C13381TXq.A00
            X.TXr r6 = X.C13382TXr.A00
            X.MOY r5 = X.MOY.A00
            long r3 = r2.BTh()
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0279
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x027f
            r9 = r8
        L_0x0279:
            X.ATA r4 = new X.ATA
            r4.<init>(r9)
            return r4
        L_0x027f:
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0287
            r9 = r7
            goto L_0x0279
        L_0x0287:
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r9 = r5
            if (r0 != 0) goto L_0x0279
            r9 = r6
            goto L_0x0279
        L_0x0290:
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94o r4 = new X.94o
            r4.<init>(r0)
            return r4
        L_0x029a:
            java.lang.Object r1 = r5.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            X.2KL r4 = new X.2KL
            r4.<init>(r1, r0)
            return r4
        L_0x02a8:
            java.lang.Object r1 = r5.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            X.T79 r4 = new X.T79
            r4.<init>(r1, r0)
            return r4
        L_0x02b6:
            java.lang.Object r1 = r5.A01
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            java.lang.Object r0 = r5.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
            r1.onClick(r0)
            goto L_0x0332
        L_0x02c6:
            java.lang.Object r0 = r5.A01
            X.5Oz r0 = (X.C284945Oz) r0
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            r0.Epw(r4)
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A4L
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 455(0x1c7, float:6.38E-43)
            X.DbS.A1a(r3, r4, r2, r1, r0)
            goto L_0x0332
        L_0x02e3:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
            X.JOQ r0 = (X.JOQ) r0
            X.GqO r0 = (X.C53553GqO) r0
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r0 = r0.A00
            goto L_0x032f
        L_0x02f0:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
            X.Dry r0 = (X.C47183Dry) r0
            com.instagram.opal.impl.data.OpalProfileData r0 = r0.A05
            goto L_0x0303
        L_0x02fb:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
            com.instagram.opal.impl.data.OpalProfileData r0 = (com.instagram.opal.impl.data.OpalProfileData) r0
        L_0x0303:
            java.lang.String r0 = r0.A05
            goto L_0x032f
        L_0x0306:
            java.lang.Object r3 = r5.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0xa r1 = X.AnonymousClass7TE.A0q(r3)
            r0 = 862(0x35e, float:1.208E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            int r1 = X.DbT.A00(r1, r2)
            X.1Av r0 = X.1Au.A00(r3)
            int r1 = r1 + 1
            X.0xa r0 = r0.A01
            X.AnonymousClass7TG.A1M(r0, r2, r1)
            java.lang.Object r0 = r5.A01
            X.C51969G9p.A1M(r0)
            goto L_0x0332
        L_0x0329:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
        L_0x032f:
            r1.invoke(r0)
        L_0x0332:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0335:
            java.lang.Object r1 = r5.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2KM r4 = new X.2KM
            r4.<init>(r1, r0)
            return r4
        L_0x0343:
            java.lang.Object r2 = r5.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.12T r0 = X.AnonymousClass12T.A00
            com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger r4 = new com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger
            r4.<init>(r2, r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MJ7.invoke():java.lang.Object");
    }
}
