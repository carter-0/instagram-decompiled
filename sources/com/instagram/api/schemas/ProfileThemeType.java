package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProfileThemeType implements Parcelable {
    UNRECOGNIZED("ProfileThemeType_unspecified"),
    COLOR_GRADIENT(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    CUSTOM_IMAGE("3"),
    A06("0");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProfileThemeType[] profileThemeTypeArr;
        A02 = 0oU.A00(profileThemeTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ProfileThemeType profileThemeType : values()) {
            A0x.put(profileThemeType.A00, profileThemeType);
        }
        A01 = A0x;
        CREATOR = new DE6(52);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProfileThemeType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
