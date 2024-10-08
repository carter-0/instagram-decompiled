package X;

public final class W15 {
    public final X37 A00;

    public static final C266444Yx A00(String str, boolean z) {
        int i;
        if (0qQ.A0K(str, "3pd_trial_control")) {
            i = 2131952498;
        } else if (0qQ.A0K(str, "3pd_trial_inline_opt_in")) {
            i = 2131952495;
            if (z) {
                i = 2131952496;
            }
        } else if (0qQ.A0K(str, "3pd_trial_go_to_settings")) {
            i = 2131952497;
        } else if (0qQ.A0K(str, "3pd_trial_decide")) {
            i = 2131952493;
            if (z) {
                i = 2131952494;
            }
        } else if (0qQ.A0K(str, "fewer_ads_test_group_content")) {
            i = 2131962404;
        } else if (0qQ.A0K(str, "fewer_ads_control_group_content")) {
            i = 2131962397;
        } else if (!0qQ.A0K(str, "activity_feed_notification_3PD_content")) {
            return JUH.A00("");
        } else {
            i = 2131952199;
        }
        return JTP.A0Q(i);
    }

    public static final C266444Yx A01(String str, boolean z) {
        int i;
        if (0qQ.A0K(str, "3pd_trial_control")) {
            i = 2131952505;
        } else if (0qQ.A0K(str, "3pd_trial_inline_opt_in")) {
            i = 2131952502;
            if (z) {
                i = 2131952503;
            }
        } else if (0qQ.A0K(str, "3pd_trial_go_to_settings")) {
            i = 2131952504;
        } else if (0qQ.A0K(str, "3pd_trial_decide")) {
            i = 2131952500;
            if (z) {
                i = 2131952501;
            }
        } else if (0qQ.A0K(str, "fewer_ads_test_group_content")) {
            i = 2131962405;
        } else if (0qQ.A0K(str, "fewer_ads_control_group_content")) {
            i = 2131962398;
        } else if (!0qQ.A0K(str, "activity_feed_notification_3PD_content")) {
            return JUH.A00("");
        } else {
            i = 2131952201;
        }
        return JTP.A0Q(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r2 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A02(java.lang.String r1, boolean r2) {
        /*
            java.lang.String r0 = "3pd_trial_control"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            if (r2 == 0) goto L_0x004a
        L_0x001a:
            r0 = 2131237558(0x7f081ab6, float:1.809137E38)
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0022:
            java.lang.String r0 = "3pd_trial_decide"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0030
            r0 = 2131237527(0x7f081a97, float:1.8091307E38)
            if (r2 == 0) goto L_0x001d
            goto L_0x001a
        L_0x0030:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            r0 = 0
            return r0
        L_0x004a:
            r0 = 2131237529(0x7f081a99, float:1.8091311E38)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W15.A02(java.lang.String, boolean):java.lang.Integer");
    }

    public W15(X37 x37) {
        this.A00 = x37;
    }
}
