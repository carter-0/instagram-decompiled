package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

public final class P2W implements C74394PuA {
    public final Context A00;
    public final UserSession A01;
    public final Capabilities A02;
    public final N4P A03;

    public P2W(Context context, UserSession userSession, Capabilities capabilities, N4P n4p) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = n4p;
        this.A02 = capabilities;
    }

    public final List getItems() {
        Context context = this.A00;
        return AnonymousClass7TE.A1I(new C50989Fmc(context, C71391Ojp.A00, 2131959011, 2Yu.A0H(context, R.attr.textColorPrimary)));
    }

    public final boolean isEnabled() {
        UserSession userSession = this.A01;
        if (!((C68303N9q) AnonymousClass7TE.A13(JTO.A15(this.A03.A0c))).A00.CPm() || !182.A06(0Tu.A05, userSession, 36329968715907469L)) {
            return false;
        }
        return true;
    }
}
