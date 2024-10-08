package X;

import java.util.List;

/* renamed from: X.DrL  reason: case insensitive filesystem */
public final class C47144DrL extends AnonymousClass0T0 {
    public final List A00;
    public final C47192Dse A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47144DrL) {
                C47144DrL drL = (C47144DrL) obj;
                if (!0qQ.A0K(this.A00, drL.A00) || !0qQ.A0K(this.A01, drL.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C47144DrL(C47192Dse dse, List list) {
        this.A00 = list;
        this.A01 = dse;
    }
}
