package X;

import java.util.Arrays;

/* renamed from: X.994  reason: invalid class name */
public final class AnonymousClass994 extends C3742898w {
    public final int A00;
    public final int A01;
    public final AnonymousClass992 A02;

    public final int A01() {
        AnonymousClass992 r1 = this.A02;
        if (r1 == AnonymousClass992.A03) {
            return this.A01;
        }
        if (r1 == AnonymousClass992.A04 || r1 == AnonymousClass992.A01 || r1 == AnonymousClass992.A02) {
            return this.A01 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass994)) {
            return false;
        }
        AnonymousClass994 r4 = (AnonymousClass994) obj;
        if (r4.A00 == this.A00 && r4.A01() == A01() && r4.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{AnonymousClass994.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(this.A02);
        sb.append(", ");
        sb.append(this.A01);
        sb.append("-byte tags, and ");
        sb.append(this.A00);
        sb.append("-byte key)");
        return sb.toString();
    }

    public AnonymousClass994(AnonymousClass992 r1, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }
}
