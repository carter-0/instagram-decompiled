package X;

/* renamed from: X.QvE  reason: case insensitive filesystem */
public final class C8469QvE extends TA9 {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C8469QvE) obj).A00);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TA9 ta9 = (TA9) obj;
        int A02 = ta9.A02();
        if (7 != A02) {
            return 7 - A02;
        }
        C8469QvE qvE = (C8469QvE) ta9;
        int i = 20;
        int i2 = 21;
        if (true != this.A00) {
            i2 = 20;
        }
        if (true == qvE.A00) {
            i = 21;
        }
        return i2 - i;
    }

    public final String toString() {
        return Boolean.toString(this.A00);
    }

    public C8469QvE(boolean z) {
        this.A00 = z;
    }

    public final int hashCode() {
        return Pxf.A0A(Pxe.A0m(), Boolean.valueOf(this.A00));
    }
}
