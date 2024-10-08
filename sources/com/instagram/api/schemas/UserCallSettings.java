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

public enum UserCallSettings implements Parcelable {
    UNRECOGNIZED("UserCallSettings_unspecified"),
    EVERYONE("everyone"),
    OFF("off"),
    PEOPLE_YOU_FOLLOW("people_you_follow"),
    PEOPLE_YOU_FOLLOW_WHO_FOLLOW_BACK("people_you_follow_who_follow_back"),
    PEOPLE_YOU_MESSAGE("people_you_message"),
    SPECIFIC_PEOPLE("specific_people");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        UserCallSettings[] userCallSettingsArr;
        A02 = 0oU.A00(userCallSettingsArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (UserCallSettings userCallSettings : values()) {
            A0x.put(userCallSettings.A00, userCallSettings);
        }
        A01 = A0x;
        CREATOR = FK6.A00(57);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    UserCallSettings(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
