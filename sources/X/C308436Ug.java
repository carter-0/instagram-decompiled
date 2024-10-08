package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6Ug  reason: invalid class name and case insensitive filesystem */
public final class C308436Ug {
    public static final C308436Ug A00 = new Object();

    public static final void A00(UserSession userSession, User user, boolean z) {
        0qQ.A0B(userSession, 1);
        String id = user.getId();
        ((C319396qW) userSession.A01(C319396qW.class, C319386qV.A00)).A00.put(id, Boolean.valueOf(z));
    }

    public static final boolean A01(UserSession userSession, User user) {
        0qQ.A0B(userSession, 1);
        String id = user.getId();
        LruCache lruCache = ((C324496zP) userSession.A01(C324496zP.class, C324486zO.A00)).A00;
        Boolean bool = (Boolean) lruCache.get(id);
        if (bool != null) {
            return bool.booleanValue();
        }
        List AXq = user.A03.AXq();
        if (AXq == null || !AXq.contains(1)) {
            return false;
        }
        lruCache.put(user.getId(), true);
        return true;
    }

    public static final boolean A02(User user) {
        0qQ.A0B(user, 0);
        if (!user.A2F() || !AnonymousClass0xl.A00(C61170le.A00).A00.getBoolean("show_internal_badge", true)) {
            return false;
        }
        return true;
    }
}
