package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.HashSet;

public final class IPK implements C250603lj {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final SavedCollection A02;
    public final HashSet A03 = AnonymousClass7TE.A1F();

    public IPK(AnonymousClass0iw r2, UserSession userSession, SavedCollection savedCollection) {
        this.A01 = userSession;
        this.A02 = savedCollection;
        this.A00 = r2;
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        AnonymousClass7TG.A1N(r9, r10);
        if (r10.CEk(r9) == AnonymousClass05K.A00) {
            1Xj BPf = ((C296965qw) r9.A03).BPf();
            if (this.A03.add(BPf.getId())) {
                C296995qz r0 = ((C52528GWf) r9.A04).A00;
                int i = r0.A01;
                int i2 = r0.A00;
                AnonymousClass0iw r02 = this.A00;
                UserSession userSession = this.A01;
                SavedCollection savedCollection = this.A02;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r02, userSession), AnonymousClass000.A00(3368));
                if (A0e.isSampled()) {
                    String A012 = C320166rs.A01(i, i2);
                    User A2A = BPf.A2A(userSession);
                    A0e.AAJ("collection_id", savedCollection.A0F);
                    A0e.AAJ("collection_name", savedCollection.A0G);
                    A0e.AAJ("position", A012);
                    A0e.A9O(C273654mx.A00(144), "");
                    C51974G9v.A0p(A0e, BPf, "nav_chain", DbS.A0k());
                    C51965G9l.A1I(A0e, BPf.getId());
                    A0e.AAJ("algorithm", BPf.A0C.getAlgorithm());
                    if (A2A != null) {
                        A0e.A9F("a_pk", C51972G9s.A0h(A2A));
                    }
                    G9w.A17(A0e);
                }
            }
        }
    }
}
