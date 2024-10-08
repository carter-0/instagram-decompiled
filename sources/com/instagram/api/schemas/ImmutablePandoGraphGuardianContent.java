package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoGraphGuardianContent extends 17P implements GraphGuardianContent {
    public static final C3035269k CREATOR = CTC.A00(77);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Agd() {
        return A0i(3029410);
    }

    public final String Aip() {
        return A0i(-1759645465);
    }

    public final String Aiu() {
        return A0i(1292959499);
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGraphGuardianContent] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
