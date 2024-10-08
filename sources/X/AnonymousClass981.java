package X;

import java.util.Arrays;

/* renamed from: X.981  reason: invalid class name */
public final class AnonymousClass981 extends AnonymousClass982 {
    public final int A00;
    public final AnonymousClass98C A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass981)) {
            return false;
        }
        AnonymousClass981 r4 = (AnonymousClass981) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{AnonymousClass981.class, Integer.valueOf(this.A00), this.A01});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AesSiv Parameters (variant: ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A00);
        sb.append("-byte key)");
        return sb.toString();
    }

    public AnonymousClass981(AnonymousClass98C r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
