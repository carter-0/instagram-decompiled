package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.AcE  reason: case insensitive filesystem */
public final class C40443AcE implements B29 {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public C40443AcE(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        0eO r2 = 0eO.A02;
        this.A02 = AnonymousClass0eN.A00(r2, new Dbl(this, 39));
        this.A01 = AnonymousClass0eN.A00(r2, new Dbl(this, 38));
    }

    public final void FJh(N4R n4r, AnonymousClass8k0 r6) {
        C64105LNd.A00.A00(this.A00, new AfI(n4r, r6, this), (List) ((AnonymousClass0eM) n4r.A00).getValue());
    }

    public final String getIdentifier() {
        return "UnifiedConfigMutator";
    }
}
