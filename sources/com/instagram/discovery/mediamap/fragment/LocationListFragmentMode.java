package com.instagram.discovery.mediamap.fragment;

import X.0oU;
import X.Dbb;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public enum LocationListFragmentMode implements Parcelable {
    QUERY_LIST,
    PIN_LIST;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        LocationListFragmentMode[] locationListFragmentModeArr;
        A00 = 0oU.A00(locationListFragmentModeArr);
        CREATOR = new W6E(29);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
