package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AppreciationUFIEntryActionType implements Parcelable {
    UNRECOGNIZED("AppreciationUFIEntryActionType_unspecified"),
    GIFT_FEED("gift_feed");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AppreciationUFIEntryActionType[] appreciationUFIEntryActionTypeArr;
        A02 = 0oU.A00(appreciationUFIEntryActionTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AppreciationUFIEntryActionType appreciationUFIEntryActionType : values()) {
            A0x.put(appreciationUFIEntryActionType.A00, appreciationUFIEntryActionType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(42);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AppreciationUFIEntryActionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
