package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGLiveGameStatus implements Parcelable {
    UNRECOGNIZED("IGLiveGameStatus_unspecified"),
    ACTIVE(AppStateModule.APP_STATE_ACTIVE),
    INACTIVE("inactive");
    
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
        IGLiveGameStatus[] iGLiveGameStatusArr;
        A02 = 0oU.A00(iGLiveGameStatusArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGLiveGameStatus iGLiveGameStatus : values()) {
            linkedHashMap.put(iGLiveGameStatus.A00, iGLiveGameStatus);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(20);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGLiveGameStatus(String str) {
        this.A00 = str;
    }
}
