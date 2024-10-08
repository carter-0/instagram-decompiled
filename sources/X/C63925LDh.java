package X;

import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LDh  reason: case insensitive filesystem */
public final class C63925LDh {
    public C71002OVz A00 = C71002OVz.A03;
    public final 0mM A01 = new 0mM(AnonymousClass7TF.A0D(), new C64889Ljp(this, 3), 300);
    public final KUX A02;
    public final UserSession A03;
    public final AnonymousClass0eK A04;

    public final void A00(C71002OVz oVz) {
        C71002OVz oVz2 = this.A00;
        if (oVz2 == C71002OVz.A03 || !oVz.equals(oVz2)) {
            this.A00 = oVz;
            UserSession userSession = this.A03;
            List list = oVz.A02;
            1OC A002 = C63450KxF.A00((GiphyRequestSurface) this.A04.get(), userSession, oVz.A00, list);
            C61500KAf.A00(A002, this, 13);
            1ES.A03(A002);
        }
    }

    public C63925LDh(UserSession userSession, KUX kux, AnonymousClass0eK r8) {
        this.A03 = userSession;
        this.A02 = kux;
        this.A04 = r8;
    }
}
