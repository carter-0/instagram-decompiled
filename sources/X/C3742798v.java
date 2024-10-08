package X;

import java.util.Arrays;

/* renamed from: X.98v  reason: invalid class name and case insensitive filesystem */
public final class C3742798v extends C3742898w {
    public final int A00;
    public final int A01;
    public final C3742598t A02;
    public final C3742298q A03;

    public final int A01() {
        C3742298q r1 = this.A03;
        if (r1 == C3742298q.A03) {
            return this.A01;
        }
        if (r1 == C3742298q.A04 || r1 == C3742298q.A01 || r1 == C3742298q.A02) {
            return this.A01 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3742798v)) {
            return false;
        }
        C3742798v r4 = (C3742798v) obj;
        if (r4.A00 == this.A00 && r4.A01() == A01() && r4.A03 == this.A03 && r4.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C3742798v.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A03, this.A02});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMAC Parameters (variant: ");
        sb.append(this.A03);
        sb.append(", hashType: ");
        sb.append(this.A02);
        sb.append(", ");
        sb.append(this.A01);
        sb.append("-byte tags, and ");
        sb.append(this.A00);
        sb.append("-byte key)");
        return sb.toString();
    }

    public C3742798v(C3742598t r1, C3742298q r2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r2;
        this.A02 = r1;
    }
}
