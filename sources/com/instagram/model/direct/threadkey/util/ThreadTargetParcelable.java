package com.instagram.model.direct.threadkey.util;

import X.0qQ;
import X.AnonymousClass9H0;
import X.C254783t2;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public final class ThreadTargetParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(24);
    public final C254783t2 A00;

    public ThreadTargetParcelable(C254783t2 r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass9H0.A03(parcel, this.A00, i);
    }
}
