package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CTABarActionType implements Parcelable {
    UNRECOGNIZED("CTABarActionType_unspecified"),
    BOOK_APPOINTMENT("book_appointment"),
    OPEN_AUDIO_PAGE("open_audio_page"),
    OPEN_BOTTOMSHEET("open_bottomsheet"),
    OPEN_COLLECTION("open_collection"),
    OPEN_DISCOUNT("open_discount"),
    OPEN_FUNDRAISER("open_fundraiser"),
    OPEN_INSTAGRAM_DIRECT("open_instagram_direct"),
    OPEN_PRODUCT_DETAILS_PAGE("open_product_details_page"),
    OPEN_STOREFRONT("open_storefront"),
    OPEN_UNIFIED_BOTTOMSHEET("open_unified_bottomsheet"),
    OPEN_WHATSAPP("open_whatsapp");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CTABarActionType[] cTABarActionTypeArr;
        A02 = 0oU.A00(cTABarActionTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CTABarActionType cTABarActionType : values()) {
            A0x.put(cTABarActionType.A00, cTABarActionType);
        }
        A01 = A0x;
        CREATOR = new SWT(77);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CTABarActionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
