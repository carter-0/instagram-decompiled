package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoRankingInfo extends 17P implements RankingInfoIntf {
    public static final C3035269k CREATOR = CTB.A00(68);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BkH() {
        return A0i(-1488714928);
    }

    public final String BnM() {
        return A0i(1303313259);
    }

    public final String CGl() {
        return A0j(127650833);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRankingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
