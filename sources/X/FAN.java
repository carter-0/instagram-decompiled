package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.Set;

public final class FAN {
    public Set A00 = DbS.A0y();
    public final ExV A01 = new ExV();
    public final C49462Ew3 A02 = new C49462Ew3();
    public final Set A03 = DbS.A0y();

    public static final void A00(C47159Dra dra, FAN fan, boolean z) {
        Set set;
        dra.A04 = true;
        dra.A03 = z;
        fan.A03.add(dra);
        ExV exV = fan.A01;
        DirectShareTarget directShareTarget = dra.A07;
        0qQ.A0B(directShareTarget, 0);
        exV.A01.remove(directShareTarget);
        if (z) {
            set = exV.A02;
        } else {
            set = exV.A00;
        }
        set.add(directShareTarget);
        C49462Ew3 ew3 = fan.A02;
        F31 f31 = new F31(directShareTarget);
        Set set2 = ew3.A01;
        if (set2.contains(f31)) {
            set2.remove(f31);
        } else {
            ew3.A00.add(f31);
        }
    }
}
