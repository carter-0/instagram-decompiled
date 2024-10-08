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

public enum EarnedOnMediaState implements Parcelable {
    UNRECOGNIZED("EarnedOnMediaState_unspecified"),
    ARCHIVED("ARCHIVED"),
    DELETED("DELETED");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        EarnedOnMediaState[] earnedOnMediaStateArr;
        A02 = 0oU.A00(earnedOnMediaStateArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (EarnedOnMediaState earnedOnMediaState : values()) {
            A0x.put(earnedOnMediaState.A00, earnedOnMediaState);
        }
        A01 = A0x;
        CREATOR = new DE7(56);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EarnedOnMediaState(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
