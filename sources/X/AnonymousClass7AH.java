package X;

import java.util.Arrays;

/* renamed from: X.7AH  reason: invalid class name */
public final class AnonymousClass7AH {
    public final int A00;
    public final String A01;
    public final C3259474u A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7AH)) {
            return false;
        }
        AnonymousClass7AH r4 = (AnonymousClass7AH) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00 && this.A02.equals(r4.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01, this.A02});
    }

    public final String toString() {
        int i = this.A00;
        String str = this.A01;
        return 002.A0x("PhoneNumberMatch [", ",", ") ", str, i, i + str.length());
    }

    public AnonymousClass7AH(C3259474u r3, String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        } else if (str != null) {
            this.A00 = i;
            this.A01 = str;
            this.A02 = r3;
        } else {
            throw null;
        }
    }
}
