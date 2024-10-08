package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class I7O {
    public static final I7O A00 = new Object();

    public static final void A05(AnonymousClass0iw r34, 0xF r35, UserSession userSession, 1Xj r37, AnonymousClass3W1 r38, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        String str8;
        String str9;
        UserSession userSession2 = userSession;
        String str10 = str;
        AnonymousClass7TF.A1D(userSession2, 0, str10);
        1Xj r0 = r37;
        String id = r0.getId();
        int i2 = i;
        AnonymousClass0iw r3 = r34;
        String str11 = str2;
        String str12 = str4;
        if (id != null) {
            1iA BR7 = r0.BR7();
            User A2A = r0.A2A(userSession2);
            if (A2A != null) {
                str9 = A2A.getId();
            } else {
                str9 = null;
            }
            A02(r3, r35, userSession2, (C298795u2) null, BR7, id, str9, str10, str12, r0.A0C.B2y(), r0.A0C.getMezqlToken(), r0.A0C.getConnectionId(), C51965G9l.A0t(r0), str11, str7, i2);
        }
        String id2 = r0.getId();
        1iA BR72 = r0.BR7();
        User A2A2 = r0.A2A(userSession2);
        if (A2A2 != null) {
            str8 = A2A2.getId();
        } else {
            str8 = null;
        }
        A09(r3, userSession2, r38, BR72, "explore_see_less_undo", id2, str8, str10, str12, r0.A0C.B2y(), DbT.A0x(r0), C51965G9l.A0t(r0), str11, str3, r0.A0C.BkE(), (String) null, str5, str6, i2, z, false);
    }

    public static final void A03(AnonymousClass0iw r36, 0xF r37, UserSession userSession, 1Xj r39, AnonymousClass3WA r40, AnonymousClass3W1 r41, String str, String str2, String str3, int i, boolean z) {
        String str4;
        String str5;
        String str6 = str;
        0qQ.A0B(str6, 4);
        1Xj r0 = r39;
        String id = r0.getId();
        AnonymousClass0iw r2 = r36;
        UserSession userSession2 = userSession;
        String str7 = str2;
        int i2 = i;
        if (id != null) {
            1iA BR7 = r0.BR7();
            User A2A = r0.A2A(userSession2);
            if (A2A != null) {
                str5 = A2A.getId();
            } else {
                str5 = null;
            }
            A02(r2, r37, userSession2, (C298795u2) null, BR7, id, str5, str6, str7, r0.A0C.B2y(), r0.A0C.getMezqlToken(), r0.A0C.getConnectionId(), C51965G9l.A0t(r0), A01(r40), str3, i2);
        }
        String id2 = r0.getId();
        1iA BR72 = r0.BR7();
        User A2A2 = r0.A2A(userSession2);
        if (A2A2 != null) {
            str4 = A2A2.getId();
        } else {
            str4 = null;
        }
        A09(r2, userSession2, r41, BR72, "explore_see_less_undo", id2, str4, str6, str7, r0.A0C.B2y(), DbT.A0x(r0), C51965G9l.A0t(r0), A01(r40), (String) null, r0.A0C.BkE(), (String) null, (String) null, (String) null, i2, z, false);
    }

    public static final void A04(AnonymousClass0iw r33, 0xF r34, UserSession userSession, 1Xj r36, AnonymousClass3W1 r37, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        String str6;
        String str7;
        UserSession userSession2 = userSession;
        1Xj r1 = r36;
        AnonymousClass7TF.A1B(userSession2, 0, r1);
        String id = r1.getId();
        AnonymousClass0iw r3 = r33;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str5;
        int i2 = i;
        if (id != null) {
            1iA BR7 = r1.BR7();
            User A2A = r1.A2A(userSession2);
            if (A2A != null) {
                str7 = A2A.getId();
            } else {
                str7 = null;
            }
            A06(r3, r34, userSession2, BR7, id, str7, str8, str9, r1.A0C.B2y(), r1.A0C.getMezqlToken(), r1.A0C.getConnectionId(), C51965G9l.A0t(r1), str10, str11, i2);
        }
        String id2 = r1.getId();
        1iA BR72 = r1.BR7();
        User A2A2 = r1.A2A(userSession2);
        if (A2A2 != null) {
            str6 = A2A2.getId();
        } else {
            str6 = null;
        }
        A09(r3, userSession2, r37, BR72, "explore_see_less", id2, str6, str8, str9, r1.A0C.B2y(), str11, C51965G9l.A0t(r1), str10, str4, r1.A0C.BkE(), (String) null, (String) null, (String) null, i2, z, false);
    }

    public static final void A07(AnonymousClass0iw r21, UserSession userSession, 1Xj r23, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, boolean z2) {
        String str7;
        AnonymousClass0iw r3 = r21;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession2, r3);
        if (z) {
            str7 = "explore_see_less";
        } else {
            str7 = "explore_see_less_undo";
        }
        1Xj r0 = r23;
        String id = r0.getId();
        String str8 = str3;
        A09(r3, userSession2, (AnonymousClass3W1) null, r0.BR7(), str7, id, C51973G9u.A0j(userSession2, r0), str, str8, str2, DbT.A0x(r0), C51965G9l.A0t(r0), str4, str5, r0.A0C.BkE(), str6, (String) null, (String) null, (int) j, A1Z, z2);
    }

    public static final Integer A00(String str) {
        int i;
        switch (str.hashCode()) {
            case -1748085082:
                if (str.equals("sfplt_in_grid")) {
                    return AnonymousClass05K.A0N;
                }
                break;
            case -1747918657:
                if (str.equals("sfplt_in_menu")) {
                    return AnonymousClass05K.A00;
                }
                break;
            case -1134979389:
                if (str.equals("sfplt_from_multi_hide")) {
                    return AnonymousClass05K.A0C;
                }
                break;
            case -841539440:
                i = 3966;
                break;
            case -561162771:
                i = 1804;
                break;
            case 20170857:
                if (str.equals("on_impression")) {
                    return AnonymousClass05K.A0j;
                }
                break;
        }
        if (str.equals(AnonymousClass000.A00(i))) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A15;
    }

    public static final String A01(AnonymousClass3WA r1) {
        Integer num;
        int ordinal = r1.ordinal();
        if (ordinal == 4 || ordinal == 15) {
            num = AnonymousClass05K.A00;
        } else if (ordinal == 5) {
            num = AnonymousClass05K.A01;
        } else if (ordinal != 6) {
            return null;
        } else {
            num = AnonymousClass05K.A0C;
        }
        switch (num.intValue()) {
            case 0:
                return "hide_post_only";
            case 1:
                return "not_interested";
            default:
                return "hide_posts_from_account";
        }
    }

    public static final void A02(AnonymousClass0iw r4, 0xF r5, UserSession userSession, C298795u2 r7, 1iA r8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        int i2;
        String str11;
        String str12;
        String str13;
        String str14;
        Long l;
        Integer A03;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "explore_see_less_undo");
        if (A0e.isSampled()) {
            A0e.AAJ("sfplt_source", str3);
            C51965G9l.A1I(A0e, str);
            String str15 = null;
            A0e.A9F("a_pk", C51972G9s.A0j(str2));
            if (r8 != null) {
                i2 = r8.A00;
            } else {
                i2 = 0;
            }
            A0e.A9F("m_t", DbS.A0j(i2));
            A0e.AAJ("ranking_session_id", str4);
            A0e.AAJ("explore_source_token", str5);
            A0e.AAJ("mezql_token", str6);
            A0e.AAJ("connection_id", str7);
            A0e.AAJ("inventory_source", str8);
            A0e.AAJ("see_less_reason", str9);
            DbW.A15(A0e, r4);
            if (r5 != null) {
                str11 = r5.A05("parent_m_pk");
            } else {
                str11 = null;
            }
            A0e.AAJ("parent_m_pk", str11);
            if (r5 != null) {
                str12 = r5.A05("application_state");
            } else {
                str12 = null;
            }
            A0e.AAJ("application_state", str12);
            if (r5 != null) {
                str13 = r5.A05("endpoint_type");
            } else {
                str13 = null;
            }
            A0e.AAJ("endpoint_type", str13);
            if (r5 != null) {
                str14 = r5.A05("chaining_session_id");
            } else {
                str14 = null;
            }
            C51965G9l.A1R(A0e, str14);
            if (r5 == null || (A03 = r5.A03("chaining_position")) == null) {
                l = null;
            } else {
                l = C51969G9p.A0r(A03);
            }
            A0e.A9F("chaining_position", l);
            A0e.AAJ("event_source", C54973Ha6.A00(A00(str3)));
            C51965G9l.A1Q(A0e, str10);
            if (r7 != null) {
                A0e.AAJ("topic_cluster_id", r7.A03);
                A0e.AAJ("topic_cluster_title", r7.A00().A04);
                A0e.AAJ("topic_cluster_type", C296875qn.A00(r7.A01()));
                if (r5 != null) {
                    str15 = r5.A05("topic_cluster_debug_info");
                }
                A0e.AAJ("topic_cluster_debug_info", str15);
            }
            int i3 = i;
            if (i3 != -1) {
                A0e.A9F("m_ix", DbS.A0j(i3));
            }
            DbX.A1L(A0e);
        }
    }

    public static final void A06(AnonymousClass0iw r4, 0xF r5, UserSession userSession, 1iA r7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        String str11;
        String str12;
        String str13;
        String str14;
        Long l;
        String str15;
        String str16;
        String str17;
        Long l2;
        String str18;
        Integer A03;
        Integer A032;
        Integer A033;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "explore_see_less");
        if (A0e.isSampled()) {
            A0e.AAJ("sfplt_source", str3);
            C51965G9l.A1I(A0e, str);
            Long l3 = null;
            A0e.A9F("a_pk", C51972G9s.A0j(str2));
            A0e.A9F("m_t", DbS.A0j(r7.A00));
            A0e.AAJ("ranking_session_id", str4);
            A0e.AAJ("explore_source_token", str5);
            A0e.AAJ("mezql_token", str6);
            A0e.AAJ("connection_id", str7);
            A0e.AAJ("inventory_source", str8);
            A0e.AAJ("see_less_reason", str9);
            DbW.A15(A0e, r4);
            if (r5 != null) {
                str11 = r5.A05("parent_m_pk");
            } else {
                str11 = null;
            }
            A0e.AAJ("parent_m_pk", str11);
            if (r5 != null) {
                str12 = r5.A05("application_state");
            } else {
                str12 = null;
            }
            A0e.AAJ("application_state", str12);
            if (r5 != null) {
                str13 = r5.A05("endpoint_type");
            } else {
                str13 = null;
            }
            A0e.AAJ("endpoint_type", str13);
            if (r5 != null) {
                str14 = r5.A05("chaining_session_id");
            } else {
                str14 = null;
            }
            C51965G9l.A1R(A0e, str14);
            if (r5 == null || (A033 = r5.A03("chaining_position")) == null) {
                l = null;
            } else {
                l = C51969G9p.A0r(A033);
            }
            A0e.A9F("chaining_position", l);
            if (r5 != null) {
                str15 = r5.A05("carousel_cover_media_id");
            } else {
                str15 = null;
            }
            A0e.AAJ("carousel_cover_media_id", str15);
            if (r5 != null) {
                str16 = r5.A05("carousel_media_id");
            } else {
                str16 = null;
            }
            A0e.AAJ("carousel_media_id", str16);
            if (r5 != null) {
                str17 = r5.A05("carousel_cover_media_id");
            } else {
                str17 = null;
            }
            A0e.AAJ("carousel_cover_media_id", str17);
            if (r5 == null || (A032 = r5.A03("carousel_index")) == null) {
                l2 = null;
            } else {
                l2 = C51969G9p.A0r(A032);
            }
            C51965G9l.A1G(A0e, l2);
            if (r5 != null) {
                str18 = r5.A05("carousel_media_id");
            } else {
                str18 = null;
            }
            A0e.AAJ("carousel_media_id", str18);
            if (!(r5 == null || (A03 = r5.A03("carousel_size")) == null)) {
                l3 = C51969G9p.A0r(A03);
            }
            A0e.A9F("carousel_size", l3);
            A0e.AAJ("event_source", C54973Ha6.A00(A00(str3)));
            C51965G9l.A1Q(A0e, str10);
            int i2 = i;
            if (i2 != -1) {
                A0e.A9F("m_ix", DbS.A0j(i2));
            }
            A0e.Cgf();
        }
    }

    public static final void A08(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, String str, boolean z) {
        C51972G9s.A1C(r5, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_top_of_funnel_control_impression");
        if (A0e.isSampled()) {
            C51965G9l.A1I(A0e, r5.getId());
            A0e.A7p("is_subimpression", Boolean.valueOf(z));
            DbW.A15(A0e, r3);
            A0e.AAJ("event_source", str);
            C51972G9s.A14(A0e, r5);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final void A09(AnonymousClass0iw r7, UserSession userSession, AnonymousClass3W1 r9, 1iA r10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, boolean z, boolean z2) {
        String str15;
        int i2;
        int i3;
        String str16;
        String str17 = str12;
        String A0k = DbS.A0k();
        if (str.equals("explore_see_less")) {
            str15 = "discover/explore_report/";
        } else if (str.equals("explore_see_less_undo")) {
            str15 = "discover/explore_report_undo/";
        } else {
            return;
        }
        if (r9 != null) {
            i2 = r9.A0W;
        } else {
            i2 = -1;
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0E = str15;
        A0b.A9m("m_pk", str2);
        A0b.A9m("a_pk", str3);
        A0b.A9m("recommendation_data", str11);
        C51965G9l.A1S(A0b, r7.getModuleName());
        A0b.A0G("data", str10);
        A0b.A0G(AnonymousClass000.A00(1835), str6);
        A0b.A0G(Py2.A00(), str5);
        if (r10 != null) {
            i3 = r10.A00;
        } else {
            i3 = 0;
        }
        A0b.A09(Integer.valueOf(i3), "m_t");
        A0b.A0G("sfplt_source", str4);
        A0b.A0G("inventory_source", str8);
        if (str12 == null) {
            str17 = C54973Ha6.A00(A00(str4));
        }
        A0b.A0G("event_source", str17);
        A0b.A0G("nav_chain", A0k);
        A0b.A0Q(1XP.class, 1XY.class);
        if (i2 >= 0) {
            A0b.A0C("recs_ix", i2);
        }
        int i4 = i;
        if (i4 != -1) {
            A0b.A0C("m_ix", i4);
        }
        String str18 = str9;
        if (!0qQ.A0K(str18, "hide_post_only")) {
            if (z) {
                str16 = "selected_reason";
            } else {
                str16 = "sfplt_follow_up_response";
            }
            A0b.A0G(str16, str18);
        }
        if (!0qQ.A0K(str18, "hide_post_only") || 0qQ.A0K(r7.getModuleName(), AnonymousClass000.A00(3316))) {
            A0b.A0G("ranking_info_token", str7);
        }
        A0b.A9m(AnonymousClass000.A00(1513), "false");
        String str19 = str13;
        if (!(str13 == null || str19.length() == 0)) {
            A0b.A9m("barcelona_source_reply_id", str19);
        }
        String str20 = str14;
        if (!(str14 == null || str20.length() == 0)) {
            A0b.A9m(C273654mx.A00(1530), str20);
        }
        A0b.A0H("is_blend_self_rec", z2);
        1ES.A03(A0b.A0M());
    }
}
