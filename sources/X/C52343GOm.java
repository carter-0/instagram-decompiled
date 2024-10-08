package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.GOm  reason: case insensitive filesystem */
public final class C52343GOm implements C282125Bt {
    public final Set A00;

    public final List ELC(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            if (this.A00.contains(((AnonymousClass9J4) ((AnonymousClass9IV) next).A01).A04)) {
                A0q.add(next);
            }
        }
        return A0q;
    }

    public C52343GOm(Set set) {
        this.A00 = set;
    }
}
