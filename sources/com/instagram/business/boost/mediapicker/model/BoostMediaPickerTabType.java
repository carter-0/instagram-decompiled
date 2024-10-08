package com.instagram.business.boost.mediapicker.model;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public enum BoostMediaPickerTabType implements Parcelable {
    FEED("FEED"),
    STORY("STORY"),
    CLIPS("CLIPS"),
    FEED_AB_TEST("FEED_AB_TEST");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        BoostMediaPickerTabType[] boostMediaPickerTabTypeArr;
        A01 = 0oU.A00(boostMediaPickerTabTypeArr);
        CREATOR = new FK6(98);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BoostMediaPickerTabType(String str) {
        this.A00 = str;
    }
}
