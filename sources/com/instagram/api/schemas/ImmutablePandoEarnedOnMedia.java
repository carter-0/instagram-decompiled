package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoEarnedOnMedia extends 17P implements EarnedOnMedia {
    public static final C3035269k CREATOR = CTC.A00(60);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoEarnedOnMedia] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
