package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum DynamicCreativeOptimizationDoFType implements Parcelable {
    UNRECOGNIZED("DynamicCreativeOptimizationDoFType_unspecified"),
    DISABLED("DISABLED"),
    FAM_TOGGLE_OFF("FAM_TOGGLE_OFF"),
    FAM_TOGGLE_ON("FAM_TOGGLE_ON"),
    SMART_CROP_ELIGIBLE_OFF("SMART_CROP_ELIGIBLE_OFF"),
    SMART_CROP_ELIGIBLE_ON("SMART_CROP_ELIGIBLE_ON"),
    SMART_CROP_INELIGIBLE_OFF("SMART_CROP_INELIGIBLE_OFF"),
    SMART_CROP_INELIGIBLE_ON("SMART_CROP_INELIGIBLE_ON"),
    USER_ENROLLED("USER_ENROLLED"),
    USER_ENROLLED_AUTOFLOW("USER_ENROLLED_AUTOFLOW"),
    USER_ENROLLED_IMAGE_CROPPING_NON_DCO("USER_ENROLLED_IMAGE_CROPPING_NON_DCO"),
    USER_ENROLLED_LWI_ACO("USER_ENROLLED_LWI_ACO"),
    USER_ENROLLED_NON_DCO("USER_ENROLLED_NON_DCO"),
    VCK_MIXED_FORMAT("VCK_MIXED_FORMAT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        DynamicCreativeOptimizationDoFType[] dynamicCreativeOptimizationDoFTypeArr;
        A02 = 0oU.A00(dynamicCreativeOptimizationDoFTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (DynamicCreativeOptimizationDoFType dynamicCreativeOptimizationDoFType : values()) {
            A0x.put(dynamicCreativeOptimizationDoFType.A00, dynamicCreativeOptimizationDoFType);
        }
        A01 = A0x;
        CREATOR = DE7.A00(53);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    DynamicCreativeOptimizationDoFType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
