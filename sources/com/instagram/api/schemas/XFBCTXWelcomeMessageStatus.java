package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XFBCTXWelcomeMessageStatus implements Parcelable {
    UNRECOGNIZED("XFBCTXWelcomeMessageStatus_unspecified"),
    DEFAULT_WELCOME_MESSAGE_OPTED_IN("DEFAULT_WELCOME_MESSAGE_OPTED_IN"),
    DEFAULT_WELCOME_MESSAGE_OPTED_OUT("DEFAULT_WELCOME_MESSAGE_OPTED_OUT"),
    WELCOME_MESSAGE_INELIGIBLE("WELCOME_MESSAGE_INELIGIBLE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        XFBCTXWelcomeMessageStatus[] xFBCTXWelcomeMessageStatusArr;
        A02 = 0oU.A00(xFBCTXWelcomeMessageStatusArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus : values()) {
            linkedHashMap.put(xFBCTXWelcomeMessageStatus.A00, xFBCTXWelcomeMessageStatus);
        }
        A01 = linkedHashMap;
        CREATOR = new FK6(68);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XFBCTXWelcomeMessageStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
