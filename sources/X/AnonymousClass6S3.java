package X;

import java.util.Arrays;

/* renamed from: X.6S3  reason: invalid class name */
public final class AnonymousClass6S3 {
    public final C307456Qe A00;
    public final C276544tV A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass6S3)) {
            return false;
        }
        AnonymousClass6S3 r4 = (AnonymousClass6S3) obj;
        if (this.A01 != r4.A01 || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public AnonymousClass6S3(C307456Qe r1, C276544tV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
