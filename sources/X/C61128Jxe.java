package X;

import java.util.List;

/* renamed from: X.Jxe  reason: case insensitive filesystem */
public final class C61128Jxe extends AnonymousClass0T0 implements MWZ {
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final Boolean A03;

    public C61128Jxe(Boolean bool, List list, int i, boolean z) {
        0qQ.A0B(list, 4);
        this.A00 = i;
        this.A03 = bool;
        this.A02 = z;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61128Jxe) {
                C61128Jxe jxe = (C61128Jxe) obj;
                if (this.A00 != jxe.A00 || !0qQ.A0K(this.A03, jxe.A03) || this.A02 != jxe.A02 || !0qQ.A0K(this.A01, jxe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A02, ((this.A00 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31));
    }
}
