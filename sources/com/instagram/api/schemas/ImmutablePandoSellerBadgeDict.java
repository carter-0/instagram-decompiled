package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44338CdK;
import X.C46085DLq;
import X.C46086DLr;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoSellerBadgeDict extends 17P implements SellerBadgeDictIntf {
    public static final C3035269k CREATOR = CTB.A00(74);

    public final List C3O() {
        return A0p(-1615615642, C46085DLq.A00);
    }

    public final SellerBadgeType CAT() {
        return (SellerBadgeType) A0N(3575610, C46086DLr.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoSellerBadgeDict, com.instagram.api.schemas.SellerBadgeDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44338CdK.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final SellerBadgeDict F8u() {
        return new SellerBadgeDict(CAT(), A0T(), A0W(), C3O());
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getName() {
        return A0W();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoSellerBadgeDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
