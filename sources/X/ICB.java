package X;

import android.view.View;

public final class ICB implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ICB(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x037f: MOVE  (r2v9 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r2v8 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.A00
            r6 = r24
            switch(r1) {
                case 0: goto L_0x03a8;
                case 1: goto L_0x0327;
                case 2: goto L_0x02fe;
                case 3: goto L_0x02d5;
                case 4: goto L_0x02ad;
                case 5: goto L_0x0286;
                case 6: goto L_0x025f;
                case 7: goto L_0x0238;
                case 8: goto L_0x020d;
                case 9: goto L_0x019e;
                case 10: goto L_0x0171;
                case 11: goto L_0x014b;
                case 12: goto L_0x0123;
                case 13: goto L_0x00fb;
                case 14: goto L_0x00b2;
                case 15: goto L_0x0072;
                case 16: goto L_0x0033;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = -339100884(0xffffffffebc9bb2c, float:-4.8775597E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A04
            X.GCf r2 = (X.C52033GCf) r2
            X.JTB r2 = r2.A0F
            java.lang.Object r4 = r0.A01
            X.4bN r4 = (X.C267324bN) r4
            java.lang.Object r5 = r0.A02
            X.GDe r5 = (X.C52058GDe) r5
            java.lang.Object r3 = r0.A03
            android.view.View r3 = (android.view.View) r3
            r0 = 4076(0xfec, float:5.712E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r7 = 0
            r2.Djp(r3, r4, r5, r6, r7)
            r0 = -224185889(0xfffffffff2a331df, float:-6.4648124E30)
        L_0x002f:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0033:
            r1 = -1859855012(0xffffffff9124dd5c, float:-1.300553E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A04
            X.GBI r3 = (X.GBI) r3
            java.lang.Object r7 = r0.A01
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r0.A03
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            X.4DU r5 = r3.A05
            com.instagram.common.session.UserSession r6 = r3.A04
            java.lang.String r8 = X.C51972G9s.A0n()
            X.HOu r4 = X.C54689HOu.A0E
            java.lang.String r9 = r0.A05()
            X.0qQ.A07(r9)
            int r0 = r2.getPosition()
            long r10 = (long) r0
            X.C52086GEg.A0O(r4, r5, r6, r7, r8, r9, r10)
            com.instagram.model.venue.Venue r2 = r7.A23()
            if (r2 == 0) goto L_0x006e
            androidx.fragment.app.FragmentActivity r0 = r3.A01
            X.C52273GLp.A05(r0, r6, r2)
        L_0x006e:
            r0 = -1517078992(0xffffffffa5933630, float:-2.5537154E-16)
            goto L_0x002f
        L_0x0072:
            r1 = -1226629175(0xffffffffb6e31fc9, float:-6.7688275E-6)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A04
            X.GHU r8 = (X.GHU) r8
            X.JTB r7 = r8.A07
            java.lang.Object r2 = r0.A03
            X.2Wc r2 = (X.C70832Wc) r2
            X.2V1 r6 = r2.Aqq()
            java.lang.Object r5 = r0.A01
            X.4bN r2 = r8.A02
            X.1Xj r2 = r2.A02
            if (r2 == 0) goto L_0x00b0
            java.lang.String r4 = X.C51966G9m.A1D(r2)
        L_0x0093:
            r3 = 6
            X.JwH r2 = new X.JwH
            r2.<init>((java.lang.Object) r6, (java.lang.Object) r5, (java.lang.String) r4, (int) r3)
            r7.Cx6(r2)
            com.instagram.common.session.UserSession r3 = r8.A04
            X.4DU r5 = r8.A06
            java.lang.Object r4 = r0.A02
            X.1Xj r4 = (X.1Xj) r4
            X.GKd r2 = X.C52236GKd.A0J
            r7 = 1
            java.lang.String r6 = "auto_translated_attribution_label"
            X.C52086GEg.A0D(r2, r3, r4, r5, r6, r7)
            r0 = 1988348841(0x7683cba9, float:1.3365656E33)
            goto L_0x002f
        L_0x00b0:
            r4 = 0
            goto L_0x0093
        L_0x00b2:
            r1 = 637679074(0x260235e2, float:4.5175835E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A04
            X.GCb r5 = (X.C52029GCb) r5
            java.lang.Object r7 = r0.A01
            X.4bN r7 = (X.C267324bN) r7
            java.lang.Object r8 = r0.A02
            X.GDe r8 = (X.C52058GDe) r8
            java.lang.Object r10 = r0.A03
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            X.HLF r9 = X.AnonymousClass3ZC.A01(r7)
            com.instagram.common.session.UserSession r4 = r5.A0C
            r21 = 0
            X.0Tu r0 = X.0Tu.A06
            r2 = 2342171461806275945(0x2081108900053d69, double:4.072752961733604E-152)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x00f8
            r18 = 0
        L_0x00e0:
            r6 = 0
            java.lang.String r17 = "name"
            java.lang.String r19 = "primary"
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r20 = r6
            r22 = r21
            r5.Da6(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = -1854527678(0xffffffff91762742, float:-1.9418076E-28)
            goto L_0x002f
        L_0x00f8:
            java.lang.String r18 = "username_tap"
            goto L_0x00e0
        L_0x00fb:
            r1 = -227901075(0xfffffffff26a816d, float:-4.6448613E30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.HmY r5 = (X.C55737HmY) r5
            X.0sP r3 = r5.A02
            java.lang.Object r2 = r0.A03
            r3.invoke(r2)
            java.lang.Object r2 = r0.A04
            X.HqZ r2 = (X.C55968HqZ) r2
            com.instagram.common.session.UserSession r4 = r2.A01
            X.0iw r3 = r2.A00
            java.lang.Object r2 = r0.A02
            com.instagram.save.model.SavedCollection r2 = (com.instagram.save.model.SavedCollection) r2
            java.lang.Integer r0 = r5.A01
            X.I33.A01(r3, r4, r2, r0)
            r0 = -1484023323(0xffffffffa78b99e5, float:-3.8747103E-15)
            goto L_0x002f
        L_0x0123:
            r1 = -2066293521(0xffffffff84d6dcef, float:-5.0514054E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.HmY r5 = (X.C55737HmY) r5
            X.0sP r3 = r5.A02
            java.lang.Object r2 = r0.A03
            r3.invoke(r2)
            java.lang.Object r2 = r0.A04
            X.HqZ r2 = (X.C55968HqZ) r2
            com.instagram.common.session.UserSession r4 = r2.A01
            X.0iw r3 = r2.A00
            java.lang.Object r2 = r0.A02
            com.instagram.save.model.SavedCollection r2 = (com.instagram.save.model.SavedCollection) r2
            java.lang.Integer r0 = r5.A01
            X.I33.A01(r3, r4, r2, r0)
            r0 = 400885310(0x17e5063e, float:1.4800354E-24)
            goto L_0x002f
        L_0x014b:
            r1 = 887284860(0x34e2e47c, float:4.2262025E-7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r4 = r0.A03
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            java.lang.Object r0 = r0.A04
            java.lang.String r5 = X.DbS.A0q(r0)
            int r6 = r4.getPosition()
            r7 = 0
            r2.D3K(r3, r4, r5, r6, r7)
            r0 = 1038005895(0x3ddeb687, float:0.10874658)
            goto L_0x002f
        L_0x0171:
            r1 = 585627186(0x22e7f632, float:6.2873345E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A04
            X.0lg r2 = (X.0lg) r2
            X.3Dp r3 = X.C238833Dp.A00(r2)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r3.A0B(r6, r2)
            java.lang.Object r4 = r0.A01
            X.3Wa r4 = (X.C242813Wa) r4
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A03
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            int r0 = r2.getPosition()
            r4.D2J(r3, r2, r0)
            r0 = 893030985(0x353a9249, float:6.950327E-7)
            goto L_0x002f
        L_0x019e:
            r1 = 1716922306(0x665627c2, float:2.5282996E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r9 = r0.A04
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r8 = r0.A01
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            X.2EG r12 = X.2EG.A4D
            java.lang.String r3 = "instagram_profile_visit"
            r2 = 1
            X.2kQ r11 = X.C227942kP.A01(r3, r2, r2)
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r3 = r0.A03
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.GlN r0 = r3.A06()
            X.4jb r10 = new X.4jb
            r10.<init>(r9, r5, r0)
            X.Q03 r7 = new X.Q03
            r7.<init>(r8, r9, r10, r11, r12)
            r7.A01(r5)
            int r0 = r3.A03
            r7.A09 = r0
            int r0 = r3.getPosition()
            r7.A0B = r0
            r7.A0K = r3
            android.view.View r6 = r8.mView
            if (r6 == 0) goto L_0x0205
            X.3Dp r4 = X.C51967G9n.A0X(r9)
            X.3Ds r0 = X.C238863Ds.BOTTOM_SHEET
            r4.A05(r6, r0)
            java.lang.String r0 = "instagram_deeplink"
            X.2kQ r3 = X.C227942kP.A01(r0, r2, r2)
            android.content.Context r0 = r8.getContext()
            X.6Q1 r2 = new X.6Q1
            r2.<init>(r0, r9, r5)
            X.3e7 r0 = new X.3e7
            r0.<init>(r2, r9, r5, r3)
            r4.A0A(r6, r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r4.A0B(r6, r0)
        L_0x0205:
            X.C51969G9p.A1L(r7)
            r0 = 54189550(0x33addee, float:5.491525E-37)
            goto L_0x002f
        L_0x020d:
            r1 = -1095659536(0xffffffffbeb18ff0, float:-0.34680128)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r9 = r0.A03
            X.3W1 r9 = (X.AnonymousClass3W1) r9
            java.lang.Object r6 = r0.A01
            com.instagram.feed.media.EffectPreviewIntf r6 = (com.instagram.feed.media.EffectPreviewIntf) r6
            java.lang.Object r2 = r0.A04
            X.Iae r2 = (X.C57434Iae) r2
            androidx.fragment.app.Fragment r0 = r2.A00
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = r2.A03
            X.0iw r4 = r2.A02
            X.4DU r8 = r2.A04
            X.C54984HaH.A00(r3, r4, r5, r6, r7, r8, r9)
            r0 = 1572854944(0x5dbfdca0, float:1.72813761E18)
            goto L_0x002f
        L_0x0238:
            r1 = 2055147119(0x7a7f0e6f, float:3.3108211E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A04
            X.HqX r2 = (X.C55966HqX) r2
            X.310 r2 = r2.A01
            X.3Wa r4 = r2.BQE()
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r0.A03
            X.3ha r0 = (X.C248203ha) r0
            int r0 = r0.A01
            r4.D2m(r3, r2, r0)
            r0 = 1950382639(0x74407a2f, float:6.0998485E31)
            goto L_0x002f
        L_0x025f:
            r1 = -1760174731(0xffffffff9715dd75, float:-4.8424015E-25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A04
            X.HqX r2 = (X.C55966HqX) r2
            X.310 r2 = r2.A01
            X.324 r4 = r2.BQk()
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r0.A03
            X.3ha r0 = (X.C248203ha) r0
            int r0 = r0.A01
            r4.DgZ(r3, r2, r0)
            r0 = 1055149157(0x3ee44c65, float:0.44589534)
            goto L_0x002f
        L_0x0286:
            r1 = 50992282(0x30a149a, float:4.0578205E-37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A04
            X.HqX r2 = (X.C55966HqX) r2
            X.310 r2 = r2.A01
            X.41G r4 = r2.BRE()
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r0.A03
            X.3ha r0 = (X.C248203ha) r0
            int r0 = r0.A01
            r4.Dji(r3, r2, r0)
            r0 = 730391407(0x2b88e36f, float:9.726507E-13)
            goto L_0x002f
        L_0x02ad:
            r1 = 602606262(0x23eb0ab6, float:2.5483287E-17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A04
            X.HqX r2 = (X.C55966HqX) r2
            X.310 r2 = r2.A01
            X.3vK r5 = r2.BRA()
            java.lang.Object r4 = r0.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r0.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r0 = r0.A03
            X.3ha r0 = (X.C248203ha) r0
            int r2 = r0.A01
            r0 = 0
            r5.D4g(r4, r3, r2, r0)
            r0 = 148015996(0x8d28b7c, float:1.2671708E-33)
            goto L_0x002f
        L_0x02d5:
            r1 = 614455326(0x249fd81e, float:6.9321375E-17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.WW4 r5 = (X.WW4) r5
            java.lang.Object r4 = r0.A04
            X.GSn r4 = (X.C52435GSn) r4
            X.1Xj r3 = r4.BPf()
            java.lang.Object r2 = r0.A03
            X.5qz r2 = (X.C296995qz) r2
            X.0qQ.A0A(r6)
            r5.DJt(r6, r2, r4, r3)
            java.lang.Object r0 = r0.A02
            X.GWp r0 = (X.C52538GWp) r0
            r0.A00()
            r0 = -362088438(0xffffffffea6af80a, float:-7.1014993E25)
            goto L_0x002f
        L_0x02fe:
            r1 = 717937667(0x2acadc03, float:3.6035072E-13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.WW4 r5 = (X.WW4) r5
            java.lang.Object r4 = r0.A04
            X.GSn r4 = (X.C52435GSn) r4
            X.1Xj r3 = r4.BPf()
            java.lang.Object r2 = r0.A03
            X.5qz r2 = (X.C296995qz) r2
            X.0qQ.A0A(r6)
            r5.DJt(r6, r2, r4, r3)
            java.lang.Object r0 = r0.A02
            X.GWp r0 = (X.C52538GWp) r0
            r0.A00()
            r0 = 130633343(0x7c94e7f, float:3.0289255E-34)
            goto L_0x002f
        L_0x0327:
            r1 = 2130240126(0x7ef8e27e, float:1.6541228E38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.1Xj r6 = (X.1Xj) r6
            if (r6 == 0) goto L_0x0393
            X.AnonymousClass1pc.A00()
            java.lang.Object r4 = r0.A04
            X.0lg r4 = (X.0lg) r4
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r2 = r3.requireContext()
            java.lang.Object r0 = r0.A03
            X.I03 r0 = (X.I03) r0
            java.lang.String r10 = r0.A03
            X.3W1 r8 = X.G9t.A18(r6)
            X.4DU r7 = r0.A00
            X.HMr r9 = X.C54660HMr.COMMENTS_CONTROLS
            X.UsH r5 = new X.UsH
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 2131976116(0x7f135fb4, float:1.9589343E38)
            java.lang.String r0 = X.C51967G9n.A0p(r2, r0)
            X.7Pr r4 = X.DbS.A0W(r4)
            r4.A0d = r0
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x03a0
            X.37D r0 = X.DbT.A0i(r0)
            if (r0 == 0) goto L_0x03a0
            X.7Pu r3 = X.C48943Emh.A00(r0)
            if (r3 == 0) goto L_0x0398
            androidx.fragment.app.Fragment r2 = r0.A09()
            if (r2 == 0) goto L_0x0387
            boolean r0 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0387
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
            if (r2 == 0) goto L_0x0387
            r0 = 0
            r2.A0T(r0)
        L_0x0387:
            r0 = 1
            X.DbS.A1S(r4, r0)
            r0 = 1060320051(0x3f333333, float:0.7)
            r4.A03 = r0
            r3.A0F(r5, r4)
        L_0x0393:
            r0 = -435334322(0xffffffffe60d534e, float:-1.668476E23)
            goto L_0x002f
        L_0x0398:
            X.7Pu r0 = r4.A00()
            r0.A03(r2, r5)
            goto L_0x0393
        L_0x03a0:
            java.lang.String r2 = "UpsellsPluginImpl"
            java.lang.String r0 = "Didn't find any BottomSheetNavigator where one was expected."
            X.0wb.A03(r2, r0)
            goto L_0x0393
        L_0x03a8:
            r1 = 1074545624(0x400c43d8, float:2.1916409)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A04
            X.VaM r6 = (X.C17568VaM) r6
            com.instagram.business.promote.model.PromoteData r5 = r6.A02
            java.lang.Object r2 = r0.A02
            com.instagram.leadgen.core.api.LeadForm r2 = (com.instagram.leadgen.core.api.LeadForm) r2
            r5.A16 = r2
            X.WYX r8 = r6.A01
            java.lang.Long r7 = r6.A04
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r0 = r0.getTag()
            java.lang.String r4 = r0.toString()
            java.lang.String r3 = "lead_gen_manage_lead_forms"
            java.lang.String r2 = "preview"
            java.lang.String r0 = "click"
            X.1Ln r3 = X.WYX.A00(r8, r7, r3, r2, r0)
            java.lang.Long r2 = X.DbZ.A0d(r4)
            java.lang.String r0 = "lead_form_id"
            r3.A0Q(r0, r2)
            r3.Cgf()
            X.1Wy r0 = X.C322576w3.A00()
            X.Vl8 r2 = r0.A01()
            r0 = 0
            X.Umm r3 = r2.A04(r0, r0)
            androidx.fragment.app.FragmentActivity r2 = r6.A00
            com.instagram.common.session.UserSession r0 = r5.A0y
            X.DbY.A14(r3, r2, r0)
            r0 = 222512178(0xd434432, float:6.01711E-31)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ICB.onClick(android.view.View):void");
    }
}
