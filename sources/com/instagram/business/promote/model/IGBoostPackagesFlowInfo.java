package com.instagram.business.promote.model;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.XIGIGBoostDestination;
import java.util.List;

public final class IGBoostPackagesFlowInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(24);
    public XIGIGBoostDestination A00;
    public PromoteAudience A01;
    public String A02;
    public String A03;
    public List A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(1);
    }
}
