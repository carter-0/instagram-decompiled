package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.CTB;
import X.CbE;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoOriginalityInfo extends 17P implements OriginalityInfo {
    public static final C3035269k CREATOR = CTB.A00(35);
    public OriginalitySourceMediaInfo A00;

    public final OriginalityFollowButtonInfo B6k() {
        return (OriginalityFollowButtonInfo) A05(-1644347891, ImmutablePandoOriginalityFollowButtonInfo.class);
    }

    public final OriginalitySourceMediaInfo BZ4() {
        OriginalitySourceMediaInfo originalitySourceMediaInfo = this.A00;
        if (originalitySourceMediaInfo == null) {
            return (OriginalitySourceMediaInfo) A05(1923742710, ImmutablePandoOriginalitySourceMediaInfo.class);
        }
        return originalitySourceMediaInfo;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoOriginalityInfo, com.facebook.pando.TreeJNI, com.instagram.api.schemas.OriginalityInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CbE.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoOriginalityInfo, com.facebook.pando.TreeJNI] */
    public final Boolean AkQ() {
        return getOptionalBooleanValueByHashCode(386562054);
    }

    public final OriginalityInfo E7r(1E9 r2) {
        OriginalitySourceMediaInfo BZ4 = BZ4();
        if (BZ4 != null) {
            BZ4.E7s(r2);
        } else {
            BZ4 = null;
        }
        this.A00 = BZ4;
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.api.schemas.ImmutablePandoOriginalityInfo, com.facebook.pando.TreeJNI] */
    public final OriginalityInfoImpl F7H(1E9 r5) {
        OriginalityFollowButtonInfoImpl originalityFollowButtonInfoImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(386562054);
        OriginalityFollowButtonInfo B6k = B6k();
        OriginalitySourceMediaInfoImpl originalitySourceMediaInfoImpl = null;
        if (B6k != null) {
            originalityFollowButtonInfoImpl = B6k.F7G();
        } else {
            originalityFollowButtonInfoImpl = null;
        }
        OriginalitySourceMediaInfo BZ4 = BZ4();
        if (BZ4 != null) {
            originalitySourceMediaInfoImpl = BZ4.F7J(r5);
        }
        return new OriginalityInfoImpl(originalityFollowButtonInfoImpl, originalitySourceMediaInfoImpl, optionalBooleanValueByHashCode);
    }

    public final OriginalityInfoImpl F7I(1E6 r2) {
        return F7H(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoOriginalityInfo, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
