package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* renamed from: X.BIj  reason: case insensitive filesystem */
public final class C42130BIj extends AnonymousClass0T0 implements C46292DTv {
    public final C68282N8v A00;
    public final ProductDetailsProductItemDict A01;

    public final C42130BIj FFS(1E9 r1) {
        return this;
    }

    public final C42130BIj FFT(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42130BIj) {
                C42130BIj bIj = (C42130BIj) obj;
                if (!0qQ.A0K(this.A00, bIj.A00) || !0qQ.A0K(this.A01, bIj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C74546Pwf Bbg() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bfu() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShoppingFeaturedProduct", C44919CnA.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C42130BIj(C68282N8v n8v, ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = n8v;
        this.A01 = productDetailsProductItemDict;
    }

    public final C46292DTv EA7(1E9 r1) {
        return this;
    }
}
