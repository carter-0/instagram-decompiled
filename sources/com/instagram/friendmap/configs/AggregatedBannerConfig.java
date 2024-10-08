package com.instagram.friendmap.configs;

import X.0qQ;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class AggregatedBannerConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(53);
    public final int A00;
    public final List A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public AggregatedBannerConfig(int i, boolean z, List list) {
        this.A01 = list;
        this.A00 = i;
        this.A02 = z;
    }

    public AggregatedBannerConfig() {
        this(0, true, (List) null);
    }
}
