package com.instagram.api.schemas;

import X.0oU;
import X.0se;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PresenceAudience implements Parcelable {
    UNRECOGNIZED("PresenceAudience_unspecified"),
    ALLOWLIST("ALLOWLIST"),
    BESTIES("BESTIES"),
    BLOCKLIST("BLOCKLIST"),
    INTERNAL("INTERNAL"),
    MUTUAL_FOLLOWS("MUTUAL_FOLLOWS");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PresenceAudience[] presenceAudienceArr;
        A02 = 0oU.A00(presenceAudienceArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L);
        for (PresenceAudience presenceAudience : values()) {
            A0x.put(presenceAudience.A00, presenceAudience);
        }
        A01 = A0x;
        CREATOR = new DE6(16);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PresenceAudience(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
