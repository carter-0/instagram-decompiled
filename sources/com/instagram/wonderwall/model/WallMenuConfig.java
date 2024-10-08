package com.instagram.wonderwall.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class WallMenuConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(9);
    public WallText A00;
    public final List A01 = AnonymousClass7TE.A1C();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(1);
    }
}
