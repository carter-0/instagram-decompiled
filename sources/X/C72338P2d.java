package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P2d  reason: case insensitive filesystem */
public final class C72338P2d implements C74394PuA {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final N4P A02;
    public final C254743sy A03;
    public final C358618bC A04;

    public final boolean isEnabled() {
        int i;
        UserSession userSession = this.A01;
        N4P n4p = this.A02;
        AnonymousClass7TG.A1N(userSession, n4p);
        if (!AnonymousClass9HV.A00(userSession).A00(n4p.A0L, 28) || (i = n4p.A07) == 6 || i == 8) {
            return false;
        }
        return true;
    }

    public C72338P2d(AnonymousClass0iw r1, UserSession userSession, N4P n4p, C358618bC r4, C254743sy r5) {
        C51974G9v.A1L(userSession, r5, r4);
        this.A01 = userSession;
        this.A03 = r5;
        this.A02 = n4p;
        this.A04 = r4;
        this.A00 = r1;
    }

    public final List getItems() {
        return AnonymousClass7TE.A1I(new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 22), this.A04, 2131958942, this.A02.A0q));
    }
}
