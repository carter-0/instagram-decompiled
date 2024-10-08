package X;

import java.util.List;

/* renamed from: X.JxS  reason: case insensitive filesystem */
public final class C61116JxS extends AnonymousClass0T0 implements MWM {
    public final List A00;
    public final int A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61116JxS) {
                C61116JxS jxS = (C61116JxS) obj;
                if (!0qQ.A0K(this.A00, jxS.A00) || this.A01 != jxS.A01 || !0qQ.A0K(this.A02, jxS.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TE.A0K(this.A00) + this.A01) * 31);
    }

    public C61116JxS(List list, List list2, int i) {
        AnonymousClass7TG.A1P(list, list2);
        this.A00 = list;
        this.A01 = i;
        this.A02 = list2;
    }
}
