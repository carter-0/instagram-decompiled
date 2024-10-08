package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.Ht2  reason: case insensitive filesystem */
public final class C56115Ht2 {
    public final AnonymousClass5b8 A00;
    public final Alignment A01;
    public final 0sP A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56115Ht2) {
                C56115Ht2 ht2 = (C56115Ht2) obj;
                if (!0qQ.A0K(this.A01, ht2.A01) || !0qQ.A0K(this.A02, ht2.A02) || !0qQ.A0K(this.A00, ht2.A00) || this.A03 != ht2.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01))));
    }

    public C56115Ht2(AnonymousClass5b8 r1, Alignment alignment, 0sP r3, boolean z) {
        this.A01 = alignment;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ChangeSize(alignment=");
        A1A.append(this.A01);
        A1A.append(", size=");
        A1A.append(this.A02);
        A1A.append(", animationSpec=");
        A1A.append(this.A00);
        A1A.append(", clip=");
        return G9t.A1C(A1A, this.A03);
    }
}
