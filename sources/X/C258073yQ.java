package X;

import java.util.NoSuchElementException;

/* renamed from: X.3yQ  reason: invalid class name and case insensitive filesystem */
public final class C258073yQ extends C249803kO {
    public Object A00;

    public final boolean hasNext() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object obj = this.A00;
        this.A00 = null;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
