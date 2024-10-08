package X;

/* renamed from: X.GmT  reason: case insensitive filesystem */
public final class C53343GmT extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C67304Mle A03;
    public final C69367Nk7 A04;
    public final 2EM A05;

    public C53343GmT(C67304Mle mle, C69367Nk7 nk7, 2EM r4, int i, int i2, int i3) {
        0qQ.A0B(nk7, 4);
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = nk7;
        this.A03 = mle;
        this.A05 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53343GmT) {
                C53343GmT gmT = (C53343GmT) obj;
                if (!(this.A02 == gmT.A02 && this.A00 == gmT.A00 && this.A01 == gmT.A01 && this.A04 == gmT.A04 && this.A03 == gmT.A03 && 0qQ.A0K(this.A05, gmT.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A04, ((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FilterItem(text=");
        A1A.append(this.A02);
        A1A.append(", leftIcon=");
        A1A.append(this.A00);
        A1A.append(", rightIcon=");
        A1A.append(this.A01);
        A1A.append(", inboxTabViewFilter=");
        A1A.append(this.A04);
        A1A.append(", selectedFilter=");
        A1A.append(this.A03);
        A1A.append(", selectedMode=");
        return AnonymousClass7TG.A0n(this.A05, A1A);
    }
}
