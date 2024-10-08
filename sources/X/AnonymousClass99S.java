package X;

import java.util.Arrays;

/* renamed from: X.99S  reason: invalid class name */
public final class AnonymousClass99S extends AnonymousClass99T {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C3743699e A04;
    public final C3743799f A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass99S)) {
            return false;
        }
        AnonymousClass99S r4 = (AnonymousClass99S) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A03 == this.A03 && r4.A05 == this.A05 && r4.A04 == this.A04) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{AnonymousClass99S.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A05, this.A04});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.A05);
        sb.append(", hashType: ");
        sb.append(this.A04);
        sb.append(", ");
        sb.append(this.A02);
        sb.append("-byte IV, and ");
        sb.append(this.A03);
        sb.append("-byte tags, and ");
        sb.append(this.A00);
        sb.append("-byte AES key, and ");
        sb.append(this.A01);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    public AnonymousClass99S(C3743699e r1, C3743799f r2, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A05 = r2;
        this.A04 = r1;
    }
}
