package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict extends 17P implements IGLeadGenSubheaderTrustSignalDataDict {
    public static final C3035269k CREATOR = CTC.A00(98);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String CA3() {
        return A0i(-1639952131);
    }

    public final IGLeadGenSubheaderTrustSignalDataDictImpl F4M() {
        return new IGLeadGenSubheaderTrustSignalDataDictImpl(A0i(-1639952131));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict, X.17P] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (A0i(-1639952131) != null) {
            A0t.put("trust_signal_text", A0i(-1639952131));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
