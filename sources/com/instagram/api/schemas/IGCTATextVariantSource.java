package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGCTATextVariantSource implements Parcelable {
    UNRECOGNIZED("IGCTATextVariantSource_unspecified"),
    CTA_GENAI_GENERATED_DYNAMIC_TEXT("cta_genai_generated_dynamic_text"),
    CTA_GENAI_L1_EXTRACTED_DYNAMIC_TEXT("cta_genai_l1_extracted_dynamic_text"),
    CTA_PREGENERATED_DYNAMIC_TEXT_ADVANCED("cta_pregenerated_cta_dynamic_text_advanced");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGCTATextVariantSource[] iGCTATextVariantSourceArr;
        A02 = 0oU.A00(iGCTATextVariantSourceArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IGCTATextVariantSource iGCTATextVariantSource : values()) {
            A0x.put(iGCTATextVariantSource.A00, iGCTATextVariantSource);
        }
        A01 = A0x;
        CREATOR = FK5.A00(13);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGCTATextVariantSource(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
