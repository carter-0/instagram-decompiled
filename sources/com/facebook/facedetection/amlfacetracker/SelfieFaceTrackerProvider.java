package com.facebook.facedetection.amlfacetracker;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;

public final class SelfieFaceTrackerProvider implements FaceTrackerProvider {
    public static final Parcelable.Creator CREATOR = SWS.A00(83);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
