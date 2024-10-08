package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProfileGridItemTypeEnum implements Parcelable {
    UNRECOGNIZED("ProfileGridItemTypeEnum_unspecified"),
    HIGHLIGHT("highlight"),
    MEDIA("media");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProfileGridItemTypeEnum[] profileGridItemTypeEnumArr;
        A02 = 0oU.A00(profileGridItemTypeEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProfileGridItemTypeEnum profileGridItemTypeEnum : values()) {
            linkedHashMap.put(profileGridItemTypeEnum.A00, profileGridItemTypeEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(50);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProfileGridItemTypeEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
