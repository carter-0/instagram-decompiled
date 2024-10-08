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

public enum InstapalCharacterType implements Parcelable {
    UNRECOGNIZED("InstapalCharacterType_unspecified"),
    FREDDIE("FREDDIE"),
    HUGO("HUGO"),
    LUNA("LUNA"),
    OTTO("OTTO"),
    RUPERT("RUPERT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        InstapalCharacterType[] instapalCharacterTypeArr;
        A02 = 0oU.A00(instapalCharacterTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (InstapalCharacterType instapalCharacterType : values()) {
            A0x.put(instapalCharacterType.A00, instapalCharacterType);
        }
        A01 = A0x;
        CREATOR = new FK5(43);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    InstapalCharacterType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
