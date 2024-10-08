package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

public final class P2V implements C74394PuA {
    public final UserSession A00;
    public final N4P A01;
    public final Capabilities A02;
    public final 1Av A03;

    public final List getItems() {
        String valueOf;
        N4P n4p = this.A01;
        C254743sy A08 = n4p.A08();
        if (C66647MaG.A04(A08) != null) {
            valueOf = C66647MaG.A09(A08);
        } else {
            if (A08 instanceof MsysThreadId) {
                valueOf = String.valueOf(((MsysThreadId) A08).A00);
            }
            throw AnonymousClass7TE.A0z("Expected threadId");
        }
        if (valueOf != null) {
            return AnonymousClass7TE.A1I(new PR9((CompoundButton.OnCheckedChangeListener) new C71460Ol1(valueOf, this, 1), 2131959830, n4p.A0l));
        }
        throw AnonymousClass7TE.A0z("Expected threadId");
    }

    public final boolean isEnabled() {
        boolean z;
        String valueOf;
        N4P n4p = this.A01;
        C242243Te r0 = n4p.A0E;
        if (r0 != null) {
            z = r0.A0Q;
        } else {
            z = false;
        }
        if (!n4p.A0v || C66640Ma9.A03(n4p) || n4p.A0n || n4p.A0B()) {
            return false;
        }
        1Av r3 = this.A03;
        if (!r3.A21() || !AnonymousClass7TG.A1a(r3, r3.A62, 1Av.A8a, 200) || !this.A02.A00(C376179Gx.PSEUDO_CO_PRESENCE_ENABLED)) {
            return false;
        }
        C254743sy A08 = n4p.A08();
        if (C66647MaG.A04(A08) != null) {
            valueOf = C66647MaG.A09(A08);
        } else if (!(A08 instanceof MsysThreadId)) {
            return false;
        } else {
            valueOf = String.valueOf(((MsysThreadId) A08).A00);
        }
        if (valueOf == null) {
            return false;
        }
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A06, userSession, 36314493948529272L)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36310319240380430L) || z || 182.A06(r2, userSession, 36314493950298748L) || 182.A06(r2, userSession, 36314493951740544L)) {
            return false;
        }
        return true;
    }

    public P2V(UserSession userSession, Capabilities capabilities, N4P n4p, 1Av r4) {
        C51972G9s.A1B(userSession, r4);
        this.A00 = userSession;
        this.A01 = n4p;
        this.A02 = capabilities;
        this.A03 = r4;
    }
}
