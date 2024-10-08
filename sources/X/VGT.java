package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class VGT {
    public static final void A00(UserSession userSession, XC0 xc0, VTR vtr, C20968X6v x6v, C16274Urb urb) {
        0qQ.A0B(vtr, 2);
        User A2A = urb.A00.A2A(userSession);
        if (A2A != null) {
            VGR.A00(new WBD(63, (Object) urb, (Object) x6v), new WB4(58, x6v, urb, xc0), vtr, A2A.getUsername(), 2131964924);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
