package X;

/* renamed from: X.Wr9  reason: case insensitive filesystem */
public final class C20424Wr9 implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20424Wr9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.widget.LinearLayout, X.U53, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0244, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x024b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x018d;
                case 2: goto L_0x0055;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.N4Q r15 = (X.N4Q) r15
            java.lang.Object r3 = r14.A02
            X.Umf r3 = (X.C15998Umf) r3
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r4 = r3.A01
            r1 = 0
            r2 = 0
            if (r4 == 0) goto L_0x001c
            if (r15 == 0) goto L_0x0017
            java.lang.String r0 = r15.A02
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            r4.A08(r0, r1)
        L_0x001c:
            if (r15 == 0) goto L_0x0052
            java.lang.Object r1 = r15.A01
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            if (r1 == 0) goto L_0x002b
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r0 = r3.A01
            if (r0 == 0) goto L_0x002b
            r0.A04(r1, r2)
        L_0x002b:
            int r0 = r15.A00
            if (r0 <= 0) goto L_0x0052
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.Object r0 = r14.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r0 = X.C66580MXl.A0B(r0)
            java.lang.String r2 = X.C253673rC.A03(r0, r1)
            android.content.Context r1 = r3.requireContext()
            r0 = 2131964825(0x7f133399, float:1.9566443E38)
            java.lang.String r1 = X.DbY.A0c(r1, r2, r0)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r0 = r3.A01
            if (r0 == 0) goto L_0x0052
            r0.A07(r1)
        L_0x0052:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0055:
            X.JwC r15 = (X.C61074JwC) r15
            java.lang.Object r10 = r14.A02
            X.UbT r10 = (X.C15375UbT) r10
            androidx.fragment.app.FragmentActivity r9 = r10.getActivity()
            if (r9 == 0) goto L_0x0052
            java.lang.Object r1 = r14.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131441578(0x7f0b37aa, float:1.8505172E38)
            android.view.ViewGroup r8 = X.DbS.A0E(r1, r0)
            if (r8 == 0) goto L_0x0052
            r8.removeAllViews()
            com.instagram.business.promote.model.SpecialRequirementCategory[] r7 = com.instagram.business.promote.model.SpecialRequirementCategory.values()
            r6 = 0
            int r5 = r7.length
        L_0x0077:
            if (r6 >= r5) goto L_0x0052
            r4 = r7[r6]
            X.Tnz r3 = r15.A03(r4)
            if (r3 == 0) goto L_0x0164
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0164
            r12 = 1
            X.U53 r2 = new X.U53
            r2.<init>(r9)
            android.content.Context r1 = r2.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r1)
            r0 = 2131628527(0x7f0e11ef, float:1.888435E38)
            r11.inflate(r0, r2, r12)
            r0 = 2130969338(0x7f0402fa, float:1.7547355E38)
            X.C13988Tno.A0q(r1, r2, r0)
            int r11 = r4.ordinal()
            if (r11 == r12) goto L_0x00c9
            r0 = 2
            if (r11 == r0) goto L_0x00c0
            r0 = 3
            if (r11 == r0) goto L_0x00d2
            r0 = 4
            if (r11 == r0) goto L_0x00b7
            r0 = 0
            if (r11 == r0) goto L_0x00dd
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00b7:
            int r0 = r4.A00
            r2.setPrimaryText(r0)
            r0 = 2131970768(0x7f134ad0, float:1.9578496E38)
            goto L_0x00da
        L_0x00c0:
            int r0 = r4.A00
            r2.setPrimaryText(r0)
            r0 = 2131970762(0x7f134aca, float:1.9578484E38)
            goto L_0x00da
        L_0x00c9:
            int r0 = r4.A00
            r2.setPrimaryText(r0)
            r0 = 2131970759(0x7f134ac7, float:1.9578478E38)
            goto L_0x00da
        L_0x00d2:
            int r0 = r4.A00
            r2.setPrimaryText(r0)
            r0 = 2131970765(0x7f134acd, float:1.957849E38)
        L_0x00da:
            r2.setSecondaryText(r0)
        L_0x00dd:
            boolean r0 = r3.A00
            r2.setCheckBox(r0)
            r11 = 2131441580(0x7f0b37ac, float:1.8505176E38)
            android.view.View r12 = r2.findViewById(r11)
            if (r12 == 0) goto L_0x00f2
            int r0 = X.DbW.A01(r0)
            r12.setVisibility(r0)
        L_0x00f2:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x010d
            r0 = 2131970772(0x7f134ad4, float:1.9578505E38)
            r2.A00(r0)
            r0 = 2131438687(0x7f0b2c5f, float:1.8499308E38)
            android.view.View r12 = X.AnonymousClass7TE.A0b(r2, r0)
            r0 = 0
            r12.setEnabled(r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r12.setAlpha(r0)
        L_0x010d:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x012f
            r0 = 2131970770(0x7f134ad2, float:1.95785E38)
            r2.A00(r0)
            android.view.View r0 = r2.findViewById(r11)
            X.AnonymousClass7TF.A16(r0)
            r0 = 2131438687(0x7f0b2c5f, float:1.8499308E38)
            android.view.View r3 = X.AnonymousClass7TE.A0b(r2, r0)
            r0 = 0
            r3.setEnabled(r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r3.setAlpha(r0)
        L_0x012f:
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            int r3 = X.DbZ.A01(r10)
            if (r4 != r0) goto L_0x0168
            r0 = 4
            X.UsR r12 = new X.UsR
            r12.<init>((X.C15375UbT) r10, (int) r3, (int) r0)
            r0 = 2131441586(0x7f0b37b2, float:1.8505188E38)
            android.widget.TextView r11 = X.AnonymousClass7TE.A0d(r2, r0)
            r0 = 2131970767(0x7f134acf, float:1.9578494E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131970770(0x7f134ad2, float:1.95785E38)
            java.lang.String r0 = X.DbY.A0c(r1, r3, r0)
            if (r11 == 0) goto L_0x0157
            X.AnonymousClass7AV.A07(r12, r11, r3, r0)
        L_0x0157:
            r1 = 11
            X.WB4 r0 = new X.WB4
            r0.<init>(r1, r4, r2, r10)
            X.AnonymousClass0fU.A00(r0, r2)
            r8.addView(r2)
        L_0x0164:
            int r6 = r6 + 1
            goto L_0x0077
        L_0x0168:
            r0 = 3
            X.UsR r13 = new X.UsR
            r13.<init>((X.C15375UbT) r10, (int) r3, (int) r0)
            r0 = 2131970764(0x7f134acc, float:1.9578488E38)
            boolean r3 = r2.A00
            if (r3 != 0) goto L_0x0157
            android.widget.TextView r12 = X.AnonymousClass7TE.A0d(r2, r11)
            r3 = 2131970767(0x7f134acf, float:1.9578494E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r1, r3)
            r3 = 1
            java.lang.String r0 = X.DbY.A0c(r1, r11, r0)
            if (r12 == 0) goto L_0x0157
            X.AnonymousClass7AV.A07(r13, r12, r11, r0)
            r2.A00 = r3
            goto L_0x0157
        L_0x018d:
            X.4dm r15 = (X.C268654dm) r15
            java.lang.Object r7 = r15.A00()
            X.UXo r7 = (X.C15254UXo) r7
            java.lang.Object r1 = r14.A02
            X.UZd r1 = (X.C15275UZd) r1
            if (r7 == 0) goto L_0x01bb
            X.0eM r4 = r1.A0G
            X.WGU r5 = X.C13990Tnq.A0M(r4)
            java.lang.Object r6 = r14.A01
            X.UzE r6 = (X.C16678UzE) r6
            java.lang.String r0 = "promote_error"
            java.lang.String r2 = "initial_fetch"
            r5.A01 = r0
            java.lang.String r0 = r6.toString()
            r3 = 0
            r5.A0W(r0, r2, r3)
            X.UKM r0 = r7.A01
            if (r0 == 0) goto L_0x0227
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0227
        L_0x01bb:
            X.C15275UZd.A08(r1, r15)
            goto L_0x0052
        L_0x01c0:
            X.Jw6 r15 = (X.C61068Jw6) r15
            java.lang.Object r5 = r15.A04
            X.ULF r5 = (X.ULF) r5
            int r0 = r5.A00
            if (r0 != 0) goto L_0x01ec
            java.util.List r1 = r5.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r3 = r14.A02
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r0 = X.C66582MXn.A0r(r1)
            com.instagram.business.promote.model.AudienceGeoLocation r0 = (com.instagram.business.promote.model.AudienceGeoLocation) r0
            android.content.Context r2 = r3.requireContext()
            r1 = 2131952234(0x7f13026a, float:1.9540905E38)
            java.lang.String r0 = r0.A05
            java.lang.String r0 = X.DbV.A0z(r3, r0, r1)
            X.C59689JTv.A09(r2, r0)
        L_0x01ec:
            java.lang.Object r4 = r14.A02
            X.UZ7 r4 = (X.UZ7) r4
            java.util.List r3 = r5.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            java.lang.String r5 = "overlappingWarningTextView"
            android.widget.TextView r1 = r4.A01
            if (r0 == 0) goto L_0x021f
            if (r1 == 0) goto L_0x0244
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r2 = r4.A01
            if (r2 == 0) goto L_0x0244
            r1 = 2131952234(0x7f13026a, float:1.9540905E38)
            X.W2W r0 = X.C17149VKb.A00
            android.content.Context r0 = r4.requireContext()
            java.lang.String r0 = X.W2W.A02(r0, r3)
            X.DbX.A1F(r2, r4, r0, r1)
        L_0x0216:
            java.lang.Object r0 = r14.A01
            X.2Rw r0 = (X.2Rw) r0
            r0.notifyDataSetChanged()
            goto L_0x0052
        L_0x021f:
            if (r1 == 0) goto L_0x0244
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0216
        L_0x0227:
            androidx.fragment.app.FragmentActivity r5 = r1.getActivity()
            if (r5 == 0) goto L_0x023e
            com.instagram.common.session.UserSession r10 = X.C15275UZd.A03(r1)
            com.instagram.business.promote.model.PromoteData r8 = X.C15275UZd.A01(r1)
            X.0eM r0 = r1.A0H
            com.instagram.business.promote.model.PromoteState r9 = X.C13990Tnq.A0O(r0)
            X.VAF.A00(r5, r6, r7, r8, r9, r10)
        L_0x023e:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r1.A07
            if (r0 != 0) goto L_0x024c
            java.lang.String r5 = "loadingSpinner"
        L_0x0244:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024c:
            X.JTO.A1X(r0)
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x02c4
            X.UKM r2 = r7.A01
            if (r2 == 0) goto L_0x02c4
            X.UKW r3 = r2.A00
            java.lang.String r0 = r3.A03
            r1.A0A = r0
            java.lang.String r0 = r2.A02
            r1.A09 = r0
            com.instagram.api.schemas.ErrorIdentifier r0 = r2.A01
            r1.A05 = r0
            java.lang.String r0 = r3.A05
            r1.A0B = r0
            X.WGU r3 = X.C13990Tnq.A0M(r4)
            com.instagram.business.promote.model.PromoteData r0 = X.C15275UZd.A01(r1)
            com.instagram.business.promote.model.LinkingAuthState r0 = r0.A0n
            r3.A00 = r0
            com.instagram.business.promote.model.PromoteData r0 = X.C15275UZd.A01(r1)
            java.lang.String r5 = r0.A1S
            X.UzE r0 = X.C16678UzE.ERROR
            java.lang.String r6 = r0.toString()
            com.instagram.business.promote.model.PromoteData r0 = X.C15275UZd.A01(r1)
            X.UyC r4 = r0.A12
            com.instagram.api.schemas.ErrorIdentifier r0 = r1.A05
            if (r0 != 0) goto L_0x028e
            java.lang.String r5 = "errorIdentifier"
            goto L_0x0244
        L_0x028e:
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = r2.A03
            r3.A0P(r4, r5, r6, r7, r8)
            r2 = 0
            X.C15275UZd.A09(r1, r2)
            X.C15275UZd.A07(r1)
            boolean r0 = X.C15275UZd.A0B(r1)
            if (r0 == 0) goto L_0x02a7
            X.C15275UZd.A05(r1)
        L_0x02a7:
            boolean r0 = X.C15275UZd.A0A(r1)
            if (r0 == 0) goto L_0x0052
            X.Vw9 r0 = r1.A06
            java.lang.String r5 = "actionButtonHolder"
            if (r0 == 0) goto L_0x0244
            r0.A01()
            X.Vw9 r0 = r1.A06
            if (r0 == 0) goto L_0x0244
            android.view.View r0 = r0.A00
            r0.setVisibility(r2)
            X.C15275UZd.A04(r1)
            goto L_0x0052
        L_0x02c4:
            X.0eM r0 = r1.A0H
            r0.getValue()
            com.instagram.business.promote.model.PromoteData r0 = X.C15275UZd.A01(r1)
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 == 0) goto L_0x0305
            com.instagram.business.promote.model.PromoteData r2 = X.C15275UZd.A01(r1)
            com.instagram.common.session.UserSession r0 = X.C15275UZd.A03(r1)
            boolean r0 = X.C18174Vmo.A01(r2, r0)
            X.Vl8 r2 = X.C13990Tnq.A0N()
            if (r0 == 0) goto L_0x02ff
            X.UzE r0 = X.C16678UzE.ERROR
            X.UaQ r0 = r2.A02(r0)
        L_0x02eb:
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = X.C15275UZd.A03(r1)
            X.6Yo r1 = X.Dba.A0B(r2, r1)
            r1.A0B(r3, r0)
            r1.A04()
            goto L_0x0052
        L_0x02ff:
            X.UaS r0 = new X.UaS
            r0.<init>()
            goto L_0x02eb
        L_0x0305:
            X.C13990Tnq.A0h()
            X.UaT r0 = new X.UaT
            r0.<init>()
            goto L_0x02eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20424Wr9.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
