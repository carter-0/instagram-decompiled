package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class StatusStyleResponseInfoImpl extends AnonymousClass0T0 implements Parcelable, StatusStyleResponseInfo {
    public static final Parcelable.Creator CREATOR = DE6.A00(86);
    public final MusicStatusStyleResponseInfo A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StatusStyleResponseInfoImpl) && 0qQ.A0K(this.A00, ((StatusStyleResponseInfoImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public StatusStyleResponseInfoImpl(MusicStatusStyleResponseInfo musicStatusStyleResponseInfo) {
        this.A00 = musicStatusStyleResponseInfo;
    }
}
