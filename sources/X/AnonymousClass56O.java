package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* renamed from: X.56O  reason: invalid class name */
public final class AnonymousClass56O extends AnonymousClass0T0 implements AnonymousClass56P {
    public final CornerStyle A00;
    public final ProductDetailsProductItemDict A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public final AnonymousClass56O F8y(1E9 r1) {
        return this;
    }

    public final AnonymousClass56O F8z(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56O) {
                AnonymousClass56O r5 = (AnonymousClass56O) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CornerStyle cornerStyle = this.A00;
        int hashCode2 = (hashCode + (cornerStyle == null ? 0 : cornerStyle.hashCode())) * 31;
        List list2 = this.A04;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A05;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A01;
        int hashCode5 = (hashCode4 + (productDetailsProductItemDict == null ? 0 : productDetailsProductItemDict.hashCode())) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public final List Abc() {
        return this.A03;
    }

    public final CornerStyle ArW() {
        return this.A00;
    }

    public final List BIw() {
        return this.A04;
    }

    public final List BN4() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bfu() {
        return this.A01;
    }

    public final String BgN() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingAdsTappableComponentFeed", C44343CdP.A00(this));
    }

    public AnonymousClass56O(CornerStyle cornerStyle, ProductDetailsProductItemDict productDetailsProductItemDict, String str, List list, List list2, List list3) {
        this.A03 = list;
        this.A00 = cornerStyle;
        this.A04 = list2;
        this.A05 = list3;
        this.A01 = productDetailsProductItemDict;
        this.A02 = str;
    }

    public final AnonymousClass56P E8B(1E9 r1) {
        return this;
    }
}
