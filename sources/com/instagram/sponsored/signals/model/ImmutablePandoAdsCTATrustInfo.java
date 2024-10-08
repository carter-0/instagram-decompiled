package com.instagram.sponsored.signals.model;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C45101CqJ;
import X.C46166DOt;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoAdsCTATrustInfo extends 17P implements AdsCTATrustInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(77);

    public final AdsBizBadgeInfo BGy() {
        return (AdsBizBadgeInfo) A05(1231159451, ImmutablePandoAdsBizBadgeInfo.class);
    }

    public final List BH1() {
        return A0p(-2039993294, C46166DOt.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf, com.instagram.sponsored.signals.model.ImmutablePandoAdsCTATrustInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45101CqJ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final AdsCTATrustInfo FGf() {
        AdsBizBadgeInfoImpl adsBizBadgeInfoImpl;
        AdsBizBadgeInfo BGy = BGy();
        if (BGy != null) {
            adsBizBadgeInfoImpl = BGy.FGe();
        } else {
            adsBizBadgeInfoImpl = null;
        }
        return new AdsCTATrustInfo(adsBizBadgeInfoImpl, BH1());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsCTATrustInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
