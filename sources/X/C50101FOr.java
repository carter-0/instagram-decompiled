package X;

import android.view.View;

/* renamed from: X.FOr  reason: case insensitive filesystem */
public final class C50101FOr implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C50101FOr(E5I e5i, String str, int i) {
        this.A00 = i;
        if (5 - i != 0) {
            this.A01 = e5i;
            this.A02 = str;
            return;
        }
        this.A01 = e5i;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x011e, code lost:
        r7 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x04c9, code lost:
        r0 = "contactImportLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x04cb, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x04d2, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0496;
                case 1: goto L_0x042a;
                case 2: goto L_0x03ff;
                case 3: goto L_0x03a0;
                case 4: goto L_0x0389;
                case 5: goto L_0x04b0;
                case 6: goto L_0x0361;
                case 7: goto L_0x0338;
                case 8: goto L_0x0316;
                case 9: goto L_0x02fc;
                case 10: goto L_0x02be;
                case 11: goto L_0x0283;
                case 12: goto L_0x0250;
                case 13: goto L_0x022e;
                case 14: goto L_0x01fe;
                case 15: goto L_0x01ce;
                case 16: goto L_0x01a6;
                case 17: goto L_0x010c;
                case 18: goto L_0x00e5;
                case 19: goto L_0x00ba;
                case 20: goto L_0x005e;
                case 21: goto L_0x0037;
                case 22: goto L_0x0020;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -2057934953(0xffffffff85566797, float:-1.0081258E-35)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r0)
            java.lang.String r0 = r4.A02
            X.C49894FBx.A01(r2, r0)
            r0 = -608073845(0xffffffffdbc1878b, float:-1.08947403E17)
        L_0x001c:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0020:
            r0 = 1205518730(0x47dac18a, float:112003.08)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.FragmentActivity r3 = X.DbT.A0E(r0)
            java.lang.String r2 = r4.A02
            r0 = 0
            X.C49894FBx.A02(r3, r0, r2)
            r0 = -739374147(0xffffffffd3ee0bbd, float:-2.0447983E12)
            goto L_0x001c
        L_0x0037:
            r0 = -23675584(0xfffffffffe96bd40, float:-1.0018342E38)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A01
            X.E4Z r6 = (X.E4Z) r6
            java.lang.String r5 = "UserPayBadgesMilestonesIntroFragment"
            java.lang.String r3 = r4.A02
            java.lang.String r2 = "primary_button_clicked"
            java.lang.String r0 = "what_you_need"
            r6.A04(r2, r0, r5, r3)
            X.DlI r3 = r6.A03()
            X.6oS r2 = X.C318116oQ.A00(r3)
            r0 = 24
            X.C51645Fy4.A01(r3, r2, r0)
            r0 = 1419255287(0x54981df7, float:5.226702E12)
            goto L_0x001c
        L_0x005e:
            r0 = 1418588594(0x548df1b2, float:4.8771629E12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r0 = r4.A02
            android.net.Uri r3 = X.0cp.A03(r0)
            java.lang.String r0 = r3.getPath()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r2 = r3.getPath()
            java.lang.String r0 = "bloks"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r6 = r4.A01
            X.ESU r6 = (X.ESU) r6
            java.lang.String r0 = "bloks_app_id"
            java.lang.String r5 = r3.getQueryParameter(r0)
            java.lang.String r0 = "params"
            java.lang.String r4 = r3.getQueryParameter(r0)
            android.content.Context r0 = r6.getContext()
            if (r5 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            X.6ST r3 = X.DbV.A0h(r0)
            X.DbX.A15(r0, r3)
            r0 = 0
            r3.setCancelable(r0)
            X.AnonymousClass0fN.A00(r3)
            com.instagram.common.session.UserSession r2 = r6.A02
            java.util.HashMap r0 = X.C18136VmC.A01(r2, r4)
            X.8ey r2 = X.C359988do.A04(r2, r5, r0)
            r0 = 18
            X.E86.A01(r2, r6, r3, r0)
            r6.schedule(r2)
        L_0x00b5:
            r0 = -1450292910(0xffffffffa98e4952, float:-6.318786E-14)
            goto L_0x001c
        L_0x00ba:
            r0 = 519593910(0x1ef85fb6, float:2.6297606E-20)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            X.E4Q r0 = (X.E4Q) r0
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = r0.A05
            if (r3 != 0) goto L_0x00d1
            java.lang.String r0 = "userSession"
            goto L_0x04cb
        L_0x00d1:
            java.lang.String r2 = r4.A02
            X.2EG r0 = X.2EG.A46
            X.SUL r2 = X.Dba.A0J(r5, r3, r0, r2)
            java.lang.String r0 = "quick promotion"
            r2.A0S = r0
            r2.A0A()
            r0 = -764593723(0xffffffffd26d39c5, float:-2.54719115E11)
            goto L_0x001c
        L_0x00e5:
            r0 = 1641339099(0x61d4d8db, float:4.9079198E20)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r4.A01
            X.Dib r7 = (X.C46656Dib) r7
            com.instagram.common.session.UserSession r6 = r7.A0V
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            java.lang.String r3 = r4.A02
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.6W8 r2 = X.DbV.A0Y(r0, r2, r6, r5, r3)
            r0 = 7002(0x1b5a, float:9.812E-42)
            r2.A0D(r7, r0)
            r0 = -1200683514(0xffffffffb86f0606, float:-5.698765E-5)
            goto L_0x001c
        L_0x010c:
            r0 = -919777277(0xffffffffc92d5003, float:-709888.2)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            X.WWr r0 = (X.C19376WWr) r0
            java.lang.String r14 = r4.A02
            r15 = 0
            X.1Xj r3 = r0.A01
            if (r3 == 0) goto L_0x0183
            com.instagram.common.session.UserSession r7 = r0.A08
            com.instagram.user.model.User r2 = r3.A2A(r7)
            if (r2 == 0) goto L_0x0183
            X.32G r6 = r0.A07
            X.6rY r8 = X.Dbb.A0O(r7, r2)
            java.lang.String r10 = r2.getId()
            java.lang.String r11 = r3.getId()
            java.lang.String r12 = r3.C9L()
            java.lang.String r9 = "tap_website"
            java.lang.String r13 = "pbia_profile_header"
            X.C319976rX.A08(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r9 = r6.getModuleName()
            java.lang.String r12 = r2.getId()
            com.instagram.user.model.FollowStatus r4 = r2.B6o()
            java.lang.String r13 = X.1aC.A06(r4)
            r8 = 0
            java.lang.String r10 = "visit_website"
            java.lang.String r11 = "pbia_profile"
            X.C49749F4o.A01(r7, r8, r9, r10, r11, r12, r13)
            X.4DU r6 = r0.A09
            java.lang.String r4 = "bio_link_opened"
            X.3sc r5 = new X.3sc
            r5.<init>(r6, r4)
            r5.A7N = r14
            java.lang.String r4 = r3.getId()
            r5.A5v = r4
            java.lang.String r4 = r7.A06
            r5.A4K = r4
            java.lang.String r2 = r2.getId()
            r5.A7D = r2
            java.lang.String r2 = r3.getId()
            r5.A5u = r2
            java.lang.String r2 = r3.C9L()
            r5.A7J = r2
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.C271764jY.A00(r7, r5, r6, r2)
        L_0x0183:
            X.SUL r10 = r0.A02
            if (r10 != 0) goto L_0x019e
            X.32G r2 = r0.A07
            androidx.fragment.app.FragmentActivity r11 = r2.requireActivity()
            com.instagram.common.session.UserSession r12 = r0.A08
            X.2EG r13 = X.2EG.A2m
            X.SUL r10 = new X.SUL
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String r2 = r2.getModuleName()
            r10.A0S = r2
            r0.A02 = r10
        L_0x019e:
            r10.A0A()
            r0 = -1282884656(0xffffffffb388bbd0, float:-6.3671564E-8)
            goto L_0x001c
        L_0x01a6:
            r0 = 861925604(0x335ff0e4, float:5.2140322E-8)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A01
            X.E4Z r6 = (X.E4Z) r6
            java.lang.String r5 = "CreatorRevshareAdsPreviewIntroFragment"
            java.lang.String r3 = r4.A02
            java.lang.String r2 = "primary_button_clicked"
            java.lang.String r0 = "feature_preview"
            r6.A04(r2, r0, r5, r3)
            X.DlI r3 = r6.A03()
            X.6oS r2 = X.C318116oQ.A00(r3)
            r0 = 25
            X.C51645Fy4.A01(r3, r2, r0)
            r0 = 1367970369(0x51899241, float:7.3858032E10)
            goto L_0x001c
        L_0x01ce:
            r0 = -1323149671(0xffffffffb1225699, float:-2.3623328E-9)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A01
            X.E4Z r6 = (X.E4Z) r6
            java.lang.String r5 = "CreatorRevshareAdsPreviewIntroFragment"
            java.lang.String r4 = r4.A02
            java.lang.String r2 = "secondary_button_clicked"
            java.lang.String r0 = "feature_preview"
            r6.A04(r2, r0, r5, r4)
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0eM r0 = r6.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r0 = X.2EG.A2l
            X.SUL r0 = X.Dba.A0J(r3, r2, r0, r4)
            r0.A0S = r5
            r0.A0A()
            r0 = 173095682(0xa513b02, float:1.0074082E-32)
            goto L_0x001c
        L_0x01fe:
            r0 = 733158698(0x2bb31d2a, float:1.272681E-12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.E3K r5 = (X.E3K) r5
            java.lang.String r9 = r4.A02
            X.0eM r0 = r5.A00
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.TpH r7 = X.C14068TpH.PROFILE
            X.UzD r8 = X.C16677UzD.USER
            X.OcF r3 = X.ORV.A01(r4, r5, r6, r7, r8, r9)
            r2 = 4
            X.EUb r0 = new X.EUb
            r0.<init>(r5, r2)
            r3.A07(r0)
            r3.A06()
            r0 = -714387791(0xffffffffd56b4eb1, float:-1.61702006E13)
            goto L_0x001c
        L_0x022e:
            r0 = 568713102(0x21e5df8e, float:1.5576818E-18)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            X.Dm1 r0 = (X.C46825Dm1) r0
            java.lang.Object r0 = r0.A01
            X.F2r r0 = (X.C49706F2r) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r2 = r0.A06
            java.lang.String r0 = r4.A02
            r2.setText(r0)
            int r0 = r0.length()
            r2.setSelection(r0)
            r0 = 1423665707(0x54db6a2b, float:7.5390323E12)
            goto L_0x001c
        L_0x0250:
            r0 = 73101735(0x45b71a7, float:2.5795513E-36)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r4.A01
            X.E4S r8 = (X.E4S) r8
            java.lang.String r7 = "PartnerProgramWelcomeFragment"
            java.lang.String r0 = r4.A02
            java.lang.String r6 = "secondary_button_clicked"
            java.lang.String r5 = "welcome"
            r8.A02(r6, r5, r0)
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            X.0eM r0 = r8.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r2 = X.2EG.A24
            r0 = 631(0x277, float:8.84E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FH7.A08(r4, r3, r2, r0, r7)
            r8.A02(r6, r5, r0)
            r0 = 1216115169(0x487c71e1, float:258503.52)
            goto L_0x001c
        L_0x0283:
            r0 = -1565432186(0xffffffffa2b16686, float:-4.8084497E-18)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.E4S r5 = (X.E4S) r5
            java.lang.String r3 = r4.A02
            java.lang.String r2 = "primary_button_clicked"
            java.lang.String r0 = "welcome"
            r5.A02(r2, r0, r3)
            X.DlI r5 = r5.A01()
            r4 = 0
            X.2Fj r3 = r5.A02
            java.lang.Object r2 = r3.A02()
            X.Dr0 r2 = (X.Dr0) r2
            if (r2 == 0) goto L_0x02a9
            r0 = 1
            r2.A05 = r0
        L_0x02a9:
            java.lang.Object r0 = r3.A02()
            r3.A0A(r0)
            X.6oS r2 = X.C318116oQ.A00(r5)
            r0 = 29
            X.Dba.A1S(r5, r2, r0, r4)
            r0 = -471975423(0xffffffffe3de3a01, float:-8.1987136E21)
            goto L_0x001c
        L_0x02be:
            r0 = 376950203(0x1677cdbb, float:2.0017418E-25)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.E4U r5 = (X.E4U) r5
            java.lang.String r3 = r4.A02
            java.lang.String r2 = "primary_button_clicked"
            java.lang.String r0 = "terms"
            X.E4U.A01(r5, r2, r0, r3)
            X.DlI r4 = r5.A01
            if (r4 != 0) goto L_0x02da
            java.lang.String r0 = "productOnboardingViewModel"
            goto L_0x04cb
        L_0x02da:
            X.2Fj r3 = r4.A02
            java.lang.Object r2 = r3.A02()
            X.Dr0 r2 = (X.Dr0) r2
            if (r2 == 0) goto L_0x02e7
            r0 = 1
            r2.A05 = r0
        L_0x02e7:
            java.lang.Object r0 = r3.A02()
            r3.A0A(r0)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r0 = 23
            X.C51645Fy4.A01(r4, r2, r0)
            r0 = 1969546874(0x7564e67a, float:2.901656E32)
            goto L_0x001c
        L_0x02fc:
            r0 = 1381085716(0x5251b214, float:2.25158955E11)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.2YL r5 = (X.2YL) r5
            X.6oS r3 = X.C318116oQ.A00(r5)
            java.lang.String r2 = r4.A02
            r0 = 3
            X.DbX.A1W(r5, r2, r3, r0)
            r0 = -688292115(0xffffffffd6f97eed, float:-1.37161769E14)
            goto L_0x001c
        L_0x0316:
            r0 = 1376566615(0x520cbd57, float:1.51118004E11)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.E1Q r5 = (X.E1Q) r5
            androidx.fragment.app.Fragment r2 = r5.mParentFragment
            boolean r0 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0333
            if (r2 == 0) goto L_0x0333
            java.lang.String r3 = r4.A02
            X.E7Y r2 = r5.A00
            if (r2 == 0) goto L_0x0333
            r0 = 0
            X.E7Y.A00(r2, r3, r0)
        L_0x0333:
            r0 = 1031918308(0x3d81d2e4, float:0.06339052)
            goto L_0x001c
        L_0x0338:
            r0 = 242953359(0xe7b2c8f, float:3.0959593E-30)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            X.E1P r0 = (X.E1P) r0
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = r4.A02
            X.2EG r0 = X.2EG.A20
            X.SUL r2 = X.Dba.A0J(r5, r3, r0, r2)
            java.lang.String r0 = "AiStickerDisclosureFragment"
            r2.A0S = r0
            r2.A0A()
            r0 = 2014086692(0x780c8624, float:1.140066E34)
            goto L_0x001c
        L_0x0361:
            r0 = -1154481342(0xffffffffbb300342, float:-0.002685741)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A01
            X.E5I r5 = (X.E5I) r5
            com.instagram.common.session.UserSession r6 = r5.A02
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            java.lang.String r0 = r4.A02
            X.DbY.A1S(r6, r0)
            android.os.Bundle r4 = X.DbX.A0D(r0)
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.lang.String r7 = "share_to_system_sheet"
            X.C46395DeI.A0Q(r3, r4, r5, r6, r7, r8)
            r0 = -600212495(0xffffffffdc397bf1, float:-2.08836583E17)
            goto L_0x001c
        L_0x0389:
            r0 = -2021034375(0xffffffff87897679, float:-2.06831E-34)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r4.A01
            android.content.Context r2 = X.DbT.A08(r0)
            java.lang.String r0 = r4.A02
            X.FH7.A03(r2, r0)
            r0 = 1611351524(0x600b45e4, float:4.014271E19)
            goto L_0x001c
        L_0x03a0:
            r0 = -1108104814(0xffffffffbdf3a992, float:-0.11897577)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A01
            X.E1H r2 = (X.E1H) r2
            X.0eM r0 = r2.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r3 = r2.A07
            java.lang.String r9 = X.DbS.A0t(r3)
            X.0eM r3 = r2.A06
            java.lang.String r10 = X.DbS.A0t(r3)
            java.lang.String r11 = r4.A02
            X.GPK r4 = X.GPK.REPLACE
            X.0eM r3 = r2.A05
            java.lang.String r12 = X.DbS.A0t(r3)
            X.0eM r3 = r2.A0B
            java.lang.String r13 = X.DbS.A0t(r3)
            X.0eM r3 = r2.A08
            java.lang.Object r7 = r3.getValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            X.0eM r3 = r2.A02
            java.lang.String r14 = X.DbS.A0t(r3)
            X.0eM r3 = r2.A03
            java.lang.Object r8 = r3.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            X.0eM r3 = r2.A0A
            java.lang.Object r5 = r3.getValue()
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            r6 = 0
            r16 = 1
            X.N2M r3 = new X.N2M
            r15 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.C71071Oaq.A01(r2, r0, r3)
            X.DbZ.A15(r2)
            r0 = -1297681982(0xffffffffb2a6f1c2, float:-1.9434882E-8)
            goto L_0x001c
        L_0x03ff:
            r0 = 659186319(0x274a628f, float:2.808656E-15)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A01
            X.E7U r6 = (X.E7U) r6
            X.0eM r0 = r6.A0E
            X.0lg r2 = X.DbT.A0X(r0)
            java.lang.String r0 = "partial_ci_selection"
            r5 = 0
            X.FEK.A00(r2, r5, r0)
            X.6cm r3 = r6.A02
            if (r3 == 0) goto L_0x04c9
            java.lang.String r2 = r4.A02
            r0 = 1
            r3.A03(r5, r2, r0)
            X.G8t r0 = r6.A04
            X.Dba.A1N(r0)
            r0 = 1470487831(0x57a5dd17, float:3.64737984E14)
            goto L_0x001c
        L_0x042a:
            r0 = -144362520(0xfffffffff76533e8, float:-4.6487842E33)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A01
            X.E7U r3 = (X.E7U) r3
            X.6cm r5 = r3.A02
            if (r5 == 0) goto L_0x04c9
            java.lang.String r4 = r4.A02
            r2 = 0
            r9 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r5.A02(r0, r2, r4, r2)
            java.util.Map r0 = r3.A0A
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r0)
        L_0x044e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0468
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r5)
            java.util.HashSet r2 = r3.A0D
            java.lang.Object r0 = r4.getValue()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x044e
            X.Dbb.A1V(r4, r6)
            goto L_0x044e
        L_0x0468:
            android.content.Context r4 = r3.requireContext()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            java.lang.String r6 = X.FFE.A01(r0, r6)
            X.0qQ.A07(r6)
            X.0eM r0 = r3.A0E
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r7 = "partial_ci_selection"
            java.lang.String r8 = "partial_contact_import"
            r10 = r9
            X.1OC r2 = X.FGQ.A00(r4, r5, r6, r7, r8, r9, r10)
            r0 = 39
            X.EDg r0 = X.C47697EDg.A00(r3, r0)
            r2.A00 = r0
            X.Dbb.A15(r3, r2)
            r0 = -1380414134(0xffffffffadb88d4a, float:-2.0981123E-11)
            goto L_0x001c
        L_0x0496:
            r0 = 1407778956(0x53e9008c, float:2.00147311E12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r4.A01
            X.Jj4 r3 = (X.C60305Jj4) r3
            java.lang.String r2 = r4.A02
            X.E8A r0 = new X.E8A
            r0.<init>(r2)
            X.C60305Jj4.A01(r0, r3)
            r0 = -1425083664(0xffffffffab0ef2f0, float:-5.078568E-13)
            goto L_0x001c
        L_0x04b0:
            java.lang.Object r1 = r4.A01
            X.E5I r1 = (X.E5I) r1
            java.lang.String r4 = r4.A02
            com.instagram.common.session.UserSession r2 = r1.A02
            android.content.Context r0 = r1.requireContext()
            X.3t3 r3 = r1.A05
            java.lang.String r5 = r1.A07
            boolean r7 = r1.A0A
            int r6 = r1.A00
            r8 = 0
            X.C69934Nua.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x04c9:
            java.lang.String r0 = "contactImportLogger"
        L_0x04cb:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50101FOr.onClick(android.view.View):void");
    }

    public C50101FOr(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }
}
