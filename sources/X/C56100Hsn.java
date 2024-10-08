package X;

/* renamed from: X.Hsn  reason: case insensitive filesystem */
public final class C56100Hsn {
    public final int A00;
    public final long A01;
    public final C52430GSi A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56100Hsn) {
                C56100Hsn hsn = (C56100Hsn) obj;
                if (!(this.A02 == hsn.A02 && this.A00 == hsn.A00 && this.A01 == hsn.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + this.A00) * 31) + C51968G9o.A03(this.A01);
    }

    public C56100Hsn(C52430GSi gSi, int i, long j) {
        this.A02 = gSi;
        this.A00 = i;
        this.A01 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AnchorInfo(direction=");
        A1A.append(this.A02);
        A1A.append(", offset=");
        A1A.append(this.A00);
        A1A.append(", selectableId=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
