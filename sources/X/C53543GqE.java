package X;

import android.text.Spannable;

/* renamed from: X.GqE  reason: case insensitive filesystem */
public final class C53543GqE extends AnonymousClass0T0 implements JM7 {
    public final Spannable A00;
    public final C61081JwJ A01;

    public C53543GqE(Spannable spannable, C61081JwJ jwJ) {
        0qQ.A0B(spannable, 1);
        this.A00 = spannable;
        this.A01 = jwJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53543GqE) {
                C53543GqE gqE = (C53543GqE) obj;
                if (!0qQ.A0K(this.A00, gqE.A00) || !0qQ.A0K(this.A01, gqE.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51975G9x.A05(this.A01, AnonymousClass7TE.A0K(this.A00));
    }
}
