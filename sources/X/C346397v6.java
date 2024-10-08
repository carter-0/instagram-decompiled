package X;

/* renamed from: X.7v6  reason: invalid class name and case insensitive filesystem */
public final class C346397v6 implements C344907sc {
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
            C346397v6 r5 = (C346397v6) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final C344877sZ CAG() {
        return C344877sZ.INPUT_PREVIEW_SIZE;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
