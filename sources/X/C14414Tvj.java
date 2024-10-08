package X;

import java.util.List;

/* renamed from: X.Tvj  reason: case insensitive filesystem */
public final class C14414Tvj extends AnonymousClass0T0 implements X9u {
    public final C14412Tvh A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14414Tvj) {
                C14414Tvj tvj = (C14414Tvj) obj;
                if (!0qQ.A0K(this.A01, tvj.A01) || !0qQ.A0K(this.A02, tvj.A02) || !0qQ.A0K(this.A00, tvj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public C14414Tvj(C14412Tvh tvh, List list, List list2) {
        AnonymousClass7TG.A1U(list, list2, tvh);
        this.A01 = list;
        this.A02 = list2;
        this.A00 = tvh;
    }
}
