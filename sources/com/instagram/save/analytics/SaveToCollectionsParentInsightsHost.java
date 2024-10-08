package com.instagram.save.analytics;

import X.0jB;
import X.0qQ;
import X.1Xj;
import X.C232682uF;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class SaveToCollectionsParentInsightsHost implements C232682uF, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(18);
    public final 0jB A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public SaveToCollectionsParentInsightsHost(0jB r2, String str, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeSerializable(this.A00);
    }

    public final 0jB E4k() {
        0jB r0 = this.A00;
        if (r0 == null) {
            return new 0jB();
        }
        return r0;
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final boolean isOrganicEligible() {
        return this.A02;
    }

    public final boolean isSponsoredEligible() {
        return this.A03;
    }

    public final 0jB E4l(1Xj r2) {
        return E4k();
    }
}
