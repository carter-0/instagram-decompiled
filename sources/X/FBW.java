package X;

import com.instagram.common.session.UserSession;

public final class FBW {
    public static final FBW A00 = new Object();

    public final void A00(AnonymousClass0iw r8, UserSession userSession, C49723F3m f3m) {
        EZR ezr;
        0Aj A0e;
        String str;
        long j;
        Long A0j;
        String str2;
        Long A10;
        String str3;
        long j2;
        Long A102;
        AnonymousClass7TG.A1O(userSession, r8);
        if (f3m.A06) {
            ezr = EZR.REELS;
        } else if (f3m.A05) {
            ezr = EZR.FEED;
        } else {
            return;
        }
        if (f3m instanceof ER7) {
            1Xj r3 = f3m.A03;
            int i = f3m.A00;
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), AnonymousClass000.A00(578));
            if (A0e.isSampled()) {
                if (C338007hG.A00(userSession, r3)) {
                    str3 = AnonymousClass000.A00(449);
                } else {
                    str3 = "IG_VIEWER_COMMENTS_ROW";
                }
                A0e.AAJ("feedback_surface", str3);
                String A2n = r3.A2n();
                if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                    j2 = 0;
                } else {
                    j2 = A102.longValue();
                }
                A0j = DbV.A0p(A0e, "nav_chain", DbZ.A0k(ezr, A0e, j2), i);
                str2 = AnonymousClass000.A00(1343);
            } else {
                return;
            }
        } else if (f3m instanceof ER8) {
            1Xj r6 = f3m.A03;
            int i2 = f3m.A02;
            int i3 = f3m.A01;
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), AnonymousClass000.A00(578));
            if (A0e.isSampled()) {
                if (C338007hG.A00(userSession, r6)) {
                    str = "IG_PRODUCER_PLAYS_AND_LIKES_ROW";
                } else {
                    str = "IG_VIEWER_PLAYS_AND_LIKES_ROW";
                }
                A0e.AAJ("feedback_surface", str);
                String A2n2 = r6.A2n();
                if (A2n2 == null || (A10 = AnonymousClass7TE.A10(A2n2)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                A0e.A9F("fb_reaction_count", DbV.A0p(A0e, "nav_chain", DbZ.A0k(ezr, A0e, j), i2));
                A0j = DbS.A0j(i3);
                str2 = "fb_play_count";
            } else {
                return;
            }
        } else {
            return;
        }
        A0e.A9F(str2, A0j);
        A0e.Cgf();
    }

    public final void A01(AnonymousClass0iw r8, UserSession userSession, C49723F3m f3m) {
        EZR ezr;
        0Aj A0e;
        String str;
        long j;
        Long A0j;
        String str2;
        Long A10;
        String str3;
        long j2;
        Long A102;
        AnonymousClass7TG.A1O(userSession, r8);
        if (f3m.A06) {
            ezr = EZR.REELS;
        } else if (f3m.A05) {
            ezr = EZR.FEED;
        } else {
            return;
        }
        if (f3m instanceof ER7) {
            1Xj r3 = f3m.A03;
            int i = f3m.A00;
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), AnonymousClass000.A00(579));
            if (A0e.isSampled()) {
                if (C338007hG.A00(userSession, r3)) {
                    str3 = AnonymousClass000.A00(449);
                } else {
                    str3 = "IG_VIEWER_COMMENTS_ROW";
                }
                A0e.AAJ("feedback_surface", str3);
                String A2n = r3.A2n();
                if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                    j2 = 0;
                } else {
                    j2 = A102.longValue();
                }
                A0j = DbV.A0p(A0e, "nav_chain", DbZ.A0k(ezr, A0e, j2), i);
                str2 = AnonymousClass000.A00(1343);
            } else {
                return;
            }
        } else if (f3m instanceof ER8) {
            1Xj r6 = f3m.A03;
            int i2 = f3m.A02;
            int i3 = f3m.A01;
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), AnonymousClass000.A00(579));
            if (A0e.isSampled()) {
                if (C338007hG.A00(userSession, r6)) {
                    str = "IG_PRODUCER_PLAYS_AND_LIKES_ROW";
                } else {
                    str = "IG_VIEWER_PLAYS_AND_LIKES_ROW";
                }
                A0e.AAJ("feedback_surface", str);
                String A2n2 = r6.A2n();
                if (A2n2 == null || (A10 = AnonymousClass7TE.A10(A2n2)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                A0e.A9F("fb_reaction_count", DbV.A0p(A0e, "nav_chain", DbZ.A0k(ezr, A0e, j), i2));
                A0j = DbS.A0j(i3);
                str2 = "fb_play_count";
            } else {
                return;
            }
        } else {
            return;
        }
        A0e.A9F(str2, A0j);
        A0e.Cgf();
    }
}
