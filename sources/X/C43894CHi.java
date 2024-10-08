package X;

import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CHi  reason: case insensitive filesystem */
public final class C43894CHi extends 17P implements C46233DRo {
    public List A00;

    public final C46233DRo E6z(1E9 r4) {
        List A0o = A0o(559155430, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    public final BDn F09(1E9 r5) {
        List A0o = A0o(559155430, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r5, A0r, it);
        }
        ArrayList A0p = AnonymousClass7TF.A0p(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41848B3p.A1V(r5, A0p, it2);
        }
        List<C46232DRn> A0o2 = A0o(-724653039, COQ.class);
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0o2);
        for (C46232DRn F9E : A0o2) {
            A0p2.add(F9E.F9E());
        }
        return new BDn(A0p, A0p2);
    }
}
