package X;

import android.view.View;

public final class LY1 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LY1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LY1(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [X.KH7, X.11X] */
    /* JADX WARNING: type inference failed for: r5v11, types: [X.07Z, X.KXg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v13, types: [X.07Z, com.instagram.bugreporter.BugReportComposerFragment, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0b4f, code lost:
        if (r1.A67() != true) goto L_0x0b51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0b5b, code lost:
        if (r1.A5Y() != true) goto L_0x0b5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0b67, code lost:
        if (r1.A5G() != true) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0b76, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0b79, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0bdd, code lost:
        r0 = "mediaId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0bfb, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0c02, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004f, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A00
            r6 = r25
            switch(r0) {
                case 0: goto L_0x0e20;
                case 1: goto L_0x0e07;
                case 2: goto L_0x0de9;
                case 3: goto L_0x0dcb;
                case 4: goto L_0x0db4;
                case 5: goto L_0x0d9a;
                case 6: goto L_0x0d81;
                case 7: goto L_0x0d6a;
                case 8: goto L_0x0d53;
                case 9: goto L_0x0d21;
                case 10: goto L_0x0825;
                case 11: goto L_0x07f9;
                case 12: goto L_0x077b;
                case 13: goto L_0x0cf3;
                case 14: goto L_0x0ce0;
                case 15: goto L_0x0ccd;
                case 16: goto L_0x0cba;
                case 17: goto L_0x0c8c;
                case 18: goto L_0x06b0;
                case 19: goto L_0x0c5e;
                case 20: goto L_0x0c4b;
                case 21: goto L_0x0c38;
                case 22: goto L_0x0c25;
                case 23: goto L_0x069f;
                case 24: goto L_0x0653;
                case 25: goto L_0x0609;
                case 26: goto L_0x0be0;
                case 27: goto L_0x0ba0;
                case 28: goto L_0x0b7a;
                case 29: goto L_0x0b18;
                case 30: goto L_0x0574;
                case 31: goto L_0x0545;
                case 32: goto L_0x0a6b;
                case 33: goto L_0x0a5a;
                case 34: goto L_0x0517;
                case 35: goto L_0x04f1;
                case 36: goto L_0x09ea;
                case 37: goto L_0x098b;
                case 38: goto L_0x095f;
                case 39: goto L_0x04e0;
                case 40: goto L_0x090e;
                case 41: goto L_0x04cd;
                case 42: goto L_0x08b5;
                case 43: goto L_0x087e;
                case 44: goto L_0x0424;
                case 45: goto L_0x0411;
                case 46: goto L_0x03fe;
                case 47: goto L_0x03eb;
                case 48: goto L_0x03b5;
                case 49: goto L_0x028d;
                case 50: goto L_0x027a;
                case 51: goto L_0x0267;
                case 52: goto L_0x0254;
                case 53: goto L_0x0240;
                case 54: goto L_0x022c;
                case 55: goto L_0x0219;
                case 56: goto L_0x0e5c;
                case 57: goto L_0x0e48;
                case 58: goto L_0x0e3e;
                case 59: goto L_0x0206;
                case 60: goto L_0x01eb;
                case 61: goto L_0x01d8;
                case 62: goto L_0x01bc;
                case 63: goto L_0x085a;
                case 64: goto L_0x01a7;
                case 65: goto L_0x0192;
                case 66: goto L_0x017d;
                case 67: goto L_0x0168;
                case 68: goto L_0x0153;
                case 69: goto L_0x0053;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 821140670(0x30f19cbe, float:1.7579607E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ll3 r1 = (X.C64964Ll3) r1
            com.instagram.common.session.UserSession r0 = r1.A0L
            X.27r r0 = X.27p.A01(r0)
            java.lang.String r5 = r1.A0D
            X.29R r2 = r0.A09
            X.1Ln r4 = X.JTO.A0N(r2)
            X.4yP r1 = r2.A0J()
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            X.JTO.A1V(r4)
            java.lang.String r0 = "GEN_AI_STICKER_BROWSER_PROMPT_BAR"
            X.283 r2 = X.Dbc.A08(r4, r1, r2, r0)
            X.JTQ.A1A(r4)
            java.lang.String r1 = r2.A0U
            java.lang.String r0 = "sticker_tray_session_id"
            r4.A0R(r0, r1)
            java.lang.String r0 = "browse_session_id"
            r4.A0R(r0, r5)
            X.JTT.A1E(r4, r2)
            r4.Cgf()
        L_0x004c:
            r0 = -1947339165(0xffffffff8bedf663, float:-9.16598E-32)
        L_0x004f:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0053:
            r0 = 1977731964(0x75e1cb7c, float:5.72458E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.Ll3 r8 = (X.C64964Ll3) r8
            X.C64964Ll3.A02(r8)
            r7 = 4
            r6.setVisibility(r7)
            androidx.recyclerview.widget.RecyclerView r1 = r8.A09
            X.AnonymousClass7TH.A0R(r1)
            X.0nA.A0N(r6)
            com.instagram.common.session.UserSession r1 = r8.A0L
            X.27r r3 = X.27p.A01(r1)
            java.lang.String r9 = r8.A0D
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r8.A0C
            if (r1 == 0) goto L_0x0150
            java.lang.String r6 = r1.getSearchString()
        L_0x007d:
            X.0wc r2 = r3.A01
            r1 = 303(0x12f, float:4.25E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r2, r1)
            X.4yP r4 = r3.A0J()
            X.283 r3 = r3.A04
            java.lang.String r2 = r3.A0L
            boolean r1 = r5.isSampled()
            if (r1 == 0) goto L_0x00d0
            if (r4 == 0) goto L_0x00d0
            if (r2 == 0) goto L_0x00d0
            java.lang.String r1 = "GEN_AI_STICKER_BROWSER_PROMPT_SUBMIT"
            X.JTO.A1Q(r5, r1)
            X.28D r1 = r3.A09
            X.JTS.A14(r1, r5)
            X.JTP.A1F(r5)
            X.JTO.A1S(r5, r2)
            X.AnonymousClass7TH.A0U(r5)
            java.lang.String r2 = r3.A0U
            java.lang.String r1 = "sticker_tray_session_id"
            r5.AAJ(r1, r2)
            java.lang.String r1 = "browse_session_id"
            r5.AAJ(r1, r9)
            X.JTP.A1J(r5, r3)
            X.JTS.A19(r5, r3)
            java.lang.String r1 = "camera_destination"
            r5.A8M(r4, r1)
            X.DbY.A1C(r5)
            java.lang.String r1 = "text_prompt"
            r5.AAJ(r1, r6)
            r5.Cgf()
        L_0x00d0:
            boolean r1 = r8.A0E
            if (r1 != 0) goto L_0x014b
            android.view.View r1 = r8.A07
            if (r1 == 0) goto L_0x00db
            r1.setVisibility(r7)
        L_0x00db:
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L_0x00e2
            r1.setVisibility(r7)
        L_0x00e2:
            com.instagram.igds.components.search.IgdsInlineSearchBox r6 = r8.A0C
            if (r6 == 0) goto L_0x0148
            android.view.View r9 = r8.A05
            if (r9 == 0) goto L_0x0148
            android.view.View r11 = r8.A02
            if (r11 == 0) goto L_0x0148
            r3 = 0
            X.0nA.A0d(r6, r3)
            X.0nA.A0U(r6, r3)
            int r1 = r6.getHeight()
            r8.A00 = r1
            int r1 = r6.getWidth()
            r8.A01 = r1
            android.content.Context r1 = r8.A0H
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r5 = r2.getDimensionPixelSize(r1)
            int r4 = r6.getHeight()
            int r4 = r4 - r5
            int r10 = X.JTR.A0B(r9, r11)
            int r9 = r8.A0F
            int r10 = r10 - r9
            X.5nL r1 = X.JTP.A0c(r6, r3)
            X.5nL r3 = r1.A0A()
            float r2 = r11.getY()
            float r1 = r6.getY()
            float r2 = r2 - r1
            int r1 = r9 / 2
            float r1 = (float) r1
            float r2 = r2 - r1
            r3.A0K(r2)
            float r1 = (float) r9
            r3.A0J(r1)
            float r2 = X.AnonymousClass7TE.A02(r6)
            float r1 = (float) r10
            r3.A0R(r2, r1)
            X.Lyh r1 = new X.Lyh
            r1.<init>(r6, r5, r4)
            r3.A06 = r1
            X.C65724Lye.A00(r3, r8, r7)
        L_0x0148:
            r1 = 1
            r8.A0E = r1
        L_0x014b:
            r1 = -1820125242(0xffffffff938317c6, float:-3.309249E-27)
            goto L_0x0b76
        L_0x0150:
            r6 = 0
            goto L_0x007d
        L_0x0153:
            r0 = -660878134(0xffffffffd89bccca, float:-1.37043092E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jkq r1 = (X.C60397Jkq) r1
            X.0sa r1 = r1.A02
            r1.invoke()
            r1 = -1124983467(0xffffffffbcf21d55, float:-0.029555002)
            goto L_0x0b76
        L_0x0168:
            r0 = -2002939239(0xffffffff889d9299, float:-9.483559E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jkf r1 = (X.C60386Jkf) r1
            X.MV2 r1 = r1.A01
            r1.Dft()
            r1 = -916174482(0xffffffffc964496e, float:-935062.9)
            goto L_0x0b76
        L_0x017d:
            r0 = -1258206065(0xffffffffb5014c8f, float:-4.816765E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jkf r1 = (X.C60386Jkf) r1
            X.MV2 r1 = r1.A01
            r1.D4t()
            r1 = 1546480842(0x5c2d6cca, float:1.95259143E17)
            goto L_0x0b76
        L_0x0192:
            r0 = -2114447378(0xffffffff81f817ee, float:-9.113515E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jkf r1 = (X.C60386Jkf) r1
            X.MV2 r1 = r1.A01
            r1.DIj()
            r1 = -536516567(0xffffffffe0056829, float:-3.8451914E19)
            goto L_0x0b76
        L_0x01a7:
            r0 = -1959650408(0xffffffff8b321b98, float:-3.4302312E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jkf r1 = (X.C60386Jkf) r1
            X.MV2 r1 = r1.A01
            r1.D4q()
            r1 = -760862245(0xffffffffd2a629db, float:-3.56833395E11)
            goto L_0x0b76
        L_0x01bc:
            r0 = -619610087(0xffffffffdb118019, float:-4.0954716E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            X.JTO.A1Z(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            r1.onBackPressed()
            r1 = -1527502593(0xffffffffa4f428ff, float:-1.0588758E-16)
            goto L_0x0b76
        L_0x01d8:
            r0 = 76894867(0x4955293, float:3.5105564E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JWG r1 = (X.JWG) r1
            X.JWG.A05(r1)
            r1 = 1963692105(0x750b9049, float:1.769179E32)
            goto L_0x0b76
        L_0x01eb:
            r0 = 1442790396(0x55ff3bfc, float:3.5079137E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JWG r1 = (X.JWG) r1
            com.instagram.common.session.UserSession r1 = r1.A08
            X.27r r2 = X.27p.A01(r1)
            java.lang.String r1 = "EXIT_DIALOG_CANCEL"
            r2.A1l(r1)
            r1 = 1094270274(0x41393d42, float:11.5774555)
            goto L_0x0b76
        L_0x0206:
            r0 = 2015487807(0x7821e73f, float:1.3135157E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JWG r1 = (X.JWG) r1
            X.JWG.A05(r1)
            r1 = 2046109486(0x79f5272e, float:1.5911342E35)
            goto L_0x0b76
        L_0x0219:
            r0 = 1299632687(0x4d76d22f, float:2.58810608E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K4d r1 = (X.C61361K4d) r1
            X.C61361K4d.A02(r1)
            r1 = -127741661(0xfffffffff862d123, float:-1.8401576E34)
            goto L_0x0b76
        L_0x022c:
            r0 = 541824025(0x204b9419, float:1.724377E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K4b r2 = (X.C61359K4b) r2
            r1 = 0
            X.C61359K4b.A01(r2, r1)
            r1 = 580333986(0x229731a2, float:4.0981183E-18)
            goto L_0x0b76
        L_0x0240:
            r0 = -965253132(0xffffffffc67767f4, float:-15833.988)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K4b r2 = (X.C61359K4b) r2
            r1 = 1
            X.C61359K4b.A01(r2, r1)
            r1 = -1579247606(0xffffffffa1de980a, float:-1.508355E-18)
            goto L_0x0b76
        L_0x0254:
            r0 = -857681045(0xffffffffcce0d36b, float:-1.17873496E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXZ r1 = (X.KXZ) r1
            r1.A0D()
            r1 = -1249739453(0xffffffffb5827d43, float:-9.722211E-7)
            goto L_0x0b76
        L_0x0267:
            r0 = 1662267280(0x63142f90, float:2.7335454E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXZ r1 = (X.KXZ) r1
            r1.onBackPressed()
            r1 = 777695779(0x2e5ab223, float:4.972568E-11)
            goto L_0x0b76
        L_0x027a:
            r0 = -221111227(0xfffffffff2d21c45, float:-8.3233316E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXc r1 = (X.C62040KXc) r1
            r1.A0D()
            r1 = 993978930(0x3b3eea32, float:0.002913129)
            goto L_0x0b76
        L_0x028d:
            r0 = 894171716(0x354bfa44, float:7.598758E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KXc r4 = (X.C62040KXc) r4
            X.Ki7 r1 = r4.A00
            if (r1 != 0) goto L_0x02cc
            r2 = -1
        L_0x029d:
            r3 = 22
            X.0eM r1 = r4.A06
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r8 = r4.requireActivity()
            if (r2 == r3) goto L_0x034b
            r1 = 0
            X.0qQ.A0B(r9, r1)
            X.7Pr r2 = X.DbS.A0W(r9)
            r1 = 2131956199(0x7f1311e7, float:1.9548947E38)
            X.DbZ.A0z(r8, r2, r1)
            X.7Pu r7 = r2.A00()
            X.E1X r1 = X.C250563lf.A09(r9)
        L_0x02c1:
            X.0qQ.A07(r1)
            r7.A02(r8, r1)
            r1 = -2011157048(0xffffffff88202dc8, float:-4.8202064E-34)
            goto L_0x0b76
        L_0x02cc:
            int r2 = r1.ordinal()
            r1 = 18
            if (r2 != r1) goto L_0x029d
            X.0eM r1 = r4.A06
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r8 = r4.requireActivity()
            r11 = 0
            X.0qQ.A0B(r9, r11)
            X.7Pr r2 = X.DbS.A0W(r9)
            r1 = 2131963501(0x7f132e6d, float:1.9563757E38)
            X.DbZ.A0z(r8, r2, r1)
            X.7Pu r7 = r2.A00()
            java.lang.String r6 = "close_friends_how_it_works"
            r13 = 2
            r12 = 1
            r1 = 3
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r10 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[r1]
            r1 = 2131956182(0x7f1311d6, float:1.9548912E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 2131956185(0x7f1311d9, float:1.9548919E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 2131238965(0x7f082035, float:1.8094224E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5 = 0
            com.instagram.nux.common.HowItWorksNuxFragment$Row r1 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r1.<init>(r4, r3, r2, r5)
            r10[r11] = r1
            r1 = 2131956197(0x7f1311e5, float:1.9548943E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 2131956186(0x7f1311da, float:1.954892E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 2131238120(0x7f081ce8, float:1.809251E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r1 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r1.<init>(r4, r3, r2, r5)
            r10[r12] = r1
            r1 = 2131956183(0x7f1311d7, float:1.9548915E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 2131956187(0x7f1311db, float:1.9548923E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 2131238274(0x7f081d82, float:1.8092822E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r3 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r3.<init>(r4, r2, r1, r5)
            goto L_0x03a9
        L_0x034b:
            r11 = 0
            X.0qQ.A0B(r9, r11)
            X.7Pr r2 = X.DbS.A0W(r9)
            r1 = 2131956199(0x7f1311e7, float:1.9548947E38)
            X.DbZ.A0z(r8, r2, r1)
            X.7Pu r7 = r2.A00()
            java.lang.String r6 = "close_friends_how_it_works"
            r13 = 2
            r12 = 1
            r1 = 3
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r10 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[r1]
            r1 = 2131956182(0x7f1311d6, float:1.9548912E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 2131956171(0x7f1311cb, float:1.954889E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 2131238965(0x7f082035, float:1.8094224E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4 = 0
            com.instagram.nux.common.HowItWorksNuxFragment$Row r1 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r1.<init>(r3, r2, r5, r4)
            r10[r11] = r1
            r1 = 2131955309(0x7f130e6d, float:1.9547142E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 2131956172(0x7f1311cc, float:1.9548892E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r1 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r1.<init>(r3, r2, r5, r4)
            r10[r12] = r1
            r1 = 2131956188(0x7f1311dc, float:1.9548925E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 2131956173(0x7f1311cd, float:1.9548894E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r3 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r3.<init>(r2, r1, r5, r4)
        L_0x03a9:
            r10[r13] = r3
            java.util.ArrayList r1 = X.0sr.A1L(r10)
            X.E1X r1 = X.C49781F6o.A01(r9, r6, r1)
            goto L_0x02c1
        L_0x03b5:
            r0 = -747814661(0xffffffffd36d40fb, float:-1.01899744E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.KXc r2 = (X.C62040KXc) r2
            X.0eM r1 = r2.A06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.7Pr r2 = X.DbS.A0W(r4)
            r1 = 2131956199(0x7f1311e7, float:1.9548947E38)
            X.DbZ.A0z(r3, r2, r1)
            X.7Pu r2 = r2.A00()
            X.E1X r1 = X.C250563lf.A09(r4)
            X.0qQ.A07(r1)
            r2.A02(r3, r1)
            r1 = 267230990(0xfed9f0e, float:2.343127E-29)
            goto L_0x0b76
        L_0x03eb:
            r0 = 1497954117(0x5948f745, float:3.53542944E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXc r1 = (X.C62040KXc) r1
            X.C62040KXc.A05(r1)
            r1 = -615820934(0xffffffffdb4b517a, float:-5.7229005E16)
            goto L_0x0b76
        L_0x03fe:
            r0 = -544858590(0xffffffffdf861e22, float:-1.9328398E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXc r1 = (X.C62040KXc) r1
            X.C62040KXc.A05(r1)
            r1 = -1600784783(0xffffffffa095f671, float:-2.5404663E-19)
            goto L_0x0b76
        L_0x0411:
            r0 = 1818678241(0x6c66d3e1, float:1.116214E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXg r1 = (X.KXg) r1
            X.KXg.A06(r1)
            r1 = -1326565026(0xffffffffb0ee395e, float:-1.7333084E-9)
            goto L_0x0b76
        L_0x0424:
            r0 = -2133912764(0xffffffff80cf1344, float:-1.9016859E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.KXg r2 = (X.KXg) r2
            X.0eM r1 = r2.A0A
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r8 = r2.requireActivity()
            r1 = 0
            X.0qQ.A0B(r9, r1)
            X.7Pr r2 = X.DbS.A0W(r9)
            r1 = 2131953251(0x7f130663, float:1.9542968E38)
            X.DbZ.A0z(r8, r2, r1)
            X.7Pu r7 = r2.A00()
            java.lang.String r6 = "close_friends_how_it_works"
            r1 = 2131953257(0x7f130669, float:1.954298E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r1 = 2131953256(0x7f130668, float:1.9542978E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 2131238241(0x7f081d61, float:1.8092755E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2 = 2130970179(0x7f040643, float:1.754906E38)
            int r1 = X.2Yu.A0H(r8, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r11 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r11.<init>(r5, r4, r3, r1)
            r1 = 2131953259(0x7f13066b, float:1.9542984E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r1 = 2131953258(0x7f13066a, float:1.9542982E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 2131238118(0x7f081ce6, float:1.8092506E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = X.2Yu.A0H(r8, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r10 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r10.<init>(r5, r4, r3, r1)
            r1 = 2131953261(0x7f13066d, float:1.9542988E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r1 = 2131953260(0x7f13066c, float:1.9542986E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 2131238336(0x7f081dc0, float:1.8092948E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = X.2Yu.A0H(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r1 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r1.<init>(r5, r4, r3, r2)
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r1 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[]{r11, r10, r1}
            java.util.ArrayList r1 = X.0sr.A1L(r1)
            X.E1X r1 = X.C49781F6o.A01(r9, r6, r1)
            X.0qQ.A07(r1)
            r7.A02(r8, r1)
            r1 = -1768113709(0xffffffff969cb9d3, float:-2.532043E-25)
            goto L_0x0b76
        L_0x04cd:
            r0 = -1910020070(0xffffffff8e27681a, float:-2.0634462E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KXg r1 = (X.KXg) r1
            r1.onBackPressed()
            r1 = -1665917501(0xffffffff9cb41dc3, float:-1.1919094E-21)
            goto L_0x0b76
        L_0x04e0:
            r0 = 1473552481(0x57d4a061, float:4.67570574E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -1944262425(0xffffffff8c1ce8e7, float:-1.2087889E-31)
            goto L_0x0b76
        L_0x04f1:
            r0 = -1130904692(0xffffffffbc97c38c, float:-0.018525861)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K61 r5 = (X.K61) r5
            X.0eM r1 = r5.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.L4H r1 = X.C63209KtG.A00(r1)
            X.1QP r4 = r1.A01
            long r2 = r1.A00
            java.lang.String r1 = "RENAME_AUDIO_CANCELLED"
            r4.flowMarkPoint(r2, r1)
            X.DbT.A1J(r5)
            r1 = -1697229545(0xffffffff9ad65517, float:-8.8645796E-23)
            goto L_0x0b76
        L_0x0517:
            r0 = 1521980812(0x5ab7958c, float:2.58371746E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K4z r4 = (X.C61381K4z) r4
            X.0eM r3 = r4.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.JVm r2 = X.AnonymousClass9PJ.A00(r1)
            X.28D r5 = X.28D.A42
            r1 = 1
            r2.A07(r5, r1)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            androidx.fragment.app.FragmentActivity r4 = r4.requireActivity()
            r7 = 0
            r8 = 0
            r9 = r8
            X.C49805F7r.A01(r4, r5, r6, r7, r8, r9)
            r1 = -282645021(0xffffffffef272de3, float:-5.173947E28)
            goto L_0x0b76
        L_0x0545:
            r0 = 673629768(0x2826c648, float:9.2578465E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K6h r2 = (X.C61410K6h) r2
            X.0eM r1 = r2.A05
            X.7Pr r1 = X.DbX.A0f(r1)
            X.7Pu r3 = r1.A00()
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            X.1Wy r1 = X.C322576w3.A00()
            X.0eM r1 = r1.A00
            r1.getValue()
            X.E0g r1 = new X.E0g
            r1.<init>()
            r3.A02(r2, r1)
            r1 = 1900871441(0x714cff11, float:1.0150928E30)
            goto L_0x0b76
        L_0x0574:
            r0 = 929784141(0x376b614d, float:1.4029746E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K5x r3 = (X.K5x) r3
            X.LOA r1 = r3.A00()
            java.lang.String r4 = r1.A01
            if (r4 == 0) goto L_0x0e33
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.String r1 = "coupon_offer_id"
            java.lang.String r18 = r2.getString(r1)
            android.os.Bundle r2 = r3.requireArguments()
            r1 = 672(0x2a0, float:9.42E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r20 = r2.getBoolean(r1)
            android.os.Bundle r2 = r3.requireArguments()
            r1 = 81
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r5 = 0
            boolean r21 = r2.getBoolean(r1, r5)
            android.os.Bundle r2 = r3.requireArguments()
            r1 = 4930(0x1342, float:6.908E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r22 = r2.getBoolean(r1, r5)
            X.LOA r1 = r3.A00()
            java.lang.String r2 = r1.A03
            X.0eM r5 = r3.A02
            X.WGU r6 = X.JTU.A0D(r5)
            X.UzE r1 = X.C16678UzE.MEDIA_PICKER
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "complete_media_selection_1"
            r6.A0R(r10, r1)
            X.WGU r8 = X.JTU.A0D(r5)
            java.lang.Long r9 = X.AnonymousClass7TE.A10(r4)
            java.lang.String r12 = ""
            r6 = 0
            r8.A01 = r2
            r8.A02 = r4
            r7 = r6
            r11 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            X.WGU.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1Yh r12 = X.C18138VmE.A00()
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r5)
            X.DbS.A1Z(r16)
            java.util.List r19 = X.AnonymousClass7TE.A1I(r4)
            r15 = r3
            r13 = r3
            r17 = r2
            r12.A08(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = 667172214(0x27c43d76, float:5.4467564E-15)
            goto L_0x0b76
        L_0x0609:
            r0 = -2079849488(0xffffffff840803f0, float:-1.5988531E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Yh r5 = X.C18138VmE.A00()
            java.lang.Object r4 = r1.A01
            X.K4u r4 = (X.C61376K4u) r4
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r6 = r4.requireActivity()
            java.lang.String r8 = r4.A01
            if (r8 != 0) goto L_0x0628
            java.lang.String r8 = "unknown"
        L_0x0628:
            r9 = 0
            r1 = 295(0x127, float:4.13E-43)
            java.lang.String r3 = X.C66579MXk.A00(r1)
            r1 = 32
            java.lang.String r2 = X.C66579MXk.A00(r1)
            r1 = 586(0x24a, float:8.21E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String[] r1 = new java.lang.String[]{r3, r2, r1}
            java.util.Set r2 = X.0sc.A07(r1)
            java.lang.String r1 = r4.A01
            boolean r10 = X.00k.A0u(r2, r1)
            r11 = 0
            r12 = r11
            r5.A0A(r6, r7, r8, r9, r10, r11, r12)
            r1 = 427459423(0x197a835f, float:1.2951227E-23)
            goto L_0x0b76
        L_0x0653:
            r0 = -58301448(0xfffffffffc8663f8, float:-5.582363E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K4u r4 = (X.C61376K4u) r4
            androidx.fragment.app.FragmentActivity r6 = r4.getActivity()
            if (r6 == 0) goto L_0x069a
            X.1Yh r5 = X.C18138VmE.A00()
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            r9 = 0
            r1 = 295(0x127, float:4.13E-43)
            java.lang.String r3 = X.C66579MXk.A00(r1)
            r1 = 32
            java.lang.String r2 = X.C66579MXk.A00(r1)
            r1 = 586(0x24a, float:8.21E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String[] r1 = new java.lang.String[]{r3, r2, r1}
            java.util.Set r2 = X.0sc.A07(r1)
            java.lang.String r1 = r4.A01
            boolean r10 = X.00k.A0u(r2, r1)
            r11 = 0
            r1 = 3705(0xe79, float:5.192E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r1)
            r12 = r11
            r5.A0A(r6, r7, r8, r9, r10, r11, r12)
        L_0x069a:
            r1 = -1580812014(0xffffffffa1c6b912, float:-1.346599E-18)
            goto L_0x0b76
        L_0x069f:
            r0 = 592466382(0x235051ce, float:1.1293025E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dbb.A1S(r1)
            r1 = 1680110535(0x642473c7, float:1.2134435E22)
            goto L_0x0b76
        L_0x06b0:
            r0 = -312629632(0xffffffffed5da680, float:-4.287342E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K5y r2 = (X.C61403K5y) r2
            X.0eM r7 = r2.A0B
            java.lang.Object r1 = r7.getValue()
            X.Jiq r1 = (X.C60293Jiq) r1
            X.Ji9 r1 = X.C60293Jiq.A00(r1)
            X.L9V r1 = r1.A02
            X.05G r1 = r1.A03
            java.lang.Object r1 = r1.getValue()
            X.JvK r1 = (X.C61020JvK) r1
            java.util.List r1 = r1.A01()
            java.util.List r19 = X.00k.A0X(r1)
            java.lang.Object r6 = X.00k.A0J(r19)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0776
            X.0eM r5 = r2.A0A
            X.WGU r4 = X.JTU.A0D(r5)
            X.UzE r1 = X.C16678UzE.MEDIA_PICKER
            java.lang.String r11 = r1.toString()
            java.lang.String r3 = "complete_media_selection_"
            int r1 = r19.size()
            java.lang.String r1 = X.002.A0O(r3, r1)
            r4.A0R(r11, r1)
            X.WGU r9 = X.JTU.A0D(r5)
            X.0eM r4 = r2.A06
            java.lang.String r3 = X.DbS.A0t(r4)
            java.lang.Object r1 = r7.getValue()
            X.Jiq r1 = (X.C60293Jiq) r1
            com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType r1 = r1.A01()
            java.lang.String r13 = r1.toString()
            java.lang.Object r1 = r7.getValue()
            X.Jiq r1 = (X.C60293Jiq) r1
            X.Ji9 r1 = X.C60293Jiq.A00(r1)
            X.L9V r1 = r1.A02
            X.05G r1 = r1.A03
            java.lang.Object r1 = r1.getValue()
            X.JvK r1 = (X.C61020JvK) r1
            java.lang.Integer r1 = r1.A00(r6)
            int r1 = X.DbX.A02(r1)
            java.lang.Long r10 = X.DbS.A0j(r1)
            r7 = 0
            if (r3 == 0) goto L_0x0737
            r9.A01 = r3
        L_0x0737:
            r9.A02 = r6
            r8 = r7
            r12 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            X.WGU.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1Yh r12 = X.C18138VmE.A00()
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r17 = X.DbS.A0t(r4)
            X.0eM r1 = r2.A05
            java.lang.String r18 = X.DbS.A0t(r1)
            X.0eM r1 = r2.A07
            boolean r20 = X.AnonymousClass7TF.A1Z(r1)
            X.0eM r1 = r2.A09
            boolean r21 = X.AnonymousClass7TF.A1Z(r1)
            X.0eM r1 = r2.A08
            boolean r22 = X.AnonymousClass7TF.A1Z(r1)
            r3 = 0
            X.ILi r1 = new X.ILi
            r1.<init>(r2, r3)
            r15 = r2
            r13 = r2
            r14 = r1
            r12.A08(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0776:
            r1 = -887981803(0xffffffffcb127915, float:-9599253.0)
            goto L_0x0b76
        L_0x077b:
            r0 = -640099502(0xffffffffd9d8db52, float:-7.6299675E15)
            int r0 = X.DbX.A03(r6, r0)
            java.lang.Object r5 = r1.A01
            com.instagram.bugreporter.BugReportComposerFragment r5 = (com.instagram.bugreporter.BugReportComposerFragment) r5
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x079d
            X.0f9 r3 = X.JTU.A0B()
            java.lang.String r2 = "message"
            java.lang.String r1 = "Ignoring bug composer screenshot click because we are processing an action"
            r3.ABQ(r2, r1)
            r3.report()
        L_0x0798:
            r1 = 736758890(0x2bea0c6a, float:1.6630146E-12)
            goto L_0x0b76
        L_0x079d:
            java.lang.Object r2 = r6.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            int r4 = X.DbW.A04(r2, r1)
            X.0xx r2 = X.DbW.A0E(r5)
            r1 = 7
            X.C66164MGb.A00(r5, r2, r4, r1)
            android.widget.GridLayout r1 = r5.A02
            if (r1 == 0) goto L_0x07b6
            r1.removeViewAt(r4)
        L_0x07b6:
            android.widget.GridLayout r1 = r5.A02
            if (r1 == 0) goto L_0x07f7
            int r3 = r1.getChildCount()
        L_0x07be:
            if (r4 >= r3) goto L_0x0798
            android.widget.GridLayout r1 = r5.A02
            if (r1 == 0) goto L_0x07da
            android.view.View r2 = r1.getChildAt(r4)
            if (r2 == 0) goto L_0x07da
            r1 = 2131429175(0x7f0b0737, float:1.8480015E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x07da
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.setTag(r1)
        L_0x07da:
            android.widget.GridLayout r1 = r5.A02
            if (r1 == 0) goto L_0x07f4
            android.view.View r2 = r1.getChildAt(r4)
            if (r2 == 0) goto L_0x07f4
            r1 = 2131429173(0x7f0b0735, float:1.8480011E38)
            android.view.View r2 = r2.findViewById(r1)
            if (r2 == 0) goto L_0x07f4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.setTag(r1)
        L_0x07f4:
            int r4 = r4 + 1
            goto L_0x07be
        L_0x07f7:
            r3 = 0
            goto L_0x07be
        L_0x07f9:
            r0 = -1229158830(0xffffffffb6bc8652, float:-5.6184736E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Jj4 r4 = (X.C60305Jj4) r4
            X.1Am r2 = r4.A0A
            X.1An r1 = X.1An.A0Y
            X.0xa r3 = r2.A03(r1)
            java.lang.String r2 = "has_user_seen_project_board"
            boolean r1 = X.DbT.A1a(r3, r2)
            if (r1 != 0) goto L_0x081b
            X.0xY r1 = r3.AR4()
            X.DbW.A1L(r1, r2)
        L_0x081b:
            X.K8e r1 = X.C61450K8e.A00
            X.C60305Jj4.A01(r1, r4)
            r1 = -1567770612(0xffffffffa28db80c, float:-3.8412994E-18)
            goto L_0x0b76
        L_0x0825:
            r0 = 1682080732(0x644283dc, float:1.4352679E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Jj4 r4 = (X.C60305Jj4) r4
            X.1Am r2 = r4.A0A
            X.1An r1 = X.1An.A0Y
            X.0xa r3 = r2.A03(r1)
            java.lang.String r2 = "has_user_seen_desktop_tool"
            boolean r1 = X.DbT.A1a(r3, r2)
            if (r1 != 0) goto L_0x0847
            X.0xY r1 = r3.AR4()
            X.DbW.A1L(r1, r2)
        L_0x0847:
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0iw r2 = r4.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A0A
            X.JVF.A01(r2, r3, r1)
            X.K8d r1 = X.C61449K8d.A00
            X.C60305Jj4.A01(r1, r4)
            r1 = -1214217870(0xffffffffb7a08172, float:-1.9133764E-5)
            goto L_0x0b76
        L_0x085a:
            r0 = -1794644340(0xffffffff9507e68c, float:-2.7444902E-26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Jah r7 = (X.C59864Jah) r7
            X.2cs r0 = r7.A0H
            double r4 = r0.A01
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0879
            java.lang.Object r1 = r6.getTag()
            com.instagram.creation.base.ui.mediatabbar.Tab r1 = (com.instagram.creation.base.ui.mediatabbar.Tab) r1
            r0 = 1
            r7.A03(r1, r0)
        L_0x0879:
            r0 = 490226912(0x1d3844e0, float:2.4387805E-21)
            goto L_0x004f
        L_0x087e:
            r0 = 1143271536(0x4424f070, float:659.75684)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.KXg r5 = (X.KXg) r5
            X.0s0 r2 = r5.A0C
            X.0YZ[] r0 = X.KXg.A0D
            r1 = 1
            boolean r0 = X.AnonymousClass7TG.A1a(r5, r2, r0, r1)
            if (r0 != 0) goto L_0x08a8
            X.KXg.A08(r5, r1)
            java.lang.String r0 = r5.A02
            r4 = 0
            X.0xx r2 = X.DbW.A0E(r5)
            if (r0 == 0) goto L_0x08ad
            X.MGP r1 = new X.MGP
            r1.<init>(r5, r0, r4)
        L_0x08a5:
            X.AnonymousClass7TE.A1Z(r1, r2)
        L_0x08a8:
            r0 = 57782133(0x371af75, float:7.102495E-37)
            goto L_0x004f
        L_0x08ad:
            r0 = 17
            X.MG7 r1 = new X.MG7
            r1.<init>(r5, r4, r0)
            goto L_0x08a5
        L_0x08b5:
            r0 = 434711135(0x19e92a5f, float:2.4108749E-23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.KXg r6 = (X.KXg) r6
            X.JTT.A16(r6)
            android.content.Context r1 = r6.requireContext()
            X.0eM r0 = r6.A0A
            X.Dg1 r5 = X.C46498Dg1.A00(r1, r0)
            java.lang.String r4 = r6.A02
            if (r4 == 0) goto L_0x0906
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x08e9
            android.content.Context r1 = r6.requireContext()
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r1 = 6
            X.LXK r0 = new X.LXK
            r0.<init>(r4, r6, r1)
            r5.A0A(r2, r0)
        L_0x08e9:
            java.lang.String r2 = X.KXg.A05(r6)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131961457(0x7f132671, float:1.9559611E38)
            if (r2 != 0) goto L_0x08f9
            r0 = 2131967983(0x7f133fef, float:1.9572848E38)
        L_0x08f9:
            java.lang.String r2 = X.C51967G9n.A0p(r1, r0)
            r1 = 7
            X.LXK r0 = new X.LXK
            r0.<init>(r4, r6, r1)
            r5.A0C(r2, r0)
        L_0x0906:
            X.C49945FFy.A00(r6, r5)
            r0 = -1218033731(0xffffffffb76647bd, float:-1.3725771E-5)
            goto L_0x004f
        L_0x090e:
            r0 = -1218004097(0xffffffffb766bb7f, float:-1.3752723E-5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K8H r5 = (X.K8H) r5
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r6 = r5.A03
            if (r6 == 0) goto L_0x0946
            java.util.List r4 = r5.A0E
            X.MTR r0 = r5.A01
            if (r0 == 0) goto L_0x094b
            r0.Ere(r4)
        L_0x0926:
            r0 = 1
            r5.A0B = r0
            r0 = 0
            java.lang.Object r1 = X.00k.A0O(r4, r0)
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r1 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r1
            if (r1 == 0) goto L_0x093f
            X.0eM r0 = r5.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7vZ r0 = X.C346667vY.A00(r0)
            r0.A02(r1)
        L_0x093f:
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0946
            X.DbZ.A17(r5)
        L_0x0946:
            r0 = -513252469(0xffffffffe168638b, float:-2.6792609E20)
            goto L_0x004f
        L_0x094b:
            X.LOS r2 = r5.A04
            android.content.Context r0 = r5.requireContext()
            android.content.Context r1 = X.DbT.A05(r0)
            X.0eM r0 = r5.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r2.A01(r1, r0, r6, r4)
            goto L_0x0926
        L_0x095f:
            r0 = -875289729(0xffffffffcbd4237f, float:-2.7805438E7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K8H r4 = (X.K8H) r4
            X.LFo r2 = r4.A02
            r1 = 0
            if (r2 != 0) goto L_0x0973
            java.lang.String r0 = "logger"
            goto L_0x0bfb
        L_0x0973:
            X.KkX r0 = r4.A00
            if (r0 != 0) goto L_0x0979
            X.KkX r0 = X.C62671KkX.LIST_SHEET
        L_0x0979:
            r2.A00(r0)
            r0 = 101232125(0x608adfd, float:2.5706583E-35)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.K8H.A01(r4, r1, r0)
            r0 = 1790028479(0x6ab1aabf, float:1.073931E26)
            goto L_0x004f
        L_0x098b:
            r0 = -407584514(0xffffffffe7b4c0fe, float:-1.7071721E24)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Ls9 r6 = (X.C65368Ls9) r6
            X.4DU r7 = r6.A03
            if (r7 == 0) goto L_0x09e5
            X.3Q2 r0 = r6.A04
            X.1Xj r0 = r0.A1C
            if (r0 == 0) goto L_0x09e5
            java.lang.String r5 = r0.getId()
            if (r5 == 0) goto L_0x09e5
            X.2FW r2 = X.C55018Hap.A00(r0)
            X.1as r0 = X.1as.A04
            X.1ap r1 = r0.A02
            com.instagram.common.session.UserSession r0 = r6.A02
            X.F3w r4 = r1.A07(r7, r0, r2)
            r4.A06(r5)
            X.XSW r2 = X.XSW.A07
            android.os.Bundle r1 = r4.A07
            r0 = 56
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.putSerializable(r0, r2)
            r4.A04(r7)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r1 = r4.A00()
            r0 = 19
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            androidx.fragment.app.Fragment r0 = r6.A01
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x09e5
            X.37D r0 = X.DbT.A0i(r0)
            if (r0 == 0) goto L_0x09e5
            r0.A0J(r1)
        L_0x09e5:
            r0 = -1712839132(0xffffffff99e82624, float:-2.4003643E-23)
            goto L_0x004f
        L_0x09ea:
            r0 = 521034079(0x1f0e595f, float:3.0143596E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K61 r5 = (X.K61) r5
            X.0eM r6 = r5.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.L4H r1 = X.C63209KtG.A00(r1)
            X.1QP r4 = r1.A01
            long r2 = r1.A00
            java.lang.String r1 = "RENAME_AUDIO_SAVED"
            r4.flowMarkPoint(r2, r1)
            java.lang.String r3 = r5.A04
            java.lang.String r2 = X.K61.A00(r5)
            java.lang.String r1 = r5.A05
            if (r1 != 0) goto L_0x0a16
            java.lang.String r0 = "originalTitle"
            goto L_0x0bfb
        L_0x0a16:
            boolean r1 = r2.contentEquals(r1)
            if (r1 != 0) goto L_0x0a56
            r4 = 1
            if (r3 == 0) goto L_0x0a30
            X.DbY.A18(r5, r4)
            X.0xx r2 = X.DbV.A0J(r5)
            r1 = 25
            X.MGE.A01(r5, r3, r2, r1)
        L_0x0a2b:
            r1 = -1923165651(0xffffffff8d5ed22d, float:-6.866202E-31)
            goto L_0x0b76
        L_0x0a30:
            X.0eM r1 = r5.A0B
            java.lang.Object r3 = r1.getValue()
            X.Jft r3 = (X.C60112Jft) r3
            java.lang.String r2 = X.K61.A00(r5)
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.2Fj r1 = r3.A00
            r1.A0B(r2)
            r5.A08 = r4
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r1 = r5.A02
            java.lang.Long r2 = X.C51972G9s.A0i(r1)
            java.lang.String r1 = r5.A06
            X.C63991LHj.A00(r5, r3, r2, r1)
        L_0x0a56:
            X.DbT.A1J(r5)
            goto L_0x0a2b
        L_0x0a5a:
            r0 = -289336519(0xffffffffeec11339, float:-2.9876923E28)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = 1806346769(0x6baaaa11, float:4.12641E26)
            goto L_0x004f
        L_0x0a6b:
            r0 = -646946414(0xffffffffd9706192, float:-4.22882963E15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ldb r0 = (X.C64534Ldb) r0
            X.LdI r0 = r0.A00
            if (r0 == 0) goto L_0x0e86
            X.LdH r7 = r0.A02
            if (r7 == 0) goto L_0x0e81
            X.K6h r5 = r7.A01
            X.KgP r0 = r5.A00
            if (r0 != 0) goto L_0x0a88
            java.lang.String r0 = "mediaContentType"
            goto L_0x0bfb
        L_0x0a88:
            int r1 = r0.ordinal()
            r6 = 0
            if (r1 == r6) goto L_0x0af9
            r4 = 1
            if (r1 == r4) goto L_0x0abb
            r0 = 2
            if (r1 != r0) goto L_0x0e7c
            com.instagram.common.session.UserSession r2 = r7.A05
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "create_reel"
            X.C63985LHd.A01(r2, r1, r0)
            X.0eM r0 = r5.A05
            X.0lg r2 = X.DbT.A0X(r0)
            X.28D r0 = X.28D.A44
            X.Hrt r1 = X.C250563lf.A0C(r0)
            r0 = 0
            r1.A0m = r4
            r1.A0B = r0
            X.6W8 r0 = X.JTU.A0O(r5, r2, r1)
            X.DbT.A1L(r5, r0)
        L_0x0ab6:
            r0 = 909371129(0x3633e6f9, float:2.6807522E-6)
            goto L_0x004f
        L_0x0abb:
            com.instagram.common.session.UserSession r2 = r7.A05
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "create_story"
            X.C63985LHd.A01(r2, r1, r0)
            android.app.Activity r1 = r5.getRootActivity()
            r0 = 51
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.2Zg r1 = (X.2Zg) r1
            r8 = 0
            r0 = 1723(0x6bb, float:2.414E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.instagram.ui.swipenavigation.PositionConfig r7 = new com.instagram.ui.swipenavigation.PositionConfig
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r22 = r6
            r23 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.FLD(r7)
            goto L_0x0ab6
        L_0x0af9:
            com.instagram.common.session.UserSession r2 = r7.A05
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "create_post"
            X.C63985LHd.A01(r2, r1, r0)
            android.content.Context r1 = r5.requireContext()
            X.0eM r0 = r5.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.36U r2 = X.AnonymousClass36R.A00(r1, r0, r5)
            X.36W r1 = X.AnonymousClass36W.FOLLOWERS_SHARE
            X.EXF r0 = X.EXF.A0N
            r2.Ewb(r0, r1)
            goto L_0x0ab6
        L_0x0b18:
            r0 = -1567769670(0xffffffffa28dbbba, float:-3.841689E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K54 r3 = (X.K54) r3
            X.0eM r1 = r3.A09
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r1)
            X.WGU r4 = (X.WGU) r4
            X.UzE r2 = X.C16678UzE.RESHARED_MEDIA_AD_NOT_DELIVERING_SCREEN
            r1 = 4202(0x106a, float:5.888E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0F(r2, r1)
            X.0eM r1 = r3.A0A
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            java.lang.String r7 = r3.A06
            if (r7 == 0) goto L_0x0bdd
            r5 = 0
            X.1Xj r1 = r3.A04
            r2 = 1
            if (r1 == 0) goto L_0x0b51
            boolean r1 = r1.A67()
            r10 = 1
            if (r1 == r2) goto L_0x0b52
        L_0x0b51:
            r10 = 0
        L_0x0b52:
            X.1Xj r1 = r3.A04
            if (r1 == 0) goto L_0x0b5d
            boolean r1 = r1.A5Y()
            r11 = 1
            if (r1 == r2) goto L_0x0b5e
        L_0x0b5d:
            r11 = 0
        L_0x0b5e:
            X.1Xj r1 = r3.A04
            if (r1 == 0) goto L_0x0b69
            boolean r1 = r1.A5G()
            r12 = 1
            if (r1 == r2) goto L_0x0b6a
        L_0x0b69:
            r12 = 0
        L_0x0b6a:
            java.lang.String r8 = "reshared_media_ad_not_delivering"
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            X.W3M.A05(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1908518524(0xffffffff8e3e5184, float:-2.3458556E-30)
        L_0x0b76:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0b7a:
            r0 = 100356111(0x5fb500f, float:2.3633335E-35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K54 r4 = (X.K54) r4
            X.0eM r0 = r4.A09
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            X.WGU r2 = (X.WGU) r2
            X.UzE r1 = X.C16678UzE.RESHARED_MEDIA_AD_NOT_DELIVERING_SCREEN
            r0 = 3685(0xe65, float:5.164E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0F(r1, r0)
            X.DbT.A1I(r4)
            r0 = -1334530101(0xffffffffb074afcb, float:-8.90165E-10)
            goto L_0x004f
        L_0x0ba0:
            r0 = 183436348(0xaef043c, float:2.3016456E-32)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K4t r7 = (X.C61375K4t) r7
            androidx.fragment.app.FragmentActivity r6 = r7.requireActivity()
            X.0eM r4 = r7.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://business.facebook.com/business/help/204798856225114?id=649869995454285"
            r5 = 0
            X.SUL r1 = X.Dba.A0J(r6, r2, r1, r0)
            java.lang.String r0 = "promotions_in_review_fragment"
            r1.A0S = r0
            r1.A0A()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.VwK r4 = X.VA1.A00(r0)
            java.lang.String r2 = r7.A00
            if (r2 == 0) goto L_0x0bdd
            java.lang.String r1 = "promotion_details"
            java.lang.String r0 = "learn_more_cta"
            r4.A08(r1, r0, r2, r5)
            r0 = -1811267840(0xffffffff940a3f00, float:-6.979644E-27)
            goto L_0x004f
        L_0x0bdd:
            java.lang.String r0 = "mediaId"
            goto L_0x0bfb
        L_0x0be0:
            r0 = -447385014(0xffffffffe555724a, float:-6.299827E22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.1Wy r0 = X.C322576w3.A00()
            r0.A01()
            java.lang.Object r4 = r1.A01
            X.Uac r4 = (X.C15328Uac) r4
            r4.A0E()
            java.lang.String r2 = r4.A0M
            if (r2 != 0) goto L_0x0c03
            java.lang.String r0 = "entryPoint"
        L_0x0bfb:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0c03:
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "entry_point"
            r1.putString(r0, r2)
            X.K4u r2 = new X.K4u
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A0E()
            X.6Yo r0 = X.DbS.A0M(r1, r0)
            X.Dba.A12(r2, r0)
            r0 = 1495848726(0x5928d716, float:2.97026785E15)
            goto L_0x004f
        L_0x0c25:
            r0 = -1791835917(0xffffffff9532c0f3, float:-3.6099024E-26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6m r0 = (X.C61415K6m) r0
            X.C61415K6m.A00(r0)
            r0 = 795295240(0x2f673e08, float:2.1031366E-10)
            goto L_0x004f
        L_0x0c38:
            r0 = -1048384936(0xffffffffc182ea58, float:-16.364426)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6m r0 = (X.C61415K6m) r0
            X.C61415K6m.A00(r0)
            r0 = 1317724839(0x4e8ae2a7, float:1.16505485E9)
            goto L_0x004f
        L_0x0c4b:
            r0 = 1266303720(0x4b7a42e8, float:1.6401128E7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6m r0 = (X.C61415K6m) r0
            X.C61415K6m.A00(r0)
            r0 = -1551204255(0xffffffffa38a8061, float:-1.501636E-17)
            goto L_0x004f
        L_0x0c5e:
            r0 = -1124775839(0xffffffffbcf54861, float:-0.02994174)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K6m r4 = (X.C61415K6m) r4
            X.0eM r0 = r4.A0C
            X.WGU r2 = X.JTU.A0D(r0)
            X.UzE r0 = X.C16678UzE.MEDIA_PICKER
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "switch_to_compare_2_posts"
            r2.A0R(r1, r0)
            X.0eM r0 = r4.A0B
            java.lang.Object r1 = r0.getValue()
            X.Jiq r1 = (X.C60293Jiq) r1
            X.Uvn r0 = X.C16492Uvn.COMPARE_2_POSTS
            r1.A05(r0)
            r0 = 1210354294(0x48248a76, float:168489.84)
            goto L_0x004f
        L_0x0c8c:
            r0 = 1050928044(0x3ea3e3ac, float:0.32009637)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K6l r4 = (X.C61414K6l) r4
            X.0eM r0 = r4.A09
            X.WGU r2 = X.JTU.A0D(r0)
            X.UzE r0 = X.C16678UzE.MEDIA_PICKER
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "switch_to_single_post"
            r2.A0R(r1, r0)
            X.0eM r0 = r4.A08
            java.lang.Object r1 = r0.getValue()
            X.Jiq r1 = (X.C60293Jiq) r1
            X.Uvn r0 = X.C16492Uvn.SINGLE_POST
            r1.A05(r0)
            r0 = -1407923134(0xffffffffac14cc42, float:-2.114545E-12)
            goto L_0x004f
        L_0x0cba:
            r0 = -1141025093(0xffffffffbbfd56bb, float:-0.0077312863)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6l r0 = (X.C61414K6l) r0
            X.C61414K6l.A00(r0)
            r0 = -980064867(0xffffffffc595659d, float:-4780.7017)
            goto L_0x004f
        L_0x0ccd:
            r0 = 688076138(0x2903356a, float:2.9134173E-14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6l r0 = (X.C61414K6l) r0
            X.C61414K6l.A00(r0)
            r0 = 1123567249(0x42f84691, float:124.137825)
            goto L_0x004f
        L_0x0ce0:
            r0 = 940491445(0x380ec2b5, float:3.4036773E-5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6l r0 = (X.C61414K6l) r0
            X.C61414K6l.A00(r0)
            r0 = 2089806(0x1fe34e, float:2.928442E-39)
            goto L_0x004f
        L_0x0cf3:
            r0 = 508062113(0x1e4869a1, float:1.0609755E-20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            android.content.Context r0 = r6.requireContext()
            r5 = 0
            r4 = 1
            X.6ST r2 = new X.6ST
            r2.<init>(r0, r4)
            r0 = 2131954339(0x7f130aa3, float:1.9545174E38)
            X.DbU.A1L(r6, r2, r0)
            X.AnonymousClass0fN.A00(r2)
            X.KH7 r1 = new X.KH7
            r1.<init>(r5, r2, r6)
            r0 = 255(0xff, float:3.57E-43)
            X.1ES.A05(r1, r0, r4, r5, r5)
            r0 = -465852651(0xffffffffe43ba715, float:-1.3846323E22)
            goto L_0x004f
        L_0x0d21:
            r0 = 1787957405(0x6a92109d, float:8.829081E25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jnu r1 = (X.C60585Jnu) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K8V r2 = r1.A01
            X.0eM r0 = r2.A04
            java.lang.Object r1 = r0.getValue()
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r1 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r1
            r0 = 0
            r1.A01 = r0
            java.util.List r0 = r1.A06
            r0.clear()
            r1.A04()
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            X.JVF.A01(r2, r1, r0)
            r0 = 1191750645(0x4708abf5, float:34987.957)
            goto L_0x004f
        L_0x0d53:
            r0 = 1473156899(0x57ce9723, float:4.54297045E14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JoG r1 = (X.C60607JoG) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MVj r0 = r1.A01
            r0.Dil()
            r0 = -540378052(0xffffffffdfca7c3c, float:-2.9181206E19)
            goto L_0x004f
        L_0x0d6a:
            r0 = 1147262144(0x4461d4c0, float:903.3242)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JoG r1 = (X.C60607JoG) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MVj r0 = r1.A01
            r0.Cu0()
            r0 = -813246626(0xffffffffcf86d75e, float:-4.5245225E9)
            goto L_0x004f
        L_0x0d81:
            r0 = -1966508771(0xffffffff8ac9751d, float:-1.9399649E-32)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.JoG r2 = (X.C60607JoG) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MVj r1 = r2.A01
            com.instagram.igds.components.textcell.IgdsListCell r0 = r2.A02
            r1.DOk(r0)
            r0 = 2068539316(0x7b4b67b4, float:1.0561396E36)
            goto L_0x004f
        L_0x0d9a:
            r0 = 675192352(0x283e9e20, float:1.0581407E-14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JoG r1 = (X.C60607JoG) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MVj r0 = r1.A01
            X.0qQ.A0A(r6)
            r0.DS8(r6)
            r0 = 742127244(0x2c3bf68c, float:2.671116E-12)
            goto L_0x004f
        L_0x0db4:
            r0 = -158499131(0xfffffffff68d7ec5, float:-1.4349317E33)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JoG r1 = (X.C60607JoG) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MVj r0 = r1.A01
            r0.Cu1()
            r0 = 1294481335(0x4d2837b7, float:1.76388976E8)
            goto L_0x004f
        L_0x0dcb:
            r0 = -444824777(0xffffffffe57c8337, float:-7.4528553E22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K84 r2 = (X.K84) r2
            X.DbT.A1I(r2)
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Z
            X.JVF.A01(r2, r1, r0)
            r0 = -814014195(0xffffffffcf7b210d, float:-4.21324723E9)
            goto L_0x004f
        L_0x0de9:
            r0 = -1697411976(0xffffffff9ad38c78, float:-8.7494494E-23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K84 r2 = (X.K84) r2
            X.DbT.A1I(r2)
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0a
            X.JVF.A01(r2, r1, r0)
            r0 = -1623240531(0xffffffff9f3f50ad, float:-4.0512557E-20)
            goto L_0x004f
        L_0x0e07:
            r0 = -814936129(0xffffffffcf6d0fbf, float:-3.97723213E9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 30
            X.MH8.A03(r2, r1, r0)
            r0 = -132773075(0xfffffffff8160b2d, float:-1.2172988E34)
            goto L_0x004f
        L_0x0e20:
            r0 = -1037608801(0xffffffffc227589f, float:-41.836544)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K8V r0 = (X.K8V) r0
            r0.onBackPressed()
            r0 = 1143910038(0x442eae96, float:698.7279)
            goto L_0x004f
        L_0x0e33:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r1 = 1324232324(0x4eee2e84, float:1.99801293E9)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x0e3e:
            java.lang.Object r0 = r1.A01
            X.KB5 r0 = (X.KB5) r0
            com.instagram.creation.fragment.AlbumEditFragment r0 = r0.A0U
            r0.A0K()
            return
        L_0x0e48:
            java.lang.Object r4 = r1.A01
            X.KB5 r4 = (X.KB5) r4
            com.instagram.common.session.UserSession r3 = r4.A0P
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325222777369328(0x810d99000832f0, double:3.0355553821154904E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A0I = r0
            return
        L_0x0e5c:
            java.lang.Object r3 = r1.A01
            X.KB5 r3 = (X.KB5) r3
            X.514 r0 = r3.A0D
            int r2 = r0.A01
            X.514 r1 = X.AnonymousClass514.SQUARE
            int r0 = r1.A01
            if (r2 != r0) goto L_0x0e6c
            X.514 r1 = X.AnonymousClass514.FOUR_BY_FIVE
        L_0x0e6c:
            r3.A0D = r1
            com.instagram.creation.base.CreationSession r0 = r3.A0S
            r0.A05 = r1
            X.KB5.A0D(r3, r1)
            X.KB5.A06(r3)
            X.KB5.A0A(r3)
            return
        L_0x0e7c:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x0e81:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0e86:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -1473067446(0xffffffffa832c64a, float:-9.923982E-15)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY1.onClick(android.view.View):void");
    }
}
