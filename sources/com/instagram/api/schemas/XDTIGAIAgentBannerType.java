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

public enum XDTIGAIAgentBannerType implements Parcelable {
    UNRECOGNIZED("XDTIGAIAgentBannerType_unspecified"),
    IN_REVIEW("in_review"),
    REJECTED("rejected"),
    SAFETY_WARNING("safety_warning"),
    TAKEN_DOWN("taken_down");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        XDTIGAIAgentBannerType[] xDTIGAIAgentBannerTypeArr;
        A02 = 0oU.A00(xDTIGAIAgentBannerTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (XDTIGAIAgentBannerType xDTIGAIAgentBannerType : values()) {
            A0x.put(xDTIGAIAgentBannerType.A00, xDTIGAIAgentBannerType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(64);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XDTIGAIAgentBannerType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
