package X;

import java.util.Arrays;

/* renamed from: X.5ER  reason: invalid class name */
public final class AnonymousClass5ER {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Integer A04;
    public Integer A05;

    public AnonymousClass5ER(int i, int i2) {
        this.A00 = i;
        this.A02 = i2;
        this.A05 = null;
        this.A04 = null;
        this.A01 = 0;
        this.A03 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5ER)) {
            return false;
        }
        AnonymousClass5ER r4 = (AnonymousClass5ER) obj;
        return this.A00 == r4.A00 && this.A02 == r4.A02 && 2Ob.A00(this.A05, r4.A05) && 2Ob.A00(this.A04, r4.A04) && this.A01 == r4.A01 && this.A03 == r4.A03;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A05, this.A04, Integer.valueOf(this.A01), Integer.valueOf(this.A03)});
    }

    public AnonymousClass5ER() {
    }
}
