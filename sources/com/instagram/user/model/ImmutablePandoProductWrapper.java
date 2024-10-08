package com.instagram.user.model;

import X.17P;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41848B3p;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoProductWrapper extends 17P implements ProductWrapperIntf {
    public static final C3035269k CREATOR = CTA.A00(84);
    public ProductDetailsProductItemDictIntf A00;

    public final ProductDetailsProductItemDictIntf Bg5() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A05(-296876302, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductWrapperIntf EAZ(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, Bg5());
        return this;
    }

    public final ProductWrapper FGs(1E9 r3) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf Bg5 = Bg5();
        if (Bg5 != null) {
            productDetailsProductItemDict = Bg5.FGq(r3);
        } else {
            productDetailsProductItemDict = null;
        }
        return new ProductWrapper(productDetailsProductItemDict);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.user.model.ProductWrapperIntf, com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoProductWrapper] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (Bg5() != null) {
            A0t.put("product_details", C41846B3n.A0Q(Bg5()));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoProductWrapper] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
