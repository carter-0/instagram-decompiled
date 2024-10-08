package X;

import android.graphics.Paint;

public final class N2R extends AnonymousClass0T0 {
    public final Paint A00;
    public final Paint A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2R) {
                N2R n2r = (N2R) obj;
                if (!0qQ.A0K(this.A00, n2r.A00) || !0qQ.A0K(this.A01, n2r.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public N2R(Paint paint, Paint paint2) {
        this.A00 = paint;
        this.A01 = paint2;
    }
}
