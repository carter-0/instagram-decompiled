package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BizUserInboxState implements Parcelable {
    UNRECOGNIZED("BizUserInboxState_unspecified"),
    GENERAL_FOLDER_THROTTLED("2"),
    NEW_API_THREADS_THROTTLED(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    NORMAL("0");
    
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
        BizUserInboxState[] bizUserInboxStateArr;
        A02 = 0oU.A00(bizUserInboxStateArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (BizUserInboxState bizUserInboxState : values()) {
            linkedHashMap.put(bizUserInboxState.A00, bizUserInboxState);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(60);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BizUserInboxState(String str) {
        this.A00 = str;
    }
}
