package X;

import java.util.List;

/* renamed from: X.I1l  reason: case insensitive filesystem */
public final class C56557I1l {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56557I1l) {
                C56557I1l i1l = (C56557I1l) obj;
                if (!(this.A03 == i1l.A03 && this.A02 == i1l.A02 && this.A01 == i1l.A01 && 0qQ.A0K(this.A00, i1l.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A03))));
    }

    public C56557I1l(List list, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WritePromptsState(isVisible=");
        A1A.append(this.A03);
        A1A.append(C66579MXk.A00(27));
        A1A.append(this.A02);
        A1A.append(", isDisabled=");
        A1A.append(this.A01);
        A1A.append(", prompts=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C56557I1l() {
        this(0sn.A00, true, true, true);
    }
}
