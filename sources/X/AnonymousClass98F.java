package X;

import java.util.Arrays;

/* renamed from: X.98F  reason: invalid class name */
public final class AnonymousClass98F {
    public final C3740497y A00;
    public final Class A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass98F)) {
            return false;
        }
        AnonymousClass98F r4 = (AnonymousClass98F) obj;
        if (!r4.A01.equals(this.A01) || !r4.A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.getSimpleName());
        sb.append(", object identifier: ");
        sb.append(this.A00);
        return sb.toString();
    }

    public AnonymousClass98F(C3740497y r1, Class cls) {
        this.A01 = cls;
        this.A00 = r1;
    }
}
