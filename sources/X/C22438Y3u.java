package X;

import java.util.Iterator;

/* renamed from: X.Y3u  reason: case insensitive filesystem */
public final class C22438Y3u implements Iterator, AnonymousClass0s4 {
    public final XGE A00;

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        this.A00.remove();
    }

    public C22438Y3u(C286845Ya r5) {
        C294305mE[] r2 = new C294305mE[8];
        int i = 0;
        do {
            r2[i] = new XGH(this);
            i++;
        } while (i < 8);
        this.A00 = new XGE(r5, r2);
    }
}
