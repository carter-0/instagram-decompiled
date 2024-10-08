package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.CWD;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class CommerceReviewStatisticsDict extends AnonymousClass0T0 implements Parcelable, CommerceReviewStatisticsDictIntf {
    public static final Parcelable.Creator CREATOR = new C376409Hw(84);
    public final Float A00;
    public final Integer A01;
    public final List A02;

    public final CommerceReviewStatisticsDict F23() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceReviewStatisticsDict) {
                CommerceReviewStatisticsDict commerceReviewStatisticsDict = (CommerceReviewStatisticsDict) obj;
                if (!0qQ.A0K(this.A00, commerceReviewStatisticsDict.A00) || !0qQ.A0K(this.A02, commerceReviewStatisticsDict.A02) || !0qQ.A0K(this.A01, commerceReviewStatisticsDict.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A01;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Float f = this.A00;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        List<Parcelable> list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public final Float Aeb() {
        return this.A00;
    }

    public final List Bja() {
        return this.A02;
    }

    public final Integer BoI() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommerceReviewStatisticsDict", CWD.A00(this));
    }

    public CommerceReviewStatisticsDict(Float f, Integer num, List list) {
        this.A00 = f;
        this.A02 = list;
        this.A01 = num;
    }
}
