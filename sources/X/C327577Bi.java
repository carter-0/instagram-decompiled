package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.7Bi  reason: invalid class name and case insensitive filesystem */
public abstract class C327577Bi {
    public final UserSession A00;
    public final Set A01;

    public void A01(AnonymousClass9J6 r5) {
        ((C327567Bh) this).A00.A03(r5.A01, System.currentTimeMillis());
    }

    public void A02(AnonymousClass9J6 r3) {
        ((C327567Bh) this).A00.A02(r3.A01);
    }

    public boolean A03(AnonymousClass9J6 r6) {
        if (!00k.A0u(this.A01, r6.A00)) {
            return true;
        }
        if (182.A06(0Tu.A05, this.A00, 36318664362760563L)) {
            return false;
        }
        return true;
    }

    public C327577Bi(UserSession userSession) {
        this.A00 = userSession;
        Set singleton = Collections.singleton(C66579MXk.A00(304));
        0qQ.A07(singleton);
        this.A01 = singleton;
    }
}
