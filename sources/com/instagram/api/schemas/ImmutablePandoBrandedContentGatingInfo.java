package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CV7;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ImmutablePandoBrandedContentGatingInfo extends 17P implements BrandedContentGatingInfoIntf {
    public static final C3035269k CREATOR = CTC.A00(20);

    public final Map Ari() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo, X.17P] */
    public final BrandedContentGatingInfo F0x() {
        ArrayList arrayList = null;
        List<BrandedContentGatingCountryMinimumAge> Arj = Arj();
        if (Arj != null) {
            arrayList = AnonymousClass7TG.A0r(Arj);
            for (BrandedContentGatingCountryMinimumAge F0w : Arj) {
                arrayList.add(F0w.F0w());
            }
        }
        return new BrandedContentGatingInfo(getOptionalIntValueByHashCode(-436636159), A0i(745126434), (HashMap) null, arrayList, getOptionalStringListByHashCode(1901672549));
    }

    public final List Arj() {
        return A08(-2057127321, ImmutablePandoBrandedContentGatingCountryMinimumAge.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo, com.instagram.api.schemas.BrandedContentGatingInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CV7.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo] */
    public final List Ark() {
        return getOptionalStringListByHashCode(1901672549);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo] */
    public final Integer Avl() {
        return getOptionalIntValueByHashCode(-436636159);
    }

    public final String Bra() {
        return A0i(745126434);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
