package X;

import java.util.List;

/* renamed from: X.Jz9  reason: case insensitive filesystem */
public final class C61216Jz9 extends AnonymousClass0T0 implements C66550MWe {
    public final C61221JzE A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61216Jz9) {
                C61216Jz9 jz9 = (C61216Jz9) obj;
                if (!0qQ.A0K(this.A01, jz9.A01) || !0qQ.A0K(this.A02, jz9.A02) || !0qQ.A0K(this.A00, jz9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TG.A0E(this.A01) * 31));
    }

    public C61216Jz9(C61221JzE jzE, String str, List list) {
        AnonymousClass7TG.A1Q(list, jzE);
        this.A01 = str;
        this.A02 = list;
        this.A00 = jzE;
    }
}
