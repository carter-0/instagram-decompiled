package X;

import java.util.List;

/* renamed from: X.JtX  reason: case insensitive filesystem */
public final class C60913JtX extends AnonymousClass0T0 {
    public final List A00;
    public final String A01;

    public C60913JtX(List list, String str) {
        0qQ.A0B(list, 1);
        this.A00 = list;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60913JtX) {
                C60913JtX jtX = (C60913JtX) obj;
                if (!0qQ.A0K(this.A00, jtX.A00) || !0qQ.A0K(this.A01, jtX.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
