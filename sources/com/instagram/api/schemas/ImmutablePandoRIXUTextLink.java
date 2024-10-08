package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoRIXUTextLink extends 17P implements RIXUTextLink {
    public static final C3035269k CREATOR = CTB.A00(66);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoRIXUTextLink] */
    public final RIXUTextLinkImpl F8T() {
        return new RIXUTextLinkImpl(getOptionalIntValueByHashCode(100571), getOptionalIntValueByHashCode(109757538), A0e(), A0i(3575610));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRIXUTextLink] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
