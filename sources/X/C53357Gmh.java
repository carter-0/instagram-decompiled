package X;

/* renamed from: X.Gmh  reason: case insensitive filesystem */
public final class C53357Gmh extends AnonymousClass0T0 {
    public final int A00;
    public final C266444Yx A01;
    public final C54617HLa A02;
    public final HNK A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53357Gmh) {
                C53357Gmh gmh = (C53357Gmh) obj;
                if (!(this.A03 == gmh.A03 && 0qQ.A0K(this.A01, gmh.A01) && this.A02 == gmh.A02 && this.A05 == gmh.A05 && this.A04 == gmh.A04 && this.A00 == gmh.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03))))) + this.A00;
    }

    public C53357Gmh(C266444Yx r1, C54617HLa hLa, HNK hnk, int i, boolean z, boolean z2) {
        AnonymousClass7TG.A1P(hnk, hLa);
        this.A03 = hnk;
        this.A01 = r1;
        this.A02 = hLa;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }

    public C53357Gmh() {
        this(JUH.A00(""), C54617HLa.LOADING, HNK.NOBODY, 2131975590, true, false);
    }
}
