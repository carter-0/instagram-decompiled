package X;

import java.util.Iterator;

public final class TAL implements Iterable {
    public final /* synthetic */ C7246Q0s A00;
    public final /* synthetic */ CharSequence A01;

    public TAL(C7246Q0s q0s, CharSequence charSequence) {
        this.A00 = q0s;
        this.A01 = charSequence;
    }

    public final Iterator iterator() {
        C7246Q0s q0s = this.A00;
        return new C8634QyX(q0s.A01, q0s, this.A01);
    }

    public final String toString() {
        C239023El r2 = new C239023El(", ");
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('[');
        r2.A03(A1A, iterator());
        return Pxg.A0w(A1A);
    }
}
