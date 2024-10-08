package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.P2r  reason: case insensitive filesystem */
public final class C72352P2r implements C74394PuA {
    public final 0wc A00;
    public final C74449Pv4 A01;
    public final N4P A02;
    public final Context A03;
    public final UserSession A04;
    public final Capabilities A05;
    public final C358618bC A06;

    public C72352P2r(Context context, 0wc r3, UserSession userSession, Capabilities capabilities, C74449Pv4 pv4, N4P n4p, C358618bC r8) {
        AnonymousClass7TF.A1E(userSession, 2, r8);
        this.A03 = context;
        this.A04 = userSession;
        this.A02 = n4p;
        this.A05 = capabilities;
        this.A01 = pv4;
        this.A00 = r3;
        this.A06 = r8;
    }

    public final boolean isEnabled() {
        C70733OIq oIq = P2L.A00;
        UserSession userSession = this.A04;
        N4P n4p = this.A02;
        if (!oIq.A00(userSession, this.A05, n4p) || !n4p.A13) {
            return false;
        }
        return true;
    }

    public final List getItems() {
        N4P n4p = this.A02;
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 25), this.A06, 2131959041, n4p.A0k);
        int i = 2131959040;
        if (n4p.A0s) {
            i = 2131973719;
        }
        pr9.A02 = i;
        return AnonymousClass7TE.A1I(pr9);
    }
}
