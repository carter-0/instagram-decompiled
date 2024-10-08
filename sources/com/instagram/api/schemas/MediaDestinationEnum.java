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

public enum MediaDestinationEnum implements Parcelable {
    UNRECOGNIZED("MediaDestinationEnum_unspecified"),
    CAMERA("camera"),
    DRAFT("draft"),
    GALLERY("gallery");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaDestinationEnum[] mediaDestinationEnumArr;
        A02 = 0oU.A00(mediaDestinationEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaDestinationEnum mediaDestinationEnum : values()) {
            A0x.put(mediaDestinationEnum.A00, mediaDestinationEnum);
        }
        A01 = A0x;
        CREATOR = FK5.A00(64);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaDestinationEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
