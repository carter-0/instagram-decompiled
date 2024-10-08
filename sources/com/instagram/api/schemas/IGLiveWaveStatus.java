package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGLiveWaveStatus implements Parcelable {
    UNRECOGNIZED("IGLiveWaveStatus_unspecified"),
    NOT_ELIGIBLE("not_eligible"),
    WAVE_ALREADY_SENT("wave_already_sent"),
    WAVE_ELIGIBLE("wave_eligible");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGLiveWaveStatus[] iGLiveWaveStatusArr;
        A02 = 0oU.A00(iGLiveWaveStatusArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGLiveWaveStatus iGLiveWaveStatus : values()) {
            linkedHashMap.put(iGLiveWaveStatus.A00, iGLiveWaveStatus);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(35);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGLiveWaveStatus(String str) {
        this.A00 = str;
    }
}
