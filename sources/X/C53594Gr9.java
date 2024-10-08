package X;

import java.util.List;

/* renamed from: X.Gr9  reason: case insensitive filesystem */
public final class C53594Gr9 extends AnonymousClass0T0 implements JNF {
    public final AnonymousClass8ZN A00;
    public final C53452Gok A01;
    public final C2606046i A02;
    public final List A03;

    public C53594Gr9(AnonymousClass8ZN r2, C53452Gok gok, C2606046i r4, List list) {
        0qQ.A0B(list, 2);
        this.A02 = r4;
        this.A03 = list;
        this.A01 = gok;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53594Gr9) {
                C53594Gr9 gr9 = (C53594Gr9) obj;
                if (!0qQ.A0K(this.A02, gr9.A02) || !0qQ.A0K(this.A03, gr9.A03) || !0qQ.A0K(this.A01, gr9.A01) || this.A00 != gr9.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A02)) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31;
    }
}
