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

public enum FanClubCategoryType implements Parcelable {
    UNRECOGNIZED("FanClubCategoryType_unspecified"),
    LEAST_INTERACTED_WITH("least_interacted_with"),
    MOST_INTERACTED_WITH("most_interacted_with"),
    MOST_RECENT("most_recent");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        FanClubCategoryType[] fanClubCategoryTypeArr;
        A02 = 0oU.A00(fanClubCategoryTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (FanClubCategoryType fanClubCategoryType : values()) {
            A0x.put(fanClubCategoryType.A00, fanClubCategoryType);
        }
        A01 = A0x;
        CREATOR = DE7.A00(67);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FanClubCategoryType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
