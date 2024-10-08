package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44584ChI;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoWordOffset extends 17P implements WordOffset {
    public static final C3035269k CREATOR = CTA.A00(19);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.WordOffset, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44584ChI.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final int B1W() {
        return getIntValueByHashCode(-1010839954);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final int Byf() {
        return getIntValueByHashCode(-1532887371);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final int Byi() {
        return getIntValueByHashCode(752192821);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final boolean C9N() {
        return getBooleanValueByHashCode(-32837853);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final WordOffsetImpl FDS() {
        return new WordOffsetImpl(getIntValueByHashCode(1942471790), getIntValueByHashCode(-1010839954), getIntValueByHashCode(-1532887371), getIntValueByHashCode(752192821), getBooleanValueByHashCode(-32837853));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final int getEndIndex() {
        return getIntValueByHashCode(1942471790);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWordOffset] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
