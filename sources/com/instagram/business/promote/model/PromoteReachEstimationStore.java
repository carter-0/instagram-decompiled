package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.Estimate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class PromoteReachEstimationStore implements Parcelable {
    public static final W6D CREATOR = new W6D(48);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public Map A04 = new HashMap();
    public Map A05 = new HashMap();
    public boolean A06;
    public boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        C13990Tnq.A0r(parcel, this.A05);
        Iterator A0u = AnonymousClass7TF.A0u(this.A05);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            parcel.writeInt(AnonymousClass7TE.A0M(A1J.getKey()));
            parcel.writeParcelable((Estimate) A1J.getValue(), i);
        }
        C13990Tnq.A0r(parcel, this.A04);
        Iterator A0u2 = AnonymousClass7TF.A0u(this.A04);
        while (A0u2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
            parcel.writeInt(AnonymousClass7TE.A0M(A1J2.getKey()));
            parcel.writeParcelable((Estimate) A1J2.getValue(), i);
        }
    }
}
