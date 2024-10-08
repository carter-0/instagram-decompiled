package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CY2;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGenAIPersonaBannerDict extends 17P implements GenAIPersonaBannerDict {
    public static final C3035269k CREATOR = CTC.A00(73);

    public final GenAIMessagingData BFV() {
        return (GenAIMessagingData) A04(256177478, ImmutablePandoGenAIMessagingData.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.GenAIPersonaBannerDict, com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannerDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CY2.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Bbr() {
        return A0k(679047822);
    }

    public final String Bgy() {
        return A0i(-174080651);
    }

    public final GenAIPersonaBannerDictImpl F3M() {
        return new GenAIPersonaBannerDictImpl(BFV().F3L(), A0Q(), A0k(679047822), A0i(-174080651));
    }

    public final String getName() {
        return A0Q();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannerDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
