package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoClipsBreakingCreatorInfo extends 17P implements ClipsBreakingCreatorInfo {
    public static final C3035269k CREATOR = CTC.A00(28);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ClipsBreakingCreatorInfoImpl F1S() {
        return new ClipsBreakingCreatorInfoImpl(A0h(-1473781449));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoClipsBreakingCreatorInfo] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        A0h(-1473781449);
        A0t.put("display_label", A0h(-1473781449));
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsBreakingCreatorInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
