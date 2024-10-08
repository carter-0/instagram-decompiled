package X;

import java.util.Iterator;

/* renamed from: X.Y3n  reason: case insensitive filesystem */
public final class C22431Y3n implements Iterator, C62650uo {
    public final C22436Y3s A00;

    public C22431Y3n(AnonymousClass6G6 r4) {
        0qQ.A0B(r4, 1);
        this.A00 = new C22436Y3s(r4.A00, r4.A02);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C22436Y3s y3s = this.A00;
        return new Y41(y3s.A00, y3s.next().A02);
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
