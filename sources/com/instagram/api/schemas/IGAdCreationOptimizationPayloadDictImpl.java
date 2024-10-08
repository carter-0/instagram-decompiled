package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C44163CYc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class IGAdCreationOptimizationPayloadDictImpl extends AnonymousClass0T0 implements Parcelable, IGAdCreationOptimizationPayloadDict {
    public static final Parcelable.Creator CREATOR = new C376389Hu(14);
    public final List A00;

    public final IGAdCreationOptimizationPayloadDictImpl F3m() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IGAdCreationOptimizationPayloadDictImpl) && 0qQ.A0K(this.A00, ((IGAdCreationOptimizationPayloadDictImpl) obj).A00));
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

    public final List AYy() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdCreationOptimizationPayloadDict", C44163CYc.A00(this));
    }

    public IGAdCreationOptimizationPayloadDictImpl(List list) {
        this.A00 = list;
    }
}
