package X;

import java.util.List;

/* renamed from: X.DrR  reason: case insensitive filesystem */
public final class C47150DrR extends AnonymousClass0T0 {
    public final EX2 A00;
    public final String A01;
    public final List A02;

    public C47150DrR(EX2 ex2, String str, List list) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = ex2;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47150DrR) {
                C47150DrR drR = (C47150DrR) obj;
                if (!0qQ.A0K(this.A01, drR.A01) || this.A00 != drR.A00 || !0qQ.A0K(this.A02, drR.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
