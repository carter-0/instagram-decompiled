package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Eiu  reason: case insensitive filesystem */
public abstract class C48709Eiu {
    public static final Boolean A00(C307896Rx r4, AnonymousClass6Tm r5) {
        boolean z = false;
        String A0g = DbY.A0g(r5);
        UserSession A0Z = DbT.A0Z(r4);
        Reel A0L = Dba.A0L(A0Z, A0g);
        if (A0L != null && A0L.A16(A0Z)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
