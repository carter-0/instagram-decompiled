package X;

/* renamed from: X.4he  reason: invalid class name and case insensitive filesystem */
public final class C270944he {
    public C270914hb A00;
    public 0wc A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C270914hb.A00(r0) == X.AnonymousClass05K.A00) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r8 = this;
            r7 = 0
            r5 = 0
            X.4hb r0 = r8.A00
            if (r0 == 0) goto L_0x000f
            java.lang.Integer r1 = X.C270914hb.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6 = 1
            if (r1 != r0) goto L_0x0010
        L_0x000f:
            r6 = 0
        L_0x0010:
            boolean r0 = X.14i.A08()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.0wc r2 = r8.A01
            java.lang.String r1 = "android_mgeoapi_module_use"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = "module_name"
            r1.AAJ(r0, r10)
            java.lang.String r0 = "method_name"
            r1.AAJ(r0, r11)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "is_app_in_background_no_delay"
            r1.A7p(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "is_blocked_by_failsafe"
            r1.A7p(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_initiated_by_failsafe"
            r1.A7p(r0, r2)
            java.lang.String r0 = "allow_collection_in_background"
            r1.A7p(r0, r9)
            java.lang.String r0 = "token"
            r1.AAJ(r0, r5)
            java.lang.String r0 = "caller_context"
            r1.AAJ(r0, r12)
            java.lang.String r0 = "is_app_in_background_with_delay"
            r1.A7p(r0, r4)
            java.lang.String r0 = "delayed_background_grace_period_ms"
            r1.A9F(r0, r3)
            java.lang.String r0 = "location_permission_setting"
            r1.AAJ(r0, r13)
            java.lang.String r0 = "detailed_location_permission_setting"
            r1.AAJ(r0, r14)
            r1.Cgf()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270944he.A01(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A00(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5) {
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "android_mgeoapi_module_internal_use");
        if (A002.isSampled()) {
            A002.AAJ("moduleName", str);
            A002.AAJ("methodName", str2);
            A002.AAJ("callerName", str3);
            A002.AAJ("locatonProviderAccessType", str4);
            A002.AAJ("locationProviderType", str5);
            A002.A7p("isCacheUsedDirectly", bool);
            A002.A9F("locationFreshness", l);
            A002.Cgf();
        }
    }
}
