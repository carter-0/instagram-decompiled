package X;

import java.util.Iterator;
import java.util.Map;

public final class AfI implements MUB {
    public final /* synthetic */ N4R A00;
    public final /* synthetic */ AnonymousClass8k0 A01;
    public final /* synthetic */ C40443AcE A02;

    public AfI(N4R n4r, AnonymousClass8k0 r2, C40443AcE acE) {
        this.A02 = acE;
        this.A00 = n4r;
        this.A01 = r2;
    }

    public final void DED() {
        this.A01.DEc("UnifiedConfigCrossPostingSettingMutator - Mutation failed");
    }

    public final void DoX(C383559fm r6) {
        C40443AcE acE = this.A02;
        Iterator A0u = AnonymousClass7TF.A0u((Map) this.A00.A02);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            int ordinal = ((C390849rw) A1J.getKey()).ordinal();
            if (ordinal == 0) {
                boolean A1a = AnonymousClass7TE.A1a(A1J.getValue());
                0xY A0p = AnonymousClass7TE.A0p((1Av) acE.A02.getValue());
                A0p.E5T("auto_cross_post_to_facebook_feed", A1a);
                A0p.apply();
            } else if (ordinal == 1) {
                ((1Av) acE.A02.getValue()).A1L(AnonymousClass7TE.A1a(A1J.getValue()));
            } else if (ordinal == 2) {
                ((2D6) acE.A01.getValue()).A09(AnonymousClass7TE.A1a(A1J.getValue()));
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
    }
}
