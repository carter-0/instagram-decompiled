package com.instagram.sponsored.signals.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C45103CqL;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class AdsIAWRatingInfo extends AnonymousClass0T0 implements Parcelable, AdsIAWRatingInfoIntf {
    public static final Parcelable.Creator CREATOR = new W6F(68);
    public final Boolean A00;
    public final Float A01;
    public final Integer A02;
    public final String A03;
    public final List A04;

    public final AdsIAWRatingInfo FGg() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdsIAWRatingInfo) {
                AdsIAWRatingInfo adsIAWRatingInfo = (AdsIAWRatingInfo) obj;
                if (!0qQ.A0K(this.A03, adsIAWRatingInfo.A03) || !0qQ.A0K(this.A00, adsIAWRatingInfo.A00) || !0qQ.A0K(this.A04, adsIAWRatingInfo.A04) || !0qQ.A0K(this.A01, adsIAWRatingInfo.A01) || !0qQ.A0K(this.A02, adsIAWRatingInfo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A00;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A04;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.A01;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Parcelable> list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public final String AfA() {
        return this.A03;
    }

    public final List BjU() {
        return this.A04;
    }

    public final Float BjZ() {
        return this.A01;
    }

    public final Integer BoI() {
        return this.A02;
    }

    public final Boolean CRN() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsIAWRatingAndReviewInfoDict", C45103CqL.A00(this));
    }

    public AdsIAWRatingInfo(Boolean bool, Float f, Integer num, String str, List list) {
        this.A03 = str;
        this.A00 = bool;
        this.A04 = list;
        this.A01 = f;
        this.A02 = num;
    }
}
