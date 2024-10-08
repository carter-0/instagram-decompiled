package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum UpcomingEventStickerSource implements Parcelable {
    UNRECOGNIZED("UpcomingEventStickerSource_unspecified"),
    FEED_RESHARE("feed_reshare"),
    STICKER_TRAY("sticker_tray");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        UpcomingEventStickerSource[] upcomingEventStickerSourceArr;
        A02 = 0oU.A00(upcomingEventStickerSourceArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (UpcomingEventStickerSource upcomingEventStickerSource : values()) {
            A0x.put(upcomingEventStickerSource.A00, upcomingEventStickerSource);
        }
        A01 = A0x;
        CREATOR = FK6.A00(53);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    UpcomingEventStickerSource(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
