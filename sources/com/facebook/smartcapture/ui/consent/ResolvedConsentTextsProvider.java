package com.facebook.smartcapture.ui.consent;

import X.0qQ;
import X.C10856RzH;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ResolvedConsentTextsProvider implements ConsentTextsProvider {
    public static final Parcelable.Creator CREATOR = SWZ.A01(59);
    public final C10856RzH A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C10856RzH rzH = this.A00;
        parcel.writeString(rzH.A07);
        parcel.writeString(rzH.A06);
        parcel.writeString(rzH.A09);
        parcel.writeString(rzH.A08);
        parcel.writeString(rzH.A04);
        parcel.writeString(rzH.A00);
        parcel.writeString(rzH.A01);
        parcel.writeString(rzH.A02);
        parcel.writeString(rzH.A05);
        parcel.writeString(rzH.A03);
        parcel.writeString(rzH.A0G);
        parcel.writeString(rzH.A0A);
        parcel.writeString(rzH.A0D);
        parcel.writeString(rzH.A0B);
        parcel.writeString(rzH.A0C);
        parcel.writeString(rzH.A0F);
        parcel.writeString(rzH.A0E);
    }

    public ResolvedConsentTextsProvider(C10856RzH rzH) {
        this.A00 = rzH;
    }
}
