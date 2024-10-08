package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum LinkingAuthState implements Parcelable {
    NEW_AUTH("new_auth"),
    PRO2PRO_NEW_AUTH("pro2pro_new_auth"),
    BUSINESS_TOKEN_OR_UNKNOWN("business_token_or_unknown");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        LinkingAuthState[] linkingAuthStateArr;
        A01 = 0oU.A00(linkingAuthStateArr);
        CREATOR = new W6D(27);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LinkingAuthState(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
