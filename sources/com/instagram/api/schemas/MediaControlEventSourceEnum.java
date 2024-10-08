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

public enum MediaControlEventSourceEnum implements Parcelable {
    UNRECOGNIZED("MediaControlEventSourceEnum_unspecified"),
    ON_IMPRESSION("on_impression"),
    THREE_DOT_MENU("three_dot_menu"),
    CENTRAL_PLACE_TO_MANAGE("central_place_to_manage"),
    SEE_LESS_TAP("see_less_tap"),
    UFI("ufi");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaControlEventSourceEnum[] mediaControlEventSourceEnumArr;
        A02 = 0oU.A00(mediaControlEventSourceEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaControlEventSourceEnum mediaControlEventSourceEnum : values()) {
            A0x.put(mediaControlEventSourceEnum.A00, mediaControlEventSourceEnum);
        }
        A01 = A0x;
        CREATOR = new FK5(62);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaControlEventSourceEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
