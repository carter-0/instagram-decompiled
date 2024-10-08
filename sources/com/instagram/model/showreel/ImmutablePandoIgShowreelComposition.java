package com.instagram.model.showreel;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C55057HbS;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoIgShowreelComposition extends 17P implements IgShowreelComposition {
    public static final C3035269k CREATOR = CTA.A00(64);

    public final List Acn() {
        return A08(-2143919126, ImmutablePandoIgShowreelCompositionAssetInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreel.ImmutablePandoIgShowreelComposition, com.instagram.model.showreel.IgShowreelComposition] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C55057HbS.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Anf() {
        return A0h(-173873537);
    }

    public final String AqT() {
        return A0h(951530617);
    }

    public final String C4b() {
        return A0h(-180214992);
    }

    public final IgShowreelCompositionImpl FFx() {
        ArrayList arrayList;
        List<IgShowreelCompositionAssetInfoIntf> Acn = Acn();
        if (Acn != null) {
            arrayList = AnonymousClass7TG.A0r(Acn);
            for (IgShowreelCompositionAssetInfoIntf FFw : Acn) {
                arrayList.add(FFw.FFw());
            }
        } else {
            arrayList = null;
        }
        return new IgShowreelCompositionImpl(A0h(-173873537), A0h(951530617), A0h(-180214992), arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreel.ImmutablePandoIgShowreelComposition] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
