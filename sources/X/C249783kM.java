package X;

import java.util.NoSuchElementException;

/* renamed from: X.3kM  reason: invalid class name and case insensitive filesystem */
public abstract class C249783kM extends C249793kN {
    public int A00;
    public final int A01;

    public abstract Object A00(int i);

    public final boolean hasNext() {
        if (this.A00 < this.A01) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.A00 > 0) {
            return true;
        }
        return false;
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public C249783kM(int i, int i2) {
        17k.A02(i2, i);
        this.A01 = i;
        this.A00 = i2;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return A00(i);
        }
        throw new NoSuchElementException();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return A00(i);
        }
        throw new NoSuchElementException();
    }
}
