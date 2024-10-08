package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class VGP {
    public static final void A00(UserSession userSession, C20966X6t x6t, VTR vtr, C16272UrZ urZ) {
        0qQ.A0B(vtr, 1);
        User A2A = urZ.A00.A2A(userSession);
        if (A2A != null) {
            VGR.A00(new WBD(61, (Object) urZ, (Object) x6t), new WBD(62, (Object) urZ, (Object) x6t), vtr, A2A.getUsername(), 2131964923);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
