package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ThreadThemeType implements Parcelable {
    UNRECOGNIZED("ThreadThemeType_unspecified"),
    AI_GENERATED_THEME("7"),
    COLOR_GRADIENT(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    IGD_CHANNEL_CUSTOMIZED_THEME("5"),
    THEME("2"),
    THIRD_PARTY("3");
    
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
        ThreadThemeType[] threadThemeTypeArr;
        A02 = 0oU.A00(threadThemeTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ThreadThemeType threadThemeType : values()) {
            linkedHashMap.put(threadThemeType.A00, threadThemeType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(48);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ThreadThemeType(String str) {
        this.A00 = str;
    }
}
