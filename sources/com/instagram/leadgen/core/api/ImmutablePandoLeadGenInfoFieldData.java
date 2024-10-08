package com.instagram.leadgen.core.api;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTA;
import android.os.Parcel;

public final class ImmutablePandoLeadGenInfoFieldData extends 17P implements LeadGenInfoFieldDataIntf {
    public static final C3035269k CREATOR = CTA.A00(32);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.leadgen.core.api.ImmutablePandoLeadGenInfoFieldData] */
    public final LeadGenInfoFieldData FER() {
        return new LeadGenInfoFieldData(A0Q(), getOptionalStringListByHashCode(-1249474914), getBooleanValueByHashCode(2133721055));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.leadgen.core.api.ImmutablePandoLeadGenInfoFieldData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
