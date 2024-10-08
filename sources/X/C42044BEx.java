package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.BEx  reason: case insensitive filesystem */
public final class C42044BEx extends AnonymousClass0T0 implements DRC {
    public final C59721JVf A00;
    public final DRD A01;
    public final ProductDetailsProductItemDict A02;
    public final User A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42044BEx) {
                C42044BEx bEx = (C42044BEx) obj;
                if (!0qQ.A0K(this.A03, bEx.A03) || !0qQ.A0K(this.A01, bEx.A01) || !0qQ.A0K(this.A02, bEx.A02) || !0qQ.A0K(this.A00, bEx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42044BEx(C59721JVf jVf, DRD drd, ProductDetailsProductItemDict productDetailsProductItemDict, User user) {
        this.A03 = user;
        this.A01 = drd;
        this.A02 = productDetailsProductItemDict;
        this.A00 = jVf;
    }
}
