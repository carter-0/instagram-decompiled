package com.instagram.sponsored.signals.model;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoAdsBizBadgeInfo extends 17P implements AdsBizBadgeInfo {
    public static final C3035269k CREATOR = CTA.A00(76);

    public final AdsRatingInfoIntf BjW() {
        return (AdsRatingInfoIntf) A05(405136912, ImmutablePandoAdsRatingInfo.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final AdsBizBadgeInfoImpl FGe() {
        AdsRatingInfo adsRatingInfo;
        AdsRatingInfoIntf BjW = BjW();
        if (BjW != null) {
            adsRatingInfo = BjW.FGh();
        } else {
            adsRatingInfo = null;
        }
        return new AdsBizBadgeInfoImpl(adsRatingInfo);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsBizBadgeInfo, com.instagram.sponsored.signals.model.AdsBizBadgeInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (BjW() != null) {
            AdsRatingInfoIntf BjW = BjW();
            if (BjW != null) {
                treeUpdaterJNI = BjW.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A0t.put("rating_info", treeUpdaterJNI);
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsBizBadgeInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
