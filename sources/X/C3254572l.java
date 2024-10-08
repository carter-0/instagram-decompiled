package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.72l  reason: invalid class name and case insensitive filesystem */
public abstract class C3254572l {
    public static void A00(1Xj r6, AnonymousClass710 r7, UserDetailEntryInfo userDetailEntryInfo, FollowButton followButton, User user, String str, String str2, String str3, String str4) {
        int i;
        int i2;
        FollowButton followButton2 = followButton;
        Context context = followButton.getContext();
        FollowStatus B6o = user.B6o();
        FollowStatus followStatus = FollowStatus.A05;
        if (B6o == followStatus) {
            boolean A1z = user.A1z();
            i = R.attr.igds_color_primary_text;
            if (A1z) {
                i = R.attr.igds_color_close_friends;
            }
        } else {
            FollowStatus B6o2 = user.B6o();
            0qQ.A0B(context, 0);
            if (B6o2 == FollowStatus.A06) {
                i2 = R.color.design_dark_default_color_on_background;
            } else if (B6o2 == followStatus || B6o2 == FollowStatus.A07) {
                i = R.attr.igds_color_primary_text;
            } else {
                i2 = -1;
            }
            followButton.setCustomForegroundColor(i2);
            C267064at r0 = followButton.A0J;
            1Xj r2 = r6;
            AnonymousClass710 r3 = r7;
            UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
            r0.A00 = new C318636pH(r2, r3, userDetailEntryInfo2, followButton2, str, str2, str3, str4);
            r0.A01 = new C318646pI(r2, r3, userDetailEntryInfo2, str, str2, str3);
        }
        i2 = 2Yu.A0H(context, i);
        followButton.setCustomForegroundColor(i2);
        C267064at r02 = followButton.A0J;
        1Xj r22 = r6;
        AnonymousClass710 r32 = r7;
        UserDetailEntryInfo userDetailEntryInfo22 = userDetailEntryInfo;
        r02.A00 = new C318636pH(r22, r32, userDetailEntryInfo22, followButton2, str, str2, str3, str4);
        r02.A01 = new C318646pI(r22, r32, userDetailEntryInfo22, str, str2, str3);
    }

    public static boolean A01(Context context, UserSession userSession, User user, boolean z) {
        if (user != null) {
            return (2Ek.A01(user) || AnonymousClass431.A02(userSession, user)) && AnonymousClass703.A00(context, userSession, user, false, z) > 0 && user.A1g();
        }
        return false;
    }

    public static boolean A02(UserSession userSession, User user) {
        if (user == null || !user.getId().equals(userSession.A06) || user.A0N() == AnonymousClass05K.A0C || user.A2L() || !182.A06(0Tu.A05, userSession, 36323887042145872L)) {
            return false;
        }
        return true;
    }

    public static boolean A03(UserSession userSession, User user) {
        if (user == null || !user.getId().equals(userSession.A06)) {
            return false;
        }
        if (2Ek.A00(user) || 2Ek.A01(user)) {
            return true;
        }
        return false;
    }
}
