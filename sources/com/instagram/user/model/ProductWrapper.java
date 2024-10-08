package com.instagram.user.model;

import X.0Yt;
import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41846B3n;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ProductWrapper extends AnonymousClass0T0 implements Parcelable, ProductWrapperIntf {
    public static final Parcelable.Creator CREATOR = new W6F(88);
    public final ProductDetailsProductItemDict A00;

    public final ProductWrapper FGs(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductWrapper) && 0qQ.A0K(this.A00, ((ProductWrapper) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A00;
        if (productDetailsProductItemDict == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        productDetailsProductItemDict.writeToParcel(parcel, i);
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bg5() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public ProductWrapper(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }

    public final ProductWrapperIntf EAZ(1E9 r1) {
        return this;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (Bg5() != null) {
            A0t.put("product_details", C41846B3n.A0Q(Bg5()));
        }
        return C41845B3m.A0T("XDTProductWrapper", 0Yt.A0B(A0t));
    }
}
