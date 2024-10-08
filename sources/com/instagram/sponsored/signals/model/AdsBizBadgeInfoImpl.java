package com.instagram.sponsored.signals.model;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class AdsBizBadgeInfoImpl extends AnonymousClass0T0 implements Parcelable, AdsBizBadgeInfo {
    public static final Parcelable.Creator CREATOR = new W6F(66);
    public final AdsRatingInfo A00;

    public final AdsBizBadgeInfoImpl FGe() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AdsBizBadgeInfoImpl) && 0qQ.A0K(this.A00, ((AdsBizBadgeInfoImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AdsRatingInfo adsRatingInfo = this.A00;
        if (adsRatingInfo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        adsRatingInfo.writeToParcel(parcel, i);
    }

    public final /* bridge */ /* synthetic */ AdsRatingInfoIntf BjW() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public AdsBizBadgeInfoImpl(AdsRatingInfo adsRatingInfo) {
        this.A00 = adsRatingInfo;
    }

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
        return C41845B3m.A0T("XDTIGAdsBizBadgeInfoDict", 0Yt.A0B(A0t));
    }
}
