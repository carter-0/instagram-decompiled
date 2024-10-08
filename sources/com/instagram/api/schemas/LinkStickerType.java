package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum LinkStickerType implements Parcelable {
    UNRECOGNIZED("LinkStickerType_unspecified"),
    WEBSITE("WEBSITE"),
    WHATSAPP("WHATSAPP");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkStickerType[] linkStickerTypeArr;
        A02 = 0oU.A00(linkStickerTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (LinkStickerType linkStickerType : values()) {
            linkedHashMap.put(linkStickerType.A00, linkStickerType);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(51);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LinkStickerType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
