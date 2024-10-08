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

public enum IgUserRelatedAccountTypeEnum implements Parcelable {
    UNRECOGNIZED("IgUserRelatedAccountTypeEnum_unspecified"),
    FACEBOOK_PAGE("facebook_page");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IgUserRelatedAccountTypeEnum[] igUserRelatedAccountTypeEnumArr;
        A02 = 0oU.A00(igUserRelatedAccountTypeEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IgUserRelatedAccountTypeEnum igUserRelatedAccountTypeEnum : values()) {
            A0x.put(igUserRelatedAccountTypeEnum.A00, igUserRelatedAccountTypeEnum);
        }
        A01 = A0x;
        CREATOR = FK5.A00(35);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IgUserRelatedAccountTypeEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
