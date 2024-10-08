package X;

/* renamed from: X.Juq  reason: case insensitive filesystem */
public final class C60994Juq extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60994Juq) {
                C60994Juq juq = (C60994Juq) obj;
                if (!(this.A04 == juq.A04 && 0qQ.A0K(this.A03, juq.A03) && this.A02 == juq.A02 && this.A01 == juq.A01 && this.A00 == juq.A00 && this.A05 == juq.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, (((((((C51965G9l.A05(this.A04) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public C60994Juq(String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CoverImage(isCustom=");
        A1A.append(this.A04);
        A1A.append(", filepath=");
        A1A.append(this.A03);
        A1A.append(", width=");
        A1A.append(this.A02);
        A1A.append(", height=");
        A1A.append(this.A01);
        A1A.append(", fromVideoTimeMs=");
        A1A.append(this.A00);
        A1A.append(", isFromVideoEdited=");
        return G9t.A1C(A1A, this.A05);
    }
}
