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

public enum ClipsSpinSwappableElementType implements Parcelable {
    UNRECOGNIZED("ClipsSpinSwappableElementType_unspecified"),
    TEXT("TEXT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsSpinSwappableElementType[] clipsSpinSwappableElementTypeArr;
        A02 = 0oU.A00(clipsSpinSwappableElementTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsSpinSwappableElementType clipsSpinSwappableElementType : values()) {
            A0x.put(clipsSpinSwappableElementType.A00, clipsSpinSwappableElementType);
        }
        A01 = A0x;
        CREATOR = new DE7(2);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsSpinSwappableElementType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
