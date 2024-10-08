package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Xty  reason: case insensitive filesystem */
public abstract class C22031Xty {
    public static Double A00(0Aj r2, Long l, String str) {
        Long A01;
        r2.A9F("client_position", l);
        if (str == null || (A01 = C271444ir.A01(str)) == null) {
            return null;
        }
        return Double.valueOf((double) A01.longValue());
    }

    public static final String A01(0lg r2, String str) {
        UserSession userSession;
        1Xj A02;
        if (str == null || !(r2 instanceof UserSession) || (userSession = (UserSession) r2) == null || (A02 = 1E7.A00(userSession).A02(str)) == null) {
            return null;
        }
        return A02.A0C.BIl();
    }

    public static void A04(0Aj r2, String str) {
        int i;
        XSW xsw = null;
        switch (str.hashCode()) {
            case -2122614896:
                if (str.equals("story_upsell_dialog")) {
                    xsw = XSW.A0l;
                    break;
                }
                break;
            case -1954753449:
                if (str.equals("story_highlight_reel_bottom_toolbar")) {
                    xsw = XSW.A0i;
                    break;
                }
                break;
            case -1831776004:
                if (str.equals("hashtag_direct_share_sheet")) {
                    xsw = XSW.A0L;
                    break;
                }
                break;
            case -1772223925:
                if (str.equals("story_highlight_action_sheet")) {
                    xsw = XSW.A0f;
                    break;
                }
                break;
            case -1678897195:
                if (str.equals("igtv_action_sheet")) {
                    xsw = XSW.A0N;
                    break;
                }
                break;
            case -1544919732:
                if (str.equals("felix_direct_share_sheet")) {
                    xsw = XSW.A0H;
                    break;
                }
                break;
            case -1411877085:
                if (str.equals("clips_upload_success_snackbar")) {
                    xsw = XSW.A07;
                    break;
                }
                break;
            case -1340745186:
                if (str.equals("story_highlight_direct_share_sheet")) {
                    xsw = XSW.A0g;
                    break;
                }
                break;
            case -1294781442:
                i = 3113;
                break;
            case -1250277069:
                if (str.equals("story_direct_share_sheet")) {
                    xsw = XSW.A0e;
                    break;
                }
                break;
            case -1144696312:
                if (str.equals("profile_side_tray")) {
                    xsw = XSW.A0b;
                    break;
                }
                break;
            case -1055647756:
                if (str.equals("explore_grid_action_on_return")) {
                    xsw = XSW.A0B;
                    break;
                }
                break;
            case -1051110633:
                if (str.equals("feed_action_sheet")) {
                    xsw = XSW.A0D;
                    break;
                }
                break;
            case -1011984874:
                if (str.equals("audio_share_sheet")) {
                    xsw = XSW.A02;
                    break;
                }
                break;
            case -1011131794:
                if (str.equals("feed_screenshot_snackbar_cta")) {
                    xsw = XSW.A0F;
                    break;
                }
                break;
            case -965945108:
                if (str.equals("profile_action_sheet")) {
                    xsw = XSW.A0X;
                    break;
                }
                break;
            case -953855586:
                if (str.equals("self_profile_nametag_view")) {
                    xsw = XSW.A0c;
                    break;
                }
                break;
            case -748705953:
                if (str.equals("igtv_long_press_menu")) {
                    xsw = XSW.A0O;
                    break;
                }
                break;
            case -721466005:
                if (str.equals("mwa_share_bar")) {
                    xsw = XSW.A0U;
                    break;
                }
                break;
            case -694637965:
                if (str.equals("location_direct_share_sheet")) {
                    xsw = XSW.A0Q;
                    break;
                }
                break;
            case -671648769:
                if (str.equals("profile_direct_share_sheet")) {
                    xsw = XSW.A0Z;
                    break;
                }
                break;
            case -668389707:
                if (str.equals("map_location_detail_overflow_menu")) {
                    xsw = XSW.A0S;
                    break;
                }
                break;
            case -599342816:
                if (str.equals("composer")) {
                    xsw = XSW.A09;
                    break;
                }
                break;
            case -524116776:
                if (str.equals("share_later_view")) {
                    xsw = XSW.A0d;
                    break;
                }
                break;
            case -358937885:
                i = 3862;
                break;
            case -185488073:
                if (str.equals("profile_highlight_tray")) {
                    xsw = XSW.A0a;
                    break;
                }
                break;
            case -172670907:
                if (str.equals("clips_direct_share_sheet")) {
                    xsw = XSW.A04;
                    break;
                }
                break;
            case -99093611:
                if (str.equals("clips_download_finished_toast")) {
                    xsw = XSW.A05;
                    break;
                }
                break;
            case 84661897:
                if (str.equals("live_action_sheet")) {
                    xsw = XSW.A0P;
                    break;
                }
                break;
            case 98712316:
                if (str.equals("guide")) {
                    xsw = XSW.A0I;
                    break;
                }
                break;
            case 230400949:
                if (str.equals("nametag_view")) {
                    xsw = XSW.A0V;
                    break;
                }
                break;
            case 261265998:
                if (str.equals("guide_minimized_share_button")) {
                    xsw = XSW.A0K;
                    break;
                }
                break;
            case 290553322:
                if (str.equals("location_story_action_sheet")) {
                    xsw = XSW.A0R;
                    break;
                }
                break;
            case 367604789:
                if (str.equals("story_minimized_share_button")) {
                    xsw = XSW.A0j;
                    break;
                }
                break;
            case 603080348:
                if (str.equals("map_share_sheet")) {
                    xsw = XSW.A0T;
                    break;
                }
                break;
            case 612094377:
                if (str.equals("direct_share_sheet")) {
                    xsw = XSW.A0A;
                    break;
                }
                break;
            case 692771103:
                if (str.equals("hashtag_page_overflow_menu")) {
                    xsw = XSW.A0M;
                    break;
                }
                break;
            case 849758178:
                if (str.equals("story_reel_bottom_toolbar")) {
                    xsw = XSW.A0k;
                    break;
                }
                break;
            case 1064608716:
                if (str.equals("guide_direct_share_sheet")) {
                    xsw = XSW.A0J;
                    break;
                }
                break;
            case 1120817735:
                if (str.equals("clips_minimized_share_button")) {
                    xsw = XSW.A06;
                    break;
                }
                break;
            case 1160533920:
                if (str.equals("story_highlight_minimized_share_button")) {
                    xsw = XSW.A0h;
                    break;
                }
                break;
            case 1215484338:
                if (str.equals("clips_action_sheet")) {
                    xsw = XSW.A03;
                    break;
                }
                break;
            case 1223379942:
                if (str.equals("profile_card")) {
                    xsw = XSW.A0Y;
                    break;
                }
                break;
            case 1350703468:
                if (str.equals("feed_minimized_share_button")) {
                    xsw = XSW.A0E;
                    break;
                }
                break;
            case 1396649048:
                if (str.equals("super_share_overflow_menu")) {
                    xsw = XSW.A0m;
                    break;
                }
                break;
            case 1400824922:
                if (str.equals("other_profile_nametag_view")) {
                    xsw = XSW.A0W;
                    break;
                }
                break;
            case 1419613342:
                if (str.equals("feed_upload_success_snackbar")) {
                    xsw = XSW.A0G;
                    break;
                }
                break;
        }
        if (str.equals(AnonymousClass000.A00(i))) {
            xsw = XSW.A08;
        }
        r2.A8M(xsw, "share_location");
    }

