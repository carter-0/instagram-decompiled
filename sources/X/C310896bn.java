package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.6bn  reason: invalid class name and case insensitive filesystem */
public final class C310896bn extends C230372pW {
    public static final 0bY A0A;
    public static final String A0B;
    public C258103yT A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C309986aF A05;
    public final C310016aI A06;
    public final C310666bQ A07;
    public final boolean A08;
    public final boolean A09;

    static {
        String name = C310896bn.class.getName();
        0qQ.A07(name);
        A0B = name;
        A0A = new 1Q7(name).A00;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C310896bn(android.content.Context r5, androidx.fragment.app.FragmentActivity r6, X.1Bk r7, X.C309986aF r8, X.C310016aI r9, X.C310666bQ r10) {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r3 = r10.A01
            X.6bo r0 = new X.6bo
            r0.<init>(r3)
            r4.<init>(r7, r0)
            r4.A01 = r5
            r4.A02 = r6
            r4.A07 = r10
            r4.A05 = r8
            r4.A06 = r9
            X.4DU r0 = r10.A02
            r4.A04 = r0
            r4.A03 = r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312140306842544(0x8101b3000603b0, double:3.027281975075472E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A08 = r0
            r0 = 36312140306908081(0x8101b3000703b1, double:3.0272819751169176E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310896bn.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, X.1Bk, X.6aF, X.6aI, X.6bQ):void");
    }

    private final void A00(C250973mM r30, AnonymousClass6YZ r31, String str) {
        AnonymousClass4DU r0 = this.A04;
        C310666bQ r9 = this.A07;
        AnonymousClass3BQ r8 = r9.A03;
        C250973mM r11 = r30;
        Reel reel = r11.A0H;
        AnonymousClass6KG A002 = AnonymousClass6KF.A00(r0, reel, r8);
        UserSession userSession = this.A03;
        C254523sc A012 = GTA.A01(userSession, A002, reel, str);
        A012.A02();
        AnonymousClass6YZ r10 = r31;
        C255773uh r3 = r10.A01;
        1Xj r2 = r3.A0b;
        if (r2 != null) {
            A012.A8B = C231122qu.A0R(userSession, r2);
        }
        A012.A48 = Long.valueOf((long) r10.A00);
        long currentTimeMillis = System.currentTimeMillis();
        long j = r11.A0F;
        if (j != 0) {
            A012.A4E = Long.valueOf(currentTimeMillis - j);
            Integer num = r11.A03;
            if (num != null) {
                A012.A2r = num;
            }
            AnonymousClass3PI r21 = AnonymousClass3PI.A00;
            C309426Yf r02 = r10.A03;
            C311236cM r13 = r10.A02;
            int A003 = r13.A00(r3);
            boolean z = r10.A04;
            AnonymousClass3PI.A07(A012, r3, r11, r9, r02, A003, z);
            C309986aF r1 = this.A05;
            String id = reel.getId();
            0qQ.A07(id);
            AnonymousClass6UP r12 = (AnonymousClass6UP) r1.A05.get(id);
            A012.A4S = C233832wY.A00(userSession);
            if (C228342lQ.A02(userSession)) {
                A012.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
                A012.A4Y = C228342lQ.A00(userSession).toString();
            }
            if (r2 != null) {
                C234002wp r14 = new C234002wp(userSession);
                if (r14.A04()) {
                    A012.A1P = Boolean.valueOf(r14.A05(r2));
                    A012.A1s = Boolean.valueOf(r14.A07(r2));
                }
            }
            Context context = this.A01;
            UserSession userSession2 = r9.A01;
            boolean z2 = z;
            UserSession userSession3 = userSession2;
            Reel reel2 = reel;
            r21.A0A(context, userSession2, A012, reel, r8, new GT8(userSession3, reel2, r3, r11, r02, r13.A00(r3), z2), r12);
            A012.A7U = AnonymousClass6Q2.A00(userSession, r3, r11, r8, r02);
            C233822wX.A0I(userSession, A012, A002, AnonymousClass05K.A01);
            return;
        }
        throw new IllegalStateException("Creation time has not been configured correctly for this ReelViewModel");
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String str;
        AnonymousClass47L r1;
        AndroidLink A002;
        String Avj;
        Uri A003;
        AnonymousClass47L r12;
        String Avj2;
        int i;
        Map map;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        String str6;
        String str7;
        long j;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        Long l22;
        Long l23;
        Double d9;
        Long l24;
        Long l25;
        String str8;
        Long l26;
        Long l27;
        Long l28;
        Long l29;
        Long l30;
        Long l31;
        Long l32;
        Long l33;
        Long l34;
        Long l35;
        Long l36;
        Long l37;
        Long l38;
        Long l39;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        C239613Hd r0;
        C239613Hd r02;
        C233472vm r03;
        C233472vm r04;
        C233472vm r05;
        C233472vm r06;
        C233472vm r07;
        C233472vm r08;
        C233472vm r09;
        C233472vm r010;
        Long A0n;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        C250973mM r7 = (C250973mM) obj;
        AnonymousClass6YZ r11 = (AnonymousClass6YZ) obj2;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r11, 1);
        UserSession userSession = this.A03;
        AnonymousClass0kM r13 = new AnonymousClass0kM(userSession);
        AnonymousClass4DU r011 = this.A04;
        AnonymousClass4DU r29 = r011;
        r13.A00 = r011;
        0wc A004 = r13.A00();
        0Aj A005 = A004.A00(A004.A00, "instagram_ad_reel_impression");
        C310666bQ r10 = this.A07;
        AnonymousClass3BQ r012 = r10.A03;
        AnonymousClass3BQ r28 = r012;
        Reel reel = r7.A0H;
        AnonymousClass6KG A006 = AnonymousClass6KF.A00(r29, reel, r012);
        0jB A012 = GTA.A01(userSession, A006, reel, "impression").A01();
        C255773uh A082 = r7.A08(userSession);
        1Xj r4 = A082.A0b;
        if (!this.A08 || !A005.isSampled()) {
            A00(r7, r11, "impression");
            if (r4 == null) {
                return;
            }
        } else {
            UserSession userSession2 = r10.A01;
            C255773uh r14 = r11.A01;
            GT8 gt8 = new GT8(userSession2, reel, r14, r7, r11.A03, r11.A02.A00(r14), r11.A04);
            C309426Yf r122 = gt8.A05;
            C309986aF r013 = this.A05;
            String id = reel.getId();
            0qQ.A07(id);
            AnonymousClass6UP r72 = (AnonymousClass6UP) r013.A05.get(id);
            if (r4 != null) {
                Reel reel2 = gt8.A02;
                String id2 = reel2.getId();
                0qQ.A07(id2);
                A005.AAJ("reel_id", id2);
                A005.A9F("session_reel_counter", Long.valueOf((long) gt8.A00));
                A005.AAJ("tray_session_id", r10.A08);
                C310016aI r102 = this.A06;
                A005.AAJ("viewer_session_id", r102.A0E.getSessionId());
                A005.AAJ("m_pk", C294185m0.A09(r4));
                A005.A9F("m_t", Long.valueOf((long) r4.BR7().A00));
                A005.A9F("ad_id", C294185m0.A01(userSession, r4));
                A005.AAJ("tracking_token", C294185m0.A07(userSession, r4, A006));
                A005.AAJ("action", C294185m0.A08(r4));
                A005.A9F("ad_inserted_position", Long.valueOf((long) r122.A0I));
                A005.AAJ("follow_status", C294185m0.A06(userSession, r4));
                UserSession userSession3 = gt8.A01;
                A005.A9F("reel_size", Long.valueOf((long) reel2.A0O(userSession3).size()));
                A005.A9F("reel_position", Long.valueOf((long) gt8.A00()));
                A005.A9F("a_pk", Long.valueOf(C294185m0.A00(userSession, r4)));
                A005.A9F("m_ts", Long.valueOf(r4.A1A()));
                0qQ.A0B(A006, 0);
                A005.AAJ("source_of_action", A006.getModuleName());
                A005.A8D("time_elapsed", Double.valueOf(((double) (r122.A0A * r122.A0B)) / 1000.0d));
                A005.A9F("reel_viewer_position", Long.valueOf((long) r122.A0I));
                A005.AAJ("reel_type", reel2.A0H(userSession3));
                if (reel2.A17(userSession3)) {
                    i = reel2.A00;
                } else {
                    i = -1;
                }
                A005.A9F("carousel_opt_in_position", Long.valueOf((long) i));
                A005.A7p("is_video_to_carousel", Boolean.valueOf(gt8.A07));
                Context context = this.A01;
                0bb r5 = new 0bb();
                AnonymousClass6MB r014 = r122.A0S;
                if (r014 != null) {
                    map = r014.BLs();
                } else {
                    map = null;
                }
                r5.A03("is_showreel_native", Boolean.valueOf(C297785sK.A0d(A082)));
                if (map == null || (str22 = (String) map.get("media_height")) == null) {
                    d = null;
                } else {
                    d = Double.valueOf(Double.parseDouble(str22));
                }
                r5.A04("media_height", d);
                if (map == null || (str21 = (String) map.get("media_width")) == null) {
                    d2 = null;
                } else {
                    d2 = Double.valueOf(Double.parseDouble(str21));
                }
                r5.A04("media_width", d2);
                if (map == null || (str20 = (String) map.get("caption_font_size")) == null) {
                    d3 = null;
                } else {
                    d3 = Double.valueOf(Double.parseDouble(str20));
                }
                r5.A04("caption_font_size", d3);
                if (map == null || (str19 = (String) map.get("caption_position_start_x")) == null) {
                    d4 = null;
                } else {
                    d4 = Double.valueOf(Double.parseDouble(str19));
                }
                r5.A04("caption_position_start_x", d4);
                if (map == null || (str18 = (String) map.get("caption_position_start_y")) == null) {
                    d5 = null;
                } else {
                    d5 = Double.valueOf(Double.parseDouble(str18));
                }
                r5.A04("caption_position_start_y", d5);
                if (map == null || (str17 = (String) map.get("caption_line_height")) == null) {
                    d6 = null;
                } else {
                    d6 = Double.valueOf(Double.parseDouble(str17));
                }
                r5.A04("caption_line_height", d6);
                if (map == null || (str16 = (String) map.get("caption_height")) == null) {
                    d7 = null;
                } else {
                    d7 = Double.valueOf(Double.parseDouble(str16));
                }
                r5.A04("caption_height", d7);
                if (map == null || (str15 = (String) map.get("caption_width")) == null) {
                    d8 = null;
                } else {
                    d8 = Double.valueOf(Double.parseDouble(str15));
                }
                r5.A04("caption_width", d8);
                if (map == null || (str14 = (String) map.get("is_caption_fully_displayed")) == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(Boolean.parseBoolean(str14));
                }
                r5.A03("is_caption_fully_displayed", bool);
                if (map != null) {
                    str2 = (String) map.get("background_color_bottom");
                } else {
                    str2 = null;
                }
                r5.A06("background_color_bottom", str2);
                if (map != null) {
                    str3 = (String) map.get("background_color_caption");
                } else {
                    str3 = null;
                }
                r5.A06("background_color_caption", str3);
                if (map != null) {
                    str4 = (String) map.get("background_color_top");
                } else {
                    str4 = null;
                }
                r5.A06("background_color_top", str4);
                if (map != null) {
                    str5 = (String) map.get("caption_background_color_alpha");
                } else {
                    str5 = null;
                }
                r5.A06("caption_background_color_alpha", str5);
                if (map == null || (str13 = (String) map.get("caption_num_char_showed")) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(Long.parseLong(str13));
                }
                r5.A05("caption_num_char_showed", l);
                if (map == null || (str12 = (String) map.get("caption_num_hashtags_showed")) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(Long.parseLong(str12));
                }
                r5.A05("caption_num_hashtags_showed", l2);
                if (map == null || (str11 = (String) map.get("caption_num_lines_showed")) == null) {
                    l3 = null;
                } else {
                    l3 = Long.valueOf(Long.parseLong(str11));
                }
                r5.A05("caption_num_lines_showed", l3);
                if (map == null || (str10 = (String) map.get("caption_num_lines_total")) == null) {
                    l4 = null;
                } else {
                    l4 = Long.valueOf(Long.parseLong(str10));
                }
                r5.A05("caption_num_lines_total", l4);
                if (map == null || (str9 = (String) map.get("caption_num_mentions_showed")) == null) {
                    l5 = null;
                } else {
                    l5 = Long.valueOf(Long.parseLong(str9));
                }
                r5.A05("caption_num_mentions_showed", l5);
                if (map != null) {
                    str6 = (String) map.get("caption_text_color");
                } else {
                    str6 = null;
                }
                r5.A06("caption_text_color", str6);
                r5.A06("cta_color", r4.A0C.getDominantColor());
                if (map != null) {
                    str7 = (String) map.get("headline_text_showed");
                } else {
                    str7 = null;
                }
                r5.A06("headline_text_showed", str7);
                r5.A04("screen_density", Double.valueOf((double) 0nA.A0H(context).density));
                r5.A04("screen_height", Double.valueOf((double) 0nA.A01(context, (float) 0nA.A08(context))));
                r5.A04("screen_width", Double.valueOf((double) 0nA.A01(context, (float) 0nA.A09(context))));
                A005.AAK(r5, "media_layout");
                boolean z = false;
                if (r72 != null) {
                    z = true;
                }
                A005.A7p("is_acp_delivered", Boolean.valueOf(z));
                A005.A7p("is_eof", r4.A0C.CSj());
                A005.AAJ("inventory_source", r4.A0C.BIl());
                A005.AAJ("story_ranking_token", r102.A0G);
                A005.AAJ("sponsored_label_text", 002.A0B(A082.A0Z(userSession)));
                C250973mM r015 = gt8.A04;
                C250973mM r17 = r015;
                A005.A9F("ad_position_from_server", Long.valueOf((long) r015.A0E));
                A005.A9F("reel_start_position", Long.valueOf((long) gt8.A00()));
                A005.A9F("top_liker_count", C294185m0.A02(userSession, r4));
                A005.A8D("elapsed_time_since_last_item", Double.valueOf(-1.0d));
                A005.A9F("dark_mode_state", Long.valueOf((long) AnonymousClass0xl.A00(C61170le.A00).A00()));
                if (AnonymousClass1GD.A03()) {
                    j = 1;
                } else {
                    j = 0;
                }
                A005.A9F("is_dark_mode", Long.valueOf(j));
                if (r4.A4z()) {
                    l6 = Long.valueOf((long) r4.A6i().length);
                } else {
                    l6 = null;
                }
                A005.A9F("sponsor_tag_count", l6);
                String[] A6i = r4.A6i();
                ArrayList arrayList = new ArrayList();
                for (String str23 : A6i) {
                    if (!(str23 == null || (A0n = 00y.A0n(10, str23)) == null)) {
                        arrayList.add(A0n);
                    }
                }
                A005.AAe("sponsor_tag_ids", arrayList);
                A005.A7p("production_build", true);
                if (r72 != null) {
                    l7 = Long.valueOf((long) r72.A04);
                } else {
                    l7 = null;
                }
                A005.A9F("reel_gap", l7);
                if (r72 != null) {
                    l8 = Long.valueOf((long) r72.A0O);
                } else {
                    l8 = null;
                }
                A005.A9F("ad_request_position", l8);
                if (r72 != null) {
                    l9 = Long.valueOf((long) r72.A0P);
                } else {
                    l9 = null;
                }
                A005.A9F("reel_viewer_entry_position", l9);
                if (r72 != null) {
                    l10 = Long.valueOf((long) r72.A0N);
                } else {
                    l10 = null;
                }
                A005.A9F("ad_received_position", l10);
                if (r72 != null) {
                    l11 = Long.valueOf((long) r72.A01);
                } else {
                    l11 = null;
                }
                A005.A9F("consumed_media_gap", l11);
                if (r72 != null) {
                    l12 = Long.valueOf((long) r72.A00);
                } else {
                    l12 = null;
                }
                A005.A9F("ad_consumed_media_gap", l12);
                if (r72 != null) {
                    l13 = Long.valueOf((long) r72.A02);
                } else {
                    l13 = null;
                }
                A005.A9F("netego_consumed_media_gap", l13);
                if (r72 != null) {
                    l14 = Long.valueOf((long) r72.A05);
                } else {
                    l14 = null;
                }
                A005.A9F("reel_gap_to_last_ad", l14);
                if (r72 != null) {
                    l15 = Long.valueOf((long) r72.A06);
                } else {
                    l15 = null;
                }
                A005.A9F("reel_gap_to_last_netego", l15);
                if (r72 == null || (r010 = r72.A08) == null) {
                    l16 = null;
                } else {
                    l16 = Long.valueOf((long) r010.A07());
                }
                A005.A9F("min_consumed_reel_gap_to_previous_ad", l16);
                if (r72 == null || (r09 = r72.A08) == null) {
                    l17 = null;
                } else {
                    l17 = Long.valueOf((long) r09.A08());
                }
                A005.A9F("min_consumed_reel_gap_to_previous_netego", l17);
                if (r72 == null || (r08 = r72.A08) == null) {
                    l18 = null;
                } else {
                    l18 = Long.valueOf((long) r08.A01());
                }
                A005.A9F("min_consumed_media_gap_to_previous_ad", l18);
                if (r72 == null || (r07 = r72.A08) == null) {
                    l19 = null;
                } else {
                    l19 = Long.valueOf((long) r07.A02());
                }
                A005.A9F("min_consumed_media_gap_to_previous_netego", l19);
                if (r72 == null || (r06 = r72.A08) == null) {
                    l20 = null;
                } else {
                    l20 = Long.valueOf((long) r06.A03());
                }
                A005.A9F("highest_position_rule", l20);
                if (r72 == null || (r05 = r72.A08) == null) {
                    l21 = null;
                } else {
                    l21 = Long.valueOf((long) r05.A04());
                }
                A005.A9F("max_reel_gap_to_previous_item", l21);
                if (r72 != null) {
                    l22 = Long.valueOf((long) r72.A03);
                } else {
                    l22 = null;
                }
                A005.A9F("priority_index", l22);
                if (r72 == null || (r04 = r72.A08) == null) {
                    l23 = null;
                } else {
                    l23 = Long.valueOf((long) r04.A06());
                }
                A005.A9F("min_media_gap_to_previous_item", l23);
                if (r72 == null || (r03 = r72.A08) == null) {
                    d9 = null;
                } else {
                    d9 = Double.valueOf(r03.A00());
                }
                A005.A8D("time_gap_to_previous_item_in_sec", d9);
                if (r72 != null) {
                    l24 = Long.valueOf((long) r72.A04);
                } else {
                    l24 = null;
                }
                A005.A9F("reel_gap_highest_position", l24);
                if (r72 != null) {
                    l25 = Long.valueOf((long) r72.A01);
                } else {
                    l25 = null;
                }
                A005.A9F("consumed_media_gap_highest_position", l25);
                if (r72 == null || (r02 = r72.A07) == null) {
                    str8 = null;
                } else {
                    str8 = r02.A02;
                }
                A005.AAJ("ad_pod_id", str8);
                if (r72 == null || (r0 = r72.A07) == null) {
                    l26 = null;
                } else {
                    l26 = Long.valueOf((long) r0.A00);
                }
                A005.A9F("index_in_ad_pod", l26);
                if (r72 == null || (num8 = r72.A0A) == null) {
                    l27 = null;
                } else {
                    l27 = Long.valueOf((long) num8.intValue());
                }
                A005.A9F("adpod_media_hp", l27);
                if (r72 == null || (num7 = r72.A0B) == null) {
                    l28 = null;
                } else {
                    l28 = Long.valueOf((long) num7.intValue());
                }
                A005.A9F("adpod_reel_hp", l28);
                if (r72 == null || (num6 = r72.A09) == null) {
                    l29 = null;
                } else {
                    l29 = Long.valueOf((long) num6.intValue());
                }
                A005.A9F("adpod_media_gap", l29);
                if (r72 == null || (num5 = r72.A0F) == null) {
                    l30 = null;
                } else {
                    l30 = Long.valueOf((long) num5.intValue());
                }
                A005.A9F("adpod_reel_gap", l30);
                if (r72 != null) {
                    l31 = r72.A0H;
                } else {
                    l31 = null;
                }
                A005.A9F("num_ads_or_netegos_before_first_ad_pod", l31);
                if (r72 != null) {
                    l32 = r72.A0J;
                } else {
                    l32 = null;
                }
                A005.A9F("num_ads_or_netegos_since_previous_ad_pod", l32);
                A005.AAe("client_ad_creative_optimization_output", Collections.unmodifiableList(AnonymousClass6Q2.A00(userSession3, gt8.A03, r17, r28, r122)));
                A005.AAJ("nav_chain", (String) A012.A01(C271774jZ.A60));
                String str24 = (String) A012.A01(C271774jZ.A3b);
                if (str24 != null) {
                    l33 = 00y.A0n(10, str24);
                } else {
                    l33 = null;
                }
                A005.A9F("hscroll_seed_ad_id", l33);
                A005.AAJ("intent_aware_ads_trigger_type", (String) A012.A01(C271774jZ.A3p));
                A005.A7p("is_multi_ads", (Boolean) A012.A01(C271774jZ.A4V));
                A005.A9F("multi_ads_type", (Long) A012.A01(C271774jZ.A5w));
                A005.AAJ("multi_ads_unit_id", (String) A012.A01(C271774jZ.A5y));
                A005.A7p("is_seed_ad_multi_ads_eligible", (Boolean) A012.A01(C271774jZ.A4m));
                A005.AAJ("multi_ads_insertion_mechanism", (String) A012.A01(C271774jZ.A5v));
                A005.A9F("num_ads_in_multi_ads_unit", (Long) A012.A01(C271774jZ.A69));
                A005.AAJ("afs_enablement_status", C233832wY.A00(userSession));
                if (r72 == null || (num4 = r72.A0D) == null) {
                    l34 = null;
                } else {
                    l34 = Long.valueOf((long) num4.intValue());
                }
                A005.A9F("multi_ad_carousel_media_hp", l34);
                if (r72 == null || (num3 = r72.A0E) == null) {
                    l35 = null;
                } else {
                    l35 = Long.valueOf((long) num3.intValue());
                }
                A005.A9F("multi_ad_carousel_reel_hp", l35);
                if (r72 == null || (num2 = r72.A0C) == null) {
                    l36 = null;
                } else {
                    l36 = Long.valueOf((long) num2.intValue());
                }
                A005.A9F("multi_ad_carousel_media_gap", l36);
                if (r72 == null || (num = r72.A0G) == null) {
                    l37 = null;
                } else {
                    l37 = Long.valueOf((long) num.intValue());
                }
                A005.A9F("multi_ad_carousel_reel_gap", l37);
                if (r72 != null) {
                    l38 = r72.A0I;
                } else {
                    l38 = null;
                }
                A005.A9F("num_ads_or_netegoes_before_first_multi_ad_carousel", l38);
                if (r72 != null) {
                    l39 = r72.A0K;
                } else {
                    l39 = null;
                }
                A005.A9F("num_ads_or_netegoes_since_previous_multi_ad_carousel", l39);
                if (C228342lQ.A02(userSession)) {
                    A005.AAJ("basic_ads_graphql_tier", C228342lQ.A01(1Au.A00(userSession)).toString());
                    A005.AAJ("basic_ads_launcher_tier", C228342lQ.A00(userSession).toString());
                }
                A005.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A005.Cgf();
            } else {
                return;
            }
        }
        Context context2 = this.A01;
        AndroidLink A007 = AnonymousClass47K.A00(context2, userSession, r4, (String) null, false);
        C249713kF r8 = C249713kF.A00;
        0qQ.A07(r8);
        if (A007 != null) {
            str = A007.Avj();
            r1 = C271714jT.A01(A007);
        } else {
            str = null;
            r1 = null;
        }
        if (r1 == AnonymousClass47L.AD_DESTINATION_ORGANIC_COLLECTION && str != null) {
            0bY r15 = A0A;
            Uri A008 = 0cp.A00(r15, str);
            String A0Z = r8.A0Z(A008, r15, A0B);
            if (A008 != null && A0Z != null && A0Z.equals("com.bloks.www.minishop.collections") && 182.A06(0Tu.A05, userSession, 36316783166231170L)) {
                String queryParameter = A008.getQueryParameter("encoded_collection_id");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                S54 A0S = r8.A0S(this.A02, userSession, queryParameter);
                A0S.A00 = A008.getQueryParameter("ad_id");
                A0S.A01 = A008.getQueryParameter("first_entry_point");
                A0S.A02 = r4.getId();
                A0S.A01(A008.getQueryParameter("pinned_product_ids"));
                A0S.A03 = r29.getModuleName();
                A0S.A04 = A008.getQueryParameter("shopping_session_id");
                A0S.A05 = A008.getQueryParameter(DialogModule.KEY_TITLE);
                A0S.A06 = A008.getQueryParameter("tracking_token");
                A0S.A00();
            }
        }
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36316053021790087L)) {
            AndroidLink A009 = AnonymousClass47K.A00(context2, userSession, r4, (String) null, false);
            C249713kF r82 = C249713kF.A00;
            0qQ.A07(r82);
            if (!(A009 == null || (Avj2 = A009.Avj()) == null || C271714jT.A01(A009) != AnonymousClass47L.IG_DESTINATION_BLOKS)) {
                0bY r16 = A0A;
                Uri A0010 = 0cp.A00(r16, Avj2);
                String A0Z2 = r82.A0Z(A0010, r16, A0B);
                if (!(A0010 == null || A0Z2 == null || !A0Z2.equals("com.bloks.www.minishops.ad.storefront"))) {
                    r82.A0M(A0010, this.A02, userSession, r4, r29, true).A04();
                }
            }
        }
        if (182.A06(r6, userSession, 2342155196766290904L)) {
            AndroidLink A0011 = AnonymousClass47K.A00(context2, userSession, r4, (String) null, false);
            if (A0011 != null) {
                r12 = C271714jT.A01(A0011);
            } else {
                r12 = null;
            }
            if (r12 == AnonymousClass47L.AD_DESTINATION_SHOPPING_PDP) {
                C258103yT r016 = this.A00;
                if (r016 == null) {
                    r016 = new C258103yT(userSession);
                    this.A00 = r016;
                }
                r016.A00((Context) null);
            }
        }
        if (182.A06(r6, userSession, 36330853479039799L) && (A002 = AnonymousClass47K.A00(context2, userSession, r4, (String) null, false)) != null && (Avj = A002.Avj()) != null && (A003 = 0cp.A00(A0A, Avj)) != null && A003.isHierarchical()) {
            String queryParameter2 = A003.getQueryParameter("app_id");
            String queryParameter3 = A003.getQueryParameter("merchant_id");
            if (0qQ.A0K(queryParameter2, "com.bloks.www.bloks.commerce.cart.singlemerchantcart") && queryParameter3 != null) {
                C249713kF.A00.A0d(context2, this.A02, userSession, queryParameter3, String.valueOf(C294185m0.A01(userSession, r4)), C294185m0.A07(userSession, r4, r29), r29.getModuleName());
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        int i;
        Map map;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        String str5;
        String str6;
        long j;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        Long l22;
        Long l23;
        Double d9;
        Long l24;
        Long l25;
        String str7;
        Long l26;
        Long l27;
        Long l28;
        Long l29;
        Long l30;
        Long l31;
        Long l32;
        Long l33;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        C239613Hd r0;
        C239613Hd r02;
        C233472vm r03;
        C233472vm r04;
        C233472vm r05;
        C233472vm r06;
        C233472vm r07;
        C233472vm r08;
        Long A0n;
        C233472vm r09;
        C233472vm r010;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        C250973mM r13 = (C250973mM) obj;
        AnonymousClass6YZ r011 = (AnonymousClass6YZ) obj2;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r011, 1);
        UserSession userSession = this.A03;
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        AnonymousClass4DU r14 = this.A04;
        r1.A00 = r14;
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, "instagram_ad_reel_sub_impression");
        C310666bQ r9 = this.A07;
        AnonymousClass3BQ r12 = r9.A03;
        Reel reel = r13.A0H;
        0jB A012 = GTA.A01(userSession, AnonymousClass6KF.A00(r14, reel, r12), reel, "sub_impression").A01();
        if (!this.A09 || !A003.isSampled()) {
            A00(r13, r011, "sub_impression");
            return;
        }
        C255773uh A082 = r13.A08(userSession);
        1Xj r3 = A082.A0b;
        UserSession userSession2 = r9.A01;
        C255773uh r7 = r011.A01;
        GT8 gt8 = new GT8(userSession2, reel, r7, r13, r011.A03, r011.A02.A00(r7), r011.A04);
        C309426Yf r11 = gt8.A05;
        C309986aF r012 = this.A05;
        String id = reel.getId();
        0qQ.A07(id);
        AnonymousClass6UP r72 = (AnonymousClass6UP) r012.A05.get(id);
        if (r3 != null) {
            Reel reel2 = gt8.A02;
            String id2 = reel2.getId();
            0qQ.A07(id2);
            A003.AAJ("reel_id", id2);
            A003.A9F("session_reel_counter", Long.valueOf((long) gt8.A00));
            A003.AAJ("tray_session_id", r9.A08);
            C310016aI r92 = this.A06;
            A003.AAJ("viewer_session_id", r92.A0E.getSessionId());
            A003.AAJ("m_pk", C294185m0.A09(r3));
            A003.A9F("m_t", Long.valueOf((long) r3.BR7().A00));
            A003.A9F("ad_id", C294185m0.A01(userSession, r3));
            A003.AAJ("tracking_token", C294185m0.A07(userSession, r3, r14));
            A003.AAJ("action", C294185m0.A08(r3));
            A003.A9F("ad_inserted_position", Long.valueOf((long) r11.A0I));
            A003.AAJ("follow_status", C294185m0.A06(userSession, r3));
            UserSession userSession3 = gt8.A01;
            A003.A9F("reel_size", Long.valueOf((long) reel2.A0O(userSession3).size()));
            A003.A9F("reel_position", Long.valueOf((long) gt8.A00()));
            A003.A9F("a_pk", Long.valueOf(C294185m0.A00(userSession, r3)));
            A003.A9F("m_ts", Long.valueOf(r3.A1A()));
            A003.AAJ("source_of_action", r14.getModuleName());
            A003.A8D("time_elapsed", Double.valueOf(((double) (r11.A0A * r11.A0B)) / 1000.0d));
            A003.A9F("reel_viewer_position", Long.valueOf((long) r11.A0I));
            A003.AAJ("reel_type", reel2.A0H(userSession3));
            if (reel2.A17(userSession3)) {
                i = reel2.A00;
            } else {
                i = -1;
            }
            A003.A9F("carousel_opt_in_position", Long.valueOf((long) i));
            A003.A7p("is_video_to_carousel", Boolean.valueOf(gt8.A07));
            Context context = this.A01;
            0bb r10 = new 0bb();
            AnonymousClass6MB r013 = r11.A0S;
            if (r013 != null) {
                map = r013.BLs();
            } else {
                map = null;
            }
            r10.A03("is_showreel_native", Boolean.valueOf(C297785sK.A0d(A082)));
            if (map == null || (str21 = (String) map.get("media_height")) == null) {
                d = null;
            } else {
                d = Double.valueOf(Double.parseDouble(str21));
            }
            r10.A04("media_height", d);
            if (map == null || (str20 = (String) map.get("media_width")) == null) {
                d2 = null;
            } else {
                d2 = Double.valueOf(Double.parseDouble(str20));
            }
            r10.A04("media_width", d2);
            if (map == null || (str19 = (String) map.get("caption_font_size")) == null) {
                d3 = null;
            } else {
                d3 = Double.valueOf(Double.parseDouble(str19));
            }
            r10.A04("caption_font_size", d3);
            if (map == null || (str18 = (String) map.get("caption_position_start_x")) == null) {
                d4 = null;
            } else {
                d4 = Double.valueOf(Double.parseDouble(str18));
            }
            r10.A04("caption_position_start_x", d4);
            if (map == null || (str17 = (String) map.get("caption_position_start_y")) == null) {
                d5 = null;
            } else {
                d5 = Double.valueOf(Double.parseDouble(str17));
            }
            r10.A04("caption_position_start_y", d5);
            if (map == null || (str16 = (String) map.get("caption_line_height")) == null) {
                d6 = null;
            } else {
                d6 = Double.valueOf(Double.parseDouble(str16));
            }
            r10.A04("caption_line_height", d6);
            if (map == null || (str15 = (String) map.get("caption_height")) == null) {
                d7 = null;
            } else {
                d7 = Double.valueOf(Double.parseDouble(str15));
            }
            r10.A04("caption_height", d7);
            if (map == null || (str14 = (String) map.get("caption_width")) == null) {
                d8 = null;
            } else {
                d8 = Double.valueOf(Double.parseDouble(str14));
            }
            r10.A04("caption_width", d8);
            if (map == null || (str13 = (String) map.get("is_caption_fully_displayed")) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(Boolean.parseBoolean(str13));
            }
            r10.A03("is_caption_fully_displayed", bool);
            if (map != null) {
                str = (String) map.get("background_color_bottom");
            } else {
                str = null;
            }
            r10.A06("background_color_bottom", str);
            if (map != null) {
                str2 = (String) map.get("background_color_caption");
            } else {
                str2 = null;
            }
            r10.A06("background_color_caption", str2);
            if (map != null) {
                str3 = (String) map.get("background_color_top");
            } else {
                str3 = null;
            }
            r10.A06("background_color_top", str3);
            if (map != null) {
                str4 = (String) map.get("caption_background_color_alpha");
            } else {
                str4 = null;
            }
            r10.A06("caption_background_color_alpha", str4);
            if (map == null || (str12 = (String) map.get("caption_num_char_showed")) == null) {
                l = null;
            } else {
                l = Long.valueOf(Long.parseLong(str12));
            }
            r10.A05("caption_num_char_showed", l);
            if (map == null || (str11 = (String) map.get("caption_num_hashtags_showed")) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(Long.parseLong(str11));
            }
            r10.A05("caption_num_hashtags_showed", l2);
            if (map == null || (str10 = (String) map.get("caption_num_lines_showed")) == null) {
                l3 = null;
            } else {
                l3 = Long.valueOf(Long.parseLong(str10));
            }
            r10.A05("caption_num_lines_showed", l3);
            if (map == null || (str9 = (String) map.get("caption_num_lines_total")) == null) {
                l4 = null;
            } else {
                l4 = Long.valueOf(Long.parseLong(str9));
            }
            r10.A05("caption_num_lines_total", l4);
            if (map == null || (str8 = (String) map.get("caption_num_mentions_showed")) == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(Long.parseLong(str8));
            }
            r10.A05("caption_num_mentions_showed", l5);
            if (map != null) {
                str5 = (String) map.get("caption_text_color");
            } else {
                str5 = null;
            }
            r10.A06("caption_text_color", str5);
            if (map != null) {
                str6 = (String) map.get("headline_text_showed");
            } else {
                str6 = null;
            }
            r10.A06("headline_text_showed", str6);
            r10.A06("cta_color", r3.A0C.getDominantColor());
            r10.A04("screen_density", Double.valueOf((double) 0nA.A0H(context).density));
            r10.A04("screen_height", Double.valueOf((double) 0nA.A01(context, (float) 0nA.A08(context))));
            r10.A04("screen_width", Double.valueOf((double) 0nA.A01(context, (float) 0nA.A09(context))));
            A003.AAK(r10, "media_layout");
            boolean z = false;
            if (r72 != null) {
                z = true;
            }
            A003.A7p("is_acp_delivered", Boolean.valueOf(z));
            A003.A7p("is_eof", r3.A0C.CSj());
            A003.AAJ("inventory_source", r3.A0C.BIl());
            A003.AAJ("story_ranking_token", r92.A0G);
            A003.AAJ("sponsored_label_text", 002.A0B(A082.A0Z(userSession)));
            A003.A9F("ad_position_from_server", Long.valueOf((long) gt8.A04.A0E));
            A003.A9F("reel_start_position", Long.valueOf((long) gt8.A00()));
            A003.A9F("top_liker_count", C294185m0.A02(userSession, r3));
            A003.A8D("elapsed_time_since_last_item", Double.valueOf(-1.0d));
            A003.A9F("dark_mode_state", Long.valueOf((long) AnonymousClass0xl.A00(C61170le.A00).A00()));
            if (AnonymousClass1GD.A03()) {
                j = 1;
            } else {
                j = 0;
            }
            A003.A9F("is_dark_mode", Long.valueOf(j));
            if (r3.A4z()) {
                l6 = Long.valueOf((long) r3.A6i().length);
            } else {
                l6 = null;
            }
            A003.A9F("sponsor_tag_count", l6);
            A003.A7p("production_build", true);
            if (r72 != null) {
                l7 = Long.valueOf((long) r72.A04);
            } else {
                l7 = null;
            }
            A003.A9F("reel_gap", l7);
            if (r72 != null) {
                l8 = Long.valueOf((long) r72.A0O);
            } else {
                l8 = null;
            }
            A003.A9F("ad_request_position", l8);
            if (r72 != null) {
                l9 = Long.valueOf((long) r72.A0P);
            } else {
                l9 = null;
            }
            A003.A9F("reel_viewer_entry_position", l9);
            if (r72 != null) {
                l10 = Long.valueOf((long) r72.A0N);
            } else {
                l10 = null;
            }
            A003.A9F("ad_received_position", l10);
            if (r72 != null) {
                l11 = Long.valueOf((long) r72.A00);
            } else {
                l11 = null;
            }
            A003.A9F("ad_consumed_media_gap", l11);
            if (r72 != null) {
                l12 = Long.valueOf((long) r72.A02);
            } else {
                l12 = null;
            }
            A003.A9F("netego_consumed_media_gap", l12);
            if (r72 != null) {
                l13 = Long.valueOf((long) r72.A05);
            } else {
                l13 = null;
            }
            A003.A9F("reel_gap_to_last_ad", l13);
            if (r72 != null) {
                l14 = Long.valueOf((long) r72.A06);
            } else {
                l14 = null;
            }
            A003.A9F("reel_gap_to_last_netego", l14);
            if (r72 == null || (r010 = r72.A08) == null) {
                l15 = null;
            } else {
                l15 = Long.valueOf((long) r010.A07());
            }
            A003.A9F("min_consumed_reel_gap_to_previous_ad", l15);
            if (r72 == null || (r09 = r72.A08) == null) {
                l16 = null;
            } else {
                l16 = Long.valueOf((long) r09.A08());
            }
            A003.A9F("min_consumed_reel_gap_to_previous_netego", l16);
            String[] A6i = r3.A6i();
            ArrayList arrayList = new ArrayList();
            for (String str22 : A6i) {
                if (!(str22 == null || (A0n = 00y.A0n(10, str22)) == null)) {
                    arrayList.add(A0n);
                }
            }
            A003.AAe("sponsor_tag_ids", arrayList);
            if (r72 != null) {
                l17 = Long.valueOf((long) r72.A01);
            } else {
                l17 = null;
            }
            A003.A9F("consumed_media_gap", l17);
            if (r72 == null || (r08 = r72.A08) == null) {
                l18 = null;
            } else {
                l18 = Long.valueOf((long) r08.A01());
            }
            A003.A9F("min_consumed_media_gap_to_previous_ad", l18);
            if (r72 == null || (r07 = r72.A08) == null) {
                l19 = null;
            } else {
                l19 = Long.valueOf((long) r07.A02());
            }
            A003.A9F("min_consumed_media_gap_to_previous_netego", l19);
            if (r72 == null || (r06 = r72.A08) == null) {
                l20 = null;
            } else {
                l20 = Long.valueOf((long) r06.A03());
            }
            A003.A9F("highest_position_rule", l20);
            if (r72 == null || (r05 = r72.A08) == null) {
                l21 = null;
            } else {
                l21 = Long.valueOf((long) r05.A04());
            }
            A003.A9F("max_reel_gap_to_previous_item", l21);
            if (r72 != null) {
                l22 = Long.valueOf((long) r72.A03);
            } else {
                l22 = null;
            }
            A003.A9F("priority_index", l22);
            if (r72 == null || (r04 = r72.A08) == null) {
                l23 = null;
            } else {
                l23 = Long.valueOf((long) r04.A06());
            }
            A003.A9F("min_media_gap_to_previous_item", l23);
            if (r72 == null || (r03 = r72.A08) == null) {
                d9 = null;
            } else {
                d9 = Double.valueOf(r03.A00());
            }
            A003.A8D("time_gap_to_previous_item_in_sec", d9);
            if (r72 != null) {
                l24 = Long.valueOf((long) r72.A04);
            } else {
                l24 = null;
            }
            A003.A9F("reel_gap_highest_position", l24);
            if (r72 != null) {
                l25 = Long.valueOf((long) r72.A01);
            } else {
                l25 = null;
            }
            A003.A9F("consumed_media_gap_highest_position", l25);
            if (r72 == null || (r02 = r72.A07) == null) {
                str7 = null;
            } else {
                str7 = r02.A02;
            }
            A003.AAJ("ad_pod_id", str7);
            if (r72 == null || (r0 = r72.A07) == null) {
                l26 = null;
            } else {
                l26 = Long.valueOf((long) r0.A00);
            }
            A003.A9F("index_in_ad_pod", l26);
            if (r72 == null || (num4 = r72.A0A) == null) {
                l27 = null;
            } else {
                l27 = Long.valueOf((long) num4.intValue());
            }
            A003.A9F("adpod_media_hp", l27);
            if (r72 == null || (num3 = r72.A0B) == null) {
                l28 = null;
            } else {
                l28 = Long.valueOf((long) num3.intValue());
            }
            A003.A9F("adpod_reel_hp", l28);
            if (r72 == null || (num2 = r72.A09) == null) {
                l29 = null;
            } else {
                l29 = Long.valueOf((long) num2.intValue());
            }
            A003.A9F("adpod_media_gap", l29);
            if (r72 == null || (num = r72.A0F) == null) {
                l30 = null;
            } else {
                l30 = Long.valueOf((long) num.intValue());
            }
            A003.A9F("adpod_reel_gap", l30);
            if (r72 != null) {
                l31 = r72.A0H;
            } else {
                l31 = null;
            }
            A003.A9F("num_ads_or_netegos_before_first_ad_pod", l31);
            if (r72 != null) {
                l32 = r72.A0J;
            } else {
                l32 = null;
            }
            A003.A9F("num_ads_or_netegos_since_previous_ad_pod", l32);
            A003.AAJ("nav_chain", (String) A012.A01(C271774jZ.A60));
            String str23 = (String) A012.A01(C271774jZ.A3b);
            if (str23 != null) {
                l33 = 00y.A0n(10, str23);
            } else {
                l33 = null;
            }
            A003.A9F("hscroll_seed_ad_id", l33);
            A003.AAJ("intent_aware_ads_trigger_type", (String) A012.A01(C271774jZ.A3p));
            A003.A7p("is_multi_ads", (Boolean) A012.A01(C271774jZ.A4V));
            A003.A9F("multi_ads_type", (Long) A012.A01(C271774jZ.A5w));
            A003.AAJ("multi_ads_unit_id", (String) A012.A01(C271774jZ.A5y));
            if (C228342lQ.A02(userSession)) {
                A003.AAJ("basic_ads_graphql_tier", C228342lQ.A01(1Au.A00(userSession)).toString());
                A003.AAJ("basic_ads_launcher_tier", C228342lQ.A00(userSession).toString());
            }
            A003.Cgf();
        }
    }
}
