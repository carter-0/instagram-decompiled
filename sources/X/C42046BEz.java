package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* renamed from: X.BEz  reason: case insensitive filesystem */
public final class C42046BEz extends AnonymousClass0T0 implements DUM {
    public final ProductImageContainer A00;
    public final ProductDetailsProductItemDict A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final C42046BEz F3c(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42046BEz) {
                C42046BEz bEz = (C42046BEz) obj;
                if (!0qQ.A0K(this.A02, bEz.A02) || !0qQ.A0K(this.A00, bEz.A00) || !0qQ.A0K(this.A01, bEz.A01) || !0qQ.A0K(this.A03, bEz.A03) || !0qQ.A0K(this.A04, bEz.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BRr() {
        return this.A02;
    }

    public final ProductImageContainer Bbz() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bfu() {
        return this.A01;
    }

    public final String BgF() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGuideProductImageContent", CYP.A00(this));
    }

    public final String getProductId() {
        return this.A03;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return C41845B3m.A01(this.A04, AnonymousClass7TF.A08(this.A03, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31));
    }

    public C42046BEz(ProductImageContainer productImageContainer, ProductDetailsProductItemDict productDetailsProductItemDict, String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, productImageContainer);
        AnonymousClass7TG.A1R(str2, str3);
        this.A02 = str;
        this.A00 = productImageContainer;
        this.A01 = productDetailsProductItemDict;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final DUM E7T(1E9 r1) {
        return this;
    }
}
