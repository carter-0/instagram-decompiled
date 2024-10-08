package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C44257Cbs;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ProductArtsLabelsDict extends AnonymousClass0T0 implements Parcelable, ProductArtsLabelsDictIntf {
    public static final Parcelable.Creator CREATOR = new C376419Hx(1);
    public final List A00;

    public final ProductArtsLabelsDict F7o() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductArtsLabelsDict) && 0qQ.A0K(this.A00, ((ProductArtsLabelsDict) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List<Parcelable> list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public final List BKR() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductArtsLabelsDict", C44257Cbs.A00(this));
    }

    public ProductArtsLabelsDict(List list) {
        this.A00 = list;
    }
}
