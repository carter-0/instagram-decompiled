package X;

/* renamed from: X.UcZ  reason: case insensitive filesystem */
public final class C15423UcZ extends C15623Ufp {
    public final int A00;
    public final Object A01;

    public C15423UcZ(WGU wgu, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = "";
        this.A01 = C51968G9o.A0u();
        this.A00 = wgu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        r0 = "promoteLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fd, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x02a1;
                case 1: goto L_0x0292;
                case 2: goto L_0x0247;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00a7;
                case 5: goto L_0x0221;
                case 6: goto L_0x01fd;
                case 7: goto L_0x01d8;
                case 8: goto L_0x01a4;
                case 9: goto L_0x016b;
                case 10: goto L_0x0137;
                case 11: goto L_0x0112;
                case 12: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1410209733(0x540e17c5, float:2.44113657E12)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Throwable r0 = r13.A01()
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0059
            java.lang.String r1 = r0.getMessage()
        L_0x0018:
            java.lang.Object r5 = r12.A01
            X.UZE r5 = (X.UZE) r5
            X.WGU r6 = r5.A00
            if (r6 == 0) goto L_0x00e9
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            java.lang.String r7 = r0.toString()
            if (r1 == 0) goto L_0x0029
            r9 = r1
        L_0x0029:
            java.lang.String r11 = X.UZE.A00(r5)
            java.lang.String r8 = "save_draft"
            r10 = 0
            X.WGU.A07(r6, r7, r8, r9, r10, r11)
            android.content.res.Resources r0 = X.DbV.A05(r5)
            r4 = 2131970745(0x7f134ab9, float:1.957845E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r0, r4)
            android.content.Context r1 = r5.requireContext()
            int r0 = r2.length()
            if (r0 != 0) goto L_0x004c
            java.lang.String r2 = X.DbU.A0m(r5, r4)
        L_0x004c:
            X.C59689JTv.A09(r1, r2)
            super.onFail(r13)
            r0 = -380176493(0xffffffffe956f793, float:-1.6242454E25)
        L_0x0055:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0059:
            r1 = r9
            goto L_0x0018
        L_0x005b:
            r0 = 2004256240(0x777685f0, float:5.0000844E33)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A01
            X.UaS r5 = (X.C15320UaS) r5
            X.WGU r4 = r5.A0B
            if (r4 == 0) goto L_0x0075
            X.UzE r2 = X.C16678UzE.SUMMARY
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "tax_payment_fetch"
            r4.A0L(r2, r0, r1)
        L_0x0075:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x02c0
            X.0hq r0 = r5.mFragmentManager
            if (r0 == 0) goto L_0x02b7
            r0.A13()
            X.C13990Tnq.A0h()
            r4 = 0
            android.os.Bundle r1 = X.C13991Tnr.A05()
            java.lang.String r0 = "unknown_error"
            X.UZd r2 = X.C13991Tnr.A0N(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r2, r5)
            com.instagram.common.session.UserSession r0 = r5.A0H
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "userSession"
            goto L_0x00fd
        L_0x009d:
            X.Dbb.A0o(r4, r2, r1, r0)
            super.onFail(r13)
            r0 = -67335643(0xfffffffffbfc8a25, float:-2.6225214E36)
            goto L_0x0055
        L_0x00a7:
            r0 = -414882163(0xffffffffe745668d, float:-9.321979E23)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A01
            X.UYy r5 = (X.UYy) r5
            X.WGU r4 = r5.A02
            if (r4 == 0) goto L_0x00e9
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "delete_draft"
            r4.A0Y(r2, r0, r1)
            android.content.res.Resources r0 = X.DbV.A05(r5)
            r4 = 2131970358(0x7f134936, float:1.9577665E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r0, r4)
            android.content.Context r1 = r5.requireContext()
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00de
            java.lang.String r2 = X.DbU.A0m(r5, r4)
        L_0x00de:
            X.C59689JTv.A09(r1, r2)
            super.onFail(r13)
            r0 = 986760795(0x3ad0c65b, float:0.0015928255)
            goto L_0x0055
        L_0x00e9:
            java.lang.String r0 = "promoteLogger"
            goto L_0x00fd
        L_0x00ec:
            r0 = 862061101(0x3362022d, float:5.2621704E-8)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r0 = r12.A01
            X.UZg r0 = (X.C15278UZg) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r0.A08
            if (r1 != 0) goto L_0x0105
            java.lang.String r0 = "loadingSpinner"
        L_0x00fd:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0105:
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
            super.onFail(r13)
            r0 = 566667719(0x21c6a9c7, float:1.3461942E-18)
            goto L_0x0055
        L_0x0112:
            r0 = 233440742(0xdea05e6, float:1.4422783E-30)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A01
            X.UaS r5 = (X.C15320UaS) r5
            X.WGU r4 = r5.A0B
            if (r4 == 0) goto L_0x012c
            X.UzE r2 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "audience_fetch"
            r4.A0L(r2, r0, r1)
        L_0x012c:
            r5.A09()
            super.onFail(r13)
            r0 = 747037110(0x2c86e1b6, float:3.833568E-12)
            goto L_0x0055
        L_0x0137:
            r0 = -799144771(0xffffffffd05e04bd, float:-1.48994099E10)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A01
            X.UZi r5 = (X.C15280UZi) r5
            X.0eM r0 = r5.A0Y
            X.WGU r4 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.EDIT_AUDIENCE
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "edit_audience"
            r4.A0Y(r2, r0, r1)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x0163
            r0 = 2131970469(0x7f1349a5, float:1.957789E38)
            X.DbZ.A0w(r1, r5, r0)
        L_0x0163:
            super.onFail(r13)
            r0 = 28987780(0x1ba5184, float:6.844258E-38)
            goto L_0x0055
        L_0x016b:
            r0 = 1881208329(0x7020f609, float:1.9926016E29)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A01
            X.UZi r5 = (X.C15280UZi) r5
            X.0eM r0 = r5.A0Y
            X.WGU r4 = X.C13990Tnq.A0M(r0)
            X.0eM r0 = r5.A0W
            java.lang.Object r2 = r0.getValue()
            X.UzE r2 = (X.C16678UzE) r2
            boolean r0 = X.C15280UZi.A08(r5)
            if (r0 == 0) goto L_0x01a1
            java.lang.String r1 = "edit_audience"
        L_0x018c:
            java.lang.Throwable r0 = r13.A01()
            r4.A0L(r2, r1, r0)
            X.C15280UZi.A03(r5)
            X.C15280UZi.A04(r5)
            super.onFail(r13)
            r0 = -335893443(0xffffffffebfaac3d, float:-6.0608965E26)
            goto L_0x0055
        L_0x01a1:
            java.lang.String r1 = "create_audience"
            goto L_0x018c
        L_0x01a4:
            r0 = 708025198(0x2a339b6e, float:1.5952319E-13)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A01
            X.UZi r5 = (X.C15280UZi) r5
            X.0eM r0 = r5.A0Y
            X.WGU r4 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.CREATE_AUDIENCE
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "create_audience"
            r4.A0Y(r2, r0, r1)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x01d0
            r0 = 2131970311(0x7f134907, float:1.957757E38)
            X.DbZ.A0w(r1, r5, r0)
        L_0x01d0:
            super.onFail(r13)
            r0 = -1801306870(0xffffffff94a23d0a, float:-1.6381895E-26)
            goto L_0x0055
        L_0x01d8:
            r0 = -1867422205(0xffffffff90b16603, float:-6.9971364E-29)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r5 = r12.A01
            X.UaU r5 = (X.C15322UaU) r5
            X.WGU r4 = r5.A03
            if (r4 == 0) goto L_0x01f2
            X.UzE r2 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "audience_fetch"
            r4.A0L(r2, r0, r1)
        L_0x01f2:
            X.C15322UaU.A06(r5)
            super.onFail(r13)
            r0 = 1570830955(0x5da0fa6b, float:1.44996268E18)
            goto L_0x0055
        L_0x01fd:
            r0 = 1296290106(0x4d43d13a, float:2.05329312E8)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r0 = r12.A01
            X.UAD r0 = (X.UAD) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            X.WGU r4 = X.WGU.A00(r0)
            X.UzE r2 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "suggested_interest_search_fetch"
            r4.A0L(r2, r0, r1)
            super.onFail(r13)
            r0 = -252256466(0xfffffffff0f6df2e, float:-6.1122496E29)
            goto L_0x0055
        L_0x0221:
            r0 = 1486772980(0x589e5af4, float:1.39290782E15)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r0 = r12.A01
            X.UAI r0 = (X.UAI) r0
            com.instagram.business.promote.model.PromoteData r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.WGU r4 = X.WGU.A00(r0)
            X.UzE r2 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "suggested_interest_search_fetch"
            r4.A0L(r2, r0, r1)
            super.onFail(r13)
            r0 = -164899043(0xfffffffff62bd71d, float:-8.713338E32)
            goto L_0x0055
        L_0x0247:
            r0 = 2042407481(0x79bcaa39, float:1.2245054E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r13, r5)
            java.lang.Object r6 = r12.A01
            X.Ugp r6 = (X.C15684Ugp) r6
            androidx.fragment.app.FragmentActivity r4 = r6.A00
            r2 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r1 = r4.getString(r2)
            if (r1 == 0) goto L_0x0267
            int r0 = r1.length()
            if (r0 != 0) goto L_0x026b
        L_0x0267:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r2)
        L_0x026b:
            X.C59689JTv.A09(r4, r1)
            X.WGU r4 = r6.A05
            X.X7h r0 = r6.A06
            X.UzE r0 = r0.Bhi()
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r13.A01()
            java.lang.String r0 = "update_draft"
            r4.A0Y(r2, r0, r1)
            X.Vvl r0 = r6.A01
            X.2da r0 = r0.A01
            r0.setIsLoading(r5)
            super.onFail(r13)
            r0 = 423919547(0x19447fbb, float:1.01587575E-23)
            goto L_0x0055
        L_0x0292:
            r0 = 1845163375(0x6dfaf56f, float:9.7084954E27)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onFail(r13)
            r0 = 2016007831(0x7829d697, float:1.3778915E34)
            goto L_0x0055
        L_0x02a1:
            r0 = 1767044746(0x6952f68a, float:1.5939917E25)
            int r3 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onFail(r13)
            java.lang.Object r0 = r12.A01
            X.3jv r0 = (X.C249523jv) r0
            X.C301205yj.A00(r13, r0)
            r0 = -775163345(0xffffffffd1cbf22f, float:-1.09492691E11)
            goto L_0x0055
        L_0x02b7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            r0 = 697877793(0x2998c521, float:6.7843524E-14)
            goto L_0x02c8
        L_0x02c0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            r0 = -1909975130(0xffffffff8e2817a6, float:-2.0718985E-30)
        L_0x02c8:
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15423UcZ.onFail(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        r4 = "loadingSpinner";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        r4 = "actionBarButtonController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0138, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0160, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0163, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0005;
                case 3: goto L_0x0049;
                case 4: goto L_0x0022;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0063;
                case 8: goto L_0x00db;
                case 9: goto L_0x00f7;
                case 10: goto L_0x0113;
                case 11: goto L_0x0139;
                case 12: goto L_0x0005;
                case 13: goto L_0x014e;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15423UcZ.super.onFinish()
            return
        L_0x0009:
            r0 = -1172610834(0xffffffffba1b60ee, float:-5.9272244E-4)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.C15423UcZ.super.onFinish()
            java.lang.Object r1 = r8.A01
            X.UaV r1 = (X.C15323UaV) r1
            r0 = 0
            r1.A0D = r0
            X.C15323UaV.A06(r1)
            r0 = -158526725(0xfffffffff68d12fb, float:-1.4306618E33)
            goto L_0x00d7
        L_0x0022:
            r0 = 1271628951(0x4bcb8497, float:2.6675502E7)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r8.A01
            X.UYy r3 = (X.UYy) r3
            r1 = 1
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x0036
            java.lang.String r4 = "discardButtonRow"
            goto L_0x0131
        L_0x0036:
            r0.setClickable(r1)
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x0041
            java.lang.String r4 = "cancelButtonRow"
            goto L_0x0131
        L_0x0041:
            r0.setClickable(r1)
            r0 = 2024676257(0x78ae1ba1, float:2.8250626E34)
            goto L_0x0160
        L_0x0049:
            r0 = 2010134724(0x77d038c4, float:8.446477E33)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15423UcZ.super.onFinish()
            java.lang.Object r0 = r8.A01
            X.UZg r0 = (X.C15278UZg) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.A08
            if (r0 == 0) goto L_0x0110
            X.JTO.A1X(r0)
            r0 = 1254597034(0x4ac7a1aa, float:6541525.0)
            goto L_0x0160
        L_0x0063:
            r0 = 750104621(0x2cb5b02d, float:5.163889E-12)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.C15423UcZ.super.onFinish()
            java.lang.Object r7 = r8.A01
            X.UaU r7 = (X.C15322UaU) r7
            X.ViU r1 = r7.A05
            if (r1 == 0) goto L_0x00bd
            java.lang.String r4 = "createAudienceRow"
            r3 = 8
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r7.A08
            if (r0 == 0) goto L_0x0080
            X.JTO.A1X(r0)
        L_0x0080:
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = r1.A08
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r2 = r7.A00
            if (r2 == 0) goto L_0x0131
            com.instagram.business.promote.model.PromoteData r0 = X.C15322UaU.A00(r7)
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x00a3
            com.instagram.business.promote.model.PromoteData r0 = X.C15322UaU.A00(r7)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00a3
            r3 = 0
        L_0x00a3:
            r2.setVisibility(r3)
            X.0eM r0 = r7.A0M
            java.lang.Object r1 = r0.getValue()
            X.WT6 r1 = (X.WT6) r1
            long r2 = r1.A00
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            X.1QP r1 = r1.A01
            java.lang.String r0 = "promote_audience_audience_list_radio_group_rendered"
            r1.flowMarkPoint(r2, r0)
        L_0x00bd:
            X.0eM r0 = r7.A0M
            java.lang.Object r1 = r0.getValue()
            X.WT6 r1 = (X.WT6) r1
            long r2 = r1.A00
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
            X.1QP r1 = r1.A01
            java.lang.String r0 = "promote_audience_list_rendered"
            r1.flowMarkPoint(r2, r0)
        L_0x00d4:
            r0 = 365985457(0x15d07eb1, float:8.4210415E-26)
        L_0x00d7:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x00db:
            r0 = -1022709377(0xffffffffc30ab17f, float:-138.69334)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15423UcZ.super.onFinish()
            java.lang.Object r0 = r8.A01
            X.UZi r0 = (X.C15280UZi) r0
            X.Vvl r0 = r0.A0P
            if (r0 == 0) goto L_0x012f
            r1 = 0
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = 1670097077(0x638ba8b5, float:5.152508E21)
            goto L_0x0160
        L_0x00f7:
            r0 = 680425071(0x288e766f, float:1.581653E-14)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15423UcZ.super.onFinish()
            java.lang.Object r0 = r8.A01
            X.UZi r0 = (X.C15280UZi) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.A0R
            if (r0 == 0) goto L_0x0110
            X.JTO.A1X(r0)
            r0 = -295032494(0xffffffffee6a2952, float:-1.8117361E28)
            goto L_0x0160
        L_0x0110:
            java.lang.String r4 = "loadingSpinner"
            goto L_0x0131
        L_0x0113:
            r0 = 1958685371(0x74bf2abb, float:1.2116643E32)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15423UcZ.super.onFinish()
            java.lang.Object r0 = r8.A01
            X.UZi r0 = (X.C15280UZi) r0
            X.Vvl r0 = r0.A0P
            if (r0 == 0) goto L_0x012f
            r1 = 0
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = -918356606(0xffffffffc942fd82, float:-798680.1)
            goto L_0x0160
        L_0x012f:
            java.lang.String r4 = "actionBarButtonController"
        L_0x0131:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0139:
            r0 = 1173321669(0x45ef77c5, float:7662.971)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15423UcZ.super.onFinish()
            java.lang.Object r0 = r8.A01
            X.UaS r0 = (X.C15320UaS) r0
            X.C15320UaS.A02(r0)
            r0 = 679204123(0x287bd51b, float:1.3979509E-14)
            goto L_0x0160
        L_0x014e:
            r0 = 281169133(0x10c24ced, float:7.663803E-29)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r8.A01
            X.UZE r1 = (X.UZE) r1
            r0 = 1
            X.UZE.A01(r1, r0)
            r0 = -466479604(0xffffffffe432160c, float:-1.3140436E22)
        L_0x0160:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15423UcZ.onFinish():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r3 = "loadingSpinner";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d7, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        r3 = "actionBarButtonController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dd, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0022;
                case 3: goto L_0x003d;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0057;
                case 8: goto L_0x0084;
                case 9: goto L_0x00a0;
                case 10: goto L_0x00bc;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15423UcZ.super.onStart()
            return
        L_0x0009:
            r0 = 155745621(0x9487d55, float:2.4133055E-33)
            int r2 = X.AnonymousClass0fD.A03(r0)
            super.onStart()
            java.lang.Object r1 = r5.A01
            X.UaV r1 = (X.C15323UaV) r1
            r0 = 1
            r1.A0D = r0
            X.C15323UaV.A06(r1)
            r0 = 596159800(0x2388ad38, float:1.481851E-17)
            goto L_0x00d7
        L_0x0022:
            r0 = -1339406057(0xffffffffb02a4917, float:-6.1949507E-10)
            int r2 = X.AnonymousClass0fD.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A01
            X.Ugp r0 = (X.C15684Ugp) r0
            X.Vvl r0 = r0.A01
            r1 = 1
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = -1085981358(0xffffffffbf453d52, float:-0.7704669)
            goto L_0x00d7
        L_0x003d:
            r0 = -105224223(0xfffffffff9ba67e1, float:-1.2098427E35)
            int r2 = X.AnonymousClass0fD.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A01
            X.UZg r0 = (X.C15278UZg) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.A08
            if (r0 == 0) goto L_0x00b9
            X.DbS.A1T(r0)
            r0 = 245214550(0xe9dad56, float:3.8870405E-30)
            goto L_0x00d7
        L_0x0057:
            r0 = -1869333756(0xffffffff90943b04, float:-5.8466635E-29)
            int r2 = X.AnonymousClass0fD.A03(r0)
            super.onStart()
            java.lang.Object r4 = r5.A01
            X.UaU r4 = (X.C15322UaU) r4
            X.ViU r0 = r4.A05
            if (r0 == 0) goto L_0x0080
            java.lang.String r3 = "createAudienceRow"
            r1 = 8
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r0.A08
            r0.setVisibility(r1)
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x00dd
            r0.setVisibility(r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A08
            if (r0 == 0) goto L_0x0080
            X.DbS.A1T(r0)
        L_0x0080:
            r0 = 1306578435(0x4de0ce03, float:4.71449696E8)
            goto L_0x00d7
        L_0x0084:
            r0 = -1186903302(0xffffffffb9414afa, float:-1.8433845E-4)
            int r2 = X.AnonymousClass0fD.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A01
            X.UZi r0 = (X.C15280UZi) r0
            X.Vvl r0 = r0.A0P
            if (r0 == 0) goto L_0x00db
            r1 = 1
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = 130061422(0x7c0946e, float:2.8976188E-34)
            goto L_0x00d7
        L_0x00a0:
            r0 = 438875008(0x1a28b380, float:3.4886585E-23)
            int r2 = X.AnonymousClass0fD.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A01
            X.UZi r0 = (X.C15280UZi) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.A0R
            if (r0 == 0) goto L_0x00b9
            X.DbS.A1T(r0)
            r0 = 535968218(0x1ff239da, float:1.02586694E-19)
            goto L_0x00d7
        L_0x00b9:
            java.lang.String r3 = "loadingSpinner"
            goto L_0x00dd
        L_0x00bc:
            r0 = 335733141(0x1402e195, float:6.607811E-27)
            int r2 = X.AnonymousClass0fD.A03(r0)
            super.onStart()
            java.lang.Object r0 = r5.A01
            X.UZi r0 = (X.C15280UZi) r0
            X.Vvl r0 = r0.A0P
            if (r0 == 0) goto L_0x00db
            r1 = 1
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = 1737975631(0x6797674f, float:1.4299661E24)
        L_0x00d7:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x00db:
            java.lang.String r3 = "actionBarButtonController"
        L_0x00dd:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15423UcZ.onStart():void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.UXB, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.business.promote.model.PromoteAudienceInfo, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.UXV, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.UXV, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.UXc, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.UXc, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r10v17, types: [java.lang.Object, X.V38] */
    /* JADX WARNING: type inference failed for: r9v32, types: [java.lang.Object, X.V38] */
    /* JADX WARNING: type inference failed for: r0v40, types: [com.instagram.business.promote.model.PromoteCreateAudienceResponse, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v43, types: [com.instagram.business.promote.model.PromoteAudienceInfo, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v46, types: [com.instagram.business.promote.model.PromoteSaveAudienceEditResponse, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v49, types: [X.UX6, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r0v54, types: [X.UX5, java.lang.Object, X.1XT] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0558, code lost:
        X.0qQ.A0F(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06a7, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x09de, code lost:
        X.AnonymousClass0fD.A0A(r1, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x09e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0a42, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0a45, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a5f, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a62, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0a6b, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a6e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0a6f, code lost:
        r11 = "promoteData";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a71, code lost:
        X.0qQ.A0F(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0a78, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r36) {
        /*
            r35 = this;
            r1 = r35
            r0 = r36
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x0229;
                case 1: goto L_0x0529;
                case 2: goto L_0x09e4;
                case 3: goto L_0x09b5;
                case 4: goto L_0x0086;
                case 5: goto L_0x094a;
                case 6: goto L_0x08dd;
                case 7: goto L_0x07dd;
                case 8: goto L_0x01a0;
                case 9: goto L_0x0156;
                case 10: goto L_0x00f7;
                case 11: goto L_0x06d2;
                case 12: goto L_0x025d;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = -484544888(0xffffffffe31e6e88, float:-2.9225502E21)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.UX5 r0 = (X.UX5) r0
            r2 = -2080077240(0xffffffff84048a48, float:-1.5580021E-36)
            int r5 = X.AnonymousClass7TG.A0D(r0, r2)
            X.UKM r6 = r0.A00
            java.lang.String r11 = "promoteLogger"
            java.lang.Object r7 = r1.A01
            X.UZE r7 = (X.UZE) r7
            X.WGU r8 = r7.A00
            if (r6 == 0) goto L_0x006a
            if (r8 == 0) goto L_0x0a71
            X.UzE r2 = X.C16678UzE.OBJECTIVE
            java.lang.String r9 = r2.toString()
            java.lang.String r3 = "Required value was null."
            java.lang.String r11 = r6.A03
            java.lang.String r13 = X.UZE.A00(r7)
            java.lang.String r10 = "save_draft"
            r12 = 0
            X.WGU.A07(r8, r9, r10, r11, r12, r13)
            X.UKM r2 = r0.A00
            if (r2 == 0) goto L_0x0253
            java.lang.String r6 = r2.A02
            android.content.Context r3 = r7.requireContext()
            if (r6 == 0) goto L_0x004d
            int r2 = r6.length()
            if (r2 != 0) goto L_0x0054
        L_0x004d:
            r2 = 2131970745(0x7f134ab9, float:1.957845E38)
            java.lang.String r6 = X.DbU.A0m(r7, r2)
        L_0x0054:
            X.C59689JTv.A09(r3, r6)
            X.DbT.A1J(r7)
        L_0x005a:
            r1.A03(r0)
            r0 = -1558330418(0xffffffffa31dc3ce, float:-8.55245E-18)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -703304702(0xffffffffd6146c02, float:-4.0797903E13)
        L_0x0066:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x006a:
            if (r8 == 0) goto L_0x0a71
            X.UzE r2 = X.C16678UzE.OBJECTIVE
            java.lang.String r6 = r2.toString()
            java.lang.String r3 = X.UZE.A00(r7)
            java.lang.String r2 = "save_draft"
            X.WGU.A05(r8, r6, r2, r3)
            com.instagram.business.promote.model.PromoteData r3 = r7.A02
            if (r3 == 0) goto L_0x0a6f
            r2 = 1
            r3.A2w = r2
            X.DbT.A1K(r7)
            goto L_0x005a
        L_0x0086:
            r2 = -1560950571(0xffffffffa2f5c8d5, float:-6.6620022E-18)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.UX6 r0 = (X.UX6) r0
            r2 = -1505409307(0xffffffffa64546e5, float:-6.8444185E-16)
            int r6 = X.AnonymousClass7TG.A0D(r0, r2)
            X.UKM r10 = r0.A00
            java.lang.String r11 = "promoteLogger"
            java.lang.String r9 = "delete_draft"
            java.lang.Object r7 = r1.A01
            X.UYy r7 = (X.UYy) r7
            if (r10 == 0) goto L_0x00df
            X.WGU r8 = r7.A02
            if (r8 == 0) goto L_0x0a71
            X.UzE r2 = X.C16678UzE.SUMMARY
            java.lang.String r5 = r2.toString()
            java.lang.String r3 = "Required value was null."
            java.lang.String r2 = r10.A03
            r8.A0U(r5, r9, r2)
            X.UKM r2 = r0.A00
            if (r2 == 0) goto L_0x0a63
            java.lang.String r5 = r2.A02
            android.content.Context r3 = r7.requireContext()
            if (r5 == 0) goto L_0x00c5
            int r2 = r5.length()
            if (r2 != 0) goto L_0x00cc
        L_0x00c5:
            r2 = 2131970358(0x7f134936, float:1.9577665E38)
            java.lang.String r5 = X.DbU.A0m(r7, r2)
        L_0x00cc:
            X.C59689JTv.A09(r3, r5)
            X.DbT.A1J(r7)
        L_0x00d2:
            r1.A03(r0)
            r0 = 1945853894(0x73fb5fc6, float:3.9831818E31)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -2110626056(0xffffffff823266f8, float:-1.3106925E-37)
            goto L_0x0066
        L_0x00df:
            X.WGU r3 = r7.A02
            if (r3 == 0) goto L_0x0a71
            X.UzE r2 = X.C16678UzE.SUMMARY
            java.lang.String r2 = r2.toString()
            r3.A0R(r2, r9)
            com.instagram.business.promote.model.PromoteData r3 = r7.A04
            if (r3 == 0) goto L_0x0a6f
            r2 = 1
            r3.A2w = r2
            X.DbT.A1K(r7)
            goto L_0x00d2
        L_0x00f7:
            r2 = 1070927283(0x3fd50db3, float:1.6644806)
            int r4 = X.AnonymousClass0fD.A03(r2)
            com.instagram.business.promote.model.PromoteSaveAudienceEditResponse r0 = (com.instagram.business.promote.model.PromoteSaveAudienceEditResponse) r0
            r2 = 1512635465(0x5a28fc49, float:1.18912966E16)
            int r7 = X.AnonymousClass0fD.A03(r2)
            r3 = 0
            X.0qQ.A0B(r0, r3)
            boolean r2 = r0.A00
            java.lang.Object r6 = r1.A01
            X.UZi r6 = (X.C15280UZi) r6
            if (r2 == 0) goto L_0x0142
            X.0eM r2 = r6.A0Z
            com.instagram.business.promote.model.PromoteState r2 = X.C13990Tnq.A0O(r2)
            r2.A0C(r3)
            X.0eM r2 = r6.A0Y
            X.WGU r5 = X.C13990Tnq.A0M(r2)
            com.instagram.business.promote.model.PromoteData r3 = X.C15280UZi.A01(r6)
            X.0eM r2 = r6.A0W
            java.lang.Object r2 = r2.getValue()
            X.UzE r2 = (X.C16678UzE) r2
            r5.A0B(r2, r3)
            X.DbT.A1J(r6)
        L_0x0134:
            r1.A03(r0)
            r0 = 910348221(0x3642cfbd, float:2.9029172E-6)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1844216972(0x6dec848c, float:9.149838E27)
            goto L_0x0066
        L_0x0142:
            X.0eM r2 = r6.A0Y
            X.WGU r6 = X.C13990Tnq.A0M(r2)
            X.UzE r2 = X.C16678UzE.EDIT_AUDIENCE
            java.lang.String r5 = r2.toString()
            java.lang.String r3 = "edit_audience"
            java.lang.String r2 = ""
            r6.A0U(r5, r3, r2)
            goto L_0x0134
        L_0x0156:
            r2 = -1280421880(0xffffffffb3ae5008, float:-8.117064E-8)
            int r4 = X.AnonymousClass0fD.A03(r2)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = (com.instagram.business.promote.model.PromoteAudienceInfo) r0
            r2 = 1605307133(0x5faf0afd, float:2.5226344E19)
            int r7 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r6 = r1.A01
            X.UZi r6 = (X.C15280UZi) r6
            X.0eM r2 = r6.A0Y
            X.WGU r5 = X.C13990Tnq.A0M(r2)
            X.0eM r2 = r6.A0W
            java.lang.Object r3 = r2.getValue()
            X.UzE r3 = (X.C16678UzE) r3
            boolean r2 = X.C15280UZi.A08(r6)
            if (r2 == 0) goto L_0x019d
            java.lang.String r2 = "edit_audience"
        L_0x0180:
            r5.A0D(r3, r2)
            com.instagram.business.promote.model.PromoteData r2 = X.C15280UZi.A01(r6)
            r2.A0q = r0
            X.C15280UZi.A03(r6)
            X.C15280UZi.A04(r6)
            r1.A03(r0)
            r0 = -667252288(0xffffffffd83a89c0, float:-8.2040318E14)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 983045580(0x3a9815cc, float:0.0011603176)
            goto L_0x0066
        L_0x019d:
            java.lang.String r2 = "create_audience"
            goto L_0x0180
        L_0x01a0:
            r2 = 951849785(0x38bc1339, float:8.968119E-5)
            int r4 = X.AnonymousClass0fD.A03(r2)
            com.instagram.business.promote.model.PromoteCreateAudienceResponse r0 = (com.instagram.business.promote.model.PromoteCreateAudienceResponse) r0
            r2 = 1824849618(0x6cc4fed2, float:1.9052225E27)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r6 = 0
            X.0qQ.A0B(r0, r6)
            X.UKM r7 = r0.A00
            java.lang.String r10 = "create_audience"
            java.lang.Object r3 = r1.A01
            X.UZi r3 = (X.C15280UZi) r3
            if (r7 != 0) goto L_0x0207
            X.0eM r7 = r3.A0Z
            com.instagram.business.promote.model.PromoteState r2 = X.C13990Tnq.A0O(r7)
            r2.A0C(r6)
            X.0eM r8 = r3.A0Y
            X.WGU r6 = X.C13990Tnq.A0M(r8)
            X.UzE r2 = X.C16678UzE.CREATE_AUDIENCE
            java.lang.String r2 = r2.toString()
            r6.A0R(r2, r10)
            com.instagram.business.promote.model.PromoteState r7 = X.C13990Tnq.A0O(r7)
            com.instagram.business.promote.model.PromoteData r6 = X.C15280UZi.A01(r3)
            java.lang.String r2 = r0.A01
            r7.A09(r6, r2)
            X.WGU r7 = X.C13990Tnq.A0M(r8)
            com.instagram.business.promote.model.PromoteData r6 = X.C15280UZi.A01(r3)
            X.0eM r2 = r3.A0W
            java.lang.Object r2 = r2.getValue()
            X.UzE r2 = (X.C16678UzE) r2
            r7.A0B(r2, r6)
            X.DbT.A1J(r3)
        L_0x01f9:
            r1.A03(r0)
            r0 = -358582863(0xffffffffeaa075b1, float:-9.699196E25)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -416782886(0xffffffffe72865da, float:-7.952364E23)
            goto L_0x0066
        L_0x0207:
            X.0eM r2 = r3.A0Y
            X.WGU r8 = X.C13990Tnq.A0M(r2)
            X.UzE r2 = X.C16678UzE.CREATE_AUDIENCE
            java.lang.String r9 = r2.toString()
            java.lang.String r11 = r7.A03
            com.instagram.api.schemas.ErrorIdentifier r2 = r7.A01
            java.lang.String r12 = r2.toString()
            r13 = 0
            X.WGU.A07(r8, r9, r10, r11, r12, r13)
            android.content.Context r3 = r3.getContext()
            java.lang.String r2 = r7.A02
            X.C59689JTv.A03(r3, r2, r13, r6)
            goto L_0x01f9
        L_0x0229:
            r2 = 1504425993(0x59abb809, float:6.0418212E15)
            int r4 = X.AnonymousClass0fD.A03(r2)
            X.1XP r0 = (X.1XP) r0
            r2 = 2051668792(0x7a49fb38, float:2.6218675E35)
            int r3 = X.AnonymousClass7TG.A0D(r0, r2)
            r1.A03(r0)
            java.lang.Object r2 = r1.A01
            X.3jv r2 = (X.C249523jv) r2
            X.4do r1 = new X.4do
            r1.<init>(r0)
            X.C301205yj.A00(r1, r2)
            r0 = 2058254866(0x7aae7a12, float:4.5296777E35)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1891844771(0x70c342a3, float:4.834411E29)
            goto L_0x0066
        L_0x0253:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            r0 = -1346488685(0xffffffffafbe3693, float:-3.4599576E-10)
            goto L_0x0a5f
        L_0x025d:
            r2 = 850381676(0x32afcb6c, float:2.0465187E-8)
            int r19 = X.AnonymousClass0fD.A03(r2)
            X.CEi r0 = (X.C43816CEi) r0
            r2 = -1278605528(0xffffffffb3ca0728, float:-9.40766E-8)
            int r13 = X.AnonymousClass0fD.A03(r2)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r2 = r1.A01
            X.UaS r2 = (X.C15320UaS) r2
            androidx.fragment.app.FragmentActivity r6 = r2.getActivity()
            if (r6 == 0) goto L_0x06c7
            X.UKf r5 = r0.A08
            if (r5 != 0) goto L_0x0286
            java.lang.String r18 = "response"
        L_0x0281:
            X.0qQ.A0F(r18)
            goto L_0x0a74
        L_0x0286:
            X.UKM r8 = r5.A07
            java.lang.String r9 = "tax_payment_fetch"
            r17 = 0
            if (r8 == 0) goto L_0x02d5
            com.instagram.api.schemas.ErrorIdentifier r3 = r8.A01
            int r7 = r3.ordinal()
            r3 = 37
            if (r7 == r3) goto L_0x02d5
            r3 = 34
            if (r7 == r3) goto L_0x02d5
            r3 = 35
            if (r7 == r3) goto L_0x02d5
            r3 = 38
            if (r7 == r3) goto L_0x02d5
            r3 = 36
            if (r7 == r3) goto L_0x02d5
            X.WGU r5 = r2.A0B
            if (r5 == 0) goto L_0x02b3
            X.UzE r4 = X.C16678UzE.SUMMARY
            java.lang.String r3 = r8.A03
            r5.A0I(r4, r9, r3)
        L_0x02b3:
            X.0hq r3 = r2.mFragmentManager
            if (r3 == 0) goto L_0x051e
            r3.A13()
            X.C13990Tnq.A0h()
            com.instagram.api.schemas.ErrorIdentifier r3 = com.instagram.api.schemas.ErrorIdentifier.UNKNOWN_ERROR
            android.os.Bundle r5 = X.C13991Tnr.A05()
            java.lang.String r3 = r3.toString()
            X.UZd r4 = X.C13991Tnr.A0N(r5, r3)
            r4.setArguments(r5)
            com.instagram.common.session.UserSession r3 = r2.A0H
            if (r3 != 0) goto L_0x06ac
            java.lang.String r18 = "userSession"
            goto L_0x0281
        L_0x02d5:
            X.WGU r7 = r2.A0B
            if (r7 == 0) goto L_0x02de
            X.UzE r3 = X.C16678UzE.SUMMARY
            r7.A0D(r3, r9)
        L_0x02de:
            com.instagram.business.promote.model.PromoteState r7 = r2.A0G
            if (r7 != 0) goto L_0x02e5
            java.lang.String r18 = "promoteState"
            goto L_0x0281
        L_0x02e5:
            r11 = 1
            boolean r3 = r7.A08
            if (r3 == r11) goto L_0x02f1
            r7.A08 = r11
            java.lang.Integer r3 = X.AnonymousClass05K.A06
            com.instagram.business.promote.model.PromoteState.A01(r7, r3)
        L_0x02f1:
            com.instagram.business.promote.model.PromoteData r7 = r2.A0F
            java.lang.String r18 = "promoteData"
            if (r7 == 0) goto L_0x0281
            X.Gmb r3 = r5.A00
            r7.A0M = r3
            com.instagram.api.schemas.PaymentInfo r3 = r5.A06
            r7.A0X = r3
            r7.A0Y = r8
            com.instagram.api.schemas.NonDiscInfo r3 = r5.A05
            r7.A0W = r3
            java.lang.String r3 = r5.A08
            r7.A1T = r3
            X.ULZ r3 = r5.A03
            r7.A0P = r3
            X.N4Q r3 = r5.A02
            r7.A0N = r3
            X.JVf r3 = r5.A01
            if (r3 == 0) goto L_0x033d
            java.lang.Object r3 = r3.A00
            X.GSY r3 = (X.GSY) r3
        L_0x0319:
            r7.A0O = r3
            java.lang.String r14 = "reviewScreenContentView"
            java.lang.String r9 = "loadingSpinner"
            com.instagram.ui.widget.spinner.SpinnerImageView r3 = r2.A0K
            if (r3 == 0) goto L_0x06a7
            X.JTO.A1X(r3)
            android.view.View r3 = r2.A07
            if (r3 == 0) goto L_0x0558
            r3.setVisibility(r4)
            com.instagram.business.promote.model.PromoteData r4 = r2.A0F
            if (r4 == 0) goto L_0x0281
            com.instagram.api.schemas.BillingWizardName r3 = r5.A04
            r4.A0Q = r3
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r3 = r2.A0J
            if (r3 != 0) goto L_0x0340
            java.lang.String r18 = "stepperHeader"
            goto L_0x0281
        L_0x033d:
            r3 = r17
            goto L_0x0319
        L_0x0340:
            r3.A01()
            X.C15320UaS.A04(r2)
            X.ViF r3 = r2.A0E
            if (r3 != 0) goto L_0x034e
            java.lang.String r18 = "paymentInformationController"
            goto L_0x0281
        L_0x034e:
            com.instagram.business.promote.model.PromoteData r4 = r3.A04
            X.GSY r5 = r4.A0O
            r9 = 0
            if (r5 == 0) goto L_0x045c
            java.lang.Object r5 = r5.A00
            if (r5 == 0) goto L_0x045c
            X.WGU r7 = r3.A02
            X.UzE r8 = r3.A01
            java.lang.String r5 = "payment_required_action"
            r7.A0H(r8, r5)
        L_0x0362:
            X.UdT r5 = r3.A03
            r34 = r5
            java.util.List r5 = r5.A00
            r5.clear()
            r34.clear()
            java.lang.Integer r26 = X.AnonymousClass05K.A0C
            android.content.Context r9 = r3.A00
            r10 = 2131970731(0x7f134aab, float:1.9578421E38)
            java.lang.String r24 = X.AnonymousClass7TE.A16(r9, r10)
            X.ULZ r12 = r4.A0P
            r10 = 0
            if (r12 == 0) goto L_0x0459
            java.lang.String r15 = r12.A08
            java.lang.Object r12 = r12.A02
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x038c
            java.lang.Object r10 = X.00k.A0J(r12)
            java.lang.String r10 = (java.lang.String) r10
        L_0x038c:
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r10)
            X.0iw r14 = r3.A06
            X.WAY r21 = X.WAY.A00
            X.VaN r10 = new X.VaN
            r20 = r10
            r22 = r14
            r23 = r12
            r25 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r5.add(r10)
            X.ULZ r10 = r4.A0P
            if (r10 == 0) goto L_0x03d3
            java.lang.Object r14 = r10.A04
            X.GSY r14 = (X.GSY) r14
            if (r14 == 0) goto L_0x03d3
            java.lang.Integer r26 = X.AnonymousClass05K.A0N
            java.lang.String r15 = r14.A02
            r12 = 45
            X.WBH r10 = new X.WBH
            r10.<init>((int) r12, (java.lang.Object) r14, (java.lang.Object) r3)
            X.VaN r12 = new X.VaN
            r20 = r12
            r21 = r10
            r22 = r17
            r23 = r17
            r24 = r15
            r25 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r5.add(r12)
            java.lang.String r10 = "payment_primary_action_button"
            r7.A0H(r8, r10)
        L_0x03d3:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.V38 r10 = new X.V38
            r10.<init>()
            r10.A00 = r12
            r5.add(r10)
            X.N4Q r10 = r4.A0N
            if (r10 == 0) goto L_0x04bd
            java.util.List r14 = r4.A1v
            r16 = r14
            int r15 = r16.size()
            int r14 = r4.A0I
            if (r15 <= r11) goto L_0x03f4
            int r11 = r16.size()
            int r14 = r14 * r11
        L_0x03f4:
            java.lang.String r32 = X.C13991Tnr.A0g(r4, r14)
            java.lang.Integer r26 = X.AnonymousClass05K.A0j
            r11 = 2131970737(0x7f134ab1, float:1.9578434E38)
            java.lang.String r24 = X.AnonymousClass7TE.A16(r9, r11)
            X.WAa r21 = X.C18862WAa.A00
            X.VaN r11 = new X.VaN
            r20 = r11
            r22 = r17
            r23 = r17
            r25 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r5.add(r11)
            java.lang.Integer r33 = X.AnonymousClass05K.A0u
            r11 = 2131970736(0x7f134ab0, float:1.9578432E38)
            java.lang.String r31 = X.AnonymousClass7TE.A16(r9, r11)
            X.WAb r28 = X.C18863WAb.A00
            X.VaN r11 = new X.VaN
            r27 = r11
            r29 = r17
            r30 = r17
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r5.add(r11)
            java.lang.Object r11 = r10.A01
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x049c
            java.util.Iterator r16 = r11.iterator()
        L_0x0436:
            boolean r11 = r16.hasNext()
            if (r11 == 0) goto L_0x049c
            java.lang.Object r11 = r16.next()
            X.XA5 r11 = (X.XA5) r11
            X.UNd r11 = (X.C15060UNd) r11
            java.lang.String r15 = r11.A00
            java.lang.String r14 = r11.A01
            X.WAc r28 = X.C18864WAc.A00
            X.VaN r11 = new X.VaN
            r27 = r11
            r31 = r15
            r32 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r5.add(r11)
            goto L_0x0436
        L_0x0459:
            r15 = r10
            goto L_0x038c
        L_0x045c:
            X.WGU r7 = r3.A02
            X.UzE r8 = r3.A01
            com.instagram.api.schemas.PaymentInfo r5 = r4.A0X
            if (r5 == 0) goto L_0x046c
            com.instagram.api.schemas.PaymentMethod r5 = r5.A00
            if (r5 == 0) goto L_0x046c
            com.instagram.api.schemas.FundingSourceType r9 = r5.Bb4()
        L_0x046c:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r12 = "existing_payment_method"
            com.facebook.common.callercontext.CallerContext r5 = X.WGU.A07
            X.UGS r10 = new X.UGS
            r10.<init>()
            X.C13990Tnq.A18(r10, r7)
            if (r9 == 0) goto L_0x0487
            r5 = 3723(0xe8b, float:5.217E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r10.A06(r5, r9)
        L_0x0487:
            X.0wc r9 = r7.A05
            java.lang.String r5 = "promoted_posts_view_component"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r9, r5)
            java.lang.String r5 = "component"
            r9.AAJ(r5, r12)
            X.C13990Tnq.A10(r9, r7, r8)
            X.C13988Tno.A18(r9, r10)
            goto L_0x0362
        L_0x049c:
            r11 = 2131970738(0x7f134ab2, float:1.9578436E38)
            java.lang.String r24 = X.AnonymousClass7TE.A16(r9, r11)
            java.lang.String r10 = r10.A02
            X.WAd r21 = X.C18865WAd.A00
            X.VaN r9 = new X.VaN
            r20 = r9
            r25 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r5.add(r9)
            X.V38 r9 = new X.V38
            r9.<init>()
            r9.A00 = r12
            r5.add(r9)
        L_0x04bd:
            X.ULZ r4 = r4.A0P
            if (r4 == 0) goto L_0x0506
            java.lang.Object r14 = r4.A01
            X.GSY r14 = (X.GSY) r14
            java.lang.String r9 = r4.A07
            if (r14 == 0) goto L_0x0506
            if (r9 == 0) goto L_0x0506
            r10 = 32
            java.lang.String r4 = r14.A02
            java.lang.String r12 = X.002.A0T(r9, r4, r10)
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r12)
            r4 = 2
            X.U2H r11 = new X.U2H
            r11.<init>(r4, r3, r14)
            int r9 = r9.length()
            int r4 = X.DbX.A05(r12)
            r3 = 33
            r10.setSpan(r11, r9, r4, r3)
            java.lang.Integer r26 = X.AnonymousClass05K.A0Y
            X.WAZ r21 = X.WAZ.A00
            X.VaN r3 = new X.VaN
            r20 = r3
            r22 = r17
            r23 = r17
            r24 = r10
            r25 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r5.add(r3)
            java.lang.String r3 = "payment_inline_footer_row"
            r7.A0H(r8, r3)
        L_0x0506:
            r34.A01()
            X.C15320UaS.A03(r2)
            X.W2F r7 = X.C17137VJm.A00
            com.instagram.business.promote.model.PromoteData r5 = r2.A0F
            if (r5 == 0) goto L_0x0281
            r4 = 45
            X.WxM r3 = new X.WxM
            r3.<init>(r2, r4)
            r7.A04(r6, r5, r3)
            goto L_0x06b1
        L_0x051e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1797142648(0x6b1e3878, float:1.9127695E26)
            X.AnonymousClass0fD.A0A(r0, r13)
            throw r1
        L_0x0529:
            r2 = 330688464(0x13b5e7d0, float:4.591941E-27)
            int r5 = X.AnonymousClass0fD.A03(r2)
            X.CEL r0 = (X.CEL) r0
            r2 = -986483933(0xffffffffc5337323, float:-2871.196)
            int r4 = X.AnonymousClass0fD.A03(r2)
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.Object r6 = r1.A01
            X.UaV r6 = (X.C15323UaV) r6
            com.instagram.business.promote.model.PromoteData r8 = r6.A08
            java.lang.String r9 = "promoteData"
            r14 = r9
            if (r8 == 0) goto L_0x06a7
            r8.A05 = r7
            r8.A0J = r7
            r8.A0B = r7
            r8.A0K = r7
            r8.A0L = r7
            X.X9k r3 = r0.A00
            if (r3 != 0) goto L_0x055d
            java.lang.String r14 = "response"
        L_0x0558:
            X.0qQ.A0F(r14)
            goto L_0x0a74
        L_0x055d:
            X.UMq r3 = (X.UMq) r3
            java.lang.Integer r2 = r3.A00
            int r2 = X.AnonymousClass7TG.A0A(r2)
            r8.A03 = r2
            java.lang.Integer r2 = r3.A01
            int r2 = X.AnonymousClass7TG.A0A(r2)
            r8.A0C = r2
            java.util.List r2 = r3.A03
            if (r2 == 0) goto L_0x0575
            r8.A1y = r2
        L_0x0575:
            java.util.List r2 = r3.A02
            if (r2 == 0) goto L_0x0679
            java.util.Iterator r13 = r2.iterator()
        L_0x057d:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0679
            java.lang.Object r10 = r13.next()
            X.X9j r10 = (X.C21008X9j) r10
            X.UMp r10 = (X.UMp) r10
            java.util.List r3 = r10.A02
            if (r3 == 0) goto L_0x05b6
            int r2 = X.JTT.A08(r3)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r2)
            java.util.Iterator r11 = r3.iterator()
        L_0x059c:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x05ba
            java.lang.Object r9 = r11.next()
            X.X9p r9 = (X.C21013X9p) r9
            X.UMw r9 = (X.UMw) r9
            int r2 = r9.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r2 = r9.A00
            X.C66580MXl.A1T(r3, r8, r2)
            goto L_0x059c
        L_0x05b6:
            X.0sm r8 = X.0Yt.A0E()
        L_0x05ba:
            com.instagram.api.schemas.BudgetRecommendationType r2 = r10.A00
            int r3 = r2.ordinal()
            r2 = 1
            switch(r3) {
                case 1: goto L_0x0669;
                case 2: goto L_0x0617;
                case 3: goto L_0x061f;
                case 4: goto L_0x05c5;
                case 5: goto L_0x05c5;
                case 6: goto L_0x05c4;
                case 7: goto L_0x065f;
                case 8: goto L_0x062f;
                case 9: goto L_0x063f;
                case 10: goto L_0x064f;
                default: goto L_0x05c4;
            }
        L_0x05c4:
            goto L_0x057d
        L_0x05c5:
            java.util.Set r2 = r8.entrySet()
            java.lang.Object r8 = X.00k.A0A(r2)
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            if (r8 == 0) goto L_0x057d
            com.instagram.business.promote.model.PromoteData r3 = r6.A08
            if (r3 == 0) goto L_0x0558
            int r2 = X.C66582MXn.A08(r8)
            r3.A0B(r2)
            com.instagram.business.promote.model.PromoteData r12 = r6.A08
            if (r12 == 0) goto L_0x0558
            java.lang.Object r2 = r8.getKey()
            int r11 = X.AnonymousClass7TE.A0M(r2)
            com.instagram.business.promote.model.PromoteData r2 = r6.A08
            if (r2 == 0) goto L_0x0558
            java.util.List r3 = r2.A1o
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x057d
            int r10 = X.C51971G9r.A0I(r3, r7)
            int r9 = X.C13988Tno.A06(r11, r10)
            java.util.Iterator r8 = r3.iterator()
        L_0x0600:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0613
            int r3 = X.AnonymousClass7TG.A0F(r8)
            int r2 = X.C13988Tno.A06(r11, r3)
            if (r2 > r9) goto L_0x0613
            r10 = r3
            r9 = r2
            goto L_0x0600
        L_0x0613:
            r12.A09 = r10
            goto L_0x057d
        L_0x0617:
            com.instagram.business.promote.model.PromoteData r2 = r6.A08
            if (r2 == 0) goto L_0x0558
            r2.A23 = r8
            goto L_0x057d
        L_0x061f:
            com.instagram.business.promote.model.PromoteData r3 = r6.A08
            if (r3 == 0) goto L_0x0558
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = X.C51973G9u.A07(r2, r8)
            r3.A05 = r2
            goto L_0x057d
        L_0x062f:
            com.instagram.business.promote.model.PromoteData r3 = r6.A08
            if (r3 == 0) goto L_0x0558
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = X.C51973G9u.A07(r2, r8)
            r3.A0J = r2
            goto L_0x057d
        L_0x063f:
            com.instagram.business.promote.model.PromoteData r3 = r6.A08
            if (r3 == 0) goto L_0x0558
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = X.C51973G9u.A07(r2, r8)
            r3.A0K = r2
            goto L_0x057d
        L_0x064f:
            com.instagram.business.promote.model.PromoteData r3 = r6.A08
            if (r3 == 0) goto L_0x0558
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = X.C51973G9u.A07(r2, r8)
            r3.A0L = r2
            goto L_0x057d
        L_0x065f:
            com.instagram.business.promote.model.PromoteData r3 = r6.A08
            if (r3 == 0) goto L_0x0558
            X.XA0 r2 = r10.A01
            r3.A0Z = r2
            goto L_0x057d
        L_0x0669:
            com.instagram.business.promote.model.PromoteData r3 = r6.A08
            if (r3 == 0) goto L_0x0558
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = X.C51973G9u.A07(r2, r8)
            r3.A0B = r2
            goto L_0x057d
        L_0x0679:
            X.Vtg r3 = X.C18528Vtg.A00
            com.instagram.business.promote.model.PromoteData r2 = r6.A08
            if (r2 == 0) goto L_0x0558
            r3.A00(r2)
            android.view.View r2 = r6.mView
            if (r2 == 0) goto L_0x069c
            X.C15323UaV.A04(r2, r6)
            X.C15323UaV.A05(r6)
            r1.A03(r0)
            r0 = -1546673824(0xffffffffa3cfa160, float:-2.251133E-17)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 925099590(0x3723e646, float:9.769172E-6)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x069c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1628521378(0xffffffff9eeebc5e, float:-2.5277137E-20)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x06a7:
            X.0qQ.A0F(r9)
            goto L_0x0a74
        L_0x06ac:
            r2 = r17
            X.Dbb.A0o(r2, r4, r6, r3)
        L_0x06b1:
            r1.A03(r0)
            boolean r0 = r6 instanceof X.X7g
            if (r0 == 0) goto L_0x06c7
            X.X7g r6 = (X.X7g) r6
            if (r6 == 0) goto L_0x06c7
            java.lang.String r1 = "promote_review"
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r0 = r0.toString()
            r6.Clv(r1, r0)
        L_0x06c7:
            r0 = 1589252754(0x5eba1292, float:6.7039698E18)
            X.AnonymousClass0fD.A0A(r0, r13)
            r1 = 2094427549(0x7cd66d9d, float:8.906998E36)
            goto L_0x09de
        L_0x06d2:
            r2 = 567743909(0x21d715a5, float:1.4574696E-18)
            int r7 = X.AnonymousClass0fD.A03(r2)
            X.UXc r0 = (X.C15242UXc) r0
            r2 = -1964248624(0xffffffff8aebf1d0, float:-2.2720637E-32)
            int r6 = X.AnonymousClass7TG.A0D(r0, r2)
            X.UKM r9 = r0.A00
            java.lang.String r8 = "audience_fetch"
            if (r9 == 0) goto L_0x0715
            java.lang.Object r5 = r1.A01
            X.UaS r5 = (X.C15320UaS) r5
            X.WGU r4 = r5.A0B
            if (r4 == 0) goto L_0x06fb
            X.UzE r3 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r2 = r9.A03
            if (r2 != 0) goto L_0x06f8
            java.lang.String r2 = ""
        L_0x06f8:
            r4.A0I(r3, r8, r2)
        L_0x06fb:
            com.instagram.api.schemas.ErrorIdentifier r3 = r9.A01
            com.instagram.api.schemas.ErrorIdentifier r2 = com.instagram.api.schemas.ErrorIdentifier.DEPRECATED_INTERESTS_WARNING
            if (r3 != r2) goto L_0x072e
            X.6ap r3 = X.DbV.A0X()
            java.lang.String r2 = "promote_deprecated_interests_warning"
            r3.A0H = r2
            java.lang.String r2 = r9.A02
            r3.A0D = r2
            r3.A06()
            X.DbY.A1N(r3)
            goto L_0x07cd
        L_0x0715:
            java.util.List r2 = r0.A01
            if (r2 == 0) goto L_0x0733
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
        L_0x071d:
            java.lang.Object r5 = r1.A01
            X.UaS r5 = (X.C15320UaS) r5
            if (r2 != 0) goto L_0x0738
            X.WGU r4 = r5.A0B
            if (r4 == 0) goto L_0x072e
            X.UzE r3 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r2 = "available audience is empty"
            r4.A0I(r3, r8, r2)
        L_0x072e:
            r5.A09()
            goto L_0x07cd
        L_0x0733:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            goto L_0x071d
        L_0x0738:
            com.instagram.business.promote.model.PromoteData r3 = r5.A0F
            java.lang.String r11 = "promoteData"
            if (r3 == 0) goto L_0x0a71
            boolean r2 = r0.A02
            r3.A2q = r2
            java.util.List r2 = r0.A01
            if (r2 == 0) goto L_0x0794
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
        L_0x074a:
            r3.A1m = r2
            com.instagram.business.promote.model.PromoteData r2 = r5.A0F
            if (r2 == 0) goto L_0x0a71
            java.util.List r2 = r2.A1m
            java.util.Iterator r10 = r2.iterator()
        L_0x0756:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x07a3
            java.lang.Object r9 = r10.next()
            com.instagram.business.promote.model.PromoteAudience r9 = (com.instagram.business.promote.model.PromoteAudience) r9
            boolean r3 = X.W3x.A0P(r9)
            java.lang.String r4 = "Required value was null."
            com.instagram.business.promote.model.PromoteData r2 = r5.A0F
            if (r3 == 0) goto L_0x077f
            if (r2 == 0) goto L_0x0a71
            java.util.Map r3 = r2.A22
            X.0qQ.A06(r3)
            com.instagram.api.schemas.BoostedPostAudienceOption r2 = r9.A03
            if (r2 == 0) goto L_0x0799
            java.lang.String r2 = r2.toString()
        L_0x077b:
            r3.put(r2, r9)
            goto L_0x0756
        L_0x077f:
            if (r2 == 0) goto L_0x0a71
            java.util.Map r3 = r2.A22
            X.0qQ.A06(r3)
            java.lang.String r2 = r9.A05
            if (r2 != 0) goto L_0x077b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = -1440952923(0xffffffffaa1ccda5, float:-1.392693E-13)
            goto L_0x0a6b
        L_0x0794:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            goto L_0x074a
        L_0x0799:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = 712324110(0x2a75340e, float:2.1778431E-13)
            goto L_0x0a6b
        L_0x07a3:
            X.WGU r4 = r5.A0B
            if (r4 == 0) goto L_0x07be
            X.UzE r2 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r3 = r2.toString()
            com.instagram.business.promote.model.PromoteData r2 = r5.A0F
            if (r2 == 0) goto L_0x0a71
            java.util.Map r2 = r2.A22
            java.util.Set r2 = r2.keySet()
            java.lang.String r2 = r2.toString()
            r4.A0W(r3, r8, r2)
        L_0x07be:
            com.instagram.business.promote.model.PromoteState r3 = r5.A0G
            if (r3 != 0) goto L_0x07c6
            java.lang.String r11 = "promoteState"
            goto L_0x0a71
        L_0x07c6:
            r2 = 1
            r3.A0C(r2)
            X.C15320UaS.A02(r5)
        L_0x07cd:
            r1.A03(r0)
            r0 = 1230677560(0x495aa638, float:895587.5)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 338998790(0x1434b606, float:9.1235754E-27)
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x07dd:
            r2 = -1490502003(0xffffffffa728be8d, float:-2.3417981E-15)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.UXc r0 = (X.C15242UXc) r0
            r2 = 785890367(0x2ed7bc3f, float:9.810507E-11)
            int r5 = X.AnonymousClass7TG.A0D(r0, r2)
            X.UKM r9 = r0.A00
            java.lang.String r8 = "audience_fetch"
            java.lang.String r11 = "Required value was null."
            if (r9 == 0) goto L_0x082a
            java.lang.Object r7 = r1.A01
            X.UaU r7 = (X.C15322UaU) r7
            X.WGU r4 = r7.A03
            if (r4 == 0) goto L_0x0804
            X.UzE r3 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r2 = r9.A03
            r4.A0I(r3, r8, r2)
        L_0x0804:
            com.instagram.api.schemas.ErrorIdentifier r3 = r9.A01
            com.instagram.api.schemas.ErrorIdentifier r2 = com.instagram.api.schemas.ErrorIdentifier.DEPRECATED_INTERESTS_WARNING
            if (r3 != r2) goto L_0x0843
            X.6ap r3 = X.DbV.A0X()
            java.lang.String r2 = "promote_audience_deprecated_interests_warning"
            r3.A0H = r2
            java.lang.String r2 = r9.A02
            r3.A0D = r2
            r3.A06()
            X.DbY.A1N(r3)
        L_0x081c:
            r1.A03(r0)
            r0 = 961598107(0x3950d29b, float:1.9914882E-4)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1067279499(0x3f9d648b, float:1.2296308)
            goto L_0x0a42
        L_0x082a:
            java.util.List r2 = r0.A01
            if (r2 == 0) goto L_0x0847
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
        L_0x0832:
            java.lang.Object r7 = r1.A01
            X.UaU r7 = (X.C15322UaU) r7
            if (r2 != 0) goto L_0x084c
            X.WGU r4 = r7.A03
            if (r4 == 0) goto L_0x0843
            X.UzE r3 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r2 = "available audience is empty"
            r4.A0I(r3, r8, r2)
        L_0x0843:
            X.C15322UaU.A06(r7)
            goto L_0x081c
        L_0x0847:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            goto L_0x0832
        L_0x084c:
            com.instagram.business.promote.model.PromoteData r3 = X.C15322UaU.A00(r7)
            boolean r2 = r0.A02
            r3.A2q = r2
            com.instagram.business.promote.model.PromoteData r3 = X.C15322UaU.A00(r7)
            java.util.List r2 = r0.A01
            if (r2 == 0) goto L_0x08a7
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
        L_0x0860:
            r3.A1m = r2
            com.instagram.business.promote.model.PromoteData r2 = X.C15322UaU.A00(r7)
            java.util.List r2 = r2.A1m
            X.0qQ.A06(r2)
            java.util.Iterator r10 = r2.iterator()
        L_0x086f:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x08ac
            java.lang.Object r9 = r10.next()
            com.instagram.business.promote.model.PromoteAudience r9 = (com.instagram.business.promote.model.PromoteAudience) r9
            boolean r4 = X.W3x.A0P(r9)
            com.instagram.business.promote.model.PromoteData r2 = X.C15322UaU.A00(r7)
            java.util.Map r3 = r2.A22
            if (r4 == 0) goto L_0x0896
            X.0qQ.A06(r3)
            com.instagram.api.schemas.BoostedPostAudienceOption r2 = r9.A03
            if (r2 == 0) goto L_0x08d3
            java.lang.String r2 = r2.toString()
        L_0x0892:
            r3.put(r2, r9)
            goto L_0x086f
        L_0x0896:
            X.0qQ.A06(r3)
            java.lang.String r2 = r9.A05
            if (r2 != 0) goto L_0x0892
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = 1536033171(0x5b8e0193, float:7.9942355E16)
            goto L_0x0a5f
        L_0x08a7:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            goto L_0x0860
        L_0x08ac:
            X.WGU r4 = r7.A03
            if (r4 == 0) goto L_0x08c7
            X.UzE r2 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r3 = r2.toString()
            com.instagram.business.promote.model.PromoteData r2 = X.C15322UaU.A00(r7)
            java.util.Map r2 = r2.A22
            java.util.Set r2 = r2.keySet()
            java.lang.String r2 = r2.toString()
            r4.A0W(r3, r8, r2)
        L_0x08c7:
            X.0eM r2 = r7.A0L
            com.instagram.business.promote.model.PromoteState r3 = X.C13990Tnq.A0O(r2)
            r2 = 1
            r3.A0C(r2)
            goto L_0x081c
        L_0x08d3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = 899323671(0x359a9717, float:1.1517867E-6)
            goto L_0x0a5f
        L_0x08dd:
            r2 = -873216910(0xffffffffcbf3c472, float:-3.1951076E7)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.UXV r0 = (X.UXV) r0
            r2 = 2031880500(0x791c0934, float:5.063656E34)
            int r8 = X.AnonymousClass0fD.A03(r2)
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r9 = r1.A01
            X.UAD r9 = (X.UAD) r9
            com.instagram.common.session.UserSession r10 = r9.A03
            X.WGU r5 = X.WGU.A00(r10)
            X.UzE r3 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.String r2 = "suggested_interest_search_fetch"
            r5.A0D(r3, r2)
            java.util.List r2 = r0.A01
            com.google.common.collect.ImmutableList r2 = X.C15623Ufp.A01(r2)
            r9.A00 = r2
            java.util.List r2 = r0.A00
            com.google.common.collect.ImmutableList r7 = X.C15623Ufp.A01(r2)
            X.0qQ.A07(r7)
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x0939
            java.util.List r5 = r9.A08
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x0939
            X.0qQ.A0B(r10, r4)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36312402299454567(0x8101f000000467, double:3.0274476602582746E-306)
            boolean r2 = X.182.A06(r4, r10, r2)
            if (r2 == 0) goto L_0x0939
            r5.addAll(r7)
            java.util.List r2 = r9.A06
            r2.addAll(r7)
        L_0x0939:
            r9.A00()
            r1.A03(r0)
            r0 = -1398124682(0xffffffffacaa4f76, float:-4.8405125E-12)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -1150399838(0xffffffffbb6e4aa2, float:-0.0036360403)
            goto L_0x0a42
        L_0x094a:
            r2 = -960680361(0xffffffffc6bd2e57, float:-24215.17)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.UXV r0 = (X.UXV) r0
            r2 = 1877713401(0x6feba1f9, float:1.4584958E29)
            int r8 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r9 = r1.A01
            X.UAI r9 = (X.UAI) r9
            com.instagram.business.promote.model.PromoteData r2 = r9.A03
            com.instagram.common.session.UserSession r10 = r2.A0y
            X.WGU r4 = X.WGU.A00(r10)
            X.UzE r3 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.String r2 = "suggested_interest_search_fetch"
            r4.A0D(r3, r2)
            java.util.List r2 = r0.A01
            com.google.common.collect.ImmutableList r2 = X.C15623Ufp.A01(r2)
            r9.A00 = r2
            java.util.List r2 = r0.A00
            com.google.common.collect.ImmutableList r7 = X.C15623Ufp.A01(r2)
            X.0qQ.A07(r7)
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x09a4
            java.util.List r5 = r9.A06
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x09a4
            X.0qQ.A06(r10)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36312402299454567(0x8101f000000467, double:3.0274476602582746E-306)
            boolean r2 = X.182.A06(r4, r10, r2)
            if (r2 == 0) goto L_0x09a4
            r5.addAll(r7)
            java.util.List r2 = r9.A04
            r2.addAll(r7)
        L_0x09a4:
            r9.A01()
            r1.A03(r0)
            r0 = -1571574814(0xffffffffa253abe2, float:-2.8686826E-18)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -1079519981(0xffffffffbfa7d513, float:-1.31119)
            goto L_0x0a42
        L_0x09b5:
            r2 = -143662810(0xfffffffff76fe126, float:-4.865334E33)
            int r19 = X.AnonymousClass0fD.A03(r2)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = (com.instagram.business.promote.model.PromoteAudienceInfo) r0
            r2 = 1408426903(0x53f2e397, float:2.08640082E12)
            int r4 = X.AnonymousClass7TG.A0D(r0, r2)
            java.lang.Object r3 = r1.A01
            X.UZg r3 = (X.C15278UZg) r3
            com.instagram.business.promote.model.PromoteData r2 = r3.A05
            if (r2 == 0) goto L_0x0a6f
            r2.A0p = r0
            X.C15278UZg.A00(r3)
            r1.A03(r0)
            r0 = 1904717097(0x7187ad29, float:1.343674E30)
            X.AnonymousClass0fD.A0A(r0, r4)
            r1 = -2065994708(0xffffffff84db6c2c, float:-5.1585993E-36)
        L_0x09de:
            r0 = r19
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x09e4:
            r2 = 937104078(0x37db12ce, float:2.6115591E-5)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.UXB r0 = (X.UXB) r0
            r2 = 500624675(0x1dd6ed23, float:5.689052E-21)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r9 = r1.A01
            X.Ugp r9 = (X.C15684Ugp) r9
            X.Vvl r2 = r9.A01
            X.2da r2 = r2.A01
            r2.setIsLoading(r3)
            X.UKM r10 = r0.A00
            java.lang.String r8 = "update_draft"
            X.WGU r7 = r9.A05
            X.X7h r2 = r9.A06
            X.UzE r2 = r2.Bhi()
            java.lang.String r4 = r2.toString()
            if (r10 == 0) goto L_0x0a46
            java.lang.String r3 = "Required value was null."
            java.lang.String r2 = r10.A03
            r7.A0U(r4, r8, r2)
            X.UKM r2 = r0.A00
            if (r2 == 0) goto L_0x0a57
            java.lang.String r4 = r2.A02
            androidx.fragment.app.FragmentActivity r3 = r9.A00
            if (r4 == 0) goto L_0x0a2c
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0a33
        L_0x0a2c:
            r2 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r3, r2)
        L_0x0a33:
            X.C59689JTv.A09(r3, r4)
        L_0x0a36:
            r1.A03(r0)
            r0 = -65573837(0xfffffffffc176c33, float:-3.1449255E36)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -314478921(0xffffffffed416eb7, float:-3.7415283E27)
        L_0x0a42:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0a46:
            r7.A0R(r4, r8)
            com.instagram.business.promote.model.PromoteData r3 = r9.A02
            com.instagram.business.promote.model.PromoteState.A00(r3)
            r2 = 1
            r3.A2w = r2
            androidx.fragment.app.FragmentActivity r2 = r9.A00
            r2.onBackPressed()
            goto L_0x0a36
        L_0x0a57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            r0 = -22891705(0xfffffffffea2b347, float:-1.081329E38)
        L_0x0a5f:
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        L_0x0a63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            r0 = -1799593049(0xffffffff94bc63a7, float:-1.9022455E-26)
        L_0x0a6b:
            X.AnonymousClass0fD.A0A(r0, r6)
            throw r1
        L_0x0a6f:
            java.lang.String r11 = "promoteData"
        L_0x0a71:
            X.0qQ.A0F(r11)
        L_0x0a74:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15423UcZ.onSuccess(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15423UcZ(WGU wgu, Object obj, String str, int i) {
        super(wgu, str);
        this.A00 = i;
        this.A01 = obj;
    }
}
