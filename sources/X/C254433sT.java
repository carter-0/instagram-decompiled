package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3sT  reason: invalid class name and case insensitive filesystem */
public final class C254433sT {
    public static final C254433sT A00 = new Object();

    public static final void A02(UserSession userSession, C232852uY r11, 1Xj r12, AnonymousClass4DU r13, Boolean bool, Boolean bool2, int i, int i2) {
        0jB r6;
        C294175lz r3;
        Long valueOf;
        Long l;
        String str;
        long j;
        String str2;
        String str3;
        C263944Ny r1;
        Boolean bool3;
        List list;
        Map map;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        String str11;
        Long l2;
        String str12;
        String str13;
        String str14;
        Long l3;
        long j2;
        String str15;
        Long l4;
        String str16;
        Long l5;
        Boolean bool4;
        String str17;
        String str18;
        Long l6;
        HashMap hashMap;
        String str19;
        String str20;
        String Bmx;
        Map map2;
        String id;
        0qQ.A0B(r11, 5);
        0wc A002 = AnonymousClass0kN.A00(r13, 0kJ.A03, userSession);
        0Aj A003 = A002.A00(A002.A00, "instagram_organic_sub_impression");
        if (A003.isSampled()) {
            Long l7 = null;
            if (r13 instanceof C232682uF) {
                r6 = ((C232682uF) r13).E4l(r12);
            } else {
                r6 = null;
            }
            ArrayList A3K = r12.A3K(true);
            if (A3K == null || !(!A3K.isEmpty())) {
                r3 = null;
            } else {
                r3 = C294165ly.A04(r12);
            }
            A003.AAJ("module_name", r13.getModuleName());
            A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A003.AAJ("m_pk", r12.getId());
            A003.A9F("m_t", Long.valueOf((long) r12.BR7().A00));
            int i3 = i;
            if (i3 == -1) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf((long) i3);
            }
            A003.A9F("m_ix", valueOf);
            User A2A = r12.A2A(userSession);
            if (A2A != null) {
                l = 00y.A0n(10, A2A.getId());
            } else {
                l = null;
            }
            A003.A9F("a_pk", l);
            A003.AAJ(C21058XCk.A01(21, 10, 4), C254443sU.A0A(r6, r11));
            A003.A9F("m_ts", Long.valueOf(r12.A1A()));
            if (r6 != null) {
                str = (String) r6.A01(C271774jZ.A6S);
            } else {
                str = null;
            }
            A003.AAJ("parent_m_pk", str);
            int i4 = i2;
            A003.A9F("carousel_m_t", C254443sU.A07(r12, i4));
            A003.AAJ("inventory_source", r12.A0C.BIl());
            A003.AAJ("delivery_flags", C243413Yr.A00(r12.A0e));
            if (AnonymousClass1GD.A03()) {
                j = 1;
            } else {
                j = 0;
            }
            A003.A9F("is_dark_mode", Long.valueOf(j));
            if (r6 != null) {
                str2 = (String) r6.A01(C271774jZ.A9i);
            } else {
                str2 = null;
            }
            A003.AAJ("viewer_session_id", str2);
            A003.AAJ("tracking_token", C254443sU.A0E(userSession, r12, r13));
            A003.AAJ("ranking_info_token", r12.A0C.getLoggingInfoToken());
            A003.AAJ("mezql_token", r12.A0C.getMezqlToken());
            if (r6 != null) {
                str3 = (String) r6.A01(C14073TpN.A00);
            } else {
                str3 = null;
            }
            A003.AAJ("search_session_id", str3);
            A003.A9F("carousel_index", C254443sU.A06(r12, i4));
            A003.AAJ("carousel_media_id", C254443sU.A0H(r12, i4));
            A003.AAJ("carousel_cover_media_id", C254443sU.A0G(r12, i4));
            A003.A9F("carousel_size", C254443sU.A08(r12, i4));
            if (r3 != null) {
                r1 = r3.A00;
            } else {
                r1 = null;
            }
            A003.AAE(r1, "merchant_id");
            if (r3 != null) {
                bool3 = r3.A01;
            } else {
                bool3 = null;
            }
            A003.A7p("is_checkout_enabled", bool3);
            if (r3 != null) {
                list = r3.A03;
            } else {
                list = null;
            }
            A003.AAe("product_ids", list);
            if (r3 != null) {
                map = r3.A08;
            } else {
                map = null;
            }
            A003.A9H("product_merchant_ids", map);
            if (r6 != null) {
                str4 = (String) r6.A01(C271774jZ.A9D);
            } else {
                str4 = null;
            }
            A003.AAJ("topic_cluster_id", str4);
            if (r6 != null) {
                str5 = (String) r6.A01(C271774jZ.A9F);
            } else {
                str5 = null;
            }
            A003.AAJ("topic_cluster_title", str5);
            if (r6 != null) {
                str6 = (String) r6.A01(C271774jZ.A9G);
            } else {
                str6 = null;
            }
            A003.AAJ("topic_cluster_type", str6);
            if (r6 != null) {
                str7 = (String) r6.A01(C271774jZ.A9C);
            } else {
                str7 = null;
            }
            A003.AAJ("topic_cluster_debug_info", str7);
            if (r6 != null) {
                str8 = (String) r6.A01(C297705sC.A00);
            } else {
                str8 = null;
            }
            A003.AAJ("entity_follow_status", str8);
            A003.A9F("entity_id", C254443sU.A02(r6));
            if (r6 != null) {
                str9 = (String) r6.A01(C297705sC.A02);
            } else {
                str9 = null;
            }
            A003.AAJ("entity_name", str9);
            if (r6 != null) {
                str10 = (String) r6.A01(C297705sC.A06);
            } else {
                str10 = null;
            }
            A003.AAJ("entity_type", str10);
            A003.A9F("entity_page_id", C254443sU.A03(r6));
            A003.AAJ("entity_page_name", C254443sU.A09(r6));
            A003.A7p("is_eof", r12.A0C.CSj());
            A003.AAJ("feed_request_id", r12.A0R);
            if (r12.A5Y()) {
                z = true;
            } else {
                z = null;
            }
            A003.A7p("is_igtv", z);
            A003.AAJ("source_of_action", r13.getModuleName());
            if (r6 != null) {
                str11 = (String) r6.A01(C271774jZ.A1C);
            } else {
                str11 = null;
            }
            A003.AAJ("chaining_session_id", str11);
            if (r6 != null) {
                l2 = (Long) r6.A01(C271774jZ.A1A);
            } else {
                l2 = null;
            }
            A003.A9F("chaining_position", l2);
            A003.AAJ("last_navigation_module", C71342cb.A00(userSession).A0D);
            if (r6 != null) {
                str12 = (String) r6.A01(C52240GKh.A00);
            } else {
                str12 = null;
            }
            A003.AAJ("collection_id", str12);
            if (r6 != null) {
                str13 = (String) r6.A01(C52240GKh.A01);
            } else {
                str13 = null;
            }
            A003.AAJ("collection_name", str13);
            A003.A9F("hashtag_id", C254443sU.A04(r6, r12));
            A003.AAJ("hashtag_name", C254443sU.A0C(r6, r12));
            if (r6 != null) {
                str14 = (String) r6.A01(C298085sr.A00);
            } else {
                str14 = null;
            }
            A003.AAJ("hashtag_feed_type", str14);
            A003.A7p("is_app_backgrounded", Boolean.valueOf(14i.A08()));
            if (r12.A4z()) {
                l3 = Long.valueOf((long) r12.A6i().length);
            } else {
                l3 = null;
            }
            A003.A9F("sponsor_tag_count", l3);
            A003.AAJ("action", C254443sU.A0F(r12));
            A003.AAJ("follow_status", C254443sU.A0D(userSession, r12));
            A003.A8D("elapsed_time_since_last_item", Double.valueOf(-1.0d));
            A003.A7p("is_acp_delivered", false);
            if (C71342cb.A00(userSession).A03 != null) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            A003.A9F("nav_in_transit", Long.valueOf(j2));
            A003.A9F("imp_logger_ver", 24L);
            if (r6 != null) {
                str15 = (String) r6.A01(AnonymousClass5m1.A00);
            } else {
                str15 = null;
            }
            A003.AAJ("media_thumbnail_section", str15);
            A003.AAe("tagged_user_ids", C254443sU.A0J(r12));
            String A0I = C254443sU.A0I(r12, i4);
            if (A0I != null) {
                l4 = 00y.A0n(10, A0I);
            } else {
                l4 = null;
            }
            A003.A9F("main_feed_carousel_starting_media_id", l4);
            A003.AAJ("connection_id", r12.A0C.getConnectionId());
            if (r6 != null) {
                str16 = (String) r6.A01(C271774jZ.A2R);
            } else {
                str16 = null;
            }
            A003.AAJ("endpoint_type", str16);
            A003.AAJ("hashtag_follow_status", C254443sU.A0B(r6, r12));
            if (r6 != null) {
                l5 = (Long) r6.A01(AnonymousClass5m1.A01);
            } else {
                l5 = null;
            }
            A003.A9F("tab_index", l5);
            if (r3 != null) {
                bool4 = Boolean.valueOf(r12.A6X(userSession));
            } else {
                bool4 = null;
            }
            A003.A7p("is_influencer", bool4);
            A003.A9F("top_liker_count", C254443sU.A05(userSession, r12));
            if (r6 != null) {
                str17 = (String) r6.A01(C297705sC.A05);
            } else {
                str17 = null;
            }
            A003.AAJ("entity_page_type", str17);
            if (r6 != null) {
                str18 = (String) r6.A01(C297695sB.A01);
            } else {
                str18 = null;
            }
            A003.AAJ("rank_token", str18);
            A003.A9F("dark_mode_state", Long.valueOf((long) AnonymousClass0xl.A00(C61170le.A00).A00()));
            UpcomingEvent A27 = r12.A27(userSession);
            if (A27 == null || (id = A27.getId()) == null) {
                l6 = null;
            } else {
                l6 = 00y.A0n(10, id);
            }
            A003.A9F("upcoming_event_id", l6);
            A003.A7p("is_merlin_double_logging_enabled", bool2);
            A003.A7p("is_merlin_second_channel_enabled", (Boolean) null);
            if (0qQ.A0K(bool, true)) {
                hashMap = C254453sV.A00(userSession);
            } else {
                hashMap = null;
            }
            A003.A9H("two_measurement_debugging_fields", hashMap);
            C249763kK r0 = r11.A01;
            if (r0 != null) {
                str19 = r0.getSessionId();
            } else {
                str19 = null;
            }
            A003.AAJ("ranking_session_id", str19);
            0bb r5 = new 0bb();
            if (r3 == null || (map2 = r3.A06) == null) {
                str20 = null;
            } else {
                str20 = (String) map2.get("product_collection_id");
            }
            r5.A06("product_collection_id", str20);
            A003.AAK(r5, "collections_logging_info");
            C46300DUd Bmy = r12.A0C.Bmy();
            if (!(Bmy == null || (Bmx = Bmy.Bmx()) == null)) {
                l7 = 00y.A0n(10, Bmx);
            }
            A003.A9F("repost_id", l7);
            A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A003.AAJ("device_fold_orientation", C254483sY.A00);
            A003.AAJ("device_fold_state", C254493sZ.A00);
            A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A003.Cgf();
        }
    }

    public static final void A00(Context context, C254523sc r4, AnonymousClass3W1 r5) {
        C262824Gd r2 = r5.A0j;
        if (r2 != null) {
            r4.A0P(Float.valueOf(0nA.A01(context, (float) r2.A01)), Float.valueOf(0nA.A01(context, (float) r2.A00)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.common.session.UserSession r4, X.C254523sc r5, X.1Xj r6, X.AnonymousClass4DU r7, X.AnonymousClass3W1 r8) {
        /*
            r3 = this;
            android.util.Pair r1 = r8.A04()
            if (r1 == 0) goto L_0x0012
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            r5.A6P = r0
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            r5.A69 = r0
        L_0x0012:
            java.lang.String r1 = r8.A1Q
            java.lang.String r0 = r8.A1M
            if (r1 != 0) goto L_0x012d
            if (r0 != 0) goto L_0x012d
        L_0x001a:
            java.lang.String r1 = r7.getModuleName()
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x003a
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342158624148819378(0x208104dc00020db2, double:4.061867717198358E-152)
            boolean r1 = X.182.A06(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x00b1
        L_0x003a:
            android.util.Pair r1 = r8.A04()
            if (r1 == 0) goto L_0x004c
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            r5.A6E = r0
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            r5.A6D = r0
        L_0x004c:
            android.util.Pair r1 = r8.A03()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x005e
            int r0 = r0.intValue()
            r5.A0D = r0
        L_0x005e:
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x006a
            int r0 = r0.intValue()
            r5.A0C = r0
        L_0x006a:
            java.lang.Integer r0 = r6.A2J()
            if (r0 == 0) goto L_0x0076
            int r0 = r0.intValue()
            r5.A0E = r0
        L_0x0076:
            java.lang.String r1 = r8.A1R
            java.lang.String r0 = r8.A1N
            if (r1 != 0) goto L_0x0115
            if (r0 != 0) goto L_0x0115
        L_0x007e:
            boolean r0 = r8.A2n
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A1k = r0
            boolean r0 = r8.A2m
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A1j = r0
            int r0 = r8.A0a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r8.A0Z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            X.0qQ.A07(r1)
            java.lang.Object r0 = r1.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00a9
            r5.A3F = r0
        L_0x00a9:
            java.lang.Object r0 = r1.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00b1
            r5.A3E = r0
        L_0x00b1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315614935256500(0x8104dc00040db4, double:3.029479344075663E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00dc
            java.util.List r0 = r6.A3S()
            if (r0 == 0) goto L_0x00c6
            r5.A7h = r0
        L_0x00c6:
            java.util.List r1 = r8.A1i
            java.util.List r0 = r8.A1h
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r0 = r1.first
            java.util.List r0 = (java.util.List) r0
            r5.A7m = r0
            java.lang.Object r0 = r1.second
            java.util.List r0 = (java.util.List) r0
            r5.A7l = r0
        L_0x00dc:
            r0 = 36315614935190963(0x8104dc00030db3, double:3.029479344034217E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0112
            java.util.List r1 = r8.A1i
            java.util.List r0 = r8.A1h
            android.util.Pair r2 = android.util.Pair.create(r1, r0)
            if (r2 == 0) goto L_0x0112
            java.lang.Object r0 = r2.first
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x0113
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0100:
            r5.A2o = r0
            java.lang.Object r0 = r2.second
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0110
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0110:
            r5.A2n = r1
        L_0x0112:
            return
        L_0x0113:
            r0 = r1
            goto L_0x0100
        L_0x0115:
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            if (r1 == 0) goto L_0x007e
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0123
            r5.A52 = r0
        L_0x0123:
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x007e
            r5.A51 = r0
            goto L_0x007e
        L_0x012d:
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            if (r1 == 0) goto L_0x001a
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            r5.A6Q = r0
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            r5.A6A = r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254433sT.A03(com.instagram.common.session.UserSession, X.3sc, X.1Xj, X.4DU, X.3W1):void");
    }

    public static final void A01(UserSession userSession, C232852uY r17, 1Xj r18, AnonymousClass4DU r19, AnonymousClass3W1 r20, Boolean bool, Boolean bool2, Boolean bool3, int i, int i2) {
        0jB r6;
        C294175lz r5;
        List list;
        String str;
        List list2;
        Long l;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l2;
        Boolean bool4;
        Long l3;
        List list3;
        Long valueOf;
        String str6;
        String str7;
        String str8;
        String str9;
        Long l4;
        long j;
        Long l5;
        String str10;
        String str11;
        String str12;
        String str13;
        Long l6;
        long j2;
        Boolean bool5;
        Map map;
        List list4;
        String str14;
        boolean z;
        String str15;
        String str16;
        Long l7;
        ArrayList arrayList2;
        String str17;
        String str18;
        String str19;
        String str20;
        HashMap hashMap;
        Long l8;
        String str21;
        Long l9;
        Long l10;
        String Bmx;
        String str22;
        Map map2;
        String id;
        C263944Ny r0;
        Long A0n;
        C232852uY r15 = r17;
        0qQ.A0B(r15, 5);
        AnonymousClass4DU r14 = r19;
        UserSession userSession2 = userSession;
        0wc A002 = AnonymousClass0kN.A00(r14, 0kJ.A03, userSession2);
        0Aj A003 = A002.A00(A002.A00, "instagram_organic_impression");
        if (A003.isSampled()) {
            0bb r7 = null;
            1Xj r9 = r18;
            if (r14 instanceof C232682uF) {
                r6 = ((C232682uF) r14).E4l(r9);
            } else {
                r6 = null;
            }
            ArrayList A3K = r9.A3K(true);
            if (A3K == null || !(!A3K.isEmpty())) {
                r5 = null;
            } else {
                r5 = C294165ly.A04(r9);
            }
            String A05 = AnonymousClass3YC.A00.A05(r9);
            if (A05 == null || (A0n = 00y.A0n(10, A05)) == null) {
                list = null;
            } else {
                list = Collections.singletonList(A0n);
                0qQ.A07(list);
            }
            List C9Z = r9.A0C.C9Z();
            if (C9Z == null || C9Z.isEmpty() || !AnonymousClass3WS.A07(userSession2)) {
                str = null;
                list2 = null;
            } else {
                str = ((C276074sR) C9Z.get(0)).BKV();
                if (str != null) {
                    list2 = Collections.singletonList(Dd8.CLOSED_CAPTION);
                    0qQ.A07(list2);
                }
                list2 = null;
            }
            A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A003.AAJ("m_pk", r9.getId());
            if (r9.A4z()) {
                l = Long.valueOf((long) r9.A6i().length);
            } else {
                l = null;
            }
            A003.A9F("sponsor_tag_count", l);
            if (r9.A4z()) {
                List<String> A0a = 00k.A0a(03t.A0I(r9.A6i()));
                arrayList = new ArrayList(0Yv.A1E(A0a, 10));
                for (String parseLong : A0a) {
                    arrayList.add(Long.valueOf(Long.parseLong(parseLong)));
                }
            } else {
                arrayList = null;
            }
            A003.AAe("sponsor_tag_ids", arrayList);
            A003.AAJ("tracking_token", C254443sU.A0E(userSession2, r9, r14));
            A003.A9F("m_t", Long.valueOf((long) r9.BR7().A00));
            A003.A9F("hashtag_id", C254443sU.A04(r6, r9));
            A003.AAe("feed_sticker_media_id", (List) null);
            A003.AAJ("inventory_source", r9.A0C.BIl());
            int i3 = i2;
            A003.A9F("carousel_index", C254443sU.A06(r9, i3));
            A003.A7p("is_app_backgrounded", Boolean.valueOf(14i.A08()));
            A003.AAJ("last_navigation_module", C71342cb.A00(userSession2).A0D);
            A003.AAJ("application_state", (String) null);
            A003.AAJ("hashtag_name", C254443sU.A0C(r6, r9));
            if (r6 != null) {
                str2 = (String) r6.A01(C298085sr.A00);
            } else {
                str2 = null;
            }
            A003.AAJ("hashtag_feed_type", str2);
            A003.AAJ("carousel_media_id", C254443sU.A0H(r9, i3));
            A003.AAJ("carousel_cover_media_id", C254443sU.A0G(r9, i3));
            A003.AAJ("reel_id", (String) null);
            A003.AAJ("tray_session_id", (String) null);
            if (r6 != null) {
                str3 = (String) r6.A01(C271774jZ.A9i);
            } else {
                str3 = null;
            }
            A003.AAJ("viewer_session_id", str3);
            C249763kK r02 = r15.A01;
            if (r02 != null) {
                str4 = r02.getSessionId();
            } else {
                str4 = null;
            }
            A003.AAJ("ranking_session_id", str4);
            if (r6 != null) {
                str5 = (String) r6.A01(C271774jZ.A1C);
            } else {
                str5 = null;
            }
            A003.AAJ("chaining_session_id", str5);
            if (r6 != null) {
                l2 = (Long) r6.A01(C271774jZ.A1A);
            } else {
                l2 = null;
            }
            A003.A9F("chaining_position", l2);
            A003.AAJ("action", C254443sU.A0F(r9));
            A003.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
            A003.AAJ("checkout_session_id", (String) null);
            if (r5 != null) {
                bool4 = r5.A01;
            } else {
                bool4 = null;
            }
            A003.A7p("is_checkout_enabled", bool4);
            A003.A7p("can_add_to_bag", (Boolean) null);
            if (r5 == null || (r0 = r5.A00) == null) {
                l3 = null;
            } else {
                l3 = r0.A00;
            }
            A003.A9F("merchant_id", l3);
            A003.AAJ("prior_module", (String) null);
            A003.A9F("product_id", (Long) null);
            if (r5 != null) {
                list3 = r5.A03;
            } else {
                list3 = null;
            }
            A003.AAe("product_ids", list3);
            int i4 = i;
            if (i4 == -1) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf((long) i4);
            }
            A003.A9F("m_ix", valueOf);
            A003.A9F("chaining_seed_media_id", (Long) null);
            A003.A9F("chaining_seed_author_id", (Long) null);
            if (r6 != null) {
                str6 = (String) r6.A01(C271774jZ.A9D);
            } else {
                str6 = null;
            }
            A003.AAJ("topic_cluster_id", str6);
            if (r6 != null) {
                str7 = (String) r6.A01(C271774jZ.A9F);
            } else {
                str7 = null;
            }
            A003.AAJ("topic_cluster_title", str7);
            if (r6 != null) {
                str8 = (String) r6.A01(C271774jZ.A9G);
            } else {
                str8 = null;
            }
            A003.AAJ("topic_cluster_type", str8);
            if (r6 != null) {
                str9 = (String) r6.A01(C271774jZ.A9C);
            } else {
                str9 = null;
            }
            A003.AAJ("topic_cluster_debug_info", str9);
            A003.AAJ("ranking_info_token", r9.A0C.getLoggingInfoToken());
            A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, (String) null);
            A003.A9F("carousel_m_t", C254443sU.A07(r9, i3));
            A003.A9F("carousel_size", C254443sU.A08(r9, i3));
            A003.AAJ("follow_status", C254443sU.A0D(userSession2, r9));
            User A2A = r9.A2A(userSession2);
            if (A2A != null) {
                l4 = 00y.A0n(10, A2A.getId());
            } else {
                l4 = null;
            }
            A003.A9F("a_pk", l4);
            A003.AAJ("source_of_action", r14.getModuleName());
            A003.AAJ(C21058XCk.A01(21, 10, 4), C254443sU.A0A(r6, r15));
            A003.AAJ("delivery_flags", C243413Yr.A00(r9.A0e));
            A003.A8D("elapsed_time_since_last_item", Double.valueOf(-1.0d));
            A003.AAJ("feed_request_id", r9.A0R);
            A003.A9F("imp_logger_ver", 24L);
            A003.A7p("is_acp_delivered", false);
            A003.A7p("is_eof", r9.A0C.CSj());
            A003.A9F("m_ts", Long.valueOf(r9.A1A()));
            if (C71342cb.A00(userSession2).A03 != null) {
                j = 1;
            } else {
                j = 0;
            }
            A003.A9F("nav_in_transit", Long.valueOf(j));
            A003.AAe("tagged_user_ids", C254443sU.A0J(r9));
            String A0I = C254443sU.A0I(r9, i3);
            if (A0I != null) {
                l5 = 00y.A0n(10, A0I);
            } else {
                l5 = null;
            }
            A003.A9F("main_feed_carousel_starting_media_id", l5);
            A003.A7p("is_video_to_carousel", (Boolean) null);
            A003.A9F("reel_position", (Long) null);
            A003.A9F("reel_size", (Long) null);
            A003.A9F("reel_start_position", (Long) null);
            A003.AAJ("reel_type", (String) null);
            A003.A9F("reel_viewer_position", (Long) null);
            A003.A9F("session_reel_counter", (Long) null);
            A003.A9H("sticker_types", (Map) null);
            A003.A8D("time_elapsed", (Double) null);
            A003.A9F("tray_position", (Long) null);
            A003.AAJ("connection_id", r9.A0C.getConnectionId());
            A003.AAJ("mezql_token", r9.A0C.getMezqlToken());
            if (r6 != null) {
                str10 = (String) r6.A01(C271774jZ.A6S);
            } else {
                str10 = null;
            }
            A003.AAJ("parent_m_pk", str10);
            if (r6 != null) {
                str11 = (String) r6.A01(C297705sC.A00);
            } else {
                str11 = null;
            }
            A003.AAJ("entity_follow_status", str11);
            A003.A9F("entity_id", C254443sU.A02(r6));
            if (r6 != null) {
                str12 = (String) r6.A01(C297705sC.A02);
            } else {
                str12 = null;
            }
            A003.AAJ("entity_name", str12);
            if (r6 != null) {
                str13 = (String) r6.A01(C297705sC.A06);
            } else {
                str13 = null;
            }
            A003.AAJ("entity_type", str13);
            A003.AAJ("hashtag_follow_status", C254443sU.A0B(r6, r9));
            if (r6 != null) {
                l6 = (Long) r6.A01(AnonymousClass5m1.A01);
            } else {
                l6 = null;
            }
            A003.A9F("tab_index", l6);
            if (AnonymousClass1GD.A03()) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            A003.A9F("is_dark_mode", Long.valueOf(j2));
            A003.A9F("dark_mode_state", Long.valueOf((long) AnonymousClass0xl.A00(C61170le.A00).A00()));
            if (r5 != null) {
                bool5 = Boolean.valueOf(r9.A6X(userSession2));
            } else {
                bool5 = null;
            }
            A003.A7p("is_influencer", bool5);
            User A2A2 = r9.A2A(userSession2);
            Long l11 = null;
            if (!(r5 == null || A2A2 == null)) {
                l11 = 00y.A0n(10, A2A2.getId());
            }
            A003.A9F("media_owner_id", l11);
            if (r5 != null) {
                map = r5.A08;
            } else {
                map = null;
            }
            A003.A9H("product_merchant_ids", map);
            if (r5 != null) {
                list4 = r5.A02;
            } else {
                list4 = null;
            }
            A003.AAe("drops_product_ids", list4);
            A003.A9F("entity_page_id", C254443sU.A03(r6));
            A003.AAJ("entity_page_name", C254443sU.A09(r6));
            if (r6 != null) {
                str14 = (String) r6.A01(AnonymousClass5m1.A00);
            } else {
                str14 = null;
            }
            A003.AAJ("media_thumbnail_section", str14);
            if (r9.A5Y()) {
                z = true;
            } else {
                z = null;
            }
            A003.A7p("is_igtv", z);
            if (r6 != null) {
                str15 = (String) r6.A01(C52240GKh.A00);
            } else {
                str15 = null;
            }
            A003.AAJ("collection_id", str15);
            if (r6 != null) {
                str16 = (String) r6.A01(C52240GKh.A01);
            } else {
                str16 = null;
            }
            A003.AAJ("collection_name", str16);
            String A07 = C231122qu.A07(userSession2, r9);
            if (A07 != null) {
                l7 = 00y.A0n(10, A07);
            } else {
                l7 = null;
            }
            A003.A9F("ad_id", l7);
            if (r9.CcK()) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = null;
            }
            A003.AAe("media_layout", arrayList2);
            A003.A9F("top_liker_count", C254443sU.A05(userSession2, r9));
            if (r6 != null) {
                str17 = (String) r6.A01(C297695sB.A01);
            } else {
                str17 = null;
            }
            A003.AAJ("rank_token", str17);
            if (r6 != null) {
                str18 = (String) r6.A01(C14073TpN.A00);
            } else {
                str18 = null;
            }
            A003.AAJ("search_session_id", str18);
            if (r6 != null) {
                str19 = (String) r6.A01(C297705sC.A05);
            } else {
                str19 = null;
            }
            A003.AAJ("entity_page_type", str19);
            if (r6 != null) {
                str20 = (String) r6.A01(C271774jZ.A2R);
            } else {
                str20 = null;
            }
            A003.AAJ("endpoint_type", str20);
            A003.A7p("is_second_channel_enabled", bool);
            A003.A7p("is_merlin_second_channel_enabled", (Boolean) null);
            A003.A7p("is_merlin_double_logging_enabled", bool3);
            if (0qQ.A0K(bool2, true)) {
                hashMap = C254453sV.A00(userSession2);
            } else {
                hashMap = null;
            }
            A003.A9H("two_measurement_debugging_fields", hashMap);
            UpcomingEvent A27 = r9.A27(userSession2);
            if (A27 == null || (id = A27.getId()) == null) {
                l8 = null;
            } else {
                l8 = 00y.A0n(10, id);
            }
            A003.A9F("upcoming_event_id", l8);
            0bb r62 = new 0bb();
            if (r5 == null || (map2 = r5.A06) == null) {
                str21 = null;
            } else {
                str21 = (String) map2.get("product_collection_id");
            }
            r62.A06("product_collection_id", str21);
            A003.AAK(r62, "collections_logging_info");
            A003.AAe("discount_ids", list);
            AnonymousClass3W1 r4 = r20;
            String str23 = r4.A1B;
            if (str23 == null || (str22 = (String) 00k.A0O(00l.A0R(str23, new String[]{"_"}, 0), 0)) == null || (l9 = 00y.A0n(10, str22)) == null) {
                C46300DUd Bmy = r9.A0C.Bmy();
                if (Bmy == null || (Bmx = Bmy.Bmx()) == null) {
                    l9 = null;
                } else {
                    l9 = 00y.A0n(10, Bmx);
                }
            }
            A003.A9F("repost_id", l9);
            Integer A2I = r9.A2I();
            if (A2I != null) {
                l10 = Long.valueOf((long) A2I.intValue());
            } else {
                l10 = null;
            }
            A003.A9F("brs_severity", l10);
            DTA Anl = r9.A0C.Anl();
            if (Anl != null) {
                r7 = new 0bb();
                r7.A06("chain_type", Anl.Ans().A00);
                r7.A05("clip_count", Long.valueOf((long) Anl.Anm()));
            }
            A003.AAK(r7, "clip_chain_metadata");
            A003.A8M(r4.A0f, "barcelona_impression_type");
            A003.A7p("is_truncated", r4.A0w);
            A003.A7p("has_cta", Boolean.valueOf(1sx.A0Q(r9, i3)));
            A003.AAJ("translated_language", str);
            A003.AAe("translation_delivery_method", list2);
            A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A003.AAJ("device_fold_orientation", C254483sY.A00);
            A003.AAJ("device_fold_state", C254493sZ.A00);
            A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A003.Cgf();
        }
    }
}
