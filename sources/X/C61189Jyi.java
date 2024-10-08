package X;

/* renamed from: X.Jyi  reason: case insensitive filesystem */
public final class C61189Jyi extends AnonymousClass0T0 implements C66472MTa {
    public final int A00;
    public final String A01;
    public final 0sL A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61189Jyi) {
                C61189Jyi jyi = (C61189Jyi) obj;
                if (this.A00 != jyi.A00 || !0qQ.A0K(this.A01, jyi.A01) || this.A03 != jyi.A03 || !0qQ.A0K(this.A02, jyi.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CbS() {
        return this.A03;
    }

    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A03, ((this.A00 * 31) + AnonymousClass7TG.A0E(this.A01)) * 31));
    }

    public C61189Jyi(String str, 0sL r2, int i, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = z;
        this.A02 = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ColorFilterModel(filterId=");
        A1A.append(this.A00);
        A1A.append(", name=");
        A1A.append(this.A01);
        A1A.append(", isSelected=");
        A1A.append(this.A03);
        A1A.append(", loadIcon=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
