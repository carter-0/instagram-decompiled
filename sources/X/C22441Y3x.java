package X;

import java.util.Iterator;

/* renamed from: X.Y3x  reason: case insensitive filesystem */
public final class C22441Y3x implements Iterator, AnonymousClass0s4 {
    public final C22443Y3z A00;

    public C22441Y3x(C21085XDy xDy) {
        0qQ.A0B(xDy, 1);
        this.A00 = new C22443Y3z(xDy.A00, xDy);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        C22443Y3z y3z = this.A00;
        y3z.next();
        return y3z.A01;
    }

    public final void remove() {
        this.A00.remove();
    }
}
