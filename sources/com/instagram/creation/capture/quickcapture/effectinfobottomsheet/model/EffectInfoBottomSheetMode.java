package com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model;

import X.AnonymousClass7TE;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public enum EffectInfoBottomSheetMode implements Parcelable {
    NORMAL,
    SHOPPING,
    SHOPPING_TEST,
    TRY_ON;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new LVP(22);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TE.A1T(parcel, this);
    }
}
