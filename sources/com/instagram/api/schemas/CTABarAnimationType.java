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

public enum CTABarAnimationType implements Parcelable {
    UNRECOGNIZED("CTABarAnimationType_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CTABarAnimationType[] cTABarAnimationTypeArr;
        A02 = 0oU.A00(cTABarAnimationTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CTABarAnimationType cTABarAnimationType : values()) {
            A0x.put(cTABarAnimationType.A00, cTABarAnimationType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(78);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CTABarAnimationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
