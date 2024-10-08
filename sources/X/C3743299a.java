package X;

import java.util.Arrays;

/* renamed from: X.99a  reason: invalid class name and case insensitive filesystem */
public final class C3743299a extends AnonymousClass99T {
    public final int A00 = 12;
    public final int A01;
    public final int A02 = 16;
    public final AnonymousClass99Y A03;

    public C3743299a(AnonymousClass99Y r3, int i) {
        this.A01 = i;
        this.A03 = r3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3743299a)) {
            return false;
        }
        C3743299a r4 = (C3743299a) obj;
        if (r4.A01 == this.A01 && r4.A00 == this.A00 && r4.A02 == this.A02 && r4.A03 == this.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C3743299a.class, Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AesGcm Parameters (variant: ");
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
