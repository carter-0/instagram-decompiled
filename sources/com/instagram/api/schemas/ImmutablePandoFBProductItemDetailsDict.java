package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C45432CwC;
import X.CTC;
import android.os.Parcel;
import com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;

public final class ImmutablePandoFBProductItemDetailsDict extends 17P implements FBProductItemDetailsDict {
    public static final C3035269k CREATOR = CTC.A00(65);

    public final /* synthetic */ C45432CwC AKA() {
        return new C45432CwC(this);
    }

    public final ProductCheckoutPropertiesIntf An5() {
        return (ProductCheckoutPropertiesIntf) A05(2021764556, ImmutablePandoProductCheckoutProperties.class);
    }

    public final ProductImageContainer BOr() {
        return (ProductImageContainer) A05(798171989, ImmutablePandoProductImageContainer.class);
    }

    public final ProductImageContainer C6z() {
        return (ProductImageContainer) A05(2074606664, ImmutablePandoProductImageContainer.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFBProductItemDetailsDict] */
    public final Boolean BCR() {
        return getOptionalBooleanValueByHashCode(-971305057);
    }

    public final String BND() {
        return A0i(-1088955442);
    }

    public final String BNE() {
        return A0i(571176008);
    }

    public final String BaE() {
        return A0j(-803548981);
    }

    public final String BaI() {
        return A0i(883692091);
    }

    public final String BaK() {
        return A0i(-1687498684);
    }

    public final String BgN() {
        return A0i(1014375387);
    }

    public final String C1f() {
        return A0i(-1284445987);
    }

    public final String C1g() {
        return A0i(215918617);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFBProductItemDetailsDict, X.17P] */
    public final FBProductItemDetailsDictImpl F2u() {
        ProductCheckoutProperties productCheckoutProperties;
        ProductImageContainerImpl productImageContainerImpl;
        ProductCheckoutPropertiesIntf An5 = An5();
        ProductImageContainerImpl productImageContainerImpl2 = null;
        if (An5 != null) {
            productCheckoutProperties = An5.FFY();
        } else {
            productCheckoutProperties = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-971305057);
        String A0i = A0i(-1088955442);
        String A0i2 = A0i(571176008);
        ProductImageContainer BOr = BOr();
        if (BOr != null) {
            productImageContainerImpl = BOr.FFc();
        } else {
            productImageContainerImpl = null;
        }
        String A0j = A0j(-803548981);
        String A0i3 = A0i(883692091);
        String A0i4 = A0i(-1687498684);
        String A0j2 = A0j(1753008747);
        String A0i5 = A0i(1014375387);
        String A0i6 = A0i(-1284445987);
        String A0i7 = A0i(215918617);
        ProductImageContainer C6z = C6z();
        if (C6z != null) {
            productImageContainerImpl2 = C6z.FFc();
        }
        return new FBProductItemDetailsDictImpl(productCheckoutProperties, productImageContainerImpl, productImageContainerImpl2, optionalBooleanValueByHashCode, A0i, A0i2, A0j, A0i3, A0i4, A0j2, A0i5, A0i6, A0i7);
    }

    public final String getProductId() {
        return A0j(1753008747);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFBProductItemDetailsDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
