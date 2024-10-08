package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXUCoverPreviewType implements Parcelable {
    UNRECOGNIZED("RIXUCoverPreviewType_unspecified"),
    BOOMERANG("boomerang");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        RIXUCoverPreviewType[] rIXUCoverPreviewTypeArr;
        A02 = 0oU.A00(rIXUCoverPreviewTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RIXUCoverPreviewType rIXUCoverPreviewType : values()) {
            A0x.put(rIXUCoverPreviewType.A00, rIXUCoverPreviewType);
        }
        A01 = A0x;
        CREATOR = new DE6(59);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUCoverPreviewType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
