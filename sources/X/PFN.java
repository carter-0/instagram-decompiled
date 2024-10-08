package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class PFN implements C74420Pua {
    public final void ADQ(Context context, AnonymousClass0iw r12, UserSession userSession, C68167N3h n3h, PJO pjo, C70481O8g o8g) {
        0qQ.A0B(context, 0);
        C70481O8g o8g2 = o8g;
        DbZ.A0t(1, o8g2, n3h, userSession);
        List list = n3h.A0P;
        OIU oiu = o8g2.A00;
        ArrayList A00 = C309126Xa.A00(context, userSession, oiu.A0K, oiu.A0R, list, false);
        if (A00.size() > 1) {
            oiu.A0Q.A05(userSession, A00);
        }
    }

    public final boolean AFK(Context context, UserSession userSession, C68167N3h n3h) {
        0qQ.A0B(n3h, 1);
        C271434iq r0 = n3h.A07;
        if (r0 != null) {
            return C309126Xa.A01(r0.A00);
        }
        return false;
    }
}
