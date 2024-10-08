package com.instagram.camera.mpfacade;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.ARAudioEffectData;

public final class CameraEffectFacadeIntf$State implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(67);
    public final ARAudioEffectData A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public CameraEffectFacadeIntf$State(ARAudioEffectData aRAudioEffectData, boolean z) {
        this.A00 = aRAudioEffectData;
        this.A01 = z;
    }
}
