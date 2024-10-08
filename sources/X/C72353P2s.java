package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.P2s  reason: case insensitive filesystem */
public final class C72353P2s implements C74394PuA {
    public final Context A00;
    public final UserSession A01;
    public final C254743sy A02;
    public final OLT A03;
    public final AnonymousClass0iw A04;
    public final Capabilities A05;
    public final N4P A06;
    public final C358618bC A07;

    public final boolean isEnabled() {
        UserSession userSession = this.A01;
        if (!AnonymousClass9HV.A00(userSession).A00(C66647MaG.A08(this.A02), 30) || !N4P.A04(userSession, this.A06)) {
            return false;
        }
        return true;
    }

    public C72353P2s(Context context, AnonymousClass0iw r3, UserSession userSession, Capabilities capabilities, N4P n4p, C358618bC r7, C254743sy r8, OLT olt) {
        C51972G9s.A1C(userSession, r8);
        0qQ.A0B(r7, 7);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = capabilities;
        this.A02 = r8;
        this.A06 = n4p;
        this.A03 = olt;
        this.A07 = r7;
        this.A04 = r3;
    }

    public final List getItems() {
        N4P n4p = this.A06;
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 23), this.A07, 2131958580, n4p.A12);
        if (AnonymousClass48O.A01(n4p.A09)) {
            C242243Te r0 = n4p.A0E;
            boolean z = true;
            if (r0 == null || !r0.A0K) {
                z = false;
            }
            pr9.A0E = z;
        }
        return AnonymousClass7TE.A1I(pr9);
    }
}
