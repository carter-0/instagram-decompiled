package com.instagram.business.promote.model;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum PromoteButtonActionType implements Parcelable {
    OPEN_WEB_LINK("open_web_link");
    
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
        PromoteButtonActionType[] promoteButtonActionTypeArr;
        A01 = 0oU.A00(promoteButtonActionTypeArr);
        CREATOR = new W6D(35);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PromoteButtonActionType(String str) {
        this.A00 = str;
    }
}
