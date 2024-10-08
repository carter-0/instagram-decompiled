package X;

/* renamed from: X.IGq  reason: case insensitive filesystem */
public final class C56895IGq implements JNY {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56895IGq) {
                C56895IGq iGq = (C56895IGq) obj;
                if (!(this.A01 == iGq.A01 && this.A00 == iGq.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void AC8(C56159Htn htn) {
        int i = this.A01;
        int A002 = htn.A04.A00();
        int A03 = C229632nm.A03(i, 0, A002);
        int A032 = C229632nm.A03(this.A00, 0, A002);
        if (A03 < A032) {
            htn.A03(A03, A032);
        } else {
            htn.A03(A032, A03);
        }
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0X("SetSelectionCommand(start=", ", end=", ')', this.A01, this.A00);
    }

    public C56895IGq(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
