package X;

import android.view.View;

public final class FPC implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FPC(C46656Dib dib, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.A01 = dib;
                return;
            default:
                this.A01 = dib;
                return;
        }
    }

    public static FPC A00(Object obj, int i) {
        return new FPC(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FPC(obj, i), view);
    }

    public static void A02(View view, C46656Dib dib, int i) {
        AnonymousClass0fU.A00(new FPC(dib, i), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:219:0x09bc, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x09bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x09cb, code lost:
        r9 = com.facebook.fbreactmodules.datepicker.DatePickerDialogModule.ARG_MODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0aba, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0abd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0cc5, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0cc8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0f5e, code lost:
        if (r2.A03.Bx0() != null) goto L_0x0f60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x11a0, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x11a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x135d, code lost:
        r9 = "qplHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x1360, code lost:
        r9 = "userForEditing";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x1363, code lost:
        r9 = "searchController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x13cd, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x13d4, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x140b, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x140e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x08f2  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x096e  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0b41  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0b53  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r27) {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x1355;
                case 1: goto L_0x122c;
                case 2: goto L_0x11e6;
                case 3: goto L_0x1189;
                case 4: goto L_0x1117;
                case 5: goto L_0x0311;
                case 6: goto L_0x02bd;
                case 7: goto L_0x10ce;
                case 8: goto L_0x1087;
                case 9: goto L_0x1026;
                case 10: goto L_0x0fa6;
                case 11: goto L_0x0f2c;
                case 12: goto L_0x0298;
                case 13: goto L_0x0271;
                case 14: goto L_0x0ee4;
                case 15: goto L_0x024a;
                case 16: goto L_0x0ea9;
                case 17: goto L_0x0e74;
                case 18: goto L_0x0e35;
                case 19: goto L_0x0dd8;
                case 20: goto L_0x0239;
                case 21: goto L_0x0207;
                case 22: goto L_0x00f0;
                case 23: goto L_0x00b7;
                case 24: goto L_0x0dac;
                case 25: goto L_0x00a4;
                case 26: goto L_0x0d75;
                case 27: goto L_0x0d50;
                case 28: goto L_0x0cfa;
                case 29: goto L_0x0cd4;
                case 30: goto L_0x0c98;
                case 31: goto L_0x0c88;
                case 32: goto L_0x0c78;
                case 33: goto L_0x0bae;
                case 34: goto L_0x0b84;
                case 35: goto L_0x1366;
                case 36: goto L_0x0ada;
                case 37: goto L_0x0abe;
                case 38: goto L_0x0a75;
                case 39: goto L_0x0a0e;
                case 40: goto L_0x09e0;
                case 41: goto L_0x09cf;
                case 42: goto L_0x088c;
                case 43: goto L_0x082a;
                case 44: goto L_0x07f2;
                case 45: goto L_0x0796;
                case 46: goto L_0x074f;
                case 47: goto L_0x0738;
                case 48: goto L_0x071d;
                case 49: goto L_0x0709;
                case 50: goto L_0x06ea;
                case 51: goto L_0x06c4;
                case 52: goto L_0x0641;
                case 53: goto L_0x0609;
                case 54: goto L_0x05b1;
                case 55: goto L_0x0555;
                case 56: goto L_0x0044;
                case 57: goto L_0x052b;
                case 58: goto L_0x0518;
                case 59: goto L_0x04f2;
                case 60: goto L_0x04c3;
                case 61: goto L_0x0350;
                case 62: goto L_0x046a;
                case 63: goto L_0x0452;
                case 64: goto L_0x0410;
                case 65: goto L_0x03f5;
                case 66: goto L_0x03ab;
                case 67: goto L_0x0396;
                case 68: goto L_0x033b;
                case 69: goto L_0x0034;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1806152305(0x6ba7b271, float:4.0546656E26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E5Y r0 = (X.E5Y) r0
            X.0eM r0 = r0.A0J
            java.lang.Object r1 = r0.getValue()
            X.JiV r1 = (X.C60274JiV) r1
            X.05G r0 = r1.A08
            java.lang.Object r0 = r0.getValue()
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            X.F0l r0 = (X.C49654F0l) r0
            if (r0 == 0) goto L_0x002d
            X.Fk7 r0 = X.Fk7.A00
            X.C60274JiV.A00(r0, r1)
        L_0x002d:
            r0 = 1320471314(0x4eb4cb12, float:1.51660365E9)
        L_0x0030:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0034:
            r0 = -1240761058(0xffffffffb60b7d1e, float:-2.0785442E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = -1974807820(0xffffffff8a4ad2f4, float:-9.765622E-33)
            goto L_0x0030
        L_0x0044:
            r0 = 1729014647(0x670eab77, float:6.73739E23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.Object r6 = r1.A01
            X.E3E r6 = (X.E3E) r6
            X.F1D r0 = r6.A0E
            if (r0 == 0) goto L_0x1360
            java.lang.String r5 = r0.A0M
            java.lang.String r2 = r0.A0B
            java.lang.String r1 = r0.A0H
            boolean r0 = r0.A0Z
            r0 = r0 ^ 1
            X.Dbc.A0L(r3, r2, r1, r5, r0)
            X.EVZ r0 = X.EVZ.ARGUMENT_EDIT_PROFILE_FLOW
            X.C48975EnD.A00(r3, r0)
            java.lang.String r1 = "ENTRYPOINT"
            java.lang.String r0 = "personal_information"
            r3.putString(r1, r0)
            X.FBX r2 = r6.A0F
            if (r2 == 0) goto L_0x135d
            r1 = 857808781(0x33211f8d, float:3.751443E-8)
            java.lang.String r0 = "contact_point"
            r2.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0eM r0 = r6.A0L
            X.6Yo r2 = X.DbX.A0N(r1, r0)
            X.F3j r1 = X.DbW.A0X()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.E5C r0 = r1.A01(r0)
            r2.A0B(r3, r0)
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A = r0
            r2.A04()
            r0 = -1748694536(0xffffffff97c509f8, float:-1.2733343E-24)
            goto L_0x0030
        L_0x00a4:
            r0 = 3858784(0x3ae160, float:5.407308E-39)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E38 r0 = (X.E38) r0
            X.E38.A01(r0)
            r0 = 2003430413(0x7769ec0d, float:4.7445033E33)
            goto L_0x0030
        L_0x00b7:
            r0 = -265450955(0xfffffffff02d8a35, float:-2.1483195E29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E71 r0 = (X.E71) r0
            X.FGB r3 = r0.A09
            if (r3 == 0) goto L_0x1363
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x00e1
            X.6ve r2 = r3.A01
            r1 = 1
            java.lang.String r0 = "bio_remained_same"
            r2.A0A(r0, r1)
            java.lang.String r0 = "edit_bio"
            r2.A04(r0)
            X.4DH r0 = r3.A09
            X.DbT.A1J(r0)
        L_0x00dc:
            r0 = 716217658(0x2ab09d3a, float:3.1372978E-13)
            goto L_0x0030
        L_0x00e1:
            X.4DH r0 = r3.A09
            android.content.Context r1 = r0.requireContext()
            r0 = 4
            X.FJg r0 = X.C50021FJg.A00(r3, r0)
            X.FCN.A00(r1, r0)
            goto L_0x00dc
        L_0x00f0:
            r0 = -2073207572(0xffffffff846d5cec, float:-2.7901884E-36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E71 r0 = (X.E71) r0
            X.FGB r7 = r0.A09
            if (r7 == 0) goto L_0x1363
            boolean r0 = r7.A03
            r6 = 1
            if (r0 != 0) goto L_0x011a
            X.6ve r1 = r7.A01
            java.lang.String r0 = "bio_remained_same"
            r1.A0A(r0, r6)
            java.lang.String r0 = "edit_bio"
            r1.A04(r0)
            X.4DH r0 = r7.A09
            X.DbT.A1J(r0)
        L_0x0115:
            r0 = -411668960(0xffffffffe7766e20, float:-1.1637336E24)
            goto L_0x0030
        L_0x011a:
            com.instagram.common.session.UserSession r11 = r7.A0D
            X.F3s r0 = X.C49061Eof.A00(r11)
            X.EWT r2 = X.EWT.EDIT_BIO_FLOW
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r0.A00(r2, r10)
            X.F3s r1 = X.C49061Eof.A00(r11)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A00(r2, r0)
            X.6ve r1 = r7.A01
            java.lang.String r0 = "bio_change_confirmed"
            r1.A0A(r0, r6)
            android.widget.EditText r0 = r7.A06
            java.lang.String r9 = X.AnonymousClass7TF.A0f(r0)
            r8 = 0
            X.0qQ.A0B(r9, r6)
            java.util.List r1 = X.0Gl.A03(r11)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0194
            java.util.ArrayList r13 = X.C253053q8.A05(r9, r8)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0194
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r1.iterator()
        L_0x015d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0196
            com.instagram.user.model.User r2 = X.DbT.A0k(r12)
            java.util.Iterator r5 = r13.iterator()
        L_0x016b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r5.next()
            X.3uc r0 = (X.C255723uc) r0
            java.lang.String r1 = r0.A02
            int r0 = r1.length()
            if (r0 <= r6) goto L_0x016b
            java.lang.String r1 = r1.substring(r6)
            X.0qQ.A07(r1)
            java.lang.String r0 = r2.getUsername()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016b
            X.DbU.A1V(r2, r3)
            goto L_0x015d
        L_0x0194:
            X.0sn r3 = X.0sn.A00
        L_0x0196:
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x01c7
            X.0iw r2 = r7.A0A
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.Iterator r1 = r3.iterator()
        L_0x01a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b1
            X.DbT.A1W(r1, r5)
            goto L_0x01a7
        L_0x01b1:
            X.0xN r3 = X.C60510iO.A00(r11)
            java.lang.String r0 = "profile_tagging_mas_account_linked"
            X.0xI r2 = X.0xI.A00(r2, r0)
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "mas_account_pks"
            r2.A0C(r0, r1)
            r3.EFq(r2)
        L_0x01c7:
            X.4DH r5 = r7.A09
            java.lang.String r3 = X.DbZ.A0i(r5)
            X.1NY r2 = new X.1NY
            r2.<init>(r11)
            r2.A08(r10)
            java.lang.String r0 = "accounts/set_biography/"
            r2.A0A(r0)
            java.lang.String r0 = "raw_text"
            r2.A9m(r0, r9)
            r1 = 9
            r0 = 14
            java.lang.String r0 = X.Dbm.A02(r8, r1, r0)
            r2.A9m(r0, r3)
            r2.A0R = r6
            java.lang.Class<X.Dvm> r1 = X.C47352Dvm.class
            java.lang.Class<X.F6y> r0 = X.C49790F6y.class
            X.1OC r2 = X.DbT.A0S(r2, r1, r0)
            r1 = 33
            X.EDa r0 = new X.EDa
            r0.<init>(r7, r1)
            r2.A00 = r0
            X.Dbb.A15(r5, r2)
            X.2dY r0 = X.2dZ.A0t
            X.DbY.A17(r5, r0, r6)
            goto L_0x0115
        L_0x0207:
            r0 = 1977929059(0x75e4cd63, float:5.8008273E32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E6x r3 = (X.C47534E6x) r3
            com.instagram.common.session.UserSession r0 = r3.getSession()
            int r1 = r3.A00
            X.1NY r2 = X.DbZ.A0L(r0)
            java.lang.String r0 = "hpi_accounts/set_account_category/"
            X.Dba.A1H(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0 = 1065(0x429, float:1.492E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1OC r1 = X.DbT.A0T(r2, r0, r1)
            r0 = 31
            X.C47691EDa.A00(r3, r1, r0)
            r0 = -908991178(0xffffffffc9d1e536, float:-1719462.8)
            goto L_0x0030
        L_0x0239:
            r0 = -74868962(0xfffffffffb89971e, float:-1.4288194E36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -511399039(0xffffffffe184ab81, float:-3.0591605E20)
            goto L_0x0030
        L_0x024a:
            r0 = -1350906266(0xffffffffaf7ace66, float:-2.2810695E-10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Dib r2 = (X.C46656Dib) r2
            com.instagram.common.session.UserSession r1 = r2.A0V
            X.F1D r0 = r2.A0e
            r0.getClass()
            java.lang.String r0 = r0.A0M
            X.1OC r1 = X.C318486p2.A04(r1, r0)
            X.ECo r0 = new X.ECo
            r0.<init>(r2)
            r1.A00 = r0
            r2.schedule(r1)
            r0 = 968034024(0x39b306e8, float:3.4146686E-4)
            goto L_0x0030
        L_0x0271:
            r0 = 724738431(0x2b32a17f, float:6.3462424E-13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dib r0 = (X.C46656Dib) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A0V
            X.6Yo r2 = X.DbU.A0Q(r1, r0)
            X.XQw r1 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            r0 = 0
            X.JaK r0 = X.Eq6.A00(r1, r0)
            r2.A0E(r0)
            r2.A04()
            r0 = -785613761(0xffffffffd12c7c3f, float:-4.630118E10)
            goto L_0x0030
        L_0x0298:
            r0 = 1442586129(0x55fc1e11, float:3.46507581E13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dib r0 = (X.C46656Dib) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A0V
            X.6Yo r1 = X.C46447Df9.A01(r1, r0)
            X.E6x r0 = new X.E6x
            r0.<init>()
            r1.A0E(r0)
            r1.A04()
            r0 = 390371975(0x17449a87, float:6.3526057E-25)
            goto L_0x0030
        L_0x02bd:
            r0 = 2002022922(0x7754720a, float:4.308906E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.Object r6 = r1.A01
            X.Dib r6 = (X.C46656Dib) r6
            X.F1D r0 = r6.A0e
            r0.getClass()
            java.lang.String r3 = r0.A0M
            java.lang.String r2 = r0.A0B
            java.lang.String r1 = r0.A0H
            boolean r0 = r0.A0Z
            r0 = r0 ^ 1
            X.Dbc.A0L(r5, r2, r1, r3, r0)
            X.EVZ r0 = X.EVZ.ARGUMENT_EDIT_PROFILE_FLOW
            X.C48975EnD.A00(r5, r0)
            java.lang.String r1 = "ENTRYPOINT"
            java.lang.String r0 = "edit_profile"
            r5.putString(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = r6.A0V
            X.6Yo r2 = X.DbS.A0M(r1, r0)
            X.F3j r1 = X.DbW.A0X()
            com.instagram.common.session.UserSession r0 = r6.A0V
            X.E5C r0 = r1.A01(r0)
            r2.A0B(r5, r0)
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A = r0
            r2.A04()
            r0 = 1105978170(0x41ebe33a, float:29.48595)
            goto L_0x0030
        L_0x0311:
            r0 = 1276502253(0x4c15e0ed, float:3.928978E7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.Object r3 = r1.A01
            X.Dib r3 = (X.C46656Dib) r3
            X.F1D r0 = r3.A0e
            r0.getClass()
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "edit_profile"
            X.E3J r2 = r2.A03(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A0V
            X.Dbb.A12(r2, r1, r0)
            r0 = -759893401(0xffffffffd2b4f267, float:-3.88580475E11)
            goto L_0x0030
        L_0x033b:
            r0 = -1047428278(0xffffffffc191834a, float:-18.189106)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.FkC r0 = (X.FkC) r0
            X.0sa r0 = r0.A02
            r0.invoke()
            r0 = -1687501539(0xffffffff9b6ac51d, float:-1.9419717E-22)
            goto L_0x140b
        L_0x0350:
            r0 = -724212963(0xffffffffd4d5631d, float:-7.331927E12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E6z r1 = (X.C47536E6z) r1
            android.content.Context r7 = r1.getContext()
            android.widget.EditText r0 = r1.A00
            if (r0 != 0) goto L_0x0367
            java.lang.String r9 = "integrationIdInput"
            goto L_0x13cd
        L_0x0367:
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r0)
            int r0 = r6.length()
            if (r0 != 0) goto L_0x037c
            r0 = 2131958421(0x7f131a95, float:1.9553454E38)
        L_0x0374:
            X.C59689JTv.A07(r7, r0)
        L_0x0377:
            r0 = -2055476782(0xffffffff857be9d2, float:-1.1844909E-35)
            goto L_0x140b
        L_0x037c:
            X.1Wj r5 = X.1Wj.A00
            if (r5 == 0) goto L_0x0377
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            com.instagram.common.session.UserSession r3 = r1.getSession()
            java.util.Map r1 = r1.A02
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            r5.A01(r4, r3, r6, r0)
            r0 = 2131958433(0x7f131aa1, float:1.9553478E38)
            goto L_0x0374
        L_0x0396:
            r0 = -1795120585(0xffffffff9500a237, float:-2.597736E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.FkC r0 = (X.FkC) r0
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = -392629662(0xffffffffe898f262, float:-5.778167E24)
            goto L_0x140b
        L_0x03ab:
            r0 = -1246632847(0xffffffffb5b1e471, float:-1.3254013E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.8hD r1 = (X.C362028hD) r1
            X.0eM r0 = r1.A0D
            java.lang.Object r6 = r0.getValue()
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r6 = (com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel) r6
            X.4DH r0 = r1.A04
            android.content.Context r1 = r0.getContext()
            r0 = 2131165489(0x7f070131, float:1.7945197E38)
            int r5 = X.I7E.A00(r1, r0)
            X.05G r0 = r6.A0G
            java.lang.Object r0 = r0.getValue()
            X.JwK r0 = (X.C61082JwK) r0
            java.lang.Object r0 = r0.A00
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r4 = r0.size()
            r0 = 7
            X.9NK r3 = new X.9NK
            r3.<init>(r6, r0)
            r0 = 47
            X.MJ3 r1 = new X.MJ3
            r1.<init>(r5, r0, r6)
            X.FkC r0 = new X.FkC
            r0.<init>(r3, r1, r4)
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel.A01(r0, r6)
            r0 = 1000830757(0x3ba77725, float:0.0051106387)
            goto L_0x140b
        L_0x03f5:
            r0 = 538765384(0x201ce848, float:1.329057E-19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E1G r0 = (X.E1G) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r0 = (com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel) r0
            r0.A06()
            r0 = 549266021(0x20bd2265, float:3.2040606E-19)
            goto L_0x140b
        L_0x0410:
            r0 = 1582071944(0x5e4c8088, float:3.68398188E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KXd r4 = (X.C62041KXd) r4
            X.0eM r0 = r4.A0C
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            r13 = 1
            r6 = 0
            r9 = -2
            r10 = 0
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r7 = r6
            r11 = r10
            r12 = r10
            r14 = r10
            X.NKM r3 = X.C70139Nxt.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.7Pr r0 = X.DbX.A0f(r0)
            X.DbS.A1S(r0, r13)
            X.7Pu r1 = r0.A00()
            X.FbG r0 = new X.FbG
            r0.<init>(r13, r4, r1)
            r3.A01 = r0
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.0nA.A0J(r0)
            X.DbU.A1I(r4, r3, r1)
            r0 = 2085918581(0x7c549775, float:4.4153554E36)
            goto L_0x140b
        L_0x0452:
            r0 = 1379037636(0x523271c4, float:1.91603212E11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E6z r1 = (X.C47536E6z) r1
            java.util.Map r0 = r1.A02
            r0.clear()
            X.C47536E6z.A00(r1)
            r0 = -1205423736(0xffffffffb826b188, float:-3.9742823E-5)
            goto L_0x140b
        L_0x046a:
            r0 = -39946798(0xfffffffffd9e75d2, float:-2.6328723E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            android.view.LayoutInflater r1 = r7.getLayoutInflater()
            X.0qQ.A07(r1)
            r0 = 2131628583(0x7f0e1227, float:1.8884463E38)
            android.view.View r3 = X.DbU.A08(r1, r0)
            r0 = 2131428185(0x7f0b0359, float:1.8478007E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r3, r0)
            r0 = 2131428186(0x7f0b035a, float:1.847801E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r3, r0)
            android.content.Context r0 = r7.requireContext()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            r0 = 2131958405(0x7f131a85, float:1.9553421E38)
            java.lang.String r0 = r7.getString(r0)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            android.app.AlertDialog$Builder r4 = r0.setView(r3)
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r3 = r7.getString(r0)
            r1 = 32
            X.FJl r0 = new X.FJl
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r5)
            android.app.AlertDialog$Builder r0 = r4.setPositiveButton(r3, r0)
            r0.show()
            r0 = -453486473(0xffffffffe4f85877, float:-3.6649337E22)
            goto L_0x140b
        L_0x04c3:
            r0 = -1574268543(0xffffffffa22a9181, float:-2.3116325E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.DoN r3 = (X.C46969DoN) r3
            android.widget.TextView r2 = r3.A01
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L_0x04e8
            r1 = 8
            r2.setVisibility(r1)
            android.widget.TextView r2 = r3.A02
            r1 = 2131958427(0x7f131a9b, float:1.9553466E38)
        L_0x04e0:
            r2.setText(r1)
            r1 = 1109261735(0x421dfda7, float:39.497707)
            goto L_0x11a0
        L_0x04e8:
            r1 = 0
            r2.setVisibility(r1)
            android.widget.TextView r2 = r3.A02
            r1 = 2131958426(0x7f131a9a, float:1.9553464E38)
            goto L_0x04e0
        L_0x04f2:
            r0 = -1908998653(0xffffffff8e36fe03, float:-2.2555534E-30)
            r3 = r27
            int r2 = X.DbX.A03(r3, r0)
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r3)
            java.lang.Object r0 = r1.A01
            X.DoN r0 = (X.C46969DoN) r0
            android.widget.TextView r0 = r0.A01
            java.lang.String r1 = X.DbV.A0y(r0)
            r0 = 0
            X.0nC.A01(r3, r1, r0)
            r0 = 2131958413(0x7f131a8d, float:1.9553437E38)
            X.C59689JTv.A06(r3, r0)
            r0 = 450738195(0x1addb813, float:9.1700846E-23)
            goto L_0x140b
        L_0x0518:
            r0 = 1007523058(0x3c0d94f2, float:0.008641468)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E6N r0 = (X.E6N) r0
            X.E6N.A01(r0)
            r0 = 1940149082(0x73a4535a, float:2.603843E31)
            goto L_0x140b
        L_0x052b:
            r0 = -1971492104(0xffffffff8a7d6af8, float:-1.22016255E-32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E3E r3 = (X.E3E) r3
            X.0eM r0 = r3.A0L
            X.0lg r1 = X.DbT.A0X(r0)
            X.F1D r0 = r3.A0E
            if (r0 == 0) goto L_0x1360
            java.lang.String r0 = r0.A0M
            X.1OC r1 = X.C318486p2.A04(r1, r0)
            X.ECp r0 = new X.ECp
            r0.<init>(r3)
            r1.A00 = r0
            r3.schedule(r1)
            r0 = -126652836(0xfffffffff8736e5c, float:-1.9749476E34)
            goto L_0x140b
        L_0x0555:
            r0 = 1255879302(0x4adb3286, float:7182659.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E3E r3 = (X.E3E) r3
            android.content.Context r2 = r3.requireContext()
            r1 = 2131963025(0x7f132c91, float:1.9562792E38)
            java.lang.String r1 = r2.getString(r1)
            X.0qQ.A07(r1)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r2 = r3.A0L
            X.6Yo r6 = X.DbX.A0N(r1, r2)
            r1 = 1
            r6.A0F = r1
            X.C46447Df9.A03()
            X.F1D r1 = r3.A0E
            java.lang.String r9 = "userForEditing"
            if (r1 == 0) goto L_0x13cd
            int r5 = r1.A00
            java.lang.String r4 = r1.A0C
            boolean r3 = X.AnonymousClass7TF.A1V(r4)
            r2.getValue()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "gender"
            r2.putInt(r1, r5)
            if (r4 == 0) goto L_0x059f
            java.lang.String r1 = "custom_gender"
            r2.putString(r1, r4)
        L_0x059f:
            java.lang.String r1 = "should_show_custom_gender"
            r2.putBoolean(r1, r3)
            X.E70 r1 = new X.E70
            r1.<init>()
            X.DbW.A0x(r2, r1, r6)
            r1 = 2058708313(0x7ab56559, float:4.7093065E35)
            goto L_0x11a0
        L_0x05b1:
            r0 = 1709961780(0x65ebf234, float:1.39278E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E3E r3 = (X.E3E) r3
            X.0eM r1 = r3.A0L
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            android.content.Context r4 = r3.requireContext()
            r10 = 0
            r7 = r10
            r8 = r10
            r9 = r10
            X.1OC r4 = X.C318486p2.A03(r4, r5, r6, r7, r8, r9)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r9 = X.DbX.A0l(r0, r1)
            X.F1D r8 = r3.A0E
            if (r8 == 0) goto L_0x1360
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            com.instagram.igds.components.form.IgFormField r0 = r3.A0B
            if (r0 != 0) goto L_0x05ea
            java.lang.String r9 = "emailField"
            goto L_0x13cd
        L_0x05ea:
            java.lang.CharSequence r1 = r0.getText()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x05f8
            java.lang.String r10 = r1.toString()
        L_0x05f8:
            java.lang.String r11 = "personal_information"
            X.ECB r5 = new X.ECB
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.A00 = r5
            r3.schedule(r4)
            r0 = -1249464145(0xffffffffb586b0af, float:-1.00352E-6)
            goto L_0x140b
        L_0x0609:
            r0 = 1968831852(0x7559fd6c, float:2.7633506E32)
            int r5 = X.AnonymousClass0fD.A05(r0)
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.Object r4 = r1.A01
            X.E3E r4 = (X.E3E) r4
            X.F1D r0 = r4.A0E
            if (r0 == 0) goto L_0x1360
            java.lang.String r1 = r0.A0D
            X.0qQ.A07(r1)
            java.lang.String r0 = "personal_information"
            X.E3J r3 = r2.A03(r1, r0)
            X.FBX r2 = r4.A0F
            if (r2 == 0) goto L_0x135d
            r1 = 857808781(0x33211f8d, float:3.751443E-8)
            java.lang.String r0 = "contact_point"
            r2.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r0 = r4.A0L
            X.Dbc.A0S(r3, r1, r0)
            r0 = -752578633(0xffffffffd3248fb7, float:-7.0678577E11)
            goto L_0x0aba
        L_0x0641:
            r0 = 607213474(0x243157a2, float:3.8454985E-17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E3E r4 = (X.E3E) r4
            X.0eM r6 = r4.A0L
            X.0lg r0 = X.DbT.A0X(r6)
            java.lang.String r2 = r4.A0J
            if (r2 != 0) goto L_0x065a
            java.lang.String r9 = "originalBirthday"
            goto L_0x13cd
        L_0x065a:
            r5 = 0
            X.0Aj r1 = X.Dbb.A0E(r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x066a
            java.lang.String r0 = "personal_information_birthday_tapped"
            X.Dbb.A1E(r1, r0, r2)
        L_0x066a:
            X.0lg r7 = X.DbT.A0X(r6)
            if (r7 == 0) goto L_0x0698
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313712264480967(0x810321000008c7, double:3.028276087415776E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0698
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.1NY r1 = X.DbZ.A0L(r0)
            java.lang.String r0 = "age_platform/age_verification/resume/"
            X.Dba.A1H(r1, r0)
            X.1OC r1 = X.DbW.A0K(r1)
            r0 = 11
            X.C47696EDf.A00(r4, r1, r0)
        L_0x0693:
            r0 = -987487399(0xffffffffc5242359, float:-2626.2092)
            goto L_0x09bc
        L_0x0698:
            X.F1D r0 = r4.A0E
            if (r0 == 0) goto L_0x1360
            java.util.Date r0 = r0.A0P
            if (r0 == 0) goto L_0x06c0
            r2 = 1
            long r0 = r0.getTime()
            boolean r0 = X.F78.A01(r0, r2)
            if (r0 == 0) goto L_0x06c0
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r6, r2)
            X.FCN.A02(r1, r0, r5)
            X.0wc r1 = X.DbX.A0P(r4, r6)
            java.lang.String r0 = "editdob_update_age_alert_upsell_impression"
            X.DbZ.A1R(r1, r0)
            goto L_0x0693
        L_0x06c0:
            X.E3E.A00(r4)
            goto L_0x0693
        L_0x06c4:
            r0 = 1482898001(0x58633a51, float:9.9935843E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E3E r3 = (X.E3E) r3
            X.0eM r0 = r3.A0L
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1NY r1 = X.DbZ.A0L(r0)
            java.lang.String r0 = "age_platform/age_verification/resume/"
            X.Dba.A1H(r1, r0)
            X.1OC r0 = X.DbW.A0K(r1)
            r3.schedule(r0)
            r0 = -1804860309(0xffffffff946c046b, float:-1.19158264E-26)
            goto L_0x140b
        L_0x06ea:
            r0 = -1804982302(0xffffffff946a27e2, float:-1.18218464E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E3E r1 = (X.E3E) r1
            X.0eM r0 = r1.A0L
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            java.lang.String r0 = "https://m.facebook.com/profile/edit/infotab/section/forms/?section=basic-info"
            X.C49845F9k.A00(r1, r3, r0)
            r0 = -599179427(0xffffffffdc493f5d, float:-2.26584556E17)
            goto L_0x140b
        L_0x0709:
            r0 = -908025314(0xffffffffc9e0a21e, float:-1840195.8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E3E r1 = (X.E3E) r1
            r0 = 0
            X.E3E.A01(r1, r0)
            r0 = 467089252(0x1bd73764, float:3.5604562E-22)
            goto L_0x140b
        L_0x071d:
            r0 = 1712686616(0x66158618, float:1.7652655E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E5U r0 = (X.E5U) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Dl1 r0 = (X.C46774Dl1) r0
            r0.A00()
            r0 = 1200099920(0x47881250, float:69668.625)
            goto L_0x140b
        L_0x0738:
            r0 = -1378113622(0xffffffffaddba7aa, float:-2.4971875E-11)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E5U r0 = (X.E5U) r0
            X.G6E r0 = r0.A01
            if (r0 == 0) goto L_0x074a
            r0.E16()
        L_0x074a:
            r0 = 1708273547(0x65d22f8b, float:1.2407175E23)
            goto L_0x0aba
        L_0x074f:
            r0 = 2083532331(0x7c302e2b, float:3.6591226E36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E5U r0 = (X.E5U) r0
            X.EzH r2 = r0.A00
            if (r2 == 0) goto L_0x0791
            X.7Pu r6 = r2.A02
            com.instagram.common.session.UserSession r4 = r2.A01
            X.7Pr r3 = X.DbS.A0W(r4)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r3.A0a = r0
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            r0 = 2131962576(0x7f132ad0, float:1.9561881E38)
            X.DbZ.A0z(r1, r3, r0)
            X.C46447Df9.A03()
            com.instagram.user.model.User r0 = r2.A03
            java.lang.String r2 = r0.getId()
            android.os.Bundle r1 = X.DbY.A09(r4)
            java.lang.String r0 = "ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID"
            r1.putString(r0, r2)
            X.E1s r0 = new X.E1s
            r0.<init>()
            r0.setArguments(r1)
            r6.A0F(r0, r3)
        L_0x0791:
            r0 = 1867713666(0x6f530c82, float:6.531646E28)
            goto L_0x0aba
        L_0x0796:
            r0 = -1557275341(0xffffffffa32ddd33, float:-9.4251895E-18)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E53 r0 = (X.E53) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r5 = r0.getValue()
            X.DlR r5 = (X.C46792DlR) r5
            X.0Ud r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r4 = 10
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x07bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07df
            java.lang.Object r0 = r1.next()
            X.JwK r0 = (X.C61082JwK) r0
            if (r0 == 0) goto L_0x07dd
            java.lang.Object r0 = r0.A00
            X.G8x r0 = (X.C51954G8x) r0
            if (r0 == 0) goto L_0x07dd
            java.lang.String r0 = r0.B6N()
            if (r0 == 0) goto L_0x07dd
            java.lang.Long r0 = X.00y.A0n(r4, r0)
        L_0x07d9:
            r2.add(r0)
            goto L_0x07bb
        L_0x07dd:
            r0 = 0
            goto L_0x07d9
        L_0x07df:
            java.lang.String r1 = "done_button_tap"
            r0 = 0
            r5.A02(r0, r1, r2)
            X.6oS r1 = X.C318116oQ.A00(r5)
            r0 = 3
            X.DbX.A1X(r5, r1, r0)
            r0 = -1167577785(0xffffffffba682d47, float:-8.8568445E-4)
            goto L_0x09bc
        L_0x07f2:
            r0 = 996202607(0x3b60d86f, float:0.0034308692)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E31 r4 = (X.E31) r4
            X.0eM r0 = r4.A09
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            java.lang.String r0 = "external"
            X.AnonymousClass736.A03(r4, r3, r1, r0)
            X.8ab r3 = X.DbW.A0U(r4)
            r0 = 2131970025(0x7f1347e9, float:1.957699E38)
            r3.A09(r0)
            r3.A05()
            r1 = 2131971974(0x7f134f86, float:1.9580942E38)
            r0 = 20
            X.FJg r0 = X.C50021FJg.A00(r4, r0)
            X.Dba.A0t(r0, r3, r1)
            r0 = 189218457(0xb473e99, float:3.83731E-32)
            goto L_0x140b
        L_0x082a:
            r0 = -1446387140(0xffffffffa9c9e23c, float:-8.9654385E-14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E31 r5 = (X.E31) r5
            X.0eM r0 = r5.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.AnonymousClass736.A01(r5, r0)
            X.0eM r6 = r5.A07
            java.lang.Object r0 = r6.getValue()
            X.6ve r0 = (X.C322326ve) r0
            java.lang.String r4 = "profile_link_change_cancel"
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r3 = r0.A0A
            long r0 = r0.A00
            r3.flowMarkPoint(r0, r4)
            X.Dbb.A1W(r6)
            java.lang.Integer r3 = r5.A03
            r1 = 0
            if (r3 == 0) goto L_0x09cb
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 != r0) goto L_0x0888
            boolean r0 = X.E31.A01(r5)
            if (r0 == 0) goto L_0x0888
            X.8ab r3 = X.DbW.A0U(r5)
            r0 = 2131969960(0x7f1347a8, float:1.9576858E38)
            r3.A09(r0)
            r0 = 2131969962(0x7f1347aa, float:1.9576862E38)
            r3.A08(r0)
            r0 = 2131968381(0x7f13417d, float:1.9573655E38)
            r3.A0H(r1, r0)
            r1 = 2131960790(0x7f1323d6, float:1.9558259E38)
            r0 = 19
            X.FJg r0 = X.C50021FJg.A00(r5, r0)
            X.Dba.A0t(r0, r3, r1)
        L_0x0883:
            r0 = -895093816(0xffffffffcaa5f3c8, float:-5437924.0)
            goto L_0x140b
        L_0x0888:
            X.DbX.A1J(r5)
            goto L_0x0883
        L_0x088c:
            r0 = 1142519260(0x441975dc, float:613.84155)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E31 r5 = (X.E31) r5
            java.lang.Integer r0 = r5.A03
            r4 = 0
            if (r0 == 0) goto L_0x09cb
            int r1 = r0.intValue()
            r11 = 0
            if (r1 == r11) goto L_0x08b6
            r0 = 1
            if (r1 != r0) goto L_0x09c0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "edit_model"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.profile.intf.MultipleLinksEditModel r0 = (com.instagram.profile.intf.MultipleLinksEditModel) r0
            if (r0 == 0) goto L_0x08b6
            java.lang.String r4 = r0.A01
        L_0x08b6:
            com.instagram.igds.components.form.IgFormField r0 = r5.A02
            java.lang.String r9 = "urlFormField"
            if (r0 == 0) goto L_0x13cd
            java.lang.String r8 = X.DbU.A0o(r0)
            int r7 = r8.length()
            r6 = 1
            int r7 = r7 - r6
            r2 = 0
            r1 = 0
        L_0x08c8:
            if (r2 > r7) goto L_0x08e0
            r0 = r7
            if (r1 != 0) goto L_0x08ce
            r0 = r2
        L_0x08ce:
            boolean r0 = X.Dbb.A1a(r8, r0)
            if (r1 != 0) goto L_0x08db
            if (r0 != 0) goto L_0x08d8
            r1 = 1
            goto L_0x08c8
        L_0x08d8:
            int r2 = r2 + 1
            goto L_0x08c8
        L_0x08db:
            if (r0 == 0) goto L_0x08e0
            int r7 = r7 + -1
            goto L_0x08c8
        L_0x08e0:
            java.lang.String r10 = X.Dba.A0c(r8, r7, r2)
            int r1 = r10.length()
            if (r1 == 0) goto L_0x096e
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
            boolean r0 = X.DbV.A1b(r10, r0)
            if (r0 == 0) goto L_0x096e
            X.0eM r2 = r5.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.AnonymousClass736.A02(r5, r0)
            if (r1 <= 0) goto L_0x0914
            r0 = 491(0x1eb, float:6.88E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.11S r0 = new X.11S
            r0.<init>(r1)
            boolean r0 = r0.A08(r10)
            if (r0 != 0) goto L_0x0914
            java.lang.String r0 = "http://"
            java.lang.String r10 = X.002.A0R(r0, r10)
        L_0x0914:
            X.0lg r8 = X.DbT.A0X(r2)
            com.instagram.igds.components.form.IgFormField r0 = r5.A01
            if (r0 != 0) goto L_0x0920
            java.lang.String r9 = "titleFormField"
            goto L_0x13cd
        L_0x0920:
            java.lang.String r9 = X.DbU.A0o(r0)
            int r7 = r9.length()
            int r7 = r7 - r6
            r2 = 0
            r1 = 0
        L_0x092b:
            if (r2 > r7) goto L_0x0943
            r0 = r7
            if (r1 != 0) goto L_0x0931
            r0 = r2
        L_0x0931:
            boolean r0 = X.Dbb.A1a(r9, r0)
            if (r1 != 0) goto L_0x093e
            if (r0 != 0) goto L_0x093b
            r1 = 1
            goto L_0x092b
        L_0x093b:
            int r2 = r2 + 1
            goto L_0x092b
        L_0x093e:
            if (r0 == 0) goto L_0x0943
            int r7 = r7 + -1
            goto L_0x092b
        L_0x0943:
            java.lang.String r1 = X.Dba.A0c(r9, r7, r2)
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r9 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.EXTERNAL
            X.0qQ.A0B(r8, r11)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r0 = "link_id"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x097a }
            java.lang.String r0 = "url"
            r2.put(r0, r10)     // Catch:{ JSONException -> 0x097a }
            java.lang.String r0 = "title"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x097a }
            java.lang.String r1 = "link_type"
            java.lang.String r0 = r9.toString()     // Catch:{ JSONException -> 0x097a }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x097a }
            goto L_0x098a
        L_0x096e:
            r5.A05 = r6
            com.instagram.igds.components.form.IgFormField r0 = r5.A02
            if (r0 == 0) goto L_0x13cd
            r0.A0E()
            r5.A05 = r11
            goto L_0x09b9
        L_0x097a:
            r1 = move-exception
            r0 = 934(0x3a6, float:1.309E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0m(r0, r1)
            java.lang.String r0 = "Update Bio Links"
            X.0wb.A03(r0, r1)
        L_0x098a:
            r7.put(r2)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            r0 = 2565(0xa05, float:3.594E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A(r0)
            java.lang.Class<X.DvQ> r1 = X.DvQ.class
            java.lang.Class<X.F7z> r0 = X.C49812F7z.class
            r2.A0Q(r1, r0)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "updated_links"
            r2.A9m(r0, r1)
            X.1OC r2 = X.DbT.A0U(r2, r6)
            r1 = 5
            X.ECz r0 = new X.ECz
            r0.<init>(r4, r5, r1)
            r2.A00 = r0
            r5.schedule(r2)
        L_0x09b9:
            r0 = 381040000(0x16b63580, float:2.943745E-25)
        L_0x09bc:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x09c0:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = -300615005(0xffffffffee14faa3, float:-1.1526696E28)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x09cb:
            java.lang.String r9 = "mode"
            goto L_0x13cd
        L_0x09cf:
            r0 = -76677339(0xfffffffffb6dff25, float:-1.2357493E36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 253562717(0xf1d0f5d, float:7.7436565E-30)
            goto L_0x140b
        L_0x09e0:
            r0 = -864015252(0xffffffffcc802c6c, float:-6.719984E7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E3F r4 = (X.E3F) r4
            android.content.Context r1 = r4.requireContext()
            X.0eM r0 = r4.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r1, r0)
            r1 = 2131970028(0x7f1347ec, float:1.9576996E38)
            r0 = 39
            X.FPC r0 = A00(r4, r0)
            r3.A04(r0, r1)
            X.C49945FFy.A00(r4, r3)
            r0 = 1531379562(0x5b46ff6a, float:5.6012876E16)
            goto L_0x140b
        L_0x0a0e:
            r0 = -1246493037(0xffffffffb5b40693, float:-1.3412958E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E3F r6 = (X.E3F) r6
            X.0eM r4 = r6.A0B
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            r0 = 1
            boolean r5 = X.C49072Eoq.A00(r1, r0)
            X.0wc r1 = X.DbX.A0O(r6, r7)
            java.lang.String r0 = "reorder_links_clicked"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0a4c
            java.lang.String r0 = "edit_links_list_fragment"
            X.DbS.A1O(r3, r0)
            X.DbY.A1C(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_enhanced"
            r3.A7p(r0, r1)
            r3.Cgf()
        L_0x0a4c:
            if (r5 == 0) goto L_0x0a5d
            java.lang.String r8 = "subscriber"
            java.lang.String r9 = "click"
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r10 = X.C273654mx.A00(r0)
            java.lang.String r11 = "reorder_button"
            X.AnonymousClass736.A07(r6, r7, r8, r9, r10, r11)
        L_0x0a5d:
            X.C46447Df9.A03()
            X.E2Z r3 = new X.E2Z
            r3.<init>()
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.Dbb.A11(r3, r1, r0)
            r0 = -279253764(0xffffffffef5aecfc, float:-6.775423E28)
            goto L_0x140b
        L_0x0a75:
            r0 = -2094009441(0xffffffff832ff39f, float:-5.170754E-37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E1V r4 = (X.E1V) r4
            X.0eM r3 = r4.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.user.model.User r0 = r4.A03
            if (r0 != 0) goto L_0x0a8e
            java.lang.String r9 = "user"
            goto L_0x13cd
        L_0x0a8e:
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.PrimaryProfileLinkType r1 = r0.BfY()
            com.instagram.api.schemas.PrimaryProfileLinkType r0 = com.instagram.api.schemas.PrimaryProfileLinkType.FACEBOOK
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = r4.A04
            X.AnonymousClass736.A03(r4, r2, r1, r0)
            X.6ST r0 = r4.A02
            if (r0 != 0) goto L_0x0aab
            java.lang.String r9 = "dialog"
            goto L_0x13cd
        L_0x0aab:
            X.AnonymousClass0fN.A00(r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            r0 = 15
            X.FG4.A02(r1, r4, r0)
            r0 = -170119225(0xfffffffff5dc2fc7, float:-5.5823943E32)
        L_0x0aba:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0abe:
            r0 = -626500877(0xffffffffdaa85af3, float:-2.36938979E16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E2W r1 = (X.E2W) r1
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.AnonymousClass736.A01(r1, r0)
            X.DbT.A1J(r1)
            r0 = -975626012(0xffffffffc5d920e4, float:-6948.1113)
            goto L_0x140b
        L_0x0ada:
            r0 = -655427364(0xffffffffd8eef8dc, float:-2.10202088E15)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.E2W r7 = (X.E2W) r7
            X.0eM r3 = r7.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.AnonymousClass736.A02(r7, r0)
            com.instagram.igds.components.form.IgFormField r0 = r7.A01
            if (r0 != 0) goto L_0x0af6
            java.lang.String r9 = "urlField"
            goto L_0x13cd
        L_0x0af6:
            java.lang.String r5 = X.DbU.A0o(r0)
            int r4 = r5.length()
            r0 = 1
            int r4 = r4 - r0
            r2 = 0
            r1 = 0
        L_0x0b02:
            if (r2 > r4) goto L_0x0b1a
            r0 = r4
            if (r1 != 0) goto L_0x0b08
            r0 = r2
        L_0x0b08:
            boolean r0 = X.Dbc.A13(r5, r0)
            if (r1 != 0) goto L_0x0b15
            if (r0 != 0) goto L_0x0b12
            r1 = 1
            goto L_0x0b02
        L_0x0b12:
            int r2 = r2 + 1
            goto L_0x0b02
        L_0x0b15:
            if (r0 == 0) goto L_0x0b1a
            int r4 = r4 + -1
            goto L_0x0b02
        L_0x0b1a:
            java.lang.String r2 = X.Dba.A0c(r5, r4, r2)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0b3b
            r0 = 491(0x1eb, float:6.88E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.11S r0 = new X.11S
            r0.<init>(r1)
            boolean r0 = r0.A08(r2)
            if (r0 != 0) goto L_0x0b3b
            java.lang.String r0 = "http://"
            java.lang.String r2 = X.002.A0R(r0, r2)
        L_0x0b3b:
            X.F1D r1 = r7.A02
            java.lang.String r9 = "me"
            if (r1 == 0) goto L_0x13cd
            r1.A0E = r2
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x0b7b
            com.instagram.api.schemas.PrimaryProfileLinkType r0 = com.instagram.api.schemas.PrimaryProfileLinkType.FACEBOOK
        L_0x0b49:
            r1.A02 = r0
        L_0x0b4b:
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            X.F1D r2 = r7.A02
            if (r2 == 0) goto L_0x13cd
            r0 = 12
            X.FyJ r4 = new X.FyJ
            r4.<init>(r7, r0)
            r1 = 0
            X.AnonymousClass7TG.A1P(r5, r4)
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            java.lang.String r0 = X.0qv.A00(r3)
            X.1OC r2 = X.C318486p2.A07(r5, r2, r0, r1)
            r1 = 15
            X.EDb r0 = new X.EDb
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3)
            r2.A00 = r0
            r7.schedule(r2)
            r0 = 1805981669(0x6ba517e5, float:3.991712E26)
            goto L_0x0cc5
        L_0x0b7b:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0b4b
            com.instagram.api.schemas.PrimaryProfileLinkType r0 = com.instagram.api.schemas.PrimaryProfileLinkType.EXTERNAL
            goto L_0x0b49
        L_0x0b84:
            r0 = 1847204008(0x6e1a18a8, float:1.1922625E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r3 = X.AnonymousClass37D.A00
            java.lang.Object r2 = r1.A01
            X.E1L r2 = (X.E1L) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.DbX.A10(r1, r3)
            X.Ey5 r2 = r2.A00
            if (r2 == 0) goto L_0x0ba9
            X.DeX r1 = r2.A01
            androidx.fragment.app.FragmentActivity r4 = r2.A00
            com.instagram.common.session.UserSession r3 = r1.A00
            com.instagram.user.model.User r2 = r2.A02
            X.Df5 r1 = X.C46443Df5.MISINFORMATION
            X.C46410DeX.A00(r4, r3, r2, r1)
        L_0x0ba9:
            r1 = 207194724(0xc598a64, float:1.6758717E-31)
            goto L_0x11a0
        L_0x0bae:
            r0 = -1887316618(0xffffffff8f81d576, float:-1.2802604E-29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E35 r4 = (X.E35) r4
            java.util.List r0 = r4.A03
            int r7 = r0.size()
            java.util.List r0 = r4.A02
            java.lang.String r9 = "originalUserbanners"
            if (r0 == 0) goto L_0x13cd
            int r0 = r0.size()
            r6 = 1
            if (r7 != r0) goto L_0x0c0a
            int r7 = r7 - r6
            if (r7 < 0) goto L_0x0c05
            r5 = 0
        L_0x0bd0:
            java.util.List r0 = r4.A03
            java.lang.Object r0 = r0.get(r5)
            X.73N r0 = (X.AnonymousClass73N) r0
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r0.AZm()
            java.lang.String r3 = X.002.A0R(r1, r0)
            java.util.List r0 = r4.A02
            if (r0 == 0) goto L_0x13cd
            java.lang.Object r0 = r0.get(r5)
            X.73N r0 = (X.AnonymousClass73N) r0
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r0.AZm()
            java.lang.String r0 = X.002.A0R(r1, r0)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0c0a
            if (r5 == r7) goto L_0x0c05
            int r5 = r5 + 1
            goto L_0x0bd0
        L_0x0c05:
            X.DbT.A1J(r4)
            goto L_0x1408
        L_0x0c0a:
            X.DbY.A18(r4, r6)
            java.util.List r0 = r4.A03
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0c17:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0c3b
            java.lang.Object r5 = r6.next()
            X.73N r5 = (X.AnonymousClass73N) r5
            java.lang.String r1 = r4.A09
            java.lang.String r0 = r5.getId()
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.String r1 = r4.A0A
            java.lang.String r0 = r5.AZm()
            java.util.LinkedHashMap r0 = X.DbY.A0p(r1, r0, r3)
            r9.add(r0)
            goto L_0x0c17
        L_0x0c3b:
            X.0eM r0 = r4.A0C
            X.0lg r8 = X.DbY.A0R(r0)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.util.Iterator r6 = r9.iterator()
        L_0x0c4a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x13e6
            java.lang.Object r0 = r6.next()
            java.util.Map r0 = (java.util.Map) r0
            org.json.JSONObject r5 = X.DbS.A11()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x0c5e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0c74
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.String r1 = X.DbT.A13(r0)
            java.lang.Object r0 = r0.getValue()
            r5.put(r1, r0)
            goto L_0x0c5e
        L_0x0c74:
            r7.put(r5)
            goto L_0x0c4a
        L_0x0c78:
            r0 = -17733101(0xfffffffffef16a13, float:-1.6044736E38)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -884627795(0xffffffffcb45a6ad, float:-1.2953261E7)
            goto L_0x0cc5
        L_0x0c88:
            r0 = 1391124364(0x52eadf8c, float:5.04386421E11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 909148233(0x36308049, float:2.6300715E-6)
            goto L_0x0cc5
        L_0x0c98:
            r0 = -345240837(0xffffffffeb6c0afb, float:-2.8535835E26)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r4 = r1.A01
            X.E33 r4 = (X.E33) r4
            android.content.Context r3 = r4.getContext()
            if (r3 == 0) goto L_0x0cc9
            X.0eM r0 = r4.A0D
            X.0lg r2 = X.DbT.A0X(r0)
            java.lang.String r0 = "https://help.instagram.com/876876079327341?ref=igapp"
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r4.getString(r0)
            X.C49906FEe.A01(r3, r2, r5, r1, r0)
            r0 = -63969368(0xfffffffffc2fe7a8, float:-3.653402E36)
        L_0x0cc5:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0cc9:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -904873585(0xffffffffca10b98f, float:-2371171.8)
            X.AnonymousClass0fD.A0C(r0, r6)
            throw r1
        L_0x0cd4:
            r0 = 893768703(0x3545d3ff, float:7.3696714E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E33 r4 = (X.E33) r4
            X.6ve r3 = r4.A05
            if (r3 == 0) goto L_0x0ce9
            r2 = 1
            java.lang.String r1 = "cancel_changes"
            r3.A0A(r1, r2)
        L_0x0ce9:
            X.6ve r2 = r4.A05
            if (r2 == 0) goto L_0x0cf2
            java.lang.String r1 = "edit_user_name"
            r2.A04(r1)
        L_0x0cf2:
            X.DbT.A1J(r4)
            r1 = 13484551(0xcdc207, float:1.889588E-38)
            goto L_0x11a0
        L_0x0cfa:
            r0 = -1610182788(0xffffffffa0068f7c, float:-1.1397716E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E33 r5 = (X.E33) r5
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x0d4c
            X.8ab r4 = X.DbW.A0U(r5)
            java.lang.String r1 = r5.A07
            if (r1 != 0) goto L_0x0d1c
            android.content.Context r2 = r5.requireContext()
            r1 = 2131953167(0x7f13060f, float:1.9542797E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
        L_0x0d1c:
            r4.A0q(r1)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r1)
            r1 = 9
            X.FJg r1 = X.C50021FJg.A00(r5, r1)
            r3 = 1
            r4.A0d(r1, r2)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r1)
            X.FJP r1 = X.FJP.A00
            r4.A0b(r1, r2)
            X.AnonymousClass7TH.A0a(r4, r3)
        L_0x0d47:
            r1 = -1943197829(0xffffffff8c2d277b, float:-1.3339316E-31)
            goto L_0x11a0
        L_0x0d4c:
            X.E33.A01(r5)
            goto L_0x0d47
        L_0x0d50:
            r0 = -272570044(0xffffffffefc0e944, float:-1.1940625E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E70 r3 = (X.E70) r3
            boolean r2 = r3.A05
            if (r2 == 0) goto L_0x0d71
            android.content.Context r3 = r3.getContext()
            r2 = 8
            X.FJg r1 = X.C50021FJg.A00(r1, r2)
            X.FCN.A00(r3, r1)
        L_0x0d6c:
            r1 = 1297556078(0x4d57226e, float:2.25584864E8)
            goto L_0x11a0
        L_0x0d71:
            X.DbT.A1J(r3)
            goto L_0x0d6c
        L_0x0d75:
            r0 = 32464693(0x1ef5f35, float:8.793135E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E38 r4 = (X.E38) r4
            X.6ve r3 = r4.A04
            if (r3 == 0) goto L_0x0d8a
            r2 = 1
            java.lang.String r1 = "cancel_changes"
            r3.A0A(r1, r2)
        L_0x0d8a:
            X.6ve r2 = r4.A04
            if (r2 == 0) goto L_0x0d93
            java.lang.String r1 = "edit_full_name"
            r2.A04(r1)
        L_0x0d93:
            X.0eM r1 = r4.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.F3s r3 = X.C49061Eof.A00(r1)
            X.EWT r2 = X.EWT.EDIT_NAME_FLOW
            java.lang.String r1 = "edit_fullname_cancel"
            r3.A03(r2, r1)
            X.DbT.A1J(r4)
            r1 = -1163419146(0xffffffffbaa7a1f6, float:-0.0012789357)
            goto L_0x11a0
        L_0x0dac:
            r0 = -1430309119(0xffffffffaabf3701, float:-3.3966582E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E2x r4 = (X.C47451E2x) r4
            com.instagram.common.session.UserSession r1 = r4.A00
            java.lang.String r3 = r4.A01
            X.0wc r2 = X.DbX.A0Q(r1)
            java.lang.String r1 = "ig_edit_dob"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0dd0
            java.lang.String r1 = "date_picker_back_tapped"
            X.Dbb.A1E(r2, r1, r3)
        L_0x0dd0:
            X.DbT.A1I(r4)
            r1 = -673114079(0xffffffffd7e11821, float:-4.94987498E14)
            goto L_0x11a0
        L_0x0dd8:
            r0 = -1666177153(0xffffffff9cb0277f, float:-1.1656913E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Dib r5 = (X.C46656Dib) r5
            boolean r2 = r5.A10
            if (r2 == 0) goto L_0x0df8
            android.content.Context r3 = r5.requireContext()
            r2 = 3
            X.FJg r1 = X.C50021FJg.A00(r1, r2)
            X.FCN.A00(r3, r1)
        L_0x0df3:
            r1 = 3585298(0x36b512, float:5.024073E-39)
            goto L_0x11a0
        L_0x0df8:
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0df3
            X.6ve r2 = r5.A0m
            long r3 = r2.A02
            r6 = 0
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0e13
            boolean r1 = r2.A07
            if (r1 == 0) goto L_0x0e13
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r2 = r2.A0A
            java.lang.String r1 = "name_remained_same"
            r2.flowMarkPoint(r3, r1)
        L_0x0e13:
            X.6ve r2 = r5.A0m
            long r3 = r2.A02
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0e26
            boolean r1 = r2.A08
            if (r1 == 0) goto L_0x0e26
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r2 = r2.A0A
            java.lang.String r1 = "username_remained_same"
            r2.flowMarkPoint(r3, r1)
        L_0x0e26:
            X.6ve r2 = r5.A0m
            java.lang.String r1 = "edit_full_name"
            r2.A04(r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            r1.onBackPressed()
            goto L_0x0df3
        L_0x0e35:
            r0 = -750647331(0xffffffffd34207dd, float:-8.3335558E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Dib r3 = (X.C46656Dib) r3
            boolean r2 = r3.A12
            if (r2 == 0) goto L_0x0e49
            r1 = 1920157880(0x727348b8, float:4.8187372E30)
            goto L_0x11a0
        L_0x0e49:
            boolean r2 = r3.A0y
            if (r2 == 0) goto L_0x0e57
            java.lang.String r1 = "edit_name"
            X.C46656Dib.A0K(r3, r1)
            r1 = -2057165438(0xffffffff85622582, float:-1.0633358E-35)
            goto L_0x11a0
        L_0x0e57:
            com.instagram.common.session.UserSession r5 = r3.A0V
            com.instagram.user.model.User r2 = r3.A0q
            X.4Cl r2 = r2.A03
            java.lang.String r2 = r2.getFbidV2()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            r3 = 26
            X.EDa r2 = new X.EDa
            r2.<init>(r1, r3)
            X.F9X.A01(r2, r5, r4)
            r1 = -1538637435(0xffffffffa44a4185, float:-4.3857265E-17)
            goto L_0x11a0
        L_0x0e74:
            r0 = -1102563418(0xffffffffbe4837a6, float:-0.19552478)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Dib r3 = (X.C46656Dib) r3
            boolean r1 = r3.A0y
            if (r1 == 0) goto L_0x0e8d
            java.lang.String r1 = "meta_verified"
            X.C46656Dib.A0K(r3, r1)
            r1 = 479660594(0x1c970a32, float:9.994977E-22)
            goto L_0x11a0
        L_0x0e8d:
            com.instagram.common.session.UserSession r2 = r3.A0V
            java.lang.String r1 = "nme_ig_edit_profile"
            X.F6X.A01(r3, r2, r1)
            com.instagram.common.session.UserSession r2 = r3.A0V
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r1 = 0
            X.0wc r2 = X.AnonymousClass0kN.A01(r1, r2)
            java.lang.String r1 = "ig_native_meta_verified_edit_profile_click"
            X.DbZ.A1R(r2, r1)
            r1 = -1243477695(0xffffffffb5e20941, float:-1.6841005E-6)
            goto L_0x11a0
        L_0x0ea9:
            r0 = -1558172783(0xffffffffa3202b91, float:-8.682843E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Dib r5 = (X.C46656Dib) r5
            boolean r2 = r5.A0y
            if (r2 == 0) goto L_0x0ec2
            java.lang.String r1 = "meta_verified"
            X.C46656Dib.A0K(r5, r1)
            r1 = 1852173742(0x6e65edae, float:1.7789851E28)
            goto L_0x11a0
        L_0x0ec2:
            com.instagram.common.session.UserSession r4 = r5.A0V
            r3 = 3
            X.FVR r2 = new X.FVR
            r2.<init>(r1, r3)
            java.lang.String r1 = "nme_ig_edit_profile"
            X.F6X.A00(r5, r2, r4, r1)
            com.instagram.common.session.UserSession r2 = r5.A0V
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r1 = 0
            X.0wc r2 = X.AnonymousClass0kN.A01(r1, r2)
            java.lang.String r1 = "ig_native_meta_verified_edit_profile_click"
            X.DbZ.A1R(r2, r1)
            r1 = -401040081(0xffffffffe8189d2f, float:-2.882797E24)
            goto L_0x11a0
        L_0x0ee4:
            r0 = 1555773756(0x5cbb393c, float:4.21590004E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Dib r2 = (X.C46656Dib) r2
            com.instagram.common.session.UserSession r4 = r2.A0V
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            android.content.Context r3 = r2.requireContext()
            r6 = 0
            r7 = r6
            r8 = r6
            X.1OC r3 = X.C318486p2.A03(r3, r4, r5, r6, r7, r8)
            com.instagram.common.session.UserSession r6 = r2.A0V
            com.instagram.user.model.User r8 = r2.A0q
            X.F1D r7 = r2.A0e
            r7.getClass()
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            android.widget.TextView r1 = r2.A0L
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L_0x0f2a
            android.widget.TextView r1 = r2.A0L
            java.lang.String r9 = X.DbV.A0x(r1)
        L_0x0f19:
            java.lang.String r10 = "edit_profile"
            X.ECB r4 = new X.ECB
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.A00 = r4
            r2.schedule(r3)
            r1 = 1343101556(0x500e1a74, float:9.5363932E9)
            goto L_0x11a0
        L_0x0f2a:
            r9 = 0
            goto L_0x0f19
        L_0x0f2c:
            r0 = 272122230(0x10384176, float:3.633803E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Dib r4 = (X.C46656Dib) r4
            java.lang.String r3 = "support_link"
            java.lang.String r2 = "support_link_row"
            r1 = 0
            X.C46656Dib.A0M(r4, r3, r2, r1)
            X.FFo r6 = r4.A0T
            com.instagram.common.session.UserSession r1 = r4.A0V
            com.instagram.user.model.User r2 = X.DbT.A0j(r1)
            X.4Cl r1 = r2.A03
            X.4os r1 = r1.Bx2()
            if (r1 != 0) goto L_0x0f60
            X.4Cl r1 = r2.A03
            X.4os r1 = r1.Bwz()
            if (r1 != 0) goto L_0x0f60
            X.4Cl r1 = r2.A03
            X.4os r1 = r1.Bx0()
            r5 = 0
            if (r1 == 0) goto L_0x0f61
        L_0x0f60:
            r5 = 1
        L_0x0f61:
            X.0Aj r3 = X.C49935FFo.A00(r6)
            java.lang.String r2 = "edit_profile_action_button"
            java.lang.String r1 = "step"
            X.Dba.A1B(r3, r1, r2)
            java.lang.String r2 = r6.A03
            java.lang.String r1 = X.Dbm.A00()
            r3.AAJ(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.lang.String r1 = "is_support_partner_enabled"
            r3.A7p(r1, r2)
            java.lang.String r1 = r6.A02
            X.DbV.A1J(r3, r1)
            X.DbU.A0v()
            java.lang.String r3 = r4.A0t
            X.FFo r1 = r4.A0T
            java.lang.String r2 = r1.A03
            android.os.Bundle r1 = X.DbY.A0A(r3)
            X.Dba.A0v(r1, r3, r2)
            com.instagram.business.fragment.SupportLinksFragment r3 = new com.instagram.business.fragment.SupportLinksFragment
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r4)
            com.instagram.common.session.UserSession r1 = r4.A0V
            X.Dbb.A12(r3, r2, r1)
            r1 = 1051552532(0x3ead6b14, float:0.33870757)
            goto L_0x11a0
        L_0x0fa6:
            r0 = 633327500(0x25bfcf8c, float:3.3273858E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Dib r6 = (X.C46656Dib) r6
            com.instagram.common.session.UserSession r4 = r6.A0V
            X.0Tu r3 = X.0Tu.A05
            r1 = 36315705129307632(0x8104f100000df0, double:3.029536383156781E-306)
            boolean r3 = X.DbY.A1Y(r3, r4, r1)
            com.instagram.user.model.User r1 = r6.A0q
            boolean r2 = r1.A1g()
            com.instagram.user.model.User r1 = r6.A0q
            boolean r4 = r1.A1f()
            if (r3 == 0) goto L_0x1015
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "should_show_public_contacts"
            r3.put(r1, r2)
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "should_show_category"
            r3.put(r1, r2)
        L_0x0fe2:
            java.lang.String r5 = "edit_profile"
            java.lang.String r1 = "profile_display_options"
            X.C46656Dib.A0M(r6, r5, r1, r3)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r4 = "edit_profile_entry"
            java.lang.String r3 = r1.getString(r4)
            X.DbU.A0v()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "entry_point"
            r2.putSerializable(r1, r5)
            r2.putString(r4, r3)
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r3 = new com.instagram.business.fragment.ProfileDisplayOptionsFragment
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r2, r3, r6)
            com.instagram.common.session.UserSession r1 = r6.A0V
            X.Dbb.A12(r3, r2, r1)
            r1 = -1235131684(0xffffffffb66162dc, float:-3.3585156E-6)
            goto L_0x11a0
        L_0x1015:
            com.instagram.user.model.User r1 = r6.A0q
            X.4Cl r1 = r1.A03
            java.lang.Boolean r1 = r1.Ca6()
            boolean r1 = X.AnonymousClass7TG.A1X(r1)
            java.util.HashMap r3 = X.FRK.A00(r2, r4, r1)
            goto L_0x0fe2
        L_0x1026:
            r0 = 788968181(0x2f06b2f5, float:1.2250807E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Dib r7 = (X.C46656Dib) r7
            com.instagram.common.session.UserSession r3 = r7.A0V
            X.F1D r2 = r7.A0e
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.lang.Integer r2 = X.C49020Enw.A00(r3, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            boolean r4 = X.AnonymousClass7TF.A1W(r2, r1)
            android.os.Bundle r2 = r7.requireArguments()
            java.lang.String r1 = "edit_profile_entry"
            r6 = 0
            r2.getString(r1, r6)
            X.DbU.A0v()
            java.lang.String r5 = "edit_profile"
            r3 = 1
            android.os.Bundle r2 = X.DbX.A0B(r5)
            java.lang.String r1 = "show_public_contacts_toggle"
            r2.putBoolean(r1, r3)
            java.lang.String r1 = "extra_is_mv4b_verified"
            r2.putBoolean(r1, r4)
            X.E7B r4 = new X.E7B
            r4.<init>()
            r4.setArguments(r2)
            android.os.Bundle r3 = X.DbY.A08(r4)
            java.util.ArrayList r2 = r7.A1O
            java.lang.String r1 = "ldp_app_ids"
            r3.putStringArrayList(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r3, r4, r7)
            com.instagram.common.session.UserSession r1 = r7.A0V
            X.Dbb.A12(r4, r2, r1)
            java.lang.String r1 = "contact_option"
            X.C46656Dib.A0M(r7, r5, r1, r6)
            r1 = 155775354(0x948f17a, float:2.4187666E-33)
            goto L_0x11a0
        L_0x1087:
            r0 = -1962653408(0xffffffff8b044920, float:-2.5477288E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Dib r5 = (X.C46656Dib) r5
            com.instagram.user.model.User r1 = r5.A0q
            X.4Cl r1 = r1.A03
            java.lang.String r1 = r1.getCategory()
            java.lang.String r2 = "category"
            java.util.Map r1 = java.util.Collections.singletonMap(r2, r1)
            java.lang.String r4 = "edit_profile"
            X.C46656Dib.A0M(r5, r4, r2, r1)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r3 = "edit_profile_entry"
            java.lang.String r2 = r1.getString(r3)
            X.DbU.A0v()
            android.os.Bundle r1 = X.DbX.A0B(r4)
            if (r2 == 0) goto L_0x10bb
            r1.putString(r3, r2)
        L_0x10bb:
            com.instagram.business.fragment.CategorySearchFragment r3 = new com.instagram.business.fragment.CategorySearchFragment
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r5)
            com.instagram.common.session.UserSession r1 = r5.A0V
            X.Dbb.A12(r3, r2, r1)
            r1 = 1738220612(0x679b2444, float:1.4652716E24)
            goto L_0x11a0
        L_0x10ce:
            r0 = 1865394015(0x6f2fa75f, float:5.4362216E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Dib r5 = (X.C46656Dib) r5
            boolean r1 = r5.A0y
            if (r1 == 0) goto L_0x10e7
            java.lang.String r1 = "professional_conversion"
            X.C46656Dib.A0K(r5, r1)
            r1 = 352089431(0x14fc7557, float:2.549178E-26)
            goto L_0x11a0
        L_0x10e7:
            java.lang.String r1 = "business_conversion_flow"
            X.1Q9 r1 = X.1Q9.A01(r1)
            r1.A08()
            android.content.Context r1 = r5.requireContext()
            android.content.Intent r4 = X.DbU.A04(r1)
            android.os.Bundle r3 = r5.requireArguments()
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "edit_profile"
            r3.putString(r2, r1)
            r2 = 0
            java.lang.String r1 = "intro_entry_position"
            r3.putInt(r1, r2)
            r1 = 3
            X.DbV.A1C(r4, r1, r3)
            r1 = 11
            X.0kR.A05(r5, r4, r1)
            r1 = -2060697583(0xffffffff852c4011, float:-8.099168E-36)
            goto L_0x11a0
        L_0x1117:
            r0 = -1838646358(0xffffffff92687baa, float:-7.335872E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Dib r4 = (X.C46656Dib) r4
            boolean r1 = r4.A0y
            if (r1 == 0) goto L_0x1133
            r1 = 145(0x91, float:2.03E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.C46656Dib.A0K(r4, r1)
            r1 = 2121041807(0x7e6c878f, float:7.8600417E37)
            goto L_0x11a0
        L_0x1133:
            X.36X r5 = X.C46656Dib.A1a
            X.AnonymousClass36O.A0B = r5
            com.instagram.common.session.UserSession r6 = r4.A0V
            java.lang.String r1 = r6.A06
            java.lang.Long.parseLong(r1)
            r9 = 0
            java.lang.String r7 = "change_profile_photo_button_clicked"
            java.lang.String r8 = "photo_editing"
            r10 = r9
            r11 = r9
            X.C46653DiY.A00(r5, r6, r7, r8, r9, r10, r11)
            android.content.Context r2 = r4.getContext()
            com.instagram.common.session.UserSession r1 = r4.A0V
            boolean r1 = X.FFU.A02(r1)
            if (r2 == 0) goto L_0x1165
            if (r1 == 0) goto L_0x1165
            com.instagram.common.session.UserSession r1 = r4.A0V
            boolean r1 = X.DcE.A05(r1)
            if (r1 == 0) goto L_0x1165
            X.FFU.A00(r2)
            r1 = -1137296632(0xffffffffbc363b08, float:-0.011122473)
            goto L_0x11a0
        L_0x1165:
            com.instagram.common.session.UserSession r1 = r4.A0V
            X.2Ly r3 = X.2Lv.A00(r1)
            java.lang.Class<X.Dib> r1 = X.C46656Dib.class
            com.facebook.common.callercontext.CallerContext r2 = com.facebook.common.callercontext.CallerContext.A00(r1)
            java.lang.String r1 = "ig_profile_connect_fb_page"
            boolean r1 = r3.A00(r2, r1)
            if (r1 != 0) goto L_0x1182
            com.instagram.common.session.UserSession r3 = r4.A0V
            X.EZu r2 = X.C48152EZu.A05
            java.lang.String r1 = "upsell_impressions"
            X.FFL.A00(r2, r3, r1)
        L_0x1182:
            X.C46656Dib.A0B(r4)
            r1 = -718066633(0xffffffffd5332c37, float:-1.23126552E13)
            goto L_0x11a0
        L_0x1189:
            r0 = 401819463(0x17f34747, float:1.57215E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dib r1 = (X.C46656Dib) r1
            boolean r2 = r1.A0y
            if (r2 == 0) goto L_0x11a4
            java.lang.String r2 = "edit_username"
            X.C46656Dib.A0K(r1, r2)
            r1 = 1690953840(0x64c9e870, float:2.9796356E22)
        L_0x11a0:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x11a4:
            X.1a1 r4 = X.C46447Df9.A02()
            X.F1D r2 = r1.A0e
            r2.getClass()
            X.F1D r3 = r1.A0e
            X.EbC r2 = r3.A06
            if (r2 == 0) goto L_0x11d8
            X.EbO r2 = r2.A01
            if (r2 == 0) goto L_0x11d8
            java.lang.String r6 = r3.A0O
            java.lang.String r7 = r3.A0N
            int r10 = r3.A01
            boolean r11 = r2.A02
            boolean r12 = r2.A03
            java.lang.String r8 = r2.A00
            java.lang.String r9 = r2.A01
            com.instagram.user.model.User r5 = r1.A0q
        L_0x11c7:
            X.E33 r3 = r4.A06(r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r1.A0V
            X.Dbb.A12(r3, r2, r1)
            r1 = 186443669(0xb1ce795, float:3.021873E-32)
            goto L_0x11a0
        L_0x11d8:
            java.lang.String r6 = r3.A0O
            java.lang.String r7 = r3.A0N
            int r10 = r3.A01
            r11 = 0
            com.instagram.user.model.User r5 = r1.A0q
            java.lang.String r8 = ""
            r9 = r8
            r12 = r11
            goto L_0x11c7
        L_0x11e6:
            java.lang.Object r4 = r1.A01
            X.Dib r4 = (X.C46656Dib) r4
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            com.instagram.common.session.UserSession r2 = r4.A0V
            X.6qr r1 = X.C319586qr.EDIT_PROFILE
            java.lang.String r0 = "EditProfileFragment"
            r9 = 0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C319596qs.A01(r1, r2, r0, r9)
            if (r0 == 0) goto L_0x120b
            java.lang.String r6 = "personal_ads_account_unlink"
            java.lang.String r7 = "edit_profile"
            X.Xtl r5 = new X.Xtl
            r8 = r6
            r10 = r9
            r11 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Ckp(r5)
        L_0x120b:
            r0 = 1
            r4.A14 = r0
            java.lang.String r1 = "com.instagram.page_delinking.screens.manage_from"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.DiU r3 = X.C46649DiU.A04(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A0V
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            r0 = 2131956550(0x7f131346, float:1.9549659E38)
            X.DbZ.A19(r4, r1, r0)
            r3.A0D(r2, r1)
            return
        L_0x122c:
            java.lang.Object r12 = r1.A01
            X.Dib r12 = (X.C46656Dib) r12
            boolean r0 = r12.A0y
            if (r0 == 0) goto L_0x123a
            java.lang.String r0 = "page_linking"
            X.C46656Dib.A0K(r12, r0)
            return
        L_0x123a:
            X.Dfh r0 = r12.A0U
            if (r0 == 0) goto L_0x1273
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x1273
            com.instagram.common.session.UserSession r4 = r12.A0V
            java.lang.String r1 = "edit_profile"
            r3 = 1
            X.0qQ.A0B(r4, r3)
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r0 = "entry_point"
            r2.put(r0, r1)
            java.lang.String r1 = "flow"
            java.lang.String r0 = "pro2pro_framework_page_confirmation_flow"
            r2.put(r1, r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "server_params"
            java.util.HashMap r1 = X.DbY.A0m(r0, r1)
            java.lang.String r0 = "com.bloks.www.pro_to_pro.framework.async.controller.entry"
            X.8ey r0 = X.C359988do.A05(r4, r0, r1)
            X.E86.A01(r0, r12, r4, r3)
            r12.schedule(r0)
            r12.A0w = r3
            return
        L_0x1273:
            com.instagram.user.model.User r0 = r12.A0q
            boolean r0 = r0.A1N()
            if (r0 != 0) goto L_0x133d
            boolean r0 = X.C46656Dib.A0Q(r12)
            if (r0 != 0) goto L_0x133d
            r9 = 1
            r12.A16 = r9
            androidx.fragment.app.FragmentActivity r13 = r12.requireActivity()
            android.content.Context r11 = r12.requireContext()
            com.instagram.common.session.UserSession r15 = r12.A0V
            X.0gy r14 = X.AnonymousClass07i.A00(r12)
            java.lang.Class<X.Dib> r0 = X.C46656Dib.class
            com.facebook.common.callercontext.CallerContext r19 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r5 = "edit_profile"
            r7 = 0
            java.lang.String r1 = "edit_page"
            java.lang.String r0 = "edit_page_row"
            X.C50143FRa.A03(r15, r5, r1, r0)
            r6 = 0
            X.8ab r0 = new X.8ab
            r0.<init>(r11, r6)
            r0.A0r(r9)
            r0.A0s(r9)
            android.app.Dialog r10 = r0.A02()
            r0 = 2131625294(0x7f0e054e, float:1.8877792E38)
            r10.setContentView(r0)
            r0 = 2131429804(0x7f0b09ac, float:1.8481291E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131961466(0x7f13267a, float:1.955963E38)
            java.lang.String r3 = r11.getString(r0)
            r0 = 2131961464(0x7f132678, float:1.9559626E38)
            android.text.SpannableStringBuilder r2 = X.DbY.A0D(r11, r3, r0)
            java.lang.String r0 = "https://help.instagram.com/402748553849926"
            java.lang.String r1 = X.SQU.A01(r11, r0)
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            int r25 = X.2Yu.A0F(r11, r0)
            X.AnonymousClass7TG.A1Q(r15, r1)
            X.Ngq r0 = new X.Ngq
            r20 = r0
            r21 = r11
            r22 = r15
            r23 = r7
            r24 = r1
            r20.<init>(r21, r22, r23, r24, r25)
            X.AnonymousClass7AV.A05(r2, r0, r3)
            X.DbX.A1G(r4, r2)
            r0 = 2131437020(0x7f0b25dc, float:1.8495927E38)
            android.view.View r1 = r10.requireViewById(r0)
            r0 = 15
            X.FPH.A00(r1, r15, r12, r10, r0)
            r0 = 2131432170(0x7f0b12ea, float:1.848609E38)
            android.view.View r2 = r10.requireViewById(r0)
            r0 = 2131431909(0x7f0b11e5, float:1.848556E38)
            android.view.View r1 = r10.requireViewById(r0)
            X.FOw r0 = new X.FOw
            r18 = r10
            r20 = r15
            r21 = r12
            r22 = r13
            r17 = r6
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.AnonymousClass0fU.A00(r0, r2)
            X.FOQ r8 = new X.FOQ
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.AnonymousClass0fU.A00(r8, r1)
            boolean r0 = r12 instanceof android.content.DialogInterface.OnCancelListener
            if (r0 == 0) goto L_0x1334
            r0 = r12
            android.content.DialogInterface$OnCancelListener r0 = (android.content.DialogInterface.OnCancelListener) r0
            r10.setOnCancelListener(r0)
        L_0x1334:
            X.AnonymousClass0fN.A00(r10)
            java.lang.String r0 = "page"
            X.C46656Dib.A0M(r12, r5, r0, r7)
            return
        L_0x133d:
            r0 = 1
            r12.A0x = r0
            r12.A16 = r0
            android.content.Context r1 = r12.requireContext()
            com.instagram.common.session.UserSession r0 = r12.A0V
            boolean r6 = X.C46656Dib.A0Q(r12)
            java.lang.String r5 = "edit_profile"
            r2 = r12
            r3 = r12
            r4 = r0
            X.C50143FRa.A01(r1, r2, r3, r4, r5, r6)
            return
        L_0x1355:
            java.lang.Object r0 = r1.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.C46656Dib.A0C(r0)
            return
        L_0x135d:
            java.lang.String r9 = "qplHelper"
            goto L_0x13cd
        L_0x1360:
            java.lang.String r9 = "userForEditing"
            goto L_0x13cd
        L_0x1363:
            java.lang.String r9 = "searchController"
            goto L_0x13cd
        L_0x1366:
            r0 = -1353907816(0xffffffffaf4d0198, float:-1.8645208E-10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E2V r3 = (X.E2V) r3
            X.0eM r0 = r3.A02
            java.lang.Object r5 = r0.getValue()
            X.FYs r5 = (X.C50336FYs) r5
            X.0wc r1 = r5.A02
            r0 = 28
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x13b2
            java.lang.String r1 = "instagram"
            java.lang.String r0 = "parent_surface"
            r4.AAJ(r0, r1)
            java.lang.String r0 = "edit_profile_channels"
            X.DbS.A1M(r4, r0)
            java.lang.String r1 = "edit_button"
            java.lang.String r0 = "source"
            X.Dba.A1B(r4, r0, r1)
            java.lang.String r0 = "edit_pinned_channels_start"
            X.C50336FYs.A00(r4, r5, r0)
            X.Dba.A18(r4)
            java.lang.String r1 = r5.A00
            java.lang.String r0 = X.Dbm.A00()
            r4.AAJ(r0, r1)
            r4.Cgf()
        L_0x13b2:
            X.0eM r0 = r3.A04
            java.lang.Object r4 = r0.getValue()
            X.Dkw r4 = (X.C46769Dkw) r4
            X.FF6 r1 = r4.A03
            r0 = 1
            r1.A04(r0)
            X.2Fj r1 = r4.A01
            X.EPK r0 = X.EPK.A00
            r1.A0A(r0)
            X.8Qm r1 = r3.A00
            if (r1 != 0) goto L_0x13d5
            java.lang.String r9 = "itemTouchHelper"
        L_0x13cd:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x13d5:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A01
            if (r0 != 0) goto L_0x13dc
            java.lang.String r9 = "recyclerView"
            goto L_0x13cd
        L_0x13dc:
            r1.A0A(r0)
            X.Dbb.A0v(r3)
            r0 = -136301202(0xfffffffff7e0356e, float:-9.094986E33)
            goto L_0x140b
        L_0x13e6:
            X.1NY r3 = X.AnonymousClass7TG.A0a(r8)
            java.lang.String r0 = "user_profile/update_banners_order/"
            r3.A0A(r0)
            java.lang.String r1 = r7.toString()
            r0 = 4436(0x1154, float:6.216E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A9m(r0, r1)
            java.lang.Class<X.DvR> r1 = X.DvR.class
            java.lang.Class<X.F82> r0 = X.F82.class
            X.1OC r1 = X.DbU.A0S(r3, r1, r0)
            r0 = 4
            X.C47696EDf.A00(r4, r1, r0)
        L_0x1408:
            r0 = -660701678(0xffffffffd89e7e12, float:-1.39411444E15)
        L_0x140b:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPC.onClick(android.view.View):void");
    }

    public FPC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
