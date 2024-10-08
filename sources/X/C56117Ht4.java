package X;

/* renamed from: X.Ht4  reason: case insensitive filesystem */
public final class C56117Ht4 {
    public final long A00;
    public final HL1 A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56117Ht4) {
                C56117Ht4 ht4 = (C56117Ht4) obj;
                if (!(this.A01 == ht4.A01 && this.A00 == ht4.A00 && this.A02 == ht4.A02 && this.A03 == ht4.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A07 = C51972G9s.A07(this.A00, AnonymousClass7TE.A0K(this.A01));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        return DbS.A06(this.A03, C51971G9r.A0F(str, intValue, A07));
    }

    public C56117Ht4(HL1 hl1, Integer num, long j, boolean z) {
        this.A01 = hl1;
        this.A00 = j;
        this.A02 = num;
        this.A03 = z;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SelectionHandleInfo(handle=");
        A1A.append(this.A01);
        A1A.append(", position=");
        G9w.A0z(this.A00, A1A);
        A1A.append(", anchor=");
        switch (this.A02.intValue()) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        A1A.append(str);
        A1A.append(AnonymousClass000.A00(2056));
        return G9t.A1C(A1A, this.A03);
    }
}
