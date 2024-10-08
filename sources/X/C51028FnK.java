package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.FnK  reason: case insensitive filesystem */
public final class C51028FnK implements C243853aD, C51921G7p {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final C331157Pu A03;
    public final UserDetailTabController A04;
    public final User A05;
    public final AnonymousClass71F A06;
    public final AnonymousClass70K A07;
    public final 1Xj A08;
    public final UserDetailEntryInfo A09;
    public final String A0A;
    public final String A0B;

    public final void CjO(AnonymousClass0iw r8, Integer num) {
        String str;
        0qQ.A0B(num, 0);
        UserSession userSession = this.A02;
        User user = this.A05;
        switch (num.intValue()) {
            case 1:
                str = "mute_feed_posts";
                break;
            case 2:
                str = "mute_stories";
                break;
            case 3:
                str = "mute_notes";
                break;
            case 6:
                str = "mute_feed_posts_and_stories";
                break;
            case 8:
                str = "unmute_feed_posts";
                break;
            case 9:
                str = "unmute_stories";
                break;
            case 10:
                str = "unmute_notes";
                break;
            default:
                return;
        }
        C319976rX.A06(r8, userSession, DbV.A0e(user), str, user.getId(), "following_sheet");
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        0qQ.A0B(user, 0);
        UserSession userSession = this.A02;
        AnonymousClass1Nd.A00(userSession).A05(new C323936yL(user));
        Integer C8d = user.A03.C8d();
        if (C8d != null && C8d.intValue() > 0) {
            1Au.A00(userSession).A0R();
        }
    }

    public final void D2p(User user) {
    }

    public final void DED() {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void onSuccess() {
    }

    public C51028FnK(Activity activity, Context context, UserSession userSession, 1Xj r5, C331157Pu r6, UserDetailTabController userDetailTabController, UserDetailEntryInfo userDetailEntryInfo, User user, AnonymousClass71F r10, AnonymousClass70K r11, String str, String str2) {
        0qQ.A0B(r11, 13);
        this.A03 = r6;
        this.A05 = user;
        this.A01 = context;
        this.A00 = activity;
        this.A02 = userSession;
        this.A04 = userDetailTabController;
        this.A0B = str;
        this.A09 = userDetailEntryInfo;
        this.A0A = str2;
        this.A08 = r5;
        this.A06 = r10;
        this.A07 = r11;
    }

    public final void A00(User user, String str) {
        JSONObject A002;
        UserSession userSession = this.A02;
        C49061Eof.A00(userSession).A02(EWT.UNFOLLOW_USER_FLOW, (Integer) null);
        C49061Eof.A00(userSession).A03(EWT.FOLLOW_USER_FLOW, "follow_cancel");
        Context context = this.A01;
        String str2 = this.A0B;
        String str3 = this.A0A;
        UserDetailEntryInfo userDetailEntryInfo = this.A09;
        1Xj r6 = this.A08;
        if (str == null) {
            A002 = null;
        } else {
            A002 = C49069Eon.A00(str);
        }
        User user2 = user;
        FH6.A08(context, (0xF) null, new C47696EDf(this, 6), userSession, r6, (AnonymousClass3W1) null, userDetailEntryInfo, this, user2, "user_profile_header", str2, str3, (String) null, A002);
        this.A03.A0L((C332277Ui) null);
        Activity activity = this.A00;
        if (activity != null && user2.B6o() == FollowStatus.A06 && 1Wj.A00 != null) {
            DcL.A00().A00(activity, userSession, "1705782836540319", C70342O2u.A00(this.A05.getId()));
        }
    }
}
