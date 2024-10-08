package X;

import androidx.compose.foundation.layout.WindowInsets;

public final class IF2 implements WindowInsets {
    public final C284945Oz A00 = C51970G9q.A0S(02M.A04);
    public final C284945Oz A01 = C51969G9p.A0S(AnonymousClass7TE.A0v());
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof IF2) && this.A02 == ((IF2) obj).A02;
        }
        return true;
    }

    public final void A00(04k r5) {
        int i = this.A02;
        04h r2 = r5.A00;
        this.A00.Epw(r2.A05(i));
        C51967G9n.A16(this.A01, r2.A0I(i));
    }

    public final int AhD(C268024cd r2) {
        return ((02M) this.A00.getValue()).A00;
    }

    public final int BMH(C268024cd r2, AnonymousClass5Q8 r3) {
        return ((02M) this.A00.getValue()).A01;
    }

    public final int BoT(C268024cd r2, AnonymousClass5Q8 r3) {
        return ((02M) this.A00.getValue()).A02;
    }

    public final int C8K(C268024cd r2) {
        return ((02M) this.A00.getValue()).A03;
    }

    public final int hashCode() {
        return this.A02;
    }

    public IF2(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A03);
        A1A.append('(');
        C284945Oz r2 = this.A00;
        A1A.append(((02M) r2.getValue()).A01);
        A1A.append(", ");
        A1A.append(((02M) r2.getValue()).A03);
        A1A.append(", ");
        A1A.append(((02M) r2.getValue()).A02);
        A1A.append(", ");
        return C51975G9x.A0j(A1A, ((02M) r2.getValue()).A00);
    }
}
