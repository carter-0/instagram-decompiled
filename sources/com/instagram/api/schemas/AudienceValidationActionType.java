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

public enum AudienceValidationActionType implements Parcelable {
    UNRECOGNIZED("AudienceValidationActionType_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AudienceValidationActionType[] audienceValidationActionTypeArr;
        A02 = 0oU.A00(audienceValidationActionTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AudienceValidationActionType audienceValidationActionType : values()) {
            A0x.put(audienceValidationActionType.A00, audienceValidationActionType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(48);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudienceValidationActionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
