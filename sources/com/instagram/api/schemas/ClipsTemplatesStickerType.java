package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TG;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsTemplatesStickerType implements Parcelable {
    UNRECOGNIZED("ClipsTemplatesStickerType_unspecified"),
    CUTOUT("cutout"),
    CUTOUT_PHOTO("cutout_photo"),
    CUTOUT_VIDEO("cutout_video"),
    GIF("gif"),
    INTERNAL("internal"),
    LYRICS("lyrics");
    
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
        ClipsTemplatesStickerType[] clipsTemplatesStickerTypeArr;
        A02 = 0oU.A00(clipsTemplatesStickerTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ClipsTemplatesStickerType clipsTemplatesStickerType : values()) {
            linkedHashMap.put(clipsTemplatesStickerType.A00, clipsTemplatesStickerType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(6);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsTemplatesStickerType(String str) {
        this.A00 = str;
    }
}
