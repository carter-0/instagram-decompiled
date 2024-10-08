package com.instagram.model.shopping.reels;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44938CnY;
import X.C46153DOg;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SellerShoppableFeedType;

public final class ImmutablePandoProfileShopLink extends 17P implements ProfileShopLinkIntf {
    public static final C3035269k CREATOR = CTA.A00(59);

    public final SellerShoppableFeedType BsB() {
        return (SellerShoppableFeedType) A0N(-1692657008, C46153DOg.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProfileShopLink, com.instagram.model.shopping.reels.ProfileShopLinkIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44938CnY.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BhD() {
        return A0i(520474584);
    }

    public final String BhF() {
        return A0j(-1754614628);
    }

    public final String BhG() {
        return A0i(1441960937);
    }

    public final ProfileShopLink FFo() {
        return new ProfileShopLink(BsB(), A0i(520474584), A0j(-1754614628), A0i(1441960937));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProfileShopLink] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
