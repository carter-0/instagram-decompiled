package com.instagram.business.boost.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum BoostFlowType implements Parcelable {
    ORIGINAL("original"),
    DRAFT("draft"),
    BOOST_AGAIN("boost_again"),
    SHARESHEET("sharesheet"),
    MEDIA_PICKER("media_picker"),
    AB_TESTING_PICKER("ab_testing_picker");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        BoostFlowType[] boostFlowTypeArr;
        A01 = 0oU.A00(boostFlowTypeArr);
        CREATOR = new W6D(0);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BoostFlowType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
