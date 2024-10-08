package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OL3 {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, C73690PiD.A00);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C73912Pln(this, 3));

    public final boolean A00() {
        UserSession userSession = this.A01;
        if (!(!AnonymousClass7TF.A1V(C66953Mfm.A00(this.A00, userSession).A09.A0Z.A0K.A00))) {
            return false;
        }
        long A012 = 182.A01(0Tu.A05, userSession, 36608780812818178L);
        if (Long.valueOf(A012) == null || A012 != 1) {
            return false;
        }
        return true;
    }

    public OL3(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
