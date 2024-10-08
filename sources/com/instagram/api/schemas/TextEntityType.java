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

public enum TextEntityType implements Parcelable {
    UNRECOGNIZED("TextEntityType_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextEntityType[] textEntityTypeArr;
        A02 = 0oU.A00(textEntityTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (TextEntityType textEntityType : values()) {
            A0x.put(textEntityType.A00, textEntityType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(33);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextEntityType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
