package com.instagram.mediakit.model;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaKitInsightType implements Parcelable {
    UNRECOGNIZED("MediaKitInsightType_unspecified"),
    DATE_JOINED("DATE_JOINED"),
    POSTS_CREATED("POSTS_CREATED"),
    TOTAL_FOLLOWERS("TOTAL_FOLLOWERS");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaKitInsightType[] mediaKitInsightTypeArr;
        A02 = 0oU.A00(mediaKitInsightTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaKitInsightType mediaKitInsightType : values()) {
            A0x.put(mediaKitInsightType.A00, mediaKitInsightType);
        }
        A01 = A0x;
        CREATOR = new C71269Ogb(17);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaKitInsightType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
