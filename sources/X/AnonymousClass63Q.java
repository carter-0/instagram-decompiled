package X;

import java.util.Arrays;

/* renamed from: X.63Q  reason: invalid class name */
public final class AnonymousClass63Q {
    public final AnonymousClass63K A00;
    public final int A01;
    public final AnonymousClass63L A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof AnonymousClass63Q) {
                    AnonymousClass63Q r5 = (AnonymousClass63Q) obj;
                    if (!SA1.A01(this.A00, r5.A00) || !SA1.A01(this.A02, r5.A02) || !SA1.A01(this.A03, r5.A03)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }

    public AnonymousClass63Q(AnonymousClass63L r2, AnonymousClass63K r3, String str) {
        this.A00 = r3;
        this.A02 = r2;
        this.A03 = str;
        this.A01 = Arrays.hashCode(new Object[]{r3, r2, str});
    }
}
