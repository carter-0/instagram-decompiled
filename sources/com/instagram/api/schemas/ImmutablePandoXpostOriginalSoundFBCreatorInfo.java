package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44588ChM;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoXpostOriginalSoundFBCreatorInfo extends 17P implements XpostOriginalSoundFBCreatorInfo {
    public static final C3035269k CREATOR = CTA.A00(22);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoXpostOriginalSoundFBCreatorInfo, com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44588ChM.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Asa() {
        return A0i(-1606095170);
    }

    public final String Asc() {
        return A0i(-857419179);
    }

    public final String B4J() {
        return A0i(1447602198);
    }

    public final String B4K() {
        return A0i(-318338504);
    }

    public final XpostOriginalSoundFBCreatorInfoImpl FDX() {
        return new XpostOriginalSoundFBCreatorInfoImpl(A0i(-1606095170), A0i(-857419179), A0i(1447602198), A0i(-318338504));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoXpostOriginalSoundFBCreatorInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
