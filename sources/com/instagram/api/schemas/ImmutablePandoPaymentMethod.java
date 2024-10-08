package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import X.DLU;
import android.os.Parcel;

public final class ImmutablePandoPaymentMethod extends 17P implements PaymentMethod {
    public static final C3035269k CREATOR = CTB.A00(38);

    public final FundingSourceType Bb4() {
        return (FundingSourceType) A0M(-652242145, DLU.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPaymentMethod] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
