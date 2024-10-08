package com.instagram.creation.capture.quickcapture.aspectratioutil;

import X.JTS;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;

public class NoOpCreationLayoutConfig implements Parcelable, CreationLayoutConfig {
    public static final Parcelable.Creator CREATOR = LVP.A00(17);

    public final boolean CTv() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final int BQc() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JTS.A0v(parcel);
    }
}
