package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XDTTextAppQuoteAttachmentEligibility implements Parcelable {
    UNRECOGNIZED("XDTTextAppQuoteAttachmentEligibility_unspecified"),
    ALLOWED("allowed"),
    ATTACHMENT_NOT_SUPPORTED("attachment_not_supported"),
    AUTHOR_LIMITED_QUOTE("author_limited_quote"),
    CAROUSEL_NOT_ALLOWED("carousel_not_allowed"),
    NOT_APPLICABLE("not_applicable");
    
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
        XDTTextAppQuoteAttachmentEligibility[] xDTTextAppQuoteAttachmentEligibilityArr;
        A02 = 0oU.A00(xDTTextAppQuoteAttachmentEligibilityArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility : values()) {
            linkedHashMap.put(xDTTextAppQuoteAttachmentEligibility.A00, xDTTextAppQuoteAttachmentEligibility);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(56);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XDTTextAppQuoteAttachmentEligibility(String str) {
        this.A00 = str;
    }
}
