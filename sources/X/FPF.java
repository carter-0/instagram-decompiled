package X;

import android.view.View;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import com.instagram.user.model.User;

public final class FPF implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FPF(E36 e36, User user, int i) {
        this.A00 = i;
        switch (i) {
            case 68:
            case 69:
                this.A01 = e36;
                this.A02 = user;
                return;
            default:
                this.A01 = e36;
                this.A02 = user;
                return;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new FPF(i, obj, obj2), view);
    }

    /* JADX WARNING: type inference failed for: r5v27, types: [java.lang.Object, X.Ebf] */
    /* JADX WARNING: type inference failed for: r2v63, types: [X.G7p, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0a07, code lost:
        X.C47579E8r.A00(r2);
        r2.FK4();
        X.E36.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0a10, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0b93, code lost:
        if (r7.A29() == false) goto L_0x0b95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x1166, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x1169, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x1199, code lost:
        r0 = "typedLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x11da, code lost:
        if (r0.booleanValue() == false) goto L_0x11dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x11ff, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x1206, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0993;
                case 1: goto L_0x0934;
                case 2: goto L_0x103d;
                case 3: goto L_0x08d7;
                case 4: goto L_0x0fca;
                case 5: goto L_0x0f68;
                case 6: goto L_0x08ae;
                case 7: goto L_0x0ecc;
                case 8: goto L_0x0875;
                case 9: goto L_0x0e83;
                case 10: goto L_0x119c;
                case 11: goto L_0x0827;
                case 12: goto L_0x07ff;
                case 13: goto L_0x07d7;
                case 14: goto L_0x078d;
                case 15: goto L_0x076e;
                case 16: goto L_0x0e22;
                case 17: goto L_0x0ddd;
                case 18: goto L_0x0748;
                case 19: goto L_0x0d97;
                case 20: goto L_0x0d2f;
                case 21: goto L_0x112b;
                case 22: goto L_0x0712;
                case 23: goto L_0x06e6;
                case 24: goto L_0x0cc6;
                case 25: goto L_0x10bc;
                case 26: goto L_0x06b0;
                case 27: goto L_0x067a;
                case 28: goto L_0x0663;
                case 29: goto L_0x064c;
                case 30: goto L_0x0635;
                case 31: goto L_0x0614;
                case 32: goto L_0x05fd;
                case 33: goto L_0x05e6;
                case 34: goto L_0x05cf;
                case 35: goto L_0x0c22;
                case 36: goto L_0x05b8;
                case 37: goto L_0x05a1;
                case 38: goto L_0x0bf9;
                case 39: goto L_0x058a;
                case 40: goto L_0x0573;
                case 41: goto L_0x055c;
                case 42: goto L_0x0b61;
                case 43: goto L_0x0519;
                case 44: goto L_0x04fd;
                case 45: goto L_0x04df;
                case 46: goto L_0x04ba;
                case 47: goto L_0x0499;
                case 48: goto L_0x0478;
                case 49: goto L_0x0461;
                case 50: goto L_0x042e;
                case 51: goto L_0x0b15;
                case 52: goto L_0x03f1;
                case 53: goto L_0x03d2;
                case 54: goto L_0x0388;
                case 55: goto L_0x0362;
                case 56: goto L_0x031f;
                case 57: goto L_0x02b7;
                case 58: goto L_0x028a;
                case 59: goto L_0x023d;
                case 60: goto L_0x0abb;
                case 61: goto L_0x01be;
                case 62: goto L_0x0a8c;
                case 63: goto L_0x01a0;
                case 64: goto L_0x00bc;
                case 65: goto L_0x0a11;
                case 66: goto L_0x0036;
                case 67: goto L_0x0020;
                case 68: goto L_0x09f7;
                case 69: goto L_0x09e6;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = -501815376(0xffffffffe216e7b0, float:-6.959266E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E36 r2 = (X.E36) r2
            java.lang.Object r0 = r0.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.A03(r0)
            r0 = 2147204115(0x7ffbbc13, float:NaN)
        L_0x001c:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0020:
            r1 = 674994571(0x283b998b, float:1.041388E-14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.FGY r2 = (X.FGY) r2
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.FGY.A00(r0, r2)
            r0 = 123022072(0x7552af8, float:1.6036966E-34)
            goto L_0x001c
        L_0x0036:
            r1 = 168384916(0xa095994, float:6.613158E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            com.instagram.newsfeed.fragment.NewsfeedFragment r5 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r5
            java.lang.Object r3 = r0.A01
            X.DdJ r3 = (X.C46356DdJ) r3
            java.util.List r6 = r3.A03()
            java.util.List r7 = r3.A01()
            boolean r0 = X.0qQ.A0K(r6, r7)
            if (r0 != 0) goto L_0x00a9
            X.0eM r2 = r5.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.Dd0 r0 = X.C46354Dcy.A01(r0)
            java.util.HashSet r0 = r0.A01
            r0.clear()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.DgJ r0 = X.C46512DgF.A00(r0)
            java.util.List r4 = r3.A02()
            com.instagram.common.session.UserSession r2 = r0.A01
            X.0xG r0 = r0.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r2)
            java.lang.String r0 = "instagram_af_filter_events_v2"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r2 = "filters_applied"
            java.lang.String r0 = "event_name"
            r3.AAJ(r0, r2)
            if (r7 != 0) goto L_0x0087
            X.0sn r7 = X.0sn.A00
        L_0x0087:
            java.lang.String r0 = "current_filters"
            r3.AAe(r0, r7)
            if (r6 != 0) goto L_0x0090
            X.0sn r6 = X.0sn.A00
        L_0x0090:
            java.lang.String r0 = "clicked_filters"
            r3.AAe(r0, r6)
            if (r4 != 0) goto L_0x0099
            X.0sn r4 = X.0sn.A00
        L_0x0099:
            java.lang.String r0 = "filters"
            r3.AAe(r0, r4)
            r3.Cgf()
            X.Dcv r2 = r5.A05
            if (r2 == 0) goto L_0x00a9
            r0 = 1
            r2.A07(r0)
        L_0x00a9:
            android.view.View r4 = r5.requireView()
            X.Fql r0 = new X.Fql
            r0.<init>(r5)
            r2 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r0, r2)
            r0 = 1308588595(0x4dff7a33, float:5.35774816E8)
            goto L_0x001c
        L_0x00bc:
            r1 = 1480434265(0x583da259, float:8.340199E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            com.instagram.newsfeed.fragment.NewsfeedFragment r7 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r7
            java.lang.Object r4 = r0.A01
            X.DdJ r4 = (X.C46356DdJ) r4
            android.content.Context r6 = r7.getContext()
            if (r6 == 0) goto L_0x0198
            X.ERZ r0 = r7.A04
            if (r0 != 0) goto L_0x0116
            X.0hq r0 = r7.getChildFragmentManager()
            X.06E r3 = r0.A0S()
            java.lang.ClassLoader r2 = r6.getClassLoader()
            java.lang.Class<X.ERZ> r0 = X.ERZ.class
            java.lang.String r0 = r0.getName()
            androidx.fragment.app.Fragment r3 = r3.A01(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.newsfeed.fragment.NewsfeedFilterSelectorFragment"
            X.0qQ.A0C(r3, r0)
            X.ERZ r3 = (X.ERZ) r3
            r7.A04 = r3
            if (r3 == 0) goto L_0x0101
            X.Dcv r2 = r7.A05
            r0 = 0
            if (r2 == 0) goto L_0x00ff
            X.DdJ r0 = X.C46353Dcx.A01(r2)
        L_0x00ff:
            r3.A01 = r0
        L_0x0101:
            X.ERZ r3 = r7.A04
            if (r3 == 0) goto L_0x0116
            X.Dcv r0 = r7.A05
            if (r0 == 0) goto L_0x019d
            X.DdJ r2 = X.C46353Dcx.A01(r0)
            if (r2 == 0) goto L_0x019d
            X.F21 r0 = new X.F21
            r0.<init>(r7, r2)
        L_0x0114:
            r3.A00 = r0
        L_0x0116:
            X.0eM r5 = r7.A0A
            X.7Pr r3 = X.DbX.A0f(r5)
            r0 = 2131968325(0x7f134145, float:1.9573541E38)
            java.lang.CharSequence r0 = r7.getText(r0)
            r3.A0d = r0
            r0 = 0
            X.7Pt r0 = com.instagram.newsfeed.fragment.NewsfeedFragment.A00(r7, r4, r0)
            r3.A0R = r0
            r0 = 2131968323(0x7f134143, float:1.9573537E38)
            java.lang.String r0 = r7.getString(r0)
            r3.A0g = r0
            r2 = 66
            X.FPF r0 = new X.FPF
            r0.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r7)
            r3.A0K = r0
            r2 = 1
            r3.A0v = r2
            X.7Pu r0 = r3.A00()
            r7.A03 = r0
            r0.A0Q(r2)
            X.7Pu r3 = r7.A03
            if (r3 == 0) goto L_0x0158
            X.ERZ r2 = r7.A04
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.Fragment"
            X.0qQ.A0C(r2, r0)
            r3.A03(r6, r2)
        L_0x0158:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.DgJ r0 = X.C46512DgF.A00(r0)
            java.util.List r5 = r4.A01()
            java.util.List r4 = r4.A02()
            com.instagram.common.session.UserSession r2 = r0.A01
            X.0xG r0 = r0.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r2)
            java.lang.String r0 = "instagram_af_filter_events_v2"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r2 = "menu_impression"
            java.lang.String r0 = "event_name"
            r3.AAJ(r0, r2)
            if (r5 != 0) goto L_0x0181
            X.0sn r5 = X.0sn.A00
        L_0x0181:
            java.lang.String r0 = "current_filters"
            r3.AAe(r0, r5)
            X.0sn r2 = X.0sn.A00
            java.lang.String r0 = "clicked_filters"
            r3.AAe(r0, r2)
            if (r4 != 0) goto L_0x0190
            r4 = r2
        L_0x0190:
            java.lang.String r0 = "filters"
            r3.AAe(r0, r4)
            r3.Cgf()
        L_0x0198:
            r0 = -271150011(0xffffffffefd69445, float:-1.3281808E29)
            goto L_0x001c
        L_0x019d:
            r0 = 0
            goto L_0x0114
        L_0x01a0:
            r1 = 1010310184(0x3c381c28, float:0.011237182)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.FV7 r2 = (X.FV7) r2
            java.lang.Object r0 = r0.A01
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            X.0qQ.A06(r0)
            X.EWQ r0 = (X.EWQ) r0
            r2.A04(r0)
            r0 = -536655911(0xffffffffe00347d9, float:-3.7839073E19)
            goto L_0x001c
        L_0x01be:
            r1 = 1658718604(0x62de098c, float:2.0479326E21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.E6S r5 = (X.E6S) r5
            java.lang.Object r8 = r0.A01
            com.instagram.common.session.UserSession r0 = r5.A02
            X.35F r6 = new X.35F
            r6.<init>(r0)
            X.0wc r2 = r6.A00
            java.lang.String r0 = "ig4a_ndx_request"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r2 = "multiple_account"
            java.lang.String r0 = "flow_name"
            r3.AAJ(r0, r2)
            r0 = 890(0x37a, float:1.247E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbY.A1F(r3, r0)
            java.lang.String r0 = "NDX_IG4A_MA_FEATURE"
            X.DbV.A1K(r3, r0)
            X.EuV r10 = new X.EuV
            r10.<init>()
            X.08y r0 = X.09i.A0A
            X.0aP r9 = r0.A03(r5)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            android.content.Context r3 = r5.A00
            r5 = 3
            X.0qQ.A0B(r3, r5)
            r12 = 0
            X.6ST r7 = X.DbV.A0h(r3)
            android.content.res.Resources r2 = r3.getResources()
            r0 = 2131965555(0x7f133673, float:1.9567923E38)
            java.lang.String r0 = r2.getString(r0)
            r7.A00(r0)
            X.AnonymousClass0fN.A00(r7)
            X.12T r2 = X.AnonymousClass12T.A00
            r0 = 1638176555(0x61a4972b, float:3.7951985E20)
            X.0nV r0 = r2.AOJ(r0, r5)
            X.19S r2 = X.19E.A02(r0)
            r0 = 37
            X.MPB r11 = new X.MPB
            r11.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r3)
            r13 = 19
            X.JTw r5 = new X.JTw
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.AnonymousClass7TE.A1Z(r5, r2)
            r0 = 47770357(0x2d8eaf5, float:3.1873206E-37)
            goto L_0x001c
        L_0x023d:
            r1 = -1669264613(0xffffffff9c810b1b, float:-8.539375E-22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.E2Y r5 = (X.E2Y) r5
            X.0eM r2 = r5.A03
            X.2YL r4 = X.DbS.A0H(r2)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 22
            X.C51645Fy4.A01(r4, r3, r2)
            X.0eM r2 = r5.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Object r0 = r0.A01
            X.4DH r0 = (X.AnonymousClass4DH) r0
            X.0wc r2 = X.DbX.A0O(r0, r4)
            java.lang.String r0 = "ig_branded_content_opt_in_request_sent"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            X.16V r0 = r0.A0J()
            if (r0 != 0) goto L_0x0277
            X.16V r0 = X.16V.A08
        L_0x0277:
            int r0 = r0.A00
            java.lang.Long r2 = X.DbS.A0j(r0)
            java.lang.String r0 = "account_type"
            r3.A9F(r0, r2)
            r3.Cgf()
            r0 = -1357454210(0xffffffffaf16e47e, float:-1.3723597E-10)
            goto L_0x001c
        L_0x028a:
            r1 = 1474201242(0x57de869a, float:4.89339381E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.EFu r2 = (X.C47760EFu) r2
            X.K4C r2 = r2.A00
            java.lang.Object r0 = r0.A01
            X.FYF r0 = (X.FYF) r0
            X.0sa r4 = r0.A02
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x02b2
            X.37D r3 = X.DbT.A0i(r0)
            if (r3 == 0) goto L_0x02b2
            r2 = 6
            X.FmI r0 = new X.FmI
            r0.<init>(r4, r2)
            X.DbU.A1U(r0, r3, r3)
        L_0x02b2:
            r0 = 822904358(0x310c8626, float:2.0448936E-9)
            goto L_0x001c
        L_0x02b7:
            r1 = 986153030(0x3ac78046, float:0.0015220724)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.E2J r4 = (X.E2J) r4
            java.lang.Object r2 = r0.A02
            com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount r2 = (com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount) r2
            android.content.Context r6 = r4.getContext()
            X.0aP r0 = r4.A00
            java.lang.String r2 = r2.A02
            boolean r5 = r4.A03
            X.1NY r3 = X.DbU.A0N(r0)
            java.lang.String r0 = "accounts/assisted_account_recovery/"
            r3.A0A(r0)
            X.DbS.A1P(r3, r2)
            java.lang.String r2 = X.0qv.A00(r6)
            java.lang.String r0 = X.Dbq.A04()
            X.DbZ.A0y(r6, r3, r0, r2)
            java.lang.String r2 = "multi_account"
            java.lang.String r0 = "source"
            r3.A9m(r0, r2)
            java.lang.String r0 = "present_as_modal"
            r3.A0H(r0, r5)
            java.lang.Class<X.DwI> r2 = X.DwI.class
            java.lang.Class<X.F66> r0 = X.F66.class
            r3.A0R(r2, r0)
            X.4ro r0 = new X.4ro
            r0.<init>()
            java.lang.String r2 = "vetted_device_nonces"
            java.lang.String r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x030a
            r3.A9m(r2, r0)
        L_0x030a:
            X.1OC r3 = X.DbW.A0K(r3)
            X.0aP r2 = r4.A00
            X.EQR r0 = new X.EQR
            r0.<init>(r4, r2)
            r3.A00 = r0
            r4.schedule(r3)
            r0 = -959659223(0xffffffffc6ccc329, float:-26209.58)
            goto L_0x001c
        L_0x031f:
            r1 = -353482511(0xffffffffeaee48f1, float:-1.440344E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.E6B r5 = (X.E6B) r5
            java.lang.Object r3 = r0.A02
            com.instagram.login.twofac.model.TrustedDevice r3 = (com.instagram.login.twofac.model.TrustedDevice) r3
            r0 = 0
            r5.A00 = r3
            X.FFR.A03()
            X.0eM r4 = r5.A03
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r4, r0)
            android.os.Bundle r2 = X.DbY.A09(r0)
            java.lang.String r0 = "trusted_device"
            r2.putParcelable(r0, r3)
            X.E0z r3 = new X.E0z
            r3.<init>()
            r3.setArguments(r2)
            X.7Pr r2 = X.DbX.A0f(r4)
            r0 = 2131975784(0x7f135e68, float:1.958867E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0d = r0
            r2.A0T = r5
            X.DbY.A13(r5, r3, r2)
            r0 = 1311164480(0x4e26c840, float:6.9953536E8)
            goto L_0x001c
        L_0x0362:
            r1 = -873446734(0xffffffffcbf042b2, float:-3.1491428E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.F3Y r4 = X.FFR.A00()
            java.lang.Object r3 = r0.A01
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2 = 0
            X.E4T r3 = r4.A00(r3, r2)
            java.lang.Object r0 = r0.A02
            X.ES6 r0 = (X.ES6) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A01
            X.Dbc.A0S(r3, r2, r0)
            r0 = 1704664950(0x659b1f76, float:9.1568395E22)
            goto L_0x001c
        L_0x0388:
            r1 = 1738444417(0x679e8e81, float:1.4975253E24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.FFR.A03()
            java.lang.Object r6 = r0.A02
            X.ESD r6 = (X.ESD) r6
            android.os.Bundle r2 = r6.requireArguments()
            X.E4Y r5 = new X.E4Y
            r5.<init>()
            r5.setArguments(r2)
            android.os.Bundle r4 = r6.A00
            if (r4 != 0) goto L_0x03aa
            java.lang.String r0 = "twoFacResponseBundle"
            goto L_0x11ff
        L_0x03aa:
            java.lang.Object r3 = r0.A01
            com.instagram.login.twofac.model.TotpSeed r3 = (com.instagram.login.twofac.model.TotpSeed) r3
            r2 = 1
            java.lang.String r0 = "is_renaming"
            r4.putBoolean(r0, r2)
            java.lang.String r2 = r3.A01
            java.lang.String r0 = X.Dbb.A0V()
            r4.putString(r0, r2)
            java.lang.String r2 = r3.A02
            java.lang.String r0 = "rename_totp_seed_id"
            r4.putString(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r4, r5, r6)
            X.0eM r0 = r6.A02
            X.Dbc.A0S(r5, r2, r0)
            r0 = -165217960(0xfffffffff626f958, float:-8.4665876E32)
            goto L_0x001c
        L_0x03d2:
            r1 = -548362031(0xffffffffdf50a8d1, float:-1.5035497E19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.1xC r4 = X.1xC.A01
            java.lang.Object r3 = r0.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.FVl r2 = new X.FVl
            r2.<init>(r3)
            r4.A00(r2)
            java.lang.Object r0 = r0.A02
            X.Dba.A1Q(r0)
            r0 = 857766141(0x332078fd, float:3.736294E-8)
            goto L_0x001c
        L_0x03f1:
            r1 = -1322014565(0xffffffffb133a89b, float:-2.614377E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = (com.instagram.ui.widget.progressbutton.ProgressButton) r3
            r2 = 1
            r3.setShowProgressBar(r2)
            java.lang.Object r3 = r0.A02
            X.E2M r3 = (X.E2M) r3
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A15
            com.instagram.igds.components.form.IgFormField r0 = r3.A00
            if (r0 != 0) goto L_0x0414
            java.lang.String r0 = "emailFormField"
            goto L_0x11ff
        L_0x0414:
            java.lang.String r7 = X.DbU.A0o(r0)
            android.content.Context r4 = r3.requireContext()
            r8 = 0
            r9 = r8
            X.1OC r2 = X.C318486p2.A03(r4, r5, r6, r7, r8, r9)
            X.EDi r0 = r3.A04
            r2.A00 = r0
            r3.schedule(r2)
            r0 = 609154846(0x244ef71e, float:4.4878446E-17)
            goto L_0x001c
        L_0x042e:
            r1 = 777022521(0x2e506c39, float:4.7389846E-11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.DbT.A15()
            java.lang.Object r2 = r0.A02
            X.DwU r2 = (X.DwU) r2
            java.util.ArrayList r3 = r2.A04
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "backup_codes_key"
            r4.putStringArrayList(r2, r3)
            X.ESR r3 = new X.ESR
            r3.<init>()
            r3.setArguments(r4)
            java.lang.Object r0 = r0.A01
            X.ESN r0 = (X.ESN) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A01
            X.Dbb.A12(r3, r2, r0)
            r0 = -403571095(0xffffffffe7f1fe69, float:-2.2855667E24)
            goto L_0x001c
        L_0x0461:
            r1 = -2124629127(0xffffffff815cbb79, float:-4.0542123E-38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.70R r2 = (X.AnonymousClass70R) r2
            java.lang.Object r0 = r0.A02
            X.JwK r0 = (X.C61082JwK) r0
            r2.DLC(r0)
            r0 = -624615256(0xffffffffdac520a8, float:-2.77432382E16)
            goto L_0x001c
        L_0x0478:
            r1 = 146972281(0x8c29e79, float:1.1713207E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.2YL r6 = (X.2YL) r6
            X.6oS r5 = X.C318116oQ.A00(r6)
            java.lang.Object r4 = r0.A01
            r3 = 0
            r2 = 35
            X.MH0 r0 = new X.MH0
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r6, (X.AnonymousClass4D7) r3, (int) r2)
            X.AnonymousClass7TE.A1Z(r0, r5)
            r0 = 1994430352(0x76e09790, float:2.2776339E33)
            goto L_0x001c
        L_0x0499:
            r1 = 739797928(0x2c186ba8, float:2.166026E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.2YL r6 = (X.2YL) r6
            X.6oS r5 = X.C318116oQ.A00(r6)
            java.lang.Object r4 = r0.A01
            r3 = 0
            r2 = 34
            X.MH0 r0 = new X.MH0
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r6, (X.AnonymousClass4D7) r3, (int) r2)
            X.AnonymousClass7TE.A1Z(r0, r5)
            r0 = 1175927651(0x46173b63, float:9678.847)
            goto L_0x001c
        L_0x04ba:
            r1 = -1353542199(0xffffffffaf5295c9, float:-1.9152603E-10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            android.content.DialogInterface$OnClickListener r4 = (android.content.DialogInterface.OnClickListener) r4
            if (r4 == 0) goto L_0x04d1
            java.lang.Object r2 = r0.A01
            X.Dfy r2 = (X.C46495Dfy) r2
            android.app.Dialog r3 = r2.A00
            r2 = -2
            r4.onClick(r3, r2)
        L_0x04d1:
            java.lang.Object r0 = r0.A01
            X.Dfy r0 = (X.C46495Dfy) r0
            android.app.Dialog r0 = r0.A00
            r0.dismiss()
            r0 = 1124252098(0x4302b9c2, float:130.72562)
            goto L_0x001c
        L_0x04df:
            r1 = 1847585649(0x6e1feb71, float:1.2373187E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Exk r2 = (X.C49549Exk) r2
            X.0sa r2 = r2.A01
            r2.invoke()
            java.lang.Object r0 = r0.A02
            X.8ab r0 = (X.C358248ab) r0
            android.app.Dialog r0 = r0.A0P
            r0.dismiss()
            r0 = -1654383159(0xffffffff9d641dc9, float:-3.0190947E-21)
            goto L_0x001c
        L_0x04fd:
            r1 = -268742818(0xffffffffeffb4f5e, float:-1.5555337E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.FFy r3 = (X.C49945FFy) r3
            r2 = -1
            r3.A00 = r2
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r3.A01 = r0
            r3.A02()
            r0 = -1867962549(0xffffffff90a9274b, float:-6.6719287E-29)
            goto L_0x001c
        L_0x0519:
            r1 = -1761674318(0xffffffff96fefbb2, float:-4.1194755E-25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.WXf r2 = (X.C19388WXf) r2
            java.lang.Object r6 = r0.A02
            com.instagram.model.hashtag.Hashtag r6 = (com.instagram.model.hashtag.Hashtag) r6
            java.lang.Object r5 = r2.A01
            X.E6R r5 = (X.E6R) r5
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            com.instagram.common.session.UserSession r0 = r5.A01
            if (r0 != 0) goto L_0x0538
            java.lang.String r0 = "viewerUserSession"
            goto L_0x11ff
        L_0x0538:
            X.6Yo r4 = X.DbS.A0M(r2, r0)
            com.instagram.common.session.UserSession r3 = r5.A00
            if (r3 != 0) goto L_0x0544
            java.lang.String r0 = "userSession"
            goto L_0x11ff
        L_0x0544:
            java.lang.String r2 = "following_hashtags"
            java.lang.String r0 = "DEFAULT"
            androidx.fragment.app.Fragment r0 = X.W0l.A02(r3, r6, r2, r0)
            r4.A0D(r0)
            r0 = 1
            r4.A0F = r0
            r4.A09 = r5
            r4.A04()
            r0 = 1275978262(0x4c0de216, float:3.7193816E7)
            goto L_0x001c
        L_0x055c:
            r1 = -1417155337(0xffffffffab87ecf7, float:-9.658098E-13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7T r2 = (X.E7T) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            r2.A0D(r0)
            r0 = -1335369591(0xffffffffb067e089, float:-8.4356394E-10)
            goto L_0x001c
        L_0x0573:
            r1 = 1217016745(0x488a33a9, float:283037.28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7T r2 = (X.E7T) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            r2.A0D(r0)
            r0 = 440996896(0x1a491420, float:4.1582083E-23)
            goto L_0x001c
        L_0x058a:
            r1 = 1796018008(0x6b0d0f58, float:1.70531E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7T r2 = (X.E7T) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            r2.A0D(r0)
            r0 = -59549026(0xfffffffffc735a9e, float:-5.0542643E36)
            goto L_0x001c
        L_0x05a1:
            r1 = 227762086(0xd935fa6, float:9.082601E-31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7Y r2 = (X.E7Y) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassViewModel r0 = (com.instagram.hallpass.model.HallPassViewModel) r0
            r2.A0D(r0)
            r0 = 1149528023(0x448467d7, float:1059.245)
            goto L_0x001c
        L_0x05b8:
            r1 = -1556119792(0xffffffffa33f7f10, float:-1.0381037E-17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7Y r2 = (X.E7Y) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassViewModel r0 = (com.instagram.hallpass.model.HallPassViewModel) r0
            r2.A0D(r0)
            r0 = -55612063(0xfffffffffcaf6d61, float:-7.2869633E36)
            goto L_0x001c
        L_0x05cf:
            r1 = -72026640(0xfffffffffbb4f5f0, float:-1.8792033E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7S r2 = (X.E7S) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            r2.A0D(r0)
            r0 = 15791734(0xf0f676, float:2.2128933E-38)
            goto L_0x001c
        L_0x05e6:
            r1 = 1714553479(0x66320287, float:2.1015696E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7S r2 = (X.E7S) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            r2.A0D(r0)
            r0 = -256831304(0xfffffffff0b110b8, float:-4.3839247E29)
            goto L_0x001c
        L_0x05fd:
            r1 = 1230420396(0x4956b9ac, float:879514.75)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7S r2 = (X.E7S) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            r2.A0D(r0)
            r0 = -531367467(0xffffffffe053f9d5, float:-6.1097895E19)
            goto L_0x001c
        L_0x0614:
            r1 = 1297599966(0x4d57cdde, float:2.26287072E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7Y r2 = (X.E7Y) r2
            java.lang.Object r3 = r0.A02
            com.instagram.hallpass.model.HallPassViewModel r3 = (com.instagram.hallpass.model.HallPassViewModel) r3
            X.0eM r0 = r2.A0E
            java.lang.Object r2 = r0.getValue()
            X.Dkr r2 = (X.C46764Dkr) r2
            java.lang.String r0 = r3.A04
            r2.A00(r0)
            r0 = -1793997281(0xffffffff9511c61f, float:-2.9438807E-26)
            goto L_0x001c
        L_0x0635:
            r1 = -1681822226(0xffffffff9bc16dee, float:-3.2000212E-22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7Y r2 = (X.E7Y) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassViewModel r0 = (com.instagram.hallpass.model.HallPassViewModel) r0
            r2.A0C(r0)
            r0 = 2026842043(0x78cf27bb, float:3.3612852E34)
            goto L_0x001c
        L_0x064c:
            r1 = -959273402(0xffffffffc6d2a646, float:-26963.137)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7Y r2 = (X.E7Y) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassViewModel r0 = (com.instagram.hallpass.model.HallPassViewModel) r0
            r2.A0C(r0)
            r0 = 1013751486(0x3c6c9ebe, float:0.014442144)
            goto L_0x001c
        L_0x0663:
            r1 = -1318339080(0xffffffffb16bbdf8, float:-3.4304986E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.E7Y r2 = (X.E7Y) r2
            java.lang.Object r0 = r0.A02
            com.instagram.hallpass.model.HallPassViewModel r0 = (com.instagram.hallpass.model.HallPassViewModel) r0
            r2.A0C(r0)
            r0 = 77986591(0x4a5fb1f, float:3.9021932E-36)
            goto L_0x001c
        L_0x067a:
            r1 = -1379652908(0xffffffffadc42ad4, float:-2.230164E-11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.E64 r6 = (X.E64) r6
            android.content.Context r2 = r6.requireContext()
            X.0eM r5 = r6.A0G
            X.Dg1 r4 = X.C46498Dg1.A00(r2, r5)
            r3 = 2131963267(0x7f132d83, float:1.9563283E38)
            r2 = 43
            X.FP1 r2 = X.FP1.A00(r6, r2)
            r4.A02(r2, r3)
            java.lang.Object r0 = r0.A01
            X.7Pu r0 = (X.C331157Pu) r0
            X.FFy r2 = new X.FFy
            r2.<init>(r4, r0)
            X.7Pr r0 = X.DbX.A0f(r5)
            r2.A06(r0)
            r0 = -1159062600(0xffffffffbaea1bb8, float:-0.0017861044)
            goto L_0x001c
        L_0x06b0:
            r1 = 454245315(0x1b133bc3, float:1.2178865E-22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.1Z4 r4 = X.1Z4.A00
            java.lang.Object r3 = r0.A02
            X.E7T r3 = (X.E7T) r3
            android.content.Context r5 = r3.requireContext()
            X.0eM r2 = r3.A0A
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            java.lang.String r10 = "hall_pass_member_list"
            java.lang.Object r2 = r0.A01
            com.instagram.hallpass.model.HallPassMemberViewModel r2 = (com.instagram.hallpass.model.HallPassMemberViewModel) r2
            com.instagram.user.model.User r8 = r2.A00
            r0 = 1
            X.Fnc r9 = new X.Fnc
            r9.<init>(r0, r3, r2)
            java.lang.String r12 = r8.getUsername()
            r11 = 0
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1796011764(0xffffffff94f3090c, float:-2.4540298E-26)
            goto L_0x001c
        L_0x06e6:
            r1 = -525358397(0xffffffffe0afaac3, float:-1.0126515E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.E7S r2 = (X.E7S) r2
            java.lang.Object r0 = r0.A01
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            com.instagram.user.model.User r5 = r0.A00
            r0 = 17
            X.EDV r4 = new X.EDV
            r4.<init>(r0, r5, r2)
            android.content.Context r3 = r2.requireContext()
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "campfire_member_list_menu_option"
            X.FH6.A09(r3, r4, r2, r5, r0)
            r0 = 1778095112(0x69fb9408, float:3.801743E25)
            goto L_0x001c
        L_0x0712:
            r1 = -322906617(0xffffffffecc0d607, float:-1.8649958E27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.E7S r3 = (X.E7S) r3
            java.lang.Object r2 = r0.A01
            com.instagram.hallpass.model.HallPassMemberViewModel r2 = (com.instagram.hallpass.model.HallPassMemberViewModel) r2
            X.1Z4 r4 = X.1Z4.A00
            android.content.Context r5 = r3.requireContext()
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            java.lang.String r10 = "campfire_member_list"
            com.instagram.user.model.User r8 = r2.A00
            r0 = 0
            X.Fnc r9 = new X.Fnc
            r9.<init>(r0, r3, r2)
            java.lang.String r12 = r8.getUsername()
            r11 = 0
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 1456022449(0x56c923b1, float:1.10577565E14)
            goto L_0x001c
        L_0x0748:
            r1 = 1225481827(0x490b5e63, float:570854.2)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.ToY r4 = (X.C14032ToY) r4
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r4.getBindingAdapterPosition()
            java.lang.Object r3 = r0.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            android.view.View r0 = r4.A00
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r0)
            boolean r0 = r3.A20()
            X.C48752Ejb.A00(r2, r0)
            r0 = -33551230(0xfffffffffe000c82, float:-4.255153E37)
            goto L_0x001c
        L_0x076e:
            r1 = 605805859(0x241bdd23, float:3.3797577E-17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.DoI r3 = (X.C46964DoI) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.E7I r3 = r3.A01
            java.lang.Object r2 = r0.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.E7I.A00(r3, r2)
            r0 = -501816980(0xffffffffe216e16c, float:-6.9581374E20)
            goto L_0x001c
        L_0x078d:
            r1 = 77613452(0x4a0498c, float:3.768336E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.E7M r5 = (X.E7M) r5
            X.0eM r8 = r5.A01
            X.7Pr r4 = X.DbX.A0f(r8)
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            r4.A0a = r2
            android.content.res.Resources r3 = X.DbV.A05(r5)
            r2 = 2131967904(0x7f133fa0, float:1.9572688E38)
            X.DbT.A1C(r3, r4, r2)
            X.7Pu r7 = r4.A00()
            androidx.fragment.app.FragmentActivity r6 = r5.requireActivity()
            X.1a1 r5 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r8)
            java.lang.Object r0 = r0.A01
            java.lang.String r3 = X.DbS.A0q(r0)
            X.FnS r2 = new X.FnS
            r2.<init>()
            java.lang.String r0 = "self_subscribed"
            X.E22 r0 = r5.A08(r4, r2, r3, r0)
            r7.A02(r6, r0)
            r0 = 124827691(0x770b82b, float:1.8109715E-34)
            goto L_0x001c
        L_0x07d7:
            r1 = 942446516(0x382c97b4, float:4.114928E-5)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.E7M r2 = (X.E7M) r2
            X.0eM r2 = r2.A02
            X.2YL r4 = X.DbS.A0H(r2)
            java.lang.Object r3 = r0.A01
            r7 = 1
            X.6oS r0 = X.C318116oQ.A00(r4)
            r5 = 0
            r6 = 14
            X.JTe r2 = new X.JTe
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = -279402928(0xffffffffef58a650, float:-6.704982E28)
            goto L_0x001c
        L_0x07ff:
            r1 = 627264246(0x25634af6, float:1.9714509E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.E7M r2 = (X.E7M) r2
            X.0eM r2 = r2.A02
            X.2YL r4 = X.DbS.A0H(r2)
            java.lang.Object r3 = r0.A01
            r7 = 0
            X.6oS r0 = X.C318116oQ.A00(r4)
            r5 = 0
            r6 = 14
            X.JTe r2 = new X.JTe
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 252710919(0xf101007, float:7.102835E-30)
            goto L_0x001c
        L_0x0827:
            r1 = -1562818307(0xffffffffa2d948fd, float:-5.8895247E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Dnt r3 = (X.C46939Dnt) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.F1k r2 = r3.A00
            java.lang.Object r5 = r0.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            X.E7M r2 = r2.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.E7M.A01(r2, r5, r0)
            X.1Yy r6 = X.FC8.A01()
            androidx.fragment.app.FragmentActivity r7 = r2.requireActivity()
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r11 = r5.getId()
            java.lang.String r12 = X.E7M.A00(r5)
            r9 = 0
            r10 = r9
            r6.A04(r7, r8, r9, r10, r11, r12)
            X.0eM r0 = r2.A02
            X.2YL r4 = X.DbS.A0H(r0)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 35
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r9, (int) r2)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = -1218940380(0xffffffffb7587224, float:-1.2901179E-5)
            goto L_0x001c
        L_0x0875:
            r1 = 2119733711(0x7e5891cf, float:7.196758E37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r4 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r4
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            X.1Yy r2 = X.FC8.A01()
            com.instagram.common.session.UserSession r0 = r4.A03
            r2.A02(r3, r0)
            X.4lm r2 = r4.A04
            java.lang.String r0 = r4.A0A
            long r3 = java.lang.Long.parseLong(r0)
            X.0wc r2 = r2.A00
            java.lang.String r0 = "ig_digital_fan_club_share_as_story_sticker_click"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dbb.A1D(r2, r0, r3)
            r2.Cgf()
            r0 = 1138547679(0x43dcdbdf, float:441.71774)
            goto L_0x001c
        L_0x08ae:
            r1 = 1295385215(0x4d36027f, float:1.90851056E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.E4b r2 = (X.C47477E4b) r2
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r3 = X.C47477E4b.A00(r2)
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            java.lang.Object r0 = r0.A01
            X.EKM r0 = (X.EKM) r0
            java.lang.String r5 = r0.A07
            java.lang.String r6 = r0.A08
            java.lang.String r7 = r0.A0A
            java.lang.String r8 = r0.A0B
            boolean r9 = r0.A0I
            r3.A0E(r4, r5, r6, r7, r8, r9)
            r0 = 1873664502(0x6fadd9f6, float:1.0760881E29)
            goto L_0x001c
        L_0x08d7:
            r1 = -767691801(0xffffffffd23df3e7, float:-2.03960205E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            X.E4b r7 = (X.C47477E4b) r7
            X.0eM r2 = r7.A0N
            java.lang.Object r3 = r2.getValue()
            X.4lm r3 = (X.C273004lm) r3
            X.0eM r2 = r7.A0K
            java.lang.String r5 = X.DbW.A0l(r2)
            X.0eM r6 = r7.A0M
            java.lang.String r4 = X.DbW.A0l(r6)
            X.0wc r3 = r3.A00
            java.lang.String r2 = "ig_fan_club_customized_benefits_subscription_management_customize_button_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            r2 = 142(0x8e, float:1.99E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.DbS.A1O(r3, r2)
            X.DbY.A1G(r3, r5)
            java.lang.String r2 = "origin"
            r3.AAJ(r2, r4)
            r3.Cgf()
            X.1Yy r5 = X.FC8.A01()
            androidx.fragment.app.FragmentActivity r4 = r7.requireActivity()
            X.0eM r2 = r7.A0O
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r2 = X.DbW.A0l(r6)
            java.lang.Object r0 = r0.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            r5.A05(r4, r3, r2, r0)
            r0 = -1569491641(0xffffffffa2737547, float:-3.2994727E-18)
            goto L_0x001c
        L_0x0934:
            r1 = -1116478736(0xffffffffbd73e2f0, float:-0.059542596)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.WGR r2 = (X.WGR) r2
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r9 = r2.A02
            androidx.fragment.app.FragmentActivity r5 = r9.requireActivity()
            X.0hq r6 = r9.getParentFragmentManager()
            java.lang.Object r0 = r0.A02
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            X.0gy r7 = X.AnonymousClass07i.A00(r9)
            com.instagram.common.session.UserSession r10 = r2.A00
            com.instagram.model.venue.LocationDictIntf r2 = r0.A00
            java.lang.String r21 = r2.getName()
            r2 = 3544(0xdd8, float:4.966E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r2)
            r12 = 0
            X.0Tu r4 = X.0Tu.A05
            r2 = 36314859024616287(0x81042c003b0b5f, double:3.0290013031429846E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r4, r10, r2)
            boolean r23 = r2.booleanValue()
            java.lang.String r14 = r0.A05()
            java.lang.Boolean r11 = X.DbT.A0l(r23)
            r22 = 1
            X.FT6 r8 = new X.FT6
            r16 = r8
            r17 = r5
            r18 = r9
            r19 = r10
            r20 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r16 = "qr_code"
            r13 = r12
            X.C46395DeI.A0B(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 1579868440(0x5e2ae118, float:3.07828731E18)
            goto L_0x001c
        L_0x0993:
            r1 = -797889916(0xffffffffd0712a84, float:-1.61843814E10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Vfj r2 = (X.C17772Vfj) r2
            java.lang.Object r7 = r0.A02
            com.instagram.discovery.mediamap.model.MediaMapPin r7 = (com.instagram.discovery.mediamap.model.MediaMapPin) r7
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r4 = r2.A00
            X.W3Q r3 = X.Dba.A0F(r4)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r4.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_direct_share"
            X.DbZ.A1a(r2, r3, r7, r0)
            androidx.fragment.app.Fragment r6 = r4.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r6 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r6
            X.R8F r0 = new X.R8F
            r0.<init>()
            X.Ebf r5 = new X.Ebf
            r5.<init>()
            r5.A00 = r6
            r5.A01 = r0
            com.instagram.common.session.UserSession r4 = r6.A02
            java.lang.String r3 = r7.getId()
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r0 = 1288(0x508, float:1.805E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1OC r3 = X.C49121Epk.A00(r4, r2, r3, r0)
            r2 = 8
            X.EDb r0 = new X.EDb
            r0.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r5, (java.lang.Object) r6)
            r3.A00 = r0
            r6.schedule(r3)
            r0 = 1004544362(0x3be0216a, float:0.0068399208)
            goto L_0x001c
        L_0x09e6:
            java.lang.Object r3 = r0.A01
            X.E36 r3 = (X.E36) r3
            java.lang.Object r1 = r0.A02
            X.E8r r2 = r3.A02
            r2.getClass()
            java.util.Set r0 = r2.A03
            r0.add(r1)
            goto L_0x0a07
        L_0x09f7:
            java.lang.Object r3 = r0.A01
            X.E36 r3 = (X.E36) r3
            java.lang.Object r1 = r0.A02
            X.E8r r2 = r3.A02
            r2.getClass()
            java.util.Set r0 = r2.A03
            r0.remove(r1)
        L_0x0a07:
            X.C47579E8r.A00(r2)
            r2.FK4()
            X.E36.A01(r3)
            return
        L_0x0a11:
            r1 = 1299065365(0x4d6e2a15, float:2.49733456E8)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            com.instagram.newsfeed.fragment.NewsfeedFragment r5 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r5
            X.7Pu r3 = r5.A03
            if (r3 == 0) goto L_0x0a71
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r3.A03
            androidx.fragment.app.Fragment r1 = r1.A0M()
            if (r1 == 0) goto L_0x0a71
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r3 = r3.A03
            androidx.fragment.app.Fragment r1 = r3.A0M()
            boolean r1 = r1 instanceof X.ERZ
            if (r1 == 0) goto L_0x0a71
            androidx.fragment.app.Fragment r7 = r3.A0M()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.newsfeed.fragment.NewsfeedFilterSelectorFragment"
            X.0qQ.A0C(r7, r1)
            X.ERZ r7 = (X.ERZ) r7
            java.util.ArrayList r6 = r7.A00()
            java.util.Iterator r4 = r6.iterator()
        L_0x0a45:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0a6e
            java.lang.Object r3 = r4.next()
            boolean r1 = r3 instanceof X.PR9
            if (r1 == 0) goto L_0x0a59
            X.PR9 r3 = (X.PR9) r3
            r1 = 0
            r3.A0D = r1
            goto L_0x0a45
        L_0x0a59:
            boolean r1 = r3 instanceof X.PR8
            if (r1 == 0) goto L_0x0a63
            X.PR8 r3 = (X.PR8) r3
            r1 = 0
            r3.A02 = r1
            goto L_0x0a45
        L_0x0a63:
            boolean r1 = r3 instanceof X.C70962OTj
            if (r1 == 0) goto L_0x0a45
            X.OTj r3 = (X.C70962OTj) r3
            java.lang.String r1 = "NONE"
            r3.A00 = r1
            goto L_0x0a45
        L_0x0a6e:
            r7.setItems(r6)
        L_0x0a71:
            java.lang.Object r1 = r0.A01
            X.DdJ r1 = (X.C46356DdJ) r1
            java.util.Map r0 = r1.A02
            r0.clear()
            X.7Pu r3 = r5.A03
            if (r3 == 0) goto L_0x0a87
            r0 = 0
            X.7Pt r1 = com.instagram.newsfeed.fragment.NewsfeedFragment.A00(r5, r1, r0)
            r0 = 1
            r3.A0K(r1, r0)
        L_0x0a87:
            r0 = -1590245239(0xffffffffa136c889, float:-6.1929405E-19)
            goto L_0x1166
        L_0x0a8c:
            r1 = -2082985165(0xffffffff83d82b33, float:-1.2705257E-36)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.EwU r1 = (X.C49489EwU) r1
            java.lang.Integer r1 = r1.A01
            int r3 = r1.intValue()
            r1 = 0
            if (r3 == r1) goto L_0x0ab3
            r1 = 1
            java.lang.Object r0 = r0.A01
            X.G7d r0 = (X.C51909G7d) r0
            if (r3 == r1) goto L_0x0aaf
            r0.DGc()
        L_0x0aaa:
            r0 = 257868817(0xf5ec411, float:1.0983206E-29)
            goto L_0x1166
        L_0x0aaf:
            r0.DGX()
            goto L_0x0aaa
        L_0x0ab3:
            java.lang.Object r0 = r0.A01
            X.G7d r0 = (X.C51909G7d) r0
            r0.DpP()
            goto L_0x0aaa
        L_0x0abb:
            r1 = 1776700523(0x69e64c6b, float:3.4801727E25)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.E1c r4 = (X.C47410E1c) r4
            java.lang.Object r3 = r0.A01
            X.EwS r3 = (X.C49487EwS) r3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0af7
            X.E8k r0 = r4.A02
            java.util.ArrayList r0 = r0.A0C()
            int r1 = r0.size()
            r0 = 5
            if (r1 < r0) goto L_0x0af7
            X.8ab r1 = X.DbW.A0U(r4)
            r0 = 2131952057(0x7f1301b9, float:1.9540546E38)
            r1.A09(r0)
            r0 = 2131952056(0x7f1301b8, float:1.9540544E38)
            r1.A08(r0)
            r1.A06()
            r0 = 1
            X.AnonymousClass7TH.A0a(r1, r0)
        L_0x0af2:
            r0 = 1483354557(0x586a31bd, float:1.02999738E15)
            goto L_0x1166
        L_0x0af7:
            X.E8k r1 = r4.A02
            boolean r0 = r3.A00
            r0 = r0 ^ 1
            r3.A00 = r0
            r1.FK4()
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r4.A04
            r1.getClass()
            X.E8k r0 = r4.A02
            java.util.ArrayList r0 = r0.A0C()
            boolean r0 = X.DbT.A1b(r0)
            r1.setEnabled(r0)
            goto L_0x0af2
        L_0x0b15:
            r1 = 121346338(0x73b9922, float:1.4113318E-34)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r1 = r0.A02
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            android.content.Context r0 = r3.getContext()
            java.lang.Object r4 = X.DbZ.A0e(r0)
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r1 = r1.iterator()
        L_0x0b36:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b49
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            goto L_0x0b36
        L_0x0b49:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "backup_codes"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r1)
            r4.setPrimaryClip(r0)
            r0 = 2131953584(0x7f1307b0, float:1.9543643E38)
            X.DbZ.A0s(r0)
            r0 = 227640720(0xd918590, float:8.968469E-31)
            goto L_0x1166
        L_0x0b61:
            r1 = -598655598(0xffffffffdc513d92, float:-2.3558387E17)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.E7T r4 = (X.E7T) r4
            java.lang.Object r6 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r6 = (com.instagram.hallpass.model.HallPassMemberViewModel) r6
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r5 = r4.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.user.model.User r1 = r1.A01(r0)
            com.instagram.user.model.User r7 = r6.A00
            java.lang.String r0 = r7.getId()
            boolean r8 = X.DbV.A1Z(r1, r0)
            if (r8 != 0) goto L_0x0b95
            boolean r0 = r7.A2A()
            if (r0 == 0) goto L_0x0b95
            boolean r0 = r7.A29()
            r3 = 1
            if (r0 != 0) goto L_0x0b96
        L_0x0b95:
            r3 = 0
        L_0x0b96:
            android.content.Context r1 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r1, r0)
            java.lang.String r0 = r7.B8Q()
            r5.A08(r0)
            if (r3 == 0) goto L_0x0bb9
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 24
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7T) r4, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r1)
            r5.A02(r0, r3)
        L_0x0bb9:
            if (r8 == 0) goto L_0x0bcf
            r3 = 2131963267(0x7f132d83, float:1.9563283E38)
            r0 = 39
            X.FP1 r1 = X.FP1.A00(r4, r0)
        L_0x0bc4:
            r5.A02(r1, r3)
            X.C49945FFy.A00(r4, r5)
            r0 = -1717169840(0xffffffff99a61150, float:-1.717099E-23)
            goto L_0x1166
        L_0x0bcf:
            boolean r0 = r7.isRestricted()
            r3 = 2131972302(0x7f1350ce, float:1.9581608E38)
            if (r0 == 0) goto L_0x0bdb
            r3 = 2131975971(0x7f135f23, float:1.958905E38)
        L_0x0bdb:
            r1 = 25
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7T) r4, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r1)
            r5.A02(r0, r3)
            boolean r0 = r7.CPV()
            r3 = 2131966159(0x7f1338cf, float:1.9569148E38)
            if (r0 == 0) goto L_0x0bf1
            r3 = 2131966172(0x7f1338dc, float:1.9569175E38)
        L_0x0bf1:
            r0 = 26
            X.FPF r1 = new X.FPF
            r1.<init>((X.E7T) r4, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r0)
            goto L_0x0bc4
        L_0x0bf9:
            r1 = 1400192161(0x53753ca1, float:1.05328417E12)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.E7Y r1 = (X.E7Y) r1
            java.lang.Object r3 = r0.A02
            com.instagram.hallpass.model.HallPassViewModel r3 = (com.instagram.hallpass.model.HallPassViewModel) r3
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0c1e
            X.0eM r0 = r1.A0E
            java.lang.Object r1 = r0.getValue()
            X.Dkr r1 = (X.C46764Dkr) r1
            java.lang.String r0 = r3.A04
            r1.A00(r0)
        L_0x0c19:
            r0 = -1115898591(0xffffffffbd7cbd21, float:-0.061703805)
            goto L_0x1166
        L_0x0c1e:
            r1.A0D(r3)
            goto L_0x0c19
        L_0x0c22:
            r1 = -1980046005(0xffffffff89fae54b, float:-6.0400937E-33)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.E7S r5 = (X.E7S) r5
            java.lang.Object r6 = r0.A02
            com.instagram.hallpass.model.HallPassMemberViewModel r6 = (com.instagram.hallpass.model.HallPassMemberViewModel) r6
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r4 = r5.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.user.model.User r1 = r1.A01(r0)
            com.instagram.user.model.User r7 = r6.A00
            java.lang.String r0 = r7.getId()
            boolean r3 = X.DbV.A1Z(r1, r0)
            android.content.Context r1 = r5.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r1, r0)
            java.lang.String r0 = r7.B8Q()
            r4.A08(r0)
            if (r3 == 0) goto L_0x0c71
            r1 = 2131954705(0x7f130c11, float:1.9545917E38)
            r0 = 29
            X.FP1 r0 = X.FP1.A00(r5, r0)
            r4.A02(r0, r1)
        L_0x0c69:
            X.C49945FFy.A00(r5, r4)
            r0 = -2144536900(0xffffffff802cf6bc, float:-4.129273E-39)
            goto L_0x1166
        L_0x0c71:
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 20
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r5, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r1)
            r4.A02(r0, r3)
            boolean r0 = r7.isRestricted()
            r3 = 2131972302(0x7f1350ce, float:1.9581608E38)
            if (r0 == 0) goto L_0x0c8a
            r3 = 2131975971(0x7f135f23, float:1.958905E38)
        L_0x0c8a:
            r1 = 21
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r5, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r1)
            r4.A02(r0, r3)
            boolean r0 = r7.CPV()
            r3 = 2131966159(0x7f1338cf, float:1.9569148E38)
            if (r0 == 0) goto L_0x0ca0
            r3 = 2131966172(0x7f1338dc, float:1.9569175E38)
        L_0x0ca0:
            r1 = 22
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r5, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r1)
            r4.A02(r0, r3)
            boolean r0 = r7.CPV()
            if (r0 != 0) goto L_0x0c69
            com.instagram.user.model.FollowStatus r1 = r7.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            if (r1 != r0) goto L_0x0c69
            r3 = 2131962530(0x7f132aa2, float:1.9561788E38)
            r1 = 23
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r5, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r1)
            r4.A04(r0, r3)
            goto L_0x0c69
        L_0x0cc6:
            r1 = 770868386(0x2df284a2, float:2.7571116E-11)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r0 = r0.A01
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r6 = r0.getId()
            java.lang.String r7 = r0.getUsername()
            X.8ab r4 = X.DbW.A0U(r5)
            r0 = 1
            r4.A0s(r0)
            android.content.Context r0 = r5.getContext()
            r3 = 0
            if (r0 == 0) goto L_0x0d2d
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0d2d
            r0 = 2131963278(0x7f132d8e, float:1.9563305E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r7, r0)
        L_0x0cfb:
            r4.A05 = r0
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0d10
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0d10
            r0 = 2131963276(0x7f132d8c, float:1.95633E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0e(r1, r7, r0)
        L_0x0d10:
            r4.A0q(r3)
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r0 = 8
            X.FJh r1 = new X.FJh
            r1.<init>((java.lang.String) r6, (java.lang.Object) r5, (int) r0)
            X.8ae r0 = X.C358278ae.RED
            r4.A0Q(r1, r0, r3)
            r4.A03()
            X.DbT.A1V(r4)
            r0 = 2215350(0x21cdb6, float:3.104367E-39)
            goto L_0x1166
        L_0x0d2d:
            r0 = r3
            goto L_0x0cfb
        L_0x0d2f:
            r1 = -1213860420(0xffffffffb7a5f5bc, float:-1.9783962E-5)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r0 = r0.A01
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = (com.instagram.hallpass.model.HallPassMemberViewModel) r0
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r6 = r0.getId()
            java.lang.String r7 = r0.getUsername()
            X.8ab r4 = X.DbW.A0U(r5)
            r0 = 1
            r4.A0s(r0)
            android.content.Context r0 = r5.getContext()
            r3 = 0
            if (r0 == 0) goto L_0x0d95
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0d95
            r0 = 2131954715(0x7f130c1b, float:1.9545937E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r7, r0)
        L_0x0d64:
            r4.A05 = r0
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0d79
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0d79
            r0 = 2131954714(0x7f130c1a, float:1.9545935E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0e(r1, r7, r0)
        L_0x0d79:
            r4.A0q(r3)
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r0 = 7
            X.FJh r1 = new X.FJh
            r1.<init>((java.lang.String) r6, (java.lang.Object) r5, (int) r0)
            X.8ae r0 = X.C358278ae.RED
            r4.A0Q(r1, r0, r3)
            r4.A03()
            X.DbT.A1V(r4)
            r0 = -1652385327(0xffffffff9d8299d1, float:-3.4569756E-21)
            goto L_0x1166
        L_0x0d95:
            r0 = r3
            goto L_0x0d64
        L_0x0d97:
            r1 = 2042334035(0x79bb8b53, float:1.2172317E35)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01
            X.Der r6 = (X.C46430Der) r6
            java.lang.Object r1 = r0.A02
            X.Dgg r1 = (X.C46539Dgg) r1
            r5 = 0
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0dc0
            com.instagram.common.session.UserSession r4 = X.C46430Der.A03(r6)
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.EZn r1 = X.C46430Der.A01(r6)
            r0 = 1
            X.C48958Emw.A00(r3, r1, r4, r0, r5)
        L_0x0dbb:
            r0 = 1241279774(0x49fc6d1e, float:2067875.8)
            goto L_0x1166
        L_0x0dc0:
            X.DkJ r0 = r6.A08
            if (r0 == 0) goto L_0x0dbb
            com.instagram.common.session.UserSession r9 = X.C46430Der.A03(r6)
            java.lang.String r11 = r1.A02
            X.EZn r7 = X.C46430Der.A01(r6)
            r0 = 1
            X.DbZ.A0t(r0, r9, r11, r7)
            X.EZk r8 = X.C48142EZk.CONTACT_SMS
            X.C49947FGb.A03(r7, r8, r9, r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A0u
            X.F8M.A01(r6, r7, r8, r9, r10, r11)
            goto L_0x0dbb
        L_0x0ddd:
            r1 = 671380030(0x2804723e, float:7.352244E-15)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            boolean r1 = r4.isChecked()
            r3 = r1 ^ 1
            r4.setChecked(r3)
            java.lang.Object r0 = r0.A02
            X.DtV r0 = (X.C47244DtV) r0
            r0.A00 = r3
            X.EwI r0 = r0.A02
            X.E7G r4 = r0.A00
            java.util.Set r1 = r4.A02
            java.lang.String r0 = r0.A01
            if (r3 == 0) goto L_0x0e1e
            r1.add(r0)
        L_0x0e04:
            X.F2D r3 = r4.A00
            if (r3 == 0) goto L_0x0e19
            boolean r0 = r1.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0e16
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0e16
            r1 = 0
        L_0x0e16:
            r3.A00(r1)
        L_0x0e19:
            r0 = 219630358(0xd174b16, float:4.662085E-31)
            goto L_0x1166
        L_0x0e1e:
            r1.remove(r0)
            goto L_0x0e04
        L_0x0e22:
            r1 = -1507168258(0xffffffffa62a6ffe, float:-5.9132376E-16)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.E4g r5 = (X.C47481E4g) r5
            X.0eM r6 = r5.A05
            X.DeO r1 = X.C46790DlK.A00(r6)
            int r3 = r1.ordinal()
            r1 = 0
            if (r3 == r1) goto L_0x0e48
            r1 = 1
            if (r3 == r1) goto L_0x0e4c
            r0 = 2
            if (r3 == r0) goto L_0x0e7e
            r0 = 3
            if (r3 == r0) goto L_0x0e7e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0e48:
            r1 = 2131976298(0x7f13606a, float:1.9589713E38)
            goto L_0x0e4f
        L_0x0e4c:
            r1 = 2131976330(0x7f13608a, float:1.9589777E38)
        L_0x0e4f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0e7e
            java.lang.Object r4 = r0.A01
            int r1 = r1.intValue()
            X.8ab r3 = X.DbW.A0U(r5)
            X.DeO r0 = X.C46790DlK.A00(r6)
            java.lang.String r0 = X.C47481E4g.A01(r0, r5)
            r3.A05 = r0
            r3.A08(r1)
            r1 = 2131976323(0x7f136083, float:1.9589763E38)
            r0 = 22
            X.FJk r0 = X.C50025FJk.A00(r4, r5, r0)
            r3.A0J(r0, r1)
            r3.A05()
            X.DbT.A1V(r3)
        L_0x0e7e:
            r0 = 1353792413(0x50b13b9d, float:2.37877924E10)
            goto L_0x1166
        L_0x0e83:
            r1 = 1508358040(0x59e7b798, float:8.1528229E15)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r1 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r1
            X.05G r1 = r1.A0E
            java.lang.Object r1 = r1.getValue()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0ec1
            java.lang.String r5 = r1.getUsername()
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            r1 = 1
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "https://ig.me/u/%s?extra=subscribe"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            X.0nC.A00(r4, r0)
            r0 = 0
            r1 = r25
            X.C49118Eph.A00(r4, r1, r0, r3)
        L_0x0ebc:
            r0 = 754639199(0x2cfae15f, float:7.1304486E-12)
            goto L_0x1166
        L_0x0ec1:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131965058(0x7f133482, float:1.9566915E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x0ebc
        L_0x0ecc:
            r1 = 598493914(0x23ac4ada, float:1.8679978E-17)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.EHJ r5 = (X.EHJ) r5
            com.instagram.common.session.UserSession r4 = r5.A03
            X.4lm r7 = X.C272994ll.A00(r4)
            java.lang.String r6 = r5.A05
            java.lang.String r1 = r5.A06
            java.lang.Object r0 = r0.A01
            X.Dta r0 = (X.C47249Dta) r0
            java.lang.String r3 = r0.A02
            r7.A0A(r6, r1, r3)
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Static"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r1, r0)
            r6 = 0
            android.content.Context r1 = r5.A00
            r0 = 2131969694(0x7f13469e, float:1.9576318E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_FEED_TITLE"
            X.0eP r8 = X.AnonymousClass7TE.A1L(r0, r1)
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r0 = r5.A04
            X.05G r0 = r0.A0E
            java.lang.Object r0 = r0.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0f66
            java.lang.String r1 = r0.getUsername()
        L_0x0f16:
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE"
            X.0eP r9 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r0, r3)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r3)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST"
            X.0eP r11 = X.AnonymousClass7TE.A1L(r0, r1)
            r0 = 41
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 284(0x11c, float:3.98E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0eP r12 = X.AnonymousClass7TE.A1L(r1, r0)
            X.0iw r0 = r5.A02
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_PRIOR_MODULE"
            X.0eP r13 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR"
            X.0eP r14 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eP[] r0 = new X.0eP[]{r7, r8, r9, r10, r11, r12, r13, r14}
            android.os.Bundle r3 = X.Q21.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r5.A01
            java.lang.String r0 = "contextual_feed"
            X.DbY.A0u(r1, r3, r4, r0)
            r0 = -131585837(0xfffffffff82828d3, float:-1.3642717E34)
            goto L_0x1166
        L_0x0f66:
            r1 = 0
            goto L_0x0f16
        L_0x0f68:
            r1 = -1503501090(0xffffffffa66264de, float:-7.85462E-16)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.E4b r6 = (X.C47477E4b) r6
            X.0eM r1 = r6.A0N
            java.lang.Object r3 = r1.getValue()
            X.4lm r3 = (X.C273004lm) r3
            X.0eM r1 = r6.A0K
            java.lang.String r5 = X.DbW.A0l(r1)
            X.0eM r1 = r6.A0M
            java.lang.String r4 = X.DbW.A0l(r1)
            X.0wc r3 = r3.A00
            java.lang.String r1 = "ig_fan_club_consideration_screen_exclusive_story_ring_tapped"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r1)
            r1 = 286(0x11e, float:4.01E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DbS.A1O(r3, r1)
            java.lang.String r1 = "origin"
            r3.AAJ(r1, r4)
            X.DbY.A1G(r3, r5)
            r3.Cgf()
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            X.0eM r1 = r6.A0O
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.user.model.User r8 = X.Dbb.A0P(r6)
            if (r8 != 0) goto L_0x0fb8
            r0 = 406292841(0x18378969, float:2.372157E-24)
            goto L_0x1166
        L_0x0fb8:
            r10 = 1
            java.lang.Object r1 = r0.A01
            r0 = 49
            X.Phg r9 = new X.Phg
            r9.<init>(r0, r1, r6)
            X.C56585I2p.A02(r5, r6, r7, r8, r9, r10)
            r0 = -861449303(0xffffffffcca753a9, float:-8.7727432E7)
            goto L_0x1166
        L_0x0fca:
            r1 = -595219203(0xffffffffdc85acfd, float:-3.01010996E17)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.E4b r1 = (X.C47477E4b) r1
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r6 = X.C47477E4b.A00(r1)
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            java.lang.Object r0 = r0.A01
            X.EaC r0 = (X.C48170EaC) r0
            X.EKM r0 = (X.EKM) r0
            java.lang.String r7 = r0.A07
            boolean r1 = r0.A0I
            r0 = 1
            X.0qQ.A0B(r7, r0)
            if (r1 == 0) goto L_0x1004
            com.instagram.common.session.UserSession r5 = r6.A03
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321056658564127(0x8109cf0000241f, double:3.0329207118074674E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x1004
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A0B(r6, r7)
        L_0x0fff:
            r0 = -223914728(0xfffffffff2a75518, float:-6.628719E30)
            goto L_0x1166
        L_0x1004:
            com.instagram.common.session.UserSession r5 = r6.A03
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.05G r0 = r6.A0E
            java.lang.Object r0 = r0.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = X.DbX.A0r(r0)
            java.lang.String r0 = "creator_user_id"
            r3.putString(r0, r1)
            java.lang.Integer r1 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x1036
            r0 = 3105(0xc21, float:4.351E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x1027:
            java.lang.String r0 = "origin"
            r3.putString(r0, r1)
            r0 = 2343(0x927, float:3.283E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbY.A0u(r4, r3, r5, r0)
            goto L_0x0fff
        L_0x1036:
            r0 = 689(0x2b1, float:9.65E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            goto L_0x1027
        L_0x103d:
            r1 = -1603012763(0xffffffffa073f765, float:-2.0664757E-19)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.E4b r1 = (X.C47477E4b) r1
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r8 = X.C47477E4b.A00(r1)
            java.lang.Object r0 = r0.A01
            X.Mcr r0 = (X.C66805Mcr) r0
            java.lang.Object r0 = r0.A04
            java.lang.Number r0 = (java.lang.Number) r0
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            r3 = 0
            X.0qQ.A0B(r0, r3)
            r1 = 1
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x10a0
            if (r0 != r1) goto L_0x10b7
            com.instagram.common.session.UserSession r6 = r8.A03
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321623594247779(0x810a5300002663, double:3.0332792442166757E-306)
            boolean r5 = X.182.A06(r3, r6, r0)
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r7, r6)
            r3 = 2131961998(0x7f13288e, float:1.9560709E38)
            r1 = 8
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r8)
            r4.A04(r0, r3)
            if (r5 == 0) goto L_0x1093
            r3 = 2131961995(0x7f13288b, float:1.9560703E38)
            r1 = 9
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r8)
            r4.A04(r0, r3)
        L_0x1093:
            X.FFy r0 = new X.FFy
            r0.<init>(r4)
            r0.A03(r7)
        L_0x109b:
            r0 = 993825830(0x3b3c9426, float:0.0028774827)
            goto L_0x1166
        L_0x10a0:
            com.instagram.common.session.UserSession r0 = r8.A03
            X.6Yo r3 = X.DbS.A0M(r7, r0)
            X.F3X r1 = X.FC8.A00()
            java.lang.String r0 = "PROFILE"
            X.EN2 r0 = r1.A02(r0)
            r3.A0D(r0)
            r3.A04()
            goto L_0x109b
        L_0x10b7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10bc:
            r1 = 317823875(0x12f19b83, float:1.5247575E-27)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            com.instagram.hallpass.model.HallPassMemberViewModel r3 = (com.instagram.hallpass.model.HallPassMemberViewModel) r3
            com.instagram.user.model.User r10 = r3.A00
            boolean r1 = r10.isRestricted()
            if (r1 == 0) goto L_0x10f8
            X.1YZ r3 = X.1YZ.A02
            if (r3 == 0) goto L_0x10f4
            java.lang.Object r1 = r0.A02
            X.E7T r1 = (X.E7T) r1
            android.content.Context r4 = r1.requireContext()
            X.0gy r5 = X.AnonymousClass07i.A00(r1)
            X.0eM r0 = r1.A0A
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r8 = r10.getId()
            java.lang.String r9 = "hall_pass_member_list"
            r0 = 2
            X.FoH r7 = new X.FoH
            r7.<init>(r1, r0)
            r3.A02(r4, r5, r6, r7, r8, r9)
        L_0x10f4:
            r0 = 1432773578(0x556663ca, float:1.58322666E13)
            goto L_0x1166
        L_0x10f8:
            X.1YZ r1 = X.1YZ.A02
            if (r1 == 0) goto L_0x10f4
            X.I0s r4 = r1.A00()
            if (r4 == 0) goto L_0x10f4
            java.lang.Object r1 = r0.A02
            X.E7T r1 = (X.E7T) r1
            X.0eM r0 = r1.A0A
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r5 = r1.requireContext()
            X.0wc r8 = r1.A00
            if (r8 == 0) goto L_0x1199
            java.lang.String r14 = "hall_pass_member_list"
            X.EVg r12 = X.C48088EVg.HALL_PASS
            r6 = 0
            r0 = 2
            X.FoV r13 = new X.FoV
            r13.<init>(r0, r3, r1)
            r0 = 1
            X.FoP r11 = new X.FoP
            r11.<init>(r0)
            r7 = r6
            r15 = r6
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x10f4
        L_0x112b:
            r1 = -388941123(0xffffffffe8d13abd, float:-7.904465E24)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.E7S r1 = (X.E7S) r1
            java.lang.Object r3 = r0.A01
            com.instagram.hallpass.model.HallPassMemberViewModel r3 = (com.instagram.hallpass.model.HallPassMemberViewModel) r3
            com.instagram.user.model.User r10 = r3.A00
            boolean r0 = r10.isRestricted()
            if (r0 == 0) goto L_0x116a
            X.1YZ r3 = X.1YZ.A02
            if (r3 == 0) goto L_0x1163
            android.content.Context r4 = r1.requireContext()
            X.0gy r5 = X.AnonymousClass07i.A00(r1)
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r8 = r10.getId()
            java.lang.String r9 = "campfire_member_list"
            r0 = 1
            X.FoH r7 = new X.FoH
            r7.<init>(r1, r0)
            r3.A02(r4, r5, r6, r7, r8, r9)
        L_0x1163:
            r0 = 98030251(0x5d7d2ab, float:2.029589E-35)
        L_0x1166:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x116a:
            X.1YZ r0 = X.1YZ.A02
            if (r0 == 0) goto L_0x1163
            X.I0s r4 = r0.A00()
            if (r4 == 0) goto L_0x1163
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r5 = r1.requireContext()
            X.0wc r8 = r1.A00
            if (r8 == 0) goto L_0x1199
            java.lang.String r14 = "campfire_member_list"
            X.EVg r12 = X.C48088EVg.CAMPFIRE
            r6 = 0
            r0 = 1
            X.FoV r13 = new X.FoV
            r13.<init>(r0, r3, r1)
            r0 = 0
            X.FoP r11 = new X.FoP
            r11.<init>(r0)
            r7 = r6
            r15 = r6
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x1163
        L_0x1199:
            java.lang.String r0 = "typedLogger"
            goto L_0x11ff
        L_0x119c:
            r1 = 118894074(0x7162dfa, float:1.1298257E-34)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Dnt r3 = (X.C46939Dnt) r3
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.F1k r1 = r3.A00
            java.lang.Object r5 = r0.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            X.E7M r6 = r1.A00
            android.content.Context r1 = r6.requireContext()
            X.0eM r0 = r6.A01
            X.Dg1 r4 = X.C46498Dg1.A00(r1, r0)
            java.lang.String r0 = r5.getUsername()
            r4.A08(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r5.Bh3()
            r4.A07(r0)
            X.4Cl r0 = r5.A03
            java.lang.Boolean r0 = r0.CTG()
            if (r0 == 0) goto L_0x11dc
            boolean r0 = r0.booleanValue()
            r3 = 2131975586(0x7f135da2, float:1.9588268E38)
            r1 = 12
            if (r0 != 0) goto L_0x11e1
        L_0x11dc:
            r3 = 2131975601(0x7f135db1, float:1.9588299E38)
            r1 = 13
        L_0x11e1:
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6)
            r4.A04(r0, r3)
            r3 = 2131967904(0x7f133fa0, float:1.9572688E38)
            r1 = 14
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6)
            r4.A04(r0, r3)
            X.C49945FFy.A00(r6, r4)
            X.4lm r0 = r6.A00
            if (r0 != 0) goto L_0x1207
            java.lang.String r0 = "logger"
        L_0x11ff:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1207:
            java.lang.String r4 = "subscribed_creator_list_fragment"
            java.lang.String r3 = r5.getId()
            X.0wc r1 = r0.A00
            java.lang.String r0 = "ig_fan_club_exclusive_content_notification_subs_tab_settings_impression"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbS.A1O(r0, r4)
            X.DbY.A1G(r0, r3)
            r0.Cgf()
            r0 = 1909030406(0x71c97e06, float:1.9954829E30)
            goto L_0x1166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPF.onClick(android.view.View):void");
    }

    public FPF(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public FPF(E7T e7t, HallPassMemberViewModel hallPassMemberViewModel, int i) {
        this.A00 = i;
        switch (i) {
            case 24:
            case 26:
                this.A02 = e7t;
                this.A01 = hallPassMemberViewModel;
                break;
            case 25:
                this.A01 = hallPassMemberViewModel;
                this.A02 = e7t;
                break;
            default:
                this.A01 = e7t;
                this.A02 = hallPassMemberViewModel;
                break;
        }
    }

    public FPF(E7S e7s, HallPassMemberViewModel hallPassMemberViewModel, int i) {
        this.A00 = i;
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
                this.A02 = e7s;
                this.A01 = hallPassMemberViewModel;
                break;
            default:
                this.A01 = e7s;
                this.A02 = hallPassMemberViewModel;
                break;
        }
    }
}
