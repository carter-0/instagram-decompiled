package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum AudiencePotentialReachRating implements Parcelable {
    A06("UNAVAILABLE", "UNAVAILABLE"),
    A04("BAD_TOO_BROAD", "BAD_TOO_BROAD"),
    A05("BAD_TOO_SMALL", "BAD_TOO_SMALL"),
    A07("VAGUE", "VAGUE");
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        AudiencePotentialReachRating[] audiencePotentialReachRatingArr;
        A02 = 0oU.A00(audiencePotentialReachRatingArr);
        CREATOR = new W6D(18);
    }

    /* access modifiers changed from: public */
    AudiencePotentialReachRating(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
