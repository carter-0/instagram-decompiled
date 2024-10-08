package X;

import java.util.NoSuchElementException;

/* renamed from: X.Wz9  reason: case insensitive filesystem */
public final class C20797Wz9 extends AnonymousClass6BX {
    public final Object A00;

    public C20797Wz9(Object obj, int i) {
        this.A00 = i;
        this.A01 = 1;
        this.A00 = obj;
    }

    public final Object next() {
        if (hasNext()) {
            this.A00++;
            return this.A00;
        }
        throw new NoSuchElementException();
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.A00--;
            return this.A00;
        }
        throw new NoSuchElementException();
    }
}
