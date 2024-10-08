package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6UA  reason: invalid class name */
public abstract class AnonymousClass6UA {
    public static final boolean A00(UserSession userSession, C255773uh r6) {
        boolean z;
        String str;
        String str2;
        0qQ.A0B(userSession, 0);
        List Bkd = r6.Bkd(AnonymousClass3WT.AVATAR);
        if (Bkd != null && !Bkd.isEmpty()) {
            Iterator it = Bkd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                0qQ.A07(next);
                String str3 = ((C255783ui) next).A1n;
                if (str3 != null) {
                    User user = r6.A0i;
                    if (user != null) {
                        str2 = user.getId();
                    } else {
                        str2 = null;
                    }
                    if (!str3.equals(str2)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        0Tu r3 = 0Tu.A05;
        boolean A06 = 182.A06(r3, userSession, 36321503335556553L);
        String id = 0eE.A00(userSession).A00().getId();
        User user2 = r6.A0i;
        if (user2 != null) {
            str = user2.getId();
        } else {
            str = null;
        }
        if ((!0qQ.A0K(id, str) || !182.A06(r3, userSession, 36321503335491016L)) && !A06) {
            return false;
        }
        return true;
    }
}
