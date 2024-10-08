package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C48331Eco;
import X.C51813G2x;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGBWPIABPostClickDataExtensionDict extends 17P implements IGBWPIABPostClickDataExtensionDict {
    public static final C3035269k CREATOR = new CTC(94);

    public final IGBWPExperienceTypes Aj4() {
        return (IGBWPExperienceTypes) A0N(-1717005289, C51813G2x.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGBWPIABPostClickDataExtensionDict, com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48331Eco.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGBWPIABPostClickDataExtensionDict] */
    public final Integer AXk() {
        return getOptionalIntValueByHashCode(-345502239);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGBWPIABPostClickDataExtensionDict] */
    public final Integer AXl() {
        return getOptionalIntValueByHashCode(-1553100105);
    }

    public final String Ac0() {
        return A0i(-1411301915);
    }

    public final String AfY() {
        return A0i(608983734);
    }

    public final String Anc() {
        return A0i(908408358);
    }

    public final String BaI() {
        return A0i(859271610);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGBWPIABPostClickDataExtensionDict, X.17P] */
    public final IGBWPIABPostClickDataExtensionDictImpl F41() {
        String A0i = A0i(-1042689291);
        return new IGBWPIABPostClickDataExtensionDictImpl(Aj4(), getOptionalIntValueByHashCode(-345502239), getOptionalIntValueByHashCode(-1553100105), A0i, A0i(-1411301915), A0i(608983734), A0i(908408358), A0i(859271610));
    }

    public final String getAccessToken() {
        return A0i(-1042689291);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGBWPIABPostClickDataExtensionDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
