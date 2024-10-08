package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TextPostAppSuggestionCardProfileContextIdentifier implements Parcelable {
    UNRECOGNIZED("TextPostAppSuggestionCardProfileContextIdentifier_unspecified"),
    BIOGRAPHY("BIOGRAPHY"),
    IIC_A2A_FOLLOWED_USERS("IIC_A2A_FOLLOWED_USERS"),
    IIC_A2A_LIKED_USERS("IIC_A2A_LIKED_USERS"),
    NOTABLE_FOLLOW("NOTABLE_FOLLOW"),
    POSTS_OVERALL("POSTS_OVERALL");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextPostAppSuggestionCardProfileContextIdentifier[] textPostAppSuggestionCardProfileContextIdentifierArr;
        A02 = 0oU.A00(textPostAppSuggestionCardProfileContextIdentifierArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier : values()) {
            linkedHashMap.put(textPostAppSuggestionCardProfileContextIdentifier.A00, textPostAppSuggestionCardProfileContextIdentifier);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(47);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextPostAppSuggestionCardProfileContextIdentifier(String str) {
        this.A00 = str;
    }
}
