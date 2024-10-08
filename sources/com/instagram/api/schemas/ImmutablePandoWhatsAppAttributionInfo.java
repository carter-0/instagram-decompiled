package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import X.HUA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoWhatsAppAttributionInfo extends 17P implements WhatsAppAttributionInfo {
    public static final C3035269k CREATOR = new CTA(18);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWhatsAppAttributionInfo, com.instagram.api.schemas.WhatsAppAttributionInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, HUA.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AYR() {
        return A0i(1851627344);
    }

    public final String AZI() {
        return A0i(551467614);
    }

    public final WhatsAppAttributionInfoImpl FDR() {
        return new WhatsAppAttributionInfoImpl(A0i(1851627344), A0i(551467614));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWhatsAppAttributionInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