    public static final void A08(AnonymousClass0iw r4, 0lg r5, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        Long l4;
        Long l5;
        Long l6;
        Integer A00;
        String A0u;
        String A0u2;
        AnonymousClass7TG.A1N(r5, r4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, r5), AnonymousClass000.A00(78));
        if (A0e.isSampled()) {
            DbW.A15(A0e, r4);
            if (str == null || (A0u2 = C51965G9l.A0u(str)) == null) {
                l4 = null;
            } else {
                l4 = AnonymousClass7TE.A10(A0u2);
            }
            C51965G9l.A1E(A0e, l4);
            A0e.A9F("media_author_id", C51972G9s.A0j(str2));
            A04(A0e, str3);
            C51973G9u.A14(A0e, "share_option", A02(str4));
            A0e.A9F(C273654mx.A00(123), l);
            A0e.A9F(AnonymousClass000.A00(521), l2);
            if (str5 == null || (A0u = C51965G9l.A0u(str5)) == null) {
                l5 = null;
            } else {
                l5 = AnonymousClass7TE.A10(A0u);
            }
            A0e.A9F(C273654mx.A00(187), l5);
            A0e.AAJ(C273654mx.A00(188), str6);
            if (str == null || (A00 = C271444ir.A00(str)) == null) {
                l6 = null;
            } else {
                l6 = C51969G9p.A0r(A00);
            }
            A0e.A8D("vpv_duration", A00(A0e, l6, str));
            A0e.A7p(AnonymousClass000.A00(3424), Boolean.valueOf(z));
            A0e.AAJ("bottom_sheet_session_id", (String) null);
            A0e.AAJ("inventory_source", A01(r5, str));
            A0e.AAJ("ranking_info_token", str7);
            A0e.A9F("share_option_position", l3);
            A0e.A9F("carousel_media_id_int", (Long) null);
            A0e.A9F("carousel_index", (Long) null);
            A0e.Cgf();
        }
    }

    public static final void A09(AnonymousClass0iw r14, 0lg r15, Long l, String str, String str2, String str3) {
        0qQ.A0B(r15, 0);
        0qQ.A0B(r14, 1);
        A08(r14, r15, (Long) null, (Long) null, l, str, (String) null, str2, str3, (String) null, (String) null, (String) null, false);
    }

    public static final void A0D(AnonymousClass0iw r5, 0lg r6, String str, String str2, String str3) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(str2, 3);
        A09(r5, r6, (Long) null, str, str2, str3);
    }

    public static final void A0E(AnonymousClass0iw r3, 0lg r4, String str, String str2, String str3) {
        0qQ.A0B(r3, 1);
        A0A(r3, r4, (Long) null, str, (String) null, str2, str3);
    }

    public static final void A0F(AnonymousClass0iw r3, 0lg r4, String str, String str2, String str3, String str4) {
        String A02;
        String A0u;
        Long A10;
        0qQ.A0B(str3, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, r4), "external_share_failed");
        if (A0e.isSampled() && (A02 = A02(str3)) != null && (A0u = C51965G9l.A0u(str)) != null && (A10 = AnonymousClass7TE.A10(A0u)) != null) {
            C51965G9l.A1E(A0e, A10);
            DbW.A15(A0e, r3);
            A0e.AAJ("share_option", A02);
            A0e.AAJ("error", str4);
            A04(A0e, str2);
            A03(A0e, r4, str);
            A0e.Cgf();
        }
    }

    public static final void A0G(AnonymousClass0iw r8, 0lg r9, String str, String str2, String str3, String str4) {
        A07(r8, r9, (Long) null, (Long) null, (Long) null, str, str2, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A0J(AnonymousClass0iw r7, UserSession userSession, String str, String str2, String str3, String str4) {
        A0K(r7, userSession, str, str2, str3, str4, (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0051, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0107, code lost:
        r14 = X.AnonymousClass000.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0114, code lost:
        r0 = r2.equals(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0118, code lost:
        if (r0 != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011b, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(java.lang.String r24) {
        /*
            java.lang.String r14 = "facebook"
            java.lang.String r23 = "kakaotalk"
            r0 = 405(0x195, float:5.68E-43)
            java.lang.String r22 = X.C273654mx.A00(r0)
            java.lang.String r21 = "snapchat"
            java.lang.String r20 = "weibo"
            java.lang.String r19 = "share"
            java.lang.String r18 = "email"
            java.lang.String r13 = "line"
            java.lang.String r12 = "band"
            java.lang.String r11 = "odnoklassniki"
            java.lang.String r10 = "user_sms"
            r0 = 5135(0x140f, float:7.196E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = "share_to_ig_feed"
            java.lang.String r7 = "twitter"
            java.lang.String r15 = "invite"
            r0 = 791(0x317, float:1.108E-42)
            java.lang.String r6 = X.C66579MXk.A00(r0)
            r0 = 4431(0x114f, float:6.209E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r0 = 1077(0x435, float:1.509E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = "messenger"
            r0 = 3033(0xbd9, float:4.25E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = 4429(0x114d, float:6.206E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r17 = 0
            r2 = r24
            int r16 = r2.hashCode()
            switch(r16) {
                case -2133928234: goto L_0x0065;
                case -2075169644: goto L_0x006c;
                case -1628054559: goto L_0x0052;
                case -1436108013: goto L_0x0073;
                case -1273433329: goto L_0x007a;
                case -1240898147: goto L_0x0081;
                case -1209041162: goto L_0x0088;
                case -1183699191: goto L_0x008f;
                case -916346253: goto L_0x0096;
                case -635448645: goto L_0x009c;
                case -401297215: goto L_0x00a2;
                case -266143003: goto L_0x00a8;
                case -202603453: goto L_0x00ae;
                case 3016245: goto L_0x00b4;
                case 3321844: goto L_0x00ba;
                case 96619420: goto L_0x00c0;
                case 109400031: goto L_0x00c9;
                case 113011944: goto L_0x00d2;
                case 284397090: goto L_0x00db;
                case 389639919: goto L_0x00e4;
                case 486515695: goto L_0x00ed;
                case 497130182: goto L_0x0114;
                case 563217739: goto L_0x00f6;
                case 1297151787: goto L_0x00fc;
                case 1505434244: goto L_0x00ff;
                case 1534364196: goto L_0x0102;
                case 1539093419: goto L_0x0105;
                case 1671380268: goto L_0x010c;
                case 1787011100: goto L_0x010f;
                case 1873562032: goto L_0x00f9;
                case 1879121913: goto L_0x0112;
                case 1934780818: goto L_0x0061;
                default: goto L_0x0051;
            }
        L_0x0051:
            return r17
        L_0x0052:
            r0 = 4430(0x114e, float:6.208E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0051
            java.lang.String r14 = "add_to_direct_note"
            return r14
        L_0x0061:
            java.lang.String r14 = "whatsapp"
            goto L_0x0114
        L_0x0065:
            boolean r0 = r2.equals(r1)
            r14 = r1
            goto L_0x0118
        L_0x006c:
            r14 = r0
            boolean r0 = r2.equals(r0)
            goto L_0x0118
        L_0x0073:
            r14 = r3
            boolean r0 = r2.equals(r3)
            goto L_0x0118
        L_0x007a:
            r14 = r4
            boolean r0 = r2.equals(r4)
            goto L_0x0118
        L_0x0081:
            r14 = r5
            boolean r0 = r2.equals(r5)
            goto L_0x0118
        L_0x0088:
            r14 = r6
            boolean r0 = r2.equals(r6)
            goto L_0x0118
        L_0x008f:
            r14 = r15
            boolean r0 = r2.equals(r15)
            goto L_0x0118
        L_0x0096:
            boolean r0 = r2.equals(r7)
            r14 = r7
            goto L_0x0118
        L_0x009c:
            boolean r0 = r2.equals(r8)
            r14 = r8
            goto L_0x0118
        L_0x00a2:
            boolean r0 = r2.equals(r9)
            r14 = r9
            goto L_0x0118
        L_0x00a8:
            boolean r0 = r2.equals(r10)
            r14 = r10
            goto L_0x0118
        L_0x00ae:
            boolean r0 = r2.equals(r11)
            r14 = r11
            goto L_0x0118
        L_0x00b4:
            boolean r0 = r2.equals(r12)
            r14 = r12
            goto L_0x0118
        L_0x00ba:
            boolean r0 = r2.equals(r13)
            r14 = r13
            goto L_0x0118
        L_0x00c0:
            r0 = r18
            boolean r0 = r2.equals(r0)
            r14 = r18
            goto L_0x0118
        L_0x00c9:
            r0 = r19
            boolean r0 = r2.equals(r0)
            r14 = r19
            goto L_0x0118
        L_0x00d2:
            r0 = r20
            boolean r0 = r2.equals(r0)
            r14 = r20
            goto L_0x0118
        L_0x00db:
            r0 = r21
            boolean r0 = r2.equals(r0)
            r14 = r21
            goto L_0x0118
        L_0x00e4:
            r0 = r22
            boolean r0 = r2.equals(r0)
            r14 = r22
            goto L_0x0118
        L_0x00ed:
            r0 = r23
            boolean r0 = r2.equals(r0)
            r14 = r23
            goto L_0x0118
        L_0x00f6:
            java.lang.String r14 = "qr_code"
            goto L_0x0114
        L_0x00f9:
            r0 = 1292(0x50c, float:1.81E-42)
            goto L_0x0107
        L_0x00fc:
            r0 = 1248(0x4e0, float:1.749E-42)
            goto L_0x0107
        L_0x00ff:
            r0 = 2935(0xb77, float:4.113E-42)
            goto L_0x0107
        L_0x0102:
            r0 = 4594(0x11f2, float:6.438E-42)
            goto L_0x0107
        L_0x0105:
            r0 = 2688(0xa80, float:3.767E-42)
        L_0x0107:
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            goto L_0x0114
        L_0x010c:
            java.lang.String r14 = "discord"
            goto L_0x0114
        L_0x010f:
            java.lang.String r14 = "share_to_ig_reels"
            goto L_0x0114
        L_0x0112:
            java.lang.String r14 = "download_profile_card_video"
        L_0x0114:
            boolean r0 = r2.equals(r14)
        L_0x0118:
            if (r0 != 0) goto L_0x011b
            return r17
        L_0x011b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22031Xty.A02(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.0Aj r2, X.0lg r3, java.lang.String r4) {
        /*
            java.lang.String r1 = A01(r3, r4)
            if (r1 == 0) goto L_0x000d
            int r0 = r1.hashCode()
            switch(r0) {
                case -2043315917: goto L_0x0014;
                case -1745635341: goto L_0x001f;
                case -950052266: goto L_0x002a;
                case -843741651: goto L_0x0035;
                case -793778648: goto L_0x0040;
                case -532026940: goto L_0x004b;
                case -461981510: goto L_0x0056;
                case -445618946: goto L_0x0061;
                case -258197527: goto L_0x006c;
                case -142932429: goto L_0x0077;
                case -76555191: goto L_0x0082;
                case -51403029: goto L_0x008d;
                case 1756132: goto L_0x0099;
                case 2820684: goto L_0x00a5;
                case 394368174: goto L_0x00b1;
                case 452339563: goto L_0x00bd;
                case 495473892: goto L_0x00c9;
                case 521854075: goto L_0x00d5;
                case 987879317: goto L_0x00e1;
                case 1037456052: goto L_0x00ed;
                case 1087924443: goto L_0x00f9;
                case 1133608632: goto L_0x0105;
                case 1796276480: goto L_0x0111;
                case 1929944363: goto L_0x011d;
                case 2028921176: goto L_0x0129;
                default: goto L_0x000d;
            }
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "inventory_source"
            r2.A8M(r1, r0)
            return
        L_0x0014:
            java.lang.String r0 = "connected_group_profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.CONNECTED_GROUP_PROFILE
            goto L_0x000e
        L_0x001f:
            java.lang.String r0 = "connected_following_favorites"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.CONNECTED_FOLLOWING_FAVORITES
            goto L_0x000e
        L_0x002a:
            java.lang.String r0 = "hashtag_connected"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.HASHTAG_CONNECTED
            goto L_0x000e
        L_0x0035:
            java.lang.String r0 = "user_connected_favorites"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.USER_CONNECTED_FAVORITES
            goto L_0x000e
        L_0x0040:
            java.lang.String r0 = "connected_hashtag_following"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.CONNECTED_HASHTAG_FOLLOWING
            goto L_0x000e
        L_0x004b:
            java.lang.String r0 = "recommended_end_of_feed_recs"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_END_OF_FEED_RECS
            goto L_0x000e
        L_0x0056:
            java.lang.String r0 = "coauthored_post_unconnected"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.COAUTHORED_POST_UNCONNECTED
            goto L_0x000e
        L_0x0061:
            java.lang.String r0 = "recommended_feed_reels_cover_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_FEED_REELS_COVER_MODEL
            goto L_0x000e
        L_0x006c:
            java.lang.String r0 = "group_profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.GROUP_PROFILE
            goto L_0x000e
        L_0x0077:
            java.lang.String r0 = "connected_coauthored_post"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.CONNECTED_COAUTHORED_POST
            goto L_0x000e
        L_0x0082:
            java.lang.String r0 = "explore_story"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.EXPLORE_STORY
            goto L_0x000e
        L_0x008d:
            java.lang.String r0 = "recommended_clips_chaining_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_CLIPS_CHAINING_MODEL
            goto L_0x000e
        L_0x0099:
            java.lang.String r0 = "media_or_ad"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.MEDIA_OR_AD
            goto L_0x000e
        L_0x00a5:
            java.lang.String r0 = "mixed_unconnected"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.MIXED_UNCONNECTED
            goto L_0x000e
        L_0x00b1:
            java.lang.String r0 = "recommended_in_feed_recs"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_IN_FEED_RECS
            goto L_0x000e
        L_0x00bd:
            java.lang.String r0 = "recommended_explore_reels_cover_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_EXPLORE_REELS_COVER_MODEL
            goto L_0x000e
        L_0x00c9:
            java.lang.String r0 = "explore_unconnected"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.EXPLORE_UNCONNECTED
            goto L_0x000e
        L_0x00d5:
            java.lang.String r0 = "recommended_explore_chaining_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_EXPLORE_CHAINING_MODEL
            goto L_0x000e
        L_0x00e1:
            java.lang.String r0 = "user_connected"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.USER_CONNECTED
            goto L_0x000e
        L_0x00ed:
            java.lang.String r0 = "follow_hashtag_story"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.FOLLOW_HASHTAG_STORY
            goto L_0x000e
        L_0x00f9:
            java.lang.String r0 = "connected_following"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.CONNECTED_FOLLOWING
            goto L_0x000e
        L_0x0105:
            java.lang.String r0 = "recommended_explore_grid_cover_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_EXPLORE_GRID_COVER_MODEL
            goto L_0x000e
        L_0x0111:
            java.lang.String r0 = "connected_content_note_following"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.CONNECTED_CONTENT_NOTE_FOLLOWING
            goto L_0x000e
        L_0x011d:
            java.lang.String r0 = "recommended_stories_reels_cover_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_STORIES_REELS_COVER_MODEL
            goto L_0x000e
        L_0x0129:
            java.lang.String r0 = "recommended_music_feed_reels_cover_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.XSK r1 = X.XSK.RECOMMENDED_MUSIC_FEED_REELS_COVER_MODEL
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22031Xty.A03(X.0Aj, X.0lg, java.lang.String):void");
    }

    public static final void A05(C47062Dpx dpx, AnonymousClass0iw r5, 0lg r6, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Long l3;
        Long l4;
        Integer A00;
        String A0u;
        String A0u2;
        AnonymousClass7TG.A1N(r6, r5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, r6), AnonymousClass000.A00(78));
        if (A0e.isSampled()) {
            DbW.A15(A0e, r5);
            Long l5 = null;
            if (str3 == null || (A0u2 = C51965G9l.A0u(str3)) == null) {
                l3 = null;
            } else {
                l3 = AnonymousClass7TE.A10(A0u2);
            }
            C51965G9l.A1E(A0e, l3);
            A0e.A9F("media_author_id", C51972G9s.A0j(str4));
            A04(A0e, str);
            A0e.AAJ("share_option", A02(str2));
            A0e.AAJ("ranking_info_token", str5);
            A0e.AAK(dpx, "xpost_extras");
            if (str7 == null || (A0u = C51965G9l.A0u(str7)) == null) {
                l4 = null;
            } else {
                l4 = AnonymousClass7TE.A10(A0u);
            }
            A0e.A9F(C273654mx.A00(187), l4);
            A0e.AAJ(C273654mx.A00(188), str8);
            if (!(str3 == null || (A00 = C271444ir.A00(str3)) == null)) {
                l5 = C51969G9p.A0r(A00);
            }
            A0e.A8D("vpv_duration", A00(A0e, l5, str3));
            A0e.AAJ("bottom_sheet_session_id", str6);
            A0e.AAJ("inventory_source", A01(r6, str3));
            A0e.A9F("share_option_position", l);
            A0e.A9F("carousel_media_id_int", C254543se.A00(str9));
            A0e.A9F("carousel_index", l2);
            A0e.Cgf();
        }
    }

    public static final void A06(C47062Dpx dpx, AnonymousClass0iw r4, 0lg r5, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, r5), "external_share_option_impression");
        if (A0e.isSampled()) {
            C51965G9l.A1E(A0e, C51972G9s.A0j(str2));
            A0e.A9F("media_author_id", C51972G9s.A0i(str3));
            DbW.A15(A0e, r4);
            A0e.A8M(XSW.A0A, "share_location");
            A0e.AAJ("share_option", A02(str));
            A0e.AAK(dpx, "xpost_extras");
            A0e.Cgf();
        }
    }

    public static final void A07(AnonymousClass0iw r3, 0lg r4, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Long l4;
        Long l5;
        Integer A00;
        String A0u;
        String A0u2;
        AnonymousClass7TG.A1N(r4, r3);
        0qQ.A0B(str3, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, r4), AnonymousClass000.A00(78));
        if (A0e.isSampled()) {
            DbW.A15(A0e, r3);
            Long l6 = null;
            if (str == null || (A0u2 = C51965G9l.A0u(str)) == null) {
                l4 = null;
            } else {
                l4 = AnonymousClass7TE.A10(A0u2);
            }
            C51965G9l.A1E(A0e, l4);
            A04(A0e, str2);
            C51973G9u.A14(A0e, "share_option", A02(str3));
            A0e.AAJ("ranking_info_token", str4);
            if (str6 == null || (A0u = C51965G9l.A0u(str6)) == null) {
                l5 = null;
            } else {
                l5 = AnonymousClass7TE.A10(A0u);
            }
            A0e.A9F(C273654mx.A00(187), l5);
            A0e.AAJ(C273654mx.A00(188), str7);
            if (!(str == null || (A00 = C271444ir.A00(str)) == null)) {
                l6 = C51969G9p.A0r(A00);
            }
            A0e.A8D("vpv_duration", A00(A0e, l6, str));
            A0e.AAJ("bottom_sheet_session_id", str5);
            A0e.AAJ("inventory_source", A01(r4, str));
            A0e.AAJ("url", str8);
            A0e.A9F("ify_media_id", l);
            A0e.A9F("share_option_position", l2);
            A0e.A9F("carousel_media_id_int", C254543se.A00(str9));
            A0e.A9F("carousel_index", l3);
            A0e.Cgf();
        }
    }

    public static final void A0A(AnonymousClass0iw r3, 0lg r4, Long l, String str, String str2, String str3, String str4) {
        String A0u;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, r4), "external_share_option_impression");
        if (A0e.isSampled()) {
            Long l2 = null;
            if (!(str == null || (A0u = C51965G9l.A0u(str)) == null)) {
                l2 = AnonymousClass7TE.A10(A0u);
            }
            C51965G9l.A1E(A0e, l2);
            A0e.A9F("media_author_id", C51972G9s.A0i(str2));
            DbW.A15(A0e, r3);
            A04(A0e, str3);
            A0e.AAJ("share_option", A02(str4));
            A03(A0e, r4, str);
            A0e.A9F("ify_media_id", l);
            A0e.Cgf();
        }
    }

    public static final void A0B(AnonymousClass0iw r3, 0lg r4, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, r4), "external_share_overflow_menu_user_education_dismissed");
        if (A0e.isSampled()) {
            A0e.AAJ("media_id", str);
            A0e.A9F("media_owner_id", DbZ.A0d(str2));
            DbW.A15(A0e, r3);
            C51973G9u.A14(A0e, "share_location", str3);
            A0e.Cgf();
        }
    }

    public static final void A0C(AnonymousClass0iw r3, 0lg r4, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, r4), "external_share_media_ufi_tooltip_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("media_id", str);
            A0e.A9F("media_owner_id", DbZ.A0d(str2));
            DbW.A15(A0e, r3);
            C51973G9u.A14(A0e, "share_location", str3);
            A0e.Cgf();
        }
    }

    public static final void A0H(AnonymousClass0iw r3, 0lg r4, String str, String str2, String str3, Throwable th) {
        String A02;
        String A0u;
        Long A10;
        String str4;
        AnonymousClass7TG.A1T(r4, r3, str);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, r4), "external_share_failed");
        if (A0e.isSampled() && (A02 = A02(str3)) != null && (A0u = C51965G9l.A0u(str)) != null && (A10 = AnonymousClass7TE.A10(A0u)) != null) {
            C51965G9l.A1E(A0e, A10);
            DbW.A15(A0e, r3);
            A0e.AAJ("share_option", A02);
            if (th != null) {
                str4 = th.getMessage();
            } else {
                str4 = null;
            }
            A0e.AAJ("error", str4);
            A04(A0e, str2);
            A03(A0e, r4, str);
            A0e.Cgf();
        }
    }

    public static final void A0I(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1T(userSession, r1, str);
        C51973G9u.A0r(3, str2, str3, str4);
        A0J(r1, userSession, str, str2, str3, str4);
    }

    public static final void A0K(AnonymousClass0iw r5, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass7TG.A1T(userSession, r5, str);
        0qQ.A0B(str3, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "external_share_succeeded");
        if (A0e.isSampled()) {
            Double d = null;
            C51965G9l.A1E(A0e, C51972G9s.A0j(C51965G9l.A0u(str)));
            DbW.A15(A0e, r5);
            A0e.AAJ("ranking_info_token", str6);
            A04(A0e, str2);
            C51973G9u.A14(A0e, "share_option", A02(str3));
            A0e.AAJ("url", str4);
            A0e.AAJ("raw_system_share_option", str5);
            A0e.A9F("client_position", C21054XCf.A07(C271444ir.A00(str)));
            Long A01 = C271444ir.A01(str);
            if (A01 != null) {
                d = Double.valueOf((double) A01.longValue());
            }
            A0e.A8D("vpv_duration", d);
            A0e.AAJ("bottom_sheet_session_id", str7);
            A03(A0e, userSession, str);
            A0e.Cgf();
        }
    }
}
