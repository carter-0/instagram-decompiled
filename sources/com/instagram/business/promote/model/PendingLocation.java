package com.instagram.business.promote.model;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class PendingLocation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(28);
    public int A00 = 5;
    public AudienceGeoLocation A01;
    public AudienceGeoLocation A02;
    public Boolean A03;
    public List A04 = new ArrayList();
    public List A05 = new ArrayList();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeList(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeList(this.A04);
        parcel.writeValue(this.A03);
    }

    public final boolean A00() {
        Boolean bool = this.A03;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
