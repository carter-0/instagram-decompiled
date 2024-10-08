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

public enum GatingResponseType implements Parcelable {
    UNRECOGNIZED("GatingResponseType_unspecified"),
    APPEALABLE("appealable"),
    MISINFORMATION("misinformation"),
    SENSITIVITY("sensitive");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        GatingResponseType[] gatingResponseTypeArr;
        A02 = 0oU.A00(gatingResponseTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (GatingResponseType gatingResponseType : values()) {
            A0x.put(gatingResponseType.A00, gatingResponseType);
        }
        A01 = A0x;
        CREATOR = new DE7(78);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    GatingResponseType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
