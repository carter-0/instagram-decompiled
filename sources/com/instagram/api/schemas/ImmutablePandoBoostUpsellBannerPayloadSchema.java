package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CV2;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoBoostUpsellBannerPayloadSchema extends 17P implements BoostUpsellBannerPayloadSchema {
    public static final C3035269k CREATOR = CTC.A00(17);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBoostUpsellBannerPayloadSchema, com.instagram.api.schemas.BoostUpsellBannerPayloadSchema] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CV2.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Ago() {
        return A0i(1253013930);
    }

    public final String AnY() {
        return A0i(-1005018006);
    }

    public final BoostUpsellBannerPayloadSchemaImpl F0u() {
        return new BoostUpsellBannerPayloadSchemaImpl(A0i(1852205030), A0i(1253013930), A0i(-1005018006));
    }

    public final String getActionUrl() {
        return A0i(1852205030);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBoostUpsellBannerPayloadSchema] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
