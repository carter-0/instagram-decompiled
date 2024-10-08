package X;

import java.util.HashMap;

public abstract class S8F {
    public static void A00(C58840Ae r6, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        long j;
        Long A10;
        HashMap A0r = Pxf.A0r(num, 4);
        A0r.put("is_1P", String.valueOf(z));
        A0r.put("is_3P", String.valueOf(z2));
        A0r.put("bwp_type", RVU.A00(num));
        A0r.put("is_organic", String.valueOf(z3));
        if (str2 == null) {
            str2 = "";
        }
        A0r.put("media_id", str2);
        if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        A01(r6, "PRE_CLICK_AD_PROCESSING", (String) null, A0r, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [X.0Ac] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C58840Ae r16, java.lang.String r17, java.lang.String r18, java.util.Map r19, long r20) {
        /*
            r0 = 1
            r14 = r17
            X.0qQ.A0B(r14, r0)
            r3 = r19
            if (r19 == 0) goto L_0x0126
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r3)
        L_0x000f:
            java.lang.String r0 = "preferred_businesses_iab_event"
            r1 = r16
            X.0Aj r12 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r12.isSampled()
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "PRE_CLICK_AD_PROCESSING"
            boolean r0 = r14.equals(r0)
            r11 = 0
            r5 = r20
            if (r0 == 0) goto L_0x0064
            if (r19 == 0) goto L_0x003e
            java.lang.String r2 = "bwp_type"
            java.lang.Object r1 = r3.get(r2)
            java.lang.String r0 = "CUSTOM_IAB_FOR_1P"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0059
            java.lang.String r11 = "BUY_WITH_PRIME_1P"
        L_0x003b:
            r13.remove(r2)
        L_0x003e:
            X.RIQ r1 = X.RIQ.valueOf(r14)
            java.lang.String r0 = "event"
            r12.A8M(r1, r0)
            X.C51970G9q.A17(r12, r5)
            java.lang.String r0 = "extra_info"
            r12.A9H(r0, r13)
            java.lang.String r0 = "product_experience"
            r12.AAJ(r0, r11)
        L_0x0055:
            r12.Cgf()
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r0 = "CUSTOM_IAB_FOR_DTC"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r11 = "BUY_WITH_PRIME_3P"
            goto L_0x003b
        L_0x0064:
            X.SPF r2 = X.SPF.A06
            if (r2 == 0) goto L_0x0058
            X.S3V r0 = r2.A04
            long r7 = r0.A00
            X.QP8 r1 = r2.A01
            java.lang.String r0 = r1.A01
            r17 = r0
            java.lang.Object r15 = r1.A00
            java.lang.Integer r15 = (java.lang.Integer) r15
            if (r19 == 0) goto L_0x0120
            java.lang.String r4 = "pageLoadSource"
            java.lang.String r10 = X.DbT.A11(r4, r3)
            java.lang.String r1 = "pageCloseReason"
            java.lang.String r9 = X.DbT.A11(r1, r3)
            java.lang.String r0 = "messageCode"
            java.lang.String r16 = X.DbT.A11(r0, r3)
            r13.remove(r4)
            r13.remove(r1)
            r13.remove(r0)
        L_0x0096:
            X.Rtm r1 = r2.A03
            java.lang.String r0 = r1.A02
            if (r0 != 0) goto L_0x010d
            java.lang.String r2 = "unauthenticated"
        L_0x009f:
            X.RIQ r1 = X.RIQ.valueOf(r14)
            java.lang.String r0 = "event"
            r12.A8M(r1, r0)
            java.lang.String r0 = "iab_session_id"
            r1 = r18
            r12.AAJ(r0, r1)
            X.C51970G9q.A17(r12, r5)
            java.lang.String r0 = "user_authentication_state"
            r12.AAJ(r0, r2)
            boolean r0 = X.AnonymousClass7TF.A1V(r17)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_api_key_cookie_present"
            r12.A7p(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "api_key_cookie_expiration_time"
            r12.A9F(r0, r1)
            java.lang.String r0 = "page_load_source"
            r12.AAJ(r0, r10)
            java.lang.String r0 = "page_close_reason"
            r12.AAJ(r0, r9)
            java.lang.String r0 = "extra_info"
            r12.A9H(r0, r13)
            if (r16 == 0) goto L_0x00e5
            X.RIR r11 = X.RIR.valueOf(r16)
        L_0x00e5:
            java.lang.String r0 = "js_message_code"
            r12.A8M(r11, r0)
            java.lang.String r1 = X.RVU.A00(r15)
            java.lang.String r0 = "CUSTOM_IAB_FOR_1P"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0100
            java.lang.String r1 = "BUY_WITH_PRIME_1P"
        L_0x00f8:
            java.lang.String r0 = "product_experience"
            r12.AAJ(r0, r1)
            goto L_0x0055
        L_0x0100:
            java.lang.String r0 = "CUSTOM_IAB_FOR_DTC"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x010b
            java.lang.String r1 = "BUY_WITH_PRIME_3P"
            goto L_0x00f8
        L_0x010b:
            r1 = 0
            goto L_0x00f8
        L_0x010d:
            long r3 = r1.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            java.lang.String r2 = "authenticated_active"
            goto L_0x009f
        L_0x011d:
            java.lang.String r2 = "authenticated_expired"
            goto L_0x009f
        L_0x0120:
            r16 = r11
            r10 = r11
            r9 = r11
            goto L_0x0096
        L_0x0126:
            java.util.LinkedHashMap r13 = X.AnonymousClass7TE.A1H()
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S8F.A01(X.0Ae, java.lang.String, java.lang.String, java.util.Map, long):void");
    }
}
