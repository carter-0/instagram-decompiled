package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StickerTraySectionCTAType implements Parcelable {
    UNRECOGNIZED("StickerTraySectionCTAType_unspecified"),
    CUTOUT_STICKERS("cutout_stickers"),
    EDIT("edit"),
    GIPHY("giphy"),
    MUSIC("music"),
    MUSIC_BROWSE("music_browse"),
    A09(NetInfoModule.CONNECTION_TYPE_NONE);
    
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
        StickerTraySectionCTAType[] stickerTraySectionCTATypeArr;
        A02 = 0oU.A00(stickerTraySectionCTATypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (StickerTraySectionCTAType stickerTraySectionCTAType : values()) {
            linkedHashMap.put(stickerTraySectionCTAType.A00, stickerTraySectionCTAType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(28);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StickerTraySectionCTAType(String str) {
        this.A00 = str;
    }
}
