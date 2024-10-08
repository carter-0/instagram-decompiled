package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoContextualAdResponseExtras extends 17P implements ContextualAdResponseExtras {
    public static final C3035269k CREATOR = CTC.A00(42);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ContextualAdResponseExtrasImpl F25() {
        return new ContextualAdResponseExtrasImpl(A0i(1208718508), A0i(2096152009), A0i(-1989826711), A0i(375833953));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoContextualAdResponseExtras] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
