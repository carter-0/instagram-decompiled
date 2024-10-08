package com.instagram.clips.model.metadata;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class PlaylistContext extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(69);
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PlaylistContext) && 0qQ.A0K(this.A00, ((PlaylistContext) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public PlaylistContext(String str) {
        this.A00 = str;
    }

    public PlaylistContext() {
        this((String) null);
    }
}
