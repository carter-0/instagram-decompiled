package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;

/* renamed from: X.BIz  reason: case insensitive filesystem */
public final class C42144BIz extends AnonymousClass0T0 implements DU0 {
    public final ProductCollectionImpl A00;
    public final Long A01;

    public final C42144BIz FGl(1E9 r1) {
        return this;
    }

    public final C42144BIz FGm(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42144BIz) {
                C42144BIz bIz = (C42144BIz) obj;
                if (!0qQ.A0K(this.A00, bIz.A00) || !0qQ.A0K(this.A01, bIz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ProductCollection Axw() {
        return this.A00;
    }

    public final Long B1d() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTExpiringDiscountDict", C45131Cqp.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C42144BIz(ProductCollectionImpl productCollectionImpl, Long l) {
        this.A00 = productCollectionImpl;
        this.A01 = l;
    }

    public final DU0 EAW(1E9 r1) {
        return this;
    }
}
