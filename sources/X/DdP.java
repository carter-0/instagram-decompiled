package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public abstract class DdP {
    public static final C52421GRz A00(UserSession userSession, AnonymousClass3UM r16) {
        String str;
        User user;
        User user2;
        AnonymousClass3UM r6 = r16;
        0qQ.A0B(r6, 0);
        User CCd = r6.CCd();
        String url = CCd.Bh3().getUrl();
        0qQ.A07(url);
        String username = CCd.getUsername();
        String fullName = CCd.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        String BxN = r6.BxN();
        ImmutableList socialContextFacepileUsers = r6.getSocialContextFacepileUsers();
        boolean z = false;
        String str2 = null;
        if (socialContextFacepileUsers == null || (user2 = (User) 00k.A0O(socialContextFacepileUsers, 0)) == null) {
            str = null;
        } else {
            str = user2.Bh3().getUrl();
        }
        ImmutableList socialContextFacepileUsers2 = r6.getSocialContextFacepileUsers();
        if (!(socialContextFacepileUsers2 == null || (user = (User) 00k.A0O(socialContextFacepileUsers2, 1)) == null)) {
            str2 = user.Bh3().getUrl();
        }
        boolean A02 = C308436Ug.A02(CCd);
        boolean isVerified = CCd.isVerified();
        FollowStatus B6o = CCd.B6o();
        if (182.A06(0Tu.A05, userSession, 36329638003228907L) && CCd.A2A()) {
            z = true;
        }
        return new C52421GRz(DdK.A00(B6o, Boolean.valueOf(z)), r6, url, username, fullName, BxN, str, str2, A02, isVerified);
    }
}
