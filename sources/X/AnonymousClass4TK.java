package X;

import java.util.Arrays;

/* renamed from: X.4TK  reason: invalid class name */
public final class AnonymousClass4TK {
    public int A00;
    public final int A01;
    public final AnonymousClass4RX[] A02;

    public final AnonymousClass4RX[] A00() {
        return (AnonymousClass4RX[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((AnonymousClass4TK) obj).A02);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 527 + Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public AnonymousClass4TK(AnonymousClass4RX... r2) {
        this.A02 = r2;
        this.A01 = r2.length;
    }
}
