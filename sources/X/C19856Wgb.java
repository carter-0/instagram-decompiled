package X;

import com.shopify.checkout.models.errors.ErrorGroup;

/* renamed from: X.Wgb  reason: case insensitive filesystem */
public final class C19856Wgb implements C20867X1t {
    public final ErrorGroup A00 = ErrorGroup.Internal;
    public final Exception A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19856Wgb) {
                C19856Wgb wgb = (C19856Wgb) obj;
                if (this.A02 != wgb.A02 || !0qQ.A0K(this.A01, wgb.A01) || !0qQ.A0K(this.A03, wgb.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A07(this.A01, C51971G9r.A0D(num, VJ1.A00(num)) * 31));
    }

    public C19856Wgb(Exception exc, Integer num, String str) {
        this.A02 = num;
        this.A01 = exc;
        this.A03 = str;
    }

    public final String toString() {
        StringBuilder A0m = C13991Tnr.A0m();
        C13990Tnq.A1U(A0m, this.A00);
        A0m.append(this.A03);
        A0m.append("\n            Code: ");
        A0m.append(VJ1.A00(this.A02));
        A0m.append("\n            Underlying Error: ");
        A0m.append(this.A01);
        return AnonymousClass7TF.A0l("\n        ", A0m);
    }
}
