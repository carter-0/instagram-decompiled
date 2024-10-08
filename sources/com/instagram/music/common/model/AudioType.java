package com.instagram.music.common.model;

import X.0oU;
import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public enum AudioType implements Parcelable {
    MUSIC("song"),
    ORIGINAL_AUDIO("original");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(name());
    }

    /* access modifiers changed from: public */
    static {
        AudioType[] audioTypeArr;
        A01 = 0oU.A00(audioTypeArr);
        CREATOR = new C376399Hv(62);
    }

    /* access modifiers changed from: public */
    AudioType(String str) {
        this.A00 = str;
    }
}
