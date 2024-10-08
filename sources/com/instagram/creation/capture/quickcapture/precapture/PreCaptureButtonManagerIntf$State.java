package com.instagram.creation.capture.quickcapture.precapture;

import X.0qQ;
import X.AnonymousClass0T0;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class PreCaptureButtonManagerIntf$State extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(27);
    public final Boolean A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = false;
        0qQ.A0B(parcel, 0);
        Boolean bool = this.A00;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        }
        parcel.writeInt(z ? 1 : 0);
    }

    public PreCaptureButtonManagerIntf$State(Boolean bool) {
        this.A00 = bool;
    }

    public PreCaptureButtonManagerIntf$State() {
        this((Boolean) null);
    }
}
