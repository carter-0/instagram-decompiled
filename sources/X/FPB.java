package X;

import android.view.View;

public final class FPB implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FPB(E4I e4i, int i) {
        this.A00 = i;
        this.A01 = e4i;
    }

    public static FPB A00(Object obj, int i) {
        return new FPB(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FPB(obj, i), view);
    }

    public static void A02(AnonymousClass3JR r1, 2da r2, Object obj, int i) {
        r1.A0G = new FPB(obj, i);
        r2.ErG(new AnonymousClass3Jb(r1));
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [X.FW2, X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.F1I, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v9, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x08f2, code lost:
        if (r0.isChecked() != true) goto L_0x08f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x09a8, code lost:
        if (X.2Ek.A01(r5.A06) != false) goto L_0x09aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x09be, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x09c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0bc4, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0bc7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0214, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x021b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x029e, code lost:
        if (r10 != null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02a2, code lost:
        if (r11 != r10.A0S) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02a4, code lost:
        if (r11 != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02a6, code lost:
        r4 = "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02a7, code lost:
        r8.A9m("should_show_public_contacts", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ac, code lost:
        if (r13 == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02ae, code lost:
        if (r10 == null) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b2, code lost:
        if (r9 == r10.A0R) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02b4, code lost:
        r8.A0H(X.AnonymousClass000.A00(3454), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02bd, code lost:
        r2 = r8.A0M();
        X.EDV.A00(r2, r5, r6, 7);
        r7.schedule(r2);
        r1 = -579634206;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A00
            r5 = r20
            switch(r0) {
                case 0: goto L_0x0bb1;
                case 1: goto L_0x0b9d;
                case 2: goto L_0x0b89;
                case 3: goto L_0x0b6c;
                case 4: goto L_0x0b46;
                case 5: goto L_0x0b34;
                case 6: goto L_0x0b21;
                case 7: goto L_0x0b0e;
                case 8: goto L_0x0042;
                case 9: goto L_0x0ae9;
                case 10: goto L_0x0ac4;
                case 11: goto L_0x014c;
                case 12: goto L_0x0ab1;
                case 13: goto L_0x0a9c;
                case 14: goto L_0x0a87;
                case 15: goto L_0x0a76;
                case 16: goto L_0x0203;
                case 17: goto L_0x01f2;
                case 18: goto L_0x0a29;
                case 19: goto L_0x01e1;
                case 20: goto L_0x0a06;
                case 21: goto L_0x098d;
                case 22: goto L_0x08d9;
                case 23: goto L_0x086a;
                case 24: goto L_0x0816;
                case 25: goto L_0x0803;
                case 26: goto L_0x07f0;
                case 27: goto L_0x07df;
                case 28: goto L_0x072e;
                case 29: goto L_0x00ff;
                case 30: goto L_0x01d0;
                case 31: goto L_0x06ff;
                case 32: goto L_0x06ea;
                case 33: goto L_0x06d9;
                case 34: goto L_0x06c8;
                case 35: goto L_0x0680;
                case 36: goto L_0x066f;
                case 37: goto L_0x064a;
                case 38: goto L_0x0639;
                case 39: goto L_0x026a;
                case 40: goto L_0x0628;
                case 41: goto L_0x05fb;
                case 42: goto L_0x05e6;
                case 43: goto L_0x05d1;
                case 44: goto L_0x05c0;
                case 45: goto L_0x05a9;
                case 46: goto L_0x0587;
                case 47: goto L_0x0576;
                case 48: goto L_0x0535;
                case 49: goto L_0x0524;
                case 50: goto L_0x0500;
                case 51: goto L_0x04da;
                case 52: goto L_0x04a4;
                case 53: goto L_0x046e;
                case 54: goto L_0x044c;
                case 55: goto L_0x043b;
                case 56: goto L_0x041e;
                case 57: goto L_0x0408;
                case 58: goto L_0x03f2;
                case 59: goto L_0x03e1;
                case 60: goto L_0x03d0;
                case 61: goto L_0x03bd;
                case 62: goto L_0x0064;
                case 63: goto L_0x03ac;
                case 64: goto L_0x0192;
                case 65: goto L_0x039b;
                case 66: goto L_0x038a;
                case 67: goto L_0x0379;
                case 68: goto L_0x016f;
                case 69: goto L_0x0368;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -839009011(0xffffffffcdfdbd0d, float:-5.3212816E8)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.business.fragment.SupportLinksFragment r0 = (com.instagram.business.fragment.SupportLinksFragment) r0
            X.6Yo r3 = X.Dbb.A0H(r0)
            X.DbU.A0v()
            java.lang.String r2 = r0.A03
            java.lang.String r0 = r0.A04
            X.AnonymousClass7TG.A1N(r2, r0)
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            X.Dba.A0v(r1, r2, r0)
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r0 = new com.instagram.business.fragment.SupportProfileDisplayOptionsFragment
            r0.<init>()
            r0.setArguments(r1)
            r3.A0E(r0)
            java.lang.String r0 = com.instagram.business.fragment.SupportLinksFragment.A06
            r3.A0A = r0
            r3.A04()
            r0 = -50669403(0xfffffffffcfad8a5, float:-1.0419746E37)
        L_0x003e:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0042:
            r0 = -1506380975(0xffffffffa6367351, float:-6.330022E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.ERb r3 = (X.C48014ERb) r3
            X.F1n r2 = r3.A05
            if (r2 == 0) goto L_0x0060
            java.lang.String r1 = "bug_reported"
            r2.A00(r1)
            android.view.View$OnClickListener r1 = r3.A0D
            r1.onClick(r5)
            r1 = 431849222(0x19bd7f06, float:1.9593446E-23)
            goto L_0x0bc4
        L_0x0060:
            java.lang.String r3 = "dogfoodingRageshakeLogger"
            goto L_0x0214
        L_0x0064:
            r0 = 921487479(0x36ecc877, float:7.0566853E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r7 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r7
            boolean r10 = com.instagram.business.fragment.ProfileDisplayOptionsFragment.A03(r7)
            com.instagram.model.business.BusinessInfo r1 = r7.A04
            X.0qQ.A0A(r1)
            boolean r3 = r1.A0S
            com.instagram.model.business.BusinessInfo r1 = r7.A04
            X.0qQ.A0A(r1)
            boolean r2 = r1.A0Q
            if (r10 == 0) goto L_0x00da
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r8 = "should_show_public_contacts"
            r4.put(r8, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "should_show_category"
            r4.put(r6, r1)
            com.instagram.model.business.BusinessInfo r1 = r7.A05
            X.0qQ.A0A(r1)
            boolean r5 = r1.A0S
            com.instagram.model.business.BusinessInfo r1 = r7.A05
            X.0qQ.A0A(r1)
            boolean r3 = r1.A0Q
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r2.put(r8, r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r2.put(r6, r1)
        L_0x00b9:
            com.instagram.model.business.BusinessInfo r1 = r7.A04
            X.0qQ.A0A(r1)
            boolean r12 = r1.A0Q
            com.instagram.model.business.BusinessInfo r1 = r7.A04
            X.0qQ.A0A(r1)
            boolean r11 = r1.A0S
            com.instagram.model.business.BusinessInfo r1 = r7.A04
            X.0qQ.A0A(r1)
            boolean r9 = r1.A0R
            r13 = r10 ^ 1
            com.instagram.model.business.BusinessInfo r10 = r7.A05
            com.instagram.common.session.UserSession r6 = r7.A03
            if (r6 != 0) goto L_0x0276
            java.lang.String r3 = "userSession"
            goto L_0x0214
        L_0x00da:
            com.instagram.model.business.BusinessInfo r1 = r7.A04
            X.0qQ.A0A(r1)
            boolean r1 = r1.A0R
            java.util.HashMap r4 = X.FRK.A00(r3, r2, r1)
            com.instagram.model.business.BusinessInfo r1 = r7.A05
            X.0qQ.A0A(r1)
            boolean r3 = r1.A0S
            com.instagram.model.business.BusinessInfo r1 = r7.A05
            X.0qQ.A0A(r1)
            boolean r2 = r1.A0Q
            com.instagram.model.business.BusinessInfo r1 = r7.A05
            X.0qQ.A0A(r1)
            boolean r1 = r1.A0R
            java.util.HashMap r2 = X.FRK.A00(r3, r2, r1)
            goto L_0x00b9
        L_0x00ff:
            r0 = 2045323332(0x79e92844, float:1.5132773E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            com.instagram.business.fragment.CategorySearchFragment r4 = (com.instagram.business.fragment.CategorySearchFragment) r4
            X.FYO r1 = r4.A07
            if (r1 == 0) goto L_0x014a
            java.lang.String r2 = r1.A01
        L_0x0110:
            java.lang.String r1 = "continue"
            com.instagram.business.fragment.CategorySearchFragment.A08(r4, r1, r2)
            X.FYO r1 = r4.A07
            if (r1 == 0) goto L_0x0148
            java.lang.String r3 = r1.A01
        L_0x011b:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x031f
            com.instagram.model.business.BusinessInfo r1 = r4.A0B
            if (r1 == 0) goto L_0x031a
            boolean r11 = r1.A0Q
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r10 = "category_id"
            r5.put(r10, r3)
            java.lang.String r1 = java.lang.String.valueOf(r11)
            java.lang.String r9 = "should_show_category"
            r5.put(r9, r1)
            android.content.Context r3 = r4.requireContext()
            X.0wW r2 = r4.A0A
            X.0qQ.A0A(r2)
            java.lang.String r1 = r4.A0C
            if (r1 != 0) goto L_0x02cd
            java.lang.String r3 = "entryPoint"
            goto L_0x0214
        L_0x0148:
            r3 = 0
            goto L_0x011b
        L_0x014a:
            r2 = 0
            goto L_0x0110
        L_0x014c:
            r0 = 42107342(0x28281ce, float:1.9176287E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r6 = r3.A01
            X.ERb r6 = (X.C48014ERb) r6
            X.37D r5 = X.DbV.A0g(r6, r1)
            r2 = 1
            if (r5 == 0) goto L_0x0363
            r1 = r5
            X.37F r1 = (X.AnonymousClass37F) r1
            boolean r1 = r1.A0g
            if (r1 != r2) goto L_0x0363
            X.F1f r2 = r6.A01
            if (r2 != 0) goto L_0x0324
            java.lang.String r3 = "logger"
            goto L_0x0214
        L_0x016f:
            r0 = -407785755(0xffffffffe7b1aee5, float:-1.6781702E24)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            com.instagram.business.fragment.SuggestBusinessFragment r3 = (com.instagram.business.fragment.SuggestBusinessFragment) r3
            java.lang.String r1 = "continue"
            r0 = 0
            com.instagram.business.fragment.SuggestBusinessFragment.A03(r3, r1, r0)
            X.De2 r2 = r3.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 27
            X.EDg r0 = X.C47697EDg.A00(r3, r0)
            r2.A01(r0, r1)
            r0 = 1414144169(0x544a20a9, float:3.47252536E12)
            goto L_0x003e
        L_0x0192:
            r0 = -1474294959(0xffffffffa8200b51, float:-8.884238E-15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r1 = "com.bloks.www.ig.commerce.discounts.selector"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.DiU r2 = X.C46649DiU.A04(r1, r0)
            java.lang.Object r4 = r3.A01
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r4 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r4
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r3 = "userSession"
            if (r0 == 0) goto L_0x0214
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            r0 = 0
            r1.A0k = r0
            X.3M3 r2 = X.C49891FBs.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A03
            if (r0 == 0) goto L_0x0214
            X.6Yo r1 = X.DbV.A0M(r2, r1, r0)
            java.lang.String r0 = "profile_display_options"
            r1.A0A = r0
            r1.A04()
            r0 = 146958663(0x8c26947, float:1.1700701E-33)
            goto L_0x003e
        L_0x01d0:
            r0 = 1136918952(0x43c401a8, float:392.01294)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.Dbb.A1S(r0)
            r0 = -1132824616(0xffffffffbc7a77d8, float:-0.015287362)
            goto L_0x003e
        L_0x01e1:
            r0 = 838668581(0x31fd1125, float:7.365218E-9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.Dbb.A1S(r0)
            r0 = 1816526532(0x6c45fec4, float:9.574459E26)
            goto L_0x003e
        L_0x01f2:
            r0 = -2106430544(0xffffffff82726bb0, float:-1.7810257E-37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.Dbb.A1S(r0)
            r0 = 1661224106(0x630444aa, float:2.439918E21)
            goto L_0x003e
        L_0x0203:
            r0 = -1361821971(0xffffffffaed43eed, float:-9.651822E-11)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4G r1 = (X.E4G) r1
            X.De2 r6 = r1.A03
            if (r6 != 0) goto L_0x021c
            java.lang.String r3 = "onboardingChecklistNetworkHelper"
        L_0x0214:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x021c:
            java.util.List r0 = r1.A06
            if (r0 != 0) goto L_0x0223
            java.lang.String r3 = "selectedObjectiveIds"
            goto L_0x0214
        L_0x0223:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r0)
            java.util.Set r0 = r1.A09
            java.util.ArrayList r4 = X.00k.A0U(r0)
            r0 = 10
            X.EDg r3 = X.C47697EDg.A00(r1, r0)
            java.lang.String r1 = "objectives"
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/account/set_business_objectives_connection_methods/"
            r2.A0A(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r7)
            java.lang.String r0 = r0.toString()
            r2.A9m(r1, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r4)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "connection_methods"
            X.DbX.A1M(r2, r0, r1)
            X.1OC r1 = r2.A0M()
            r1.A00 = r3
            X.4D6 r0 = r6.A01
            r0.schedule(r1)
            r0 = 1412914890(0x54375eca, float:3.15027725E12)
            goto L_0x003e
        L_0x026a:
            r0 = -52102368(0xfffffffffce4fb20, float:-9.511497E36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r0 = 1113902421(0x4264cd55, float:57.20052)
            goto L_0x003e
        L_0x0276:
            X.ExO r5 = new X.ExO
            r5.<init>(r7, r2, r4)
            X.1NY r8 = X.AnonymousClass7TG.A0a(r6)
            java.lang.String r1 = "business/account/edit_account/"
            r8.A0A(r1)
            java.lang.Class<X.92k> r2 = X.C3727892k.class
            java.lang.Class<X.92l> r1 = X.C3727992l.class
            X.DbV.A1N(r8, r2, r1)
            java.lang.String r4 = "1"
            java.lang.String r3 = "0"
            if (r10 == 0) goto L_0x0295
            boolean r1 = r10.A0Q
            if (r12 == r1) goto L_0x02a0
        L_0x0295:
            r2 = r3
            if (r12 == 0) goto L_0x0299
            r2 = r4
        L_0x0299:
            java.lang.String r1 = "should_show_category"
            r8.A9m(r1, r2)
            if (r10 == 0) goto L_0x02a4
        L_0x02a0:
            boolean r1 = r10.A0S
            if (r11 == r1) goto L_0x02ac
        L_0x02a4:
            if (r11 != 0) goto L_0x02a7
            r4 = r3
        L_0x02a7:
            java.lang.String r1 = "should_show_public_contacts"
            r8.A9m(r1, r4)
        L_0x02ac:
            if (r13 == 0) goto L_0x02bd
            if (r10 == 0) goto L_0x02b4
            boolean r1 = r10.A0R
            if (r9 == r1) goto L_0x02bd
        L_0x02b4:
            r1 = 3454(0xd7e, float:4.84E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r8.A0H(r1, r9)
        L_0x02bd:
            X.1OC r2 = r8.A0M()
            r1 = 7
            X.EDV.A00(r2, r5, r6, r1)
            r7.schedule(r2)
            r1 = -579634206(0xffffffffdd737be2, float:-1.09655408E18)
            goto L_0x0bc4
        L_0x02cd:
            r8 = 1
            X.EDW r7 = new X.EDW
            r7.<init>(r3, r4, r2, r5)
            android.util.LruCache r1 = X.FA3.A01
            X.FYO r1 = r4.A07
            if (r1 == 0) goto L_0x0318
            java.lang.String r6 = r1.A01
        L_0x02db:
            X.0qQ.A0A(r6)
            android.content.Context r5 = r4.requireContext()
            X.0wW r1 = r4.A0A
            X.DbS.A1Z(r1)
            X.0gy r4 = X.AnonymousClass07i.A00(r4)
            X.AnonymousClass7TF.A1C(r6, r8, r1)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r1 = "business/account/set_business_category/"
            r3.A0A(r1)
            java.lang.Class<X.92k> r2 = X.C3727892k.class
            java.lang.Class<X.92l> r1 = X.C3727992l.class
            r3.A0Q(r2, r1)
            r3.A0R = r8
            r3.A9m(r10, r6)
            if (r11 == 0) goto L_0x0315
            java.lang.String r1 = "1"
        L_0x0307:
            X.1OC r1 = X.DbT.A0T(r3, r9, r1)
            r1.A00 = r7
            X.1ES.A00(r5, r4, r1)
            r1 = 1412588516(0x543263e4, float:3.06472026E12)
            goto L_0x0bc4
        L_0x0315:
            java.lang.String r1 = "0"
            goto L_0x0307
        L_0x0318:
            r6 = 0
            goto L_0x02db
        L_0x031a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x031f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0324:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r2.A00(r1)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.OLY r3 = new X.OLY
            r3.<init>(r1)
            X.0wW r2 = r6.getSession()
            boolean r1 = r2 instanceof com.instagram.common.session.UserSession
            if (r1 == 0) goto L_0x034f
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            boolean r1 = X.2R8.A00(r2)
            if (r1 == 0) goto L_0x034f
            android.content.Context r2 = r6.requireContext()
            r1 = 2131954334(0x7f130a9e, float:1.9545164E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
            r3.A01 = r1
        L_0x034f:
            com.instagram.bugreporter.BugReportComposerViewModel r4 = r3.A00()
            android.app.Activity r3 = X.DbT.A03(r6)
            r2 = 0
            X.NgC r1 = new X.NgC
            r1.<init>(r2, r3, r4, r6)
            r5.A0Q(r1)
            X.C48014ERb.A07(r6)
        L_0x0363:
            r1 = 589202327(0x231e8397, float:8.593062E-18)
            goto L_0x0bc4
        L_0x0368:
            r0 = 1142679452(0x441be79c, float:623.6189)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = 667913577(0x27cf8d69, float:5.760736E-15)
            goto L_0x0bc4
        L_0x0379:
            r0 = 1258375065(0x4b014799, float:8472473.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = 758596201(0x2d374269, float:1.0417092E-11)
            goto L_0x0bc4
        L_0x038a:
            r0 = 38907374(0x251adee, float:1.540481E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = -1113234364(0xffffffffbda56444, float:-0.08075765)
            goto L_0x0bc4
        L_0x039b:
            r0 = 1576227609(0x5df35319, float:2.19167316E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = -1205017448(0xffffffffb82ce498, float:-4.122089E-5)
            goto L_0x0bc4
        L_0x03ac:
            r0 = 1728332228(0x670441c4, float:6.2456554E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 1100624384(0x419a3200, float:19.274414)
            goto L_0x0bc4
        L_0x03bd:
            r0 = -1048725195(0xffffffffc17db935, float:-15.857717)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E78 r1 = (X.E78) r1
            r1.onBackPressed()
            r1 = 1918192202(0x72554a4a, float:4.2246475E30)
            goto L_0x0bc4
        L_0x03d0:
            r0 = -198828054(0xfffffffff4261fea, float:-5.264701E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 1517158047(0x5a6dfe9f, float:1.67473821E16)
            goto L_0x0bc4
        L_0x03e1:
            r0 = -43961984(0xfffffffffd613180, float:-1.8708332E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = -920316180(0xffffffffc92516ec, float:-676206.75)
            goto L_0x0bc4
        L_0x03f2:
            r0 = 118486426(0x70ff59a, float:1.08303E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            com.instagram.business.fragment.OnboardingCheckListFragment r2 = (com.instagram.business.fragment.OnboardingCheckListFragment) r2
            r1 = 1
            r2.A09 = r1
            X.DbT.A1J(r2)
            r1 = -570171167(0xffffffffde03e0e1, float:-2.37571065E18)
            goto L_0x0bc4
        L_0x0408:
            r0 = 674027808(0x282cd920, float:9.5949995E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            com.instagram.business.fragment.OnboardingCheckListFragment r2 = (com.instagram.business.fragment.OnboardingCheckListFragment) r2
            r1 = 1
            r2.A09 = r1
            r2.A00()
            r1 = 363836813(0x15afb58d, float:7.0968374E-26)
            goto L_0x0bc4
        L_0x041e:
            r0 = -1408537461(0xffffffffac0b6c8b, float:-1.9813342E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            com.instagram.business.fragment.OnboardingCheckListFragment r3 = (com.instagram.business.fragment.OnboardingCheckListFragment) r3
            X.F3i r2 = r3.A04
            java.lang.String r1 = "continue"
            r2.A01(r1)
            r1 = 0
            r3.A09 = r1
            r3.A00()
            r1 = -21446266(0xfffffffffeb8c186, float:-1.2279139E38)
            goto L_0x0bc4
        L_0x043b:
            r0 = -118155753(0xfffffffff8f51617, float:-3.9767524E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 1116824297(0x429162e9, float:72.693184)
            goto L_0x0bc4
        L_0x044c:
            r0 = 377517496(0x168075b8, float:2.0753806E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E4X r4 = (X.E4X) r4
            java.lang.String r1 = "continue"
            X.E4X.A01(r4, r1)
            X.De2 r3 = r4.A04
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            r1 = 19
            X.EDg r1 = X.C47697EDg.A00(r4, r1)
            r3.A01(r1, r2)
            r1 = 2060838831(0x7ad5e7af, float:5.5532917E35)
            goto L_0x0bc4
        L_0x046e:
            r0 = -1539471240(0xffffffffa43d8878, float:-4.1098436E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E4X r6 = (X.E4X) r6
            java.lang.String r1 = "faq_education_unit"
            X.E4X.A01(r6, r1)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r1 = r6.A05
            X.DbU.A1D(r5, r1)
            com.instagram.common.session.UserSession r4 = r6.A05
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r6.A00
            r1 = 265(0x109, float:3.71E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r3 = X.DbS.A0b(r2, r5, r4, r3, r1)
            X.4DH r2 = r6.A02
            r1 = 117465(0x1cad9, float:1.64604E-40)
            r3.A0D(r2, r1)
            r1 = 907079544(0x3610ef78, float:2.1597061E-6)
            goto L_0x0bc4
        L_0x04a4:
            r0 = -1492524745(0xffffffffa709e137, float:-1.9134659E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E4X r6 = (X.E4X) r6
            java.lang.String r1 = "activity_status_education_unit"
            X.E4X.A01(r6, r1)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            r1 = 73
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.DiU r5 = X.C46649DiU.A04(r1, r2)
            androidx.fragment.app.FragmentActivity r4 = r6.A00
            com.instagram.common.session.UserSession r1 = r6.A05
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r1)
            X.4DH r2 = r6.A02
            r1 = 2131963000(0x7f132c78, float:1.9562741E38)
            X.DbZ.A19(r2, r3, r1)
            r5.A0D(r4, r3)
            r1 = 680732153(0x289325f9, float:1.6336746E-14)
            goto L_0x0bc4
        L_0x04da:
            r0 = -358322458(0xffffffffeaa46ee6, float:-9.939377E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.E4X r2 = (X.E4X) r2
            java.lang.String r1 = "promote_education_unit"
            X.E4X.A01(r2, r1)
            X.1Yi r3 = X.C48732EjH.A00()
            java.lang.String r6 = r2.A06
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            com.instagram.common.session.UserSession r5 = r2.A05
            r7 = 0
            r8 = 0
            r3.A02(r4, r5, r6, r7, r8)
            r1 = -377239506(0xffffffffe983c82e, float:-1.9914326E25)
            goto L_0x0bc4
        L_0x0500:
            r0 = -813551654(0xffffffffcf822fda, float:-4.3683482E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E4X r5 = (X.E4X) r5
            java.lang.String r1 = "insights_education_unit"
            X.E4X.A01(r5, r1)
            com.instagram.common.session.UserSession r4 = r5.A05
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r4)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            java.lang.String r1 = "onboarding_checklist_item"
            X.FG2.A00(r2, r5, r4, r3, r1)
            r1 = 625146299(0x2542f9bb, float:1.691143E-16)
            goto L_0x0bc4
        L_0x0524:
            r0 = 1558535663(0x5ce55def, float:5.16488406E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = -1168864817(0xffffffffba5489cf, float:-8.107693E-4)
            goto L_0x0bc4
        L_0x0535:
            r0 = -1045414272(0xffffffffc1b03e80, float:-22.030518)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.E4E r2 = (X.E4E) r2
            java.lang.String r6 = "continue"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A00
            if (r1 == 0) goto L_0x0557
            java.lang.String r4 = "invite_story"
            r7 = 0
            java.lang.String r5 = r2.A02
            X.Xtl r3 = new X.Xtl
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Ckp(r3)
        L_0x0557:
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            com.instagram.common.session.UserSession r4 = r2.A01
            android.content.Context r3 = r2.requireContext()
            android.content.res.Resources r2 = X.DbV.A05(r2)
            r1 = 2131973023(0x7f13539f, float:1.958307E38)
            java.lang.String r2 = r2.getString(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.C48755Eje.A00(r5, r3, r4, r1, r2)
            r1 = -2056366790(0xffffffff856e553a, float:-1.120636E-35)
            goto L_0x0bc4
        L_0x0576:
            r0 = 308683811(0x12662423, float:7.2619745E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 1300687564(0x4d86eacc, float:2.82941824E8)
            goto L_0x0bc4
        L_0x0587:
            r0 = 959488229(0x3930a0e5, float:1.6844606E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            com.instagram.business.fragment.InviteFollowersV2Fragment r4 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r4
            java.lang.String r1 = "continue"
            com.instagram.business.fragment.InviteFollowersV2Fragment.A06(r4, r1)
            X.De2 r3 = r4.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r1 = 18
            X.EDg r1 = X.C47697EDg.A00(r4, r1)
            r3.A01(r1, r2)
            r1 = -160367158(0xfffffffff670fdca, float:-1.2219714E33)
            goto L_0x0bc4
        L_0x05a9:
            r0 = -203324143(0xfffffffff3e18511, float:-3.5735037E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            com.instagram.business.fragment.FBPageListWithPreviewFragment r1 = (com.instagram.business.fragment.FBPageListWithPreviewFragment) r1
            X.F2v r2 = r1.A03
            java.lang.String r1 = "continue"
            r2.A00(r1)
            r1 = -1160052336(0xffffffffbadb0190, float:-0.001670884)
            goto L_0x0bc4
        L_0x05c0:
            r0 = 126124692(0x7848294, float:1.99379E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = -1569003851(0xffffffffa27ae6b5, float:-3.4003453E-18)
            goto L_0x0bc4
        L_0x05d1:
            r0 = -668810765(0xffffffffd822c1f3, float:-7.1581556E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            com.facebook.common.callercontext.CallerContext r1 = X.E6O.A05
            X.DbT.A1J(r2)
            r1 = -133867881(0xfffffffff8055697, float:-1.0817683E34)
            goto L_0x0bc4
        L_0x05e6:
            r0 = 350175727(0x14df41ef, float:2.2543252E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            com.facebook.common.callercontext.CallerContext r1 = X.E6O.A05
            X.DbT.A1J(r2)
            r1 = 336285148(0x140b4ddc, float:7.033062E-27)
            goto L_0x0bc4
        L_0x05fb:
            r0 = 1821332402(0x6c8f53b2, float:1.386173E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E6O r3 = (X.E6O) r3
            com.facebook.common.callercontext.CallerContext r1 = X.E6O.A05
            android.view.View r2 = r3.A00
            r1 = 0
            r2.setVisibility(r1)
            X.E8w r1 = r3.A02
            r3.A0V(r1)
            X.E8w r1 = r3.A02
            boolean r1 = r1.isEmpty()
            X.C46445Df7.A01(r3, r1)
            android.widget.ImageView r2 = r3.A01
            r1 = 8
            r2.setVisibility(r1)
            r1 = 1063812658(0x3f687e32, float:0.9081756)
            goto L_0x0bc4
        L_0x0628:
            r0 = 1195860641(0x474762a1, float:51042.63)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 666313249(0x27b72221, float:5.0829706E-15)
            goto L_0x0bc4
        L_0x0639:
            r0 = -2084266117(0xffffffff83c49f7b, float:-1.155646E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 1325291082(0x4efe564a, float:2.13353395E9)
            goto L_0x0bc4
        L_0x064a:
            r0 = 1959805190(0x74d04106, float:1.3199665E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            com.instagram.business.fragment.EditBusinessFBPageFragment r2 = (com.instagram.business.fragment.EditBusinessFBPageFragment) r2
            X.E8w r1 = r2.A01
            r2.A0V(r1)
            X.E8w r1 = r2.A01
            boolean r1 = r1.isEmpty()
            X.C46445Df7.A01(r2, r1)
            android.widget.ImageView r2 = r2.A00
            r1 = 8
            r2.setVisibility(r1)
            r1 = -331875021(0xffffffffec37fd33, float:-8.897165E26)
            goto L_0x0bc4
        L_0x066f:
            r0 = -1567717119(0xffffffffa28e8901, float:-3.8634236E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = -704879842(0xffffffffd5fc631e, float:-3.46878294E13)
            goto L_0x0bc4
        L_0x0680:
            r0 = 1910455701(0x71df3d95, float:2.2108674E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E4I r4 = (X.E4I) r4
            java.lang.String r8 = "continue"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r4.A00
            if (r1 == 0) goto L_0x06a2
            java.lang.String r6 = "create_post"
            r9 = 0
            java.lang.String r7 = r4.A02
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.Ckp(r5)
        L_0x06a2:
            android.content.Context r2 = r4.requireContext()
            java.lang.Class<com.instagram.creation.activity.MediaCaptureActivity> r1 = com.instagram.creation.activity.MediaCaptureActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2, r1)
            com.instagram.common.session.UserSession r1 = r4.A01
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putExtra(r1, r2)
            r2 = 100
            X.0b6 r1 = X.0b6.A00()
            X.0R3 r1 = r1.A07()
            r1.A0H(r3, r4, r2)
            r1 = 1416790599(0x54728247, float:4.16627111E12)
            goto L_0x0bc4
        L_0x06c8:
            r0 = 1923681268(0x72a90bf4, float:6.6966294E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = -824913083(0xffffffffced4d345, float:-1.78530778E9)
            goto L_0x0bc4
        L_0x06d9:
            r0 = 2057649310(0x7aa53c9e, float:4.2897922E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = 888203732(0x34f0e9d4, float:4.4873616E-7)
            goto L_0x0bc4
        L_0x06ea:
            r0 = -1002948899(0xffffffffc43836dd, float:-736.85724)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.E6U r2 = (X.E6U) r2
            java.lang.String r1 = r2.A05
            r2.A0c(r1)
            r1 = 1471092325(0x57af1665, float:3.85021437E14)
            goto L_0x0bc4
        L_0x06ff:
            r0 = -2137606386(0xffffffff8096b70e, float:-1.3840992E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            com.instagram.business.fragment.CategorySearchFragment r3 = (com.instagram.business.fragment.CategorySearchFragment) r3
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.categoryToggle
            if (r1 == 0) goto L_0x0723
            boolean r1 = r1.isChecked()
            r2 = r1 ^ 1
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.categoryToggle
            if (r1 == 0) goto L_0x071b
            r1.setCheckedAnimated(r2)
        L_0x071b:
            com.instagram.business.fragment.CategorySearchFragment.A0B(r3, r2)
            r1 = -1855514374(0xffffffff916718fa, float:-1.8230383E-28)
            goto L_0x0bc4
        L_0x0723:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r1 = -1782120528(0xffffffff95c6ffb0, float:-8.0374967E-26)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x072e:
            r0 = 582437690(0x22b74b3a, float:4.96819E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            if (r20 == 0) goto L_0x0754
            android.content.Context r2 = r5.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r4 = r2.getSystemService(r1)
            r1 = 11
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r4, r1)
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            android.os.IBinder r2 = r5.getWindowToken()
            r1 = 0
            r4.hideSoftInputFromWindow(r2, r1)
        L_0x0754:
            java.lang.Object r5 = r3.A01
            X.E7E r5 = (X.E7E) r5
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A02
            android.widget.EditText r1 = r1.A01
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x07bd
            java.lang.String r4 = r5.A03
            java.lang.String r1 = ""
            com.instagram.model.business.PublicPhoneContact r6 = new com.instagram.model.business.PublicPhoneContact
            r6.<init>()
            r6.A01 = r1
            r6.A02 = r1
        L_0x0773:
            r6.A03 = r1
            r6.A00 = r4
            androidx.fragment.app.Fragment r3 = r5.getTargetFragment()
            r3.getClass()
            X.E7B r3 = (X.E7B) r3
            com.instagram.model.business.BusinessInfo r1 = r3.A05
            X.FEa r2 = new X.FEa
            r2.<init>(r1)
            com.instagram.business.ui.BusinessInfoSectionView r1 = r3.A04
            java.lang.String r1 = r1.getEmail()
            r2.A0B = r1
            r2.A01 = r6
            com.instagram.model.business.BusinessInfo r1 = new com.instagram.model.business.BusinessInfo
            r1.<init>(r2)
            r3.A05 = r1
            com.instagram.business.ui.BusinessInfoSectionView r2 = r3.A04
            android.content.Context r1 = r3.getContext()
            r2.A03(r1, r6)
            r1 = 1
            r3.A09 = r1
            com.instagram.common.session.UserSession r1 = r5.getSession()
            com.instagram.user.model.User r4 = X.DbT.A0j(r1)
            java.lang.String r3 = r6.A03
            android.os.Handler r2 = r5.A08
            X.Fu6 r1 = new X.Fu6
            r1.<init>(r5, r4, r3)
            r2.post(r1)
            r1 = -1049983067(0xffffffffc16a87a5, float:-14.658116)
            goto L_0x0bc4
        L_0x07bd:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A02
            com.instagram.ui.widget.editphonenumber.CountryCodeTextView r1 = r1.A04
            java.lang.String r3 = r1.getCountryCodeWithoutPlus()
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A02
            android.widget.EditText r1 = r1.A01
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r1)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A02
            java.lang.String r1 = r1.getPhoneNumber()
            java.lang.String r4 = r5.A03
            com.instagram.model.business.PublicPhoneContact r6 = new com.instagram.model.business.PublicPhoneContact
            r6.<init>()
            r6.A01 = r3
            r6.A02 = r2
            goto L_0x0773
        L_0x07df:
            r0 = 1965034571(0x75200c4b, float:2.0288497E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 1245893195(0x4a42d24b, float:3191954.8)
            goto L_0x0bc4
        L_0x07f0:
            r0 = -287165064(0xffffffffeee23578, float:-3.5004126E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4e r1 = (X.C47479E4e) r1
            X.C47479E4e.A01(r1)
            r1 = 342905879(0x14705417, float:1.2133487E-26)
            goto L_0x0bc4
        L_0x0803:
            r0 = -1070739155(0xffffffffc02dd12d, float:-2.715892)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4e r1 = (X.C47479E4e) r1
            X.C47479E4e.A01(r1)
            r1 = -1619222334(0xffffffff9f7ca0c2, float:-5.349605E-20)
            goto L_0x0bc4
        L_0x0816:
            r0 = -852609713(0xffffffffcd2e354f, float:-1.82670576E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E4e r5 = (X.C47479E4e) r5
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r5.A02
            if (r1 == 0) goto L_0x0838
            java.lang.String r7 = "page_import_info_location"
            r10 = 0
            java.lang.String r8 = r5.A08
            java.lang.String r9 = "city"
            X.Xtl r6 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.Ckp(r6)
        L_0x0838:
            java.lang.String r1 = r5.A08
            if (r1 != 0) goto L_0x083e
            java.lang.String r1 = ""
        L_0x083e:
            X.DbU.A0v()
            boolean r3 = r5.A0A
            r4 = 0
            X.0qQ.A0B(r1, r4)
            android.os.Bundle r2 = X.DbX.A0B(r1)
            java.lang.String r1 = "BusinessLocationFragment.EXTRA_SHOULD_SHOW_IN_MODAL"
            r2.putBoolean(r1, r3)
            X.E6U r3 = new X.E6U
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r2, r3, r5)
            com.instagram.common.session.UserSession r1 = r5.A04
            X.6Yo r1 = X.DbV.A0N(r3, r2, r1)
            r1.A0F(r5, r4)
            r1.A04()
            r1 = -1477997017(0xffffffffa7e78e27, float:-6.42695E-15)
            goto L_0x0bc4
        L_0x086a:
            r0 = -373410391(0xffffffffe9be35a9, float:-2.8743664E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r11 = r3.A01
            X.E4e r11 = (X.C47479E4e) r11
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A02
            if (r1 == 0) goto L_0x088c
            java.lang.String r3 = "page_import_info_location"
            r6 = 0
            java.lang.String r4 = r11.A08
            java.lang.String r5 = "remove_info"
            X.Xtl r2 = new X.Xtl
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Ckp(r2)
        L_0x088c:
            java.lang.String r2 = r11.A08
            if (r2 == 0) goto L_0x08b9
            java.lang.String r1 = "profile_multiple_addresses_edit_list"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x08b9
            boolean r1 = r11.A09
            r2 = r1 ^ 1
            com.instagram.common.session.UserSession r12 = r11.A04
            r1 = 1
            X.0qQ.A0B(r12, r1)
            if (r2 == 0) goto L_0x08d6
            java.lang.String r16 = "ig_profile_edit_address_page"
        L_0x08a6:
            java.lang.String r2 = r12.A06
            r18 = 0
            java.lang.String r13 = "click"
            r1 = 69
            java.lang.String r14 = X.C66579MXk.A00(r1)
            java.lang.String r15 = "subscriber"
            r17 = r2
            X.C49075Eot.A00(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x08b9:
            X.8ab r3 = X.DbW.A0U(r11)
            r1 = 2131971979(0x7f134f8b, float:1.9580953E38)
            r3.A09(r1)
            r2 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 17
            X.C50023FJi.A02(r3, r11, r1, r2)
            r3.A05()
            X.DbT.A1V(r3)
            r1 = 1046393272(0x3e5eb1b8, float:0.21747482)
            goto L_0x0bc4
        L_0x08d6:
            java.lang.String r16 = "ig_profile_add_address_page"
            goto L_0x08a6
        L_0x08d9:
            r0 = -543425836(0xffffffffdf9bfad4, float:-2.2479058E19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.Object r5 = r3.A01
            X.E2a r5 = (X.C47430E2a) r5
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A01
            r6 = 1
            if (r0 == 0) goto L_0x08f4
            boolean r0 = r0.isChecked()
            r1 = 1
            if (r0 == r6) goto L_0x08f5
        L_0x08f4:
            r1 = 0
        L_0x08f5:
            java.lang.String r0 = "native_calling_toggle_checked"
            r2.putBoolean(r0, r1)
            X.0hq r1 = r5.getParentFragmentManager()
            java.lang.String r0 = "native_calling_page_save"
            r1.A0z(r0, r2)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A01
            if (r0 == 0) goto L_0x098b
            boolean r0 = r0.isChecked()
            if (r0 != r6) goto L_0x098b
        L_0x090d:
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "deep_link"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0942
            X.0eM r0 = r5.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.EBp r3 = new X.EBp
            r3.<init>(r0, r5, r6)
            X.1NY r2 = X.DbZ.A0L(r1)
            java.lang.String r0 = "accounts/update_business_info/"
            r2.A0A(r0)
            java.lang.Class<X.92k> r1 = X.C3727892k.class
            java.lang.Class<X.92l> r0 = X.C3727992l.class
            X.DbV.A1N(r2, r1, r0)
            if (r6 == 0) goto L_0x0988
            java.lang.String r1 = "1"
        L_0x0937:
            java.lang.String r0 = "is_profile_audio_call_enabled"
            X.1OC r0 = X.DbT.A0T(r2, r0, r1)
            r0.A00 = r3
            X.1ES.A03(r0)
        L_0x0942:
            android.os.Handler r1 = r5.A06
            X.Fpi r0 = new X.Fpi
            r0.<init>(r5)
            r1.post(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A01
            if (r0 == 0) goto L_0x0984
            boolean r3 = r0.isChecked()
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r5.A00
            if (r2 == 0) goto L_0x0984
            java.lang.String r6 = "profile_native_calling"
            r8 = 0
            java.lang.String r7 = r5.A02
            boolean r0 = r5.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "is_profile_audio_call_enabled"
            X.0eP[] r0 = X.DbW.A1b(r1, r0)
            java.util.LinkedHashMap r11 = X.0Yt.A07(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.0eP[] r0 = X.DbW.A1b(r1, r0)
            java.util.LinkedHashMap r12 = X.0Yt.A07(r0)
            X.Xtl r5 = new X.Xtl
            r9 = r8
            r10 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Ci7(r5)
        L_0x0984:
            r0 = -2020789229(0xffffffff878d3413, float:-2.1245929E-34)
            goto L_0x09be
        L_0x0988:
            java.lang.String r1 = "0"
            goto L_0x0937
        L_0x098b:
            r6 = 0
            goto L_0x090d
        L_0x098d:
            r0 = 1574334171(0x5dd66edb, float:1.93144102E18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E7B r5 = (X.E7B) r5
            com.instagram.user.model.User r0 = r5.A06
            boolean r0 = X.2Ek.A00(r0)
            r3 = 0
            if (r0 != 0) goto L_0x09aa
            com.instagram.user.model.User r0 = r5.A06
            boolean r0 = X.2Ek.A01(r0)
            r1 = 0
            if (r0 == 0) goto L_0x09ab
        L_0x09aa:
            r1 = 1
        L_0x09ab:
            com.instagram.business.ui.BusinessInfoSectionView r0 = r5.A04
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x09c2
            if (r1 != 0) goto L_0x09c2
            r0 = 2131969520(0x7f1345f0, float:1.9575965E38)
        L_0x09b8:
            X.DbZ.A0s(r0)
        L_0x09bb:
            r0 = 1972619216(0x7593c7d0, float:3.7466812E32)
        L_0x09be:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x09c2:
            com.instagram.business.ui.BusinessInfoSectionView r1 = r5.A04
            java.lang.String r0 = r1.getEmail()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x09dc
            java.lang.String r0 = r1.getEmail()
            boolean r0 = X.0mp.A0C(r0)
            if (r0 != 0) goto L_0x09dc
            r0 = 2131969518(0x7f1345ee, float:1.9575961E38)
            goto L_0x09b8
        L_0x09dc:
            com.instagram.model.business.BusinessInfo r0 = r5.A05
            X.FEa r1 = new X.FEa
            r1.<init>(r0)
            com.instagram.business.ui.BusinessInfoSectionView r0 = r5.A04
            java.lang.String r0 = r0.getEmail()
            r1.A0B = r0
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>(r1)
            r5.A05 = r0
            com.instagram.common.session.UserSession r2 = r5.getSession()
            com.instagram.model.business.BusinessInfo r1 = r5.A05
            X.ECh r0 = new X.ECh
            r0.<init>(r5)
            X.C48754Ejd.A00(r0, r2, r5, r1)
            com.instagram.actionbar.ActionButton r0 = r5.A02
            r0.setEnabled(r3)
            goto L_0x09bb
        L_0x0a06:
            r0 = -1821630491(0xffffffff936c1fe5, float:-2.9803113E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Yh r4 = X.C18138VmE.A00()
            java.lang.Object r2 = r3.A01
            X.E4D r2 = (X.E4D) r2
            X.0eM r1 = r2.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            java.lang.String r1 = "onboarding_checklist"
            r4.A09(r2, r3, r1)
            r1 = 1995531778(0x76f16602, float:2.4480713E33)
            goto L_0x0bc4
        L_0x0a29:
            r0 = 1230917606(0x495e4fe6, float:910590.4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E4H r4 = (X.E4H) r4
            X.0eM r1 = r4.A0B
            java.lang.Object r3 = r1.getValue()
            X.Dkd r3 = (X.C46750Dkd) r3
            java.util.Set r1 = r4.A0A
            java.util.List r2 = X.00k.A0a(r1)
            X.2Fj r1 = r3.A01
            r1.A0B(r2)
            X.E4G r6 = new X.E4G
            r6.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            android.os.Bundle r1 = r4.mArguments
            r2.putAll(r1)
            r6.setArguments(r2)
            X.F1I r5 = new X.F1I
            r5.<init>()
            androidx.fragment.app.FragmentActivity r7 = r4.requireActivity()
            X.0eM r1 = r4.A0C
            X.0lg r1 = X.DbT.A0X(r1)
            X.EtT r8 = new X.EtT
            r8.<init>(r1)
            r9 = 0
            r10 = 1
            r5.A00(r6, r7, r8, r9, r10)
            r1 = -1383760986(0xffffffffad857ba6, float:-1.517526E-11)
            goto L_0x0bc4
        L_0x0a76:
            r0 = 1819716785(0x6c76acb1, float:1.19284505E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = 424996369(0x1954ee11, float:1.100822E-23)
            goto L_0x0bc4
        L_0x0a87:
            r0 = -1113301296(0xffffffffbda45ed0, float:-0.080258965)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r1 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r1
            android.widget.RadioButton r1 = r1.mCreatorRadioButton
            r1.performClick()
            r1 = -560914264(0xffffffffde9120a8, float:-5.2287715E18)
            goto L_0x0bc4
        L_0x0a9c:
            r0 = 888389391(0x34f3bf0f, float:4.540129E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r1 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r1
            android.widget.RadioButton r1 = r1.mBusinessRadioButton
            r1.performClick()
            r1 = 1435253275(0x558c3a1b, float:1.92726486E13)
            goto L_0x0bc4
        L_0x0ab1:
            r0 = 1552333045(0x5c86b8f5, float:3.03368074E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.G5R r1 = (X.G5R) r1
            r1.D6n()
            r1 = 740779772(0x2c2766fc, float:2.3789295E-12)
            goto L_0x0bc4
        L_0x0ac4:
            r0 = 1581506821(0x5e43e105, float:3.52864205E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.content.Context r1 = r5.getContext()
            X.07t r4 = X.AnonymousClass07t.A00(r1)
            java.lang.String r2 = "dev_intent_action_thread_capability_override"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2)
            r4.A02(r1)
            java.lang.Object r1 = r3.A01
            X.ERb r1 = (X.C48014ERb) r1
            X.C48014ERb.A07(r1)
            r1 = 653293825(0x26f07901, float:1.6686144E-15)
            goto L_0x0bc4
        L_0x0ae9:
            r0 = 1830271971(0x6d17bbe3, float:2.934961E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.content.Context r1 = r5.getContext()
            X.07t r4 = X.AnonymousClass07t.A00(r1)
            java.lang.String r2 = "IGD Dev"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2)
            r4.A02(r1)
            java.lang.Object r1 = r3.A01
            X.ERb r1 = (X.C48014ERb) r1
            X.C48014ERb.A07(r1)
            r1 = 1217536022(0x48922016, float:299264.7)
            goto L_0x0bc4
        L_0x0b0e:
            r0 = 1235859548(0x49a9b85c, float:1390347.5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.ERb r1 = (X.C48014ERb) r1
            X.C48014ERb.A07(r1)
            r1 = -1794643143(0xffffffff9507eb39, float:-2.744859E-26)
            goto L_0x0bc4
        L_0x0b21:
            r0 = 996210654(0x3b60f7de, float:0.0034327428)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4r r1 = (X.C47487E4r) r1
            X.C47487E4r.A01(r1)
            r1 = 1125082763(0x430f668b, float:143.40056)
            goto L_0x0bc4
        L_0x0b34:
            r0 = 322237275(0x1334f35b, float:2.2839178E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4r r1 = (X.C47487E4r) r1
            X.C47487E4r.A01(r1)
            r1 = 1317726138(0x4e8ae7ba, float:1.16522112E9)
            goto L_0x0bc4
        L_0x0b46:
            r0 = -381758043(0xffffffffe93ed5a5, float:-1.4419051E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E40 r1 = (X.E40) r1
            r1.onBackPressed()
            X.0eM r1 = r1.A05
            X.1Ng r3 = X.DbX.A0R(r1)
            java.lang.String r2 = X.DbU.A0u(r1)
            X.FW2 r1 = new X.FW2
            r1.<init>()
            r1.A00 = r2
            r3.A00(r1)
            r1 = 579268784(0x2286f0b0, float:3.657561E-18)
            goto L_0x0bc4
        L_0x0b6c:
            r0 = 1460249173(0x5709a255, float:1.51330304E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.Jj4 r4 = (X.C60305Jj4) r4
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0iw r2 = r4.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            X.JVF.A01(r2, r3, r1)
            X.E8B r1 = X.E8B.A00
            X.C60305Jj4.A01(r1, r4)
            r1 = -131766889(0xfffffffff8256597, float:-1.3418585E34)
            goto L_0x0bc4
        L_0x0b89:
            r0 = -1550138531(0xffffffffa39ac35d, float:-1.6779453E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.Jj4 r2 = (X.C60305Jj4) r2
            X.E8P r1 = X.E8P.A00
            X.C60305Jj4.A01(r1, r2)
            r1 = 1746575303(0x681a9fc7, float:2.9207672E24)
            goto L_0x0bc4
        L_0x0b9d:
            r0 = -423713580(0xffffffffe6bea4d4, float:-4.501451E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.Jj4 r2 = (X.C60305Jj4) r2
            X.E8G r1 = X.E8G.A00
            X.C60305Jj4.A01(r1, r2)
            r1 = -1315541604(0xffffffffb1966d9c, float:-4.3780357E-9)
            goto L_0x0bc4
        L_0x0bb1:
            r0 = -246568726(0xfffffffff14da8ea, float:-1.0183781E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.Jj4 r2 = (X.C60305Jj4) r2
            X.E8F r1 = X.E8F.A00
            X.C60305Jj4.A01(r1, r2)
            r1 = 806570299(0x3013493b, float:5.3582355E-10)
        L_0x0bc4:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPB.onClick(android.view.View):void");
    }

    public FPB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
