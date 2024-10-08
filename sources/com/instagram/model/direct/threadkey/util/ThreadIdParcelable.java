package com.instagram.model.direct.threadkey.util;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C254763t0;
import X.C254793t3;
import X.C66582MXn;
import X.C69042Ndc;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class ThreadIdParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(49);
    public final C254793t3 A00;

    public ThreadIdParcelable(C254793t3 r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C254763t0 r2;
        0qQ.A0B(parcel, 0);
        C254793t3 r22 = this.A00;
        if (r22 instanceof C254763t0) {
            parcel.writeInt(0);
            r2 = (C254763t0) r22;
        } else if (r22 instanceof MsysThreadId) {
            parcel.writeInt(1);
            parcel.writeParcelable((MsysThreadId) r22, i);
            return;
        } else if (r22 instanceof C69042Ndc) {
            parcel.writeInt(2);
            C69042Ndc ndc = (C69042Ndc) r22;
            if (ndc != null) {
                parcel.writeParcelable(ndc.A01, i);
                r2 = ndc.A00;
            } else {
                return;
            }
        } else {
            throw C66582MXn.A0k(r22, "Unexpected ThreadId: ", AnonymousClass7TE.A1A());
        }
        0qQ.A0B(r2, 1);
        parcel.writeString(r2.A00);
    }
}
