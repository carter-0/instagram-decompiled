package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class OKG {
    public final AvatarStore A00;
    public final UserSession A01;

    public final boolean A00(DirectThreadKey directThreadKey, boolean z) {
        C293135kC r2;
        0qQ.A0B(directThreadKey, 0);
        AnonymousClass27E r22 = this.A00.A01;
        Integer num = null;
        if ((r22 instanceof C293135kC) && (r2 = (C293135kC) r22) != null) {
            num = r2.A00.A00;
        }
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A0C);
        if (z && A1W) {
            UserSession userSession = this.A01;
            0Tu r23 = 0Tu.A05;
            if (182.A06(r23, userSession, 36325351625864082L) && !182.A06(r23, userSession, 36325351625995155L)) {
                AnonymousClass3U9 A0a = C66582MXn.A0a(userSession, directThreadKey);
                if (A0a == null) {
                    return true;
                }
                List BRZ = A0a.BRZ();
                if (!(BRZ instanceof Collection) || !BRZ.isEmpty()) {
                    Iterator it = BRZ.iterator();
                    while (it.hasNext()) {
                        if (!DbT.A0k(it).A2F()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public OKG(AvatarStore avatarStore, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, avatarStore);
        this.A01 = userSession;
        this.A00 = avatarStore;
    }
}
