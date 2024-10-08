package com.instagram.discovery.contextualfeed.model;

import X.0qQ;
import X.C16672Uz8;
import X.Pxj;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.discovery.api.model.SectionPagination;

public final class EntityContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(26);
    public final int A00;
    public final int A01;
    public final SectionPagination A02;
    public final C16672Uz8 A03;
    public final C16672Uz8 A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        Pxj.A1A(parcel, this.A04);
        Pxj.A1A(parcel, this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public EntityContextualFeedConfig(SectionPagination sectionPagination, C16672Uz8 uz8, C16672Uz8 uz82, String str, String str2, int i, int i2, boolean z) {
        this.A02 = sectionPagination;
        this.A04 = uz8;
        this.A03 = uz82;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = z;
    }
}
