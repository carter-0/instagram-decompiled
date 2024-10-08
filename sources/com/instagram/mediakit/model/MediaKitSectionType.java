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

public enum MediaKitSectionType implements Parcelable {
    UNRECOGNIZED("MediaKitSectionType_unspecified"),
    ACCOUNTS("ACCOUNTS"),
    INSIGHTS("INSIGHTS"),
    MEDIA_POSTS("MEDIA_POSTS"),
    TEXT("TEXT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaKitSectionType[] mediaKitSectionTypeArr;
        A02 = 0oU.A00(mediaKitSectionTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaKitSectionType mediaKitSectionType : values()) {
            A0x.put(mediaKitSectionType.A00, mediaKitSectionType);
        }
        A01 = A0x;
        CREATOR = new C71269Ogb(18);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaKitSectionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
