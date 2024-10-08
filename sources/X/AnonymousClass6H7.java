package X;

/* renamed from: X.6H7  reason: invalid class name */
public final class AnonymousClass6H7 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6H7) {
                AnonymousClass6H7 r5 = (AnonymousClass6H7) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0X("Interval(start=", ", end=", ')', this.A01, this.A00);
    }

    public AnonymousClass6H7(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0) {
            throw new IllegalArgumentException("negative start index");
        } else if (i2 < i) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }
}
