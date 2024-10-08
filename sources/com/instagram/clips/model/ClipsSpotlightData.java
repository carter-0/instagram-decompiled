package com.instagram.clips.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public final class ClipsSpotlightData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(71);
    public final Map A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ClipsSpotlightData) && 0qQ.A0K(this.A00, ((ClipsSpotlightData) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Map map = this.A00;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            ((ClipsSpotlightModel) entry.getValue()).writeToParcel(parcel, i);
        }
    }

    public ClipsSpotlightData(Map map) {
        this.A00 = map;
    }
}
