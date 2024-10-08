package X;

/* renamed from: X.Ufl  reason: case insensitive filesystem */
public final class C15619Ufl extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15619Ufl(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(1OC r1, Object obj, Object obj2, int i) {
        r1.A00 = new C15619Ufl(i, obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x04de, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x04e5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0516, code lost:
        r0 = "adsManagerLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0519, code lost:
        r0 = "pullToRefresh";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0567, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x056a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0582, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0585, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e1, code lost:
        r0 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x020b, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0553;
                case 1: goto L_0x051c;
                case 2: goto L_0x04c5;
                case 3: goto L_0x0473;
                case 4: goto L_0x0460;
                case 5: goto L_0x0440;
                case 6: goto L_0x0414;
                case 7: goto L_0x0578;
                case 8: goto L_0x03ed;
                case 9: goto L_0x03d6;
                case 10: goto L_0x037f;
                case 11: goto L_0x0361;
                case 12: goto L_0x0343;
                case 13: goto L_0x02fb;
                case 14: goto L_0x02de;
                case 15: goto L_0x0005;
                case 16: goto L_0x02c5;
                case 17: goto L_0x027e;
                case 18: goto L_0x0244;
                case 19: goto L_0x0005;
                case 20: goto L_0x020f;
                case 21: goto L_0x0039;
                case 22: goto L_0x01d5;
                case 23: goto L_0x01b4;
                case 24: goto L_0x0176;
                case 25: goto L_0x0005;
                case 26: goto L_0x0123;
                case 27: goto L_0x0112;
                case 28: goto L_0x00e5;
                case 29: goto L_0x0009;
                case 30: goto L_0x0005;
                case 31: goto L_0x00a8;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15619Ufl.super.onFail(r13)
            return
        L_0x0009:
            r0 = -2146499496(0xffffffff800f0458, float:-1.37909E-39)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Throwable r2 = r13.A01()
            if (r2 != 0) goto L_0x001d
            java.lang.String r0 = "CS HTTP request failed with an unknown error"
            X.V1o r2 = new X.V1o
            r2.<init>(r0)
        L_0x001d:
            java.lang.Object r1 = r12.A02
            X.VV0 r1 = (X.VV0) r1
            X.X2s r0 = r1.A00
            X.UVv r6 = r1.A01
            java.lang.String r8 = r2.getMessage()
            r7 = 0
            r9 = 0
            X.UW3 r5 = new X.UW3
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            r0.APd(r5)
            r0 = 224422390(0xd6069f6, float:6.9152875E-31)
            goto L_0x020b
        L_0x0039:
            r0 = 5422404(0x52bd44, float:7.598406E-39)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r13, r7)
            X.C15619Ufl.super.onFail(r13)
            java.lang.Object r2 = r12.A02
            X.Vaq r2 = (X.C17598Vaq) r2
            java.util.Map r1 = r2.A05
            java.lang.Object r6 = r12.A01
            X.WWJ r6 = (X.WWJ) r6
            X.Uw4 r0 = X.Uw4.NEEDS_RETRY
            r1.put(r6, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r6.A00 = r1
            X.VPA r0 = r2.A03
            java.lang.Throwable r5 = r13.A01()
            X.Ubt r3 = r0.A00
            X.UdS r0 = r3.A02
            if (r0 == 0) goto L_0x00e1
            r6.A00 = r1
            X.C15477UdS.A00(r0)
            android.content.Context r2 = r3.getContext()
            java.lang.String r1 = "catalog_load_more_failed"
            r0 = 2131969835(0x7f13472b, float:1.9576604E38)
            X.C59689JTv.A01(r2, r1, r0, r7)
            X.W35 r3 = r3.A03
            if (r3 != 0) goto L_0x007f
            java.lang.String r0 = "logger"
            goto L_0x04de
        L_0x007f:
            java.lang.Integer r1 = r6.A01
            X.0qQ.A07(r1)
            java.lang.String r0 = "catalog_load_more_failure"
            X.0xI r2 = X.W35.A00(r3, r0)
            java.lang.String r1 = X.VHW.A00(r1)
            java.lang.String r0 = "products_source_type"
            r2.A0C(r0, r1)
            if (r5 == 0) goto L_0x00a0
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "error_message"
            if (r1 == 0) goto L_0x00a0
            r2.A0C(r0, r1)
        L_0x00a0:
            X.W35.A05(r2, r3)
            r0 = -819792548(0xffffffffcf22f55c, float:-2.73398886E9)
            goto L_0x020b
        L_0x00a8:
            r0 = -637635280(0xffffffffd9fe7530, float:-8.9529366E15)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r12.A02
            X.Ubv r4 = (X.C15392Ubv) r4
            X.Dew r1 = r4.A04
            java.lang.String r0 = "paginationHelper"
            if (r1 == 0) goto L_0x04de
            r3 = 1
            r1.A01 = r3
            boolean r0 = r1.CKB()
            if (r0 == 0) goto L_0x00cc
            X.Ud5 r1 = r4.A05
            if (r1 == 0) goto L_0x00e1
            r0 = -1801224562(0xffffffff94a37e8e, float:-1.6508711E-26)
            X.0fE.A00(r1, r0)
        L_0x00cc:
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r2 = X.DbU.A0m(r4, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            java.lang.String r0 = "fetchData_request_error"
            X.C59689JTv.A03(r1, r2, r0, r3)
            r0 = 1505317104(0x59b950f0, float:6.5202328E15)
            goto L_0x0582
        L_0x00e1:
            java.lang.String r0 = "adapter"
            goto L_0x04de
        L_0x00e5:
            r0 = -73886399(0xfffffffffb989541, float:-1.5845127E36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Throwable r0 = r13.A01()
            if (r0 != 0) goto L_0x00f9
            java.lang.String r1 = "Config fetch failed with an unknown HTTP error"
            X.V1n r0 = new X.V1n
            r0.<init>(r1)
        L_0x00f9:
            java.lang.Object r0 = r12.A02
            X.VUz r0 = (X.C17420VUz) r0
            X.X2s r5 = r0.A00
            X.V33 r3 = r0.A02
            X.UVD r3 = (X.UVD) r3
            r2 = 0
            r1 = 0
            X.UW1 r0 = new X.UW1
            r0.<init>(r2, r3, r1)
            r5.APd(r0)
            r0 = 1659538659(0x62ea8ce3, float:2.163345E21)
            goto L_0x020b
        L_0x0112:
            r0 = -2042808236(0xffffffff863d3854, float:-3.5588333E-35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r12.A01
            X.DbS.A1U(r0)
            r0 = -2074782235(0xffffffff845555e5, float:-2.507747E-36)
            goto L_0x020b
        L_0x0123:
            r0 = 720219767(0x2aedae77, float:4.2220716E-13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r12.A02
            X.Vzr r2 = (X.C18756Vzr) r2
            android.content.Context r0 = r2.A01
            java.lang.String r1 = "something_went_wrong"
            r5 = 0
            X.C59689JTv.A0B(r0, r1)
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r3 = r2.A04
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L_0x0171
            android.content.Context r0 = r3.getContext()
            X.C59689JTv.A0B(r0, r1)
            X.Udf r0 = r3.A03
            X.VsW r0 = r0.A06
            java.util.Set r2 = r0.A02
            com.google.common.collect.ImmutableSet r1 = X.C13990Tnq.A0L(r2)
            X.Wv0 r0 = r0.A00
            r0.addAll(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x0158:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r1.next()
            X.3gp r0 = (X.C247733gp) r0
            r0.A0P = r5
            goto L_0x0158
        L_0x0167:
            r2.clear()
            X.Udf r1 = r3.A03
            X.1Xj r0 = r3.A01
            r1.A01(r0)
        L_0x0171:
            r0 = 156063780(0x94d5824, float:2.4717421E-33)
            goto L_0x020b
        L_0x0176:
            r0 = -1043150333(0xffffffffc1d2ca03, float:-26.348639)
            int r0 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Throwable r2 = r13.A01()
            boolean r1 = r2 instanceof X.C16693V1w
            if (r1 == 0) goto L_0x019b
            X.V1w r2 = (X.C16693V1w) r2
            if (r2 == 0) goto L_0x019b
            com.google.common.collect.ImmutableList r1 = r2.A00
            if (r1 == 0) goto L_0x019b
            java.lang.Object r1 = X.00k.A0J(r1)
            X.ThL r1 = (X.C13802ThL) r1
            if (r1 == 0) goto L_0x019b
            java.lang.String r2 = r1.getDescription()
            if (r2 != 0) goto L_0x01aa
        L_0x019b:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131972232(0x7f135088, float:1.9581466E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r2, r1)
        L_0x01aa:
            java.lang.String r1 = "RapidFeedbackSurveyFragment"
            X.0wb.A03(r1, r2)
            r1 = 1002401260(0x3bbf6dec, float:0.005841961)
            goto L_0x0567
        L_0x01b4:
            r0 = -306881721(0xffffffffedb55b47, float:-7.015892E27)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.C15619Ufl.super.onFail(r13)
            java.lang.Object r0 = r12.A01
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment r0 = (com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment) r0
            X.Vap r0 = r0.A04
            X.02m r2 = r0.A00
            X.0qQ.A06(r2)
            java.util.Set r1 = r0.A04
            r0 = 37365602(0x23a2762, float:1.3676424E-37)
            X.C18251VoI.A01(r2, r1, r0)
            r0 = -1764729113(0xffffffff96d05ee7, float:-3.3664104E-25)
            goto L_0x020b
        L_0x01d5:
            r0 = 1565843025(0x5d54de51, float:9.5867415E17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r13, r6)
            X.C15619Ufl.super.onFail(r13)
            java.lang.Object r5 = r12.A02
            X.Vv9 r5 = (X.C18616Vv9) r5
            android.content.Context r3 = r5.A00
            r2 = 2131974093(0x7f1357cd, float:1.958524E38)
            r1 = 1
            java.lang.String r0 = "schedule_back_in_stock_reminder_failed"
            X.C59689JTv.A01(r3, r0, r2, r1)
            X.X9C r3 = r5.A06
            X.W2j r2 = X.W2j.A00(r3)
            java.lang.Object r0 = r12.A01
            X.VWq r0 = (X.C17463VWq) r0
            com.instagram.user.model.Product r0 = r0.A00
            java.lang.String r1 = r0.A0H
            java.util.Map r0 = r2.A0B
            X.JTP.A1R(r1, r0, r6)
            X.C18588Vuf.A00(r3, r2)
            r0 = 70878361(0x4398499, float:2.1807531E-36)
        L_0x020b:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x020f:
            r0 = 2078002895(0x7bdbcecf, float:2.2826152E36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r12.A01
            X.VWe r2 = (X.C17451VWe) r2
            X.Vjx r1 = r2.A00
            X.X9C r3 = r1.A07
            X.Vuf r1 = r2.A01
            X.W2j r2 = new X.W2j
            r2.<init>(r1)
            X.Vsx r1 = r1.A02
            X.Uxz r8 = r1.A03
            boolean r11 = r1.A06
            X.Uxz r5 = r1.A00
            X.Uxz r9 = r1.A04
            X.Uxz r6 = r1.A01
            X.Uxz r7 = r1.A02
            X.Uxz r10 = X.C16605Uxz.FAILED
            X.Vsx r4 = new X.Vsx
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.A02 = r4
            X.C18588Vuf.A00(r3, r2)
            r1 = 93212669(0x58e4ffd, float:1.3382999E-35)
            goto L_0x0567
        L_0x0244:
            r0 = -895166526(0xffffffffcaa4d7c2, float:-5401569.0)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r13, r6)
            java.lang.Object r5 = r12.A02
            X.W01 r5 = (X.W01) r5
            com.instagram.common.session.UserSession r3 = r5.A02
            X.Vkw r2 = X.C49089EpE.A00(r3)
            java.lang.String r1 = "failure_reason"
            java.lang.String r4 = "network_failure"
            r2.A03(r1, r4)
            X.Vkw r3 = X.C49089EpE.A00(r3)
            java.lang.Throwable r1 = r13.A01()
            r2 = 0
            if (r1 == 0) goto L_0x027b
            java.lang.String r1 = r1.getMessage()
        L_0x026f:
            r3.A04(r4, r1)
            r1 = 1
            X.W01.A01(r2, r5, r6, r6, r1)
            r1 = -563374480(0xffffffffde6b9670, float:-4.24396975E18)
            goto L_0x0567
        L_0x027b:
            java.lang.String r1 = "Network error"
            goto L_0x026f
        L_0x027e:
            r0 = -1434155206(0xffffffffaa84873a, float:-2.3541743E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r13, r5)
            java.lang.Object r6 = r12.A02
            X.W01 r6 = (X.W01) r6
            com.instagram.common.session.UserSession r3 = r6.A02
            X.Vkw r2 = X.C49089EpE.A00(r3)
            java.lang.String r1 = "failure_reason"
            java.lang.String r4 = "network_failure"
            r2.A03(r1, r4)
            X.Vkw r3 = X.C49089EpE.A00(r3)
            java.lang.Throwable r1 = r13.A01()
            r2 = 0
            if (r1 == 0) goto L_0x02c2
            java.lang.String r1 = r1.getMessage()
        L_0x02a9:
            r3.A04(r4, r1)
            X.W01.A01(r2, r6, r5, r5, r5)
            java.lang.Object r1 = r12.A01
            X.VOl r1 = (X.C17258VOl) r1
            android.app.Activity r3 = r1.A00
            r2 = 2131967851(0x7f133f6b, float:1.957258E38)
            java.lang.String r1 = "music_pick_template_delete_failed"
            X.C59689JTv.A01(r3, r1, r2, r5)
            r1 = -1327840333(0xffffffffb0dac3b3, float:-1.5917209E-9)
            goto L_0x0567
        L_0x02c2:
            java.lang.String r1 = "Network error"
            goto L_0x02a9
        L_0x02c5:
            r0 = 1678311536(0x64090070, float:1.0108942E22)
            int r0 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r1 = r12.A02
            X.Vkx r1 = (X.C18070Vkx) r1
            android.content.Context r2 = r1.A00
            int r1 = r1.A00()
            X.C48769Ejs.A00(r2, r13, r1)
            r1 = -552929778(0xffffffffdf0af60e, float:-1.0013206E19)
            goto L_0x0567
        L_0x02de:
            r0 = -2101722327(0xffffffff82ba4329, float:-2.7368792E-37)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            java.lang.Object r1 = r12.A01
            X.Wfx r1 = (X.C19816Wfx) r1
            com.instagram.common.session.UserSession r2 = r1.A01
            java.lang.Object r1 = r12.A02
            X.Vc9 r1 = (X.C17678Vc9) r1
            X.X1p r1 = r1.A07
            X.F74.A00(r2, r1, r3)
            r1 = -804907146(0xffffffffd0061776, float:-8.9987379E9)
            goto L_0x0567
        L_0x02fb:
            r0 = 307076943(0x124d9f4f, float:6.4882957E-28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            java.lang.Object r3 = r12.A01
            X.Wfw r3 = (X.C19815Wfw) r3
            com.instagram.common.session.UserSession r2 = r3.A01
            java.lang.Object r1 = r12.A02
            X.Vc9 r1 = (X.C17678Vc9) r1
            X.X1p r1 = r1.A07
            X.F74.A00(r2, r1, r4)
            boolean r1 = r13 instanceof X.C268674do
            if (r1 == 0) goto L_0x033e
            r1 = r13
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r1 = r1.A00
            X.1XP r1 = (X.1XP) r1
            java.util.List r1 = r1.mErrorStrings
            if (r1 == 0) goto L_0x033e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x033e
            androidx.fragment.app.FragmentActivity r4 = r3.A00
            java.lang.Object r1 = r13.A00()
            X.1XP r1 = (X.1XP) r1
            java.util.List r1 = r1.mErrorStrings
            java.lang.Object r3 = X.AnonymousClass7TE.A13(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r2 = "save_user_error"
            r1 = 1
            X.C59689JTv.A03(r4, r3, r2, r1)
        L_0x033e:
            r1 = -954017447(0xffffffffc722d959, float:-41689.348)
            goto L_0x0567
        L_0x0343:
            r0 = -1107211117(0xffffffffbe014c93, float:-0.12626867)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r12.A02
            X.4xT r3 = (X.C278754xT) r3
            java.util.HashSet r2 = r3.A05
            X.92j r1 = X.C3727792j.PROFILE_FEED
            r2.remove(r1)
            java.lang.Object r1 = r12.A01
            X.540 r1 = (X.AnonymousClass540) r1
            X.C278754xT.A02(r1, r3)
            r1 = 709139148(0x2a449acc, float:1.7462003E-13)
            goto L_0x0567
        L_0x0361:
            r0 = 1766120907(0x6944ddcb, float:1.4874803E25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r12.A02
            X.4xT r3 = (X.C278754xT) r3
            java.util.HashSet r2 = r3.A05
            X.92j r1 = X.C3727792j.STORY_HIGHLIGHTS
            r2.remove(r1)
            java.lang.Object r1 = r12.A01
            X.540 r1 = (X.AnonymousClass540) r1
            X.C278754xT.A02(r1, r3)
            r1 = 699530195(0x29b1fbd3, float:7.9040636E-14)
            goto L_0x0567
        L_0x037f:
            r0 = 757210392(0x2d221d18, float:9.215094E-12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r12.A02
            X.ViP r3 = (X.C17934ViP) r3
            r2 = 0
            r3.A02 = r2
            r1 = 0
            r3.A00 = r1
            java.lang.Object r3 = r12.A01
            X.UZ2 r3 = (X.UZ2) r3
            boolean r1 = r3.isAdded()
            if (r1 == 0) goto L_0x03d1
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r3.A02
            r1.getClass()
            boolean r1 = r1.A0D
            if (r1 == 0) goto L_0x03ac
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r3.A02
            r1.A0A()
            X.U9i r1 = r3.A06
            r1.A09 = r2
        L_0x03ac:
            X.U9i r2 = r3.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r2.A05 = r1
            java.util.List r1 = r2.A07
            r1.clear()
            r2.notifyDataSetChanged()
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L_0x03d1
            boolean r1 = r3.isResumed()
            if (r1 == 0) goto L_0x03d1
            android.content.Context r3 = r3.getContext()
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            X.C59689JTv.A08(r3, r2, r1)
        L_0x03d1:
            r1 = 1400616449(0x537bb601, float:1.08109031E12)
            goto L_0x0567
        L_0x03d6:
            r0 = -217263588(0xfffffffff30cd21c, float:-1.1156968E31)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r12.A01
            X.VwC r2 = (X.C18657VwC) r2
            java.lang.Object r1 = r12.A02
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = (com.instagram.discovery.mediamap.intf.MediaMapQuery) r1
            X.C18657VwC.A00(r2, r1)
            r1 = -1287496686(0xffffffffb3425c12, float:-4.5252882E-8)
            goto L_0x0567
        L_0x03ed:
            r0 = -691817963(0xffffffffd6c3b215, float:-1.07584812E14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r12.A01
            X.WTn r1 = (X.C19305WTn) r1
            java.util.Set r1 = r1.A09
            java.util.Iterator r3 = r1.iterator()
        L_0x03fe:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x040f
            java.lang.Object r2 = r3.next()
            com.instagram.discovery.mediamap.fragment.LocationListFragment r2 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r2
            r1 = 0
            r2.A08(r1)
            goto L_0x03fe
        L_0x040f:
            r1 = 466720397(0x1bd1968d, float:3.467344E-22)
            goto L_0x0567
        L_0x0414:
            r0 = -1747636121(0xffffffff97d53067, float:-1.3777021E-24)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.C15619Ufl.super.onFail(r13)
            java.lang.Object r3 = r12.A01
            X.W1j r3 = (X.C18783W1j) r3
            X.Vku r2 = r3.A02
            java.lang.Object r1 = r12.A02
            java.util.List r1 = (java.util.List) r1
            r2.A04(r1)
            X.C18783W1j.A00(r3)
            java.lang.ref.WeakReference r1 = r3.A05
            java.lang.Object r2 = r1.get()
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = "remove_all_feed_favorites_request_failure"
            X.C48774Ejx.A00(r2, r13, r1)
            r1 = -1959561712(0xffffffff8b337610, float:-3.4562966E-32)
            goto L_0x0567
        L_0x0440:
            r0 = -1306300952(0xffffffffb2236de8, float:-9.5128385E-9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r12.A01
            X.Ugw r3 = (X.C15691Ugw) r3
            r1 = 0
            r3.A04 = r1
            java.lang.String r2 = "FeedFavoritesListController"
            java.lang.String r1 = "Failed to load Feed Favorites suggestions."
            X.0KC.A0C(r2, r1)
            X.C15691Ugw.A00(r3)
            X.C15691Ugw.A01(r3)
            r1 = 1625124460(0x60dd6e6c, float:1.2764647E20)
            goto L_0x0567
        L_0x0460:
            r0 = 557924369(0x21414011, float:6.5475735E-19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r12.A02
            X.X6O r1 = (X.X6O) r1
            r1.DFD()
            r1 = 385940102(0x1700fa86, float:4.1675236E-25)
            goto L_0x0567
        L_0x0473:
            r0 = 1812029787(0x6c01615b, float:6.256447E26)
            int r0 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r6 = r12.A02
            X.Uab r6 = (X.C15327Uab) r6
            X.3AD r1 = r6.A05
            if (r1 == 0) goto L_0x0519
            boolean r1 = r1 instanceof X.C19763Wf4
            if (r1 != 0) goto L_0x049c
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A06
            if (r1 != 0) goto L_0x048d
            java.lang.String r0 = "loadingSpinner"
            goto L_0x04de
        L_0x048d:
            X.JTO.A1X(r1)
            X.UdV r2 = r6.A02
            if (r2 != 0) goto L_0x0497
            java.lang.String r0 = "pastPromotionsAdapter"
            goto L_0x04de
        L_0x0497:
            java.util.List r1 = r6.A0H
            r2.A01(r1)
        L_0x049c:
            java.lang.Throwable r1 = r13.A01()
            if (r1 == 0) goto L_0x04a8
            java.lang.String r5 = r1.getMessage()
            if (r5 != 0) goto L_0x04aa
        L_0x04a8:
            java.lang.String r5 = "Unknown error"
        L_0x04aa:
            X.VwK r4 = r6.A01
            if (r4 == 0) goto L_0x0516
            java.lang.Object r1 = r12.A01
            X.WOi r1 = (X.C19176WOi) r1
            java.lang.String r3 = r1.BYo()
            java.lang.String r2 = "past_promotion_list"
            java.lang.String r1 = "active"
            r4.A07(r2, r1, r3, r5)
            X.C13990Tnq.A0w(r6)
            r1 = 2004399830(0x7778b6d6, float:5.0445233E33)
            goto L_0x0567
        L_0x04c5:
            r0 = 1258958086(0x4b0a2d06, float:9055494.0)
            int r6 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A02
            X.Uac r5 = (X.C15328Uac) r5
            X.3AD r0 = r5.A0J
            if (r0 == 0) goto L_0x0519
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x04eb
            X.UdV r1 = r5.A0B
            if (r1 != 0) goto L_0x04e6
            java.lang.String r0 = "promoteAdToolsAdapter"
        L_0x04de:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04e6:
            java.util.List r0 = r5.A0e
            r1.A01(r0)
        L_0x04eb:
            java.lang.Throwable r0 = r13.A01()
            if (r0 == 0) goto L_0x04f7
            java.lang.String r4 = r0.getMessage()
            if (r4 != 0) goto L_0x04f9
        L_0x04f7:
            java.lang.String r4 = "Unknown error"
        L_0x04f9:
            X.VwK r3 = r5.A07
            if (r3 == 0) goto L_0x0516
            java.lang.Object r0 = r12.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r2 = r0.BYo()
            java.lang.String r1 = "promotion_list"
            java.lang.String r0 = "paused"
            r3.A07(r1, r0, r2, r4)
            X.C13990Tnq.A0w(r5)
            r0 = 214287944(0xcc5c648, float:3.0471992E-31)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0516:
            java.lang.String r0 = "adsManagerLogger"
            goto L_0x04de
        L_0x0519:
            java.lang.String r0 = "pullToRefresh"
            goto L_0x04de
        L_0x051c:
            r0 = 709454382(0x2a496a2e, float:1.7889225E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r13, r4)
            java.lang.Throwable r3 = r13.A01()
            if (r3 == 0) goto L_0x054f
            java.lang.Object r1 = r12.A02
            X.Vh6 r1 = (X.C17853Vh6) r1
            java.lang.Object r2 = r12.A01
            X.N49 r2 = (X.N49) r2
            X.0eM r1 = r1.A03
            java.lang.Object r1 = r1.getValue()
            X.Vrg r1 = (X.C18437Vrg) r1
            java.lang.String r6 = r3.getMessage()
            X.0qQ.A0B(r2, r4)
            java.lang.String r4 = r2.A00
            java.lang.String r5 = r2.A01
            java.lang.String r2 = "client_update_cached_info_failure"
            java.lang.String r3 = "client_update_cached_info"
            X.C18437Vrg.A00(r1, r2, r3, r4, r5, r6)
        L_0x054f:
            r1 = -456013176(0xffffffffe4d1ca88, float:-3.0959707E22)
            goto L_0x0567
        L_0x0553:
            r0 = -1566846075(0xffffffffa29bd385, float:-4.223679E-18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r12.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r1 = r2.isResumed()
            if (r1 != 0) goto L_0x056b
            r1 = -2104790927(0xffffffff828b7071, float:-2.0488753E-37)
        L_0x0567:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x056b:
            android.content.Context r2 = r2.getContext()
            java.lang.String r1 = "ArchiveReelMap_error"
            X.C59689JTv.A0A(r2, r1)
            r1 = -1443785217(0xffffffffa9f195ff, float:-1.072857E-13)
            goto L_0x0567
        L_0x0578:
            r0 = 2120523645(0x7e649f7d, float:7.5973023E37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 530186943(0x1f9a02bf, float:6.522608E-20)
        L_0x0582:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15619Ufl.onFail(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r0 = "pullToRefresh";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        r0 = "recyclerViewProxy";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0104, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0129, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0009;
                case 2: goto L_0x0029;
                case 3: goto L_0x0053;
                case 8: goto L_0x007a;
                case 13: goto L_0x009f;
                case 14: goto L_0x00b7;
                case 16: goto L_0x00cf;
                case 18: goto L_0x00e1;
                case 31: goto L_0x00f3;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15619Ufl.super.onFinish()
            return
        L_0x0009:
            r0 = 1261326873(0x4b2e5219, float:1.1424281E7)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r4.A01
            com.instagram.archive.fragment.ArchiveReelMapFragment r1 = (com.instagram.archive.fragment.ArchiveReelMapFragment) r1
            boolean r0 = r1.isResumed()
            if (r0 != 0) goto L_0x001e
            r0 = -1327563072(0xffffffffb0defec0, float:-1.622503E-9)
            goto L_0x009b
        L_0x001e:
            X.VvG r0 = r1.mLoadingPillController
            if (r0 == 0) goto L_0x0025
            r0.A01()
        L_0x0025:
            r0 = -214557230(0xfffffffff3361dd2, float:-1.4428755E31)
            goto L_0x009b
        L_0x0029:
            r0 = 392167763(0x17600153, float:7.2379975E-25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r4.A02
            X.Uac r2 = (X.C15328Uac) r2
            X.3As r0 = r2.A0H
            if (r0 == 0) goto L_0x0076
            r1 = 0
            r0.EaP(r1)
            X.3AD r0 = r2.A0J
            if (r0 == 0) goto L_0x0072
            r0.setIsLoading(r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r2.A0K
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "loadingSpinner"
            goto L_0x0104
        L_0x004b:
            X.JTO.A1X(r0)
            r0 = -952426608(0xffffffffc73b1f90, float:-47903.562)
            goto L_0x0129
        L_0x0053:
            r0 = 415164790(0x18bee976, float:4.9349584E-24)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r4.A02
            X.Uab r2 = (X.C15327Uab) r2
            X.3As r0 = r2.A04
            if (r0 == 0) goto L_0x0076
            r1 = 0
            r0.EaP(r1)
            X.3AD r0 = r2.A05
            if (r0 == 0) goto L_0x0072
            r0.setIsLoading(r1)
            r0 = -1320883713(0xffffffffb144e9ff, float:-2.8654765E-9)
            goto L_0x0129
        L_0x0072:
            java.lang.String r0 = "pullToRefresh"
            goto L_0x0104
        L_0x0076:
            java.lang.String r0 = "recyclerViewProxy"
            goto L_0x0104
        L_0x007a:
            r0 = 1462411892(0x572aa274, float:1.87614708E14)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r4.A01
            X.WTn r1 = (X.C19305WTn) r1
            r0 = 0
            r1.A01 = r0
            java.util.Set r0 = r1.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0098
            r1.next()
            goto L_0x008e
        L_0x0098:
            r0 = 207446496(0xc5d61e0, float:1.7054674E-31)
        L_0x009b:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x009f:
            r0 = 38441120(0x24a90a0, float:1.4882122E-37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.Wfw r0 = (X.C19815Wfw) r0
            X.1WW r2 = r0.A03
            X.V43 r1 = r0.A02
            java.lang.String r0 = "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"
            r2.A06(r0, r1)
            r0 = -180936490(0xfffffffff53720d6, float:-2.3214266E32)
            goto L_0x0129
        L_0x00b7:
            r0 = 39120559(0x254eeaf, float:1.5643799E-37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.Wfx r0 = (X.C19816Wfx) r0
            X.1WW r2 = r0.A03
            X.V43 r1 = r0.A02
            java.lang.String r0 = "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"
            r2.A06(r0, r1)
            r0 = 1128980705(0x434ae0e1, float:202.87843)
            goto L_0x0129
        L_0x00cf:
            r0 = 1818274774(0x6c60abd6, float:1.0864434E27)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.F3H r0 = (X.F3H) r0
            r0.A00()
            r0 = 938764492(0x37f468cc, float:2.9135866E-5)
            goto L_0x0129
        L_0x00e1:
            r0 = 2043419514(0x79cc1b7a, float:1.3247323E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.F3H r0 = (X.F3H) r0
            r0.A00()
            r0 = 1557219307(0x5cd147eb, float:4.71258758E17)
            goto L_0x0129
        L_0x00f3:
            r0 = 125171757(0x775f82d, float:1.8504684E-34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r4.A02
            X.Ubv r2 = (X.C15392Ubv) r2
            X.Dew r0 = r2.A04
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = "paginationHelper"
        L_0x0104:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010c:
            r1 = 0
            r0.A02 = r1
            X.2dY r0 = X.2dZ.A0t
            X.DbY.A17(r2, r0, r1)
            X.Ud5 r0 = r2.A05
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "adapter"
            goto L_0x0104
        L_0x011b:
            java.util.List r0 = r0.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0126
            X.C15392Ubv.A03(r2)
        L_0x0126:
            r0 = -761943370(0xffffffffd295aab6, float:-3.21407091E11)
        L_0x0129:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15619Ufl.onFinish():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0173, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0176, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0009;
                case 2: goto L_0x0020;
                case 3: goto L_0x005f;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00cd;
                case 10: goto L_0x00fb;
                case 13: goto L_0x0125;
                case 16: goto L_0x013e;
                case 18: goto L_0x0150;
                case 31: goto L_0x0162;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15619Ufl.super.onStart()
            return
        L_0x0009:
            r0 = -948133257(0xffffffffc77ca277, float:-64674.465)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            com.instagram.archive.fragment.ArchiveReelMapFragment r0 = (com.instagram.archive.fragment.ArchiveReelMapFragment) r0
            X.VvG r0 = r0.mLoadingPillController
            if (r0 == 0) goto L_0x001b
            r0.A02()
        L_0x001b:
            r0 = 487477388(0x1d0e508c, float:1.8835185E-21)
            goto L_0x0173
        L_0x0020:
            r0 = 2036570707(0x79639a53, float:7.386134E34)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r5.A02
            X.Uac r4 = (X.C15328Uac) r4
            X.3As r0 = r4.A0H
            if (r0 != 0) goto L_0x0039
            java.lang.String r4 = "recyclerViewProxy"
        L_0x0031:
            X.0qQ.A0F(r4)
        L_0x0034:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0039:
            r3 = 1
            r0.EaP(r3)
            X.3AD r0 = r4.A0J
            java.lang.String r1 = "pullToRefresh"
            if (r0 == 0) goto L_0x0070
            r0.setIsLoading(r3)
            X.3AD r0 = r4.A0J
            if (r0 == 0) goto L_0x0070
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x009d
            X.UdV r0 = r4.A0B
            if (r0 != 0) goto L_0x0055
            java.lang.String r4 = "promoteAdToolsAdapter"
            goto L_0x0031
        L_0x0055:
            X.C15480UdV.A00(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A0K
            if (r0 != 0) goto L_0x009a
            java.lang.String r4 = "loadingSpinner"
            goto L_0x0031
        L_0x005f:
            r0 = -1210977727(0xffffffffb7d1f241, float:-2.502755E-5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r5.A02
            X.Uab r3 = (X.C15327Uab) r3
            X.3As r0 = r3.A04
            if (r0 != 0) goto L_0x0074
            java.lang.String r1 = "recyclerViewProxy"
        L_0x0070:
            X.0qQ.A0F(r1)
            goto L_0x0034
        L_0x0074:
            r1 = 1
            r0.EaP(r1)
            X.3AD r0 = r3.A05
            java.lang.String r4 = "pullToRefresh"
            if (r0 == 0) goto L_0x0031
            r0.setIsLoading(r1)
            X.3AD r0 = r3.A05
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x00a5
            X.UdV r0 = r3.A02
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = "pastPromotionsAdapter"
            goto L_0x0070
        L_0x0090:
            X.C15480UdV.A00(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r3.A06
            if (r0 != 0) goto L_0x00a2
            java.lang.String r1 = "loadingSpinner"
            goto L_0x0070
        L_0x009a:
            X.DbS.A1T(r0)
        L_0x009d:
            r0 = -1421661845(0xffffffffab43296b, float:-6.9335396E-13)
            goto L_0x0173
        L_0x00a2:
            X.DbS.A1T(r0)
        L_0x00a5:
            r0 = 1451588404(0x56857b34, float:7.33821E13)
            goto L_0x0173
        L_0x00aa:
            r0 = -144779455(0xfffffffff75ed741, float:-4.519749E33)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.WTn r1 = (X.C19305WTn) r1
            r0 = 1
            r1.A01 = r0
            java.util.Set r0 = r1.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x00be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c8
            r1.next()
            goto L_0x00be
        L_0x00c8:
            r0 = -84489988(0xfffffffffaf6c8fc, float:-6.4069074E35)
            goto L_0x0173
        L_0x00cd:
            r0 = 655022701(0x270ada6d, float:1.9269756E-15)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r5.A01
            X.VwC r4 = (X.C18657VwC) r4
            java.util.Set r0 = r4.A05
            java.lang.Object r3 = r5.A02
            com.instagram.discovery.mediamap.intf.MediaMapQuery r3 = (com.instagram.discovery.mediamap.intf.MediaMapQuery) r3
            r0.add(r3)
            java.util.Set r0 = r4.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x00e7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r0 = r1.next()
            X.X7o r0 = (X.C20975X7o) r0
            r0.DmZ(r4, r3)
            goto L_0x00e7
        L_0x00f7:
            r0 = -299794723(0xffffffffee217edd, float:-1.2495114E28)
            goto L_0x0173
        L_0x00fb:
            r0 = 1311640335(0x4e2e0b0f, float:7.2999008E8)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A02
            X.ViP r1 = (X.C17934ViP) r1
            r0 = 1
            r1.A02 = r0
            java.lang.Object r1 = r5.A01
            X.UZ2 r1 = (X.UZ2) r1
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0121
            X.U9i r1 = r1.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A05 = r0
            java.util.List r0 = r1.A07
            r0.clear()
            r1.notifyDataSetChanged()
        L_0x0121:
            r0 = -963149426(0xffffffffc697818e, float:-19392.777)
            goto L_0x0173
        L_0x0125:
            r0 = -691633101(0xffffffffd6c68433, float:-1.09135547E14)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.Wfw r0 = (X.C19815Wfw) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            X.2dZ r1 = X.DbT.A0K(r0)
            r0 = 1
            r1.setIsLoading(r0)
            r0 = -116075534(0xfffffffff914d3f2, float:-4.829742E34)
            goto L_0x0173
        L_0x013e:
            r0 = 1747941960(0x682f7a48, float:3.3146793E24)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.F3H r0 = (X.F3H) r0
            r0.A01()
            r0 = -1146545412(0xffffffffbba91afc, float:-0.0051606875)
            goto L_0x0173
        L_0x0150:
            r0 = -972409909(0xffffffffc60a33cb, float:-8844.948)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.F3H r0 = (X.F3H) r0
            r0.A01()
            r0 = 1080662071(0x40699837, float:3.6499155)
            goto L_0x0173
        L_0x0162:
            r0 = 645586713(0x267adf19, float:8.703853E-16)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A02
            X.Ubv r0 = (X.C15392Ubv) r0
            X.C15392Ubv.A02(r0)
            r0 = 1231580542(0x49686d7e, float:952023.9)
        L_0x0173:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15619Ufl.onStart():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0588, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05fd, code lost:
        if (r3.A07.isEmpty() != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x07c6, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x07c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0be7, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0bea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        r9 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        X.0qQ.A0F(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            r3 = r21
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x07a3;
                case 1: goto L_0x0742;
                case 2: goto L_0x0217;
                case 3: goto L_0x0190;
                case 4: goto L_0x0079;
                case 5: goto L_0x0696;
                case 6: goto L_0x0ba1;
                case 7: goto L_0x0b77;
                case 8: goto L_0x062f;
                case 9: goto L_0x0b44;
                case 10: goto L_0x04e7;
                case 11: goto L_0x0b0e;
                case 12: goto L_0x047d;
                case 13: goto L_0x0ac2;
                case 14: goto L_0x0a90;
                case 15: goto L_0x0a47;
                case 16: goto L_0x0a27;
                case 17: goto L_0x09db;
                case 18: goto L_0x099b;
                case 19: goto L_0x096e;
                case 20: goto L_0x02a3;
                case 21: goto L_0x013d;
                case 22: goto L_0x0404;
                case 23: goto L_0x091b;
                case 24: goto L_0x0bd0;
                case 25: goto L_0x00fe;
                case 26: goto L_0x03ac;
                case 27: goto L_0x08fd;
                case 28: goto L_0x00b7;
                case 29: goto L_0x0342;
                case 30: goto L_0x08a2;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -875480581(0xffffffffcbd139fb, float:-2.7423734E7)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.CET r3 = (X.CET) r3
            r0 = -1523313036(0xffffffffa5341674, float:-1.5620119E-16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r10 = 0
            X.0qQ.A0B(r3, r10)
            X.BGu r0 = r3.A00
            if (r0 == 0) goto L_0x00fa
            X.BIr r7 = r0.A00
            if (r7 == 0) goto L_0x0296
            java.lang.Object r8 = r1.A02
            X.Ubv r8 = (X.C15392Ubv) r8
            com.instagram.common.session.UserSession r0 = r8.A00
            if (r0 != 0) goto L_0x0037
            java.lang.String r9 = "userSession"
        L_0x002f:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0037:
            X.1E4.A00(r0)
            boolean r0 = r8.A06
            java.lang.String r6 = "Required value was null."
            java.lang.String r9 = "adapter"
            if (r0 == 0) goto L_0x0068
            X.Ud5 r3 = r8.A05
            if (r3 == 0) goto L_0x002f
            com.instagram.model.reels.Reel r2 = r8.A01
            java.lang.Object r0 = r1.A01
            X.3uh r0 = (X.C255773uh) r0
            java.util.List r1 = r7.A02
            if (r1 == 0) goto L_0x027d
            r3.A00 = r2
            r3.A01 = r0
            java.util.List r0 = r3.A02
            r0.clear()
            r0.addAll(r1)
            X.C15454Ud5.A00(r3)
            r8.A06 = r10
        L_0x0061:
            X.Dew r1 = r8.A04
            if (r1 != 0) goto L_0x0292
            java.lang.String r9 = "paginationHelper"
            goto L_0x002f
        L_0x0068:
            X.Ud5 r2 = r8.A05
            if (r2 == 0) goto L_0x002f
            java.util.List r1 = r7.A02
            if (r1 == 0) goto L_0x0286
            java.util.List r0 = r2.A02
            r0.addAll(r1)
            X.C15454Ud5.A00(r2)
            goto L_0x0061
        L_0x0079:
            r0 = 1063319902(0x3f60f95e, float:0.87880504)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UXj r3 = (X.C15249UXj) r3
            r0 = 987195611(0x3ad768db, float:0.0016434448)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A01
            X.W1k r0 = (X.C18784W1k) r0
            com.instagram.business.promote.model.PromoteData r2 = r0.A03
            boolean r0 = r3.A01
            r2.A2X = r0
            boolean r0 = r3.A02
            r2.A2o = r0
            boolean r0 = r3.A03
            r2.A2u = r0
            com.instagram.business.promote.model.PromoteWhatsAppAccountType r0 = r3.A00
            if (r0 == 0) goto L_0x00b3
            r2.A0x = r0
            java.lang.Object r0 = r1.A02
            X.X6O r0 = (X.X6O) r0
            r0.DFM(r3)
            r0 = -116128055(0xfffffffff91406c9, float:-4.8037347E34)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 680967381(0x2896bcd5, float:1.6735238E-14)
            goto L_0x0be7
        L_0x00b3:
            java.lang.String r9 = "accountType"
            goto L_0x002f
        L_0x00b7:
            r0 = 1951263548(0x744deb3c, float:6.52583E31)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UWv r3 = (X.UWv) r3
            r0 = -1030633112(0xffffffffc291c968, float:-72.89337)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r8 = r1.A02
            X.VUz r8 = (X.C17420VUz) r8
            X.WM2 r9 = new X.WM2
            r9.<init>()
            X.UKH r0 = r3.A00
            if (r0 == 0) goto L_0x00fa
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0853
            java.util.Iterator r7 = r0.iterator()
        L_0x00dc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0853
            java.lang.Object r0 = r7.next()
            X.XA6 r0 = (X.XA6) r0
            X.UNn r0 = (X.C15070UNn) r0
            java.lang.String r5 = r0.A01
            java.lang.String r3 = r0.A02
            int r0 = r0.A00
            long r1 = (long) r0
            X.VV1 r0 = new X.VV1
            r0.<init>(r5, r3, r1)
            X.WM2.A00(r9, r0)
            goto L_0x00dc
        L_0x00fa:
            java.lang.String r9 = "response"
            goto L_0x002f
        L_0x00fe:
            r0 = -1579659084(0xffffffffa1d850b4, float:-1.4658091E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CGC r3 = (X.CGC) r3
            r0 = -865915743(0xffffffffcc632ca1, float:-5.9552388E7)
            int r6 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r5 = r1.A02
            X.UbS r5 = (X.C15374UbS) r5
            X.0eM r0 = r5.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6ak r2 = X.C310266ai.A00(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            r2.A01(r0)
            com.instagram.user.model.UpcomingEventImpl r0 = X.C45129Cqn.A00(r3)
            X.VU0 r0 = X.C15374UbS.A01(r5, r0)
            r5.A03 = r0
            X.0eM r0 = r5.A0E
            java.lang.Object r1 = r0.getValue()
            X.Vv5 r1 = (X.C18612Vv5) r1
            X.VU0 r0 = r5.A03
            if (r0 != 0) goto L_0x0872
            java.lang.String r9 = "viewModel"
            goto L_0x002f
        L_0x013d:
            r0 = -504106257(0xffffffffe1f3f2ef, float:-5.62508E20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UY4 r3 = (X.UY4) r3
            r0 = 334979257(0x13f760b9, float:6.244694E-27)
            int r5 = X.AnonymousClass7TG.A0D(r3, r0)
            X.C15619Ufl.super.onSuccess(r3)
            java.lang.Object r6 = r1.A02
            X.Vaq r6 = (X.C17598Vaq) r6
            java.util.Map r2 = r6.A05
            java.lang.Object r8 = r1.A01
            X.WWJ r8 = (X.WWJ) r8
            X.Uw4 r0 = X.Uw4.LOADED
            r2.put(r8, r0)
            X.VPA r1 = r6.A03
            java.util.List r0 = r3.A01
            java.util.List r7 = X.C51966G9m.A1J(r0)
            boolean r6 = r3.A02
            java.lang.String r3 = r3.A00
            X.0qQ.A07(r3)
            X.Ubt r2 = r1.A00
            X.UdS r1 = r2.A02
            if (r1 != 0) goto L_0x0178
            java.lang.String r9 = "adapter"
            goto L_0x002f
        L_0x0178:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r8.A00 = r0
            r8.A05 = r6
            r8.A02 = r3
            java.util.List r0 = r8.A04
            r0.addAll(r7)
            X.C15477UdS.A00(r1)
            X.W35 r3 = r2.A03
            if (r3 != 0) goto L_0x0880
            java.lang.String r9 = "logger"
            goto L_0x002f
        L_0x0190:
            r0 = -1819362299(0xffffffff938ebc05, float:-3.603124E-27)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UXS r3 = (X.UXS) r3
            r0 = -1290283458(0xffffffffb317d63e, float:-3.535228E-8)
            int r5 = X.AnonymousClass7TG.A0D(r3, r0)
            boolean r0 = r3.A01
            java.lang.String r9 = "adsManagerLogger"
            java.lang.Object r7 = r1.A02
            X.Uab r7 = (X.C15327Uab) r7
            if (r0 != 0) goto L_0x01ef
            X.3AD r0 = r7.A05
            if (r0 != 0) goto L_0x01b2
            java.lang.String r9 = "pullToRefresh"
            goto L_0x002f
        L_0x01b2:
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x01ce
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r7.A06
            if (r0 != 0) goto L_0x01be
            java.lang.String r9 = "loadingSpinner"
            goto L_0x002f
        L_0x01be:
            X.JTO.A1X(r0)
            X.UdV r2 = r7.A02
            if (r2 != 0) goto L_0x01c9
            java.lang.String r9 = "pastPromotionsAdapter"
            goto L_0x002f
        L_0x01c9:
            java.util.List r0 = r7.A0H
            r2.A01(r0)
        L_0x01ce:
            X.UKM r0 = r3.A00
            if (r0 == 0) goto L_0x01d6
            java.lang.String r6 = r0.A02
            if (r6 != 0) goto L_0x01d8
        L_0x01d6:
            java.lang.String r6 = "Unknown error"
        L_0x01d8:
            X.VwK r3 = r7.A01
            if (r3 == 0) goto L_0x002f
            java.lang.Object r0 = r1.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r2 = r0.BYo()
            java.lang.String r1 = "past_promotion_list"
            java.lang.String r0 = "active"
            r3.A07(r1, r0, r2, r6)
            X.C13990Tnq.A0w(r7)
            goto L_0x020c
        L_0x01ef:
            X.VwK r6 = r7.A01
            if (r6 == 0) goto L_0x002f
            java.lang.Object r0 = r1.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r3 = r0.BYo()
            r2 = 0
            java.lang.String r1 = "past_promotion_list"
            java.lang.String r0 = "active"
            r6.A08(r1, r0, r3, r2)
            X.0eM r0 = r7.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.W3M.A06(r0)
        L_0x020c:
            r0 = 660930438(0x2764ff86, float:3.1779876E-15)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -855098310(0xffffffffcd083c3a, float:-1.42853024E8)
            goto L_0x0be7
        L_0x0217:
            r0 = 1519093385(0x5a8b8689, float:1.96364724E16)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.UXS r3 = (X.UXS) r3
            r0 = -987155390(0xffffffffc5293442, float:-2707.266)
            int r7 = X.AnonymousClass7TG.A0D(r3, r0)
            boolean r0 = r3.A01
            java.lang.String r9 = "adsManagerLogger"
            if (r0 != 0) goto L_0x025e
            X.UKM r0 = r3.A00
            if (r0 == 0) goto L_0x0235
            java.lang.String r5 = r0.A02
            if (r5 != 0) goto L_0x0237
        L_0x0235:
            java.lang.String r5 = "Unknown error"
        L_0x0237:
            java.lang.Object r4 = r1.A02
            X.Uac r4 = (X.C15328Uac) r4
            X.VwK r3 = r4.A07
            if (r3 == 0) goto L_0x002f
            java.lang.Object r0 = r1.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r2 = r0.BYo()
            java.lang.String r1 = "promotion_list"
            java.lang.String r0 = "paused"
            r3.A07(r1, r0, r2, r5)
            X.C13990Tnq.A0w(r4)
        L_0x0251:
            r0 = 362558851(0x159c3583, float:6.3092325E-26)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -1511107317(0xffffffffa5ee550b, float:-4.1344046E-16)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x025e:
            java.lang.Object r5 = r1.A02
            X.Uac r5 = (X.C15328Uac) r5
            X.VwK r4 = r5.A07
            if (r4 == 0) goto L_0x002f
            java.lang.Object r0 = r1.A01
            X.WOi r0 = (X.C19176WOi) r0
            java.lang.String r3 = r0.BYo()
            r2 = 0
            java.lang.String r1 = "promotion_list"
            java.lang.String r0 = "paused"
            r4.A08(r1, r0, r3, r2)
            X.C15328Uac.A09(r5)
            X.C15328Uac.A04(r5)
            goto L_0x0251
        L_0x027d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r6)
            r0 = 1779100413(0x6a0aeafd, float:4.1985365E25)
            goto L_0x028e
        L_0x0286:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r6)
            r0 = -1518921023(0xffffffffa5771ac1, float:-2.14329E-16)
        L_0x028e:
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0292:
            java.lang.String r0 = r7.A01
            r1.A00 = r0
        L_0x0296:
            r0 = 422207538(0x192a6032, float:8.8082205E-24)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1215755140(0xffffffffb7890c7c, float:-1.6337486E-5)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x02a3:
            r0 = -461791500(0xffffffffe4799ef4, float:-1.8418772E22)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.UXh r3 = (X.C15247UXh) r3
            r2 = 1027722046(0x3d41cb3e, float:0.047312967)
            int r4 = X.AnonymousClass7TG.A0D(r3, r2)
            java.lang.Object r7 = r1.A01
            X.VWe r7 = (X.C17451VWe) r7
            boolean r8 = r3.A01
            java.lang.Object r6 = r1.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r5 = 0
            if (r8 == 0) goto L_0x02e3
            java.util.ArrayList r1 = r3.A00
            if (r1 == 0) goto L_0x02e3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x02cd:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x02e3
            java.lang.Object r1 = r2.next()
            X.Cvm r1 = (X.C45406Cvm) r1
            X.WSU r1 = X.C45019Cow.A00(r6, r1)
            if (r1 == 0) goto L_0x02cd
            r5.add(r1)
            goto L_0x02cd
        L_0x02e3:
            boolean r6 = r3.A02
            if (r8 == 0) goto L_0x032f
            X.Vjx r1 = r7.A00
            X.X9C r3 = r1.A07
            X.X9L r8 = r3.BTa()
            X.0qQ.A07(r8)
            com.instagram.user.model.Product r1 = r7.A02
            java.lang.String r7 = r1.A0H
            if (r5 == 0) goto L_0x033d
            r1 = 1
            X.0qQ.A0B(r7, r1)
            r1 = 38
            X.PmT r2 = new X.PmT
            r2.<init>(r5, r8, r7, r1)
            X.WdA r1 = new X.WdA
            r1.<init>(r8, r2)
            r3.Eda(r1)
            X.W2j r2 = X.W2j.A00(r3)
            X.Vuf r1 = r3.Bz5()
            X.Vsx r1 = r1.A02
            boolean r13 = r1.A06
            X.Uxz r7 = r1.A00
            X.Uxz r11 = r1.A04
            X.Uxz r8 = r1.A01
            X.Uxz r9 = r1.A02
            if (r6 == 0) goto L_0x033a
            X.Uxz r10 = X.C16605Uxz.LOADING
        L_0x0323:
            X.Uxz r12 = X.C16605Uxz.LOADED
            X.Vsx r6 = new X.Vsx
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.A02 = r6
            X.C18588Vuf.A00(r3, r2)
        L_0x032f:
            r1 = 642876329(0x265183a9, float:7.2689874E-16)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 937743218(0x37e4d372, float:2.727818E-5)
            goto L_0x07c6
        L_0x033a:
            X.Uxz r10 = X.C16605Uxz.LOADED
            goto L_0x0323
        L_0x033d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0342:
            r0 = -106787134(0xfffffffff9a28ec2, float:-1.0550595E35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Ufv r3 = (X.C15629Ufv) r3
            r2 = -1118630999(0xffffffffbd530ba9, float:-0.051524792)
            int r2 = X.AnonymousClass0fD.A03(r2)
            java.io.StringWriter r7 = new java.io.StringWriter     // Catch:{ IOException -> 0x036e }
            r7.<init>()     // Catch:{ IOException -> 0x036e }
            X.17W r6 = X.AnonymousClass7TF.A0K(r7)     // Catch:{ IOException -> 0x036e }
            boolean r5 = r3.A01     // Catch:{ IOException -> 0x036e }
            java.lang.String r4 = "success"
            r6.A0S(r4, r5)     // Catch:{ IOException -> 0x036e }
            boolean r5 = r3.A00     // Catch:{ IOException -> 0x036e }
            java.lang.String r4 = "state_changed"
            r6.A0S(r4, r5)     // Catch:{ IOException -> 0x036e }
            java.lang.String r5 = X.AnonymousClass7TG.A0k(r6, r7)     // Catch:{ IOException -> 0x036e }
            goto L_0x038d
        L_0x036e:
            r4 = move-exception
            java.lang.Object r3 = r1.A02
            X.VV0 r3 = (X.VV0) r3
            X.X2s r1 = r3.A00
            X.UVv r5 = r3.A01
            java.lang.String r7 = r4.getMessage()
            r6 = 0
            r8 = 0
            X.UW3 r4 = new X.UW3
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            r1.APd(r4)
            r1 = -1397375491(0xffffffffacb5bdfd, float:-5.1654223E-12)
            X.AnonymousClass0fD.A0A(r1, r2)
            goto L_0x03a7
        L_0x038d:
            java.lang.Object r4 = r1.A02
            X.VV0 r4 = (X.VV0) r4
            int r7 = r3.mStatusCode
            X.X2s r1 = r4.A00
            X.UVv r4 = r4.A01
            r8 = 1
            r6 = 0
            X.UW3 r3 = new X.UW3
            r3.<init>(r4, r5, r6, r7, r8)
            r1.APd(r3)
            r1 = -1978240907(0xffffffff8a167075, float:-7.243388E-33)
            X.AnonymousClass0fD.A0A(r1, r2)
        L_0x03a7:
            r1 = 1358610893(0x50fac1cd, float:3.36560394E10)
            goto L_0x07c6
        L_0x03ac:
            r0 = 1831248935(0x6d26a427, float:3.22331E27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 1192291700(0x4710ed74, float:37101.453)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A01
            java.util.Set r2 = (java.util.Set) r2
            int r7 = r2.size()
            r5 = 1
            java.lang.Object r4 = r1.A02
            X.Vzr r4 = (X.C18756Vzr) r4
            android.content.Context r3 = r4.A01
            boolean r2 = r4.A05
            if (r7 != r5) goto L_0x03fb
            r1 = 2131964970(0x7f13342a, float:1.9566737E38)
            if (r2 == 0) goto L_0x03d5
            r1 = 2131964988(0x7f13343c, float:1.9566773E38)
        L_0x03d5:
            X.C59689JTv.A07(r3, r1)
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r3 = r4.A04
            boolean r1 = r3.isAdded()
            if (r1 == 0) goto L_0x03f0
            X.Udf r1 = r3.A03
            X.VsW r1 = r1.A06
            java.util.Set r1 = r1.A02
            r1.clear()
            X.Udf r2 = r3.A03
            X.1Xj r1 = r3.A01
            r2.A01(r1)
        L_0x03f0:
            r1 = 1964935070(0x751e879e, float:2.0096034E32)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -472653326(0xffffffffe3d3e1f2, float:-7.817088E21)
            goto L_0x07c6
        L_0x03fb:
            r1 = 2131964967(0x7f133427, float:1.956673E38)
            if (r2 == 0) goto L_0x03d5
            r1 = 2131964987(0x7f13343b, float:1.9566771E38)
            goto L_0x03d5
        L_0x0404:
            r0 = 1590985676(0x5ed483cc, float:7.6566537E18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 307793770(0x12588f6a, float:6.8334354E-28)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r8 = 0
            X.0qQ.A0B(r3, r8)
            X.C15619Ufl.super.onSuccess(r3)
            java.lang.Object r7 = r1.A02
            X.Vv9 r7 = (X.C18616Vv9) r7
            com.instagram.common.session.UserSession r2 = r7.A01
            X.6xb r2 = X.C323496xa.A00(r2)
            java.lang.Object r1 = r1.A01
            X.VWq r1 = (X.C17463VWq) r1
            com.instagram.user.model.Product r6 = r1.A00
            X.0qQ.A06(r6)
            boolean r2 = r2.A03(r6)
            r1 = 0
            if (r2 != 0) goto L_0x044b
            X.2qw r4 = r7.A05
            com.instagram.user.model.User r2 = r6.A0B
            if (r2 == 0) goto L_0x043f
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r2)
            if (r3 != 0) goto L_0x0441
        L_0x043f:
            java.lang.String r3 = ""
        L_0x0441:
            X.Vui r2 = new X.Vui
            r2.<init>(r1, r4, r6, r3)
            r2.A0A = r8
            r2.A00()
        L_0x044b:
            X.6ap r4 = new X.6ap
            r4.<init>()
            android.content.Context r2 = r7.A00
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131953557(0x7f130795, float:1.9543588E38)
            java.lang.String r2 = r3.getString(r2)
            r4.A0D = r2
            com.instagram.model.mediasize.ImageInfo r2 = r6.A08
            if (r2 == 0) goto L_0x0467
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A03(r2)
        L_0x0467:
            r4.A09 = r1
            r4.A03()
            r4.A06()
            X.DbY.A1N(r4)
            r1 = -1454044180(0xffffffffa9550bec, float:-4.730584E-14)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1369416275(0xffffffffae605dad, float:-5.1014904E-11)
            goto L_0x07c6
        L_0x047d:
            r0 = -1378473824(0xffffffffadd628a0, float:-2.4347024E-11)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.4mz r3 = (X.C273664mz) r3
            r2 = 200698661(0xbf66b25, float:9.4916966E-32)
            int r5 = X.AnonymousClass7TG.A0D(r3, r2)
            java.lang.Object r6 = r1.A02
            X.4xT r6 = (X.C278754xT) r6
            com.instagram.common.session.UserSession r2 = r6.A03
            X.1P2 r2 = X.1P1.A00(r2)
            X.1Gd r2 = r2.A00
            X.1Gd.A00(r2)
            java.util.HashSet r4 = r6.A05
            X.92j r2 = X.C3727792j.PROFILE_FEED
            r4.remove(r2)
            boolean r2 = r6.A0A
            if (r2 == 0) goto L_0x04c8
            java.util.List r2 = r3.A03
            if (r2 == 0) goto L_0x04d0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x04b4:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x04d5
            java.lang.Object r2 = r3.next()
            X.UNQ r2 = (X.UNQ) r2
            X.1Xj r2 = r2.A01
            if (r2 == 0) goto L_0x04b4
            r4.add(r2)
            goto L_0x04b4
        L_0x04c8:
            java.lang.Object r1 = r1.A01
            X.540 r1 = (X.AnonymousClass540) r1
            X.C278754xT.A02(r1, r6)
            goto L_0x04dc
        L_0x04d0:
            java.util.List r4 = r3.A06
            X.0qQ.A07(r4)
        L_0x04d5:
            java.lang.Object r1 = r1.A01
            X.540 r1 = (X.AnonymousClass540) r1
            X.C278754xT.A03(r1, r6, r4)
        L_0x04dc:
            r1 = 1697249631(0x6529f95f, float:5.01675E22)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 2106614293(0x7d906215, float:2.3989763E37)
            goto L_0x07c6
        L_0x04e7:
            r0 = -237500018(0xfffffffff1d8098e, float:-2.13953E30)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.UXq r3 = (X.C15256UXq) r3
            r2 = -1582149714(0xffffffffa1b24fae, float:-1.208284E-18)
            int r6 = X.AnonymousClass0fD.A03(r2)
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r5 = r1.A02
            X.ViP r5 = (X.C17934ViP) r5
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r8 = r1.A01
            X.UZ2 r8 = (X.UZ2) r8
            X.Vjk r9 = r5.A04
            X.V3h r1 = r3.A02
            r7 = 0
            if (r1 == 0) goto L_0x062c
            java.lang.String r1 = r1.A02
        L_0x0510:
            r9.A03 = r1
            java.lang.String r4 = "state_predicted"
            r1 = 1
            r9.A01(r4, r1)
            java.lang.String r4 = r5.A01
            java.util.HashMap r1 = r3.A05
            if (r1 != 0) goto L_0x0623
            r4 = 0
        L_0x051f:
            boolean r1 = r8.isAdded()
            if (r1 == 0) goto L_0x0613
            X.U9i r12 = r8.A06
            X.V3i r11 = r3.A03
            X.V3h r13 = r3.A02
            r9 = 0
            if (r13 == 0) goto L_0x0553
            java.lang.String r10 = r13.A02
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L_0x053f
            java.lang.String r10 = r13.A01
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L_0x053f
            r10 = 0
        L_0x053f:
            X.VW1 r1 = r13.A00
            if (r1 == 0) goto L_0x0545
            java.lang.String r9 = r1.A01
        L_0x0545:
            if (r10 == 0) goto L_0x0553
            int r1 = r10.length()
            if (r1 == 0) goto L_0x0553
            java.lang.String r1 = "  •  "
            java.lang.String r9 = X.002.A0g(r10, r1, r9)
        L_0x0553:
            boolean r1 = r3.A07
            r12.A04 = r11
            r12.A06 = r9
            r12.A08 = r1
            boolean r1 = r8.isAdded()
            if (r1 == 0) goto L_0x0613
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r8.A02
            r1.getClass()
            boolean r1 = r1.A0D
            if (r1 == 0) goto L_0x0573
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r1 = r8.A02
            r1.A0A()
            X.U9i r1 = r8.A06
            r1.A09 = r2
        L_0x0573:
            X.V3h r11 = r3.A02
            X.W1R r10 = r8.A03
            if (r11 == 0) goto L_0x05a5
            java.lang.String r2 = r11.A02
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x058a
            java.lang.String r2 = r11.A01
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r9 = 0
            if (r1 != 0) goto L_0x058b
        L_0x058a:
            r9 = r2
        L_0x058b:
            X.VW1 r1 = r11.A00
            java.lang.String r2 = r1.A01
            if (r9 == 0) goto L_0x059a
            r10.A0H = r9
            android.widget.TextView r1 = r10.A0C
            if (r1 == 0) goto L_0x059a
            r1.setText(r9)
        L_0x059a:
            if (r2 == 0) goto L_0x05a5
            r10.A0G = r2
            android.widget.TextView r1 = r10.A0B
            if (r1 == 0) goto L_0x05a5
            r1.setText(r2)
        L_0x05a5:
            X.W1R r1 = r8.A03
            android.view.View r9 = r1.A06
            if (r9 == 0) goto L_0x05b0
            r1 = 500(0x1f4, double:2.47E-321)
            X.2eQ.A06(r9, r1)
        L_0x05b0:
            X.W1R r1 = r8.A03
            r1.A03()
            X.U9i r9 = r8.A06
            java.util.List r1 = r3.A06
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r9.A05 = r1
            java.util.List r1 = r9.A07
            X.DbW.A0z(r9, r2, r1)
            android.content.Context r1 = r8.getContext()
            if (r1 == 0) goto L_0x0613
            if (r4 == 0) goto L_0x0613
            android.content.Context r2 = r8.getContext()
            r1 = 68
            float r1 = X.0nA.A04(r2, r1)
            int r10 = (int) r1
            X.U9i r3 = r8.A06
            r9 = 0
        L_0x05dc:
            java.util.List r2 = r3.A07
            int r1 = r2.size()
            if (r9 >= r1) goto L_0x0613
            java.lang.Object r1 = r2.get(r9)
            X.Cvr r1 = (X.C45411Cvr) r1
            java.lang.String r1 = r1.A05
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0620
            boolean r1 = r3.A08
            if (r1 != 0) goto L_0x05ff
            java.util.List r1 = r3.A07
            boolean r2 = r1.isEmpty()
            r1 = 2
            if (r2 == 0) goto L_0x0600
        L_0x05ff:
            r1 = 0
        L_0x0600:
            int r9 = r9 + r1
            r1 = -1
            if (r9 == r1) goto L_0x0613
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r4 = r8.A02
            r4.getClass()
            X.Wop r3 = new X.Wop
            r3.<init>(r8, r9, r10)
            r1 = 300(0x12c, double:1.48E-321)
            r4.postDelayed(r3, r1)
        L_0x0613:
            r5.A01 = r7
            r1 = 1077967813(0x40407bc5, float:3.0075543)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1836417323(0xffffffff928a7ed5, float:-8.740291E-28)
            goto L_0x07c6
        L_0x0620:
            int r9 = r9 + 1
            goto L_0x05dc
        L_0x0623:
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x051f
            r4 = r1
            goto L_0x051f
        L_0x062c:
            r1 = r7
            goto L_0x0510
        L_0x062f:
            r9 = 0
            r0 = 944477252(0x384b9444, float:4.8537055E-5)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.UXe r3 = (X.C15244UXe) r3
            r2 = 1561055898(0x5d0bd29a, float:6.2970529E17)
            int r7 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r8 = r1.A01
            X.WTn r8 = (X.C19305WTn) r8
            java.lang.Object r1 = r1.A02
            X.VZc r1 = (X.C17523VZc) r1
            r8.A00 = r1
            com.instagram.model.venue.LocationDict r1 = r3.A02
            if (r1 == 0) goto L_0x0672
            X.3HX r2 = r3.A01
            if (r2 == 0) goto L_0x0672
            com.instagram.reels.store.ReelStore r1 = r8.A08
            r6 = 0
            com.instagram.model.reels.Reel r5 = r1.A0I(r2, r6)
            X.Vhn r4 = r8.A07
            com.instagram.model.venue.LocationDict r1 = r3.A02
            if (r1 == 0) goto L_0x0660
            r9 = r1
        L_0x0660:
            java.lang.Long r1 = r9.Bcn()
            if (r1 == 0) goto L_0x0688
            java.lang.String r2 = r1.toString()
        L_0x066a:
            X.0qQ.A0B(r2, r6)
            java.util.HashMap r1 = r4.A03
            r1.put(r2, r5)
        L_0x0672:
            java.util.Set r1 = r8.A09
            java.util.Iterator r2 = r1.iterator()
        L_0x0678:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x068b
            java.lang.Object r1 = r2.next()
            com.instagram.discovery.mediamap.fragment.LocationListFragment r1 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r1
            r1.A08(r3)
            goto L_0x0678
        L_0x0688:
            java.lang.String r2 = ""
            goto L_0x066a
        L_0x068b:
            r1 = -675744289(0xffffffffd7b8f5df, float:-4.06732296E14)
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = -173263657(0xfffffffff5ac34d7, float:-4.365951E32)
            goto L_0x07c6
        L_0x0696:
            r0 = -1207055530(0xffffffffb80dcb56, float:-3.380639E-5)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.E8Y r3 = (X.E8Y) r3
            r2 = 1840046587(0x6dace1fb, float:6.688077E27)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r7 = r1.A01
            X.Ugw r7 = (X.C15691Ugw) r7
            r9 = 0
            r7.A04 = r9
            X.C15691Ugw.A00(r7)
            X.Vku r8 = r7.A07
            boolean r2 = r7.A05
            if (r2 == 0) goto L_0x06dc
            java.util.List r2 = r3.A00
            r2.getClass()
        L_0x06bb:
            java.util.List r11 = r8.A01
            r11.clear()
            java.util.Iterator r10 = r2.iterator()
        L_0x06c4:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x06e5
            com.instagram.user.model.User r5 = X.DbT.A0k(r10)
            if (r5 == 0) goto L_0x06da
            r4 = 1
            X.Vj0 r2 = new X.Vj0
            r2.<init>(r5, r4)
        L_0x06d6:
            r11.add(r2)
            goto L_0x06c4
        L_0x06da:
            r2 = 0
            goto L_0x06d6
        L_0x06dc:
            java.lang.Object r2 = r1.A02
            X.7ax r2 = (X.C334247ax) r2
            java.util.List r2 = r2.getItems()
            goto L_0x06bb
        L_0x06e5:
            java.util.List r4 = r7.A01
            com.google.common.collect.ImmutableList r2 = r8.A00()
            r4.addAll(r2)
            java.util.List r2 = r3.A01
            if (r2 == 0) goto L_0x0712
            java.util.List r5 = r8.A00
            r5.clear()
            java.util.Iterator r4 = r2.iterator()
        L_0x06fb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0712
            com.instagram.user.model.User r3 = X.DbT.A0k(r4)
            if (r3 == 0) goto L_0x0710
            X.Vj0 r2 = new X.Vj0
            r2.<init>(r3, r9)
        L_0x070c:
            r5.add(r2)
            goto L_0x06fb
        L_0x0710:
            r2 = 0
            goto L_0x070c
        L_0x0712:
            java.util.List r5 = r7.A02
            java.util.List r4 = r8.A00
            r3 = 1
            X.WMl r2 = new X.WMl
            r2.<init>(r3)
            java.util.List r2 = X.C256393vh.A02(r2, r4)
            com.google.common.collect.ImmutableList r2 = X.DbU.A0K(r2)
            r5.addAll(r2)
            java.lang.Object r1 = r1.A02
            X.7ax r1 = (X.C334247ax) r1
            java.lang.String r1 = r1.BjE()
            r7.A00 = r1
            r7.DNk()
            r7.A02()
            r1 = -1468950991(0xffffffffa8719631, float:-1.3410755E-14)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 953695899(0x38d83e9b, float:1.0311344E-4)
            goto L_0x07c6
        L_0x0742:
            r0 = -1552971645(0xffffffffa36f8883, float:-1.29851234E-17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r3 = (X.AnonymousClass3JC) r3
            r2 = 293285955(0x117b3043, float:1.981528E-28)
            int r2 = X.AnonymousClass0fD.A03(r2)
            r6 = 0
            X.0qQ.A0B(r3, r6)
            java.lang.Object r5 = r3.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x07a1
            X.Uyj r4 = X.C16647Uyj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "update_ig_pro_identity_cache(entrypoint:$entrypoint)"
            java.lang.Enum r5 = r5.getOptionalEnumField(r6, r3, r4)
        L_0x0764:
            X.Uyj r4 = X.C16647Uyj.SUCCESS
            java.lang.Object r3 = r1.A02
            X.Vh6 r3 = (X.C17853Vh6) r3
            X.0eM r3 = r3.A03
            java.lang.Object r3 = r3.getValue()
            X.Vrg r3 = (X.C18437Vrg) r3
            java.lang.Object r1 = r1.A01
            X.N49 r1 = (X.N49) r1
            if (r5 != r4) goto L_0x0791
            X.0qQ.A0B(r1, r6)
            java.lang.String r6 = r1.A00
            java.lang.String r7 = r1.A01
            java.lang.String r4 = "client_update_cached_info_success"
            java.lang.String r5 = "client_update_cached_info"
            r8 = 0
        L_0x0784:
            X.C18437Vrg.A00(r3, r4, r5, r6, r7, r8)
            r1 = -297311199(0xffffffffee476421, float:-1.5427141E28)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = 1685813565(0x647b793d, float:1.8555476E22)
            goto L_0x07c6
        L_0x0791:
            java.lang.String r8 = java.lang.String.valueOf(r5)
            X.0qQ.A0B(r1, r6)
            java.lang.String r6 = r1.A00
            java.lang.String r7 = r1.A01
            java.lang.String r4 = "client_update_cached_info_failure"
            java.lang.String r5 = "client_update_cached_info"
            goto L_0x0784
        L_0x07a1:
            r5 = 0
            goto L_0x0764
        L_0x07a3:
            r0 = -601041041(0xffffffffdc2cd76f, float:-1.94602271E17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.K1I r3 = (X.K1I) r3
            r2 = 547212376(0x209dcc58, float:2.6732058E-19)
            int r8 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r5 = r1.A01
            com.instagram.archive.fragment.ArchiveReelMapFragment r5 = (com.instagram.archive.fragment.ArchiveReelMapFragment) r5
            boolean r2 = r5.isResumed()
            if (r2 != 0) goto L_0x07ca
            r1 = -1075303884(0xffffffffbfe82a34, float:-1.8137879)
        L_0x07c0:
            X.AnonymousClass0fD.A0A(r1, r8)
            r1 = -319862701(0xffffffffecef4853, float:-2.3141985E27)
        L_0x07c6:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x07ca:
            java.util.List r7 = r3.A01
            java.util.List r2 = r3.A00
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r3 = 0
        L_0x07d4:
            int r2 = r7.size()
            if (r3 >= r2) goto L_0x0832
            X.1Xj r6 = X.DbZ.A0T(r7, r3)
            java.lang.Object r2 = r4.get(r3)
            X.L3L r2 = (X.L3L) r2
            java.lang.String r9 = r2.A01
            X.WT0 r2 = r5.A01
            java.lang.String r10 = r6.getId()
            if (r9 == 0) goto L_0x082c
            java.lang.Object r9 = r4.get(r3)
            java.util.Map r2 = r2.A03
            r2.put(r10, r9)
        L_0x07f7:
            java.util.Set r2 = r5.A09
            boolean r9 = r2.contains(r6)
            if (r9 != 0) goto L_0x0829
            com.instagram.model.venue.Venue r14 = r6.A24()
            if (r14 == 0) goto L_0x0829
            java.lang.Double r15 = r14.A00()
            java.lang.Double r16 = r14.A01()
            java.lang.String r17 = r6.getId()
            com.instagram.common.typedurl.ImageUrl r11 = r6.A1Q()
            long r18 = r6.A1A()
            X.Ux9 r13 = X.C16557Ux9.FEED
            r12 = 0
            com.instagram.discovery.mediamap.model.MediaMapPin r10 = new com.instagram.discovery.mediamap.model.MediaMapPin
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r9 = r5.A08
            r9.add(r10)
            r2.add(r6)
        L_0x0829:
            int r3 = r3 + 1
            goto L_0x07d4
        L_0x082c:
            java.util.List r2 = r2.A01
            r2.add(r10)
            goto L_0x07f7
        L_0x0832:
            X.UH0 r4 = r5.mClusterOverlay
            X.WFB r2 = r5.A03
            if (r2 == 0) goto L_0x0844
            if (r4 == 0) goto L_0x0844
            java.util.List r3 = r5.A08
            X.VjV r2 = r2.A00
            r2.A01(r3)
            r4.A0H()
        L_0x0844:
            java.util.List r2 = r5.A07
            java.lang.Object r1 = r1.A02
            r2.add(r1)
            java.util.Collections.sort(r2)
            r1 = 1253855549(0x4abc513d, float:6170782.5)
            goto L_0x07c0
        L_0x0853:
            X.VLr r5 = new X.VLr
            r5.<init>(r9)
            X.X2s r3 = r8.A00
            X.V33 r2 = r8.A02
            X.UVD r2 = (X.UVD) r2
            r1 = 1
            X.UW1 r0 = new X.UW1
            r0.<init>(r5, r2, r1)
            r3.APd(r0)
            r0 = -1333958755(0xffffffffb07d679d, float:-9.2188107E-10)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1709565311(0xffffffff9a1a1a81, float:-3.1867863E-23)
            goto L_0x0be7
        L_0x0872:
            r1.A01(r0)
            r0 = -1888029743(0xffffffff8f76f3d1, float:-1.2175694E-29)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1756535763(0x68b29bd3, float:6.7476455E24)
            goto L_0x0be7
        L_0x0880:
            java.lang.Integer r1 = r8.A01
            X.0qQ.A07(r1)
            java.lang.String r0 = "catalog_load_more_success"
            X.0xI r2 = X.W35.A00(r3, r0)
            java.lang.String r1 = X.VHW.A00(r1)
            java.lang.String r0 = "products_source_type"
            r2.A0C(r0, r1)
            X.W35.A05(r2, r3)
            r0 = 1475355862(0x57f024d6, float:5.28082E14)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 2143084327(0x7fbcdf27, float:NaN)
            goto L_0x0be7
        L_0x08a2:
            r0 = 1429129656(0x552ec9b8, float:1.20113374E13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.1XO r3 = (X.1XO) r3
            r0 = -671134433(0xffffffffd7ff4d1f, float:-5.61413395E14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.util.List r2 = r3.A06
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x08f2
            java.lang.Object r6 = X.AnonymousClass7TE.A13(r2)
            X.1Xj r6 = (X.1Xj) r6
            if (r6 == 0) goto L_0x08f2
            java.lang.Object r0 = r1.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            X.TzX r0 = r0.mListAdapter
            if (r0 == 0) goto L_0x08f2
            java.lang.Object r3 = r1.A02
            X.3uh r3 = (X.C255773uh) r3
            java.util.HashMap r1 = r0.A0C
            java.lang.String r0 = r3.A0j
            java.lang.Object r2 = r1.get(r0)
            X.Tzb r2 = (X.C14629Tzb) r2
            if (r2 == 0) goto L_0x08f2
            X.1Xj r0 = r3.A0b
            if (r0 == 0) goto L_0x08f2
            java.lang.String r1 = r0.A2n()
            java.lang.String r0 = r6.A2n()
            if (r1 != r0) goto L_0x08f2
            X.TrF r1 = r2.A0j
            r1.A01 = r6
            r1.A07()
            r0 = 0
            r1.A01 = r0
        L_0x08f2:
            r0 = 2118615471(0x7e4781af, float:6.629743E37)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1421024565(0xffffffffab4ce2cb, float:-7.27901E-13)
            goto L_0x0be7
        L_0x08fd:
            r0 = -2136001846(0xffffffff80af32ca, float:-1.6089432E-38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1546539563(0xffffffffa3d1add5, float:-2.2733446E-17)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A02
            X.DbS.A1U(r0)
            r0 = 767030039(0x2db7f317, float:2.0912645E-11)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 2067267728(0x7b380090, float:9.55394E35)
            goto L_0x0be7
        L_0x091b:
            r0 = 297684618(0x11be4e8a, float:3.0025118E-28)
            int r4 = X.AnonymousClass0fD.A03(r0)
            com.instagram.model.shopping.productfeed.ProductFeedResponse r3 = (com.instagram.model.shopping.productfeed.ProductFeedResponse) r3
            r0 = -670647216(0xffffffffd806bc50, float:-5.9257342E14)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment r5 = (com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment) r5
            X.UAP r2 = r5.A03
            java.util.List r0 = r3.A03
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r1 = r1.A02
            X.UxB r1 = (X.C16559UxB) r1
            r2.A03(r1, r0)
            X.UxB r0 = X.C16559UxB.SAME_MERCHANT
            if (r1 != r0) goto L_0x0963
            X.Vap r0 = r5.A04
            X.02m r5 = r0.A00
            X.0qQ.A06(r5)
            java.util.Set r3 = r0.A04
            r2 = 37365602(0x23a2762, float:1.3676424E-37)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x0963
            r0 = 2
            r5.markerEnd(r2, r0)
            r3.remove(r1)
        L_0x0963:
            r0 = 838076213(0x31f40735, float:7.102154E-9)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -415981312(0xffffffffe734a100, float:-8.529959E23)
            goto L_0x0be7
        L_0x096e:
            r0 = 2083462657(0x7c2f1e01, float:3.637042E36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1763829312(0xffffffff96de19c0, float:-3.5882285E-25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A02
            X.0lg r0 = (X.0lg) r0
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            X.WQJ r0 = new X.WQJ
            r0.<init>(r1)
            r2.A00(r0)
            r0 = -2030252204(0xffffffff86fccf54, float:-9.5096506E-35)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -275842934(0xffffffffef8ef88a, float:-8.849467E28)
            goto L_0x0be7
        L_0x099b:
            r0 = -2094503628(0xffffffff83286934, float:-4.949153E-37)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UXg r3 = (X.C15246UXg) r3
            r0 = -877745162(0xffffffffcbaeabf6, float:-2.2894572E7)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r5 = r1.A02
            X.W01 r5 = (X.W01) r5
            r0 = 0
            X.W01.A00(r0, r3, r5, r2, r2)
            android.content.Context r2 = r5.A00
            com.instagram.common.session.UserSession r1 = r5.A02
            X.1Xj r0 = r5.A03
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.C49102EpR.A00(r2, r1, r0)
            X.1Ng r2 = r5.A01
            X.3uh r1 = r5.A04
            X.WQ9 r0 = new X.WQ9
            r0.<init>(r1)
            r2.A05(r0)
            r0 = -656241632(0xffffffffd8e28c20, float:-1.99273168E15)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1599597121(0x5f57ea41, float:1.5558319E19)
            goto L_0x0be7
        L_0x09db:
            r0 = 592436626(0x234fdd92, float:1.1268412E-17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.UXg r3 = (X.C15246UXg) r3
            r0 = -1581826213(0xffffffffa1b73f5b, float:-1.2417332E-18)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            java.lang.Object r8 = r1.A02
            X.W01 r8 = (X.W01) r8
            r5 = 0
            X.W01.A00(r5, r3, r8, r7, r7)
            android.content.Context r3 = r8.A00
            com.instagram.common.session.UserSession r2 = r8.A02
            X.1Xj r0 = r8.A03
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.C49102EpR.A00(r3, r2, r0)
            X.1Ng r3 = r8.A01
            X.3uh r2 = r8.A04
            X.WQ9 r0 = new X.WQ9
            r0.<init>(r2)
            r3.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VOl r0 = (X.C17258VOl) r0
            android.app.Activity r1 = r0.A00
            r0 = 2131967852(0x7f133f6c, float:1.9572582E38)
            X.C59689JTv.A01(r1, r5, r0, r7)
            r0 = 459309105(0x1b608031, float:1.8570267E-22)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -911670229(0xffffffffc9a9042b, float:-1384581.4)
            goto L_0x0be7
        L_0x0a27:
            r0 = -534337539(0xffffffffe026a7fd, float:-4.803538E19)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 632902485(0x25b95355, float:3.2148852E-16)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A02
            X.Vkx r0 = (X.C18070Vkx) r0
            r0.A03()
            r0 = 1756699568(0x68b51bb0, float:6.8420726E24)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1558681224(0x5ce79688, float:5.21489844E17)
            goto L_0x0be7
        L_0x0a47:
            r0 = -376219352(0xffffffffe9935928, float:-2.226664E25)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 361219843(0x1587c703, float:5.484005E-26)
            int r7 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r1.A02
            X.WWM r6 = (X.WWM) r6
            X.UAB r5 = r6.A05
            java.lang.Object r3 = r1.A01
            X.WaO r3 = (X.C19476WaO) r3
            java.util.List r2 = r5.A02
            boolean r0 = r2.remove(r3)
            if (r0 == 0) goto L_0x0a77
            java.util.List r1 = r5.A01
            r1.clear()
            java.util.List r0 = r5.A03
            r1.addAll(r0)
            r1.addAll(r2)
            r5.notifyDataSetChanged()
        L_0x0a77:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.WQE r0 = new X.WQE
            r0.<init>(r3)
            r1.A00(r0)
            r0 = -1394883304(0xffffffffacdbc518, float:-6.246236E-12)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 683286444(0x28ba1fac, float:2.0663884E-14)
            goto L_0x0be7
        L_0x0a90:
            r0 = 1072870063(0x3ff2b2af, float:1.896078)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Duv r3 = (X.C47328Duv) r3
            r0 = 951424128(0x38b59480, float:8.658413E-5)
            int r7 = X.AnonymousClass0fD.A03(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A1F
            java.lang.Object r5 = r1.A01
            X.Wfx r5 = (X.C19816Wfx) r5
            com.instagram.common.session.UserSession r2 = r5.A01
            java.lang.Object r0 = r1.A02
            X.Vc9 r0 = (X.C17678Vc9) r0
            X.X1p r0 = r0.A07
            X.F74.A00(r2, r0, r6)
            X.V43 r1 = r5.A02
            com.instagram.user.model.User r0 = r3.A00
            r1.A04 = r0
            r0 = 1111718317(0x424379ad, float:48.868824)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 331718150(0x13c59e06, float:4.9885615E-27)
            goto L_0x0be7
        L_0x0ac2:
            r0 = -1820920059(0xffffffff9376f705, float:-3.1171355E-27)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DwB r3 = (X.DwB) r3
            r0 = -1404387848(0xffffffffac4abdf8, float:-2.881138E-12)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            java.lang.Object r5 = r1.A01
            X.Wfw r5 = (X.C19815Wfw) r5
            com.instagram.common.session.UserSession r7 = r5.A01
            java.lang.Object r0 = r1.A02
            X.Vc9 r0 = (X.C17678Vc9) r0
            X.X1p r0 = r0.A07
            X.F74.A00(r7, r0, r2)
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r2.A01(r7)
            X.V43 r5 = r5.A02
            X.F1D r0 = r5.A01
            java.lang.String r0 = r0.A0F
            r1.A0t(r0)
            com.instagram.user.model.User r2 = r2.A01(r7)
            X.F1D r0 = r5.A01
            java.lang.String r1 = r0.A0A
            X.4Cl r0 = r2.A03
            r0.EPd(r1)
            com.instagram.user.model.User r0 = r3.A00
            r5.A04 = r0
            r0 = 135695980(0x8168e6c, float:4.53064E-34)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -535588325(0xffffffffe013921b, float:-4.2534365E19)
            goto L_0x0be7
        L_0x0b0e:
            r0 = -2073490671(0xffffffff84690b11, float:-2.73941E-36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1458705035(0x56f2128b, float:1.33080728E14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r1.A02
            X.4xT r3 = (X.C278754xT) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.1P2 r0 = X.1P1.A00(r0)
            X.1Gd r0 = r0.A00
            X.1Gd.A00(r0)
            java.util.HashSet r2 = r3.A05
            X.92j r0 = X.C3727792j.STORY_HIGHLIGHTS
            r2.remove(r0)
            java.lang.Object r0 = r1.A01
            X.540 r0 = (X.AnonymousClass540) r0
            X.C278754xT.A02(r0, r3)
            r0 = 1948940404(0x742a7874, float:5.4024264E31)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1670122969(0xffffffff9c73f227, float:-8.071493E-22)
            goto L_0x0be7
        L_0x0b44:
            r0 = 1974420099(0x75af4283, float:4.443364E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.NHS r3 = (X.NHS) r3
            r0 = 1120794848(0x42cdf8e0, float:102.986084)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r1.A01
            X.VwC r5 = (X.C18657VwC) r5
            r0 = 1
            r5.A00 = r0
            java.util.List r9 = r3.A04
            java.lang.Object r6 = r1.A02
            com.instagram.discovery.mediamap.intf.MediaMapQuery r6 = (com.instagram.discovery.mediamap.intf.MediaMapQuery) r6
            r7 = 0
            r8 = r7
            r10 = r7
            r5.A05(r6, r7, r8, r9, r10)
            r5.A04(r6)
            X.C18657VwC.A00(r5, r6)
            r0 = -1230756886(0xffffffffb6a423ea, float:-4.891762E-6)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1432616889(0xffffffffaa9c0047, float:-2.771136E-13)
            goto L_0x0be7
        L_0x0b77:
            r0 = -826492186(0xffffffffcebcbae6, float:-1.58318259E9)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1881843593(0x702aa789, float:2.1125996E29)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A02
            X.VXt r0 = (X.C17490VXt) r0
            X.1Ng r2 = r0.A02
            java.lang.Object r1 = r1.A01
            X.VgE r1 = (X.C17801VgE) r1
            X.WQF r0 = new X.WQF
            r0.<init>(r1)
            r2.A00(r0)
            r0 = -1138854638(0xffffffffbc1e7512, float:-0.009671466)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 234864812(0xdffc0ac, float:1.5761972E-30)
            goto L_0x0be7
        L_0x0ba1:
            r0 = 628243998(0x25723e1e, float:2.10112E-16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1255654483(0x4ad7c453, float:7070249.5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15619Ufl.super.onSuccess(r3)
            java.lang.Object r0 = r1.A01
            X.W1j r0 = (X.C18783W1j) r0
            X.C18783W1j.A01(r0)
            com.instagram.common.session.UserSession r0 = r0.A04
            X.FA1 r0 = X.C49905FEd.A00(r0)
            com.instagram.settings2.core.session.SettingsSession r0 = r0.A00
            if (r0 == 0) goto L_0x0bc6
            r0.A03()
        L_0x0bc6:
            r0 = 65698408(0x3ea7a68, float:1.3781387E-36)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 2097906862(0x7d0b84ae, float:1.1590725E37)
            goto L_0x0be7
        L_0x0bd0:
            r0 = 1441323945(0x55e8dba9, float:3.20037664E13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -600256396(0xffffffffdc38d074, float:-2.08082369E17)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 1988435633(0x76851eb1, float:1.349996E33)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 496045290(0x1d910cea, float:3.8394533E-21)
        L_0x0be7:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15619Ufl.onSuccess(java.lang.Object):void");
    }
}
