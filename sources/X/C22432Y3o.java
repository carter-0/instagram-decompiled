package X;

import java.util.Iterator;

/* renamed from: X.Y3o  reason: case insensitive filesystem */
public final class C22432Y3o implements Iterator, C62650uo {
    public final C22436Y3s A00;

    public C22432Y3o(AnonymousClass6G6 r4) {
        0qQ.A0B(r4, 1);
        this.A00 = new C22436Y3s(r4.A00, r4.A02);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        C22436Y3s y3s = this.A00;
        Object obj = y3s.A00;
        y3s.next();
        return obj;
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
