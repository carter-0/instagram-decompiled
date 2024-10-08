package X;

/* renamed from: X.IGm  reason: case insensitive filesystem */
public final class C56891IGm implements JNY {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56891IGm) {
                C56891IGm iGm = (C56891IGm) obj;
                if (!(this.A01 == iGm.A01 && this.A00 == iGm.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void AC8(C56159Htn htn) {
        int i = htn.A02;
        int i2 = this.A00;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = htn.A04.A00();
        }
        htn.A01(i, Math.min(i3, htn.A04.A00()));
        int i4 = htn.A03;
        int i5 = this.A01;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        htn.A01(Math.max(0, i6), i4);
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0X("DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ')', this.A01, this.A00);
    }

    public C56891IGm(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i2 < 0) {
            throw AnonymousClass7TE.A0w(002.A0n("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
