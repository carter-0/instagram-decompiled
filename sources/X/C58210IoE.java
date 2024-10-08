package X;

/* renamed from: X.IoE  reason: case insensitive filesystem */
public final class C58210IoE extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58210IoE(Object obj, Object obj2, Object obj3, String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.00i] */
    /* JADX WARNING: type inference failed for: r2v37, types: [X.FAk, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b1, code lost:
        X.DbU.A1R(r0.A02(r7).A04(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02ae, code lost:
        r3 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r0.A02;
        r2 = r0.A04;
        X.AnonymousClass33A.A01(X.GMU.A00(r3), r3, r4, (java.lang.Integer) r0.A01, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x04e4, code lost:
        X.C12411Sto.A03(r1, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0596, code lost:
        return X.C51965G9l.A0V(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x056c;
                case 1: goto L_0x04a3;
                case 2: goto L_0x0437;
                case 3: goto L_0x03fb;
                case 4: goto L_0x03de;
                case 5: goto L_0x03c1;
                case 6: goto L_0x03ae;
                case 7: goto L_0x0558;
                case 8: goto L_0x0521;
                case 9: goto L_0x04e9;
                case 10: goto L_0x02ea;
                case 11: goto L_0x02c1;
                case 12: goto L_0x02aa;
                case 13: goto L_0x0294;
                case 14: goto L_0x0288;
                case 15: goto L_0x0252;
                case 16: goto L_0x0211;
                case 17: goto L_0x0007;
                case 18: goto L_0x0007;
                case 19: goto L_0x0124;
                case 20: goto L_0x00bc;
                case 21: goto L_0x00a7;
                case 22: goto L_0x006b;
                case 23: goto L_0x003c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A03
            X.325 r1 = (X.AnonymousClass325) r1
            X.AnonymousClass325.A02(r1)
            java.lang.Object r1 = r0.A01
            X.DTv r1 = (X.C46292DTv) r1
            X.Pwf r0 = r1.Bbg()
            if (r0 == 0) goto L_0x003a
            java.lang.Long r0 = r0.BEY()
        L_0x001c:
            java.lang.String.valueOf(r0)
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r1.Bfu()
            if (r0 == 0) goto L_0x0028
            r0.getProductId()
        L_0x0028:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r1.Bfu()
            if (r0 == 0) goto L_0x0037
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x0037
            r0.getId()
        L_0x0037:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x003a:
            r0 = 0
            goto L_0x001c
        L_0x003c:
            java.lang.Object r6 = r0.A03
            X.GwV r6 = (X.C53925GwV) r6
            com.instagram.common.session.UserSession r1 = r6.A02
            X.Hqf r5 = X.C55252Heh.A00(r1)
            java.lang.Object r1 = r0.A01
            X.2Wb r1 = (X.2Wb) r1
            android.content.Context r4 = X.C243803a8.A00(r1)
            X.HJx r1 = r6.A03
            X.4bN r1 = r1.A06
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x0069
            java.lang.String r3 = r1.A30()
        L_0x005a:
            int r2 = r6.A00
            java.lang.String r1 = r0.A04
            r5.A00(r4, r3, r1, r2)
            java.lang.Object r0 = r0.A02
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.C53925GwV.A05(r0, r6)
            goto L_0x0037
        L_0x0069:
            r3 = 0
            goto L_0x005a
        L_0x006b:
            java.lang.Object r5 = r0.A01
            X.Gmw r5 = (X.C53372Gmw) r5
            if (r5 == 0) goto L_0x0037
            java.lang.Object r3 = r0.A03
            X.GwV r3 = (X.C53925GwV) r3
            java.lang.Object r2 = r0.A02
            X.2Wb r2 = (X.2Wb) r2
            java.lang.String r9 = r0.A04
            java.lang.Object r1 = r5.A04
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.common.session.UserSession r6 = r3.A02
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0037
            X.HJx r8 = r3.A03
            android.content.Context r4 = X.C51966G9m.A0O(r2)
            int r12 = r3.A00
            java.lang.String r10 = r1.getUsername()
            java.lang.String r11 = r5.A05
            java.lang.Object r0 = r5.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r7 = X.00k.A0J(r0)
            com.instagram.common.typedurl.ImageUrl r7 = (com.instagram.common.typedurl.ImageUrl) r7
            X.C55264Het.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x00a7:
            java.lang.Object r1 = r0.A03
            X.GHU r1 = (X.GHU) r1
            X.JTB r3 = r1.A07
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A01
            X.GDe r1 = (X.C52058GDe) r1
            java.lang.String r0 = r0.A04
            r3.DzA(r1, r2, r0)
            goto L_0x0037
        L_0x00bc:
            java.lang.Object r4 = r0.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r7 = r0.A03
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            r5 = 1
            X.AnonymousClass7TF.A1B(r4, r5, r7)
            android.app.Application r1 = r4.getApplication()
            X.0qQ.A07(r1)
            X.AnonymousClass2XD.A00(r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 18306829947774134(0x4109f7000024b6, double:1.8956433487450377E-307)
            boolean r1 = X.1AW.A06(r3, r1)
            if (r1 == 0) goto L_0x0118
            java.lang.String r2 = r7.A06
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r1 = 494(0x1ee, float:6.92E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putExtra(r1, r2)
            r1 = 676(0x2a4, float:9.47E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putExtra(r1, r5)
            java.lang.String r2 = r7.A05
            r1 = 4991(0x137f, float:6.994E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putExtra(r1, r2)
            java.lang.String r0 = r0.A04
            r3.setClassName(r4, r0)
            X.0kR.A0B(r4, r3)
            r1 = 2130772004(0x7f010024, float:1.7147114E38)
            r0 = 2130771973(0x7f010005, float:1.7147051E38)
            r4.overridePendingTransition(r1, r0)
        L_0x0114:
            X.1Q0 r0 = X.1Q0.A1Q
            goto L_0x01b1
        L_0x0118:
            X.FFQ.A00()
            java.lang.Object r1 = r0.A02
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0 = 0
            X.C48974EnC.A00(r4, r1, r7, r0)
            goto L_0x0114
        L_0x0124:
            java.lang.Object r7 = r0.A03
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.0wc r2 = X.AnonymousClass0kN.A02(r7)
            r1 = 2561(0xa01, float:3.589E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r4.isSampled()
            r3 = 0
            if (r1 == 0) goto L_0x014e
            java.lang.String r1 = r0.A04
            X.DbS.A1N(r4, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "is_short_copy"
            r4.A7p(r1, r2)
            r4.Cgf()
        L_0x014e:
            X.FAk r2 = new X.FAk
            r2.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A01(r7, r1)
            java.lang.String r8 = r0.A04
            java.lang.String r1 = "settings"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x01be
            r5 = 1
            com.facebook.common.callercontext.CallerContext r1 = X.FRZ.A00
            X.0Tu r4 = X.DbS.A0J(r7, r3)
            r1 = 36310692902469874(0x810062000000f2, double:3.0263666307219656E-306)
            boolean r1 = X.DbY.A1Z(r4, r7, r1)
            if (r1 == 0) goto L_0x01be
            X.C322576w3.A00()
            java.lang.Object r4 = r0.A01
            android.app.Activity r4 = (android.app.Activity) r4
            X.0qQ.A0B(r4, r3)
            java.lang.Class<com.instagram.business.activity.BusinessConversionActivity> r0 = com.instagram.business.activity.BusinessConversionActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r0)
            android.os.Bundle r2 = X.DbY.A09(r7)
            java.lang.String r1 = "entry_point"
            r0 = 498(0x1f2, float:6.98E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r1, r0)
            r0 = 1821(0x71d, float:2.552E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r5)
            r1 = 7
            r0 = 532(0x214, float:7.45E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putInt(r0, r1)
            r3.putExtras(r2)
            r0 = 11
            X.0kR.A07(r4, r3, r0)
        L_0x01af:
            X.1Q0 r0 = X.1Q0.A1P
        L_0x01b1:
            X.FGI r0 = r0.A02(r7)
            X.0xI r0 = r0.A04()
            X.DbU.A1R(r0, r7)
            goto L_0x0037
        L_0x01be:
            X.0Tu r4 = X.0Tu.A05
            X.0qQ.A08(r4)
            r1 = 18312263081473951(0x410ee80001379f, double:1.8977908085133112E-307)
            boolean r10 = X.1AW.A06(r4, r1)
            java.lang.Object r4 = r0.A02
            X.0BQ r4 = (X.0BQ) r4
            java.lang.Object r5 = r0.A01
            android.app.Activity r5 = (android.app.Activity) r5
            r6 = 0
            r9 = r10 ^ 1
            X.0B7 r0 = r4.AEP(r5, r6, r7, r8, r9, r10)
            android.os.Bundle r2 = r0.A00
            X.AnonymousClass7TG.A1O(r5, r7)
            android.app.Application r0 = r5.getApplication()
            X.0qQ.A07(r0)
            X.AnonymousClass2XD.A00(r0)
            X.Fl7 r1 = X.C49287EsW.A00
            boolean r0 = X.Fl7.A01()
            if (r0 != 0) goto L_0x020a
            if (r10 != 0) goto L_0x020a
            boolean r0 = X.C48760Ejj.A00()
            if (r0 == 0) goto L_0x020a
            X.37E r0 = X.AnonymousClass37D.A00
            r0.A01(r5)
            X.DbS.A1X(r5)
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            java.lang.String r0 = "xav_cds_switcher"
            r1.A02(r2, r5, r7, r0)
            goto L_0x01af
        L_0x020a:
            X.FFQ.A00()
            X.C48974EnC.A00(r5, r2, r7, r3)
            goto L_0x01af
        L_0x0211:
            java.lang.Object r2 = r0.A03
            X.Uqz r2 = (X.C16236Uqz) r2
            X.C16236Uqz.A03(r2)
            X.326 r3 = r2.A03
            java.lang.Object r1 = r0.A02
            X.N8v r1 = (X.C68282N8v) r1
            java.lang.Long r1 = r1.A02
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.Object r4 = r0.A01
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r4 = (com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus) r4
            X.X9C r2 = r2.A04
            X.Vuf r1 = r2.Bz5()
            com.instagram.user.model.Product r1 = r1.A08
            X.0qQ.A0A(r1)
            java.lang.String r6 = r1.A0H
            X.Vuf r1 = r2.Bz5()
            com.instagram.user.model.Product r1 = r1.A08
            X.0qQ.A0A(r1)
            com.instagram.user.model.User r1 = r1.A0B
            if (r1 == 0) goto L_0x0250
            java.lang.String r7 = X.AnonymousClass3ZA.A00(r1)
        L_0x0246:
            X.0qQ.A0A(r7)
            java.lang.String r8 = r0.A04
            r3.A02(r4, r5, r6, r7, r8)
            goto L_0x0037
        L_0x0250:
            r7 = 0
            goto L_0x0246
        L_0x0252:
            java.lang.Object r7 = r0.A03
            X.Uat r7 = (X.C15343Uat) r7
            X.0eM r1 = r7.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.reels.store.ReelStore r6 = X.1OP.A05(r1)
            java.lang.String r5 = r0.A04
            java.lang.Object r4 = r0.A02
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            java.lang.Integer r1 = r4.A0i
            r3 = 0
            int r2 = X.AnonymousClass7TG.A0A(r1)
            X.Dro r1 = new X.Dro
            r1.<init>((java.lang.String) r5, (boolean) r3, (int) r2)
            com.instagram.model.reels.Reel r1 = r6.A0F(r1)
            if (r1 != 0) goto L_0x0279
            r1 = r4
        L_0x0279:
            X.C15343Uat.A00(r1, r7, r3, r3)
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131963427(0x7f132e23, float:1.9563607E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x0037
        L_0x0288:
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r4 = r0.A03
            X.33A r4 = (X.AnonymousClass33A) r4
            androidx.fragment.app.FragmentActivity r1 = r4.A00
            X.DbX.A10(r1, r2)
            goto L_0x02ae
        L_0x0294:
            java.lang.Object r2 = r0.A03
            X.33A r2 = (X.AnonymousClass33A) r2
            java.lang.Object r3 = r0.A02
            java.lang.String r4 = r0.A04
            java.lang.Object r1 = r0.A01
            r5 = 12
            X.IoE r0 = new X.IoE
            r0.<init>(r1, r2, r3, r4, r5)
            X.AnonymousClass33A.A02(r2, r0)
            goto L_0x0037
        L_0x02aa:
            java.lang.Object r4 = r0.A03
            X.33A r4 = (X.AnonymousClass33A) r4
        L_0x02ae:
            java.lang.Object r3 = r0.A02
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r3 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.GPK r0 = X.GMU.A00(r3)
            X.AnonymousClass33A.A01(r0, r3, r4, r1, r2)
            goto L_0x0037
        L_0x02c1:
            java.lang.Object r3 = r0.A03
            X.NKN r3 = (X.NKN) r3
            java.lang.Object r1 = r0.A02
            java.lang.String r2 = X.DbS.A0q(r1)
            X.0eM r1 = r3.A0N
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.5fe r1 = X.C290635fd.A00(r1)
            r1.A05(r2)
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A01
            com.instagram.direct.perf.constants.ThreadFetchReason r1 = (com.instagram.direct.perf.constants.ThreadFetchReason) r1
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            X.NKN.A00(r0, r3, r1, r2)
            X.DbZ.A17(r3)
            goto L_0x0037
        L_0x02ea:
            java.lang.Object r6 = r0.A01
            com.instagram.creator.achievements.modules.models.Badge r6 = (com.instagram.creator.achievements.modules.models.Badge) r6
            boolean r1 = r6 instanceof com.instagram.creator.achievements.modules.models.Badge.AchievementBadge
            if (r1 == 0) goto L_0x032d
            com.instagram.creator.achievements.modules.models.Badge$AchievementBadge r6 = (com.instagram.creator.achievements.modules.models.Badge.AchievementBadge) r6
            com.instagram.api.schemas.Achievement r13 = r6.A01
            X.I6J r3 = X.I6J.A00
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r7 = r0.A04
            r8 = 0
            long r1 = r13.A01
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r9 = X.AnonymousClass7TE.A1I(r1)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r13)
            java.lang.String r5 = "all_earned_achievements_list"
            java.lang.String r6 = "achievement_cell"
            r11 = r8
            r12 = r8
            r3.A08(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.1ZU r11 = X.C48794EkH.A00()
            java.lang.Object r12 = r0.A02
            androidx.fragment.app.FragmentActivity r12 = (androidx.fragment.app.FragmentActivity) r12
            r18 = 1
            r19 = 0
            r14 = r4
            r15 = r8
            r16 = r8
            r17 = r8
            r11.A01(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0037
        L_0x032d:
            boolean r1 = r6 instanceof com.instagram.creator.achievements.modules.models.Badge.ChallengeBadge
            if (r1 == 0) goto L_0x036c
            com.instagram.creator.achievements.modules.models.Badge$ChallengeBadge r6 = (com.instagram.creator.achievements.modules.models.Badge.ChallengeBadge) r6
            com.instagram.api.schemas.Challenge r3 = r6.A01
            X.I6J r4 = X.I6J.A00
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r9 = r0.A04
            r6 = 0
            long r1 = r3.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.util.List r13 = X.AnonymousClass7TE.A1I(r1)
            java.util.List r15 = X.AnonymousClass7TE.A1I(r3)
            java.lang.String r7 = "all_earned_achievements_list"
            java.lang.String r8 = "challenges_cell"
            r10 = r6
            r11 = r6
            r12 = r6
            r14 = r6
            r16 = r6
            r17 = r6
            r4.A05(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ZU r1 = X.C48794EkH.A00()
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            r4 = r5
            r5 = r6
            r6 = r9
            r2 = r0
            r1.A02(r2, r3, r4, r5, r6)
            goto L_0x0037
        L_0x036c:
            boolean r1 = r6 instanceof com.instagram.creator.achievements.modules.models.Badge.ChallengeTieredBadge
            if (r1 == 0) goto L_0x0393
            X.1ZU r1 = X.C48794EkH.A00()
            X.HrP r3 = r1.A00()
            com.instagram.creator.achievements.modules.models.Badge$ChallengeTieredBadge r6 = (com.instagram.creator.achievements.modules.models.Badge.ChallengeTieredBadge) r6
            java.lang.String r2 = r6.A03
            java.util.List r1 = r6.A04
            X.H0Y r2 = r3.A01(r2, r1)
        L_0x0382:
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r0.A03
            X.0lg r0 = (X.0lg) r0
            X.6Yo r0 = X.DbS.A0M(r1, r0)
            X.Dba.A12(r2, r0)
            goto L_0x0037
        L_0x0393:
            boolean r1 = r6 instanceof com.instagram.creator.achievements.modules.models.Badge.AchievementTieredBadge
            if (r1 == 0) goto L_0x0597
            X.1ZU r1 = X.C48794EkH.A00()
            X.HrP r5 = r1.A00()
            com.instagram.creator.achievements.modules.models.Badge$AchievementTieredBadge r6 = (com.instagram.creator.achievements.modules.models.Badge.AchievementTieredBadge) r6
            java.lang.String r4 = r6.A03
            java.util.List r3 = r6.A04
            java.util.List r2 = r6.A05
            java.lang.String r1 = r0.A04
            X.H0Z r2 = r5.A00(r4, r1, r3, r2)
            goto L_0x0382
        L_0x03ae:
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A02
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OOf.A01(r2, r1, r0, r3)
            goto L_0x0037
        L_0x03c1:
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r6 = r0.A04
            java.lang.Object r0 = r0.A02
            X.GpO r0 = (X.C53492GpO) r0
            X.2EG r4 = r0.A02
            java.lang.String r7 = r0.A04
            long r0 = r0.A00
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            X.C56241Hv8.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0037
        L_0x03de:
            java.lang.Object r2 = r0.A03
            X.GgM r2 = (X.C52969GgM) r2
            java.lang.Object r1 = r0.A02
            X.5Oz r1 = (X.C284945Oz) r1
            int r1 = X.C51971G9r.A0B(r1)
            java.lang.String r2 = r2.A0E(r1)
            if (r2 == 0) goto L_0x0037
            java.lang.Object r1 = r0.A01
            X.0sL r1 = (X.0sL) r1
            java.lang.String r0 = r0.A04
            r1.invoke(r0, r2)
            goto L_0x0037
        L_0x03fb:
            java.lang.Object r2 = r0.A01
            X.Xzg r2 = (X.C22331Xzg) r2
            java.lang.Object r1 = r0.A02
            java.lang.String r3 = X.C51966G9m.A1F(r1)
            java.lang.String r4 = r0.A04
            java.lang.Object r1 = r0.A03
            X.4gU r1 = (X.C270284gU) r1
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            java.lang.String r10 = r0.A07
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            boolean r11 = r0.A0B
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            boolean r12 = r0.A09
            java.lang.Object r0 = r1.getValue()
            X.Gmp r0 = (X.C53365Gmp) r0
            boolean r13 = r0.A0E
            r6 = 0
            r14 = 0
            r5 = r4
            r7 = r6
            r8 = r6
            r9 = r6
            r15 = r14
            r2.D6d(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0037
        L_0x0437:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r3 = r0.A03
            X.QDN r3 = (X.QDN) r3
            com.facebookpay.logging.LoggingContext r6 = r3.A1P
            java.lang.Object r2 = r0.A02
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = (com.facebookpay.paymentmethod.model.PaymentMethod) r2
            java.lang.String r1 = r2.Asm()
            long r11 = java.lang.Long.parseLong(r1)
            X.XRm r5 = r2.Asn()
            java.lang.Object r1 = r0.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r1 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r1
            java.lang.String r1 = r1.A0B
            java.util.List r9 = X.AnonymousClass7TE.A1I(r1)
            X.QDL r1 = r3.A1O
            java.util.List r8 = r1.A06()
            X.QDH r2 = r3.A1Q
            X.SEB r1 = r2.A03()
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            X.SUU.A0A(r1, r10)
            java.lang.String r7 = r0.A04
            r4.A0F(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r3.A0u()
            if (r0 != 0) goto L_0x0037
            X.Sto r1 = X.C51965G9l.A0g()
            X.SEB r0 = r2.A03()
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            X.SUU.A0A(r0, r3)
            java.lang.String r2 = "payment_success"
            X.0Ae r1 = r1.A00
            r0 = 673(0x2a1, float:9.43E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 107(0x6b, float:1.5E-43)
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 1
            X.PmT r4 = new X.PmT
            r4.<init>(r6, r3, r2, r0)
            goto L_0x04e4
        L_0x04a3:
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.Object r6 = r0.A02
            com.facebookpay.logging.LoggingContext r6 = (com.facebookpay.logging.LoggingContext) r6
            java.lang.Object r1 = r0.A01
            java.util.List r5 = X.AnonymousClass7TE.A1I(r1)
            java.lang.String r8 = r0.A04
            r1 = 162(0xa2, float:2.27E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r11 = X.0qQ.A0K(r8, r1)
            java.lang.Object r0 = r0.A03
            X.SEB r0 = (X.SEB) r0
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            if (r0 == 0) goto L_0x04ca
            X.SUU.A0A(r0, r7)
        L_0x04ca:
            java.lang.String r9 = "checkout"
            r0 = 0
            int r10 = X.DbW.A03(r0, r6, r8)
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_load_ecpcheckoutcomponent_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 60
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            X.TWQ r4 = new X.TWQ
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x04e4:
            X.C12411Sto.A03(r1, r6, r4)
            goto L_0x0037
        L_0x04e9:
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A01
            java.lang.ref.WeakReference r1 = X.C51965G9l.A0v(r1)
            X.GN1 r5 = new X.GN1
            r5.<init>(r2, r1)
            java.lang.Object r1 = r0.A02
            java.lang.ref.WeakReference r1 = X.C51965G9l.A0v(r1)
            X.9OS r4 = new X.9OS
            r4.<init>(r2, r1)
            java.lang.Object r3 = r0.A03
            X.GMs r3 = (X.C52302GMs) r3
            com.instagram.common.session.UserSession r2 = r3.A02
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r2)
            java.lang.Class<X.3KA> r0 = X.AnonymousClass3KA.class
            r1.A01(r5, r0)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r2)
            java.lang.Class<X.27U> r0 = X.27U.class
            r1.A01(r4, r0)
            r0 = 10
            X.AwZ r1 = new X.AwZ
            r1.<init>(r0, r4, r3, r5)
            goto L_0x0592
        L_0x0521:
            X.1YN r2 = X.AnonymousClass2bO.A00()
            java.lang.Object r3 = r0.A02
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r1 = r0.A01
            X.6Rx r1 = (X.C307896Rx) r1
            X.0iw r4 = X.C308206Td.A08(r1)
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r1 = r0.A04
            java.util.Locale r0 = java.util.Locale.US
            X.0qQ.A08(r0)
            java.lang.String r0 = r1.toUpperCase(r0)
            X.0qQ.A07(r0)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r7 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            X.AnonymousClass2bO.A00()
            X.FhZ r0 = new X.FhZ
            r0.<init>(r3, r5, r1)
            X.2bW r6 = X.2bV.A03(r0)
            X.Dcb r4 = r2.A00(r3, r4, r5, r6, r7)
            return r4
        L_0x0558:
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A02
            X.Jvk r0 = (X.C61046Jvk) r0
            X.T7Q r4 = new X.T7Q
            r4.<init>(r2, r0, r1, r3)
            return r4
        L_0x056c:
            java.lang.Object r6 = r0.A02
            X.Hql r6 = (X.C55980Hql) r6
            java.lang.Object r1 = r0.A01
            androidx.activity.ComponentActivity r1 = (androidx.activity.ComponentActivity) r1
            X.00c r5 = r1.activityResultRegistry
            java.lang.String r4 = r0.A04
            X.0yl r3 = new X.0yl
            r3.<init>()
            java.lang.Object r2 = r0.A03
            r1 = 0
            X.Sby r0 = new X.Sby
            r0.<init>(r1, r6, r2)
            X.0z1 r0 = r5.A02(r0, r3, r4)
            r6.A01 = r0
            r0 = 24
            X.TTN r1 = new X.TTN
            r1.<init>(r6, r0)
        L_0x0592:
            X.3dj r4 = X.C51965G9l.A0V(r1)
            return r4
        L_0x0597:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58210IoE.invoke():java.lang.Object");
    }
}
