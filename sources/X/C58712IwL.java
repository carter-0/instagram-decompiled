package X;

/* renamed from: X.IwL  reason: case insensitive filesystem */
public final class C58712IwL extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58712IwL(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C58712IwL(obj, i));
    }

    public static C58712IwL A01(Object obj, int i) {
        return new C58712IwL(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0391, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02ba, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02c1, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0392;
                case 1: goto L_0x0005;
                case 2: goto L_0x038a;
                case 3: goto L_0x0380;
                case 4: goto L_0x0377;
                case 5: goto L_0x0368;
                case 6: goto L_0x0361;
                case 7: goto L_0x033e;
                case 8: goto L_0x032f;
                case 9: goto L_0x0253;
                case 10: goto L_0x0221;
                case 11: goto L_0x0361;
                case 12: goto L_0x0399;
                case 13: goto L_0x0392;
                case 14: goto L_0x0005;
                case 15: goto L_0x01f5;
                case 16: goto L_0x01dd;
                case 17: goto L_0x0361;
                case 18: goto L_0x01d2;
                case 19: goto L_0x01bb;
                case 20: goto L_0x01b2;
                case 21: goto L_0x015c;
                case 22: goto L_0x014f;
                case 23: goto L_0x0399;
                case 24: goto L_0x0392;
                case 25: goto L_0x0005;
                case 26: goto L_0x038a;
                case 27: goto L_0x0145;
                case 28: goto L_0x013a;
                case 29: goto L_0x0130;
                case 30: goto L_0x0121;
                case 31: goto L_0x00f1;
                case 32: goto L_0x00e1;
                case 33: goto L_0x0097;
                case 34: goto L_0x0399;
                case 35: goto L_0x0392;
                case 36: goto L_0x0005;
                case 37: goto L_0x0089;
                case 38: goto L_0x0075;
                case 39: goto L_0x004a;
                case 40: goto L_0x0040;
                case 41: goto L_0x000c;
                case 42: goto L_0x0037;
                case 43: goto L_0x002d;
                case 44: goto L_0x0399;
                case 45: goto L_0x0392;
                case 46: goto L_0x0005;
                case 47: goto L_0x0399;
                case 48: goto L_0x0392;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.07f r4 = X.DbY.A0I(r0)
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r2 = r13.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.os.Bundle r0 = r2.requireArguments()
            java.lang.String r1 = "clips_template_browser_v2_type"
            java.io.Serializable r0 = r0.getSerializable(r1)
            if (r0 != 0) goto L_0x001e
            r4 = 0
            return r4
        L_0x001e:
            android.os.Bundle r0 = r2.requireArguments()
            java.io.Serializable r4 = r0.getSerializable(r1)
            if (r4 != 0) goto L_0x000b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x002d:
            java.lang.Object r0 = r13.A01
            X.H1I r0 = (X.H1I) r0
            X.Idh r4 = new X.Idh
            r4.<init>(r0)
            return r4
        L_0x0037:
            java.lang.Object r1 = r13.A01
            r0 = 5
            X.GiT r4 = new X.GiT
            r4.<init>(r1, r0)
            return r4
        L_0x0040:
            java.lang.Object r0 = r13.A01
            X.H1I r0 = (X.H1I) r0
            X.Ide r4 = new X.Ide
            r4.<init>(r0)
            return r4
        L_0x004a:
            java.lang.Object r2 = r13.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r0 = r2.requireContext()
            int r1 = X.AnonymousClass0nB.A01(r0)
            android.content.Context r0 = r2.requireContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            int r0 = r0 * 2
            int r1 = r1 - r0
            android.content.Context r0 = r2.requireContext()
            int r0 = X.DbY.A01(r0)
            int r1 = r1 - r0
            float r1 = (float) r1
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r1 = r1 / r0
            int r0 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0075:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0089:
            java.lang.Object r0 = r13.A01
            android.content.Context r2 = X.DbT.A08(r0)
            r1 = 1
            r0 = 0
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0097:
            java.lang.Object r2 = r13.A01
            X.H1e r2 = (X.C54160H1e) r2
            android.content.Context r1 = r2.requireContext()
            java.lang.String r0 = "https://help.instagram.com/1052265019655889"
            X.FH7.A03(r1, r0)
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.Hzn r0 = (X.C56516Hzn) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.27r r0 = (X.27r) r0
            X.29R r2 = r0.A09
            X.0wc r0 = r2.A01
            X.1Ln r1 = X.1Ln.A08(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = "IG_CAMERA_ENTITY_TAP"
            r1.A0t(r0)
            java.lang.String r0 = "SPINS_LEARN_MORE"
            r1.A0r(r0)
            X.29R.A00(r1, r2)
            X.AnonymousClass7TF.A18(r1)
            X.28D r0 = X.28D.A1a
            r1.A0b(r0)
            X.4yP r0 = X.C279294yP.CLIPS_SPIN
            r1.A0a(r0)
            r1.Cgf()
            goto L_0x038f
        L_0x00e1:
            java.lang.Object r0 = r13.A01
            X.H1e r0 = (X.C54160H1e) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Hzn r4 = new X.Hzn
            r4.<init>(r0)
            return r4
        L_0x00f1:
            java.lang.Object r4 = r13.A01
            X.H1e r4 = (X.C54160H1e) r4
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "stripped_media_id"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x0104
            r3 = r2
        L_0x0104:
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "element_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0111
            r2 = r0
        L_0x0111:
            X.0eM r0 = r4.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.H6R r4 = new X.H6R
            r4.<init>(r1, r3, r2)
            return r4
        L_0x0121:
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 25
            X.C58099ImL.A01(r2, r1, r0)
            goto L_0x038f
        L_0x0130:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hqf r4 = new X.Hqf
            r4.<init>(r0)
            return r4
        L_0x013a:
            java.lang.Object r0 = r13.A01
            X.Hzn r0 = (X.C56516Hzn) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.27r r4 = X.27p.A01(r0)
            return r4
        L_0x0145:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hzn r4 = new X.Hzn
            r4.<init>(r0)
            return r4
        L_0x014f:
            java.lang.Object r0 = r13.A01
            X.H1Z r0 = (X.H1Z) r0
            X.7Pu r0 = r0.A00
            if (r0 == 0) goto L_0x038f
            r0.A07()
            goto L_0x038f
        L_0x015c:
            java.lang.Object r2 = r13.A01
            X.H1Z r2 = (X.H1Z) r2
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "spins_author_name"
            java.lang.String r6 = r1.getString(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "spins_content"
            java.lang.String r7 = r1.getString(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r8 = r1.getString(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "is_spins_liked"
            boolean r11 = r1.getBoolean(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "spins_like_count"
            int r10 = r1.getInt(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "spins_timestamp"
            java.lang.String r9 = r1.getString(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "is_spin_author_reachable"
            boolean r12 = r1.getBoolean(r0)
            X.H6t r4 = new X.H6t
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x01b2:
            java.lang.Object r0 = r13.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r4 = r0.A00()
            return r4
        L_0x01bb:
            java.lang.Object r2 = r13.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.1vn r1 = X.1vm.A01(r2)
            X.HlV r0 = new X.HlV
            r0.<init>(r2, r1)
            X.HDc r4 = new X.HDc
            r4.<init>(r2, r0)
            return r4
        L_0x01d2:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YM r4 = r0.getDefaultViewModelProviderFactory()
            return r4
        L_0x01dd:
            java.lang.Object r3 = r13.A01
            X.H1h r3 = (X.C54163H1h) r3
            android.content.Context r2 = r3.requireContext()
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0gy r0 = X.AnonymousClass07i.A00(r3)
            X.LO3 r4 = new X.LO3
            r4.<init>(r2, r0, r1)
            return r4
        L_0x01f5:
            java.lang.Object r7 = r13.A01
            X.H1A r7 = (X.H1A) r7
            java.lang.String r10 = r7.A03
            if (r10 != 0) goto L_0x0207
            java.lang.String r0 = "attributionAppId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0207:
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            X.0eM r0 = r7.A0E
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r9 = r7.A0D
            X.0gy r6 = X.AnonymousClass07i.A00(r7)
            X.C51972G9s.A1C(r8, r9)
            r11 = 0
            X.H6m r4 = new X.H6m
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x0221:
            java.lang.Object r8 = r13.A01
            X.H1D r8 = (X.H1D) r8
            X.9cM r0 = r8.A03
            if (r0 != 0) goto L_0x022d
            java.lang.String r1 = "arguments"
            goto L_0x02ba
        L_0x022d:
            java.lang.String r11 = r0.A02
            android.content.Context r5 = r8.requireContext()
            X.0eM r0 = r8.A0G
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.0gy r6 = X.AnonymousClass07i.A00(r8)
            java.lang.String r10 = r8.A0D
            X.H2k r7 = r8.A05
            if (r7 != 0) goto L_0x0246
            java.lang.String r1 = "remixPivotPagePerfLogger"
            goto L_0x02ba
        L_0x0246:
            X.DbY.A1S(r11, r9)
            r0 = 5
            X.0qQ.A0B(r10, r0)
            X.H6q r4 = new X.H6q
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x0253:
            java.lang.Object r2 = r13.A01
            X.H1D r2 = (X.H1D) r2
            X.0eM r0 = r2.A0F
            java.lang.Object r0 = r0.getValue()
            X.Ggp r0 = (X.C52998Ggp) r0
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            X.Jw5 r0 = (X.C61067Jw5) r0
            if (r0 == 0) goto L_0x038f
            java.lang.Object r0 = r0.A02
            X.GnB r0 = (X.C53381GnB) r0
            if (r0 == 0) goto L_0x038f
            java.lang.String r7 = r0.A08
            if (r7 == 0) goto L_0x038f
            X.0eM r6 = r2.A0G
            X.0lg r5 = X.DbT.A0X(r6)
            X.1a1 r4 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r9 = "clips_remix_page"
            java.lang.String r0 = "remix_pivot_page"
            X.Dfc r0 = X.C46548Dgp.A02(r1, r7, r0, r9)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r0.A04()
            android.os.Bundle r1 = r4.A01(r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.C51974G9v.A0f(r0, r1, r2, r5)
            X.1Xj r0 = r2.A07
            if (r0 == 0) goto L_0x038f
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r6)
            X.1Xj r5 = r2.A07
            java.lang.String r8 = "Required value was null."
            if (r5 == 0) goto L_0x032a
            X.9cM r0 = r2.A03
            java.lang.String r1 = "arguments"
            if (r0 == 0) goto L_0x02ba
            java.lang.String r4 = r0.A03
            int r7 = r0.A01
            X.1Xj r0 = r2.A06
            if (r0 != 0) goto L_0x02c2
            java.lang.String r1 = "media"
        L_0x02ba:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02c2:
            java.lang.String r3 = r0.A30()
            if (r3 == 0) goto L_0x0325
            X.AnonymousClass7TG.A1P(r6, r4)
            X.0wc r1 = X.AnonymousClass0kN.A01(r2, r6)
            java.lang.String r0 = "instagram_organic_clips_remix_page_owner_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            X.HOu r0 = X.C54689HOu.A0B
            X.C51965G9l.A1C(r0, r2)
            X.C51965G9l.A1M(r2, r9)
            java.lang.String r0 = r5.A30()
            if (r0 == 0) goto L_0x0320
            X.G9t.A1J(r2, r0)
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r3)
            X.C51965G9l.A1F(r2, r0)
            java.lang.String r0 = X.C51972G9s.A0r(r6, r5)
            X.4Ny r1 = X.C263944Ny.A00(r0)
            java.lang.String r0 = "media_author_id"
            r2.AAE(r1, r0)
            long r0 = (long) r7
            X.C51970G9q.A19(r2, r0)
            X.C51965G9l.A1N(r2, r4)
            X.C51974G9v.A0o(r2, r5)
            com.instagram.user.model.User r0 = r5.A2A(r6)
            if (r0 == 0) goto L_0x031b
            java.lang.String r0 = r0.getId()
            X.4Ny r1 = X.C263944Ny.A00(r0)
            java.lang.String r0 = "target_id"
            r2.AAE(r1, r0)
            X.AnonymousClass7TH.A0V(r2)
            goto L_0x038f
        L_0x031b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0320:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0325:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x032a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x032f:
            java.lang.Object r0 = r13.A01
            X.H1D r0 = (X.H1D) r0
            X.0eM r0 = r0.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2nF r4 = X.C229342nE.A00(r0)
            return r4
        L_0x033e:
            java.lang.Object r8 = r13.A01
            X.H1F r8 = (X.H1F) r8
            androidx.fragment.app.FragmentActivity r5 = r8.requireActivity()
            android.content.Context r6 = r8.requireContext()
            X.0eM r0 = r8.A0O
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.0gy r7 = X.AnonymousClass07i.A00(r8)
            java.lang.String r10 = r8.A0M
            r0 = 2
            X.DbW.A1N(r9, r0, r10)
            r11 = 1
            X.H6l r4 = new X.H6l
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x0361:
            java.lang.Object r0 = r13.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x0368:
            java.lang.Object r0 = r13.A01
            X.H1F r0 = (X.H1F) r0
            X.0eM r0 = r0.A0O
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2nF r4 = X.C229342nE.A00(r0)
            return r4
        L_0x0377:
            java.lang.Object r0 = r13.A01
            X.0lg r0 = (X.0lg) r0
            X.1QP r4 = X.AnonymousClass1QO.A00(r0)
            return r4
        L_0x0380:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HlU r4 = new X.HlU
            r4.<init>(r0)
            return r4
        L_0x038a:
            java.lang.Object r0 = r13.A01
            X.DbS.A1U(r0)
        L_0x038f:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0392:
            java.lang.Object r0 = r13.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0399:
            java.lang.Object r4 = r13.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58712IwL.invoke():java.lang.Object");
    }
}
