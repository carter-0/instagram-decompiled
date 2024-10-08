package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;
import com.instagram.share.facebook.ReelsShareToFacebookUtils$toggleXarAllReels$1;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8qV  reason: invalid class name and case insensitive filesystem */
public final class C367288qV {
    public static final CallerContext A00 = CallerContext.A01("ReelsShareToFacebookUtils");
    public static final C367288qV A01 = new Object();

    public static final long A00(UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 0);
        boolean A02 = C363388je.A02(C363388je.A00(userSession).A00(A00));
        0xa r3 = 2D5.A00(userSession).A04;
        if (A02) {
            str = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING_LAST_CHANGED_MS";
        } else {
            str = "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS";
        }
        return r3.getLong(str, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C60951Ju9 A01(com.facebook.common.callercontext.CallerContext r13, com.instagram.common.session.UserSession r14) {
        /*
            r4 = 0
            X.0qQ.A0B(r14, r4)
            r6 = 1
            X.8jd r0 = X.C363388je.A00(r14)
            X.5wF r2 = r0.A00(r13)
            X.5wG r7 = r2.A00
            r8 = 0
            if (r7 == 0) goto L_0x003f
            java.lang.Class<X.615> r5 = X.AnonymousClass615.class
            r3 = 2
            java.lang.String r1 = "fb_reels_privacy_setting_service_data"
            r0 = 580306095(0x2296c4af, float:4.086583E-18)
            X.3lr r3 = r7.getOptionalTreeField(r3, r1, r5, r0)
        L_0x001e:
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0049
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0049
            boolean r0 = X.C363388je.A02(r2)
            if (r0 == 0) goto L_0x0041
            com.instagram.share.facebook.model.FBReelsAudienceType r10 = com.instagram.share.facebook.model.FBReelsAudienceType.A08
            java.lang.String r12 = r2.A03
            java.lang.String r13 = r2.A04
            java.lang.String r14 = r2.A05
            r9 = 0
            java.lang.String r11 = ""
            X.Ju9 r8 = new X.Ju9
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x003f:
            r3 = r8
            goto L_0x001e
        L_0x0041:
            java.lang.String r1 = "ReelsShareToFacebookUtils"
            java.lang.String r0 = "(CrosspostingAccountLinkingManager) getFbReelsPrivacyInfo() returns null"
            X.0KC.A0C(r1, r0)
            return r8
        L_0x0049:
            if (r3 == 0) goto L_0x0057
            r0 = 3152(0xc50, float:4.417E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r10 = r3.getOptionalStringField(r6, r0)
            if (r10 != 0) goto L_0x0085
        L_0x0057:
            java.lang.String r10 = ""
            if (r3 != 0) goto L_0x0085
            r1 = r8
        L_0x005c:
            java.util.Map r0 = com.instagram.share.facebook.model.FBReelsAudienceType.A01
            java.lang.Object r9 = r0.get(r1)
            com.instagram.share.facebook.model.FBReelsAudienceType r9 = (com.instagram.share.facebook.model.FBReelsAudienceType) r9
            if (r9 != 0) goto L_0x0068
            com.instagram.share.facebook.model.FBReelsAudienceType r9 = com.instagram.share.facebook.model.FBReelsAudienceType.A07
        L_0x0068:
            java.lang.String r11 = r2.A03
            java.lang.String r12 = r2.A04
            java.lang.String r13 = r2.A05
            if (r3 == 0) goto L_0x007f
            X.Kin r2 = X.C62616Kin.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            r0 = 767(0x2ff, float:1.075E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Enum r8 = r3.getOptionalEnumField(r1, r0, r2)
            X.Kin r8 = (X.C62616Kin) r8
        L_0x007f:
            X.Ju9 r7 = new X.Ju9
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0085:
            X.XRN r1 = X.XRN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 2353(0x931, float:3.297E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Enum r1 = r3.getOptionalEnumField(r4, r0, r1)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367288qV.A01(com.facebook.common.callercontext.CallerContext, com.instagram.common.session.UserSession):X.Ju9");
    }

    public static final void A02(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        AnonymousClass1Nd.A00(userSession).A05(new C50275FWg(AnonymousClass05K.A01, z, z));
    }

    public static final boolean A04(BBV bbv, UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 0);
        if (!C363378jd.A08.A04(A00, userSession)) {
            if (bbv != null) {
                str = "NO_LINKED_FACEBOOK_ACCOUNT";
            }
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36315709424668146L)) {
            if (bbv != null) {
                str = "USER_IN_NO_SHARING_GK";
            }
            return false;
        } else if (182.A06(r2, userSession, 36314571257940663L)) {
            return true;
        } else {
            if (bbv != null) {
                str = "CCP_LAUNCHER_IS_ENABLED_IS_FALSE";
            }
            return false;
        }
        bbv.A00 = str;
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        if (!C363378jd.A08.A04(A00, userSession)) {
            return false;
        }
        0Tu r3 = 0Tu.A05;
        if (!182.A06(r3, userSession, 36315709424668146L)) {
            return 182.A06(r3, userSession, 36315709424864755L);
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 0);
        FbAutoCrossPostingSettingManager A002 = C363028iv.A00(userSession);
        if (A002.isCrossPostingSettingsPlatformizationReadEnabled()) {
            return A002.getDataProvider().Bl3();
        }
        boolean A02 = C363388je.A02(C363388je.A00(userSession).A00(A00));
        0xa r1 = 2D5.A00(userSession).A04;
        if (A02) {
            str = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING";
        } else {
            str = "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED";
        }
        return r1.getBoolean(str, false);
    }

    public static final boolean A07(UserSession userSession) {
        if (!C347167wN.A00.A00(userSession, true) || 2D5.A00(userSession).A04.getBoolean("PREFERENCE_IS_REELS_XAR_UNAVAILABLE", false) || (new CXPNoticeStateRepository(userSession, AnonymousClass05K.A00).A00(2DQ.A0K).A00 > 0 && 182.A06(0Tu.A05, userSession, 2342161394403252328L))) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!C363378jd.A08.A04(A00, userSession)) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36321576350393889L) || !182.A06(r2, userSession, 36322452522936512L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0A(com.instagram.common.session.UserSession r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            X.8jd r1 = X.C363388je.A00(r6)
            com.facebook.common.callercontext.CallerContext r0 = A00
            X.5wF r3 = r1.A00(r0)
            java.lang.Integer r0 = r3.A01
            java.lang.String r4 = X.C378169Ot.A01(r0)
            X.0wc r2 = X.AnonymousClass0kN.A02(r6)
            java.lang.String r1 = "ig_auto_xposting_to_fb_setting"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            java.lang.String r1 = "ig_reels_share_to_fb"
            java.lang.String r0 = "flow_name"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "client_setting_updated"
            java.lang.String r0 = "event_name"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "xposting_setting_location"
            r2.AAJ(r0, r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "client_setting"
            r2.A7p(r0, r1)
            X.16V r0 = X.AnonymousClass0eD.A01(r6)
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "account_type"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "destination_account_linkage_type"
            r2.AAJ(r0, r4)
            r2.Cgf()
            X.2D6 r2 = X.2D5.A00(r6)
            boolean r0 = X.C363388je.A02(r3)
            X.0xa r1 = r2.A04
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING"
            r5 = 0
            boolean r4 = r1.getBoolean(r0, r5)
            r2.A06(r8)
            if (r9 == 0) goto L_0x007d
            X.0xY r3 = r1.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING_LAST_CHANGED_MS"
        L_0x0077:
            r3.E5c(r0, r1)
            r3.apply()
        L_0x007d:
            if (r4 == r8) goto L_0x009c
            X.2D6 r0 = X.2D5.A00(r6)
            X.0xa r1 = r0.A04
            java.lang.String r0 = "PREFERENCE_SETTINGS_AUTO_XPOSTING_DEBUG_TOAST_ENABLED"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x009c
            java.lang.String r2 = "[DEBUG ONLY] Attempting to "
            if (r8 == 0) goto L_0x009d
            java.lang.String r1 = "enable"
        L_0x0093:
            java.lang.String r0 = " reels auto-crossposting"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            X.C59689JTv.A0G(r0)
        L_0x009c:
            return r4
        L_0x009d:
            java.lang.String r1 = "disable"
            goto L_0x0093
        L_0x00a0:
            java.lang.String r0 = "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"
            r5 = 0
            boolean r4 = r1.getBoolean(r0, r5)
            r2.A09(r8)
            if (r9 == 0) goto L_0x007d
            X.0xY r3 = r1.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS"
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367288qV.A0A(com.instagram.common.session.UserSession, java.lang.String, boolean, boolean):boolean");
    }

    public final void A0B(AnonymousClass0iw r12, UserSession userSession, String str, C62320sa r15, boolean z, boolean z2) {
        0qQ.A0B(str, 2);
        UserSession userSession2 = userSession;
        2D6 A002 = 2D5.A00(userSession);
        if (A002.A04.getBoolean("PREFERENCE_IS_REELS_XAR_UNAVAILABLE", false)) {
            0KC.A0C("ReelsShareToFacebookUtils", "toggleXarAllReels: xar is unavailable");
            return;
        }
        boolean A0C = A002.A0C();
        A0A(userSession, str, false, false);
        boolean z3 = z;
        A002.A0A(z3);
        1Ng A003 = AnonymousClass1Nd.A00(userSession);
        Integer num = AnonymousClass05K.A00;
        A003.A05(new C50275FWg(num, z3, false));
        if (z2) {
            AnonymousClass19S A02 = AnonymousClass1HX.A02(1677891942, 3);
            1Eo.A03(num, 19B.A00, new ReelsShareToFacebookUtils$toggleXarAllReels$1(r12, userSession2, A002, (AnonymousClass4D7) null, r15, z3, A0C), A02);
        }
    }

    public final void A0C(UserSession userSession, String str, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        2D6 A002 = 2D5.A00(userSession);
        A002.A0A(false);
        0xa r5 = A002.A04;
        0xY AR4 = r5.AR4();
        AR4.E5c("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", r5.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0) - 1);
        AR4.apply();
        boolean A0A = A0A(userSession, str, z, true);
        1Ng A003 = AnonymousClass1Nd.A00(userSession);
        Integer num = AnonymousClass05K.A01;
        A003.A05(new C50275FWg(num, z, z));
        if (!z2) {
            return;
        }
        if (C363028iv.A00(userSession).isCrossPostingSettingsPlatformizationWriteEnabled()) {
            C363028iv.A00(userSession).updateAutoCrossPostingSetting(new N4R(0se.A0M(new 0eP(C390849rw.REELS, Boolean.valueOf(z)))), (AnonymousClass8k0) null);
            return;
        }
        C73672Phl phl = new C73672Phl(userSession, str, 6, A0A);
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A004 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
        A004.AAJ("flow_name", "ig_reels_share_to_fb");
        A004.AAJ(TraceFieldType.AdhocEventName, "server_setting_update_attempt");
        A004.AAJ("xposting_setting_location", "reels");
        A004.A7p("user_attempted_client_setting", Boolean.valueOf(z));
        A004.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A004.AAJ("destination_account_linkage_type", (String) null);
        A004.Cgf();
        C299935wF A005 = C363388je.A00(userSession).A00(A00);
        if (C363388je.A02(A005)) {
            C41641Axt axt = C41641Axt.A00;
            C59780JXz jXz = C59780JXz.A00;
            List singletonList = Collections.singletonList(new C39876ACx("REELS", z));
            0qQ.A07(singletonList);
            jXz.A01(userSession, new AfP(userSession, axt, phl, z), singletonList);
            return;
        }
        Integer num2 = A005.A02;
        if (num2 == num || num2 == AnonymousClass05K.A0C) {
            C41642Axu axu = C41642Axu.A00;
            C64105LNd lNd = C64105LNd.A00;
            List singletonList2 = Collections.singletonList(new C39876ACx("REELS", z));
            0qQ.A07(singletonList2);
            lNd.A00(userSession, new AfL(userSession, axu, phl, z), singletonList2);
            return;
        }
        phl.invoke();
    }

    public final boolean A0F(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!C363558jv.A00(userSession) || A06(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UserSession userSession) {
        if (!C363378jd.A08.A04(A00, userSession)) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36321576350459426L) || !182.A06(r2, userSession, 36326618641741701L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A03(BBV bbv, UserSession userSession) {
        String str;
        boolean A06 = A06(userSession);
        boolean A0C = 2D5.A00(userSession).A0C();
        if (A06 && A0C) {
            0wb.A03("ReelsShareToFacebook", "<shouldShowShareToFacebook> both ccp && xar are true");
        }
        if (!A06) {
            if (A0C) {
                if (bbv != null) {
                    str = "XAR_IS_ENABLED_ON_SERVER";
                }
                return false;
            } else if (!A0E(userSession)) {
                if (bbv != null) {
                    str = "XAR_TOGGLE_IS_MORE_RECENT_THAN_CCP";
                }
                return false;
            }
            bbv.A00 = str;
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (A05(r7) != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D(X.BBV r6, com.instagram.common.session.UserSession r7, boolean r8) {
        /*
            r5 = this;
            boolean r2 = A04(r6, r7)
            if (r8 == 0) goto L_0x0010
            if (r2 != 0) goto L_0x000f
            boolean r0 = A05(r7)
            r2 = 0
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            boolean r1 = A07(r7)
            boolean r0 = r5.A03(r6, r7)
            if (r2 == 0) goto L_0x0037
            if (r0 != 0) goto L_0x001e
            if (r1 != 0) goto L_0x0037
        L_0x001e:
            r4 = 1
        L_0x001f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r3, r2, r1, r0}
            X.0sr.A1P(r0)
            return r4
        L_0x0037:
            r4 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367288qV.A0D(X.BBV, com.instagram.common.session.UserSession, boolean):boolean");
    }

    public final boolean A0E(UserSession userSession) {
        2D6 A002 = 2D5.A00(userSession);
        if (A002.A0C()) {
            return false;
        }
        long A003 = A00(userSession);
        0xa r8 = A002.A04;
        if (A003 > r8.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0) || System.currentTimeMillis() - r8.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0) > 182.A01(0Tu.A05, userSession, 36603274664612758L) * 86400000) {
            return true;
        }
        return false;
    }

    public final boolean A0G(UserSession userSession) {
        if (!A05(userSession)) {
            return false;
        }
        if (A03((BBV) null, userSession) || !A07(userSession)) {
            return true;
        }
        return false;
    }
}
