package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44264Cbz;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class ProductDiscountsDictImpl extends AnonymousClass0T0 implements Parcelable, ProductDiscountsDict {
    public static final Parcelable.Creator CREATOR = DE6.A00(23);
    public final List A00;

    public final ProductDiscountsDictImpl F7t() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductDiscountsDictImpl) && 0qQ.A0K(this.A00, ((ProductDiscountsDictImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            C41847B3o.A1I(parcel, A1G, i);
        }
    }

    public final List Axx() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductDiscountsDict", C44264Cbz.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public ProductDiscountsDictImpl(List list) {
        this.A00 = list;
    }
}
