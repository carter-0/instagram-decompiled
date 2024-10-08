package X;

/* renamed from: X.IGn  reason: case insensitive filesystem */
public final class C56892IGn implements JNY {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56892IGn) {
                C56892IGn iGn = (C56892IGn) obj;
                if (!(this.A01 == iGn.A01 && this.A00 == iGn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void AC8(C56159Htn htn) {
        int i = this.A01;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < i) {
                i4++;
                int i5 = htn.A03;
                if (i5 <= i4) {
                    i4 = i5;
                    break;
                }
                char A002 = htn.A00((i5 - i4) - 1);
                char A003 = htn.A00(htn.A03 - i4);
                if (Character.isHighSurrogate(A002) && Character.isLowSurrogate(A003)) {
                    i4++;
                }
                i3++;
            } else {
                break;
            }
        }
        int i6 = this.A00;
        int i7 = 0;
        while (true) {
            if (i2 < i6) {
                i7++;
                int i8 = htn.A02;
                int i9 = i8 + i7;
                int A004 = htn.A04.A00();
                if (i9 >= A004) {
                    i7 = A004 - i8;
                    break;
                }
                char A005 = htn.A00((i8 + i7) - 1);
                char A006 = htn.A00(htn.A02 + i7);
                if (Character.isHighSurrogate(A005) && Character.isLowSurrogate(A006)) {
                    i7++;
                }
                i2++;
            } else {
                break;
            }
        }
        int i10 = htn.A02;
        htn.A01(i10, i10 + i7);
        int i11 = htn.A03;
        htn.A01(i11 - i4, i11);
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0X("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ')', this.A01, this.A00);
    }

    public C56892IGn(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i2 < 0) {
            throw AnonymousClass7TE.A0w(002.A0n("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
