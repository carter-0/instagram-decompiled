package X;

import java.util.NoSuchElementException;

/* renamed from: X.2gn  reason: invalid class name and case insensitive filesystem */
public final class C226422gn extends 0sh {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public final int A00() {
        int i = this.A00;
        if (i != this.A02) {
            this.A00 = this.A03 + i;
            return i;
        } else if (this.A01) {
            this.A01 = false;
            return i;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final boolean hasNext() {
        return this.A01;
    }

    public C226422gn(int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.A01 = z;
        this.A00 = !z ? i2 : i;
    }
}
