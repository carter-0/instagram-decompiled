package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.VHp  reason: case insensitive filesystem */
public abstract class C17093VHp {
    public static final String A00(UserSession userSession, C18001Vjd vjd) {
        1Xj r0;
        Integer num = vjd.A02;
        if (num == AnonymousClass05K.A01) {
            r0 = ((C16272UrZ) vjd).A00;
        } else if (num == AnonymousClass05K.A0Y) {
            r0 = ((C16271UrY) vjd).A00;
        } else if (num != AnonymousClass05K.A0j) {
            return null;
        } else {
            r0 = ((C16274Urb) vjd).A00;
        }
        User A2A = r0.A2A(userSession);
        if (A2A != null) {
            return A2A.getId();
        }
        return null;
    }
}
