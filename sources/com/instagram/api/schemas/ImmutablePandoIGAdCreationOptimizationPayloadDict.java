package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44163CYc;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoIGAdCreationOptimizationPayloadDict extends 17P implements IGAdCreationOptimizationPayloadDict {
    public static final C3035269k CREATOR = CTC.A00(88);

    public final List AYy() {
        return A08(-623401166, ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreationOptimizationPayloadDict, com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44163CYc.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IGAdCreationOptimizationPayloadDictImpl F3m() {
        ArrayList arrayList;
        List<IGAdCreativeOptimizationConfigByTypeDict> AYy = AYy();
        if (AYy != null) {
            arrayList = AnonymousClass7TG.A0r(AYy);
            for (IGAdCreativeOptimizationConfigByTypeDict F3n : AYy) {
                arrayList.add(F3n.F3n());
            }
        } else {
            arrayList = null;
        }
        return new IGAdCreationOptimizationPayloadDictImpl(arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreationOptimizationPayloadDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
