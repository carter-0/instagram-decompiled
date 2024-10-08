package X;

import java.util.Arrays;

/* renamed from: X.9AV  reason: invalid class name */
public final class AnonymousClass9AV extends AnonymousClass99T {
    public final C39880ADc A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9AV)) {
            return false;
        }
        AnonymousClass9AV r4 = (AnonymousClass9AV) obj;
        if (!r4.A01.equals(this.A01) || !r4.A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{AnonymousClass9AV.class, this.A01, this.A00});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(this.A01);
        sb.append(", variant: ");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public AnonymousClass9AV(C39880ADc aDc, String str) {
        this.A01 = str;
        this.A00 = aDc;
    }
}
