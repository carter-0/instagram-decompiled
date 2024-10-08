package X;

/* renamed from: X.Fxq  reason: case insensitive filesystem */
public final class C51643Fxq extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51643Fxq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, AnonymousClass4D7 r12, int i) {
        super(2, r12);
        this.A01 = i;
        this.A09 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A0B = obj4;
        this.A07 = obj5;
        this.A08 = obj6;
        this.A05 = obj7;
        this.A0A = obj8;
        this.A03 = obj9;
        this.A02 = obj10;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Fxq, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        int i;
        AnonymousClass4D7 r11 = r15;
        if (this.A01 != 0) {
            obj3 = this.A09;
            obj4 = this.A06;
            obj2 = this.A04;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj7 = this.A08;
            obj8 = this.A05;
            obj9 = this.A0A;
            obj10 = this.A03;
            obj11 = this.A02;
            i = 1;
        } else {
            obj2 = this.A04;
            obj3 = this.A09;
            obj4 = this.A06;
            obj5 = this.A0B;
            obj6 = this.A07;
            obj7 = this.A08;
            obj8 = this.A05;
            obj9 = this.A0A;
            obj10 = this.A03;
            obj11 = this.A02;
            i = 0;
        }
        ? fxq = new C51643Fxq(obj3, obj4, obj2, obj5, obj6, obj7, obj8, obj9, obj10, obj11, r11, i);
        fxq.A00 = obj;
        return fxq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0221, code lost:
        if (r11 != 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x024f, code lost:
        if (X.182.A06(r9, X.AnonymousClass7TF.A0L(r10, 0), 36315868338196079L) != false) goto L_0x0251;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A01
            X.0eS.A00(r17)
            java.lang.Object r2 = r0.A00
            if (r1 == 0) goto L_0x0262
            X.G5A r2 = (X.G5A) r2
            boolean r1 = r2 instanceof X.C50689Fgo
            r7 = 0
            r3 = 8
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.A09
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            java.lang.Object r0 = r0.A06
            com.instagram.ui.emptystaterow.EmptyStateView r0 = (com.instagram.ui.emptystaterow.EmptyStateView) r0
            r0.setVisibility(r7)
            r0.A0L()
        L_0x0025:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0028:
            boolean r1 = r2 instanceof X.C50688Fgn
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.A09
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            java.lang.Object r0 = r0.A06
            com.instagram.ui.emptystaterow.EmptyStateView r0 = (com.instagram.ui.emptystaterow.EmptyStateView) r0
            r0.setVisibility(r7)
            r0.A0J()
            goto L_0x0025
        L_0x003e:
            boolean r1 = r2 instanceof X.C50687Fgm
            if (r1 == 0) goto L_0x0295
            java.lang.Object r1 = r0.A09
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r7)
            java.lang.Object r1 = r0.A06
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            X.Fgm r2 = (X.C50687Fgm) r2
            com.instagram.user.model.User r6 = r2.A00
            java.lang.Object r5 = r0.A04
            X.E5U r5 = (X.E5U) r5
            X.0eM r1 = r5.A06
            java.lang.Object r2 = r1.getValue()
            X.Dl1 r2 = (X.C46774Dl1) r2
            boolean r1 = r2.A01
            if (r1 != 0) goto L_0x007c
            com.instagram.common.session.UserSession r9 = r2.A02
            java.lang.String r1 = r2.A04
            X.0xG r8 = X.DbS.A0O(r1)
            X.6rY r10 = X.DbV.A0e(r6)
            java.lang.String r12 = r2.A05
            java.lang.String r13 = r2.A03
            java.lang.String r11 = "profile_notifications_bottomsheet_impression"
            X.C319976rX.A06(r8, r9, r10, r11, r12, r13)
            r1 = 1
            r2.A01 = r1
        L_0x007c:
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "ProfileNotificationsSettingsFragment.ARG_IS_FOR_IGTV_PROFILE"
            boolean r1 = r2.getBoolean(r1)
            java.lang.Object r8 = r0.A0B
            android.view.View r8 = (android.view.View) r8
            if (r1 == 0) goto L_0x00d2
            java.lang.Object r7 = r0.A07
            X.3oV r7 = (X.C252063oV) r7
            java.lang.Object r4 = r0.A08
            X.3oV r4 = (X.C252063oV) r4
            r0 = 2131438423(0x7f0b2b57, float:1.8498772E38)
            android.view.View r2 = r8.requireViewById(r0)
            r1 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            X.E5U.A00(r7, r5, r6)
            X.E5U.A01(r4, r5, r6)
            r0 = 2131438034(0x7f0b29d2, float:1.8497983E38)
            X.DbT.A1F(r8, r0, r3)
            r0 = 2131441848(0x7f0b38b8, float:1.850572E38)
            X.DbT.A1F(r8, r0, r3)
            r0 = 2131438420(0x7f0b2b54, float:1.8498766E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r8, r0)
            com.instagram.igds.components.textcell.IgdsFooterCell r8 = (com.instagram.igds.components.textcell.IgdsFooterCell) r8
            android.content.Context r1 = r5.requireContext()
            r0 = 2131976250(0x7f13603a, float:1.9589615E38)
            java.lang.String r0 = X.DbY.A0b(r1, r6, r0)
        L_0x00ca:
            X.0qQ.A07(r0)
            r8.A00(r0)
            goto L_0x0025
        L_0x00d2:
            r1 = 2131438034(0x7f0b29d2, float:1.8497983E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r8, r1)
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            r1 = 2131976246(0x7f136036, float:1.9589607E38)
            r2.A06(r1)
            X.Njo r4 = X.C69349Njo.TYPE_SWITCH
            r2.setTextCellType(r4)
            boolean r1 = r6.A25()
            r2.setChecked(r1)
            r1 = 7
            X.FdT.A03(r2, r6, r5, r1)
            r1 = 2131441848(0x7f0b38b8, float:1.850572E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r8, r1)
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            r1 = 2131976248(0x7f136038, float:1.9589611E38)
            r2.A06(r1)
            r2.setTextCellType(r4)
            boolean r1 = r6.A24()
            r2.setChecked(r1)
            X.FdT.A03(r2, r6, r5, r3)
            java.lang.Object r1 = r0.A07
            X.3oV r1 = (X.C252063oV) r1
            X.E5U.A00(r1, r5, r6)
            java.lang.Object r1 = r0.A05
            X.3oV r1 = (X.C252063oV) r1
            android.view.View r2 = r1.getView()
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            r1 = 2131976235(0x7f13602b, float:1.9589585E38)
            r2.A06(r1)
            r2.setTextCellType(r4)
            boolean r1 = r6.A22()
            r2.setChecked(r1)
            r1 = 4
            X.FdT.A03(r2, r6, r5, r1)
            java.lang.Object r1 = r0.A08
            X.3oV r1 = (X.C252063oV) r1
            X.E5U.A01(r1, r5, r6)
            java.lang.Object r11 = r0.A0A
            X.3oV r11 = (X.C252063oV) r11
            X.4Cl r1 = r6.A03
            com.instagram.api.schemas.FanClubInfoDict r1 = r1.B3v()
            if (r1 == 0) goto L_0x01a6
            java.lang.String r1 = r1.getFanClubId()
            if (r1 == 0) goto L_0x01a6
            X.17M r2 = r6.A02
            X.17M r1 = X.17M.A06
            if (r2 != r1) goto L_0x01a6
            X.0eM r3 = r5.A05
            X.0lg r10 = X.AnonymousClass7TF.A0L(r3, r7)
            X.0Tu r9 = X.0Tu.A05
            r1 = 36318668656744820(0x8107a300001974, double:3.031410529841226E-306)
            boolean r1 = X.182.A06(r9, r10, r1)
            if (r1 == 0) goto L_0x01a6
            android.view.View r2 = r11.getView()
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            r1 = 2131976249(0x7f136039, float:1.9589613E38)
            r2.A06(r1)
            r2.setTextCellType(r4)
            X.4Cl r1 = r6.A03
            java.lang.Boolean r1 = r1.CTG()
            boolean r1 = X.AnonymousClass7TG.A1X(r1)
            r2.setChecked(r1)
            r1 = 6
            X.FdT.A03(r2, r6, r5, r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.4lm r1 = X.C272994ll.A00(r1)
            java.lang.String r9 = r5.A04
            java.lang.String r3 = r6.getId()
            X.0qQ.A0B(r9, r7)
            X.0wc r2 = r1.A00
            java.lang.String r1 = "ig_fan_club_exclusive_content_notification_profile_settings_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r2, r1)
            X.DbS.A1O(r1, r9)
            X.DbY.A1G(r1, r3)
            r1.Cgf()
        L_0x01a6:
            java.lang.Object r11 = r0.A03
            X.3oV r11 = (X.C252063oV) r11
            X.0eM r10 = r5.A05
            X.0lg r1 = X.AnonymousClass7TF.A0L(r10, r7)
            X.0Tu r9 = X.0Tu.A05
            r2 = 2342158877551824494(0x2081051700010e6e, double:4.062082581451122E-152)
            boolean r1 = X.182.A06(r9, r1, r2)
            if (r1 == 0) goto L_0x01e3
            X.Dc9 r1 = r6.A0H()
            if (r1 == 0) goto L_0x01e3
            android.view.View r11 = r11.getView()
            com.instagram.igds.components.textcell.IgdsListCell r11 = (com.instagram.igds.components.textcell.IgdsListCell) r11
            r1 = 2131976234(0x7f13602a, float:1.9589583E38)
            r11.A06(r1)
            r11.setTextCellType(r4)
            X.Dc9 r4 = r6.A0H()
            X.Dc9 r1 = X.Dc9.ALL
            boolean r1 = X.AnonymousClass7TF.A1W(r4, r1)
            r11.setChecked(r1)
            r1 = 3
            X.FdT.A03(r11, r6, r5, r1)
        L_0x01e3:
            java.lang.Object r11 = r0.A02
            X.3oV r11 = (X.C252063oV) r11
            X.0lg r4 = X.AnonymousClass7TF.A0L(r10, r7)
            r0 = 36315868338196079(0x81051700020e6f, double:3.0296395971150246E-306)
            boolean r4 = X.182.A06(r9, r4, r0)
            if (r4 == 0) goto L_0x0231
            X.Dc9 r4 = r6.A0H()
            if (r4 == 0) goto L_0x0231
            android.view.View r13 = r11.getView()
            com.instagram.igds.components.textcell.IgdsListCell r13 = (com.instagram.igds.components.textcell.IgdsListCell) r13
            r4 = 2131976234(0x7f13602a, float:1.9589583E38)
            r13.A06(r4)
            r4 = 46
            X.FPC r4 = X.FPC.A00(r5, r4)
            r13.A0C(r4)
            X.Dc9 r4 = r6.A0H()
            if (r4 == 0) goto L_0x0223
            int r11 = r4.ordinal()
            r4 = 2
            if (r11 == r4) goto L_0x025e
            r12 = 2131976243(0x7f136033, float:1.9589601E38)
            if (r11 == r7) goto L_0x0226
        L_0x0223:
            r12 = 2131976238(0x7f13602e, float:1.958959E38)
        L_0x0226:
            android.content.res.Resources r4 = r13.getResources()
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r4, r12)
            r13.A0K(r4, r7)
        L_0x0231:
            r4 = 2131438420(0x7f0b2b54, float:1.8498766E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r8, r4)
            com.instagram.igds.components.textcell.IgdsFooterCell r8 = (com.instagram.igds.components.textcell.IgdsFooterCell) r8
            X.0lg r4 = X.AnonymousClass7TF.A0L(r10, r7)
            boolean r2 = X.182.A06(r9, r4, r2)
            if (r2 != 0) goto L_0x0251
            X.0lg r2 = X.AnonymousClass7TF.A0L(r10, r7)
            boolean r0 = X.182.A06(r9, r2, r0)
            r1 = 2131976245(0x7f136035, float:1.9589605E38)
            if (r0 == 0) goto L_0x0254
        L_0x0251:
            r1 = 2131976247(0x7f136037, float:1.958961E38)
        L_0x0254:
            android.content.Context r0 = r5.requireContext()
            java.lang.String r0 = X.DbY.A0b(r0, r6, r1)
            goto L_0x00ca
        L_0x025e:
            r12 = 2131976232(0x7f136028, float:1.9589579E38)
            goto L_0x0226
        L_0x0262:
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r6 = r0.A04
            X.E5U r6 = (X.E5U) r6
            X.0eM r1 = r6.A06
            java.lang.Object r1 = r1.getValue()
            X.Dl1 r1 = (X.C46774Dl1) r1
            X.0Ud r1 = r1.A08
            java.lang.Object r4 = r0.A09
            java.lang.Object r5 = r0.A06
            java.lang.Object r7 = r0.A0B
            java.lang.Object r8 = r0.A07
            java.lang.Object r9 = r0.A08
            java.lang.Object r10 = r0.A05
            java.lang.Object r11 = r0.A0A
            java.lang.Object r12 = r0.A03
            java.lang.Object r13 = r0.A02
            r14 = 0
            r15 = 1
            X.Fxq r3 = new X.Fxq
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0pz r0 = new X.0pz
            r0.<init>(r3, r1)
            X.AnonymousClass11O.A03(r2, r0)
            goto L_0x0025
        L_0x0295:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51643Fxq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C51643Fxq) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
