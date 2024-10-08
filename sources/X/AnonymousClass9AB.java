package X;

import java.util.Arrays;

/* renamed from: X.9AB  reason: invalid class name */
public final class AnonymousClass9AB extends AnonymousClass99T {
    public final int A00;
    public final AnonymousClass9AF A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9AB)) {
            return false;
        }
        AnonymousClass9AB r4 = (AnonymousClass9AB) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{AnonymousClass9AB.class, Integer.valueOf(this.A00), this.A01});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A00);
        sb.append("-byte key)");
        return sb.toString();
    }

    public AnonymousClass9AB(AnonymousClass9AF r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
