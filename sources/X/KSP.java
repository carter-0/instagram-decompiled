package X;

import com.instagram.android.R;

public final class KSP extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;

    public KSP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass5Gv A00(AnonymousClass5Gt r1, Object obj, int i) {
        r1.A04 = new KSP(obj, i);
        return r1.A00();
    }

    public final boolean Ds8(AnonymousClass5Gv r6) {
        switch (this.A00) {
            case 2:
                LYV lyv = (LYV) this.A01;
                L0G l0g = ((C60406Jkz) lyv.A01).A04;
                String A0R = 002.A0R("@", ((C60516Jmn) lyv.A02).A05);
                if (A0R == null) {
                    return true;
                }
                C61738KKd kKd = l0g.A00;
                AnonymousClass87H r1 = kKd.A0C;
                r1.A0H(kKd.A02);
                r1.A0I(A0R);
                C61738KKd.A02(kKd, A0R);
                return true;
            case 3:
                C65048LmS lmS = (C65048LmS) this.A01;
                K6T k6t = new K6T();
                k6t.A01 = new C64997Lla(lmS);
                C331127Pr A0W = DbS.A0W(lmS.A0B);
                A0W.A06 = AnonymousClass7TF.A03(lmS.A09, R.attr.igds_color_dimmer);
                A0W.A0T = k6t;
                A0W.A0k = true;
                DbS.A1S(A0W, true);
                A0W.A00().A02(lmS.A08, k6t);
                return false;
            default:
                return super.Ds8(r6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00f9, code lost:
        X.C368288sN.A00(r6, r3, r4, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0113, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0116, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012b, code lost:
        r3.E5c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x012e, code lost:
        r3.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0131, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0143, code lost:
        X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0146, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0084, code lost:
        r3.E5Z(r1, X.DbT.A00(r0, r1) + 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsH(X.AnonymousClass5Gv r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0132;
                case 1: goto L_0x0117;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x010f;
                case 5: goto L_0x00fd;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00af;
                case 9: goto L_0x0096;
                case 10: goto L_0x008f;
                case 11: goto L_0x0076;
                case 12: goto L_0x002c;
                case 13: goto L_0x001a;
                case 14: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.DsH(r10)
            return
        L_0x0009:
            java.lang.Object r0 = r9.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.0xa r0 = X.AnonymousClass7TE.A0q(r0)
            X.0xY r3 = r0.AR4()
            java.lang.String r1 = "reel_dashboard_add_to_story_nux_seen_count"
            goto L_0x0084
        L_0x001a:
            java.lang.Object r0 = r9.A01
            X.L58 r0 = (X.L58) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.0xY r3 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r1 = "has_shown_discount_auto_tag_nux"
            r0 = 1
            r3.E5T(r1, r0)
            goto L_0x012e
        L_0x002c:
            java.lang.Object r5 = r9.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.0xa r1 = X.AnonymousClass7TE.A0q(r5)
            X.0xY r0 = r1.AR4()
            java.lang.String r8 = "fb_feed_crossposting_toggle_tooltip_show_times"
            r7 = 0
            X.AnonymousClass7TG.A1L(r0, r1, r8, r7)
            X.1Av r2 = X.1Au.A00(r5)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A0f(r0)
            X.8jd r1 = X.C363388je.A00(r5)
            r0 = 2190(0x88e, float:3.069E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.Dbb.A1Z(r1, r0)
            X.818 r6 = X.AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP
            X.819 r4 = X.AnonymousClass819.TOOLTIP_AUTOSHARE_FEED
            X.8sM r3 = X.C368278sM.VIEW
            X.81A r2 = X.JTO.A0O()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A09(r0)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r5)
            int r0 = r0.getInt(r8, r7)
            long r0 = (long) r0
            X.JTT.A1C(r2, r0)
            goto L_0x00f9
        L_0x0076:
            java.lang.Object r0 = r9.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.0xa r0 = X.AnonymousClass7TE.A0q(r0)
            X.0xY r3 = r0.AR4()
            java.lang.String r1 = "fb_feed_crossposting_advanced_settings_tooltip"
        L_0x0084:
            int r0 = X.DbT.A00(r0, r1)
            int r0 = r0 + 1
            r3.E5Z(r1, r0)
            goto L_0x012e
        L_0x008f:
            java.lang.Object r0 = r9.A01
            X.LuC r0 = (X.C65488LuC) r0
            X.0sa r0 = r0.A0A
            goto L_0x0113
        L_0x0096:
            java.lang.Object r0 = r9.A01
            X.L1V r0 = (X.L1V) r0
            X.6jB r0 = r0.A00
            X.0xa r3 = r0.A01
            java.lang.String r1 = "exclusive_post_creation_tooltip_count"
            r0 = 0
            X.JTS.A1S(r3, r1, r0)
            long r1 = java.lang.System.currentTimeMillis()
            X.0xY r3 = r3.AR4()
            java.lang.String r0 = "exclusive_post_creation_tooltip_timestamp"
            goto L_0x012b
        L_0x00af:
            java.lang.Object r0 = r9.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r4 = X.1Au.A00(r0)
            r3 = 1
            X.0s0 r2 = r4.A33
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 154(0x9a, float:2.16E-43)
            goto L_0x0143
        L_0x00c0:
            java.lang.Object r0 = r9.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r4 = X.1Au.A00(r0)
            r3 = 1
            X.0s0 r2 = r4.A2w
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 153(0x99, float:2.14E-43)
            goto L_0x0143
        L_0x00d0:
            java.lang.Object r0 = r9.A01
            X.LMT r0 = (X.LMT) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            X.2D6 r1 = X.2D5.A00(r5)
            r0 = 1
            r1.A08(r0)
            X.8jd r1 = X.C363388je.A00(r5)
            java.lang.String r0 = "ClipsShareSheetTooltipManager"
            boolean r0 = X.Dbb.A1Z(r1, r0)
            X.818 r6 = X.AnonymousClass818.IG_REELS_COMPOSER
            X.819 r4 = X.AnonymousClass819.TOOLTIP_SHARE_SHEET_CCP_REELS
            X.8sM r3 = X.C368278sM.VIEW
            X.81A r2 = X.JTO.A0O()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A09(r0)
        L_0x00f9:
            X.C368288sN.A00(r6, r3, r4, r2, r5)
            return
        L_0x00fd:
            java.lang.Object r0 = r9.A01
            X.Loa r0 = (X.C65171Loa) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.1Av r4 = X.1Au.A00(r0)
            r3 = 1
            X.0s0 r2 = r4.A1F
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 183(0xb7, float:2.56E-43)
            goto L_0x0143
        L_0x010f:
            java.lang.Object r0 = r9.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x0113:
            r0.invoke()
            return
        L_0x0117:
            java.lang.Object r0 = r9.A01
            X.JWe r0 = (X.C59745JWe) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.1Av r0 = X.1Au.A00(r0)
            long r1 = java.lang.System.currentTimeMillis()
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "smart_albums_tooltip_impression_count"
        L_0x012b:
            r3.E5c(r0, r1)
        L_0x012e:
            r3.apply()
            return
        L_0x0132:
            java.lang.Object r0 = r9.A01
            X.LWg r0 = (X.LWg) r0
            com.instagram.common.session.UserSession r0 = r0.A0I
            X.1Av r4 = X.1Au.A00(r0)
            r3 = 1
            X.0s0 r2 = r4.A45
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 104(0x68, float:1.46E-43)
        L_0x0143:
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KSP.DsH(X.5Gv):void");
    }
}
