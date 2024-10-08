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

public enum ModuleVariant implements Parcelable {
    UNRECOGNIZED("ModuleVariant_unspecified"),
    VARIANT_A("VARIANT_A"),
    VARIANT_B("VARIANT_B"),
    VARIANT_C("VARIANT_C"),
    VARIANT_D("VARIANT_D"),
    VARIANT_E("VARIANT_E"),
    VARIANT_F("VARIANT_F"),
    VARIANT_H("VARIANT_H"),
    VARIANT_I("VARIANT_I");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ModuleVariant[] moduleVariantArr;
        A02 = 0oU.A00(moduleVariantArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ModuleVariant moduleVariant : values()) {
            A0x.put(moduleVariant.A00, moduleVariant);
        }
        A01 = A0x;
        CREATOR = FK5.A00(83);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ModuleVariant(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
