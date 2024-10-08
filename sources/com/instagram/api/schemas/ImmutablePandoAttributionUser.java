package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41872B4q;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAttributionUser extends 17P implements AttributionUser {
    public static final C3035269k CREATOR = CTC.A00(7);

    public final ProfilePicture Bh6() {
        return (ProfilePicture) A05(1782764648, ImmutablePandoProfilePicture.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.AttributionUser, com.instagram.api.schemas.ImmutablePandoAttributionUser] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41872B4q.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAttributionUser] */
    public final Boolean CeL() {
        return getOptionalBooleanValueByHashCode(1565553213);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAttributionUser, X.17P] */
    public final AttributionUserImpl F0a() {
        ProfilePictureImpl profilePictureImpl;
        String A0j = A0j(-1289631102);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1565553213);
        ProfilePicture Bh6 = Bh6();
        if (Bh6 != null) {
            profilePictureImpl = Bh6.F8C();
        } else {
            profilePictureImpl = null;
        }
        return new AttributionUserImpl(profilePictureImpl, optionalBooleanValueByHashCode, A0j, C41845B3m.A0q(this));
    }

    public final String getInstagramUserId() {
        return A0j(-1289631102);
    }

    public final String getUsername() {
        return C41845B3m.A0q(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAttributionUser] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
