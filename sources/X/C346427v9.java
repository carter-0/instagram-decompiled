package X;

/* renamed from: X.7v9  reason: invalid class name and case insensitive filesystem */
public final class C346427v9 implements C344907sc {
    public float A00;
    public int A01;
    public int A02;

    public final boolean AOe() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C346427v9 r5 = (C346427v9) obj;
            if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final C344877sZ CAG() {
        return C344877sZ.PREVIEW_VIEW_SIZE;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + ((int) this.A00);
    }
}
