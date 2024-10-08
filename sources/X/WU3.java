package X;

import com.instagram.discovery.refinement.model.Refinement;
import java.util.HashSet;
import java.util.Set;

public final class WU3 implements C250603lj {
    public final X44 A00;
    public final Set A01 = new HashSet();

    public WU3(X44 x44) {
        this.A00 = x44;
    }

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        AnonymousClass7TG.A1N(r4, r5);
        Refinement refinement = (Refinement) r4.A03;
        if (r5.CEk(r4) == AnonymousClass05K.A00) {
            Set set = this.A01;
            String A002 = refinement.A00();
            0qQ.A07(A002);
            if (set.add(A002)) {
                Object obj = r4.A04;
                0qQ.A06(obj);
                ((Number) obj).intValue();
            }
        }
    }
}
