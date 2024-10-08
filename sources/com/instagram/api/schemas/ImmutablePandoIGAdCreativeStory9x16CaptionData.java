package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44165CYe;
import X.C46059DKq;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGAdCreativeStory9x16CaptionData extends 17P implements IGAdCreativeStory9x16CaptionData {
    public static final C3035269k CREATOR = CTC.A00(90);

    public final CaptionTextFontStyle AlV() {
        return (CaptionTextFontStyle) A0N(2091550138, C46059DKq.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData, com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44165CYe.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AlO() {
        return A0i(781639243);
    }

    public final String AlP() {
        return A0i(881970794);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData] */
    public final Integer AlQ() {
        return getOptionalIntValueByHashCode(355848923);
    }

    public final Float AlR() {
        return A0K(714298857);
    }

    public final Float AlS() {
        return A0K(715222378);
    }

    public final String AlT() {
        return A0i(968206282);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData] */
    public final Integer AlU() {
        return getOptionalIntValueByHashCode(-1040919848);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData] */
    public final Integer AlY() {
        return getOptionalIntValueByHashCode(2069237229);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData] */
    public final Boolean AlZ() {
        return getOptionalBooleanValueByHashCode(-127283954);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData] */
    public final Boolean Ala() {
        return getOptionalBooleanValueByHashCode(1424998699);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData, X.17P] */
    public final IGAdCreativeStory9x16CaptionDataImpl F3o() {
        String A0i = A0i(781639243);
        String A0i2 = A0i(881970794);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(355848923);
        Float A0K = A0K(714298857);
        Float A0K2 = A0K(715222378);
        String A0i3 = A0i(968206282);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1040919848);
        return new IGAdCreativeStory9x16CaptionDataImpl(AlV(), getOptionalBooleanValueByHashCode(-127283954), getOptionalBooleanValueByHashCode(1424998699), A0K, A0K2, optionalIntValueByHashCode, optionalIntValueByHashCode2, getOptionalIntValueByHashCode(2069237229), A0i, A0i2, A0i3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
