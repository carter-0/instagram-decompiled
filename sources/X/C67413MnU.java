package X;

import java.util.List;

/* renamed from: X.MnU  reason: case insensitive filesystem */
public final class C67413MnU implements C250603lj {
    public final C55868Hop A00;
    public final C67405MnM A01;

    public C67413MnU(C55868Hop hop, C67405MnM mnM) {
        this.A00 = hop;
        this.A01 = mnM;
    }

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        C55868Hop hop;
        AnonymousClass7TG.A1N(r5, r6);
        if (r6.CEk(r5) != AnonymousClass05K.A0C) {
            C67405MnM mnM = this.A01;
            Object obj = r5.A03;
            if (mnM.AH0(obj.toString()) && (hop = this.A00) != null) {
                List A0i = JTQ.A0i(obj);
                0Aj A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_sources_bottomsheet_impression");
                if (A0e.isSampled()) {
                    C51976G9y.A0Y(A0e, hop, C66584MXp.A0T(A0e, hop));
                    A0e.AAe("third_party_link_list", A0i);
                    A0e.Cgf();
                }
            }
        }
    }
}
