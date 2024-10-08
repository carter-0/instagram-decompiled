package com.facebook.smartcapture.download;

import X.0lg;
import X.0qQ;
import X.AnonymousClass7TE;
import X.DbW;
import X.Pxf;
import X.SWZ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class IgVoltronAndNmlModulesDownloader implements Parcelable, CreditCardModulesDownloader {
    public static final Parcelable.Creator CREATOR = SWZ.A01(55);
    public final Bundle A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeBundle(this.A00);
    }

    public IgVoltronAndNmlModulesDownloader(Parcel parcel) {
        this.A00 = parcel.readBundle(Pxf.A0W(this));
    }

    public IgVoltronAndNmlModulesDownloader(0lg r2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        this.A00 = A0a;
        DbW.A0w(A0a, r2);
    }
}
