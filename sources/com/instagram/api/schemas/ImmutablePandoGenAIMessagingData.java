package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CY0;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGenAIMessagingData extends 17P implements GenAIMessagingData {
    public static final C3035269k CREATOR = CTC.A00(72);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGenAIMessagingData, com.instagram.api.schemas.GenAIMessagingData] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CY0.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AhB() {
        return A0j(-1383249261);
    }

    public final String C6C() {
        return A0j(-1562235024);
    }

    public final GenAIMessagingDataImpl F3L() {
        return new GenAIMessagingDataImpl(A0j(-1383249261), A0j(-1562235024));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGenAIMessagingData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
