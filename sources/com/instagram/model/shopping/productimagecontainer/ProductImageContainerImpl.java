package com.instagram.model.shopping.productimagecontainer;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass91I;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;

public final class ProductImageContainerImpl extends AnonymousClass0T0 implements ProductImageContainer, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(51);
    public final ImageInfo A00;
    public final String A01;

    public ProductImageContainerImpl(ImageInfo imageInfo, String str) {
        0qQ.A0B(imageInfo, 1);
        this.A00 = imageInfo;
        this.A01 = str;
    }

    public final ProductImageContainerImpl FFc() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductImageContainerImpl) {
                ProductImageContainerImpl productImageContainerImpl = (ProductImageContainerImpl) obj;
                if (!0qQ.A0K(this.A00, productImageContainerImpl.A00) || !0qQ.A0K(this.A01, productImageContainerImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final ImageInfo BGO() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductImageVersionsDict", AnonymousClass91I.A00(this));
    }

    public final String getPreview() {
        return this.A01;
    }
}
