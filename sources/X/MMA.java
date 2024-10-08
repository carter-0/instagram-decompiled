package X;

public final class MMA extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMA(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new MMA(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0078, code lost:
        r1 = r4.getParentFragmentManager();
        r2 = r4.requireActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0084, code lost:
        if (r1.A0M() <= 0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r1.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        com.instagram.aistudio.editor.AiSettingsRepository.A03(r3);
        X.JTO.A0S(r3.A03).A06();
        r2 = r3.requireActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e0, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0225, code lost:
        X.C51967G9n.A16(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02a8, code lost:
        return X.AnonymousClass7I4.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0 != null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02bf, code lost:
        return new X.KBJ(X.AnonymousClass7TE.A0l(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ca, code lost:
        return X.LTH.A03(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0244;
                case 1: goto L_0x0220;
                case 2: goto L_0x0007;
                case 3: goto L_0x024b;
                case 4: goto L_0x0252;
                case 5: goto L_0x025d;
                case 6: goto L_0x0264;
                case 7: goto L_0x0011;
                case 8: goto L_0x0018;
                case 9: goto L_0x0018;
                case 10: goto L_0x0274;
                case 11: goto L_0x001e;
                case 12: goto L_0x0041;
                case 13: goto L_0x025d;
                case 14: goto L_0x027b;
                case 15: goto L_0x0282;
                case 16: goto L_0x005d;
                case 17: goto L_0x008a;
                case 18: goto L_0x025d;
                case 19: goto L_0x0289;
                case 20: goto L_0x0290;
                case 21: goto L_0x00a7;
                case 22: goto L_0x00ac;
                case 23: goto L_0x00e5;
                case 24: goto L_0x010b;
                case 25: goto L_0x016f;
                case 26: goto L_0x0197;
                case 27: goto L_0x025d;
                case 28: goto L_0x0297;
                case 29: goto L_0x029e;
                case 30: goto L_0x0007;
                case 31: goto L_0x0204;
                case 32: goto L_0x020f;
                case 33: goto L_0x0007;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x021a;
                case 37: goto L_0x0220;
                case 38: goto L_0x0007;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x025d;
                case 43: goto L_0x02a9;
                case 44: goto L_0x022a;
                case 45: goto L_0x025d;
                case 46: goto L_0x02b0;
                case 47: goto L_0x0007;
                case 48: goto L_0x02c0;
                case 49: goto L_0x02cb;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x000b:
            r0.invoke()
        L_0x000e:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0011:
            java.lang.Object r0 = r1.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x000e
            goto L_0x000b
        L_0x0018:
            java.lang.Object r2 = r1.A01
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x00e0
        L_0x001e:
            java.lang.Object r4 = r1.A01
            X.K5m r4 = (X.C61392K5m) r4
            X.0eM r1 = r4.A05
            X.JjI r0 = X.JTO.A0S(r1)
            r0.A05()
            X.0eM r0 = r4.A02
            X.LTH r3 = X.JTO.A0T(r0)
            X.0eM r0 = r4.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            java.lang.String r1 = X.C60315JjI.A02(r1)
            java.lang.String r0 = "advanced_settings_editing"
            r3.A0P(r2, r1, r0)
            goto L_0x0078
        L_0x0041:
            java.lang.Object r1 = r1.A01
            X.K5m r1 = (X.C61392K5m) r1
            X.0eM r0 = r1.A02
            X.LTH r3 = X.JTO.A0T(r0)
            X.0eM r0 = r1.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A05
            java.lang.String r1 = X.C60315JjI.A02(r0)
            java.lang.String r0 = "advanced_settings_editing"
            r3.A0O(r2, r1, r0)
            goto L_0x000e
        L_0x005d:
            java.lang.Object r4 = r1.A01
            X.K5n r4 = (X.C61393K5n) r4
            X.0eM r0 = r4.A02
            X.LTH r3 = X.JTO.A0T(r0)
            X.0eM r0 = r4.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r4.A05
            java.lang.String r1 = X.C60315JjI.A02(r0)
            java.lang.String r0 = "advanced_settings_editing"
            r3.A0V(r2, r1, r0)
        L_0x0078:
            X.0hq r1 = r4.getParentFragmentManager()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            int r0 = r1.A0M()
            if (r0 <= 0) goto L_0x00e0
            r1.A0c()
            goto L_0x000e
        L_0x008a:
            java.lang.Object r1 = r1.A01
            X.K5n r1 = (X.C61393K5n) r1
            X.0eM r0 = r1.A02
            X.LTH r3 = X.JTO.A0T(r0)
            X.0eM r0 = r1.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A05
            java.lang.String r1 = X.C60315JjI.A02(r0)
            java.lang.String r0 = "advanced_settings_editing"
            r3.A0T(r2, r1, r0)
            goto L_0x000e
        L_0x00a7:
            java.lang.Object r3 = r1.A01
            X.K64 r3 = (X.K64) r3
            goto L_0x00d0
        L_0x00ac:
            java.lang.Object r3 = r1.A01
            X.K64 r3 = (X.K64) r3
            X.0eM r0 = r3.A01
            X.LTH r0 = X.JTO.A0T(r0)
            java.lang.String r2 = X.C60315JjI.A01(r3)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "settings_main_screen_exit_confirmation_discard_changes_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r2)
            r1.A0j(r0)
            r1.Cgf()
        L_0x00d0:
            com.instagram.aistudio.editor.AiSettingsRepository.A03(r3)
            X.0eM r0 = r3.A03
            X.JjI r0 = X.JTO.A0S(r0)
            r0.A06()
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
        L_0x00e0:
            r2.finish()
            goto L_0x000e
        L_0x00e5:
            java.lang.Object r1 = r1.A01
            X.K64 r1 = (X.K64) r1
            X.0eM r0 = r1.A01
            X.LTH r0 = X.JTO.A0T(r0)
            java.lang.String r2 = X.C60315JjI.A01(r1)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "settings_main_screen_exit_confirmation_cancel_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r2)
            r1.A0j(r0)
            r1.Cgf()
            goto L_0x000e
        L_0x010b:
            java.lang.Object r0 = r1.A01
            X.K64 r0 = (X.K64) r0
            X.0eM r0 = r0.A03
            X.JjI r0 = X.JTO.A0S(r0)
            com.instagram.aistudio.editor.AiSettingsRepository r15 = r0.A00
            X.0Ud r0 = r15.A0X
            java.lang.Object r14 = r0.getValue()
            if (r14 == 0) goto L_0x02da
            X.Jvz r14 = (X.C61061Jvz) r14
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r9 = 0
            java.lang.String r1 = r14.A04
            java.lang.String r0 = "persona_id"
            X.0Df r3 = r2.A02()
            X.C41848B3p.A1M(r3, r1, r0)
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            X.1vR r3 = X.C41847B3o.A04(r3, r2, r0)
            java.util.Map r5 = r2.getParamsCopy()
            java.util.Map r6 = r1.getParamsCopy()
            java.lang.Class<X.Bu0> r7 = X.C43176Bu0.class
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.lang.String r4 = "AiStudioCancelAiReview"
            r8 = 1
            r10 = 96
            java.lang.String r12 = "xfb_cancel_persona_version_review_for_mobile"
            com.facebook.pando.PandoGraphQLRequest r2 = new com.facebook.pando.PandoGraphQLRequest
            r11 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.05G r0 = r15.A0R
            X.AnonymousClass7TF.A1O(r0, r8)
            X.4Cq r0 = r15.A01
            X.MHH r13 = new X.MHH
            r16 = r2
            r17 = r9
            r18 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass7TE.A1Z(r13, r0)
            goto L_0x000e
        L_0x016f:
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r4 = r1.requireContext()
            r0 = 24
            X.MMA r3 = new X.MMA
            r3.<init>(r1, r0)
            r1 = 2131952795(0x7f13049b, float:1.9542043E38)
            r0 = 2131952796(0x7f13049c, float:1.9542045E38)
            r2 = 2131956706(0x7f1313e2, float:1.9549975E38)
            X.8ab r1 = X.JTU.A0N(r4, r1, r0)
            r0 = 0
            X.LV3.A01(r1, r3, r0, r2)
            r1.A03()
            X.DbT.A1V(r1)
            goto L_0x000e
        L_0x0197:
            java.lang.Object r2 = r1.A01
            X.K64 r2 = (X.K64) r2
            X.0eM r0 = r2.A03
            X.JjI r0 = X.JTO.A0S(r0)
            X.05G r3 = r0.A02
            com.instagram.aistudio.editor.AiSettingsRepository r0 = r0.A00
            X.0Ud r1 = r0.A0X
            X.Jvz r0 = X.JTO.A0V(r1)
            if (r0 == 0) goto L_0x01b1
            java.lang.String r5 = r0.A0B
            if (r5 != 0) goto L_0x01b3
        L_0x01b1:
            java.lang.String r5 = ""
        L_0x01b3:
            X.Jvz r0 = X.JTO.A0V(r1)
            if (r0 == 0) goto L_0x01bd
            java.util.List r6 = r0.A0G
            if (r6 != 0) goto L_0x01bf
        L_0x01bd:
            X.0sn r6 = X.0sn.A00
        L_0x01bf:
            X.Jvz r0 = X.JTO.A0V(r1)
            if (r0 == 0) goto L_0x01c9
            java.util.List r7 = r0.A0I
            if (r7 != 0) goto L_0x01cb
        L_0x01c9:
            X.0sn r7 = X.0sn.A00
        L_0x01cb:
            X.Jvz r0 = X.JTO.A0V(r1)
            if (r0 == 0) goto L_0x01d5
            java.util.List r8 = r0.A0F
            if (r8 != 0) goto L_0x01d7
        L_0x01d5:
            X.0sn r8 = X.0sn.A00
        L_0x01d7:
            X.Jvz r0 = X.JTO.A0V(r1)
            if (r0 == 0) goto L_0x01e1
            java.util.List r9 = r0.A0D
            if (r9 != 0) goto L_0x01e3
        L_0x01e1:
            X.0sn r9 = X.0sn.A00
        L_0x01e3:
            r10 = 0
            X.Jvn r4 = new X.Jvn
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3.Epw(r4)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r0 = r2.A02
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            X.K5f r0 = new X.K5f
            r0.<init>()
            X.Dba.A12(r0, r1)
            goto L_0x000e
        L_0x0204:
            java.lang.Object r0 = r1.A01
            X.5Uk r0 = (X.C286225Uk) r0
            if (r0 == 0) goto L_0x000e
            r0.hide()
            goto L_0x000e
        L_0x020f:
            java.lang.Object r1 = r1.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = "tagline"
            r1.invoke(r0)
            goto L_0x000e
        L_0x021a:
            java.lang.Object r1 = r1.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            goto L_0x0225
        L_0x0220:
            java.lang.Object r1 = r1.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
        L_0x0225:
            X.C51967G9n.A16(r1, r0)
            goto L_0x000e
        L_0x022a:
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r1.A01
            X.K7N r1 = (X.K7N) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.DbX.A10(r0, r2)
            X.0eM r0 = r1.A01
            X.JjI r1 = X.JTO.A0S(r0)
            X.MNQ r0 = X.MNQ.A00
            r1.A0F(r0)
            goto L_0x000e
        L_0x0244:
            java.lang.Object r0 = r1.A01
            X.K5e r0 = (X.C61386K5e) r0
            X.0eM r0 = r0.A01
            goto L_0x02b6
        L_0x024b:
            java.lang.Object r0 = r1.A01
            X.K5p r0 = (X.C61395K5p) r0
            X.0eM r0 = r0.A02
            goto L_0x02c6
        L_0x0252:
            java.lang.Object r0 = r1.A01
            X.K5p r0 = (X.C61395K5p) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            goto L_0x02a4
        L_0x025d:
            java.lang.Object r0 = r1.A01
            X.07f r1 = X.C51971G9r.A0U(r0)
            return r1
        L_0x0264:
            java.lang.Object r0 = r1.A01
            X.K5p r0 = (X.C61395K5p) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBI r1 = new X.KBI
            r1.<init>(r0)
            return r1
        L_0x0274:
            java.lang.Object r0 = r1.A01
            X.K5m r0 = (X.C61392K5m) r0
            X.0eM r0 = r0.A04
            goto L_0x02c6
        L_0x027b:
            java.lang.Object r0 = r1.A01
            X.K5m r0 = (X.C61392K5m) r0
            X.0eM r0 = r0.A04
            goto L_0x02b6
        L_0x0282:
            java.lang.Object r0 = r1.A01
            X.K5n r0 = (X.C61393K5n) r0
            X.0eM r0 = r0.A04
            goto L_0x02c6
        L_0x0289:
            java.lang.Object r0 = r1.A01
            X.K5n r0 = (X.C61393K5n) r0
            X.0eM r0 = r0.A04
            goto L_0x02b6
        L_0x0290:
            java.lang.Object r0 = r1.A01
            X.K64 r0 = (X.K64) r0
            X.0eM r0 = r0.A02
            goto L_0x02c6
        L_0x0297:
            java.lang.Object r0 = r1.A01
            X.K64 r0 = (X.K64) r0
            X.0eM r0 = r0.A02
            goto L_0x02b6
        L_0x029e:
            java.lang.Object r0 = r1.A01
            com.instagram.aistudio.editor.AiSettingsRepository r0 = (com.instagram.aistudio.editor.AiSettingsRepository) r0
            com.instagram.common.session.UserSession r0 = r0.A02
        L_0x02a4:
            X.7I6 r1 = X.AnonymousClass7I4.A00(r0)
            return r1
        L_0x02a9:
            java.lang.Object r0 = r1.A01
            X.K7M r0 = (X.K7M) r0
            X.0eM r0 = r0.A00
            goto L_0x02b6
        L_0x02b0:
            java.lang.Object r0 = r1.A01
            X.K7N r0 = (X.K7N) r0
            X.0eM r0 = r0.A00
        L_0x02b6:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBJ r1 = new X.KBJ
            r1.<init>(r0)
            return r1
        L_0x02c0:
            java.lang.Object r0 = r1.A01
            X.K5j r0 = (X.C61389K5j) r0
            X.0eM r0 = r0.A03
        L_0x02c6:
            X.LTH r1 = X.LTH.A03(r0)
            return r1
        L_0x02cb:
            java.lang.Object r0 = r1.A01
            X.K5j r0 = (X.C61389K5j) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7I6 r1 = X.AnonymousClass7I4.A00(r0)
            return r1
        L_0x02da:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMA.invoke():java.lang.Object");
    }
}
