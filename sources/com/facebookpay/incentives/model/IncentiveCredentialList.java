package com.facebookpay.incentives.model;

import X.0qQ;
import X.0sn;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class IncentiveCredentialList implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(1);
    public final List A00;

    public IncentiveCredentialList(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public IncentiveCredentialList() {
        this(0sn.A00);
    }
}
