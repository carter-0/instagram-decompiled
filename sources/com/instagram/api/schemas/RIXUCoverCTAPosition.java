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

public enum RIXUCoverCTAPosition implements Parcelable {
    UNRECOGNIZED("RIXUCoverCTAPosition_unspecified"),
    END("end");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        RIXUCoverCTAPosition[] rIXUCoverCTAPositionArr;
        A02 = 0oU.A00(rIXUCoverCTAPositionArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RIXUCoverCTAPosition rIXUCoverCTAPosition : values()) {
            A0x.put(rIXUCoverCTAPosition.A00, rIXUCoverCTAPosition);
        }
        A01 = A0x;
        CREATOR = new DE6(57);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUCoverCTAPosition(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
