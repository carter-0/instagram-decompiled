package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CW0;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoColorAtTextRangeDict extends 17P implements ColorAtTextRangeDictIntf {
    public static final C3035269k CREATOR = CTC.A00(36);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ColorAtTextRangeDictIntf, com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CW0.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BD2() {
        return A0i(448685389);
    }

    public final String BD3() {
        return A0i(-834172120);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict] */
    public final Integer BMP() {
        return getOptionalIntValueByHashCode(-1106363674);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict] */
    public final Integer BXp() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict] */
    public final ColorAtTextRangeDict F1t() {
        return new ColorAtTextRangeDict(getOptionalIntValueByHashCode(-1106363674), getOptionalIntValueByHashCode(-1019779949), A0i(448685389), A0i(-834172120));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
