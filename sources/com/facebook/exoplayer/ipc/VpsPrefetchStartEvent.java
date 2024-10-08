package com.facebook.exoplayer.ipc;

import android.os.Parcel;

public class VpsPrefetchStartEvent extends VideoPlayerServiceEvent {
    public String A00;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
