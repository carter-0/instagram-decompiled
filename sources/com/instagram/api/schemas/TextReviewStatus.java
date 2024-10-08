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

public enum TextReviewStatus implements Parcelable {
    UNRECOGNIZED("TextReviewStatus_unspecified"),
    APPROVED("approved"),
    OUTDATED("outdated"),
    PENDING("pending"),
    REJECTED("rejected");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TextReviewStatus[] textReviewStatusArr;
        A02 = 0oU.A00(textReviewStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (TextReviewStatus textReviewStatus : values()) {
            A0x.put(textReviewStatus.A00, textReviewStatus);
        }
        A01 = A0x;
        CREATOR = FK6.A00(40);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextReviewStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
