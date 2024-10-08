package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Stm  reason: case insensitive filesystem */
public final class C12409Stm implements 2FO {
    public final C58840Ae A00;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0203, code lost:
        if (r1 == null) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0205, code lost:
        r4.A02(r1, "logging_policy");
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0212, code lost:
        if (r9.containsKey("ERROR_CODE") == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0214, code lost:
        r1 = X.DbT.A11("ERROR_CODE", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0218, code lost:
        if (r1 != null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021a, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021b, code lost:
        r4.A06(com.facebook.proxygen.TraceFieldType.ErrorCode, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0226, code lost:
        if (r9.containsKey("REDIRECTION_TYPE") == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0228, code lost:
        r0 = X.DbT.A11("REDIRECTION_TYPE", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022c, code lost:
        if (r0 == null) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x022e, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x022f, code lost:
        r4.A06("redirection_type", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0235, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023c, code lost:
        if (r9.containsKey("SESSION_TOKEN_AVAILABLE") == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023e, code lost:
        r4.A03("session_token_available", java.lang.Boolean.valueOf(X.AnonymousClass7TG.A1X((java.lang.Boolean) r9.get("SESSION_TOKEN_AVAILABLE"))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0258, code lost:
        if (r9.containsKey("USE_TEMP_TOKEN") == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025a, code lost:
        r0 = (java.lang.Boolean) r9.get("USE_TEMP_TOKEN");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0260, code lost:
        if (r0 == null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0262, code lost:
        r2 = r0.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0266, code lost:
        r4.A03("use_temp_token", java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0270, code lost:
        A06(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0280, code lost:
        r3 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0288, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028a, code lost:
        r4 = A04(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x028e, code lost:
        X.Pxe.A1Q(r3, r4);
        r1 = r9.get("EVENT_EXTRA");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0297, code lost:
        if (r1 == null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0299, code lost:
        r1 = (java.util.Map) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029b, code lost:
        r3.A9H("extra_data", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a2, code lost:
        r1 = X.0Yt.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b3, code lost:
        r3 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02bb, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02bd, code lost:
        r2 = A03(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0319, code lost:
        r2.A06(r0, r6);
        r1 = r9.get("AD_ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0322, code lost:
        if (r1 == null) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0326, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0328, code lost:
        r1 = (java.lang.String) r1;
        X.0qQ.A0B(r1, 0);
        r2.A05("ad_id", X.AnonymousClass7TE.A10(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0336, code lost:
        X.Pxe.A1Q(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0339, code lost:
        X.Pxk.A0V(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x033c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0346, code lost:
        throw X.AnonymousClass7TE.A0y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        r3 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r4 = A02(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        throw X.AnonymousClass7TE.A0z("Event name not supported in Offsite Logger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b0, code lost:
        r3 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b8, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ba, code lost:
        r4 = A01(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cc, code lost:
        r3 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d4, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d6, code lost:
        r4 = A00(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e8, code lost:
        r3 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f0, code lost:
        if (r3.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f2, code lost:
        r4 = new X.0bb();
        X.Pxe.A1T(r4, "login_with_app");
        X.Pxe.A1S(r4, "login_with_app");
        r1 = X.SQ1.A00(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgl(java.lang.String r8, java.util.Map r9) {
        /*
            r7 = this;
            r4 = 0
            X.0qQ.A0B(r8, r4)
            if (r9 == 0) goto L_0x034d
            java.lang.String r0 = "logging_context"
            java.lang.Object r5 = r9.get(r0)
            com.facebookpay.logging.LoggingContext r5 = (com.facebookpay.logging.LoggingContext) r5
            if (r5 == 0) goto L_0x034c
            java.lang.String r0 = r5.A02
            X.AnonymousClass2M6.A00 = r0
            X.2M7 r0 = X.2M7.A02
            X.AnonymousClass2MQ.A00(r0)
            int r0 = r8.hashCode()
            switch(r0) {
                case -1732568701: goto L_0x0027;
                case -1732466827: goto L_0x0035;
                case -1621070634: goto L_0x0051;
                case -1620968760: goto L_0x005e;
                case -1570152554: goto L_0x007a;
                case -1483492565: goto L_0x0088;
                case -390122863: goto L_0x00a4;
                case -383634785: goto L_0x00b2;
                case -308897551: goto L_0x00fe;
                case -308795677: goto L_0x010c;
                case -106044262: goto L_0x0128;
                case -105942388: goto L_0x0136;
                case -69660597: goto L_0x0144;
                case -69558723: goto L_0x0151;
                case 437491958: goto L_0x016d;
                case 437593832: goto L_0x0189;
                case 827692848: goto L_0x0197;
                case 827794722: goto L_0x01a4;
                case 967462192: goto L_0x01c0;
                case 1150809319: goto L_0x01dc;
                case 1182280542: goto L_0x0274;
                case 1611633419: goto L_0x02a7;
                case 1829704932: goto L_0x02c2;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r0 = "Event name not supported in Offsite Logger"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0027:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymentrequest_fail"
            goto L_0x0280
        L_0x0035:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_INIT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymentrequest_init"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QId r2 = A04(r5, r9)
            goto L_0x0336
        L_0x0051:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_FAIL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymentdetailschanged_fail"
            goto L_0x0094
        L_0x005e:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_INIT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymentdetailschanged_init"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIb r2 = A02(r5, r9)
            goto L_0x0336
        L_0x007a:
            java.lang.String r0 = "CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_SUCCESS"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_fetch_offsitemerchantjavascript_success"
            goto L_0x01b0
        L_0x0088:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_SUCCESS"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymentdetailschanged_success"
        L_0x0094:
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIb r4 = A02(r5, r9)
            goto L_0x028e
        L_0x00a4:
            java.lang.String r0 = "CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_SUCCESS"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_execute_offsitemerchantjavascript_success"
            goto L_0x01b0
        L_0x00b2:
            java.lang.String r0 = "CLIENT_RENDER_OFFSITEFOOTER_DISPLAY"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_render_offsitefooter_display"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIY r2 = new X.QIY
            r2.<init>()
            X.C51971G9r.A1B(r2, r5)
            java.lang.String r0 = "PARTNER_ID"
            java.lang.String r0 = X.DbT.A11(r0, r9)
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x00db
            r0 = r6
        L_0x00db:
            java.lang.String r1 = A05(r2, r0, r9)
            java.lang.String r0 = "partner_merchant_id"
            r2.A06(r0, r1)
            X.GkD r1 = X.SQ1.A00(r5)
            if (r1 == 0) goto L_0x033d
            java.lang.String r0 = "logging_policy"
            r2.A02(r1, r0)
            java.lang.String r0 = "VIEW_NAME"
            java.lang.String r0 = X.DbT.A11(r0, r9)
            if (r0 == 0) goto L_0x00f9
            r6 = r0
        L_0x00f9:
            java.lang.String r0 = "view_name"
            goto L_0x0319
        L_0x00fe:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_FAIL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsiteavailability_fail"
            goto L_0x01cc
        L_0x010c:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_INIT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsiteavailability_init"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIW r2 = A00(r5, r9)
            goto L_0x0336
        L_0x0128:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITELOGINWITHAPP_FAIL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsiteloginwithapp_fail"
            goto L_0x01e8
        L_0x0136:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITELOGINWITHAPP_INIT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsiteloginwithapp_init"
            goto L_0x01e8
        L_0x0144:
            java.lang.String r0 = "CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_FAIL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_fetch_offsitemerchantjavascript_fail"
            goto L_0x01b0
        L_0x0151:
            java.lang.String r0 = "CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_INIT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_fetch_offsitemerchantjavascript_init"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIa r2 = A01(r5, r9)
            goto L_0x0336
        L_0x016d:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymenthandled_fail"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIc r4 = A03(r5, r9)
            goto L_0x028e
        L_0x0189:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTHANDLED_INIT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymenthandled_init"
            goto L_0x02b3
        L_0x0197:
            java.lang.String r0 = "CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_FAIL"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_execute_offsitemerchantjavascript_fail"
            goto L_0x01b0
        L_0x01a4:
            java.lang.String r0 = "CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_INIT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_execute_offsitemerchantjavascript_init"
        L_0x01b0:
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIa r4 = A01(r5, r9)
            goto L_0x028e
        L_0x01c0:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsiteavailability_success"
        L_0x01cc:
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIW r4 = A00(r5, r9)
            goto L_0x028e
        L_0x01dc:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITELOGINWITHAPP_SUCCESS"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsiteloginwithapp_success"
        L_0x01e8:
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIZ r4 = new X.QIZ
            r4.<init>()
            java.lang.String r0 = "login_with_app"
            X.Pxe.A1T(r4, r0)
            X.Pxe.A1S(r4, r0)
            X.GkD r1 = X.SQ1.A00(r5)
            if (r1 == 0) goto L_0x0342
            java.lang.String r0 = "logging_policy"
            r4.A02(r1, r0)
            java.lang.String r1 = "ERROR_CODE"
            boolean r0 = r9.containsKey(r1)
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0220
            java.lang.String r1 = X.DbT.A11(r1, r9)
            if (r1 != 0) goto L_0x021b
            r1 = r2
        L_0x021b:
            java.lang.String r0 = "error_code"
            r4.A06(r0, r1)
        L_0x0220:
            java.lang.String r1 = "REDIRECTION_TYPE"
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x0235
            java.lang.String r0 = X.DbT.A11(r1, r9)
            if (r0 == 0) goto L_0x022f
            r2 = r0
        L_0x022f:
            java.lang.String r0 = "redirection_type"
            r4.A06(r0, r2)
        L_0x0235:
            java.lang.String r1 = "SESSION_TOKEN_AVAILABLE"
            boolean r0 = r9.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0252
            java.lang.Object r0 = r9.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "session_token_available"
            r4.A03(r0, r1)
        L_0x0252:
            java.lang.String r1 = "USE_TEMP_TOKEN"
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x0270
            java.lang.Object r0 = r9.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0266
            boolean r2 = r0.booleanValue()
        L_0x0266:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "use_temp_token"
            r4.A03(r0, r1)
        L_0x0270:
            A06(r4, r9)
            goto L_0x028e
        L_0x0274:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymentrequest_success"
        L_0x0280:
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QId r4 = A04(r5, r9)
        L_0x028e:
            X.Pxe.A1Q(r3, r4)
            java.lang.String r0 = "EVENT_EXTRA"
            java.lang.Object r1 = r9.get(r0)
            if (r1 == 0) goto L_0x02a2
            java.util.Map r1 = (java.util.Map) r1
        L_0x029b:
            java.lang.String r0 = "extra_data"
            r3.A9H(r0, r1)
            goto L_0x0339
        L_0x02a2:
            X.0sm r1 = X.0Yt.A0E()
            goto L_0x029b
        L_0x02a7:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTHANDLED_SUCCESS"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_load_offsitepaymenthandled_success"
        L_0x02b3:
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIc r2 = A03(r5, r9)
            goto L_0x0336
        L_0x02c2:
            java.lang.String r0 = "USER_CLICK_OFFSITEDISCLAIMER_ATOMIC"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "user_click_offsitedisclaimer_atomic"
            X.0Aj r3 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x034c
            X.QIX r2 = new X.QIX
            r2.<init>()
            X.C51971G9r.A1B(r2, r5)
            java.lang.String r0 = "PARTNER_ID"
            java.lang.String r0 = X.DbT.A11(r0, r9)
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x02ec
            r0 = r6
        L_0x02ec:
            java.lang.String r1 = A05(r2, r0, r9)
            java.lang.String r0 = "partner_merchant_id"
            r2.A06(r0, r1)
            X.GkD r1 = X.SQ1.A00(r5)
            if (r1 == 0) goto L_0x0347
            java.lang.String r0 = "logging_policy"
            r2.A02(r1, r0)
            java.lang.String r0 = "VIEW_NAME"
            java.lang.String r0 = X.DbT.A11(r0, r9)
            if (r0 != 0) goto L_0x030a
            r0 = r6
        L_0x030a:
            X.Pxe.A1S(r2, r0)
            java.lang.String r0 = "TARGET_NAME"
            java.lang.String r0 = X.DbT.A11(r0, r9)
            if (r0 == 0) goto L_0x0316
            r6 = r0
        L_0x0316:
            java.lang.String r0 = "target_name"
        L_0x0319:
            r2.A06(r0, r6)
            java.lang.String r0 = "AD_ID"
            java.lang.Object r1 = r9.get(r0)
            if (r1 == 0) goto L_0x0336
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0336
            java.lang.String r1 = (java.lang.String) r1
            X.0qQ.A0B(r1, r4)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            java.lang.String r0 = "ad_id"
            r2.A05(r0, r1)
        L_0x0336:
            X.Pxe.A1Q(r3, r2)
        L_0x0339:
            X.Pxk.A0V(r3)
            return
        L_0x033d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0342:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0347:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x034c:
            return
        L_0x034d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12409Stm.Cgl(java.lang.String, java.util.Map):void");
    }

    public static final QIW A00(LoggingContext loggingContext, Map map) {
        List list;
        0bb r2 = new 0bb();
        C51971G9r.A1B(r2, loggingContext);
        String A11 = DbT.A11("PARTNER_ID", map);
        String str = "";
        if (A11 == null) {
            A11 = str;
        }
        r2.A06("partner_merchant_id", A05(r2, A11, map));
        String A112 = DbT.A11("MERCHANT_REQUEST_ID", map);
        if (A112 != null) {
            str = A112;
        }
        r2.A06("merchant_request_id", str);
        C53203GkD A002 = SQ1.A00(loggingContext);
        if (A002 != null) {
            r2.A02(A002, "logging_policy");
            r2.A03("cache_available", (Boolean) map.get("CACHE_AVAILABLE"));
            Pxe.A1S(r2, "ecp_checkout");
            Object obj = map.get("TARGET_NAME");
            if (obj != null && (obj instanceof String)) {
                Pxe.A1T(r2, (String) obj);
            }
            Object obj2 = map.get("CACHE_AVAILABLE");
            if (obj2 != null && (obj2 instanceof Boolean)) {
                r2.A03("cache_available", (Boolean) obj2);
            }
            Object obj3 = map.get("AD_ID");
            if (obj3 != null && (obj3 instanceof String)) {
                r2.A05("ad_id", AnonymousClass7TE.A10(C41847B3o.A1E(obj3)));
            }
            Object obj4 = map.get("INITIATOR");
            if (obj4 != null && (obj4 instanceof String)) {
                r2.A06("initiator", (String) obj4);
            }
            Object obj5 = map.get("IAB_SESSION_ID");
            if (obj5 != null && (obj5 instanceof String)) {
                r2.A06("iab_session_id", (String) obj5);
            }
            Object obj6 = map.get("MERCHANT_CONTAINER_TYPES");
            if ((obj6 instanceof List) && (list = (List) obj6) != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    DbS.A1Y(next);
                    A1C.add(next);
                }
                r2.A07("merchant_container_types", A1C);
            }
            Object obj7 = map.get("USER_HAS_CARD");
            if (obj7 != null && (obj7 instanceof String)) {
                r2.A06("user_has_card", (String) obj7);
            }
            Object obj8 = map.get("USER_HAS_TOKENIZED_CARD");
            if (obj8 != null && (obj8 instanceof String)) {
                r2.A06("user_has_tokenized_card", (String) obj8);
            }
            Object obj9 = map.get("USER_HAS_SHIPPING_ADDRESS");
            if (obj9 != null && (obj9 instanceof String)) {
                r2.A06("user_has_shipping_address", (String) obj9);
            }
            Object obj10 = map.get("USER_HAS_EMAIL");
            if (obj10 != null && (obj10 instanceof String)) {
                r2.A06("user_has_email", (String) obj10);
            }
            Object obj11 = map.get("USER_HAS_PHONE");
            if (obj11 != null && (obj11 instanceof String)) {
                r2.A06("user_has_phone", (String) obj11);
            }
            return r2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C7531QIa A01(LoggingContext loggingContext, Map map) {
        Long l;
        0bb r3 = new 0bb();
        r3.A05("product_id", Long.valueOf(loggingContext.A00));
        C53203GkD A002 = SQ1.A00(loggingContext);
        if (A002 != null) {
            r3.A02(A002, "logging_policy");
            String A11 = DbT.A11("PARTNER_ID", map);
            String str = "";
            if (A11 == null) {
                A11 = str;
            }
            r3.A06("partner_merchant_id", A05(r3, A11, map));
            Pxe.A1S(r3, "ecp_checkout");
            String A112 = DbT.A11("ERROR_CODE", map);
            if (A112 != null) {
                str = A112;
            }
            r3.A06(TraceFieldType.ErrorCode, str);
            Object obj = map.get("CACHE_AVAILABLE");
            if (obj != null && (obj instanceof Boolean)) {
                r3.A03("cache_available", (Boolean) obj);
            }
            Object obj2 = map.get("PRODUCT_ID");
            if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
                r3.A05("product_id", l);
            }
            return r3;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C7532QIb A02(LoggingContext loggingContext, Map map) {
        0bb r3 = new 0bb();
        String A11 = DbT.A11("PARTNER_ID", map);
        String str = "";
        if (A11 == null) {
            A11 = str;
        }
        r3.A06("partner_merchant_id", A05(r3, A11, map));
        String A112 = DbT.A11("MERCHANT_REQUEST_ID", map);
        if (A112 == null) {
            A112 = str;
        }
        r3.A06("merchant_request_id", A112);
        C53203GkD A002 = SQ1.A00(loggingContext);
        if (A002 != null) {
            r3.A02(A002, "logging_policy");
            Pxe.A1S(r3, "ecp_checkout");
            0sn A13 = C66580MXl.A13("CHANGED_FIELDS", map);
            if (A13 == null) {
                A13 = 0sn.A00;
            }
            r3.A07("changed_fields", A13);
            String A113 = DbT.A11("ERROR_CODE", map);
            if (A113 != null) {
                str = A113;
            }
            r3.A06(TraceFieldType.ErrorCode, str);
            A06(r3, map);
            return r3;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C7533QIc A03(LoggingContext loggingContext, Map map) {
        String str;
        0bb r2 = new 0bb();
        String A11 = DbT.A11("PARTNER_ID", map);
        String str2 = "";
        if (A11 == null) {
            A11 = str2;
        }
        r2.A06("partner_merchant_id", A05(r2, A11, map));
        String A112 = DbT.A11("MERCHANT_REQUEST_ID", map);
        if (A112 == null) {
            A112 = str2;
        }
        r2.A06("merchant_request_id", A112);
        C53203GkD A002 = SQ1.A00(loggingContext);
        if (A002 != null) {
            r2.A02(A002, "logging_policy");
            Pxe.A1S(r2, "ecp_checkout");
            String A113 = DbT.A11("ERROR_CODE", map);
            if (A113 == null) {
                A113 = str2;
            }
            r2.A06(TraceFieldType.ErrorCode, A113);
            r2.A03("retryable", Boolean.valueOf(AnonymousClass7TG.A1X((Boolean) map.get("RETRYABLE"))));
            String A114 = DbT.A11("TYPED_CONTAINER_ID", map);
            if (A114 != null) {
                str2 = A114;
            }
            r2.A06("typed_container_id", str2);
            A06(r2, map);
            Object obj = map.get("CONTAINER_TYPE");
            if ((obj instanceof String) && (str = (String) obj) != null) {
                r2.A06("container_type", str);
            }
            return r2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C7534QId A04(LoggingContext loggingContext, Map map) {
        0bb r2 = new 0bb();
        String A11 = DbT.A11("PARTNER_ID", map);
        String str = "";
        if (A11 == null) {
            A11 = str;
        }
        r2.A06("partner_merchant_id", A05(r2, A11, map));
        String A112 = DbT.A11("MERCHANT_REQUEST_ID", map);
        if (A112 == null) {
            A112 = str;
        }
        r2.A06("merchant_request_id", A112);
        C53203GkD A002 = SQ1.A00(loggingContext);
        if (A002 != null) {
            r2.A02(A002, "logging_policy");
            Pxe.A1S(r2, "ecp_checkout");
            r2.A03("proactive_checkout", Boolean.valueOf(AnonymousClass7TG.A1X((Boolean) map.get("PROACTIVE_CHECKOUT"))));
            String A113 = DbT.A11("ERROR_CODE", map);
            if (A113 != null) {
                str = A113;
            }
            r2.A06(TraceFieldType.ErrorCode, str);
            0sn A13 = C66580MXl.A13("PAYMENT_OPTIONS", map);
            if (A13 == null) {
                A13 = 0sn.A00;
            }
            r2.A07(C273654mx.A00(876), A13);
            A06(r2, map);
            return r2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static String A05(0bb r2, String str, Map map) {
        r2.A06("partner_id", str);
        String str2 = (String) map.get("PARTNER_MERCHANT_ID");
        return str2 == null ? "" : str2;
    }

    public static void A06(0bb r2, Map map) {
        Long l;
        Object obj = map.get("PRODUCT_ID");
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            r2.A05("product_id", l);
        }
    }

    public C12409Stm(C58840Ae r1) {
        this.A00 = r1;
    }
}
