package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MoreInfoStickerCTAType implements Parcelable {
    UNRECOGNIZED("MoreInfoStickerCTAType_unspecified"),
    CHIP("chip"),
    EXPANDED(BaseViewManager.STATE_EXPANDED),
    ONE_LINE("one_line"),
    ONE_LINE_RESIZABLE("one_line_resizable"),
    TWO_LINE("two_line"),
    WIDE_CTA("wide_cta");
    
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
        MoreInfoStickerCTAType[] moreInfoStickerCTATypeArr;
        A02 = 0oU.A00(moreInfoStickerCTATypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MoreInfoStickerCTAType moreInfoStickerCTAType : values()) {
            linkedHashMap.put(moreInfoStickerCTAType.A00, moreInfoStickerCTAType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(70);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MoreInfoStickerCTAType(String str) {
        this.A00 = str;
    }
}
