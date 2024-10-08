package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;

/* renamed from: X.7LF  reason: invalid class name */
public final class AnonymousClass7LF {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A03, new C377139Kr(this, 45));

    public final boolean A00(int i) {
        if (((AbstractCollection) this.A01.getValue()).contains(Integer.valueOf(i))) {
            if (!182.A06(0Tu.A05, this.A00, 36326695950694323L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass7LF(UserSession userSession) {
        this.A00 = userSession;
    }
}
