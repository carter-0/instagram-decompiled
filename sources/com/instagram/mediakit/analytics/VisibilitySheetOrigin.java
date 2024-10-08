package com.instagram.mediakit.analytics;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public enum VisibilitySheetOrigin implements Parcelable {
    PINNED_PRIVATE_BANNER("pinned_private_banner"),
    MENU("menu_sheet"),
    FIRST_PUBLISH_NUX("initial_publish_nux");
    
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
        VisibilitySheetOrigin[] visibilitySheetOriginArr;
        A01 = 0oU.A00(visibilitySheetOriginArr);
        CREATOR = new C71269Ogb(12);
    }

    /* access modifiers changed from: public */
    VisibilitySheetOrigin(String str) {
        this.A00 = str;
    }
}
