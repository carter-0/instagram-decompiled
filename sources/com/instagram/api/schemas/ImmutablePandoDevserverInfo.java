package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoDevserverInfo extends 17P implements DevserverInfo {
    public static final C3035269k CREATOR = CTC.A00(56);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getHostType() {
        return A0h(-717251727);
    }

    public final String getUrl() {
        return A0R();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoDevserverInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
