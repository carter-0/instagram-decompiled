package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

/* renamed from: X.GDd  reason: case insensitive filesystem */
public abstract class C52057GDd {
    public static final HMA A00(C267324bN r5, UserSession userSession, UpcomingEvent upcomingEvent, boolean z) {
        boolean z2;
        HMA hma;
        0qQ.A0B(userSession, 3);
        1Xj r1 = r5.A02;
        if (r1 == null) {
            return null;
        }
        if (!C243213Xw.A09(r1) || !C243213Xw.A04(userSession, r1)) {
            z2 = false;
            hma = null;
        } else {
            z2 = true;
            if (z) {
                hma = HMA.PERSISTENT_OFFSITE_LINK;
            } else {
                hma = HMA.OFFSITE_LINK;
            }
        }
        boolean A1a = DbX.A1a(AnonymousClass2fO.A00(new C310296al(userSession).A00).A0M(upcomingEvent));
        if (!C243213Xw.A00(r5, userSession)) {
            return null;
        }
        if (!new C310296al(userSession).A00(upcomingEvent)) {
            if (!z2) {
                return HMA.NO_CTA;
            }
        } else if (A1a) {
            return HMA.REMIND_ME_PENDING;
        } else {
            if (!upcomingEvent.getReminderEnabled()) {
                return HMA.REMIND_ME;
            }
            if (!z2) {
                return HMA.VIEW_IN_UPCOMING_EVENTS;
            }
        }
        return hma;
    }

    public static final C52058GDe A01(C267324bN r37, UserSession userSession, 1se r39, AnonymousClass3W1 r40, C52054GDa gDa) {
        HLU hlu;
        FollowStatus followStatus;
        C247733gp A1W;
        1Xj r0;
        String A2n;
        boolean z;
        C247733gp A1T;
        AnonymousClass3W1 r12 = r40;
        UserSession userSession2 = userSession;
        1se r02 = r39;
        AnonymousClass7TF.A1B(userSession2, 0, r02);
        C267324bN r6 = r37;
        if (r02.A00.getBoolean(r6.A0C(), false)) {
            hlu = HLU.COMPLETE;
        } else {
            hlu = HLU.A03;
        }
        if (r40 == null) {
            int A0H = C51971G9r.A0H(r6.A0R);
            1Xj r03 = r6.A02;
            if (r03 != null) {
                z = r03.A4o();
            } else {
                z = false;
            }
            r12 = new AnonymousClass3W1(A0H, z);
            r12.A0O(1sy.A07);
            1Xj r4 = r6.A02;
            if (r4 != null && AnonymousClass3WP.A08(userSession2, r4) && (!182.A06(0Tu.A05, userSession2, 2342165929888656048L) || r4.A1T() == null || ((A1T = r4.A1T()) != null && !A1T.A0h))) {
                AnonymousClass3W9 r1 = AnonymousClass3W9.Translated;
                0qQ.A0B(r1, 0);
                r12.A3b.A00(r12, r1);
            }
        }
        1Xj r04 = r6.A02;
        C61081JwJ jwJ = null;
        if (!(r04 == null || (A1W = r04.A1W()) == null || (r0 = r6.A02) == null || (A2n = r0.A2n()) == null)) {
            jwJ = new C61081JwJ(AnonymousClass7TE.A1I(A1W), 20, A2n);
        }
        User user = r6.A0K;
        if (user != null) {
            AnonymousClass2f1 A00 = AnonymousClass2f1.A00(userSession2);
            String id = user.getId();
            followStatus = A00.A0M(user.B6o(), user.A0N(), id);
        } else {
            followStatus = FollowStatus.A08;
        }
        AnonymousClass3WA r11 = r12.A0m;
        boolean z2 = r12.A2R;
        boolean z3 = r6.A0A;
        int i = r12.A0Q;
        C53368Gms gms = new C53368Gms(6);
        Float A0g = C51967G9n.A0g();
        return new C52058GDe(gms, jwJ, (HMA) null, hlu, r11, r12, gDa, followStatus, (Integer) null, (Integer) null, (Integer) null, (String) null, new 0eP(A0g, A0g), i, 0, false, false, true, false, false, z3, z2, false, false, true, true, true, false, true, false, false, false, false, false, false);
    }
}
