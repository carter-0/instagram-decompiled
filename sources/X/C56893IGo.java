package X;

/* renamed from: X.IGo  reason: case insensitive filesystem */
public final class C56893IGo implements JNY {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56893IGo) {
                C56893IGo iGo = (C56893IGo) obj;
                if (!(this.A01 == iGo.A01 && this.A00 == iGo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void AC8(C56159Htn htn) {
        if (htn.A01 != -1) {
            htn.A01 = -1;
            htn.A00 = -1;
        }
        int i = this.A01;
        int A002 = htn.A04.A00();
        int A03 = C229632nm.A03(i, 0, A002);
        int A032 = C229632nm.A03(this.A00, 0, A002);
        if (A03 == A032) {
            return;
        }
        if (A03 < A032) {
            htn.A02(A03, A032);
        } else {
            htn.A02(A032, A03);
        }
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0X("SetComposingRegionCommand(start=", ", end=", ')', this.A01, this.A00);
    }

    public C56893IGo(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
