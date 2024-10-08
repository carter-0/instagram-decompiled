package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CUZ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoAppstoreMetadataDict extends 17P implements AppstoreMetadataDict {
    public static final C3035269k CREATOR = CTC.A00(6);

    public final List Bq2() {
        return A08(-24959027, ImmutablePandoIGAdScreenshotURLDataDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict, com.instagram.api.schemas.AppstoreMetadataDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CUZ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Float Aeb() {
        return A0K(2031429119);
    }

    public final String BHr() {
        return A0i(-1343751829);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict] */
    public final Integer BXE() {
        return getOptionalIntValueByHashCode(-1894227870);
    }

    public final String BXF() {
        return A0i(32113727);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict, X.17P] */
    public final AppstoreMetadataDictImpl F0X() {
        ArrayList arrayList;
        Float A0K = A0K(2031429119);
        String A0i = A0i(-1343751829);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1894227870);
        String A0i2 = A0i(32113727);
        List<IGAdScreenshotURLDataDict> Bq2 = Bq2();
        if (Bq2 != null) {
            arrayList = AnonymousClass7TG.A0r(Bq2);
            for (IGAdScreenshotURLDataDict F3t : Bq2) {
                arrayList.add(F3t.F3t());
            }
        } else {
            arrayList = null;
        }
        return new AppstoreMetadataDictImpl(A0K, optionalIntValueByHashCode, A0i, A0i2, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
