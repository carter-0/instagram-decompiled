package com.instagram.creatortools.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CreatorToolsComponent implements Parcelable {
    UNRECOGNIZED("CreatorToolsComponent_unspecified"),
    COVER("cover"),
    FOOTER("footer"),
    INSIGHTS("insights"),
    INSPIRATION("inspiration"),
    MONETIZATION("monetization"),
    PRODUCT_ELIGIBILITY_CRITERIA("product_eligibility_criteria"),
    SECTION_HEADER("section_header");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreatorToolsComponent[] creatorToolsComponentArr;
        A02 = 0oU.A00(creatorToolsComponentArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CreatorToolsComponent creatorToolsComponent : values()) {
            A0x.put(creatorToolsComponent.A00, creatorToolsComponent);
        }
        A01 = A0x;
        CREATOR = LVP.A00(57);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreatorToolsComponent(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
