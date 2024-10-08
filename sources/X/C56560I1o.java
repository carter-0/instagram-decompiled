package X;

import java.util.Map;

/* renamed from: X.I1o  reason: case insensitive filesystem */
public final class C56560I1o {
    public final C56115Ht2 A00;
    public final C56068HsH A01;
    public final C56099Hsm A02;
    public final C56069HsI A03;
    public final Map A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56560I1o) {
                C56560I1o i1o = (C56560I1o) obj;
                if (!0qQ.A0K(this.A01, i1o.A01) || !0qQ.A0K(this.A03, i1o.A03) || !0qQ.A0K(this.A00, i1o.A00) || !0qQ.A0K(this.A02, i1o.A02) || this.A05 != i1o.A05 || !0qQ.A0K(this.A04, i1o.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A09(this.A05, ((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31));
    }

    public C56560I1o(C56115Ht2 ht2, C56068HsH hsH, C56099Hsm hsm, C56069HsI hsI, Map map, boolean z) {
        this.A01 = hsH;
        this.A03 = hsI;
        this.A00 = ht2;
        this.A02 = hsm;
        this.A05 = z;
        this.A04 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TransitionData(fade=");
        A1A.append(this.A01);
        A1A.append(", slide=");
        A1A.append(this.A03);
        A1A.append(", changeSize=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(405));
        A1A.append(this.A02);
        A1A.append(", hold=");
        A1A.append(this.A05);
        A1A.append(", effectsMap=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }

    public C56560I1o() {
        this((C56115Ht2) null, (C56068HsH) null, (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), false);
    }
}
