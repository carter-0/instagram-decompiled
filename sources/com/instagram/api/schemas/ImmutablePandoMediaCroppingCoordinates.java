package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.B4K;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoMediaCroppingCoordinates extends 17P implements MediaCroppingCoordinatesIntf {
    public static final C3035269k CREATOR = CTB.A00(15);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaCroppingCoordinates, com.instagram.api.schemas.MediaCroppingCoordinatesIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4K.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final float Asp() {
        return A02(1750260410);
    }

    public final float Ass() {
        return A02(1293727830);
    }

    public final float Asu() {
        return A02(1456518061);
    }

    public final float Asv() {
        return A02(2119951142);
    }

    public final MediaCroppingCoordinates F5m() {
        return new MediaCroppingCoordinates(A02(1750260410), A02(1293727830), A02(1456518061), A02(2119951142));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMediaCroppingCoordinates] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
