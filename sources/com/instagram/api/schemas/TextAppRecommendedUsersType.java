package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TextAppRecommendedUsersType implements Parcelable {
    UNRECOGNIZED("TextAppRecommendedUsersType_unspecified"),
    GREAT_ACCOUNTS("great_accounts"),
    PROFILE_CHAINING_RECOMMENDED_USERS("profile_chaining_recommended_users"),
    RECOMMENDED_USERS("recommended_users"),
    UNRECIPROCATED_RECOMMENDED_USERS("unreciprocated_recommended_users");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextAppRecommendedUsersType[] textAppRecommendedUsersTypeArr;
        A02 = 0oU.A00(textAppRecommendedUsersTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (TextAppRecommendedUsersType textAppRecommendedUsersType : values()) {
            A0x.put(textAppRecommendedUsersType.A00, textAppRecommendedUsersType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(28);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextAppRecommendedUsersType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
