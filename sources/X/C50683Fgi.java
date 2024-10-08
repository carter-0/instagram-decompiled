package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.Fgi  reason: case insensitive filesystem */
public final class C50683Fgi implements AnonymousClass4c1 {
    public final UserSession A00;
    public final UserDetailFragment A01;
    public final Dc6 A02;
    public final String A03;
    public final String A04;

    public final void Cko(String str, String str2, String str3, String str4, String str5, String str6) {
        UserSession userSession = this.A00;
        UserDetailFragment userDetailFragment = this.A01;
        Dc6 dc6 = this.A02;
        C319986rY A002 = C319976rX.A00(userSession, dc6.A03);
        String A032 = dc6.A03();
        String str7 = this.A03;
        String str8 = this.A04;
        User user = dc6.A03;
        String str9 = userSession.A06;
        String str10 = null;
        if (user != null) {
            if (0qQ.A0K(user.getId(), str9)) {
                str10 = "self";
            } else {
                17M r1 = user.A02;
                if (r1 == 17M.A06) {
                    str10 = "subscribed";
                } else if (r1 == 17M.A03) {
                    str10 = "not_subscribed";
                }
            }
        }
        0qQ.A0B(A002, 3);
        C319976rX.A04(userDetailFragment, userSession, A002, (Long) null, str, A032, str2, str7, str8, str10);
    }

    public C50683Fgi(UserSession userSession, UserDetailFragment userDetailFragment, Dc6 dc6, String str, String str2) {
        this.A00 = userSession;
        this.A01 = userDetailFragment;
        this.A02 = dc6;
        this.A03 = str;
        this.A04 = str2;
    }
}
