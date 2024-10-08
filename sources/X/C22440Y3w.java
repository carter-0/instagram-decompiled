package X;

import java.util.Iterator;

/* renamed from: X.Y3w  reason: case insensitive filesystem */
public final class C22440Y3w implements Iterator, AnonymousClass0s4 {
    public final C22443Y3z A00;

    public C22440Y3w(C21085XDy xDy) {
        0qQ.A0B(xDy, 1);
        this.A00 = new C22443Y3z(xDy.A00, xDy);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C22443Y3z y3z = this.A00;
        C21086XDz A002 = y3z.next();
        return new C22505Y6y(y3z.A01, y3z.A05.A03, A002);
    }

    public final void remove() {
        this.A00.remove();
    }
}
