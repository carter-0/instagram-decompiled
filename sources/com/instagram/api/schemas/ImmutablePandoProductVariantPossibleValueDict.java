package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44275CcJ;
import X.C46073DLe;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;

public final class ImmutablePandoProductVariantPossibleValueDict extends 17P implements ProductVariantPossibleValueDictIntf {
    public static final C3035269k CREATOR = CTB.A00(61);

    public final ProductVariantVisualStyle CFr() {
        return (ProductVariantVisualStyle) A0M(1947113458, C46073DLe.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ProductVariantPossibleValueDictIntf, com.instagram.api.schemas.ImmutablePandoProductVariantPossibleValueDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44275CcJ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoProductVariantPossibleValueDict] */
    public final ProductVariantPossibleValueDict F86() {
        String A0g = A0g();
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1451773609);
        return new ProductVariantPossibleValueDict(CFr(), A0g, A0Q(), A0i(-378265047), A0h(111972721), booleanValueByHashCode);
    }

    public final String getId() {
        return A0g();
    }

    public final String getName() {
        return A0Q();
    }

    public final String getNormalizedValue() {
        return A0i(-378265047);
    }

    public final String getValue() {
        return A0h(111972721);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductVariantPossibleValueDict] */
    public final boolean isPreselected() {
        return getBooleanValueByHashCode(1451773609);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductVariantPossibleValueDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
