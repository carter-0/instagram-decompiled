package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import java.util.UUID;

/* renamed from: X.6ud  reason: invalid class name and case insensitive filesystem */
public final class C321716ud implements AnonymousClass0lh {
    public String A00;
    public final 0wc A01;
    public final String A02;
    public final UserSession A03;

    public static final C66945Mfe A00(int i, boolean z) {
        if (i == 29) {
            if (!z) {
                return C66945Mfe.BROADCAST_CHATS;
            }
        } else if (AnonymousClass48O.A01(i)) {
            return C66945Mfe.PUBLIC_CHATS;
        } else {
            if (!AnonymousClass48O.A02(i)) {
                return null;
            }
        }
        return C66945Mfe.CREATOR_SUBSCRIBER_CHATS;
    }

    public static final String A01(C321716ud r0, FollowStatus followStatus, String str) {
        if (0qQ.A0K(r0.A02, str)) {
            return "self";
        }
        if (followStatus.ordinal() == 4) {
            return "follower";
        }
        return "non_follower";
    }

    public static final String A02(C321716ud r0, 17M r1, String str) {
        if (0qQ.A0K(r0.A02, str)) {
            return "self";
        }
        if (r1.ordinal() == 4) {
            return "subscriber";
        }
        return "non_subscriber";
    }

    public final void onSessionWillEnd() {
        this.A03.A03(C321716ud.class);
    }

    public C321716ud(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = userSession.A06;
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "instagram_ibc_profile_actions";
        this.A01 = r1.A00();
    }

    public static final void A03(C321716ud r1) {
        r1.A00 = UUID.randomUUID().toString();
    }
}
