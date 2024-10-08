package com.instagram.explore.intf;

import X.0qQ;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

public final class ExploreFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(39);
    public final int A00;
    public final int A01;
    public final ExploreTopicCluster A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
    }

    public ExploreFragmentConfig(ExploreTopicCluster exploreTopicCluster, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A06 = z;
        this.A05 = z2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A02 = exploreTopicCluster;
        this.A03 = str2;
    }
}
