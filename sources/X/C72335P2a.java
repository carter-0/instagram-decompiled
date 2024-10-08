package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P2a  reason: case insensitive filesystem */
public final class C72335P2a implements C74394PuA {
    public final Context A00;
    public final 1a8 A01;
    public final UserSession A02;
    public final NJm A03;
    public final N4P A04;

    public C72335P2a(Context context, 1a8 r3, UserSession userSession, NJm nJm, N4P n4p) {
        DbW.A1N(userSession, 2, r3);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = n4p;
        this.A03 = nJm;
        this.A01 = r3;
    }

    public final List getItems() {
        return AnonymousClass7TE.A1I(new C50989Fmc(this.A00, (View.OnClickListener) new C71395Oju(this, 17), (CharSequence) "[Legacy Armadillo] Cutover this chat to E2EE"));
    }

    public final boolean isEnabled() {
        N4P n4p = this.A04;
        if (AnonymousClass6W3.A08(n4p.A0L) && !N4P.A05(n4p) && !n4p.A0m) {
            if (!182.A06(0Tu.A05, this.A02, 36317436001129618L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
