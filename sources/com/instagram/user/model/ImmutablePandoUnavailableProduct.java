package com.instagram.user.model;

import X.17P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTA;
import android.os.Parcel;

public final class ImmutablePandoUnavailableProduct extends 17P implements UnavailableProduct {
    public static final C3035269k CREATOR = CTA.A00(86);

    public final User BRo() {
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'merchant' field.");
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String getProductId() {
        return A0k(1753008747);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUnavailableProduct] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
