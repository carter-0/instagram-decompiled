package X;

import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CJ2 extends 17P implements AnonymousClass60K {
    public final AnonymousClass60J F1s(1E9 r6) {
        List<C46227DRi> A0o = A0o(473174317, CJ1.class);
        ArrayList A0p = AnonymousClass7TF.A0p(A0o);
        for (C46227DRi F1r : A0o) {
            A0p.add(F1r.F1r(r6));
        }
        List A0o2 = A0o(631414135, ImmutablePandoUserDict.class);
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0o2);
        Iterator it = A0o2.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r6, A0p2, it);
        }
        ArrayList A0p3 = AnonymousClass7TF.A0p(A0p2);
        Iterator it2 = A0p2.iterator();
        while (it2.hasNext()) {
            C41847B3o.A1Q(r6, A0p3, it2);
        }
        return new AnonymousClass60J(A0p, A0p3);
    }
}
