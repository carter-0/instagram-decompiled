package com.facebookpay.apm;

import X.0qQ;
import X.AnonymousClass2E0;
import X.C13925TlT;
import X.SWZ;
import android.os.Parcel;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;
import com.facebookpay.expresscheckout.models.APMConfiguration;

public final class APMConfigurationImpl implements APMConfiguration {
    public static final SWZ CREATOR = SWZ.A01(78);
    public final C13925TlT A00;

    public APMConfigurationImpl(C13925TlT tlT) {
        0qQ.A0B(tlT, 1);
        this.A00 = tlT;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass2E0.A0J();
        TreeParcelable.A01(parcel, (TreeJNI) this.A00);
    }
}
