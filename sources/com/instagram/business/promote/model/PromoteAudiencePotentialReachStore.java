package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class PromoteAudiencePotentialReachStore implements Parcelable {
    public static final W6D CREATOR = new W6D(33);
    public Map A00 = new HashMap();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C13990Tnq.A0r(parcel, this.A00);
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            parcel.writeParcelable((Parcelable) A1J.getKey(), i);
            parcel.writeParcelable((Parcelable) A1J.getValue(), i);
        }
    }
}
