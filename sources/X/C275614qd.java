package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4qd  reason: invalid class name and case insensitive filesystem */
public final class C275614qd implements Iterator, AnonymousClass4D7, C62650uo {
    public int A00;
    public Iterator A01;
    public AnonymousClass4D7 A02;
    public Object A03;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final RuntimeException A00() {
        int i = this.A00;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i != 5) {
            return new IllegalStateException(002.A0O("Unexpected state of the iterator: ", i));
        }
        return new IllegalStateException("Iterator has failed.");
    }

    public final 1Hj A02(Object obj, AnonymousClass4D7 r3) {
        this.A03 = obj;
        this.A00 = 3;
        this.A02 = r3;
        return 1Hj.A02;
    }

    public final C262094Cc getContext() {
        return 19B.A00;
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.A00;
            if (i != 0) {
                if (i == 1) {
                    Iterator it = this.A01;
                    0qQ.A0A(it);
                    if (it.hasNext()) {
                        this.A00 = 2;
                        return true;
                    }
                    this.A01 = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw A00();
                }
            }
            this.A00 = 5;
            AnonymousClass4D7 r1 = this.A02;
            0qQ.A0A(r1);
            this.A02 = null;
            r1.resumeWith(C60340gF.A00);
        }
    }

    public final Object next() {
        int i = this.A00;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.A00 = 1;
            Iterator it = this.A01;
            0qQ.A0A(it);
            return it.next();
        } else if (i == 3) {
            this.A00 = 0;
            Object obj = this.A03;
            this.A03 = null;
            return obj;
        } else {
            throw A00();
        }
    }

    public final Object A01(AnonymousClass4D7 r3, AnonymousClass2U7 r4) {
        C60340gF r1;
        Iterator it = r4.iterator();
        if (!it.hasNext()) {
            r1 = C60340gF.A00;
        } else {
            this.A01 = it;
            this.A00 = 2;
            this.A02 = r3;
            r1 = 1Hj.A02;
        }
        if (r1 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return r1;
    }

    public final void resumeWith(Object obj) {
        0eS.A00(obj);
        this.A00 = 4;
    }
}
