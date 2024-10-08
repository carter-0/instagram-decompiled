package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.MdE  reason: case insensitive filesystem */
public final class C66822MdE implements 1xN {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public C66822MdE(C67711MtQ mtQ, C62320sa r3) {
        this.A02 = mtQ;
        this.A01 = r3;
    }

    public final void Dne(Set set) {
        if (this.A00 != 0) {
            HashSet A12 = C66580MXl.A12((Collection) this.A02);
            A12.retainAll(set);
            if (!A12.isEmpty()) {
                ((C74336PtC) this.A01).Dnd();
            }
        } else if (set.contains("fetch_pake_messages")) {
            DbS.A1U(this.A01);
        }
    }

    public C66822MdE(C74336PtC ptC) {
        this.A01 = ptC;
        this.A02 = C66580MXl.A12(Collections.singleton("active_safety_interventions"));
    }
}
