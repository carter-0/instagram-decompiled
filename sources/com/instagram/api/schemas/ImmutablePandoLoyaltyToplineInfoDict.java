package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import X.Ca2;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoLoyaltyToplineInfoDict extends 17P implements LoyaltyToplineInfoDict {
    public static final C3035269k CREATOR = CTB.A00(13);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.LoyaltyToplineInfoDict, com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLoyaltyToplineInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, Ca2.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BOk() {
        return A0i(1345320293);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLoyaltyToplineInfoDict] */
    public final Boolean Cee() {
        return getOptionalBooleanValueByHashCode(1119895441);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoLoyaltyToplineInfoDict] */
    public final LoyaltyToplineInfoDictImpl F5f() {
        return new LoyaltyToplineInfoDictImpl(A0i(1345320293), getOptionalBooleanValueByHashCode(1119895441));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLoyaltyToplineInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
