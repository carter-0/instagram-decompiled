package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IgUserBioLinkTypeEnum implements Parcelable {
    UNRECOGNIZED("IgUserBioLinkTypeEnum_unspecified"),
    EXTERNAL("external"),
    FACEBOOK("facebook"),
    FACEBOOK_GROUP("facebook_group"),
    FACEBOOK_PAGE("facebook_page");
    
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
        IgUserBioLinkTypeEnum[] igUserBioLinkTypeEnumArr;
        A02 = 0oU.A00(igUserBioLinkTypeEnumArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IgUserBioLinkTypeEnum igUserBioLinkTypeEnum : values()) {
            linkedHashMap.put(igUserBioLinkTypeEnum.A00, igUserBioLinkTypeEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(45);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IgUserBioLinkTypeEnum(String str) {
        this.A00 = str;
    }
}
