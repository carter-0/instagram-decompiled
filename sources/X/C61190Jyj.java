package X;

/* renamed from: X.Jyj  reason: case insensitive filesystem */
public final class C61190Jyj extends AnonymousClass0T0 implements C66472MTa {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61190Jyj) {
                C61190Jyj jyj = (C61190Jyj) obj;
                if (!(this.A00 == jyj.A00 && 0qQ.A0K(this.A02, jyj.A02) && 0qQ.A0K(this.A01, jyj.A01) && this.A03 == jyj.A03 && this.A04 == jyj.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CbS() {
        return this.A04;
    }

    public final String getName() {
        return this.A02;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A03, ((((this.A00 * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public C61190Jyj(Integer num, String str, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioFilterModel(filterId=");
        A1A.append(this.A00);
        A1A.append(", name=");
        A1A.append(this.A02);
        A1A.append(", icon=");
        A1A.append(this.A01);
        A1A.append(", isFiltering=");
        A1A.append(this.A03);
        A1A.append(", isSelected=");
        return G9t.A1C(A1A, this.A04);
    }
}
