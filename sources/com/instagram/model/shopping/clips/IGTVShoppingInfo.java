package com.instagram.model.shopping.clips;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44916Cn7;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class IGTVShoppingInfo extends AnonymousClass0T0 implements Parcelable, IGTVShoppingInfoIntf {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(95);
    public final ClipsShoppingCTABar A00;
    public final ProductCollection A01;
    public final User A02;
    public final List A03;

    public final IGTVShoppingInfo FFP(1E9 r1) {
        return this;
    }

    public final IGTVShoppingInfo FFQ(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGTVShoppingInfo) {
                IGTVShoppingInfo iGTVShoppingInfo = (IGTVShoppingInfo) obj;
                if (!0qQ.A0K(this.A00, iGTVShoppingInfo.A00) || !0qQ.A0K(this.A01, iGTVShoppingInfo.A01) || !0qQ.A0K(this.A02, iGTVShoppingInfo.A02) || !0qQ.A0K(this.A03, iGTVShoppingInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
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
        parcel.writeParcelable(this.A02, i);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            C41847B3o.A1I(parcel, A1G, i);
        }
    }

    public final /* bridge */ /* synthetic */ ClipsShoppingCTABarIntf AoB() {
        return this.A00;
    }

    public final ProductCollection Aoo() {
        return this.A01;
    }

    public final User BRo() {
        return this.A02;
    }

    public final List Bga() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGTVProductsConsumptionPayload", C44916Cn7.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public IGTVShoppingInfo(ClipsShoppingCTABar clipsShoppingCTABar, ProductCollection productCollection, User user, List list) {
        this.A00 = clipsShoppingCTABar;
        this.A01 = productCollection;
        this.A02 = user;
        this.A03 = list;
    }

    public final IGTVShoppingInfoIntf EA6(1E9 r1) {
        return this;
    }
}
