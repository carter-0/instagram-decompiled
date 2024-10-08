package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class Fd0 implements C51877G5p {
    public final UserSession A00;

    public final void Csg(OIS ois, FBI fbi) {
        ImageUrl imageUrl = fbi.A00.A00.A00;
        if (imageUrl != null) {
            ois.A06 = imageUrl;
        }
        String A002 = fbi.A00("reel_id");
        if (A002 != null) {
            String A003 = fbi.A00("feeditem_id");
            if (A003 != null) {
                ois.A08 = new C50504Fcq(this, A002, A003, 1);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public Fd0(UserSession userSession) {
        this.A00 = userSession;
    }
}
