package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class AvatarStatusImpl extends AnonymousClass0T0 implements Parcelable, AvatarStatus {
    public static final Parcelable.Creator CREATOR = new C376409Hw(58);
    public final boolean A00;

    public final AvatarStatusImpl F0j() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AvatarStatusImpl) && this.A00 == ((AvatarStatusImpl) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public final boolean BAb() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_avatar", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTAvatarStatus", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public AvatarStatusImpl(boolean z) {
        this.A00 = z;
    }
}
