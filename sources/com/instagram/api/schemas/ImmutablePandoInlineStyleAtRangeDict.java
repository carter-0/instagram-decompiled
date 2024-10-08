package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44192CZf;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoInlineStyleAtRangeDict extends 17P implements InlineStyleAtRangeDictIntf {
    public static final C3035269k CREATOR = CTB.A00(6);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict, com.instagram.api.schemas.InlineStyleAtRangeDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44192CZf.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict] */
    public final Integer BHI() {
        return getOptionalIntValueByHashCode(728566923);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict] */
    public final Integer BMP() {
        return getOptionalIntValueByHashCode(-1106363674);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict] */
    public final Integer BXp() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict] */
    public final InlineStyleAtRangeDict F5D() {
        return new InlineStyleAtRangeDict(getOptionalIntValueByHashCode(728566923), getOptionalIntValueByHashCode(-1106363674), getOptionalIntValueByHashCode(-1019779949));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
