package X;

import java.util.List;

/* renamed from: X.JxL  reason: case insensitive filesystem */
public final class C61109JxL extends AnonymousClass0T0 implements C51935G8d {
    public final Long A00;
    public final List A01;
    public final List A02;

    public C61109JxL(Long l, List list, List list2) {
        0qQ.A0B(list2, 3);
        this.A01 = list;
        this.A00 = l;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61109JxL) {
                C61109JxL jxL = (C61109JxL) obj;
                if (!0qQ.A0K(this.A01, jxL.A01) || !0qQ.A0K(this.A00, jxL.A00) || !0qQ.A0K(this.A02, jxL.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }
}
