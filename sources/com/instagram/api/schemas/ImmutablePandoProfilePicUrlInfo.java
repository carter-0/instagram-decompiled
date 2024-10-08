package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41867B4l;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoProfilePicUrlInfo extends 17P implements ProfilePicUrlInfo {
    public static final C3035269k CREATOR = CTB.A00(63);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ProfilePicUrlInfo, com.instagram.api.schemas.ImmutablePandoProfilePicUrlInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41867B4l.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfilePicUrlInfo, X.17P] */
    public final ProfilePicUrlInfoImpl F8B() {
        return new ProfilePicUrlInfoImpl(getIntValueByHashCode(-1221029593), A0R(), getIntValueByHashCode(113126854));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfilePicUrlInfo] */
    public final int getHeight() {
        return getIntValueByHashCode(-1221029593);
    }

    public final String getUrl() {
        return A0R();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfilePicUrlInfo] */
    public final int getWidth() {
        return getIntValueByHashCode(113126854);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfilePicUrlInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
