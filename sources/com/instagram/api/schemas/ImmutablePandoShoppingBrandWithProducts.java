package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41847B3o;
import X.C41848B3p;
import X.CTB;
import android.os.Parcel;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoShoppingBrandWithProducts extends 17P implements ShoppingBrandWithProducts {
    public static final C3035269k CREATOR = CTB.A00(75);

    public final User CCd() {
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'user' field.");
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Ar0() {
        return A0h(1116609854);
    }

    public final List BgX() {
        return A0o(-1571931561, ImmutablePandoProductWithMediaImage.class);
    }

    public final List Bga() {
        return A08(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
    }

    public final ShoppingBrandWithProductsImpl F90(1E9 r9) {
        ArrayList arrayList;
        ProductDetailsSellerBadgeContentImpl productDetailsSellerBadgeContentImpl;
        String A0h = A0h(1116609854);
        List<ProductWithMediaImage> BgX = BgX();
        ArrayList A0p = AnonymousClass7TF.A0p(BgX);
        for (ProductWithMediaImage F87 : BgX) {
            A0p.add(F87.F87(r9));
        }
        List Bga = Bga();
        ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle = null;
        if (Bga != null) {
            arrayList = AnonymousClass7TF.A0p(Bga);
            Iterator it = Bga.iterator();
            while (it.hasNext()) {
                C41848B3p.A1S(r9, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        ProductDetailsSellerBadgeContent productDetailsSellerBadgeContent = (ProductDetailsSellerBadgeContent) A05(15626979, ImmutablePandoProductDetailsSellerBadgeContent.class);
        if (productDetailsSellerBadgeContent != null) {
            productDetailsSellerBadgeContentImpl = productDetailsSellerBadgeContent.F7r();
        } else {
            productDetailsSellerBadgeContentImpl = null;
        }
        ShoppingBrandWithProductsSubtitleIntf shoppingBrandWithProductsSubtitleIntf = (ShoppingBrandWithProductsSubtitleIntf) A05(-2060497896, ImmutablePandoShoppingBrandWithProductsSubtitle.class);
        if (shoppingBrandWithProductsSubtitleIntf != null) {
            shoppingBrandWithProductsSubtitle = shoppingBrandWithProductsSubtitleIntf.F91();
        }
        return new ShoppingBrandWithProductsImpl(productDetailsSellerBadgeContentImpl, shoppingBrandWithProductsSubtitle, C41847B3o.A0r(r9, this, 3599307), A0h, A0p, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoShoppingBrandWithProducts] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
