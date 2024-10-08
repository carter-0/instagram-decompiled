package com.facebook.oxygen.preloads.integration.install.bottomsheet;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C9942Rjv;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class BottomSheetFeatures extends AnonymousClass0T0 implements Parcelable {
    public static final BottomSheetFeatures A01 = new BottomSheetFeatures(C9942Rjv.A00);
    public static final Parcelable.Creator CREATOR = SWZ.A01(39);
    public final Integer A00;

    public BottomSheetFeatures(Integer num) {
        0qQ.A0B(num, 1);
        this.A00 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        if (1 - this.A00.intValue() != 0) {
            str = "SHOW_ALWAYS";
        } else {
            str = "SHOW_NO_WIFI";
        }
        parcel.writeString(str);
    }
}
