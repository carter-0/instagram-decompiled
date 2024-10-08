package com.instagram.user.model;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass731;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class CreatorShoppingInfoImpl extends AnonymousClass0T0 implements Parcelable, CreatorShoppingInfo {
    public static final Parcelable.Creator CREATOR = new C376399Hv(84);
    public final List A00;

    public final CreatorShoppingInfoImpl FGj(1E9 r1) {
        return this;
    }

    public final CreatorShoppingInfoImpl FGk(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CreatorShoppingInfoImpl) && 0qQ.A0K(this.A00, ((CreatorShoppingInfoImpl) obj).A00));
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
        List<User> list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (User writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    public final List BN1() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreatorShoppingInfoDict", AnonymousClass731.A00(this));
    }

    public CreatorShoppingInfoImpl(List list) {
        this.A00 = list;
    }

    public final CreatorShoppingInfo EAV(1E9 r1) {
        return this;
    }
}
