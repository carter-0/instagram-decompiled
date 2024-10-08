package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MoreInfoProductTagType implements Parcelable {
    UNRECOGNIZED("MoreInfoProductTagType_unspecified"),
    LINK_STICKER_ONLY("link_sticker_only"),
    MIDCARD_SMART_DESTINATION("midcard_smart_destination"),
    MIDCARD_TWO_TAP_TARGETS("midcard_two_tap_targets"),
    PILL("pill"),
    PRODUCT_NAME_CTA("product_name_cta"),
    PRODUCT_NAME_WITH_POST_TAP_CTA("product_name_with_post_tap_cta"),
    THUMBNAIL("thumbnail"),
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
        MoreInfoProductTagType[] moreInfoProductTagTypeArr;
        A02 = 0oU.A00(moreInfoProductTagTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MoreInfoProductTagType moreInfoProductTagType : values()) {
            linkedHashMap.put(moreInfoProductTagType.A00, moreInfoProductTagType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(68);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MoreInfoProductTagType(String str) {
        this.A00 = str;
    }
}
