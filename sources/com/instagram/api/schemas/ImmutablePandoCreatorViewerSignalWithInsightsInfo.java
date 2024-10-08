package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44133CWy;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoCreatorViewerSignalWithInsightsInfo extends 17P implements CreatorViewerSignalWithInsightsInfo {
    public static final C3035269k CREATOR = CTC.A00(54);

    public final List BHj() {
        return A08(545142747, ImmutablePandoCreatorViewerInsightInfo.class);
    }

    public final CreatorViewerSignalInfo BwI() {
        return (CreatorViewerSignalInfo) A04(-902467928, ImmutablePandoCreatorViewerSignalInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalWithInsightsInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44133CWy.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BE9() {
        return C41847B3o.A1D(this);
    }

    public final String BFx() {
        return A0i(100313435);
    }

    public final CreatorViewerSignalWithInsightsInfoImpl F2Y() {
        ArrayList arrayList;
        String A1D = C41847B3o.A1D(this);
        String A0i = A0i(100313435);
        List<CreatorViewerInsightInfo> BHj = BHj();
        if (BHj != null) {
            arrayList = AnonymousClass7TG.A0r(BHj);
            for (CreatorViewerInsightInfo F2M : BHj) {
                arrayList.add(F2M.F2M());
            }
        } else {
            arrayList = null;
        }
        return new CreatorViewerSignalWithInsightsInfoImpl(BwI().F2T(), A1D, A0i, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalWithInsightsInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
