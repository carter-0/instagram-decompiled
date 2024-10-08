package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C48333Ecq;
import X.C51814G2y;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGCTATextVariant extends 17P implements IGCTATextVariant {
    public static final C3035269k CREATOR = new CTC(95);

    public final IGCTATextVariantSource C5d() {
        return (IGCTATextVariantSource) A0N(-692624531, C51814G2y.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTATextVariant, com.instagram.api.schemas.IGCTATextVariant] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48333Ecq.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AtR() {
        return A0i(-1061889969);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTATextVariant] */
    public final Boolean BAz() {
        return getOptionalBooleanValueByHashCode(57317985);
    }

    public final String BKV() {
        return A0i(-1613589672);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoIGCTATextVariant] */
    public final IGCTATextVariantImpl F46() {
        String A0i = A0i(-1061889969);
        return new IGCTATextVariantImpl(C5d(), getOptionalBooleanValueByHashCode(57317985), A0i, A0i(-1613589672));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTATextVariant] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
