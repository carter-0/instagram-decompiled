package X;

import android.view.View;

public final class FP4 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static FP4 A00(Object obj, int i) {
        return new FP4(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FP4(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r2v75, types: [X.ELT, X.FBc] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0415, code lost:
        r0 = "followListAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04ba, code lost:
        if (r4 != null) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r5 = r1.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0695, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x069c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r5 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r6 = r1.requireContext();
        r7 = X.AnonymousClass07i.A00(r1);
        r8 = X.AnonymousClass7TE.A0l(r1.A0B);
        r10 = r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r10 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r5.A03(r6, r7, r8, new X.C51087FoH(r1, 4), r10, "restrict_half_sheet", (java.lang.String) null, r1.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r1 = 2078048117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0ba0, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0ba3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0bab, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0bae, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0c2c, code lost:
        X.AnonymousClass0fD.A0C(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0c2f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ff, code lost:
        X.0qQ.A0F("targetUserId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r1 = r16
            switch(r0) {
                case 0: goto L_0x0993;
                case 1: goto L_0x0980;
                case 2: goto L_0x096d;
                case 3: goto L_0x0bcb;
                case 4: goto L_0x0935;
                case 5: goto L_0x090a;
                case 6: goto L_0x08dd;
                case 7: goto L_0x08a4;
                case 8: goto L_0x083e;
                case 9: goto L_0x0801;
                case 10: goto L_0x07cb;
                case 11: goto L_0x077d;
                case 12: goto L_0x071d;
                case 13: goto L_0x070a;
                case 14: goto L_0x06f7;
                case 15: goto L_0x06e4;
                case 16: goto L_0x06d1;
                case 17: goto L_0x06be;
                case 18: goto L_0x06ab;
                case 19: goto L_0x0680;
                case 20: goto L_0x0659;
                case 21: goto L_0x0641;
                case 22: goto L_0x062a;
                case 23: goto L_0x0607;
                case 24: goto L_0x05e6;
                case 25: goto L_0x05a9;
                case 26: goto L_0x0598;
                case 27: goto L_0x0564;
                case 28: goto L_0x0551;
                case 29: goto L_0x0bc1;
                case 30: goto L_0x0531;
                case 31: goto L_0x050b;
                case 32: goto L_0x04fa;
                case 33: goto L_0x0496;
                case 34: goto L_0x0465;
                case 35: goto L_0x0430;
                case 36: goto L_0x0419;
                case 37: goto L_0x03bc;
                case 38: goto L_0x039b;
                case 39: goto L_0x035f;
                case 40: goto L_0x034c;
                case 41: goto L_0x0beb;
                case 42: goto L_0x0baf;
                case 43: goto L_0x0b75;
                case 44: goto L_0x0b41;
                case 45: goto L_0x02d9;
                case 46: goto L_0x02c2;
                case 47: goto L_0x028d;
                case 48: goto L_0x0af5;
                case 49: goto L_0x0aed;
                case 50: goto L_0x0ae5;
                case 51: goto L_0x0ad1;
                case 52: goto L_0x0abd;
                case 53: goto L_0x0a9f;
                case 54: goto L_0x0a81;
                case 55: goto L_0x0a62;
                case 56: goto L_0x024b;
                case 57: goto L_0x023a;
                case 58: goto L_0x0223;
                case 59: goto L_0x0a4c;
                case 60: goto L_0x0a36;
                case 61: goto L_0x0a20;
                case 62: goto L_0x0a0a;
                case 63: goto L_0x09f4;
                case 64: goto L_0x09de;
                case 65: goto L_0x09c8;
                case 66: goto L_0x016f;
                case 67: goto L_0x0154;
                case 68: goto L_0x0104;
                case 69: goto L_0x0027;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1700218424(0x65574638, float:6.3537756E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E6b r3 = (X.C47517E6b) r3
            X.EUu r1 = r3.A02
            if (r1 == 0) goto L_0x0020
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 != r1) goto L_0x0020
            X.C47517E6b.A01(r3)
        L_0x0020:
            r1 = 1279802962(0x4c483e52, float:5.2492616E7)
        L_0x0023:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0027:
            r0 = 1829470375(0x6d0b80a7, float:2.6983717E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E66 r1 = (X.E66) r1
            X.EVg r2 = r1.A02
            if (r2 != 0) goto L_0x0040
            java.lang.String r5 = "entryPoint"
        L_0x0038:
            X.0qQ.A0F(r5)
        L_0x003b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0040:
            int r3 = r2.ordinal()
            java.lang.String r8 = "click"
            r2 = 3269(0xcc5, float:4.581E-42)
            java.lang.String r9 = X.C273654mx.A00(r2)
            java.lang.String r5 = "typedLogger"
            java.lang.String r4 = "targetUserId"
            switch(r3) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00b8;
                case 6: goto L_0x00a0;
                case 7: goto L_0x00ac;
                case 8: goto L_0x0053;
                case 9: goto L_0x0094;
                case 10: goto L_0x0053;
                case 11: goto L_0x0053;
                case 12: goto L_0x0082;
                default: goto L_0x0053;
            }
        L_0x0053:
            java.lang.String r3 = "restrict_error"
            java.lang.String r2 = "Unrecognized entry point for Restrict bottom sheet"
            X.0wb.A03(r3, r2)
        L_0x005a:
            X.1YZ r5 = r1.A0A
            if (r5 == 0) goto L_0x007e
            android.content.Context r6 = r1.requireContext()
            X.0gy r7 = X.AnonymousClass07i.A00(r1)
            X.0eM r2 = r1.A0B
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r10 = r1.A05
            if (r10 == 0) goto L_0x00ff
            java.lang.String r11 = "restrict_half_sheet"
            r12 = 0
            java.lang.String r13 = r1.A04
            r2 = 4
            X.FoH r9 = new X.FoH
            r9.<init>(r1, r2)
            r5.A03(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x007e:
            r1 = 2078048117(0x7bdc7f75, float:2.2897809E36)
            goto L_0x0023
        L_0x0082:
            X.0wc r9 = r1.A01
            if (r9 == 0) goto L_0x0038
            X.EVg r10 = X.C48088EVg.HIDE_STORY_FROM
            java.lang.String r12 = r1.A05
            if (r12 == 0) goto L_0x00ff
            r14 = 0
            java.lang.String r11 = "bottomsheet_restrict_click"
            r13 = r8
            X.AnonymousClass73V.A0C(r9, r10, r11, r12, r13, r14)
            goto L_0x005a
        L_0x0094:
            X.0wc r3 = r1.A01
            if (r3 == 0) goto L_0x0038
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x00ff
            X.AnonymousClass73V.A0F(r3, r8, r9, r2)
            goto L_0x005a
        L_0x00a0:
            X.0wc r3 = r1.A01
            if (r3 == 0) goto L_0x0038
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x00ff
            X.AnonymousClass73V.A0H(r3, r8, r9, r2)
            goto L_0x005a
        L_0x00ac:
            X.0wc r3 = r1.A01
            if (r3 == 0) goto L_0x0038
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x00ff
            X.AnonymousClass73V.A0E(r3, r9, r2)
            goto L_0x005a
        L_0x00b8:
            X.0wc r3 = r1.A01
            if (r3 == 0) goto L_0x0038
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x00ff
            X.AnonymousClass73V.A0G(r3, r8, r9, r2)
            goto L_0x005a
        L_0x00c4:
            X.0wc r7 = r1.A01
            if (r7 == 0) goto L_0x0038
            java.lang.String r13 = r1.A05
            if (r13 == 0) goto L_0x00ff
            X.73V r6 = X.AnonymousClass73V.A00
            r8 = 0
            r10 = r8
            r11 = r8
            r12 = r8
            r6.A0I(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x005a
        L_0x00d6:
            X.0wc r3 = r1.A01
            if (r3 == 0) goto L_0x0038
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x00ff
            X.AnonymousClass73V.A0D(r3, r2)
            goto L_0x005a
        L_0x00e3:
            X.I21 r3 = X.I21.A00
            X.0wW r2 = r1.getSession()
            r3.A02(r2)
            X.0wc r6 = r1.A01
            if (r6 == 0) goto L_0x0038
            java.lang.String r13 = r1.A05
            if (r13 == 0) goto L_0x00ff
            X.73V r5 = X.AnonymousClass73V.A00
            r7 = 0
            r10 = r7
            r11 = r7
            r12 = r7
            r5.A0J(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x005a
        L_0x00ff:
            X.0qQ.A0F(r4)
            goto L_0x003b
        L_0x0104:
            r0 = 1324095821(0x4eec194d, float:1.98054054E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E73 r5 = (X.E73) r5
            X.0wc r3 = r5.A00
            r4 = 0
            if (r3 != 0) goto L_0x0118
            java.lang.String r0 = "logger"
            goto L_0x0695
        L_0x0118:
            java.lang.String r2 = "click"
            java.lang.String r1 = "search_account"
            X.AnonymousClass73V.A0A(r3, r4, r2, r1)
            X.1YZ r1 = r5.A02
            if (r1 != 0) goto L_0x0128
            r1 = -43014632(0xfffffffffd6fa618, float:-1.9909244E37)
            goto L_0x0023
        L_0x0128:
            X.0eM r1 = r1.A00
            r1.getValue()
            com.instagram.common.session.UserSession r1 = r5.getSession()
            r2 = 0
            X.0qQ.A0B(r1, r2)
            X.E7F r3 = new X.E7F
            r3.<init>()
            android.os.Bundle r1 = X.DbV.A0A(r1)
            r3.setArguments(r1)
            r3.setTargetFragment(r5, r2)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            com.instagram.common.session.UserSession r1 = r5.getSession()
            X.Dbb.A0o(r4, r3, r2, r1)
            r1 = -892261808(0xffffffffcad12a50, float:-6853928.0)
            goto L_0x0023
        L_0x0154:
            r0 = 1101552229(0x41a85a65, float:21.044138)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.0hq r1 = r2.mFragmentManager
            boolean r1 = X.AnonymousClass06S.A01(r1)
            if (r1 == 0) goto L_0x016a
            X.DbX.A1J(r2)
        L_0x016a:
            r1 = -636752382(0xffffffffda0bee02, float:-9.8466785E15)
            goto L_0x0023
        L_0x016f:
            r0 = 760670505(0x2d56e929, float:1.2216264E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.NJB r1 = (X.NJB) r1
            X.OLx r5 = r1.A0D
            X.7Pu r4 = r1.A07
            r4.getClass()
            boolean r8 = r1.A0L
            boolean r2 = r1.A0I
            X.Pvi r7 = r5.A07
            boolean r1 = r7 instanceof X.C72982PRp
            if (r1 == 0) goto L_0x0220
            X.PRp r7 = (X.C72982PRp) r7
        L_0x018d:
            com.instagram.user.model.User r6 = r5.A04
            X.NHU r1 = r5.A08
            if (r2 == 0) goto L_0x01f6
            com.instagram.wellbeing.reporting.common.impersonation.ConsolidatedProfileSearchBottomSheetFragment r3 = new com.instagram.wellbeing.reporting.common.impersonation.ConsolidatedProfileSearchBottomSheetFragment
            r3.<init>()
            r3.A06 = r1
            X.OM1 r1 = r1.A00()
            java.lang.String r1 = r1.A0H
            r3.A08 = r1
            r3.A03 = r6
            r3.A05 = r7
        L_0x01a6:
            X.0qQ.A0A(r3)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r6 = r5.A02
            X.DbU.A1D(r7, r6)
            java.lang.String r9 = r5.A09
            java.lang.String r1 = "ReportingConstants.ARG_CONTENT_ID"
            r7.putString(r1, r9)
            r1 = 54
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r7.putBoolean(r1, r8)
            r1 = 606(0x25e, float:8.49E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r7.putBoolean(r1, r2)
            boolean r2 = r5.A0B
            java.lang.String r1 = "ReportingConstants.ARG_IS_ENCRYPTED_THREAD"
            r7.putBoolean(r1, r2)
            r2 = 0
            java.lang.String r1 = "DirectSearchUserFragment.DIRECT_SHOW_SUGGESTION_TITLE"
            r7.putBoolean(r1, r2)
            r2 = 10
            java.lang.String r1 = "DirectSearchUserFragment.DIRECT_SEARCH_SECTION_LIMIT"
            r7.putInt(r1, r2)
            X.7Pr r2 = X.DbV.A0V(r7, r3, r6)
            boolean r1 = r5.A0C
            X.DbS.A1S(r2, r1)
            float r1 = r5.A00
            r2.A03 = r1
            r4.A0F(r3, r2)
            r1 = 1244174547(0x4a2898d3, float:2762292.8)
            goto L_0x0023
        L_0x01f6:
            if (r8 == 0) goto L_0x020c
            com.instagram.wellbeing.reporting.common.impersonation.SelectVictimSearchBottomSheetFragment r3 = new com.instagram.wellbeing.reporting.common.impersonation.SelectVictimSearchBottomSheetFragment
            r3.<init>()
            r3.A02 = r1
            X.OM1 r1 = r1.A00()
            java.lang.String r1 = r1.A0H
            r3.A03 = r1
            r3.A00 = r6
            r3.A01 = r7
            goto L_0x01a6
        L_0x020c:
            com.instagram.wellbeing.reporting.common.impersonation.HighProfileVictimSearchBottomSheetFragment r3 = new com.instagram.wellbeing.reporting.common.impersonation.HighProfileVictimSearchBottomSheetFragment
            r3.<init>()
            r3.A06 = r1
            X.OM1 r1 = r1.A00()
            java.lang.String r1 = r1.A0H
            r3.A08 = r1
            r3.A03 = r6
            r3.A05 = r7
            goto L_0x01a6
        L_0x0220:
            r7 = 0
            goto L_0x018d
        L_0x0223:
            r0 = 762248266(0x2d6efc4a, float:1.3584753E-11)
            int r7 = X.AnonymousClass0fD.A05(r0)
            android.content.Intent r5 = X.DbS.A09()
            java.lang.Object r4 = r15.A01
            X.E2n r4 = (X.C47441E2n) r4
            java.util.GregorianCalendar r0 = r4.A00
            if (r0 != 0) goto L_0x0bd3
            java.lang.String r0 = "selectedDate"
            goto L_0x0695
        L_0x023a:
            r0 = -2115576543(0xffffffff81e6dd21, float:-8.480596E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dbb.A1S(r1)
            r1 = -871284435(0xffffffffcc11412d, float:-3.807762E7)
            goto L_0x0023
        L_0x024b:
            r0 = 571730377(0x2213e9c9, float:2.004598E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.FYK r2 = (X.FYK) r2
            X.K8D r1 = r2.A01
            com.instagram.user.model.User r5 = r2.A00
            X.DlH r4 = r1.A0C()
            boolean r1 = r4.A04
            if (r1 == 0) goto L_0x0276
            java.util.Set r3 = r4.A01
            boolean r1 = X.DbV.A1a(r5, r3)
            if (r1 == 0) goto L_0x027b
            java.lang.String r1 = r5.getId()
            r3.remove(r1)
        L_0x0271:
            r2 = 1
            r1 = 0
            X.C46787DlH.A00(r4, r1, r3, r2)
        L_0x0276:
            r1 = 1580344325(0x5e322405, float:3.20909758E18)
            goto L_0x0023
        L_0x027b:
            int r2 = r3.size()
            int r1 = r4.A01()
            if (r2 >= r1) goto L_0x0271
            java.lang.String r1 = r5.getId()
            r3.add(r1)
            goto L_0x0271
        L_0x028d:
            r0 = -1270971961(0xffffffffb43e81c7, float:-1.7742342E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.Der r5 = (X.C46430Der) r5
            X.Dex r1 = r5.A0E
            if (r1 == 0) goto L_0x0415
            java.util.List r1 = r1.A0C
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x02a6:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x02b0
            X.DbY.A1W(r3, r2)
            goto L_0x02a6
        L_0x02b0:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r3)
            r3 = 532(0x214, float:7.45E-43)
            java.lang.String r2 = r5.A0P
            java.lang.String r1 = "BATCH_MANAGE_FOLLOWING"
            X.C46430Der.A0K(r5, r1, r2, r4, r3)
            r1 = -2094130415(0xffffffff832e1b11, float:-5.1165075E-37)
            goto L_0x0023
        L_0x02c2:
            r0 = 1619813074(0x608c62d2, float:8.092703E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E2j r1 = (X.C47437E2j) r1
            X.FEs r1 = r1.A04
            if (r1 == 0) goto L_0x02d4
            r1.A02()
        L_0x02d4:
            r1 = 331881630(0x13c81c9e, float:5.0515317E-27)
            goto L_0x0023
        L_0x02d9:
            r0 = -2001906809(0xffffffff88ad5387, float:-1.0431696E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E2j r3 = (X.C47437E2j) r3
            X.FEs r5 = r3.A04
            if (r5 == 0) goto L_0x0312
            X.FAI r4 = r5.A09
            java.util.Map r2 = r4.A02
            java.util.Set r2 = r2.keySet()
            com.google.common.collect.ImmutableList r11 = X.DbU.A0K(r2)
            java.util.Deque r2 = r4.A01
            com.google.common.collect.ImmutableList r2 = X.DbU.A0K(r2)
            java.util.HashMap r12 = X.C49918FEs.A01(r2)
            java.lang.String r10 = r5.A01
            X.EZf r6 = X.C48137EZf.BLOCKED_ACCOUNTS
            X.EZZ r7 = X.EZZ.SUGGESTED_BLOCKS
            com.instagram.common.session.UserSession r9 = r5.A07
            X.0iw r8 = r5.A06
            r13 = 2
            X.0qQ.A0B(r10, r13)
            X.AnonymousClass7TG.A1S(r9, r8)
            X.C49760F5m.A01(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0312:
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r1)
            X.EvJ r2 = new X.EvJ
            r2.<init>(r3)
            r1 = 47
            X.FJg r4 = X.C50021FJg.A00(r2, r1)
            r1 = 46
            X.FJg r3 = X.C50021FJg.A00(r2, r1)
            X.8ab r2 = X.DbS.A0Y(r5)
            r1 = 2131953876(0x7f1308d4, float:1.9544235E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r5, r1)
            r2.A05 = r1
            r1 = 2131953875(0x7f1308d3, float:1.9544233E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r5, r1)
            r2.A0q(r1)
            r1 = 2131953874(0x7f1308d2, float:1.9544231E38)
            r2.A0K(r4, r1)
            X.DbX.A16(r3, r2)
            r1 = 704967227(0x2a04f23b, float:1.1807996E-13)
            goto L_0x0023
        L_0x034c:
            r0 = -1729925931(0xffffffff98e36cd5, float:-5.8788017E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E6h r1 = (X.C47521E6h) r1
            r1.D35()
            r1 = -1255654323(0xffffffffb5283c4d, float:-6.2672626E-7)
            goto L_0x0023
        L_0x035f:
            r0 = -732434451(0xffffffffd457efed, float:-3.70977302E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.Der r5 = (X.C46430Der) r5
            com.instagram.ui.widget.typeahead.TypeaheadHeader r1 = r5.A0B
            if (r1 == 0) goto L_0x0371
            r1.A01()
        L_0x0371:
            X.E6K r4 = new X.E6K
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.EVw r2 = r5.A0H
            java.lang.String r1 = "FollowListSortingOptionsFragment.SortingType"
            r3.putSerializable(r1, r2)
            com.instagram.common.session.UserSession r1 = X.C46430Der.A03(r5)
            X.DbU.A1D(r3, r1)
            r4.setArguments(r3)
            r4.A00 = r5
            X.37D r1 = X.DbX.A0i(r5)
            if (r1 == 0) goto L_0x0396
            r1.A0J(r4)
        L_0x0396:
            r1 = -985138798(0xffffffffc547f992, float:-3199.5981)
            goto L_0x0023
        L_0x039b:
            r0 = -1001934267(0xffffffffc447b245, float:-798.78546)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Der r1 = (X.C46430Der) r1
            com.instagram.common.session.UserSession r5 = X.C46430Der.A03(r1)
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.EZn r3 = X.C46430Der.A01(r1)
            r2 = 1
            r1 = 0
            X.C48958Emw.A00(r4, r3, r5, r2, r1)
            r1 = -1015301281(0xffffffffc37bbb5f, float:-251.73192)
            goto L_0x0023
        L_0x03bc:
            r0 = -1627326438(0xffffffff9f00f81a, float:-2.731028E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.Der r6 = (X.C46430Der) r6
            com.instagram.common.session.UserSession r1 = X.C46430Der.A03(r6)
            X.F2F r3 = new X.F2F
            r3.<init>(r6, r1)
            X.0wc r2 = r3.A01
            java.lang.String r1 = "follow_requests_manage_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            X.0iw r1 = r3.A00
            X.DbW.A15(r2, r1)
            r2.Cgf()
            X.Dex r1 = r6.A0E
            if (r1 == 0) goto L_0x0415
            java.util.List r1 = r1.A0C
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x03ee:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0404
            com.instagram.user.model.User r3 = X.DbT.A0k(r4)
            com.instagram.user.model.FollowStatus r2 = r3.B6o()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A06
            if (r2 != r1) goto L_0x03ee
            X.DbU.A1V(r3, r5)
            goto L_0x03ee
        L_0x0404:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r5)
            r3 = 0
            java.lang.String r2 = "BATCH_MANAGE_NON_RECIP_FOLLOWERS"
            r1 = 531(0x213, float:7.44E-43)
            X.C46430Der.A0K(r6, r2, r3, r4, r1)
            r1 = 672534996(0x281611d4, float:8.3305385E-15)
            goto L_0x0023
        L_0x0415:
            java.lang.String r0 = "followListAdapter"
            goto L_0x0695
        L_0x0419:
            r0 = -991325709(0xffffffffc4e991f3, float:-1868.5609)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E6P r2 = (X.E6P) r2
            boolean r1 = r2.A07
            if (r1 != 0) goto L_0x042b
            r2.A0d()
        L_0x042b:
            r1 = -1985523589(0xffffffff89a7507b, float:-4.027947E-33)
            goto L_0x0023
        L_0x0430:
            r0 = -1431904862(0xffffffffaaa6dda2, float:-2.9641312E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.EEF r5 = (X.EEF) r5
            com.instagram.common.session.UserSession r4 = r5.A04
            X.0iw r3 = r5.A03
            X.0wc r2 = X.AnonymousClass0kN.A01(r3, r4)
            java.lang.String r1 = "discover_people_non_personalized_upsell_tapped"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r2, r1)
            X.DbW.A15(r1, r3)
            r1.Cgf()
            androidx.fragment.app.Fragment r1 = r5.A01
            X.6Yo r2 = X.DbW.A0H(r1, r4)
            X.FC6.A01()
            X.E6o r1 = new X.E6o
            r1.<init>()
            X.Dba.A12(r1, r2)
            r1 = -1303827978(0xffffffffb24929f6, float:-1.1709281E-8)
            goto L_0x0023
        L_0x0465:
            r0 = -1332964006(0xffffffffb08c955a, float:-1.0228789E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.EEF r1 = (X.EEF) r1
            com.instagram.common.session.UserSession r5 = r1.A04
            androidx.fragment.app.Fragment r4 = r1.A01
            X.AnonymousClass7TG.A1N(r5, r4)
            X.1ZD r3 = X.AnonymousClass1ZD.A02
            if (r3 == 0) goto L_0x0c3a
            r1 = 0
            X.ELT r2 = new X.ELT
            r2.<init>((androidx.fragment.app.Fragment) r4, (X.0lg) r5)
            r2.A00 = r1
            r3.A00 = r2
            java.lang.String r1 = "20"
            r2.A04(r1)
            X.EZu r2 = X.C48152EZu.A04
            java.lang.String r1 = "upsell_primary_click"
            X.FFL.A00(r2, r5, r1)
            r1 = 177266133(0xa90ddd5, float:1.395014E-32)
            goto L_0x0023
        L_0x0496:
            r0 = 2105735561(0x7d82f989, float:2.1761913E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.EEF r5 = (X.EEF) r5
            X.EXN r2 = r5.A05
            java.lang.String r3 = "upsell_primary_click"
            if (r2 == 0) goto L_0x04b2
            X.EXN r1 = X.EXN.NUX_DISCOVER_PEOPLE_SCREEN
            if (r2 != r1) goto L_0x04f1
            com.instagram.common.session.UserSession r2 = r5.A04
            X.EZu r1 = X.C48152EZu.A0J
        L_0x04af:
            X.FFL.A00(r1, r2, r3)
        L_0x04b2:
            androidx.fragment.app.Fragment r4 = r5.A02
            boolean r1 = r4 instanceof X.G6Q
            if (r1 == 0) goto L_0x04c4
            X.G6Q r4 = (X.G6Q) r4
            if (r4 == 0) goto L_0x04bf
        L_0x04bc:
            r4.CJ1()
        L_0x04bf:
            r1 = 1225522680(0x490bfdf8, float:573407.5)
            goto L_0x0023
        L_0x04c4:
            androidx.fragment.app.Fragment r4 = r5.A01
            boolean r1 = r4 instanceof X.G6Q
            if (r1 == 0) goto L_0x04d2
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.share.facebook.listener.CanHandleShowFacebookFriendsEvent"
            X.0qQ.A0C(r4, r1)
            X.G6Q r4 = (X.G6Q) r4
            goto L_0x04bc
        L_0x04d2:
            X.1Z9 r3 = X.C48920EmK.A00()
            com.instagram.common.session.UserSession r2 = r5.A04
            X.G7U r1 = r5.A06
            X.ELU r3 = r3.A01(r4, r2, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = "IG_FB_DISCOVER_ACCOUNTS"
            java.lang.String r2 = X.DbT.A12(r2, r1)
            r1 = 0
            boolean r1 = r3.A06(r2, r1)
            if (r1 == 0) goto L_0x04bf
            r5.A01()
            goto L_0x04bf
        L_0x04f1:
            X.EXN r1 = X.EXN.FOLLOW_PEOPLE
            if (r2 != r1) goto L_0x04b2
            com.instagram.common.session.UserSession r2 = r5.A04
            X.EZu r1 = X.C48152EZu.A03
            goto L_0x04af
        L_0x04fa:
            r0 = -679759241(0xffffffffd77bb277, float:-2.76743919E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = -1372048260(0xffffffffae38347c, float:-4.1883372E-11)
            goto L_0x0023
        L_0x050b:
            r0 = -1136947171(0xffffffffbc3b901d, float:-0.0114479335)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.EBj r1 = (X.C47649EBj) r1
            com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment r4 = r1.A01
            java.lang.String r3 = r1.A00
            com.instagram.common.session.UserSession r1 = r4.getSession()
            X.1OC r2 = X.C49168EqZ.A00(r1, r3)
            X.EBj r1 = new X.EBj
            r1.<init>(r4, r3)
            r2.A00 = r1
            r4.schedule(r2)
            r1 = 1517112529(0x5a6d4cd1, float:1.66985075E16)
            goto L_0x0023
        L_0x0531:
            r0 = -1497025255(0xffffffffa6c53519, float:-1.3684013E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            com.instagram.ui.widget.loadmore2.LoadMoreButton r1 = (com.instagram.ui.widget.loadmore2.LoadMoreButton) r1
            X.G5G r1 = r1.A03
            if (r1 == 0) goto L_0x054c
            X.Fmk r1 = (X.C50997Fmk) r1
            X.E2k r1 = r1.A00
            X.F2s r1 = r1.A01
            X.0qQ.A0A(r1)
            r1.A00()
        L_0x054c:
            r1 = 72033080(0x44b2338, float:2.3878707E-36)
            goto L_0x0023
        L_0x0551:
            r0 = -1772398218(0xffffffff965b5976, float:-1.7718908E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.G6V r1 = (X.G6V) r1
            r1.Dhj()
            r1 = 1294621916(0x4d2a5cdc, float:1.78638272E8)
            goto L_0x0023
        L_0x0564:
            r0 = 1490343850(0x58d4d7aa, float:1.87218188E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E2i r2 = (X.C47436E2i) r2
            X.0eM r1 = r2.A04
            X.7Pr r1 = X.DbX.A0f(r1)
            X.7Pu r6 = r1.A00()
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            X.HM8 r4 = r2.A00
            X.E5T r3 = new X.E5T
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "trend_report_entrypoint"
            r2.putSerializable(r1, r4)
            r3.setArguments(r2)
            r6.A02(r5, r3)
            r1 = 243321598(0xe80cafe, float:3.174991E-30)
            goto L_0x0023
        L_0x0598:
            r0 = 274423151(0x105b5d6f, float:4.3262113E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = 1551049419(0x5c7322cb, float:2.73746698E17)
            goto L_0x0023
        L_0x05a9:
            r0 = 2013218228(0x77ff45b4, float:1.0355074E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E60 r4 = (X.E60) r4
            X.0eM r1 = r4.A03
            X.1Av r2 = X.DbX.A0h(r1)
            boolean r1 = r4.A01
            X.0xa r2 = r2.A01
            if (r1 == 0) goto L_0x05e3
            r1 = 3405(0xd4d, float:4.771E-42)
        L_0x05c2:
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0xY r1 = X.AnonymousClass7TG.A0g(r2, r1)
            r1.apply()
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r3 = X.DbV.A0g(r4, r1)
            if (r3 == 0) goto L_0x05de
            r2 = 7
            X.FmI r1 = new X.FmI
            r1.<init>(r4, r2)
            X.DbU.A1U(r1, r3, r3)
        L_0x05de:
            r1 = 14092999(0xd70ac7, float:1.9748498E-38)
            goto L_0x0023
        L_0x05e3:
            r1 = 3404(0xd4c, float:4.77E-42)
            goto L_0x05c2
        L_0x05e6:
            r0 = -1248191999(0xffffffffb59a1a01, float:-1.1481462E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r15.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.37D r3 = X.DbV.A0g(r1, r2)
            if (r3 == 0) goto L_0x0602
            r2 = 1
            X.FmH r1 = new X.FmH
            r1.<init>(r2)
            X.DbU.A1U(r1, r3, r3)
        L_0x0602:
            r1 = 1142388829(0x4417785d, float:605.8807)
            goto L_0x0023
        L_0x0607:
            r0 = -1990479831(0xffffffff895bb029, float:-2.6443996E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.GCd r4 = (X.C52031GCd) r4
            X.XQw r2 = X.C21251XQw.TAGS_AND_MENTIONS
            r1 = 0
            X.JaK r3 = X.Eq6.A00(r2, r1)
            android.app.Activity r2 = r4.A06
            X.DbS.A1X(r2)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            com.instagram.common.session.UserSession r1 = r4.A07
            X.Dbc.A0R(r3, r2, r1)
            r1 = -1090647373(0xffffffffbefe0ab3, float:-0.49617538)
            goto L_0x0023
        L_0x062a:
            r0 = -1102372238(0xffffffffbe4b2272, float:-0.19837359)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E6C r1 = (X.E6C) r1
            X.F2U r1 = r1.A01
            if (r1 == 0) goto L_0x063c
            r1.A00()
        L_0x063c:
            r1 = -587098841(0xffffffffdd019527, float:-5.8358827E17)
            goto L_0x0023
        L_0x0641:
            r0 = 1687441893(0x649451e5, float:2.1888154E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbZ.A0E(r1)
            r1.getClass()
            r1.onBackPressed()
            r1 = -660442189(0xffffffffd8a273b3, float:-1.42894246E15)
            goto L_0x0023
        L_0x0659:
            r0 = -387596148(0xffffffffe8e5c08c, float:-8.6797903E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E1B r5 = (X.E1B) r5
            X.0eM r1 = r5.A03
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            androidx.fragment.app.Fragment r2 = r5.mParentFragment
            boolean r1 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x067e
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
        L_0x0676:
            X.C63437Kwx.A00(r3, r5, r4, r2)
            r1 = 1766495860(0x694a9674, float:1.5307094E25)
            goto L_0x0023
        L_0x067e:
            r2 = 0
            goto L_0x0676
        L_0x0680:
            r0 = 119205651(0x71aef13, float:1.165593E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E1B r2 = (X.E1B) r2
            X.Eus r1 = r2.A00
            if (r1 == 0) goto L_0x06a6
            com.instagram.user.model.User r3 = r2.A01
            if (r3 != 0) goto L_0x069d
            java.lang.String r0 = "producer"
        L_0x0695:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x069d:
            java.lang.String r2 = "reel_viewer_photo_credit_popup"
            X.6ia r1 = r1.A00
            X.6iZ r1 = r1.A08
            r1.CHz(r3, r2)
        L_0x06a6:
            r1 = 1073456804(0x3ffba6a4, float:1.966023)
            goto L_0x0023
        L_0x06ab:
            r0 = -1970963723(0xffffffff8a857af5, float:-1.2853685E-32)
            int r0 = X.DbX.A03(r1, r0)
            java.lang.Object r1 = r15.A01
            X.E27 r1 = (X.E27) r1
            X.E27.A04(r1)
            r1 = 79961383(0x4c41d27, float:4.610615E-36)
            goto L_0x0023
        L_0x06be:
            r0 = -146741123(0xfffffffff740e87d, float:-3.9126423E33)
            int r0 = X.DbX.A03(r1, r0)
            java.lang.Object r1 = r15.A01
            X.E27 r1 = (X.E27) r1
            X.E27.A03(r1)
            r1 = -35944772(0xfffffffffddb86bc, float:-3.6475064E37)
            goto L_0x0023
        L_0x06d1:
            r0 = -245905230(0xfffffffff157c8b2, float:-1.06851045E30)
            int r0 = X.DbX.A03(r1, r0)
            java.lang.Object r1 = r15.A01
            X.E27 r1 = (X.E27) r1
            X.E27.A04(r1)
            r1 = 529628934(0x1f917f06, float:6.162003E-20)
            goto L_0x0023
        L_0x06e4:
            r0 = -913864507(0xffffffffc98788c5, float:-1110296.6)
            int r0 = X.DbX.A03(r1, r0)
            java.lang.Object r1 = r15.A01
            X.E27 r1 = (X.E27) r1
            X.E27.A03(r1)
            r1 = 395683844(0x1795a804, float:9.671312E-25)
            goto L_0x0023
        L_0x06f7:
            r0 = 1043765030(0x3e369726, float:0.17831096)
            int r0 = X.DbX.A03(r1, r0)
            java.lang.Object r1 = r15.A01
            X.E27 r1 = (X.E27) r1
            X.E27.A04(r1)
            r1 = 463142292(0x1b9afd94, float:2.5641034E-22)
            goto L_0x0023
        L_0x070a:
            r0 = 493787678(0x1d6e9a1e, float:3.1578714E-21)
            int r0 = X.DbX.A03(r1, r0)
            java.lang.Object r1 = r15.A01
            X.E27 r1 = (X.E27) r1
            X.E27.A03(r1)
            r1 = -1195252833(0xffffffffb8c1e39f, float:-9.245355E-5)
            goto L_0x0023
        L_0x071d:
            r0 = -657054559(0xffffffffd8d624a1, float:-1.88362247E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E4v r5 = (X.C47491E4v) r5
            X.0eM r4 = r5.A06
            X.0lg r3 = X.DbT.A0X(r4)
            java.lang.String r2 = "find_friends_fb"
            r1 = 0
            X.FEK.A00(r3, r1, r2)
            X.0lg r4 = X.DbT.A0X(r4)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36323869862145610(0x810c5e00002e4a, double:3.034699793080259E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x074d
            X.C47491E4v.A01(r5)
        L_0x0748:
            r1 = 1531927330(0x5b4f5b22, float:5.8365522E16)
            goto L_0x0023
        L_0x074d:
            r4 = 2131962547(0x7f132ab3, float:1.9561822E38)
            r1 = 18304240082688344(0x41079c00031958, double:1.8946196980520357E-307)
            boolean r1 = X.1AW.A06(r3, r1)
            if (r1 == 0) goto L_0x075e
            r4 = 2131962459(0x7f132a5b, float:1.9561644E38)
        L_0x075e:
            X.8ab r3 = X.Dba.A0H(r5)
            r1 = 2131970903(0x7f134b57, float:1.957877E38)
            r3.A08(r1)
            r1 = 37
            X.C50021FJg.A01(r3, r5, r1, r4)
            r2 = 2131973923(0x7f135723, float:1.9584896E38)
            r1 = 38
            X.FJg r1 = X.C50021FJg.A00(r5, r1)
            r3.A0H(r1, r2)
            X.DbT.A1V(r3)
            goto L_0x0748
        L_0x077d:
            r0 = -1400283227(0xffffffffac895fa5, float:-3.904393E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E4v r4 = (X.C47491E4v) r4
            X.0eM r7 = r4.A06
            X.0lg r6 = X.DbT.A0X(r7)
            java.lang.String r5 = "find_friends_fb"
            android.app.Activity r3 = X.DbT.A03(r4)
            r2 = 0
            r1 = 1
            X.C49208ErD.A00(r3, r2, r6, r5, r1)
            X.0lg r3 = X.DbT.A0X(r7)
            X.EZu r2 = X.C48152EZu.A0I
            java.lang.String r1 = "upsell_primary_click"
            X.FFL.A00(r2, r3, r1)
            X.0Tu r3 = X.0Tu.A06
            r1 = 18302350296879735(0x4105e400001277, double:1.89387275545521E-307)
            boolean r1 = X.1AW.A06(r3, r1)
            if (r1 != 0) goto L_0x07c8
            X.0Tu r3 = X.0Tu.A05
            r1 = 18302350297010809(0x4105e400021279, double:1.8938727555070174E-307)
            boolean r1 = X.1AW.A06(r3, r1)
            if (r1 == 0) goto L_0x07c8
            X.EXN r1 = X.EXN.A0E
        L_0x07c0:
            X.C47491E4v.A00(r1, r4)
            r1 = 642757037(0x264fb1ad, float:7.205835E-16)
            goto L_0x0023
        L_0x07c8:
            X.EXN r1 = X.EXN.NUX_FIND_FRIENDS
            goto L_0x07c0
        L_0x07cb:
            r0 = 436989285(0x1a0bed65, float:2.8936292E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.ESM r6 = (X.ESM) r6
            X.0eM r2 = r6.A06
            X.0lg r5 = X.DbT.A0X(r2)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = X.DbX.A0l(r1, r2)
            boolean r1 = r1.A2K()
            if (r1 == 0) goto L_0x07fe
            X.EXN r1 = X.EXN.A0Y
        L_0x07ea:
            java.lang.String r4 = r1.A01()
            java.lang.String r3 = "facebook_cross_posting_settings_clicked"
            r2 = 0
            r1 = 1
            X.C9831Rht.A00(r5, r3, r4, r2, r1)
            r1 = 0
            X.ESM.A07(r6, r1)
            r1 = 1137680194(0x43cf9f42, float:415.2442)
            goto L_0x0023
        L_0x07fe:
            X.EXN r1 = X.EXN.OPTION_LINKED_ACCOUNTS
            goto L_0x07ea
        L_0x0801:
            r0 = 2052125752(0x7a50f438, float:2.7123777E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.ESM r4 = (X.ESM) r4
            android.content.Context r3 = r4.requireContext()
            X.0eM r2 = r4.A06
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            X.Dfh r1 = r4.A01
            r8 = 1
            if (r1 == 0) goto L_0x083c
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x0825
            int r1 = r1.length()
            if (r1 != 0) goto L_0x083c
        L_0x0825:
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = X.DbX.A0l(r1, r2)
            boolean r1 = r1.CPm()
            if (r1 == 0) goto L_0x083c
        L_0x0831:
            java.lang.String r7 = "ig_cross_posting_settings"
            r5 = r4
            X.C50143FRa.A01(r3, r4, r5, r6, r7, r8)
            r1 = -1430267999(0xffffffffaabfd7a1, float:-3.4078038E-13)
            goto L_0x0023
        L_0x083c:
            r8 = 0
            goto L_0x0831
        L_0x083e:
            r0 = 2134119333(0x7f3413a5, float:2.3936304E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E2o r6 = (X.C47442E2o) r6
            X.02m r2 = X.C47442E2o.A00(r6)
            int r3 = r6.A00
            java.lang.String r1 = "nux_remind_later_click"
            r2.markerPoint(r3, r1)
            X.02m r2 = X.C47442E2o.A00(r6)
            r1 = 2
            r2.markerEnd(r3, r1)
            X.0eM r5 = r6.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.1Am r3 = X.1Al.A01(r1)
            X.1An r2 = X.1An.A18
            java.lang.Class r1 = r6.getClass()
            X.0xa r1 = r3.A04(r2, r1)
            X.0xY r4 = r1.AR4()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "IGD_PARENTAL_ACCESS_CONTROL_EDUCATION_REMIND_ME_LATER_TIMESTAMP_KEY"
            r4.E5c(r1, r2)
            r4.apply()
            java.lang.System.currentTimeMillis()
            X.6ap r3 = X.DbV.A0W()
            java.lang.String r1 = "delete_thread_education_remind_me"
            r3.A0H = r1
            android.content.res.Resources r2 = X.DbV.A05(r6)
            r1 = 2131971943(0x7f134f67, float:1.958088E38)
            X.DbT.A1D(r2, r3, r1)
            X.Dbb.A1Q(r3)
            X.6Yo r1 = X.DbZ.A0P(r6, r5)
            r1.A06()
            r1 = 1656332167(0x62b99f87, float:1.7120714E21)
            goto L_0x0023
        L_0x08a4:
            r0 = 1756188369(0x68ad4ed1, float:6.5473865E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E2o r4 = (X.C47442E2o) r4
            X.02m r2 = X.C47442E2o.A00(r4)
            int r3 = r4.A00
            java.lang.String r1 = "nux_continue_click"
            r2.markerPoint(r3, r1)
            X.02m r2 = X.C47442E2o.A00(r4)
            r1 = 2
            r2.markerEnd(r3, r1)
            r4.requireActivity()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r1 = r4.A01
            X.6Yo r2 = X.DbX.A0N(r2, r1)
            java.lang.String r1 = "nux"
            X.H0f r1 = X.C48860ElM.A00(r1)
            X.Dba.A12(r1, r2)
            r1 = 869946205(0x33da535d, float:1.016658E-7)
            goto L_0x0023
        L_0x08dd:
            r0 = -1758147578(0xffffffff9734cc06, float:-5.841865E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.ERo r2 = (X.C48025ERo) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r2 = r2.A01
            X.6Yo r3 = X.DbX.A0N(r1, r2)
            r1 = 1
            r3.A0F = r1
            X.0lg r1 = X.DbY.A0R(r2)
            X.E2e r2 = new X.E2e
            r2.<init>()
            android.os.Bundle r1 = X.DbV.A0A(r1)
            X.DbW.A0x(r1, r2, r3)
            r1 = 1829170517(0x6d06ed55, float:2.6098693E27)
            goto L_0x0023
        L_0x090a:
            r0 = 1523438761(0x5acdd4a9, float:2.89680963E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.ERo r2 = (X.C48025ERo) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r3 = r2.A01
            X.6Yo r2 = X.DbX.A0N(r1, r3)
            r1 = 1
            r2.A0F = r1
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.E2d r1 = X.C49139Eq2.A00(r1)
            r2.A0D(r1)
            r2.A04()
            r1 = -1698875981(0xffffffff9abd35b3, float:-7.8255324E-23)
            goto L_0x0023
        L_0x0935:
            r0 = -469552863(0xffffffffe4033121, float:-9.680254E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.Object r3 = r15.A01
            X.ES7 r3 = (X.ES7) r3
            com.instagram.common.session.UserSession r1 = r3.A00
            X.0qQ.A0A(r1)
            X.DbU.A1D(r4, r1)
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r1 = r3.A00
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            X.ERl r1 = new X.ERl
            r1.<init>()
            r1.setArguments(r4)
            r2.A0D(r1)
            r1 = 0
            r2.A0F(r3, r1)
            r2.A04()
            r1 = 1223302428(0x48ea1d1c, float:479464.88)
            goto L_0x0023
        L_0x096d:
            r0 = -1337302542(0xffffffffb04a61f2, float:-7.362636E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E3t r1 = (X.C47469E3t) r1
            r1.onBackPressed()
            r1 = -1957691613(0xffffffff8b4fff23, float:-4.0058693E-32)
            goto L_0x0023
        L_0x0980:
            r0 = 968032877(0x39b3026d, float:3.4143348E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.EQr r1 = (X.C48008EQr) r1
            X.C48008EQr.A00(r1)
            r1 = 684620026(0x28ce78fa, float:2.292306E-14)
            goto L_0x0023
        L_0x0993:
            r0 = -1903688895(0xffffffff8e880341, float:-3.352972E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.EQr r5 = (X.C48008EQr) r5
            com.instagram.common.session.UserSession r1 = r5.A04
            X.1NY r3 = X.DbU.A0N(r1)
            java.lang.String r1 = "accounts/send_password_reset_link/"
            r3.A0A(r1)
            java.lang.Class<X.DwE> r2 = X.DwE.class
            java.lang.Class<X.F6D> r1 = X.F6D.class
            X.1OC r4 = X.DbY.A0N(r3, r2, r1)
            android.content.Context r3 = r5.getContext()
            X.0hq r2 = r5.mFragmentManager
            X.ENe r1 = new X.ENe
            r1.<init>(r3)
            r1.A00 = r2
            r4.A00 = r1
            r5.schedule(r4)
            r1 = 1464345764(0x574824a4, float:2.20059696E14)
            goto L_0x0023
        L_0x09c8:
            r0 = 1458012417(0x56e78101, float:1.27270627E14)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E3D r2 = (X.E3D) r2
            X.DcU r1 = X.DcU.SATURDAY
            r0 = 1
            X.E3D.A08(r1, r2, r0)
            r0 = 874462561(0x341f3d61, float:1.4830358E-7)
            goto L_0x0c2c
        L_0x09de:
            r0 = -580594114(0xffffffffdd64d63e, float:-1.0305897E18)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E3D r2 = (X.E3D) r2
            X.DcU r1 = X.DcU.FRIDAY
            r0 = 1
            X.E3D.A08(r1, r2, r0)
            r0 = -1649440786(0xffffffff9daf87ee, float:-4.6462662E-21)
            goto L_0x0c2c
        L_0x09f4:
            r0 = -579322298(0xffffffffdd783e46, float:-1.11798823E18)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E3D r2 = (X.E3D) r2
            X.DcU r1 = X.DcU.THURSDAY
            r0 = 1
            X.E3D.A08(r1, r2, r0)
            r0 = -1424784690(0xffffffffab1382ce, float:-5.240642E-13)
            goto L_0x0c2c
        L_0x0a0a:
            r0 = -661767118(0xffffffffd88e3c32, float:-1.2511135E15)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E3D r2 = (X.E3D) r2
            X.DcU r1 = X.DcU.WEDNESDAY
            r0 = 1
            X.E3D.A08(r1, r2, r0)
            r0 = 1925503549(0x72c4da3d, float:7.7981307E30)
            goto L_0x0c2c
        L_0x0a20:
            r0 = -398697702(0xffffffffe83c5b1a, float:-3.5579417E24)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E3D r2 = (X.E3D) r2
            X.DcU r1 = X.DcU.TUESDAY
            r0 = 1
            X.E3D.A08(r1, r2, r0)
            r0 = -1615974131(0xffffffff9fae310d, float:-7.3773014E-20)
            goto L_0x0c2c
        L_0x0a36:
            r0 = -2111463014(0xffffffff8225a19a, float:-1.2168663E-37)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E3D r2 = (X.E3D) r2
            X.DcU r1 = X.DcU.MONDAY
            r0 = 1
            X.E3D.A08(r1, r2, r0)
            r0 = -64896760(0xfffffffffc21c108, float:-3.3594997E36)
            goto L_0x0c2c
        L_0x0a4c:
            r0 = -460172546(0xffffffffe49252fe, float:-2.1593639E22)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E3D r2 = (X.E3D) r2
            X.DcU r1 = X.DcU.SUNDAY
            r0 = 1
            X.E3D.A08(r1, r2, r0)
            r0 = -1515807734(0xffffffffa5a69c0a, float:-2.8902146E-16)
            goto L_0x0c2c
        L_0x0a62:
            r0 = -1100947266(0xffffffffbe60e0be, float:-0.21960732)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.2YL r3 = (X.2YL) r3
            r0 = 3256(0xcb8, float:4.563E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 28
            X.DbX.A1W(r3, r2, r1, r0)
            r0 = 2121367605(0x7e718035, float:8.025241E37)
            goto L_0x0c2c
        L_0x0a81:
            r0 = 1884908788(0x70596cf4, float:2.6915985E29)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.2YL r4 = (X.2YL) r4
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 3
            X.MGv r0 = new X.MGv
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = -1681549853(0xffffffff9bc595e3, float:-3.2687778E-22)
            goto L_0x0c2c
        L_0x0a9f:
            r0 = -1308262499(0xffffffffb2057f9d, float:-7.770635E-9)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.2YL r4 = (X.2YL) r4
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 4
            X.MGv r0 = new X.MGv
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = -542486083(0xffffffffdfaa51bd, float:-2.4545597E19)
            goto L_0x0c2c
        L_0x0abd:
            r0 = 1478798768(0x5824adb0, float:7.2426356E14)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5B r1 = (X.E5B) r1
            r0 = 1
            X.E5B.A00(r1, r0)
            r0 = -1475438128(0xffffffffa80e99d0, float:-7.915936E-15)
            goto L_0x0c2c
        L_0x0ad1:
            r0 = -1814135370(0xffffffff93de7db6, float:-5.616464E-27)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5B r1 = (X.E5B) r1
            r0 = 0
            X.E5B.A00(r1, r0)
            r0 = 876345353(0x343bf809, float:1.7505967E-7)
            goto L_0x0c2c
        L_0x0ae5:
            java.lang.Object r0 = r15.A01
            X.G7q r0 = (X.C51922G7q) r0
            r0.D84()
            return
        L_0x0aed:
            java.lang.Object r0 = r15.A01
            X.G7q r0 = (X.C51922G7q) r0
            r0.De2()
            return
        L_0x0af5:
            r0 = 446757057(0x1aa0f8c1, float:6.657633E-23)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E6i r6 = (X.C47522E6i) r6
            X.0eM r5 = r6.A0T
            X.7Pr r2 = X.DbX.A0f(r5)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131976689(0x7f1361f1, float:1.9590506E38)
            X.DbZ.A0z(r1, r2, r0)
            r0 = 1
            r2.A11 = r0
            X.7Pu r4 = r2.A00()
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.1Xj r0 = r6.A05
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0b3c
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0b37
            X.E0c r0 = X.C49190Eqv.A00(r2, r0)
            r4.A02(r3, r0)
            r0 = 2091349852(0x7ca7775c, float:6.956276E36)
            goto L_0x0c2c
        L_0x0b37:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0b3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0b41:
            r0 = -81809788(0xfffffffffb1fae84, float:-8.291148E35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E2k r3 = (X.C47438E2k) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A00
            X.6Yo r2 = X.DbU.A0Q(r1, r0)
            X.C46339Dch.A00()
            com.instagram.common.session.UserSession r0 = r3.A00
            if (r0 == 0) goto L_0x0b6d
            android.os.Bundle r1 = X.DbY.A09(r0)
            X.E2j r0 = new X.E2j
            r0.<init>()
            X.DbW.A0x(r1, r0, r2)
            r0 = -1690061722(0xffffffff9b43b466, float:-1.6188312E-22)
            goto L_0x0ba0
        L_0x0b6d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -2025461327(0xffffffff8745e9b1, float:-1.4889309E-34)
            goto L_0x0bab
        L_0x0b75:
            r0 = -2046268058(0xffffffff86086d66, float:-2.565913E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E2k r3 = (X.C47438E2k) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A00
            X.6Yo r2 = X.DbU.A0Q(r1, r0)
            X.C46339Dch.A00()
            com.instagram.common.session.UserSession r0 = r3.A00
            if (r0 == 0) goto L_0x0ba4
            android.os.Bundle r1 = X.DbY.A09(r0)
            X.E2l r0 = new X.E2l
            r0.<init>()
            X.DbW.A0x(r1, r0, r2)
            r0 = -346884711(0xffffffffeb52f599, float:-2.5503422E26)
        L_0x0ba0:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0ba4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1182215945(0xffffffffb988d0f7, float:-2.6095632E-4)
        L_0x0bab:
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0baf:
            r0 = 831578867(0x3190e2f3, float:4.2167527E-9)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.F2s r0 = (X.C49707F2s) r0
            r0.A00()
            r0 = 1607210392(0x5fcc1598, float:2.9411655E19)
            goto L_0x0c2c
        L_0x0bc1:
            java.lang.Object r0 = r15.A01
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = (com.instagram.ui.widget.editphonenumber.EditPhoneNumberView) r0
            android.widget.EditText r0 = r0.A01
            X.DbS.A1C(r0)
            return
        L_0x0bcb:
            java.lang.Object r0 = r15.A01
            X.EQs r0 = (X.C48009EQs) r0
            X.C48009EQs.A01(r0)
            return
        L_0x0bd3:
            long r0 = r0.getTimeInMillis()
            long r2 = X.AnonymousClass7TE.A0P(r0)
            int r1 = (int) r2
            java.lang.String r0 = "media_seconds"
            r5.putExtra(r0, r1)
            X.DbX.A17(r5, r4)
            X.DbX.A1J(r4)
            r0 = 1020090322(0x3ccd57d2, float:0.02506629)
            goto L_0x0c2c
        L_0x0beb:
            r0 = 1691079817(0x64cbd489, float:3.008003E22)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.EvK r0 = (X.C49418EvK) r0
            X.Der r6 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r6)
            X.6Yo r5 = X.DbU.A0Q(r1, r0)
            X.1YF r4 = X.C46339Dch.A01()
            com.instagram.common.session.UserSession r3 = X.C46430Der.A03(r6)
            com.instagram.user.model.User r0 = r6.A0C
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0c35
            java.lang.String r2 = r0.getId()
            com.instagram.user.model.User r0 = r6.A0C
            if (r0 == 0) goto L_0x0c30
            java.lang.String r1 = r0.getUsername()
            r0 = 1
            X.E6R r0 = r4.Cr4(r3, r2, r1, r0)
            r5.A0D(r0)
            r5.A04()
            r0 = 1199959418(0x4785ed7a, float:68570.95)
        L_0x0c2c:
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x0c30:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0c35:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0c3a:
            X.DbS.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP4.onClick(android.view.View):void");
    }
}
