package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.GNb  reason: case insensitive filesystem */
public abstract class C52310GNb {
    public static final void A02(SocialContextType socialContextType, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, String str2, int i, int i2, long j, boolean z) {
        long j2;
        Long A10;
        0qQ.A0B(str, 2);
        if (r5 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_friendly_bubble_long_press");
            if (A0e.isSampled()) {
                DbW.A16(A0e, r6);
                String A30 = r5.A30();
                if (A30 == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                    j2 = 0;
                } else {
                    j2 = A10.longValue();
                }
                C51974G9v.A0l(A0e, i, j2);
                C51965G9l.A1O(A0e, str);
                C51973G9u.A14(A0e, "ranking_info_token", A00(A0e, r5, C51974G9v.A0U(r5), str2));
                A01(A0e, socialContextType, Long.valueOf(j), i2, z);
                DbX.A1L(A0e);
            }
        }
    }

    public static final void A03(SocialContextType socialContextType, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, String str2, int i, int i2, long j, boolean z) {
        long j2;
        Long A10;
        0qQ.A0B(str, 2);
        if (r5 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_clips_friendly_viewer_keyboard_interaction_client");
            if (A0e.isSampled()) {
                DbW.A16(A0e, r6);
                String A30 = r5.A30();
                if (A30 == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                    j2 = 0;
                } else {
                    j2 = A10.longValue();
                }
                C51974G9v.A0l(A0e, i, j2);
                C51965G9l.A1O(A0e, str);
                C51973G9u.A14(A0e, "ranking_info_token", A00(A0e, r5, C51974G9v.A0U(r5), str2));
                A0e.AAe("facepile_user_ids", AnonymousClass7TE.A1I(Long.valueOf(j)));
                A0e.A9F("bubble_position", DbV.A0p(A0e, "social_context_type", C52086GEg.A02(socialContextType), i2));
                A0e.A7p("immersive_viewer", Boolean.valueOf(z));
                DbX.A1L(A0e);
            }
        }
    }

