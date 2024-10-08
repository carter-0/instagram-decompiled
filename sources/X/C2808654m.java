package X;

import java.util.Arrays;

/* renamed from: X.54m  reason: invalid class name and case insensitive filesystem */
public final class C2808654m {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final C2808554l[] A06;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2808654m)) {
            return false;
        }
        C2808654m r4 = (C2808654m) obj;
        return this.A03 == r4.A03 && this.A00 == r4.A00 && this.A01 == r4.A01 && this.A04 == r4.A04 && this.A02 == r4.A02 && this.A05 == r4.A05 && Arrays.equals(this.A06, r4.A06);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A04), Integer.valueOf(this.A02), Boolean.valueOf(this.A05), Integer.valueOf(Arrays.hashCode(this.A06))});
    }

    public C2808654m(C2808554l[] r1, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A02 = i5;
        this.A05 = z;
        this.A06 = r1;
    }
}
