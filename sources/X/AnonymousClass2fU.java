package X;

/* renamed from: X.2fU  reason: invalid class name */
public abstract class AnonymousClass2fU {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        if (r1 != 2) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.instagram.common.session.UserSession r6, android.content.Context r7) {
        /*
            X.0xa r1 = X.AnonymousClass1GD.A00()
            java.lang.String r0 = "KEY_CONFIG_CURRENT_SYSTEM_UI_MODE"
            r2 = -1
            int r5 = r1.getInt(r0, r2)
            X.0xa r1 = X.AnonymousClass1GD.A00()
            java.lang.String r0 = "KEY_CONFIG_UI_MODE"
            int r1 = r1.getInt(r0, r2)
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            int r0 = r0.A00()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = -1
            r3 = 1
            if (r1 == r2) goto L_0x0052
            if (r1 == r3) goto L_0x004d
            r0 = 2
            if (r1 == r0) goto L_0x0052
        L_0x002c:
            X.0wc r2 = X.AnonymousClass0kN.A02(r6)
            java.lang.String r1 = "ig_dark_mode_opt"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0084
            r0 = 32
            if (r5 == r0) goto L_0x0043
            r3 = 0
        L_0x0043:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "os_dark_mode_settings"
            r2.A7p(r0, r1)
            goto L_0x0057
        L_0x004d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L_0x002c
        L_0x0052:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x002c
        L_0x0057:
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r7.getSystemService(r0)     // Catch:{ Exception -> 0x0068 }
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch:{ Exception -> 0x0068 }
            if (r0 != 0) goto L_0x0063
            r0 = -1
            goto L_0x0069
        L_0x0063:
            int r0 = r0.getNightMode()     // Catch:{ Exception -> 0x0068 }
            goto L_0x0069
        L_0x0068:
            r0 = -1
        L_0x0069:
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "dark_mode_in_app_toggle"
            r2.A9F(r0, r1)
            int r0 = r4.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "in_app_dark_mode_setting"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2fU.A00(com.instagram.common.session.UserSession, android.content.Context):void");
    }
}
