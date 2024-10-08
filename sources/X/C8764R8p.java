package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.instagram.common.session.UserSession;

/* renamed from: X.R8p  reason: case insensitive filesystem */
public final class C8764R8p extends 1P0 {
    public final int A00;
    public final Object A01;

    public C8764R8p(UserSession userSession, int i) {
        this.A00 = i;
        this.A01 = userSession;
    }

    public final void onFail(C268654dm r16) {
        int A03;
        int i;
        Throwable A012;
        C268654dm r2 = r16;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(551161975);
                ((IGPixelRequestBuffer) this.A01).mResponse = C9228RUf.A00("Not Found", r2.toString(), 404);
                i = 1845049417;
                break;
            case 1:
                A03 = AnonymousClass7TG.A0D(r2, 1419865509);
                Throwable A013 = r2.A01();
                if (A013 == null) {
                    A013 = AnonymousClass7TE.A15(C66579MXk.A00(572));
                }
                ((R22) this.A01).A00.setException(A013);
                i = -2061146723;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1679314668);
                i = -129999981;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(1616280986);
                i = 362097144;
                break;
            case 4:
                A03 = AnonymousClass0fD.A03(-886213665);
                ((C10492Rt7) this.A01).A00.A0A(new AutofillSettings("CONTROL", "CONTROL", 0, 0, 15, false, false, false, true));
                i = -2036623666;
                break;
            case 5:
                A03 = AnonymousClass0fD.A03(1400752233);
                if (!(r16 == null || (A012 = r2.A01()) == null)) {
                    0wb.A06(AnonymousClass000.A00(2354), C273654mx.A00(1294), A012);
                }
                i = -1809623144;
                break;
            case 6:
                A03 = AnonymousClass7TG.A0D(r2, 96466836);
                Throwable A014 = r2.A01();
                if (A014 != null) {
                    A014.getMessage();
                }
                i = 285681291;
                break;
            case 7:
                A03 = AnonymousClass0fD.A03(-236470850);
                i = 1595282256;
                break;
            case 8:
                A03 = AnonymousClass7TG.A0D(r2, -1186096714);
                Throwable A015 = r2.A01();
                0qQ.A0A(A015);
                ((1K2) this.A01).setException(A015);
                i = -680400904;
                break;
            default:
                A03 = AnonymousClass7TG.A0D(r2, -1278010133);
                C8764R8p.super.onFail(r2);
                C11208SFi sFi = (C11208SFi) this.A01;
                sFi.A01.post(new TEE(sFi));
                i = -1055505646;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0198, code lost:
        if (r4 != null) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a9, code lost:
        if (r7 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ac, code lost:
        if (r4 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ae, code lost:
        r0 = r4.A02("autofill_qrt_experiment_versions", X.C7590QNf.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b6, code lost:
        if (r0 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b8, code lost:
        r10 = X.C9835Rhx.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01bc, code lost:
        ((X.C10492Rt7) r15.A01).A00.A0A(new com.facebook.browser.lite.extensions.autofill.model.AutofillSettings(r6, r7, r8, r9, r10, r11, r12, r13, r14));
        X.AnonymousClass0fD.A0A(840327906, r1);
        r0 = 1131219648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d5, code lost:
        r10 = 15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x031a;
                case 1: goto L_0x02f8;
                case 2: goto L_0x0237;
                case 3: goto L_0x01e0;
                case 4: goto L_0x0140;
                case 5: goto L_0x0343;
                case 6: goto L_0x0095;
                case 7: goto L_0x006d;
                case 8: goto L_0x0039;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -1791746715(0xffffffff95341d65, float:-3.63739E-26)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.R8v r3 = (X.C8770R8v) r3
            r0 = 36872403(0x232a0d3, float:1.3123529E-37)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            X.C8764R8p.super.onSuccess(r3)
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x002c
            java.lang.Object r3 = r15.A01
            X.SFi r3 = (X.C11208SFi) r3
            android.os.Handler r1 = r3.A01
            X.TEF r0 = new X.TEF
            r0.<init>(r3)
            r1.post(r0)
        L_0x002c:
            r0 = -1729059561(0xffffffff98f0a517, float:-6.2205244E-24)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1694719323(0xffffffff9afca2a5, float:-1.04487524E-22)
        L_0x0035:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0039:
            r0 = -1036458634(0xffffffffc238e576, float:-46.224083)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.R7f r3 = (X.C8741R7f) r3
            r0 = -1814259730(0xffffffff93dc97ee, float:-5.5685622E-27)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r1 = r15.A01
            X.1K2 r1 = (X.1K2) r1
            X.Tiy r0 = r3.A00
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005c:
            X.QPd r0 = (X.QPd) r0
            java.lang.String r0 = r0.A00
            r1.set(r0)
            r0 = -1625463573(0xffffffff9f1d64eb, float:-3.332952E-20)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1472563361(0x57c588a1, float:4.34381215E14)
            goto L_0x0035
        L_0x006d:
            r0 = -1185061390(0xffffffffb95d65f2, float:-2.111418E-4)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r3 = (X.AnonymousClass3JC) r3
            r0 = 961793146(0x3953cc7a, float:2.0198702E-4)
            int r5 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r4 = r15.A01
            X.T79 r4 = (X.T79) r4
            X.0na r1 = r4.A02
            X.THi r0 = new X.THi
            r0.<init>(r3, r4)
            r1.execute(r0)
            r0 = -2107571277(0xffffffff826103b3, float:-1.6531451E-37)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1136318867(0xffffffffbc45266d, float:-0.012033087)
            goto L_0x0035
        L_0x0095:
            r0 = -553214983(0xffffffffdf069bf9, float:-9.69962E18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.5kX r3 = (X.C293325kX) r3
            r0 = -346286808(0xffffffffeb5c1528, float:-2.6606359E26)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r9 = r15.A01
            X.RvX r9 = (X.C10638RvX) r9
            if (r3 == 0) goto L_0x00d4
            X.5kZ r0 = r3.A00
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = r0.A00
        L_0x00b1:
            r7 = 1
            if (r0 == 0) goto L_0x00d6
            r4 = 0
            java.util.List r0 = X.DbX.A0x(r0)
            if (r0 == 0) goto L_0x00d6
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x00c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            X.0qQ.A0B(r0, r4)
            X.C51973G9u.A1F(r0, r3)
            goto L_0x00c3
        L_0x00d4:
            r0 = 0
            goto L_0x00b1
        L_0x00d6:
            X.0sl r5 = X.0sl.A00
            goto L_0x00dd
        L_0x00d9:
            java.util.Set r5 = X.00k.A0k(r3)
        L_0x00dd:
            java.util.List r0 = r9.A02
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x00e7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r3 = r4.next()
            long r0 = X.AnonymousClass7TE.A0R(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.contains(r0)
            X.DbV.A1U(r3, r8, r0)
            goto L_0x00e7
        L_0x0101:
            X.SFs r0 = r9.A01
            X.Rps r1 = r0.A00
            if (r1 == 0) goto L_0x0135
            X.00k.A0a(r5)
            boolean r0 = X.DbT.A1b(r8)
            if (r0 == 0) goto L_0x0135
            com.instagram.direct.locationsharing.service.DirectLiveLocationService r5 = r1.A00
            java.util.HashMap r4 = r5.A06
            r0 = 12
            X.JG2 r3 = new X.JG2
            r3.<init>(r0, r8, r5)
            r1 = 2
            X.TOY r0 = new X.TOY
            r0.<init>(r3, r1)
            r4.forEach(r0)
            java.util.Set r0 = r5.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0135
            r0 = 0
            r5.A03 = r0
            r5.stopForeground(r7)
            r5.stopSelf()
        L_0x0135:
            r0 = 1279737122(0x4c473d22, float:5.2229256E7)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -715265754(0xffffffffd55de926, float:-1.52495897E13)
            goto L_0x0035
        L_0x0140:
            r0 = -224443204(0xfffffffff29f44bc, float:-6.309275E30)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r3 = (X.AnonymousClass3JC) r3
            r0 = 1712228265(0x660e87a9, float:1.6826963E23)
            int r1 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r3.A01
            X.QNu r0 = (X.C7604QNu) r0
            if (r0 == 0) goto L_0x01d8
            X.QNg r4 = r0.A07()
            if (r4 == 0) goto L_0x01d9
            java.lang.String r0 = "consecutive_neg_interaction"
            org.json.JSONObject r3 = r4.A00
            int r8 = r3.optInt(r0)
            java.lang.String r0 = "has_contact_autofill_setting"
            boolean r11 = r4.A06(r0)
            java.lang.String r0 = "payment_autofill_consecutive_neg_interaction"
            int r9 = r3.optInt(r0)
            java.lang.String r0 = "is_payment_autofill_opt_in"
            boolean r12 = r4.A06(r0)
            java.lang.String r0 = "is_autofill_consent_accepted"
            boolean r13 = r4.A06(r0)
            java.lang.String r0 = "is_contact_autofill_fbpay_disclosure_shown"
            boolean r14 = r4.A06(r0)
        L_0x0183:
            java.lang.String r5 = "CONTROL"
            if (r4 == 0) goto L_0x0197
            X.RGJ r3 = X.RGJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "autofill_backtest_qrt_test_group"
            java.lang.Enum r0 = r4.A04(r0, r3)
            if (r0 == 0) goto L_0x0197
            java.lang.String r6 = r0.toString()
            if (r6 != 0) goto L_0x019a
        L_0x0197:
            r6 = r5
            if (r4 == 0) goto L_0x01ab
        L_0x019a:
            X.RGL r3 = X.RGL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "system_autofill_qrt_test_group"
            java.lang.Enum r0 = r4.A04(r0, r3)
            if (r0 == 0) goto L_0x01ab
            java.lang.String r7 = r0.toString()
            if (r7 != 0) goto L_0x01ae
        L_0x01ab:
            r7 = r5
            if (r4 == 0) goto L_0x01d5
        L_0x01ae:
            java.lang.Class<X.QNf> r3 = X.C7590QNf.class
            java.lang.String r0 = "autofill_qrt_experiment_versions"
            com.google.common.collect.ImmutableList r0 = r4.A02(r0, r3)
            if (r0 == 0) goto L_0x01d5
            int r10 = X.C9835Rhx.A00(r0)
        L_0x01bc:
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r5 = new com.facebook.browser.lite.extensions.autofill.model.AutofillSettings
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r0 = r15.A01
            X.Rt7 r0 = (X.C10492Rt7) r0
            X.2Fj r0 = r0.A00
            r0.A0A(r5)
            r0 = 840327906(0x321662e2, float:8.7536325E-9)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1131219648(0x436d0ac0, float:237.04199)
            goto L_0x0035
        L_0x01d5:
            r10 = 15
            goto L_0x01bc
        L_0x01d8:
            r4 = 0
        L_0x01d9:
            r8 = 0
            r11 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 1
            goto L_0x0183
        L_0x01e0:
            r0 = 760315924(0x2d518014, float:1.1908714E-11)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r3 = (X.AnonymousClass3JC) r3
            r0 = -1392766587(0xffffffffacfc1185, float:-7.164216E-12)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r3.A01
            if (r6 == 0) goto L_0x022c
            X.3FZ r6 = (X.AnonymousClass3FZ) r6
            java.lang.Class<X.QNh> r3 = X.QNh.class
            java.lang.String r1 = "ig_iab_autofill_update_settings"
            X.3FZ r0 = r6.A00(r3, r1)
            if (r0 == 0) goto L_0x022c
            X.RGX r4 = X.RGX.SUCCESS
            X.3FZ r3 = r6.A00(r3, r1)
            X.RGX r1 = X.RGX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            java.lang.Enum r0 = r3.A04(r0, r1)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x022c
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r0 = X.1Au.A00(r0)
            r3 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "browser_autofill_fbpay_disclosure_shown"
            r1.E5T(r0, r3)
            r1.apply()
        L_0x022c:
            r0 = -1371792928(0xffffffffae3c19e0, float:-4.2769233E-11)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 547176244(0x209d3f34, float:2.663866E-19)
            goto L_0x0035
        L_0x0237:
            r0 = 829566218(0x31722d0a, float:3.5241237E-9)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r3 = (X.AnonymousClass3JC) r3
            r0 = -1576066113(0xffffffffa20f23bf, float:-1.9399038E-18)
            int r7 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r8 = r3.A01
            if (r8 == 0) goto L_0x02e8
            X.QNu r8 = (X.C7604QNu) r8
            X.QNg r0 = r8.A07()
            if (r0 == 0) goto L_0x02e8
            X.QNg r1 = r8.A07()
            java.lang.String r0 = "is_contact_autofill_fbpay_disclosure_shown"
            boolean r9 = r1.A06(r0)
            X.QNg r1 = r8.A07()
            java.lang.String r0 = "is_autofill_consent_accepted"
            boolean r5 = r1.A06(r0)
            X.QNg r3 = r8.A07()
            X.RGL r1 = X.RGL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "system_autofill_qrt_test_group"
            java.lang.Enum r11 = r3.A04(r0, r1)
            X.QNg r3 = r8.A07()
            java.lang.Class<X.QNf> r1 = X.C7590QNf.class
            java.lang.String r0 = "autofill_qrt_experiment_versions"
            com.google.common.collect.ImmutableList r6 = r3.A02(r0, r1)
            X.QNg r0 = r8.A07()
            java.lang.String r1 = "auto_autofill_expiry_timestamp"
            org.json.JSONObject r0 = r0.A00
            int r0 = r0.optInt(r1)
            long r3 = X.Pxf.A0E(r0)
            X.QNg r1 = r8.A07()
            java.lang.String r0 = "is_eligible_for_automatic_autofill"
            boolean r8 = r1.A06(r0)
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r10 = X.1Au.A00(r0)
            r10.A1G(r5)
            int r6 = X.C9835Rhx.A00(r6)
            X.0s0 r5 = r10.A0P
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 166(0xa6, float:2.33E-43)
            r1 = r1[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.Epx(r10, r0, r1)
            X.0xa r6 = r10.A01
            X.0xY r1 = r6.AR4()
            java.lang.String r0 = "browser_autofill_fbpay_disclosure_shown"
            r1.E5T(r0, r9)
            r1.apply()
            if (r11 != 0) goto L_0x02f3
            java.lang.String r5 = "CONTROL"
        L_0x02ca:
            X.0xY r1 = r6.AR4()
            java.lang.String r0 = "browser_system_autofill_qrt_test_group"
            r1.E5g(r0, r5)
            X.0xY r1 = X.DbU.A0e(r1, r6)
            java.lang.String r0 = "contact_autofill_automatic_autofill_expiry_timestamp"
            r1.E5c(r0, r3)
            X.0xY r1 = X.DbU.A0e(r1, r6)
            java.lang.String r0 = "contact_autofill_eligible_for_automatic_autofill"
            r1.E5T(r0, r8)
            r1.apply()
        L_0x02e8:
            r0 = 2141173399(0x7f9fb697, float:NaN)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1012605507(0x3c5b2243, float:0.013374868)
            goto L_0x0035
        L_0x02f3:
            java.lang.String r5 = r11.toString()
            goto L_0x02ca
        L_0x02f8:
            r0 = 994030832(0x3b3fb4f0, float:0.0029252134)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1843189916(0x6ddcd89c, float:8.543571E27)
            int r1 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r15.A01
            X.R22 r0 = (X.R22) r0
            com.google.common.util.concurrent.SettableFuture r0 = r0.A00
            r0.set(r3)
            r0 = 1310373441(0x4e1ab641, float:6.4890886E8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1673427583(0x63be7a7f, float:7.0274163E21)
            goto L_0x0035
        L_0x031a:
            r0 = 1348906358(0x5066ad76, float:1.54805105E10)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 429902263(0x199fc9b7, float:1.6521687E-23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r15.A01
            com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer r4 = (com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer) r4
            java.lang.String r3 = ""
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.String r0 = "OK"
            android.webkit.WebResourceResponse r0 = X.C9228RUf.A00(r0, r3, r1)
            r4.mResponse = r0
            r0 = -1441503431(0xffffffffaa146739, float:-1.3180853E-13)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -609258159(0xffffffffdbaf7551, float:-9.8774223E16)
            goto L_0x0035
        L_0x0343:
            r0 = 1814130928(0x6c2170f0, float:7.8068156E26)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 115601914(0x6e3f1fa, float:8.574346E-35)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -94768038(0xfffffffffa59f45a, float:-2.8292111E35)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 321617297(0x132b7d91, float:2.1645143E-27)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8764R8p.onSuccess(java.lang.Object):void");
    }

    public C8764R8p(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
