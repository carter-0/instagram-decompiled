package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum InstagramPromoteSuggestionReason implements Parcelable {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    MOST_COMMENTS,
    MOST_ENGAGEMENT,
    MOST_LIKES,
    MOST_LIKES_LAST_28D,
    MOST_REACH,
    MOST_RECENT;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        InstagramPromoteSuggestionReason[] instagramPromoteSuggestionReasonArr;
        A00 = 0oU.A00(instagramPromoteSuggestionReasonArr);
        CREATOR = new W6D(26);
    }

    public final String toString() {
        return name();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