    public static final void A04(SocialContextType socialContextType, UserSession userSession, 1Xj r9, AnonymousClass4DU r10, String str, String str2, int i, int i2, long j, boolean z, boolean z2) {
        long j2;
        Long A10;
        long j3;
        Long l;
        Long A102;
        0qQ.A0B(str, 2);
        if (r9 != null) {
            long j4 = 0;
            boolean z3 = z;
            if (z2) {
                0Aj A0O = C51972G9s.A0O(r10, userSession);
                if (A0O.isSampled()) {
                    DbW.A16(A0O, r10);
                    String A2n = r9.A2n();
                    if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                        j3 = 0;
                    } else {
                        j3 = A102.longValue();
                    }
                    C51974G9v.A0l(A0O, i, j3);
                    C51965G9l.A1O(A0O, str);
                    User A11 = C51966G9m.A11(r9);
                    Long l2 = null;
                    if (A11 != null) {
                        l = C51972G9s.A0h(A11);
                    } else {
                        l = null;
                    }
                    C51965G9l.A1H(A0O, l);
                    C51965G9l.A1R(A0O, str2);
                    C51972G9s.A14(A0O, r9);
                    A0O.AAJ("link_format", "tag_above_profile");
                    A0O.A9F("link_index", (Long) null);
                    DbY.A1C(A0O);
                    DUF A0j = C51965G9l.A0j(r9);
                    if (A0j != null) {
                        l2 = C51972G9s.A0i(A0j.getAttributionAppId());
                    }
                    A0O.A9F("app_attribution_id", l2);
                    C51965G9l.A19(C52236GKd.A1C, A0O);
                    C51965G9l.A1C(AnonymousClass5OC.FRIENDLY_BUBBLE, A0O);
                    A0O.AAe("facepile_user_ids", AnonymousClass7TE.A1I(Long.valueOf(j)));
                    String A02 = C52086GEg.A02(socialContextType);
                    if (A02 == null) {
                        A02 = "unknown";
                    }
                    A0O.AAJ("social_context_type", A02);
                    A0O.Cgf();
                }
                if (!r9.CcK()) {
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r10, userSession), "instagram_clips_bubble_tap");
                    if (A0e.isSampled()) {
                        DbW.A16(A0e, r10);
                        String A30 = r9.A30();
                        if (A30 == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                            j2 = 0;
                        } else {
                            j2 = A10.longValue();
                        }
                        C51974G9v.A0l(A0e, i, j2);
                        C51965G9l.A1O(A0e, str);
                        C51973G9u.A14(A0e, "ranking_info_token", A00(A0e, r9, C51974G9v.A0U(r9), str2));
                        A01(A0e, socialContextType, Long.valueOf(j), i2, z3);
                        DbX.A1L(A0e);
                    }
                }
            }
            if (r9.CcK()) {
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r10, userSession), "instagram_ad_bubble_tap");
                if (A0e2.isSampled()) {
                    DbW.A16(A0e2, r10);
                    String A302 = r9.A30();
                    if (A302 != null) {
                        j4 = C51967G9n.A08(AnonymousClass7TE.A10(A302), 0);
                    }
                    C51974G9v.A0l(A0e2, i, j4);
                    C51965G9l.A1O(A0e2, str);
                    C51965G9l.A1D(A0e2, DbZ.A0d(r9.A2R()));
                    C51965G9l.A1L(A0e2, r9.A2v());
                    C51965G9l.A1R(A0e2, str2);
                    C51973G9u.A14(A0e2, "ranking_info_token", DbT.A0x(r9));
                    A01(A0e2, socialContextType, Long.valueOf(j), i2, z3);
                    A0e2.A7p("is_tappable", Boolean.valueOf(z2));
                    DbX.A1L(A0e2);
                }
            }
        }
    }

    public static final void A05(SocialContextType socialContextType, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, String str2, String str3, int i, int i2, long j, boolean z) {
        long j2;
        Long A10;
        long j3;
        Long A102;
        0qQ.A0B(str, 2);
        if (r5 != null) {
            0Aj A0u = G9t.A0u(r6, userSession);
            if (A0u.isSampled()) {
                DbW.A16(A0u, r6);
                String A2n = r5.A2n();
                if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                    j3 = 0;
                } else {
                    j3 = A102.longValue();
                }
                C51974G9v.A0l(A0u, i, j3);
                C51973G9u.A14(A0u, "viewer_session_id", str);
                C51965G9l.A19(C52236GKd.A1C, A0u);
                C51965G9l.A1C(AnonymousClass5OC.FRIENDLY_BUBBLE, A0u);
                A0u.Cgf();
            }
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_clips_bubble_impression");
            if (A0e.isSampled()) {
                DbW.A16(A0e, r6);
                String A30 = r5.A30();
                if (A30 == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                    j2 = 0;
                } else {
                    j2 = A10.longValue();
                }
                C51974G9v.A0l(A0e, i, j2);
                C51965G9l.A1O(A0e, str);
                User A11 = C51966G9m.A11(r5);
                Long l = null;
                if (A11 != null) {
                    l = C51972G9s.A0h(A11);
                }
                C51973G9u.A14(A0e, "ranking_info_token", A00(A0e, r5, l, str2));
                A01(A0e, socialContextType, Long.valueOf(j), i2, z);
                A0e.A9F("comment_id", C51972G9s.A0i(str3));
                DbX.A1L(A0e);
            }
        }
    }

    public static final void A06(SocialContextType socialContextType, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, String str2, List list, int i, boolean z) {
        long j;
        Long A10;
        0qQ.A0B(str, 2);
        if (r5 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_clips_bubble_drag_dismissal");
            if (A0e.isSampled()) {
                DbW.A16(A0e, r6);
                String A30 = r5.A30();
                if (A30 == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                C51974G9v.A0l(A0e, i, j);
                C51965G9l.A1O(A0e, str);
                C51973G9u.A14(A0e, "ranking_info_token", A00(A0e, r5, C51974G9v.A0U(r5), str2));
                A0e.AAe("facepile_user_ids", list);
                A0e.AAJ("social_context_type", C52086GEg.A02(socialContextType));
                A0e.A7p("immersive_viewer", Boolean.valueOf(z));
                DbX.A1L(A0e);
            }
        }
    }

    public static String A00(0Aj r1, 1Xj r2, Long l, String str) {
        r1.A9F("media_author_id", l);
        r1.AAJ("chaining_session_id", str);
        return r2.A0C.getLoggingInfoToken();
    }

    public static final void A07(UserSession userSession, 1Xj r8, AnonymousClass4DU r9, long j, boolean z) {
        String str;
        if (r8 != null) {
            UserSession userSession2 = userSession;
            17i A00 = 17h.A00(userSession);
            String valueOf = String.valueOf(j);
            if (A00.A02(valueOf) != null) {
                if (z) {
                    str = "friendly_viewer_bubble_tap";
                } else {
                    str = "friendly_feed_bubble_tap";
                }
                C319976rX.A09(r9, userSession2, C319986rY.FOLLOWING, str, valueOf, r8.getId(), r8.C9L(), DbT.A0x(r8), AnonymousClass000.A00(93));
            }
        }
    }

    public static void A01(0Aj r2, SocialContextType socialContextType, Object obj, int i, boolean z) {
        List singletonList = Collections.singletonList(obj);
        0qQ.A07(singletonList);
        r2.AAe("facepile_user_ids", singletonList);
        r2.AAJ("social_context_type", C52086GEg.A02(socialContextType));
        r2.A8k("bubble_position", Integer.valueOf(i));
        r2.A7p("immersive_viewer", Boolean.valueOf(z));
    }
}
