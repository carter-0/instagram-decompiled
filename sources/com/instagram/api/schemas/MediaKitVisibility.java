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

public enum MediaKitVisibility implements Parcelable {
    UNRECOGNIZED("MediaKitVisibility_unspecified"),
    PRIVATE("PRIVATE"),
    PUBLIC("PUBLIC");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaKitVisibility[] mediaKitVisibilityArr;
        A02 = 0oU.A00(mediaKitVisibilityArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaKitVisibility mediaKitVisibility : values()) {
            A0x.put(mediaKitVisibility.A00, mediaKitVisibility);
        }
        A01 = A0x;
        CREATOR = new FK5(66);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaKitVisibility(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
