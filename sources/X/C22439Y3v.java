package X;

import java.util.Iterator;

/* renamed from: X.Y3v  reason: case insensitive filesystem */
public final class C22439Y3v implements Iterator, AnonymousClass0s4 {
    public final Y74 A00;

    public C22439Y3v(C21084XDx xDx) {
        0qQ.A0B(xDx, 1);
        C22430Y3m[] y3mArr = new C22430Y3m[8];
        int i = 0;
        do {
            y3mArr[i] = new Y78(this);
            i++;
        } while (i < 8);
        this.A00 = new Y74(xDx, y3mArr);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        this.A00.remove();
    }
}
