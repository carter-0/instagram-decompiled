package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.AcD  reason: case insensitive filesystem */
public final class C40442AcD implements B29 {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new Dbl(this, 36));

    public C40442AcD(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void FJh(N4R n4r, AnonymousClass8k0 r6) {
        C59780JXz.A00.A01(this.A00, new AfN(n4r, r6, this), (List) ((AnonymousClass0eM) n4r.A00).getValue());
    }

    public final String getIdentifier() {
        return "BPLMutator";
    }
}
