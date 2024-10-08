package X;

import java.util.Arrays;

/* renamed from: X.54n  reason: invalid class name */
public final class AnonymousClass54n {
    public final int A00;
    public final 1N8 A01;
    public final 1EK A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass54n)) {
            return false;
        }
        AnonymousClass54n r4 = (AnonymousClass54n) obj;
        return this.A03.equals(r4.A03) && this.A00 == r4.A00 && this.A01.equals(r4.A01) && this.A02.equals(r4.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01.hashCode()), Integer.valueOf(this.A02.hashCode())});
    }

    public AnonymousClass54n(1N8 r1, 1EK r2, String str, int i) {
        this.A03 = str;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }
}
