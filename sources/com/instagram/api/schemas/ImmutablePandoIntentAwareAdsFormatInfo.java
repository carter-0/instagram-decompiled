package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C48335Ecs;
import X.C51815G2z;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIntentAwareAdsFormatInfo extends 17P implements IntentAwareAdsFormatInfo {
    public static final C3035269k CREATOR = new CTB(7);

    public final IntentAwareAdsFormatType B7R() {
        return (IntentAwareAdsFormatType) A0N(-1268779017, C51815G2z.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.IntentAwareAdsFormatInfo, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsFormatInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48335Ecs.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IntentAwareAdsFormatInfoImpl F5E() {
        return new IntentAwareAdsFormatInfoImpl(B7R(), A0Y());
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsFormatInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
