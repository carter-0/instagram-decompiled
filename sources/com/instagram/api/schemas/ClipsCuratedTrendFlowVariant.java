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

public enum ClipsCuratedTrendFlowVariant implements Parcelable {
    UNRECOGNIZED("ClipsCuratedTrendFlowVariant_unspecified"),
    WITH_GUIDANCE("with_guidance");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsCuratedTrendFlowVariant[] clipsCuratedTrendFlowVariantArr;
        A02 = 0oU.A00(clipsCuratedTrendFlowVariantArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsCuratedTrendFlowVariant clipsCuratedTrendFlowVariant : values()) {
            A0x.put(clipsCuratedTrendFlowVariant.A00, clipsCuratedTrendFlowVariant);
        }
        A01 = A0x;
        CREATOR = SWT.A00(97);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsCuratedTrendFlowVariant(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
