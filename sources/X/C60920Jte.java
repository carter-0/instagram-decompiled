package X;

import java.util.List;

/* renamed from: X.Jte  reason: case insensitive filesystem */
public final class C60920Jte extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C60920Jte(String str, List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60920Jte) {
                C60920Jte jte = (C60920Jte) obj;
                if (!0qQ.A0K(this.A01, jte.A01) || this.A02 != jte.A02 || !0qQ.A0K(this.A00, jte.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0E(this.A00);
    }
}
