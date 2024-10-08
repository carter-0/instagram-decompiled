package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaControlSurfaceEnum implements Parcelable {
    UNRECOGNIZED("MediaControlSurfaceEnum_unspecified"),
    CONNECTED_FEED("connected_feed"),
    UNCONNECTED_FEED("unconnected_feed"),
    EXPLORE("explore"),
    REELS("reels");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaControlSurfaceEnum[] mediaControlSurfaceEnumArr;
        A02 = 0oU.A00(mediaControlSurfaceEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaControlSurfaceEnum mediaControlSurfaceEnum : values()) {
            A0x.put(mediaControlSurfaceEnum.A00, mediaControlSurfaceEnum);
        }
        A01 = A0x;
        CREATOR = new FK5(63);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaControlSurfaceEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
