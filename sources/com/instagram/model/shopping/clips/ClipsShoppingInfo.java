package com.instagram.model.shopping.clips;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C376399Hv;
import X.C44915Cn6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import java.util.List;

public final class ClipsShoppingInfo extends AnonymousClass0T0 implements ClipsShoppingInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(48);
    public final ClipsShoppingCTABar A00;
    public final ProductCollection A01;
    public final List A02;

    public final ClipsShoppingInfo FFO(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsShoppingInfo) {
                ClipsShoppingInfo clipsShoppingInfo = (ClipsShoppingInfo) obj;
                if (!0qQ.A0K(this.A00, clipsShoppingInfo.A00) || !0qQ.A0K(this.A01, clipsShoppingInfo.A01) || !0qQ.A0K(this.A02, clipsShoppingInfo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ClipsShoppingCTABar clipsShoppingCTABar = this.A00;
        int i = 0;
        int hashCode = (clipsShoppingCTABar == null ? 0 : clipsShoppingCTABar.hashCode()) * 31;
        ProductCollection productCollection = this.A01;
        int hashCode2 = (hashCode + (productCollection == null ? 0 : productCollection.hashCode())) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        ClipsShoppingCTABar clipsShoppingCTABar = this.A00;
        if (clipsShoppingCTABar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipsShoppingCTABar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A01, i);
        List<Parcelable> list = this.A02;
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

    public final /* bridge */ /* synthetic */ ClipsShoppingCTABarIntf AoB() {
        return this.A00;
    }

    public final ProductCollection Aoo() {
        return this.A01;
    }

    public final List Bga() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsProductsConsumptionPayload", C44915Cn6.A00(this));
    }

    public ClipsShoppingInfo(ClipsShoppingCTABar clipsShoppingCTABar, ProductCollection productCollection, List list) {
        this.A00 = clipsShoppingCTABar;
        this.A01 = productCollection;
        this.A02 = list;
    }

    public final ClipsShoppingInfoIntf EA5(1E9 r1) {
        return this;
    }
}
