package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.Pxg;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class VideoProtocolProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(71);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public VideoProtocolProps(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = AnonymousClass7TF.A1S(parcel.readInt(), 1);
        this.A02 = Pxg.A1V(parcel);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("subscriptionUrl: '");
        A1A.append(this.A00);
        A1A.append("', broadcasterForcedPlayback: ");
        A1A.append(this.A01);
        A1A.append(", isVideoEligible: ");
        A1A.append(this.A02);
        return A1A.toString();
    }

    public VideoProtocolProps() {
        this.A00 = "";
        this.A01 = false;
        this.A02 = false;
    }
}
