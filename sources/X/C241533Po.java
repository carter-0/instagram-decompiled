package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.3Po  reason: invalid class name and case insensitive filesystem */
public abstract class C241533Po {
    public static final String A00(UserSession userSession, AnonymousClass3BT r6) {
        User CCd;
        Reel reel = r6.A03;
        1Ns r4 = reel.A0W;
        if (r4 == null) {
            String str = reel.A1o;
            0qQ.A07(str);
            0wb.A03("ReelItemLabelUtil", 002.A0R("Tried to get username for reel with no owner, reel id: ", str));
            return null;
        } else if (AnonymousClass05K.A01 != r4.CAm() || (CCd = r4.CCd()) == null) {
            return r4.getName();
        } else {
            if (!r6.A01().isEmpty() && !2R8.A04(userSession, CCd) && FollowStatus.A05 != CCd.B6o()) {
                CCd = (User) new ArrayList(r6.A01()).get(0);
            }
            return CCd.getUsername();
        }
    }
}
