package X;

import android.view.View;

/* renamed from: X.Ok8  reason: case insensitive filesystem */
public final class C71409Ok8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71409Ok8(C70972OTt oTt, NKT nkt, int i) {
        this.A00 = i;
        if (40 - i != 0) {
            this.A01 = nkt;
            this.A02 = oTt;
        } else {
            this.A02 = nkt;
            this.A01 = oTt;
        }
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new C71409Ok8(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0851, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0854, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x086c, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0873, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0b91, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0b94, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        r4.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x03ef, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x03f2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r6 = r21
            int r0 = r6.A00
            r4 = r22
            switch(r0) {
                case 0: goto L_0x0af0;
                case 1: goto L_0x0ad1;
                case 2: goto L_0x0aa6;
                case 3: goto L_0x0a9a;
                case 4: goto L_0x0a8e;
                case 5: goto L_0x0a60;
                case 6: goto L_0x0a54;
                case 7: goto L_0x0a48;
                case 8: goto L_0x0a31;
                case 9: goto L_0x0a1a;
                case 10: goto L_0x0a03;
                case 11: goto L_0x09d7;
                case 12: goto L_0x09be;
                case 13: goto L_0x0950;
                case 14: goto L_0x08a7;
                case 15: goto L_0x0829;
                case 16: goto L_0x0815;
                case 17: goto L_0x07f4;
                case 18: goto L_0x079f;
                case 19: goto L_0x068f;
                case 20: goto L_0x0678;
                case 21: goto L_0x0644;
                case 22: goto L_0x062a;
                case 23: goto L_0x0615;
                case 24: goto L_0x05ef;
                case 25: goto L_0x05c9;
                case 26: goto L_0x05a3;
                case 27: goto L_0x0566;
                case 28: goto L_0x0549;
                case 29: goto L_0x0530;
                case 30: goto L_0x0515;
                case 31: goto L_0x04fa;
                case 32: goto L_0x04da;
                case 33: goto L_0x04bb;
                case 34: goto L_0x049c;
                case 35: goto L_0x047c;
                case 36: goto L_0x043e;
                case 37: goto L_0x0423;
                case 38: goto L_0x005d;
                case 39: goto L_0x03f3;
                case 40: goto L_0x0855;
                case 41: goto L_0x0333;
                case 42: goto L_0x0315;
                case 43: goto L_0x029a;
                case 44: goto L_0x024e;
                case 45: goto L_0x01e7;
                case 46: goto L_0x0174;
                case 47: goto L_0x0116;
                case 48: goto L_0x00cf;
                case 49: goto L_0x0096;
                case 50: goto L_0x007f;
                case 51: goto L_0x0034;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r6.A01
            X.NKe r4 = (X.C68486NKe) r4
            java.lang.Object r3 = r6.A02
            X.OHt r3 = (X.C70724OHt) r3
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x002d
            android.widget.TextView r2 = r3.A05
            r0 = 2131977010(0x7f136332, float:1.9591157E38)
            r2.setText(r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131099651(0x7f060003, float:1.7811661E38)
            X.DbT.A17(r1, r2, r0)
            r0 = 2131100872(0x7f0604c8, float:1.7814138E38)
            r2.setBackgroundResource(r0)
        L_0x002d:
            X.C68486NKe.A01(r3, r4)
            r0 = 0
        L_0x0031:
            r4.A03 = r0
        L_0x0033:
            return
        L_0x0034:
            java.lang.Object r4 = r6.A01
            X.NKe r4 = (X.C68486NKe) r4
            java.lang.Object r3 = r6.A02
            X.OHt r3 = (X.C70724OHt) r3
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0058
            android.widget.TextView r2 = r3.A05
            r0 = 2131977010(0x7f136332, float:1.9591157E38)
            r2.setText(r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131099651(0x7f060003, float:1.7811661E38)
            X.DbT.A17(r1, r2, r0)
            r0 = 2131100872(0x7f0604c8, float:1.7814138E38)
            r2.setBackgroundResource(r0)
        L_0x0058:
            X.C68486NKe.A00(r3, r4)
            r0 = 1
            goto L_0x0031
        L_0x005d:
            java.lang.Object r1 = r6.A01
            com.instagram.ui.widget.search.SearchController r1 = (com.instagram.ui.widget.search.SearchController) r1
            java.lang.Object r0 = r6.A02
            X.OIK r0 = (X.OIK) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A0F
            r0.A03()
            X.OyY r0 = r1.A0F
            if (r0 == 0) goto L_0x0033
            X.OO3 r4 = r0.A01
            if (r4 == 0) goto L_0x0033
            java.lang.String r0 = ""
            r4.A04(r0)
            r3 = 4
            r1 = 0
            r0 = 0
            r4.A03(r0, r3, r1)
            return
        L_0x007f:
            r0 = -1595386191(0xffffffffa0e856b1, float:-3.9359696E-19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A02
            X.Pup r1 = (X.C74435Pup) r1
            java.lang.Object r0 = r6.A01
            X.NjE r0 = (X.C69313NjE) r0
            r1.Dix(r0)
            r0 = -575359836(0xffffffffddb4b4a4, float:-1.62765159E18)
            goto L_0x03ef
        L_0x0096:
            r0 = 34518605(0x20eb64d, float:1.048483E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r6.A02
            X.NHU r2 = (X.NHU) r2
            X.OM1 r1 = r2.A00()
            X.OTO r1 = r1.A02
            if (r1 == 0) goto L_0x00ca
            java.lang.Object r1 = r6.A01
            X.NMF r1 = (X.NMF) r1
            X.Ob7 r5 = r1.A03
            X.4D6 r4 = r1.A01
            android.content.Context r3 = r1.A00
            java.lang.Integer r8 = r2.A01()
            X.OM1 r1 = r2.A00()
            java.lang.String r9 = r1.A0H
            X.OGY r7 = r5.A01
            X.OM1 r1 = r2.A00()
            X.OTO r1 = r1.A02
            X.Nkg r6 = r1.A00
            X.C71084Ob7.A01(r3, r4, r5, r6, r7, r8, r9)
        L_0x00ca:
            r1 = -748307263(0xffffffffd365bcc1, float:-9.8671428E11)
            goto L_0x0b91
        L_0x00cf:
            r0 = 1578203007(0x5e11777f, float:2.62049657E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r6.A01
            X.NKU r8 = (X.NKU) r8
            java.lang.Object r6 = r6.A02
            X.OTO r6 = (X.OTO) r6
            X.Ob7 r9 = r8.A09
            r9.getClass()
            android.content.Context r7 = r8.requireContext()
            X.ONV r5 = r9.A07
            java.lang.String r4 = r9.A03
            com.instagram.user.model.User r3 = r9.A06
            java.lang.String r2 = r9.A0F
            java.lang.String r1 = X.OTO.A00(r6)
            r5.A01(r3, r4, r2, r1)
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L_0x010a
            com.instagram.common.session.UserSession r2 = r9.A05
            r1 = 0
            X.C49960FGs.A07(r7, r2, r3, r1)
            android.app.Activity r7 = (android.app.Activity) r7
            X.C49960FGs.A03(r7)
        L_0x0105:
            r1 = -119374092(0xfffffffff8e27ef4, float:-3.6751063E34)
            goto L_0x0b91
        L_0x010a:
            java.lang.Integer r12 = r9.A02
            java.lang.String r13 = r9.A03
            X.OGY r11 = r9.A01
            X.Nkg r10 = r6.A00
            X.C71084Ob7.A01(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0105
        L_0x0116:
            r0 = -1895605117(0xffffffff8f035c83, float:-6.476616E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r6.A01
            X.NKX r3 = (X.NKX) r3
            java.lang.Object r6 = r6.A02
            X.OTO r6 = (X.OTO) r6
            X.ONV r5 = r3.A05
            java.lang.String r8 = r3.A0B
            com.instagram.user.model.User r4 = r3.A04
            java.lang.String r2 = r3.A0A
            java.lang.String r1 = X.OTO.A00(r6)
            r5.A01(r4, r8, r2, r1)
            X.Nkg r6 = r6.A00
            java.util.List r2 = r3.A0H
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x016f
            android.content.Context r4 = r3.requireContext()
            boolean r13 = X.AnonymousClass3HA.A00(r4)
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            X.C49960FGs.A01(r1)
            com.instagram.common.session.UserSession r5 = r3.A01
            r9 = 0
            X.NHU r1 = r3.A09
            java.lang.Integer r7 = r1.A01()
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r2)
            java.lang.String r10 = X.DbS.A0q(r1)
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            r11 = r9
            X.1OC r2 = X.ORS.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 21
            X.NMH.A00(r2, r3, r4, r1)
            r3.schedule(r2)
        L_0x016f:
            r1 = 284999980(0x10fcc12c, float:9.96941E-29)
            goto L_0x0b91
        L_0x0174:
            r0 = -392356483(0xffffffffe89d1d7d, float:-5.935644E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r6.A01
            X.NJB r7 = (X.NJB) r7
            java.lang.Object r9 = r6.A02
            X.OTO r9 = (X.OTO) r9
            X.OLx r6 = r7.A0D
            r6.getClass()
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            X.7Pu r4 = r7.A07
            r4.getClass()
            X.ONV r8 = r6.A05
            java.lang.String r11 = r6.A0A
            com.instagram.user.model.User r3 = r6.A04
            java.lang.String r2 = r6.A09
            java.lang.String r1 = X.OTO.A00(r9)
            r8.A01(r3, r11, r2, r1)
            X.Nkg r9 = r9.A00
            com.instagram.model.direct.DirectShareTarget r3 = r6.A03
            if (r3 == 0) goto L_0x01e2
            android.content.Context r1 = r6.A01
            boolean r16 = X.AnonymousClass3HA.A00(r1)
            X.C49960FGs.A01(r5)
            X.NJB r1 = r6.A06
            r2 = 1
            com.instagram.igds.components.button.IgdsButton r1 = r1.A08
            if (r1 == 0) goto L_0x01b9
            r1.setLoading(r2)
        L_0x01b9:
            com.instagram.common.session.UserSession r8 = r6.A02
            r12 = 0
            X.NHU r1 = r6.A08
            java.lang.Integer r10 = r1.A01()
            java.util.ArrayList r2 = r3.A0B()
            r1 = 0
            java.lang.Object r13 = r2.get(r1)
            java.lang.String r13 = (java.lang.String) r13
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()
            r14 = r12
            X.1OC r3 = X.ORS.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = 21
            X.EDb r1 = new X.EDb
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r4, (java.lang.Object) r6)
            r3.A00 = r1
            r7.schedule(r3)
        L_0x01e2:
            r1 = -2050660158(0xffffffff85c568c2, float:-1.8564273E-35)
            goto L_0x0b91
        L_0x01e7:
            r0 = 351001487(0x14ebdb8f, float:2.3815537E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r6.A01
            X.NKU r7 = (X.NKU) r7
            java.lang.Object r10 = r6.A02
            X.OGY r10 = (X.OGY) r10
            X.Ob7 r8 = r7.A09
            r8.getClass()
            android.content.Context r6 = r7.requireContext()
            X.NKU r1 = r8.A08
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            X.C49960FGs.A01(r1)
            com.instagram.common.session.UserSession r1 = r8.A05
            java.lang.String r5 = r8.A03
            r5.getClass()
            java.lang.String r4 = r10.A02
            X.1NY r3 = X.DbU.A0N(r1)
            java.lang.String r1 = "reports/log_tag_selected/"
            r3.A0A(r1)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r3.A0R(r2, r1)
            java.lang.String r1 = "selected_tag_type"
            r3.A9m(r1, r4)
            java.lang.String r1 = "context"
            X.1OC r1 = X.DbT.A0T(r3, r1, r5)
            r7.schedule(r1)
            X.NHU r1 = r8.A0E
            if (r1 == 0) goto L_0x0245
            X.OM1 r1 = r1.A00()
            X.NjZ r2 = r1.A08
            X.NjZ r1 = X.C69334NjZ.RADIO_BUTTONS
            if (r2 != r1) goto L_0x0245
            r8.A04(r10)
        L_0x0240:
            r1 = 2042838822(0x79c33f26, float:1.2672234E35)
            goto L_0x0b91
        L_0x0245:
            java.lang.Integer r11 = r8.A02
            java.lang.String r12 = r8.A03
            r9 = 0
            X.C71084Ob7.A01(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0240
        L_0x024e:
            r0 = 1610388313(0x5ffc9359, float:3.6399977E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r6.A01
            X.NKW r4 = (X.NKW) r4
            java.lang.Object r6 = r6.A02
            X.OTO r6 = (X.OTO) r6
            X.ONV r5 = r4.A04
            java.lang.String r8 = r4.A0B
            com.instagram.user.model.User r3 = r4.A03
            java.lang.String r2 = r4.A0A
            java.lang.String r1 = X.OTO.A00(r6)
            r5.A01(r3, r8, r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            X.C49960FGs.A01(r1)
            X.Nkg r6 = r6.A00
            android.content.Context r3 = r4.requireContext()
            boolean r13 = X.AnonymousClass3HA.A00(r3)
            com.instagram.common.session.UserSession r5 = r4.A01
            java.lang.Integer r7 = r4.A09
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.lang.String r11 = r4.A0C
            r9 = 0
            r10 = r9
            X.1OC r2 = X.ORS.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 20
            X.NMH.A00(r2, r4, r3, r1)
            r4.schedule(r2)
            r1 = 864438989(0x33864acd, float:6.2534674E-8)
            goto L_0x0b91
        L_0x029a:
            r0 = 990435841(0x3b08da01, float:0.0020881894)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r6.A01
            X.NKY r7 = (X.NKY) r7
            java.lang.Object r5 = r6.A02
            X.OHB r5 = (X.OHB) r5
            com.instagram.common.session.UserSession r2 = r7.A01
            X.NHU r1 = r7.A09
            r1.getClass()
            X.OM1 r1 = r1.A00()
            java.lang.String r6 = r1.A0H
            X.Nks r1 = r5.A00
            java.lang.String r4 = r1.toString()
            X.1NY r3 = X.DbU.A0N(r2)
            java.lang.String r1 = "reports/perform_guided_action/"
            r3.A0A(r1)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r3.A0R(r2, r1)
            java.lang.String r1 = "action_type"
            r3.A9m(r1, r4)
            java.lang.String r1 = "context"
            X.1OC r1 = X.DbT.A0T(r3, r1, r6)
            X.1ES.A03(r1)
            X.Nks r3 = r5.A00
            int r2 = r3.ordinal()
            r1 = 3
            if (r2 == r1) goto L_0x02f6
            r1 = 5
            if (r2 == r1) goto L_0x02f6
            r1 = 12
            if (r2 == r1) goto L_0x02f6
            r1 = 6
            if (r2 == r1) goto L_0x02f6
            r1 = 10
            if (r2 == r1) goto L_0x02f6
        L_0x02f1:
            r1 = -282144813(0xffffffffef2ecfd3, float:-5.4101636E28)
            goto L_0x0b91
        L_0x02f6:
            X.Nks r1 = X.C69413Nks.LEARN_MORE_ADS
            if (r3 != r1) goto L_0x0307
            android.content.Context r2 = r7.requireContext()
            r1 = 2131951984(0x7f130170, float:1.9540398E38)
            java.lang.String r1 = r2.getString(r1)
            r5.A05 = r1
        L_0x0307:
            android.content.Context r4 = r7.requireContext()
            com.instagram.common.session.UserSession r3 = r7.A01
            java.lang.String r2 = r5.A04
            java.lang.String r1 = r5.A05
            X.C49960FGs.A07(r4, r3, r2, r1)
            goto L_0x02f1
        L_0x0315:
            r0 = -24047126(0xfffffffffe9111ea, float:-9.641554E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r6.A02
            X.OTt r2 = (X.C70972OTt) r2
            boolean r1 = r2.A0B
            if (r1 == 0) goto L_0x032e
            r1 = 0
            r2.A09 = r1
            java.lang.Object r1 = r6.A01
            X.PvW r1 = (X.C74476PvW) r1
            r1.D91(r2)
        L_0x032e:
            r1 = 1984192811(0x7644612b, float:9.957627E32)
            goto L_0x0b91
        L_0x0333:
            r0 = 805612372(0x3004ab54, float:4.826479E-10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r6.A01
            X.NKT r5 = (X.NKT) r5
            java.lang.Object r6 = r6.A02
            X.OTt r6 = (X.C70972OTt) r6
            r3 = 0
            com.instagram.common.session.UserSession r0 = r5.A00
            java.lang.String r9 = "userSession"
            if (r0 == 0) goto L_0x086c
            java.lang.String r7 = r0.A05
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "id"
            r2.putString(r0, r1)
            float r1 = r6.A00
            java.lang.String r0 = "latitude"
            r2.putFloat(r0, r1)
            float r1 = r6.A01
            java.lang.String r0 = "longitude"
            r2.putFloat(r0, r1)
            long r0 = r6.A04
            java.lang.String r8 = "timestamp"
            r2.putLong(r8, r0)
            long r0 = r6.A03
            java.lang.String r8 = "status_update_timestamp"
            r2.putLong(r8, r0)
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "device"
            r2.putString(r0, r1)
            java.lang.String r1 = r6.A07
            java.lang.String r0 = "location"
            r2.putString(r0, r1)
            boolean r1 = r6.A09
            java.lang.String r0 = "is_confirmed"
            r2.putBoolean(r0, r1)
            int r1 = r6.A02
            java.lang.String r0 = "position"
            r2.putInt(r0, r1)
            boolean r1 = r6.A0A
            java.lang.String r0 = "is_current"
            r2.putBoolean(r0, r1)
            boolean r1 = r6.A0B
            java.lang.String r0 = "is_suspicious_login"
            r2.putBoolean(r0, r1)
            java.lang.String r1 = r6.A08
            java.lang.String r0 = X.C66584MXp.A0S()
            r2.putString(r0, r1)
            X.0qQ.A0B(r7, r3)
            X.NKi r3 = new X.NKi
            r3.<init>()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r7)
            r3.setArguments(r2)
            com.instagram.common.session.UserSession r0 = r5.A00
            if (r0 == 0) goto L_0x086c
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131965561(0x7f133679, float:1.9567935E38)
            X.DbZ.A0z(r1, r2, r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131965571(0x7f133683, float:1.9567956E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0g = r0
            r1 = 40
            X.Ok8 r0 = new X.Ok8
            r0.<init>((X.C70972OTt) r6, (X.NKT) r5, (int) r1)
            r2.A0K = r0
            X.7Pu r1 = r2.A00()
            r0 = 1
            r1.A0Q(r0)
            android.app.Activity r0 = r5.getRootActivity()
            r1.A02(r0, r3)
            r0 = 1037075927(0x3dd085d7, float:0.10181778)
        L_0x03ef:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x03f3:
            r0 = 67123399(0x40038c7, float:1.5072399E-36)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r6.A02
            X.OYt r4 = (X.C71018OYt) r4
            X.0eM r0 = r4.A04
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            android.view.ViewPropertyAnimator r0 = r1.rotationBy(r0)
            r0.start()
            java.lang.Object r2 = r6.A01
            X.7l3 r2 = (X.C340307l3) r2
            r1 = 4
            X.9dv r0 = new X.9dv
            r0.<init>(r1, r4, r2)
            r2.EzI(r0)
            r0 = 1846148507(0x6e09fd9b, float:1.0676509E28)
            goto L_0x0851
        L_0x0423:
            r0 = 49004101(0x2ebbe45, float:3.4639356E-37)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A02
            X.MjY r0 = (X.C67176MjY) r0
            X.Pun r1 = r0.A00
            java.lang.Object r0 = r6.A01
            X.Mid r0 = (X.C67119Mid) r0
            java.lang.Integer r0 = r0.A02
            r1.CtW(r0)
            r0 = 1722985483(0x66b2ac0b, float:4.2187743E23)
            goto L_0x0851
        L_0x043e:
            r0 = -977962669(0xffffffffc5b57953, float:-5807.1655)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r6.A01
            X.OGW r7 = (X.OGW) r7
            X.Ps8 r1 = r7.A00
            java.lang.Object r5 = r6.A02
            X.Ps8 r5 = (X.C74280Ps8) r5
            if (r1 == r5) goto L_0x0477
            r7.A00 = r5
            r4 = 0
        L_0x0454:
            java.util.ArrayList r2 = r7.A04
            int r1 = r2.size()
            if (r4 >= r1) goto L_0x0472
            java.lang.Object r3 = r2.get(r4)
            X.OCt r3 = (X.C70596OCt) r3
            X.Ps8 r2 = r3.A01
            X.Ps8 r1 = r7.A00
            boolean r2 = X.AnonymousClass7TF.A1W(r2, r1)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r3.A00
            r1.setSelected(r2)
            int r4 = r4 + 1
            goto L_0x0454
        L_0x0472:
            X.Ptl r1 = r7.A03
            r1.DqD(r5)
        L_0x0477:
            r1 = -1920455392(0xffffffff8d882d20, float:-8.392511E-31)
            goto L_0x0b91
        L_0x047c:
            r0 = 111321083(0x6a29ffb, float:6.11727E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r6.A02
            X.Myc r2 = (X.C68010Myc) r2
            com.instagram.model.direct.DirectSearchPrompt r4 = r2.A01
            if (r4 == 0) goto L_0x0497
            java.lang.Object r1 = r6.A01
            X.O7S r1 = (X.O7S) r1
            int r3 = r2.A00
            X.OsH r2 = r1.A00
            r1 = 1
            X.C71874OsH.A00(r2, r4, r3, r1)
        L_0x0497:
            r1 = -807265752(0xffffffffcfe21a28, float:-7.58673E9)
            goto L_0x0b91
        L_0x049c:
            r0 = -2028821040(0xffffffff8712a5d0, float:-1.1032547E-34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.4mu r1 = (X.C273634mu) r1
            X.0qQ.A0A(r4)
            java.lang.Object r0 = r6.A02
            X.MeV r0 = (X.C66890MeV) r0
            java.lang.Integer r0 = r0.A03
            X.0qQ.A07(r0)
            r1.Dhq(r4, r0)
            r0 = -339296854(0xffffffffebc6bdaa, float:-4.8052595E26)
            goto L_0x0851
        L_0x04bb:
            r0 = 1174630948(0x46037224, float:8412.535)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.4mu r1 = (X.C273634mu) r1
            X.0qQ.A0A(r4)
            java.lang.Object r0 = r6.A02
            X.MeV r0 = (X.C66890MeV) r0
            java.lang.Integer r0 = r0.A03
            X.0qQ.A07(r0)
            r1.Dhq(r4, r0)
            r0 = -212894224(0xfffffffff34f7df0, float:-1.6439205E31)
            goto L_0x0851
        L_0x04da:
            r0 = 1537330678(0x5ba1cdf6, float:9.1087855E16)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A01
            X.MzL r0 = (X.C68054MzL) r0
            X.30k r0 = r0.A01
            r0.A00()
            java.lang.Object r0 = r6.A02
            X.Ou4 r0 = (X.Ou4) r0
            X.OGT r0 = r0.A01
            X.0sa r0 = r0.A02
            r0.invoke()
            r0 = -2001919664(0xffffffff88ad2150, float:-1.04198905E-33)
            goto L_0x0851
        L_0x04fa:
            r0 = -730755502(0xffffffffd4718e52, float:-4.14989943E12)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.Pui r1 = (X.C74428Pui) r1
            java.lang.Object r0 = r6.A02
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1.DiF(r0)
            r0 = 1417630996(0x547f5514, float:4.38657614E12)
            goto L_0x0851
        L_0x0515:
            r0 = 82081798(0x4e47806, float:5.3712767E-36)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.Pui r1 = (X.C74428Pui) r1
            java.lang.Object r0 = r6.A02
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1.DiF(r0)
            r0 = -996404004(0xffffffffc49c14dc, float:-1248.6519)
            goto L_0x0851
        L_0x0530:
            r0 = -1555165189(0xffffffffa34e0ffb, float:-1.1170666E-17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A02
            X.MnI r0 = (X.C67401MnI) r0
            X.Pth r1 = r0.A01
            java.lang.Object r0 = r6.A01
            X.Otu r0 = (X.C71969Otu) r0
            r1.DBH(r0)
            r0 = 32030000(0x1e8bd30, float:8.549481E-38)
            goto L_0x0851
        L_0x0549:
            r0 = -730554246(0xffffffffd474a07a, float:-4.20265748E12)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A02
            X.NIY r0 = (X.NIY) r0
            X.0sP r1 = r0.A01
            java.lang.Object r0 = r6.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r1.invoke(r0)
            r0 = 2136563508(0x7f595f34, float:2.889368E38)
            goto L_0x0851
        L_0x0566:
            r0 = 1824567271(0x6cc0afe7, float:1.8635555E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r6.A01
            X.NeZ r4 = (X.C69094NeZ) r4
            X.0eM r2 = r4.A0D
            java.lang.Object r1 = r2.getValue()
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1
            boolean r1 = r1.isDeviceLocked()
            if (r1 == 0) goto L_0x058b
            java.lang.Object r3 = r2.getValue()
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            android.app.Activity r2 = r4.A02
            r1 = 0
            r3.requestDismissKeyguard(r2, r1)
        L_0x058b:
            X.OKY r3 = r4.A05
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            X.PL3 r1 = new X.PL3
            r1.<init>(r2)
            r3.A00(r1)
            java.lang.Object r1 = r6.A02
            X.OMI r1 = (X.OMI) r1
            r1.A00()
            r1 = -1539877020(0xffffffffa4375764, float:-3.9755822E-17)
            goto L_0x0b91
        L_0x05a3:
            r0 = 1466982209(0x57705f41, float:2.64291903E14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            X.OKY r2 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            X.PL3 r0 = new X.PL3
            r0.<init>(r1)
            r2.A00(r0)
            java.lang.Object r1 = r6.A02
            X.OMI r1 = (X.OMI) r1
            r0 = 2131976566(0x7f136176, float:1.9590256E38)
            r1.A01(r0)
            r0 = 1016427840(0x3c957540, float:0.018244386)
            goto L_0x0851
        L_0x05c9:
            r0 = 1436168129(0x559a2fc1, float:2.11912365E13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            X.OKY r2 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.PL3 r0 = new X.PL3
            r0.<init>(r1)
            r2.A00(r0)
            java.lang.Object r1 = r6.A02
            X.OMI r1 = (X.OMI) r1
            r0 = 2131976565(0x7f136175, float:1.9590254E38)
            r1.A01(r0)
            r0 = 1745836845(0x680f5b2d, float:2.7079212E24)
            goto L_0x0851
        L_0x05ef:
            r0 = -1754370328(0xffffffff976e6ee8, float:-7.704193E-25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            X.OKY r2 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.PL3 r0 = new X.PL3
            r0.<init>(r1)
            r2.A00(r0)
            java.lang.Object r1 = r6.A02
            X.OMI r1 = (X.OMI) r1
            r0 = 2131976564(0x7f136174, float:1.9590252E38)
            r1.A01(r0)
            r0 = 868288550(0x33c10826, float:8.988745E-8)
            goto L_0x0851
        L_0x0615:
            r0 = -1006549670(0xffffffffc401455a, float:-517.0836)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r6.A02
            r1.invoke(r0)
            r0 = -645812176(0xffffffffd981b030, float:-4.562999E15)
            goto L_0x0851
        L_0x062a:
            r0 = 1927808463(0x72e805cf, float:9.1913657E30)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.6a4 r1 = (X.C309916a4) r1
            java.lang.Object r0 = r6.A02
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            X.0qQ.A0A(r0)
            r1.DXv(r0)
            r0 = -1459279154(0xffffffffa9052ace, float:-2.956906E-14)
            goto L_0x0851
        L_0x0644:
            r0 = 1269593683(0x4bac7653, float:2.2604966E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.N3s r1 = (X.C68177N3s) r1
            java.lang.String r8 = r1.A07
            if (r8 == 0) goto L_0x0673
            java.lang.Object r2 = r6.A02
            X.MzD r2 = (X.C68046MzD) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r5 = r2.A06
            android.view.View r1 = r2.A04
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r1)
            android.app.Activity r3 = X.C61270mF.A00(r1)
            X.0xG r4 = r2.A05
            X.TpH r6 = X.C14068TpH.STORY
            X.UzD r7 = X.C16677UzD.MEDIA
            X.OcF r2 = X.ORV.A01(r3, r4, r5, r6, r7, r8)
            r1 = 0
            X.C71093OcF.A00(r1, r2)
        L_0x0673:
            r1 = -646590127(0xffffffffd975d151, float:-4.32446969E15)
            goto L_0x0b91
        L_0x0678:
            r0 = -2143010582(0xffffffff804440ea, float:-6.2681E-39)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A02
            X.MzD r0 = (X.C68046MzD) r0
            X.0sP r1 = r0.A0B
            java.lang.Object r0 = r6.A01
            r1.invoke(r0)
            r0 = 476020738(0x1c5f8002, float:7.3949957E-22)
            goto L_0x0851
        L_0x068f:
            r0 = 941591065(0x381f8a19, float:3.8037168E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A01
            X.VOj r1 = (X.C17256VOj) r1
            java.lang.Object r3 = r6.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.TrF r6 = r1.A00
            com.facebook.common.callercontext.CallerContext r1 = X.C14176TrF.A11
            X.3uh r1 = r6.A03
            r1.getClass()
            X.OLT r1 = r1.A04
            r1.getClass()
            int r1 = r1.A01
            r7 = 250(0xfa, float:3.5E-43)
            if (r1 < r7) goto L_0x0705
            android.content.Context r5 = r6.A0F
            X.8ab r4 = X.DbS.A0Y(r5)
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131960291(0x7f1321e3, float:1.9557247E38)
            r3 = 1
            java.lang.String r1 = X.JTS.A0i(r2, r7, r1)
            r4.A05 = r1
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131960292(0x7f1321e4, float:1.9557249E38)
            java.lang.String r1 = r2.getString(r1)
            r4.A0q(r1)
            r4.A0s(r3)
            r3 = 2131956164(0x7f1311c4, float:1.9548876E38)
            r2 = 3
            X.Oep r1 = new X.Oep
            r1.<init>(r2)
            r4.A0H(r1, r3)
            X.DbT.A1V(r4)
            com.instagram.common.session.UserSession r1 = r6.A0J
            X.Oy7 r3 = X.O14.A00(r1)
            X.3uh r1 = r6.A03
            r1.getClass()
            java.lang.String r2 = r1.A0P()
            r2.getClass()
            java.lang.String r1 = r6.A08
            r1.getClass()
            r3.A00(r2, r1)
        L_0x0700:
            r1 = -1430127431(0xffffffffaac1fcb9, float:-3.4459049E-13)
            goto L_0x0b91
        L_0x0705:
            java.util.Set r1 = r6.A0a
            r1.add(r3)
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = r6.A0U
            X.3uh r1 = r6.A03
            java.lang.String r9 = r1.A0P()
            r9.getClass()
            com.instagram.common.session.UserSession r8 = r2.A06
            java.util.List r7 = java.util.Collections.singletonList(r3)
            X.OEi r5 = new X.OEi
            r5.<init>(r1, r3, r2)
            X.DbY.A1S(r8, r7)
            r4 = 0
            int r2 = r7.size()
            java.util.ArrayList r3 = X.DbS.A0v(r2)
        L_0x072c:
            if (r4 >= r2) goto L_0x073e
            java.lang.Object r1 = r7.get(r4)
            X.17B r1 = (X.AnonymousClass17B) r1
            java.lang.String r1 = r1.getId()
            r3.add(r1)
            int r4 = r4 + 1
            goto L_0x072c
        L_0x073e:
            r2 = 1
            X.PE6 r1 = new X.PE6
            r1.<init>(r5, r2)
            X.OXI.A02(r8, r1, r9, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x0750:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x075a
            X.DbY.A1W(r3, r2)
            goto L_0x0750
        L_0x075a:
            com.instagram.common.session.UserSession r1 = r6.A0J
            X.Oy7 r5 = X.O14.A00(r1)
            X.3uh r1 = r6.A03
            r1.getClass()
            java.lang.String r4 = r1.A0P()
            r4.getClass()
            java.lang.String r3 = r6.A08
            r3.getClass()
            X.0wc r1 = r5.A00
            X.1Ln r2 = X.1Ln.A0F(r1)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x079a
            com.instagram.common.session.UserSession r1 = r5.A01
            X.Dbb.A1G(r2, r1)
            java.lang.String r1 = "jcs_add_recipient"
            X.DbV.A1M(r2, r1)
            java.lang.String r1 = "jcs_viewer_sheet"
            r2.A0p(r1)
            java.lang.String r1 = "story"
            X.Dba.A1E(r2, r1)
            r2.A0s(r4)
            r2.A0v(r3)
            r2.Cgf()
        L_0x079a:
            r6.A07()
            goto L_0x0700
        L_0x079f:
            r0 = -1234147338(0xffffffffb67067f6, float:-3.58233E-6)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A01
            X.VOj r0 = (X.C17256VOj) r0
            java.lang.Object r8 = r6.A02
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            X.TrF r1 = r0.A00
            com.facebook.common.callercontext.CallerContext r0 = X.C14176TrF.A11
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r6 = r1.A0U
            X.3uh r7 = r1.A03
            r7.getClass()
            java.lang.String r9 = r7.A0P()
            r9.getClass()
            X.8ab r4 = X.DbW.A0U(r6)
            java.lang.String r0 = r8.getUsername()
            r4.A05 = r0
            r0 = 2131972094(0x7f134ffe, float:1.9581186E38)
            r4.A08(r0)
            r2 = 1
            r4.A0s(r2)
            r0 = 2131972039(0x7f134fc7, float:1.9581074E38)
            java.lang.String r1 = r6.getString(r0)
            r10 = 6
            X.Of9 r5 = new X.Of9
            r5.<init>(r6, r7, r8, r9, r10)
            X.8ae r0 = X.C358278ae.RED
            r4.A0Y(r5, r0, r1, r2)
            r1 = 9
            X.Oey r0 = new X.Oey
            r0.<init>(r6, r1)
            X.DbX.A16(r0, r4)
            r0 = -1514819836(0xffffffffa5b5af04, float:-3.151709E-16)
            goto L_0x0851
        L_0x07f4:
            r0 = -1581443969(0xffffffffa1bd147f, float:-1.2812563E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r6.A01
            X.PwP r4 = (X.C74530PwP) r4
            X.N5I r4 = (X.N5I) r4
            java.lang.String r3 = r4.A04
            if (r3 == 0) goto L_0x0810
            java.lang.Object r1 = r6.A02
            X.Muz r1 = (X.C67795Muz) r1
            X.2r8 r2 = r1.A01
            java.lang.String r1 = r4.A06
            r2.A00(r1, r3)
        L_0x0810:
            r1 = 1597224391(0x5f33b5c7, float:1.2949475E19)
            goto L_0x0b91
        L_0x0815:
            r0 = -891683472(0xffffffffcad9fd70, float:-7143096.0)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r6.A01
            r1.invoke(r0)
            r0 = 1711591204(0x6604cf24, float:1.5679336E23)
            goto L_0x0851
        L_0x0829:
            r0 = -1030866965(0xffffffffc28e37eb, float:-71.109215)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r6.A02
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            com.instagram.common.ui.base.IgTextView r2 = r0.A06
            java.lang.String r9 = "subtitleView"
            if (r2 == 0) goto L_0x086c
            int r0 = r2.getSelectionStart()
            r1 = -1
            if (r0 != r1) goto L_0x084e
            int r0 = r2.getSelectionEnd()
            if (r0 != r1) goto L_0x084e
            java.lang.Object r0 = r6.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r4)
        L_0x084e:
            r0 = -1762563623(0xffffffff96f169d9, float:-3.900245E-25)
        L_0x0851:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0855:
            r0 = 610083661(0x245d234d, float:4.7951637E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r6.A02
            X.NKT r7 = (X.NKT) r7
            java.lang.Object r8 = r6.A01
            X.OTt r8 = (X.C70972OTt) r8
            X.OAS r6 = r7.A04
            com.instagram.common.session.UserSession r1 = r7.A00
            if (r1 != 0) goto L_0x0874
            java.lang.String r9 = "userSession"
        L_0x086c:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0874:
            java.lang.String r5 = r8.A06
            if (r5 != 0) goto L_0x087a
            java.lang.String r5 = ""
        L_0x087a:
            X.1NY r4 = X.AnonymousClass7TG.A0a(r1)
            r3 = 132(0x84, float:1.85E-43)
            r2 = 38
            r1 = 121(0x79, float:1.7E-43)
            java.lang.String r1 = X.MYP.A01(r3, r2, r1)
            r4.A0A(r1)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r4.A0R(r2, r1)
            java.lang.String r1 = X.MYP.A00()
            X.1OC r2 = X.DbT.A0T(r4, r1, r5)
            r1 = 19
            X.NMH.A00(r2, r6, r8, r1)
            r7.schedule(r2)
            r1 = -588874178(0xffffffffdce67e3e, float:-5.19024395E17)
            goto L_0x0b91
        L_0x08a7:
            r0 = -729070249(0xffffffffd48b4557, float:-4.7853103E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r6.A01
            X.O92 r2 = (X.O92) r2
            java.lang.Object r1 = r6.A02
            X.N5r r1 = (X.C68202N5r) r1
            X.N4t r4 = r1.A01
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.NJg r1 = r2.A00
            X.0eM r1 = r1.A07
            java.lang.Object r3 = r1.getValue()
            X.NdC r3 = (X.NdC) r3
            com.instagram.common.session.UserSession r6 = r3.A01
            X.0Tu r5 = X.0Tu.A05
            r1 = 36321769624512227(0x810a75001526e3, double:3.033371594343929E-306)
            boolean r1 = X.182.A06(r5, r6, r1)
            if (r1 == 0) goto L_0x08d8
            X.NdC.A03(r4, r3)
        L_0x08d8:
            X.JM9 r1 = r3.A0O()
            X.N8p r1 = (X.C68278N8p) r1
            java.util.List r1 = r1.A00
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r1.iterator()
        L_0x08e8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x08fa
            java.lang.Object r2 = r5.next()
            boolean r1 = r2 instanceof X.PHD
            if (r1 == 0) goto L_0x08e8
            r7.add(r2)
            goto L_0x08e8
        L_0x08fa:
            r6 = 0
            java.util.Iterator r5 = r7.iterator()
        L_0x08ff:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x091a
            java.lang.Object r1 = r5.next()
            X.PHD r1 = (X.PHD) r1
            X.N4t r1 = r1.A01
            java.lang.String r2 = r1.A0B
            java.lang.String r1 = r4.A0B
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x091b
            int r6 = r6 + 1
            goto L_0x08ff
        L_0x091a:
            r6 = -1
        L_0x091b:
            int r2 = r6 + 1
            X.Ody r7 = r3.A02
            java.lang.String r18 = X.N4t.A00(r4)
            X.Oy3 r1 = r7.A02
            java.lang.Integer r13 = r1.A01
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            java.lang.String r16 = "BOTTOM_SHEET_ROW_USER"
            java.lang.String r17 = "TAP"
            r5 = 0
            java.lang.String r19 = "FULLSCREEN"
            r6 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = r5
            r20 = r5
            X.C71144Ody.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.PGW r1 = new X.PGW
            r1.<init>(r4)
            r3.A0P(r1)
            java.lang.String r1 = ""
            r3.A0S(r1)
            r1 = 938830515(0x37f56ab3, float:2.9255962E-5)
            goto L_0x0b91
        L_0x0950:
            r0 = 612187900(0x247d3efc, float:5.491398E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r6.A02
            X.Mzj r2 = (X.C68078Mzj) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.PGT r2 = r2.A0B
            java.lang.Object r1 = r6.A01
            java.lang.String r6 = X.N4t.A01(r1)
            X.NJa r1 = r2.A00
            X.NdD r5 = X.C68462NJa.A01(r1)
            java.util.Iterator r2 = X.MYL.A02(r5)
        L_0x096f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09ab
            java.lang.Object r4 = r2.next()
            java.lang.String r1 = X.N4t.A01(r4)
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 == 0) goto L_0x096f
        L_0x0983:
            X.N4t r4 = (X.N4t) r4
            if (r4 == 0) goto L_0x09b9
            X.JM9 r1 = r5.A0O()
            X.N8r r1 = (X.C68280N8r) r1
            java.util.List r1 = r1.A02
            r3 = 0
            java.util.Iterator r2 = r1.iterator()
        L_0x0994:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09ad
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = X.N4t.A01(r1)
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 != 0) goto L_0x09ae
            int r3 = r3 + 1
            goto L_0x0994
        L_0x09ab:
            r4 = 0
            goto L_0x0983
        L_0x09ad:
            r3 = -1
        L_0x09ae:
            X.C69028NdD.A0H(r5, r3)
            X.PGo r1 = new X.PGo
            r1.<init>(r4)
            r5.A0P(r1)
        L_0x09b9:
            r1 = -1795007214(0xffffffff95025d12, float:-2.632671E-26)
            goto L_0x0b91
        L_0x09be:
            r0 = 270336742(0x101d02e6, float:3.0965023E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Object r1 = r6.A01
            X.N4t r1 = (X.N4t) r1
            com.instagram.user.model.User r1 = r1.A02()
            r1.getId()
            r1 = -730320778(0xffffffffd4783076, float:-4.26385972E12)
            goto L_0x0b91
        L_0x09d7:
            r0 = 1369081171(0x519a8553, float:8.2957722E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r6.A02
            X.MsP r3 = (X.C67687MsP) r3
            X.3UH r2 = r3.A01
            if (r2 == 0) goto L_0x09fe
            java.lang.Object r1 = r6.A01
            X.4aX r1 = (X.C266904aX) r1
            X.2ok r3 = r3.A07
            X.3UO r5 = r1.C2m()
            X.1UQ r4 = r2.B5J()
            java.lang.String r7 = r2.A0D
            java.lang.String r8 = r2.A0E
            r6 = 0
            r9 = r6
            r10 = r6
            r3.DpE(r4, r5, r6, r7, r8, r9, r10)
        L_0x09fe:
            r1 = 1860191068(0x6ee0435c, float:3.4703037E28)
            goto L_0x0b91
        L_0x0a03:
            r0 = 922665503(0x36fec21f, float:7.5923886E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A02
            X.Mmn r1 = (X.C67371Mmn) r1
            X.0sP r2 = r1.A02
            java.lang.Object r1 = r6.A01
            r2.invoke(r1)
            r1 = 962699465(0x3961a0c9, float:2.1517569E-4)
            goto L_0x0b91
        L_0x0a1a:
            r0 = 1035560506(0x3db9663a, float:0.09052701)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A02
            X.Mmm r1 = (X.C67370Mmm) r1
            X.0sP r2 = r1.A02
            java.lang.Object r1 = r6.A01
            r2.invoke(r1)
            r1 = 1234158485(0x498fc395, float:1177714.6)
            goto L_0x0b91
        L_0x0a31:
            r0 = -400952103(0xffffffffe819f4d9, float:-2.9081549E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A02
            X.Mmo r1 = (X.C67372Mmo) r1
            X.0sP r2 = r1.A02
            java.lang.Object r1 = r6.A01
            r2.invoke(r1)
            r1 = -440530798(0xffffffffe5be0892, float:-1.1217597E23)
            goto L_0x0b91
        L_0x0a48:
            r0 = 688634111(0x290bb8ff, float:3.102466E-14)
            int r0 = A00(r6, r0)
            r1 = 894130704(0x354b5a10, float:7.575445E-7)
            goto L_0x0b91
        L_0x0a54:
            r0 = -1892564617(0xffffffff8f31c177, float:-8.764034E-30)
            int r0 = A00(r6, r0)
            r1 = 1713403094(0x662074d6, float:1.8943347E23)
            goto L_0x0b91
        L_0x0a60:
            r0 = 1761259747(0x68fab0e3, float:9.470837E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r6.A02
            X.NPz r5 = (X.C68629NPz) r5
            X.HrV r3 = r5.A02
            if (r3 == 0) goto L_0x0a7a
            java.lang.Object r1 = r6.A01
            X.N61 r1 = (X.N61) r1
            java.lang.String r2 = r1.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r3.A01(r2, r1)
        L_0x0a7a:
            android.content.Context r4 = r5.A00
            com.instagram.common.session.UserSession r3 = r5.A01
            java.lang.Object r1 = r6.A01
            X.N61 r1 = (X.N61) r1
            java.lang.String r2 = r1.A02
            X.2EG r1 = X.2EG.A46
            X.Dbb.A0k(r4, r3, r1, r2)
            r1 = -1341986448(0xffffffffb002e970, float:-4.762546E-10)
            goto L_0x0b91
        L_0x0a8e:
            r0 = 1491344256(0x58e41b80, float:2.0064541E15)
            int r0 = A00(r6, r0)
            r1 = 1084778670(0x40a868ae, float:5.2627783)
            goto L_0x0b91
        L_0x0a9a:
            r0 = 1949275518(0x742f957e, float:5.5644776E31)
            int r0 = A00(r6, r0)
            r1 = 848681403(0x3295d9bb, float:1.7444895E-8)
            goto L_0x0b91
        L_0x0aa6:
            r0 = -97651772(0xfffffffffa2df3c4, float:-2.2580288E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A02
            X.OH4 r1 = (X.OH4) r1
            X.O8x r1 = r1.A04
            java.lang.Object r4 = r6.A01
            X.3sy r4 = (X.C254743sy) r4
            X.NJW r1 = r1.A00
            X.OeR r2 = r1.A06()
            boolean r1 = r4 instanceof com.instagram.model.direct.DirectThreadKey
            if (r1 == 0) goto L_0x0acc
            android.content.Context r3 = r2.A0Y
            com.instagram.common.session.UserSession r2 = r2.A0h
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r4)
            X.C71097OcX.A01(r3, r2, r1)
        L_0x0acc:
            r1 = -985794323(0xffffffffc53df8ed, float:-3039.5579)
            goto L_0x0b91
        L_0x0ad1:
            r0 = -1909829626(0xffffffff8e2a5006, float:-2.0992648E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r6.A02
            X.OH4 r1 = (X.OH4) r1
            X.O8x r1 = r1.A04
            java.lang.Object r2 = r6.A01
            X.3sy r2 = (X.C254743sy) r2
            X.NJW r1 = r1.A00
            X.OeR r1 = r1.A06()
            r1.A0k(r2)
            r1 = -452275956(0xffffffffe50ad10c, float:-4.0971426E22)
            goto L_0x0b91
        L_0x0af0:
            r0 = -1854708393(0xffffffff91736557, float:-1.9200548E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.content.Context r7 = r4.getContext()
            java.lang.Object r1 = r6.A01
            X.NOF r1 = (X.NOF) r1
            X.O8v r1 = r1.A00
            X.OeR r3 = r1.A00
            X.OTI r8 = r3.A0m
            X.2ED r1 = r3.A0j
            int r13 = r1.A05()
            X.NkF r1 = r3.A02
            X.48q r1 = r1.A02
            java.lang.String r10 = r1.A00
            java.lang.String r9 = "filter_tap"
            r11 = 0
            r12 = r11
            X.OTI.A00(r8, r9, r10, r11, r12, r13)
            android.content.Context r2 = r3.A0Y
            com.instagram.common.session.UserSession r1 = r3.A0h
            X.Dg1 r8 = new X.Dg1
            r8.<init>(r2, r1)
            X.NkF r2 = X.C69375NkF.A06
            X.NkF r1 = X.C69375NkF.A0G
            X.NkF[] r1 = new X.C69375NkF[]{r2, r1}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r1)
            java.lang.Object r1 = r6.A02
            X.Otr r1 = (X.C71966Otr) r1
            com.instagram.common.session.UserSession r4 = r1.A00
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r2.A01(r4)
            X.4Cl r1 = r1.A03
            com.instagram.api.schemas.FanClubInfoDict r1 = r1.B3v()
            if (r1 == 0) goto L_0x0b50
            java.lang.String r1 = r1.getFanClubId()
            if (r1 == 0) goto L_0x0b50
            X.NkF r1 = X.C69375NkF.A0F
            r3.add(r1)
        L_0x0b50:
            com.instagram.user.model.User r1 = r2.A01(r4)
            boolean r1 = r1.A2O()
            if (r1 == 0) goto L_0x0b69
            X.NkF r1 = X.C69375NkF.A07
            r3.add(r1)
            X.GPq r2 = new X.GPq
            r2.<init>(r4, r11)
            X.HOt r1 = X.C54688HOt.A0O
            X.C52369GPq.A01(r1, r2)
        L_0x0b69:
            java.util.Iterator r5 = r3.iterator()
        L_0x0b6d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0b86
            java.lang.Object r4 = r5.next()
            X.NkF r4 = (X.C69375NkF) r4
            int r3 = r4.A00
            r2 = 70
            X.Ok7 r1 = new X.Ok7
            r1.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r6)
            r8.A04(r1, r3)
            goto L_0x0b6d
        L_0x0b86:
            X.FFy r1 = new X.FFy
            r1.<init>(r8)
            r1.A05(r7)
            r1 = -809083990(0xffffffffcfc65baa, float:-6.6557921E9)
        L_0x0b91:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71409Ok8.onClick(android.view.View):void");
    }

    public static int A00(C71409Ok8 ok8, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((C17960Vit) ok8.A01).A00((C70826OMy) ok8.A02);
        return A05;
    }

    public C71409Ok8(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public C71409Ok8(C68177N3s n3s, C68046MzD mzD, int i) {
        this.A00 = i;
        if (20 - i != 0) {
            this.A01 = n3s;
            this.A02 = mzD;
        } else {
            this.A02 = mzD;
            this.A01 = n3s;
        }
    }
}
