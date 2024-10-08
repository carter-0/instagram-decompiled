package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsMerchandisingPillType implements Parcelable {
    UNRECOGNIZED("ClipsMerchandisingPillType_unspecified"),
    HIGHLIGHTED_USE_AUDIO("highlighted_use_audio"),
    HIGHLIGHTED_USE_EFFECT("highlighted_use_effect");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsMerchandisingPillType[] clipsMerchandisingPillTypeArr;
        A02 = 0oU.A00(clipsMerchandisingPillTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsMerchandisingPillType clipsMerchandisingPillType : values()) {
            A0x.put(clipsMerchandisingPillType.A00, clipsMerchandisingPillType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(98);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsMerchandisingPillType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
