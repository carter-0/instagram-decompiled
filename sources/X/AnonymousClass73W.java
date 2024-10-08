package X;

/* renamed from: X.73W  reason: invalid class name */
public final class AnonymousClass73W extends AnonymousClass0T0 implements C242713Vq {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass73W) {
                AnonymousClass73W r5 = (AnonymousClass73W) obj;
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

    public AnonymousClass73W(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
