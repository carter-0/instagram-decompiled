package com.instagram.sponsored.signals.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C45105CqN;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class AdsTextTrustInfo extends AnonymousClass0T0 implements Parcelable, AdsTextTrustInfoIntf {
    public static final Parcelable.Creator CREATOR = new W6F(70);
    public final AdsBizBadgeInfo A00;
    public final List A01;

    public final AdsTextTrustInfo FGi() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdsTextTrustInfo) {
                AdsTextTrustInfo adsTextTrustInfo = (AdsTextTrustInfo) obj;
                if (!0qQ.A0K(this.A00, adsTextTrustInfo.A00) || !0qQ.A0K(this.A01, adsTextTrustInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AdsBizBadgeInfo adsBizBadgeInfo = this.A00;
        int i = 0;
        int hashCode = (adsBizBadgeInfo == null ? 0 : adsBizBadgeInfo.hashCode()) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        List<Parcelable> list = this.A01;
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

    public final AdsBizBadgeInfo BGy() {
        return this.A00;
    }

    public final List BH1() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsTextTrustInfoDataDict", C45105CqN.A00(this));
    }

    public AdsTextTrustInfo(AdsBizBadgeInfo adsBizBadgeInfo, List list) {
        this.A00 = adsBizBadgeInfo;
        this.A01 = list;
    }
}
