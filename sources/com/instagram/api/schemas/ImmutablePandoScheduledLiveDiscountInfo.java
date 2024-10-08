package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44330CdC;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoScheduledLiveDiscountInfo extends 17P implements ScheduledLiveDiscountInfo {
    public static final C3035269k CREATOR = CTB.A00(73);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ScheduledLiveDiscountInfo, com.instagram.api.schemas.ImmutablePandoScheduledLiveDiscountInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44330CdC.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Axs() {
        return A0j(-536450855);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoScheduledLiveDiscountInfo] */
    public final Boolean CP7() {
        return getOptionalBooleanValueByHashCode(1518770791);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoScheduledLiveDiscountInfo] */
    public final ScheduledLiveDiscountInfoImpl F8q() {
        return new ScheduledLiveDiscountInfoImpl(A0j(-536450855), getOptionalBooleanValueByHashCode(1518770791));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoScheduledLiveDiscountInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
