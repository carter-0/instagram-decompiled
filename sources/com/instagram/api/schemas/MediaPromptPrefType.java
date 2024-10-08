package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaPromptPrefType implements Parcelable {
    UNRECOGNIZED("MediaPromptPrefType_unspecified"),
    NOT_APPLICABLE("0"),
    OFF("2"),
    ON(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaPromptPrefType[] mediaPromptPrefTypeArr;
        A02 = 0oU.A00(mediaPromptPrefTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaPromptPrefType mediaPromptPrefType : values()) {
            A0x.put(mediaPromptPrefType.A00, mediaPromptPrefType);
        }
        A01 = A0x;
        CREATOR = FK5.A00(68);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaPromptPrefType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
