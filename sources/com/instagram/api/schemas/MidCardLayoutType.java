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

public enum MidCardLayoutType implements Parcelable {
    UNRECOGNIZED("MidCardLayoutType_unspecified"),
    GRID("grid"),
    MEGA_CARD("mega_card"),
    SINGLE_CLIP("single_clip");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MidCardLayoutType[] midCardLayoutTypeArr;
        A02 = 0oU.A00(midCardLayoutTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MidCardLayoutType midCardLayoutType : values()) {
            A0x.put(midCardLayoutType.A00, midCardLayoutType);
        }
        A01 = A0x;
        CREATOR = new FK5(77);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MidCardLayoutType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
