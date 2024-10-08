package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum DynamicEffectState implements Parcelable {
    UNRECOGNIZED("DynamicEffectState_unspecified"),
    DISABLED("DISABLED"),
    ENABLED("ENABLED"),
    TEST("TEST");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        DynamicEffectState[] dynamicEffectStateArr;
        A02 = 0oU.A00(dynamicEffectStateArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (DynamicEffectState dynamicEffectState : values()) {
            linkedHashMap.put(dynamicEffectState.A00, dynamicEffectState);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(54);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    DynamicEffectState(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
