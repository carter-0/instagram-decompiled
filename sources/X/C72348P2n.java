package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P2n  reason: case insensitive filesystem */
public final class C72348P2n implements C74394PuA {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final 1a8 A02;
    public final UserSession A03;
    public final C74449Pv4 A04;
    public final N4P A05;
    public final C358618bC A06;

    public final List getItems() {
        C242243Te r1;
        List list;
        List list2;
        UserSession userSession = this.A03;
        N4P n4p = this.A05;
        if (C329997La.A01(userSession, n4p) && ((r1 = n4p.A0E) == null || (((list = r1.A0D) == null || list.isEmpty()) && ((list2 = r1.A0E) == null || list2.isEmpty())))) {
            return AnonymousClass7TE.A1I(new C46448DfA(2131959896));
        }
        return 0sr.A1P(new Object[]{new C46448DfA(2131959896), new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 21), this.A06, 2131959833, n4p.A0w)});
    }

    public final boolean isEnabled() {
        int i;
        UserSession userSession = this.A03;
        N4P n4p = this.A05;
        AnonymousClass7TG.A1N(userSession, n4p);
        if (!AnonymousClass9HV.A00(userSession).A00(n4p.A0L, 25) || (i = n4p.A07) == 6 || i == 8) {
            return false;
        }
        return true;
    }

    public C72348P2n(Context context, AnonymousClass0iw r2, 1a8 r3, UserSession userSession, C74449Pv4 pv4, N4P n4p, C358618bC r7) {
        AnonymousClass7TG.A1O(userSession, r7);
        this.A03 = userSession;
        this.A06 = r7;
        this.A01 = r2;
        this.A00 = context;
        this.A05 = n4p;
        this.A02 = r3;
        this.A04 = pv4;
    }
}
