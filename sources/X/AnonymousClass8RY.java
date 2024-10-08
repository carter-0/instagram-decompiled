package X;

/* renamed from: X.8RY  reason: invalid class name */
public final class AnonymousClass8RY extends AnonymousClass8RZ {
    public final int A00;
    public final int A01;

    public AnonymousClass8RY(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8RY) {
                AnonymousClass8RY r5 = (AnonymousClass8RY) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return 002.A0X("AudioAdjustState(selectedIndex=", ", selectedRow=", ')', this.A00, this.A01);
    }
}
