package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaNoticeIcon implements Parcelable {
    UNRECOGNIZED("MediaNoticeIcon_unspecified"),
    INFO("info"),
    WARNING("warning");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaNoticeIcon[] mediaNoticeIconArr;
        A02 = 0oU.A00(mediaNoticeIconArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (MediaNoticeIcon mediaNoticeIcon : values()) {
            linkedHashMap.put(mediaNoticeIcon.A00, mediaNoticeIcon);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(67);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaNoticeIcon(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
