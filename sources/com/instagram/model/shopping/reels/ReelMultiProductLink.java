package com.instagram.model.shopping.reels;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C44939CnZ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ReelMultiProductLink extends AnonymousClass0T0 implements Parcelable, ReelMultiProductLinkIntf {
    public static final Parcelable.Creator CREATOR = new LVO(32);
    public final List A00;

    public final ReelMultiProductLink FFp(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ReelMultiProductLink) && 0qQ.A0K(this.A00, ((ReelMultiProductLink) obj).A00));
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

    public final List Bga() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCTAMultipleProductLinks", C44939CnZ.A00(this));
    }

    public ReelMultiProductLink(List list) {
        this.A00 = list;
    }

    public final ReelMultiProductLinkIntf EAC(1E9 r1) {
        return this;
    }
}
