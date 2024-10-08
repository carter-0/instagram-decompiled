package X;

public abstract class RU7 {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r2.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE") == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009f, code lost:
        if (X.00l.A0d(r4, "", false) == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C58840Ae r17, java.lang.String r18, java.lang.String r19, java.util.Map r20, long r21) {
        /*
            r0 = 1
            r13 = r18
            X.0qQ.A0B(r13, r0)
            r2 = r20
            if (r20 == 0) goto L_0x0162
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r2)
        L_0x000f:
            java.lang.String r0 = "preferred_businesses_iab_event"
            r1 = r17
            X.0Aj r9 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "PRE_CLICK_AD_PROCESSING"
            boolean r0 = r13.equals(r0)
            r8 = 0
            r5 = r21
            if (r0 == 0) goto L_0x005e
            if (r20 == 0) goto L_0x005c
            java.lang.String r0 = "PARTNER_TYPE"
            java.lang.String r2 = X.DbT.A11(r0, r2)
            r10.remove(r0)
        L_0x0034:
            X.RIQ r1 = X.RIQ.valueOf(r13)
            java.lang.String r0 = "event"
            r9.A8M(r1, r0)
            X.C51970G9q.A17(r9, r5)
            java.lang.String r0 = "extra_info"
            r9.A9H(r0, r10)
            if (r2 == 0) goto L_0x004f
            java.lang.String r0 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0144
        L_0x004f:
            r0 = 874(0x36a, float:1.225E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A8M(r8, r0)
            r9.Cgf()
        L_0x005b:
            return
        L_0x005c:
            r2 = r8
            goto L_0x0034
        L_0x005e:
            X.SHI r1 = X.SHI.A04
            if (r1 == 0) goto L_0x005b
            r17 = 0
            X.QP7 r0 = r1.A01
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = X.RU8.A00(r0)
            android.net.Uri r0 = X.DbT.A09(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.clearQuery()
            java.lang.String r3 = X.Pxf.A0b(r0)
            if (r3 == 0) goto L_0x015f
            java.util.regex.Pattern r0 = X.SCX.A01
            X.RUF.A00()
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            java.lang.String r4 = r0.getCookie(r3)
        L_0x008d:
            java.lang.String r3 = ""
            int r0 = r3.length()
            r16 = 1
            if (r0 <= 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a1
            r0 = 0
            boolean r0 = X.00l.A0d(r4, r3, r0)
            r15 = 1
            if (r0 != 0) goto L_0x00a2
        L_0x00a1:
            r15 = 0
        L_0x00a2:
            X.ThJ r0 = r1.A00
            java.lang.String r3 = r0.AXj()
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x015b
            if (r4 == 0) goto L_0x015b
            r0 = 0
            boolean r0 = X.00l.A0d(r4, r3, r0)
            if (r0 == 0) goto L_0x015b
        L_0x00b7:
            X.QP7 r0 = r1.A01
            java.lang.Object r7 = r0.A03
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r20 == 0) goto L_0x0156
            java.lang.String r0 = "pageLoadSource"
            java.lang.String r12 = X.DbT.A11(r0, r2)
            java.lang.String r0 = "pageCloseReason"
            java.lang.String r11 = X.DbT.A11(r0, r2)
            java.lang.String r0 = "messageCode"
            java.lang.String r14 = X.DbT.A11(r0, r2)
        L_0x00d4:
            X.Rtl r0 = r1.A02
            java.lang.String r1 = r0.A02
            long r3 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r1 == 0) goto L_0x0152
            if (r0 == 0) goto L_0x0152
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x014f
            java.lang.String r2 = "authenticated_active"
        L_0x00ef:
            X.RIQ r1 = X.RIQ.valueOf(r13)
            java.lang.String r0 = "event"
            r9.A8M(r1, r0)
            java.lang.String r0 = "iab_session_id"
            r1 = r19
            r9.AAJ(r0, r1)
            X.C51970G9q.A17(r9, r5)
            java.lang.String r0 = "user_authentication_state"
            r9.AAJ(r0, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "is_api_key_cookie_present"
            r9.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            java.lang.String r0 = "is_access_token_cookie_present"
            r9.A7p(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r17)
            java.lang.String r0 = "api_key_cookie_expiration_time"
            r9.A9F(r0, r1)
            java.lang.String r0 = "page_load_source"
            r9.AAJ(r0, r12)
            java.lang.String r0 = "page_close_reason"
            r9.AAJ(r0, r11)
            java.lang.String r0 = "extra_info"
            r9.A9H(r0, r10)
            if (r14 != 0) goto L_0x014a
            r1 = r8
        L_0x0137:
            java.lang.String r0 = "js_message_code"
            r9.A8M(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r7 == r0) goto L_0x004f
            java.lang.String r2 = X.RVT.A00(r7)
        L_0x0144:
            X.RIS r8 = X.RIS.valueOf(r2)
            goto L_0x004f
        L_0x014a:
            X.RIR r1 = X.RIR.valueOf(r14)
            goto L_0x0137
        L_0x014f:
            java.lang.String r2 = "authenticated_expired"
            goto L_0x00ef
        L_0x0152:
            java.lang.String r2 = "unauthenticated"
            goto L_0x00ef
        L_0x0156:
            r14 = r8
            r12 = r8
            r11 = r8
            goto L_0x00d4
        L_0x015b:
            r16 = 0
            goto L_0x00b7
        L_0x015f:
            r4 = r8
            goto L_0x008d
        L_0x0162:
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RU7.A00(X.0Ae, java.lang.String, java.lang.String, java.util.Map, long):void");
    }
}
