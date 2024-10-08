package X;

import java.util.Iterator;

/* renamed from: X.Y3p  reason: case insensitive filesystem */
public final class C22433Y3p implements Iterator, C62650uo {
    public final C22436Y3s A00;

    public C22433Y3p(AnonymousClass6G6 r4) {
        0qQ.A0B(r4, 1);
        this.A00 = new C22436Y3s(r4.A00, r4.A02);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        return this.A00.next().A02;
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
