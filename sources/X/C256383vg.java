package X;

import java.util.Arrays;

/* renamed from: X.3vg  reason: invalid class name and case insensitive filesystem */
public final class C256383vg {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C256383vg)) {
            return false;
        }
        C256383vg r4 = (C256383vg) obj;
        return this.A00 == r4.A00 && this.A01 == r4.A01 && 2PP.A00(this.A03, r4.A03) && 2PP.A00(this.A02, r4.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public C256383vg(String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = i2;
    }
}
