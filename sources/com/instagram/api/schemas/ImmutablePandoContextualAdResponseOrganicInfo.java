package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoContextualAdResponseOrganicInfo extends 17P implements ContextualAdResponseOrganicInfo {
    public static final C3035269k CREATOR = CTC.A00(43);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ContextualAdResponseOrganicInfoImpl F26() {
        return new ContextualAdResponseOrganicInfoImpl(A0i(2040281362), A0i(680614244));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoContextualAdResponseOrganicInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
