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

public enum ClipsRSAMidCardSubType implements Parcelable {
    UNRECOGNIZED("ClipsRSAMidCardSubType_unspecified"),
    RECENTLY_SAVED_AUDIO("recently_saved_audio"),
    REVISIT_AUDIO("revisit_audio");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsRSAMidCardSubType[] clipsRSAMidCardSubTypeArr;
        A02 = 0oU.A00(clipsRSAMidCardSubTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsRSAMidCardSubType clipsRSAMidCardSubType : values()) {
            A0x.put(clipsRSAMidCardSubType.A00, clipsRSAMidCardSubType);
        }
        A01 = A0x;
        CREATOR = new DE7(1);
    }

    /* access modifiers changed from: public */
    ClipsRSAMidCardSubType(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
