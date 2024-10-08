package com.instagram.business.insights.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C41848B3p;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class FollowersGrowthData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(8);
    public final int A00;
    public final String A01;
    public final List A02;

    public FollowersGrowthData(List list, int i, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowersGrowthData) {
                FollowersGrowthData followersGrowthData = (FollowersGrowthData) obj;
                if (!0qQ.A0K(this.A01, followersGrowthData.A01) || this.A00 != followersGrowthData.A00 || !0qQ.A0K(this.A02, followersGrowthData.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            ((GrowthDataPoint) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TE.A0O(this.A01) + this.A00) * 31);
    }
}
