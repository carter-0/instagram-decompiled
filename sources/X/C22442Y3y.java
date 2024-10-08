package X;

import java.util.Iterator;

/* renamed from: X.Y3y  reason: case insensitive filesystem */
public final class C22442Y3y implements Iterator, AnonymousClass0s4 {
    public final C22443Y3z A00;

    public C22442Y3y(C21085XDy xDy) {
        0qQ.A0B(xDy, 1);
        this.A00 = new C22443Y3z(xDy.A00, xDy);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        return this.A00.next().A02;
    }

    public final void remove() {
        this.A00.remove();
    }
}
