package X;

import java.util.HashSet;
import java.util.Set;

public final class WU7 implements C250603lj {
    public final C18008Vjk A00;
    public final Set A01 = new HashSet();

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        boolean A1U = AnonymousClass7TF.A1U(0, r6, r7);
        if (r7.CEk(r6) == AnonymousClass05K.A00) {
            Set set = this.A01;
            C45411Cvr cvr = (C45411Cvr) r6.A03;
            String str = cvr.A05;
            0qQ.A07(str);
            if (set.add(str)) {
                C18008Vjk vjk = this.A00;
                String A0R = 002.A0R(cvr.A05, "_component");
                0qQ.A0B(A0R, 0);
                vjk.A01(A0R, A1U);
            }
        }
    }

    public WU7(C18008Vjk vjk) {
        this.A00 = vjk;
    }
}
