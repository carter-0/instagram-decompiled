package com.instagram.model.direct.threadkey.util;

import X.0qQ;
import X.C254743sy;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

public final class UnifiedThreadKeyParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(50);
    public final C254743sy A00;

    public UnifiedThreadKeyParcelable(C254743sy r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        0qQ.A0B(parcel, 0);
        C254743sy r1 = this.A00;
        if (r1 instanceof DirectThreadKey) {
            parcel.writeInt(0);
            ((DirectThreadKey) r1).writeToParcel(parcel, i);
            return;
        }
        if (r1 instanceof MsysThreadId) {
            parcel.writeInt(1);
            parcelable = (MsysThreadId) r1;
        } else if (r1 instanceof DirectMsysMixedThreadKey) {
            parcel.writeInt(2);
            parcelable = (Parcelable) r1;
        } else {
            return;
        }
        parcel.writeParcelable(parcelable, i);
    }
}
