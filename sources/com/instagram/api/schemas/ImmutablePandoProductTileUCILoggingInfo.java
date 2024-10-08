package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C45415Cvv;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTileUCILoggingInfo extends 17P implements ProductTileUCILoggingInfo {
    public static final C3035269k CREATOR = CTB.A00(60);

    public final /* synthetic */ C45415Cvv AKM() {
        return new C45415Cvv(this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Bg9() {
        return A0i(-304755546);
    }

    public final String BjL() {
        return A0i(987695650);
    }

    public final String BjN() {
        return A0i(277425268);
    }

    public final long BjQ() {
        return A03(2024527533);
    }

    public final String CB2() {
        return A0h(-503704593);
    }

    public final long CCn() {
        return A03(-240150463);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileUCILoggingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
