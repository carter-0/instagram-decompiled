package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public abstract class F8H {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        0qQ.A07(DbW.A0n(user));
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), AnonymousClass000.A00(1279));
        DbS.A1N(A0e, r3.getModuleName());
        A0e.AAJ("open_thread_id", (String) null);
        A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, (String) null);
        A0e.Cgf();
    }

    public static final void A01(AnonymousClass0iw r9, UserSession userSession, User user, String str) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        FollowStatus B6o = user.B6o();
        if (user.CPV()) {
            str2 = "unblock";
        } else {
            int ordinal = B6o.ordinal();
            if (ordinal == 4 || ordinal == 5) {
                str2 = "follow";
            } else if (ordinal != 3) {
                str2 = "";
            } else {
                str2 = "unfollow";
            }
        }
        if (str2.length() > 0) {
            C319976rX.A06(r9, userSession2, C319976rX.A01(user.A0G()), str2, user.getId(), str);
        }
    }
}
