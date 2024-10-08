package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoMusicStatusStyleResponseInfo extends 17P implements MusicStatusStyleResponseInfo {
    public static final C3035269k CREATOR = CTB.A00(22);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final MusicStatusStyleResponseInfoImpl F6a() {
        return new MusicStatusStyleResponseInfoImpl(A0h(1025801609), A0h(1258734948), A0h(1589871550));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMusicStatusStyleResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
