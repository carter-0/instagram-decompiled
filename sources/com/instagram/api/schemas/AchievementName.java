package com.instagram.api.schemas;

import X.0oU;
import X.DbS;
import X.DbY;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AchievementName implements Parcelable {
    ;
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AchievementName[] achievementNameArr;
        A02 = 0oU.A00(achievementNameArr);
        LinkedHashMap A0x2 = DbS.A0x(DbY.A00(r4));
        for (AchievementName achievementName : values()) {
            A0x2.put(achievementName.A00, achievementName);
        }
        A01 = A0x2;
        CREATOR = new SWT(23);
    }

    /* access modifiers changed from: public */
    AchievementName(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
