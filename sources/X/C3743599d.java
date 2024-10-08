package X;

import java.util.Arrays;

/* renamed from: X.99d  reason: invalid class name and case insensitive filesystem */
public final class C3743599d extends AnonymousClass99T {
    public final int A00;
    public final int A01;
    public final int A02 = 16;
    public final C3743399b A03;

    public C3743599d(C3743399b r2, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3743599d)) {
            return false;
        }
        C3743599d r4 = (C3743599d) obj;
        if (r4.A01 == this.A01 && r4.A00 == this.A00 && r4.A02 == this.A02 && r4.A03 == this.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C3743599d.class, Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AesEax Parameters (variant: ");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(this.A00);
        sb.append("-byte IV, ");
        sb.append(this.A02);
        sb.append("-byte tag, and ");
        sb.append(this.A01);
        sb.append("-byte key)");
        return sb.toString();
    }
}
