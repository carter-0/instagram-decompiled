package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdsTargetingGender implements Parcelable {
    UNRECOGNIZED("AdsTargetingGender_unspecified"),
    ALL("ALL"),
    FEMALE("FEMALE"),
    MALE("MALE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdsTargetingGender[] adsTargetingGenderArr;
        A02 = 0oU.A00(adsTargetingGenderArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (AdsTargetingGender adsTargetingGender : values()) {
            linkedHashMap.put(adsTargetingGender.A00, adsTargetingGender);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(35);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdsTargetingGender(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
