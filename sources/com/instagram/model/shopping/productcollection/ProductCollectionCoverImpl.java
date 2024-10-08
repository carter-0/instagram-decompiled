package com.instagram.model.shopping.productcollection;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44923CnG;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

public final class ProductCollectionCoverImpl extends AnonymousClass0T0 implements Parcelable, ProductCollectionCover {
    public static final Parcelable.Creator CREATOR = new LVO(9);
    public final ProductImageContainer A00;
    public final IgShowreelNativeAnimation A01;

    public final ProductCollectionCoverImpl FFa() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionCoverImpl) {
                ProductCollectionCoverImpl productCollectionCoverImpl = (ProductCollectionCoverImpl) obj;
                if (!0qQ.A0K(this.A00, productCollectionCoverImpl.A00) || !0qQ.A0K(this.A01, productCollectionCoverImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final ProductImageContainer BFw() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ IgShowreelNativeAnimationIntf BwB() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMicroProductCollectionTileCoverMediaDict", C44923CnG.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public ProductCollectionCoverImpl(ProductImageContainer productImageContainer, IgShowreelNativeAnimation igShowreelNativeAnimation) {
        this.A00 = productImageContainer;
        this.A01 = igShowreelNativeAnimation;
    }
}
