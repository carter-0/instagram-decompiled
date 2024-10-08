package X;

import java.util.NoSuchElementException;

/* renamed from: X.UWm  reason: case insensitive filesystem */
public final class C15227UWm extends C249803kO {
    public boolean A00;

    public final boolean hasNext() {
        return !this.A00;
    }

    public final Object next() {
        if (!this.A00) {
            this.A00 = true;
            return null;
        }
        throw new NoSuchElementException();
    }
}
