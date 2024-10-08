package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.PcX  reason: case insensitive filesystem */
public final class C73432PcX implements Iterator, C62650uo {
    public int A00;
    public Iterator A01;
    public final Iterator A02;
    public final /* synthetic */ C73520Pe3 A03;

    public C73432PcX(C73520Pe3 pe3) {
        this.A03 = pe3;
        this.A02 = pe3.A02.iterator();
    }

    private final boolean A00() {
        Iterator it;
        Iterator it2 = this.A01;
        if (it2 == null || !it2.hasNext()) {
            do {
                Iterator it3 = this.A02;
                if (it3.hasNext()) {
                    Object next = it3.next();
                    C73520Pe3 pe3 = this.A03;
                    it = (Iterator) pe3.A00.invoke(pe3.A01.invoke(next));
                } else {
                    this.A00 = 2;
                    this.A01 = null;
                    return false;
                }
            } while (!it.hasNext());
            this.A01 = it;
        }
        this.A00 = 1;
        return true;
    }

    public final boolean hasNext() {
        int i = this.A00;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return A00();
    }

    public final Object next() {
        int i = this.A00;
        if (i == 2) {
            throw new NoSuchElementException();
        } else if (i != 0 || A00()) {
            this.A00 = 0;
            Iterator it = this.A01;
            0qQ.A0A(it);
            return it.next();
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(462));
    }
}
