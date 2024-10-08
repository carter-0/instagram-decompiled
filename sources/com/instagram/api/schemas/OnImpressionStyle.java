package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum OnImpressionStyle implements Parcelable {
    UNRECOGNIZED("OnImpressionStyle_unspecified"),
    DUAL_BINARY("dual_binary"),
    DUAL_CTA("dual_cta"),
    DUAL_HAIRLINE("dual_hairline"),
    DUAL_HAIRLINE_QUESTION("dual_hairline_question"),
    MINIMAL("minimal"),
    NEGATIVE_CTA("negative_cta"),
    NEGATIVE_HAIRLINE("negative_hairline"),
    UNIFIED("unified"),
    UNIFIED_NO_SUBTEXT("unified_no_subtext");
    
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
        OnImpressionStyle[] onImpressionStyleArr;
        A02 = 0oU.A00(onImpressionStyleArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (OnImpressionStyle onImpressionStyle : values()) {
            linkedHashMap.put(onImpressionStyle.A00, onImpressionStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(87);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    OnImpressionStyle(String str) {
        this.A00 = str;
    }
}
