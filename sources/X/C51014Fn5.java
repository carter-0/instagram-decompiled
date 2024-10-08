package X;

/* renamed from: X.Fn5  reason: case insensitive filesystem */
public final class C51014Fn5 implements C51920G7o {
    public static final 0bY A00 = DbW.A0G();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r4 = "fb_marketplace";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a9, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ab, code lost:
        r4 = "fb_jobs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        X.FFi.A01(r9, r2, r3, r4, (java.lang.String) null, X.DbS.A0m(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI1(android.os.Bundle r8, androidx.fragment.app.FragmentActivity r9, X.AnonymousClass0wW r10) {
        /*
            r7 = this;
            r3 = r10
            java.lang.String r0 = "FB_APP_URL_TYPE"
            java.lang.String r1 = r8.getString(r0)
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            if (r1 == 0) goto L_0x0017
            X.FUr r2 = new X.FUr
            r2.<init>(r7)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2023155454: goto L_0x0018;
                case -1326167441: goto L_0x0024;
                case -1237460524: goto L_0x002f;
                case -866446714: goto L_0x003a;
                case -845292973: goto L_0x0045;
                case 3138974: goto L_0x0048;
                case 300911179: goto L_0x0053;
                case 805542022: goto L_0x005e;
                case 851821829: goto L_0x0069;
                case 950484242: goto L_0x0074;
                case 1115319237: goto L_0x007f;
                case 1451995004: goto L_0x0082;
                case 1794744950: goto L_0x008d;
                case 1905850548: goto L_0x0098;
                case 2031452069: goto L_0x00a3;
                default: goto L_0x0017;
            }
        L_0x0017:
            return
        L_0x0018:
            java.lang.String r0 = "recent_feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_recent_feed"
            goto L_0x00ad
        L_0x0024:
            java.lang.String r0 = "donate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_donate"
            goto L_0x00ad
        L_0x002f:
            java.lang.String r0 = "groups"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_groups"
            goto L_0x00ad
        L_0x003a:
            java.lang.String r0 = "favorites_feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_favorites_feed"
            goto L_0x00ad
        L_0x0045:
            java.lang.String r0 = "marketplace_home"
            goto L_0x0055
        L_0x0048:
            java.lang.String r0 = "feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_homepage"
            goto L_0x00ad
        L_0x0053:
            java.lang.String r0 = "marketplace"
        L_0x0055:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_marketplace"
            goto L_0x00ad
        L_0x005e:
            java.lang.String r0 = "mini_feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_mini_feed"
            goto L_0x00ad
        L_0x0069:
            java.lang.String r0 = "nt_screen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_nt_screen"
            goto L_0x00ad
        L_0x0074:
            java.lang.String r0 = "compass"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_compass"
            goto L_0x00ad
        L_0x007f:
            java.lang.String r0 = "jobSearch"
            goto L_0x00a5
        L_0x0082:
            java.lang.String r0 = "ptx_inquiry"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_order_help"
            goto L_0x00ad
        L_0x008d:
            java.lang.String r0 = "gemstone"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_gemstone"
            goto L_0x00ad
        L_0x0098:
            java.lang.String r0 = "ptx_cancel_order"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_order_cancel"
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r0 = "jobsearch"
        L_0x00a5:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = "fb_jobs"
        L_0x00ad:
            r5 = 0
            java.lang.String r6 = X.DbS.A0m(r8)
            r1 = r9
            X.FFi.A01(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51014Fn5.CI1(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0wW):void");
    }

    public final boolean EHn() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        switch(r16) {
            case 0: goto L_0x00c0;
            case 1: goto L_0x00c4;
            case 2: goto L_0x00cd;
            case 3: goto L_0x00d1;
            case 4: goto L_0x00d5;
            case 5: goto L_0x00d9;
            case 6: goto L_0x00dd;
            case 7: goto L_0x00e1;
            case 8: goto L_0x00fe;
            case 9: goto L_0x0102;
            case 10: goto L_0x0106;
            case 11: goto L_0x010d;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x0111;
            case 13: goto L_0x011c;
            case 14: goto L_0x0106;
            default: goto L_0x004e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c0, code lost:
        r12.putString("FB_APP_URL_TYPE", "recent_feed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c3, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
        r12.putString("FB_APP_URL_TYPE", "donate");
        X.DbU.A1B(r13, r12, "fundraiser_campaign_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        r12.putString("FB_APP_URL_TYPE", "groups");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d1, code lost:
        r12.putString("FB_APP_URL_TYPE", "favorites_feed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d4, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        r12.putString("FB_APP_URL_TYPE", "marketplace_home");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        r12.putString("FB_APP_URL_TYPE", "feed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dd, code lost:
        r12.putString("FB_APP_URL_TYPE", "marketplace");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        r12.putString("FB_APP_URL_TYPE", "mini_feed");
        X.DbU.A1B(r13, r12, "token");
        X.DbU.A1B(r13, r12, com.facebook.react.modules.dialog.DialogModule.KEY_TITLE);
        X.DbU.A1B(r13, r12, "render_location");
        X.DbU.A1B(r13, r12, "feedback_location");
        X.DbU.A1B(r13, r12, "source_type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
        r12.putString("FB_APP_URL_TYPE", "nt_screen");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0102, code lost:
        r12.putString("FB_APP_URL_TYPE", "compass");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0105, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        r12.putString("FB_APP_URL_TYPE", "jobSearch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0109, code lost:
        X.DbU.A1B(r13, r12, "source");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010c, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
        r12.putString("FB_APP_URL_TYPE", "ptx_inquiry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
        r12.putString("FB_APP_URL_TYPE", "gemstone");
        X.DbU.A1B(r13, r12, com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011b, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011c, code lost:
        r12.putString("FB_APP_URL_TYPE", "ptx_cancel_order");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0121, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle AFW(X.AnonymousClass0wW r21, java.lang.String r22) {
        /*
            r20 = this;
            X.0bY r0 = A00
            r1 = r22
            android.net.Uri r13 = X.0cp.A01(r0, r1)
            r19 = 0
            if (r13 == 0) goto L_0x004e
            java.lang.String r1 = r13.getScheme()
            java.lang.String r0 = "fb"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x004e
            android.os.Bundle r12 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r13.getHost()
            if (r1 == 0) goto L_0x004e
            int r0 = r1.hashCode()
            java.lang.String r18 = "ptx_cancel_order"
            java.lang.String r17 = "gemstone"
            java.lang.String r15 = "ptx_inquiry"
            java.lang.String r14 = "jobSearch"
            java.lang.String r11 = "compass"
            java.lang.String r10 = "nt_screen"
            java.lang.String r9 = "mini_feed"
            java.lang.String r8 = "marketplace"
            java.lang.String r7 = "feed"
            java.lang.String r6 = "marketplace_home"
            java.lang.String r5 = "favorites_feed"
            java.lang.String r4 = "groups"
            java.lang.String r3 = "donate"
            java.lang.String r2 = "recent_feed"
            switch(r0) {
                case -2023155454: goto L_0x004f;
                case -1326167441: goto L_0x0056;
                case -1237460524: goto L_0x005d;
                case -866446714: goto L_0x0064;
                case -845292973: goto L_0x006b;
                case 3138974: goto L_0x0072;
                case 300911179: goto L_0x0079;
                case 805542022: goto L_0x0080;
                case 851821829: goto L_0x0087;
                case 950484242: goto L_0x008e;
                case 1115319237: goto L_0x0095;
                case 1451995004: goto L_0x009c;
                case 1794744950: goto L_0x00a3;
                case 1905850548: goto L_0x00ac;
                case 2031452069: goto L_0x00b5;
                default: goto L_0x0045;
            }
        L_0x0045:
            r16 = -1
        L_0x0047:
            java.lang.String r0 = "source"
            java.lang.String r1 = "FB_APP_URL_TYPE"
            switch(r16) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00d9;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00e1;
                case 8: goto L_0x00fe;
                case 9: goto L_0x0102;
                case 10: goto L_0x0106;
                case 11: goto L_0x010d;
                case 12: goto L_0x0111;
                case 13: goto L_0x011c;
                case 14: goto L_0x0106;
                default: goto L_0x004e;
            }
        L_0x004e:
            return r19
        L_0x004f:
            boolean r0 = r1.equals(r2)
            r16 = 0
            goto L_0x00bd
        L_0x0056:
            boolean r0 = r1.equals(r3)
            r16 = 1
            goto L_0x00bd
        L_0x005d:
            boolean r0 = r1.equals(r4)
            r16 = 2
            goto L_0x00bd
        L_0x0064:
            boolean r0 = r1.equals(r5)
            r16 = 3
            goto L_0x00bd
        L_0x006b:
            boolean r0 = r1.equals(r6)
            r16 = 4
            goto L_0x00bd
        L_0x0072:
            boolean r0 = r1.equals(r7)
            r16 = 5
            goto L_0x00bd
        L_0x0079:
            boolean r0 = r1.equals(r8)
            r16 = 6
            goto L_0x00bd
        L_0x0080:
            boolean r0 = r1.equals(r9)
            r16 = 7
            goto L_0x00bd
        L_0x0087:
            boolean r0 = r1.equals(r10)
            r16 = 8
            goto L_0x00bd
        L_0x008e:
            boolean r0 = r1.equals(r11)
            r16 = 9
            goto L_0x00bd
        L_0x0095:
            boolean r0 = r1.equals(r14)
            r16 = 10
            goto L_0x00bd
        L_0x009c:
            boolean r0 = r1.equals(r15)
            r16 = 11
            goto L_0x00bd
        L_0x00a3:
            r0 = r17
            boolean r0 = r1.equals(r0)
            r16 = 12
            goto L_0x00bd
        L_0x00ac:
            r0 = r18
            boolean r0 = r1.equals(r0)
            r16 = 13
            goto L_0x00bd
        L_0x00b5:
            java.lang.String r0 = "jobsearch"
            boolean r0 = r1.equals(r0)
            r16 = 14
        L_0x00bd:
            if (r0 != 0) goto L_0x0047
            goto L_0x0045
        L_0x00c0:
            r12.putString(r1, r2)
            return r12
        L_0x00c4:
            r12.putString(r1, r3)
            java.lang.String r0 = "fundraiser_campaign_id"
            X.DbU.A1B(r13, r12, r0)
            return r12
        L_0x00cd:
            r12.putString(r1, r4)
            goto L_0x0109
        L_0x00d1:
            r12.putString(r1, r5)
            return r12
        L_0x00d5:
            r12.putString(r1, r6)
            return r12
        L_0x00d9:
            r12.putString(r1, r7)
            return r12
        L_0x00dd:
            r12.putString(r1, r8)
            return r12
        L_0x00e1:
            r12.putString(r1, r9)
            java.lang.String r0 = "token"
            X.DbU.A1B(r13, r12, r0)
            java.lang.String r0 = "title"
            X.DbU.A1B(r13, r12, r0)
            java.lang.String r0 = "render_location"
            X.DbU.A1B(r13, r12, r0)
            java.lang.String r0 = "feedback_location"
            X.DbU.A1B(r13, r12, r0)
            java.lang.String r0 = "source_type"
            X.DbU.A1B(r13, r12, r0)
            return r12
        L_0x00fe:
            r12.putString(r1, r10)
            return r12
        L_0x0102:
            r12.putString(r1, r11)
            return r12
        L_0x0106:
            r12.putString(r1, r14)
        L_0x0109:
            X.DbU.A1B(r13, r12, r0)
            return r12
        L_0x010d:
            r12.putString(r1, r15)
            return r12
        L_0x0111:
            r0 = r17
            r12.putString(r1, r0)
            java.lang.String r0 = "entry_point"
            X.DbU.A1B(r13, r12, r0)
            return r12
        L_0x011c:
            r0 = r18
            r12.putString(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51014Fn5.AFW(X.0wW, java.lang.String):android.os.Bundle");
    }
}
