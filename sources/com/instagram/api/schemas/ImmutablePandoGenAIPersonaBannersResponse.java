package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CY4;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoGenAIPersonaBannersResponse extends 17P implements GenAIPersonaBannersResponse {
    public static final C3035269k CREATOR = CTC.A00(74);

    public final List AfJ() {
        return A0o(-336959801, ImmutablePandoGenAIPersonaBannerDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.GenAIPersonaBannersResponse, com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannersResponse] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CY4.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final GenAIPersonaBannersResponseImpl F3N() {
        List<GenAIPersonaBannerDict> AfJ = AfJ();
        ArrayList A0r = AnonymousClass7TG.A0r(AfJ);
        for (GenAIPersonaBannerDict F3M : AfJ) {
            A0r.add(F3M.F3M());
        }
        return new GenAIPersonaBannersResponseImpl(A0r);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannersResponse] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
