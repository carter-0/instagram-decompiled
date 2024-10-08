package com.instagram.sponsored.signals.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C45104CqM;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import java.util.List;

public final class AdsRatingInfo extends AnonymousClass0T0 implements AdsRatingInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(69);
    public final AdsRatingAndReviewDisplayFormat A00;
    public final Boolean A01;
    public final Float A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    public final AdsRatingInfo FGh() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdsRatingInfo) {
                AdsRatingInfo adsRatingInfo = (AdsRatingInfo) obj;
                if (!0qQ.A0K(this.A04, adsRatingInfo.A04) || !0qQ.A0K(this.A01, adsRatingInfo.A01) || this.A00 != adsRatingInfo.A00 || !0qQ.A0K(this.A05, adsRatingInfo.A05) || !0qQ.A0K(this.A02, adsRatingInfo.A02) || !0qQ.A0K(this.A03, adsRatingInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = this.A00;
        int hashCode3 = (hashCode2 + (adsRatingAndReviewDisplayFormat == null ? 0 : adsRatingAndReviewDisplayFormat.hashCode())) * 31;
        List list = this.A05;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.A02;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        List<Parcelable> list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public final String AyC() {
        return this.A04;
    }

    public final AdsRatingAndReviewDisplayFormat BjS() {
        return this.A00;
    }

    public final List BjU() {
        return this.A05;
    }

    public final Float BjZ() {
        return this.A02;
    }

    public final Integer BoI() {
        return this.A03;
    }

    public final Boolean CUs() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsRatingAndReviewInfoDict", C45104CqM.A00(this));
    }

    public AdsRatingInfo(AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat, Boolean bool, Float f, Integer num, String str, List list) {
        this.A04 = str;
        this.A01 = bool;
        this.A00 = adsRatingAndReviewDisplayFormat;
        this.A05 = list;
        this.A02 = f;
        this.A03 = num;
    }
}
