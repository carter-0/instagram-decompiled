package X;

/* renamed from: X.7v8  reason: invalid class name and case insensitive filesystem */
public final class C346417v8 implements C344907sc {
    public int A00;
    public int A01;

    public final boolean AOe() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C346417v8 r5 = (C346417v8) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final C344877sZ CAG() {
        return C344877sZ.INPUT_ROTATION;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }
}
