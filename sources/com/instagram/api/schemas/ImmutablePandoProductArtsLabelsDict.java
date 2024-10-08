package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44257Cbs;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoProductArtsLabelsDict extends 17P implements ProductArtsLabelsDictIntf {
    public static final C3035269k CREATOR = CTB.A00(44);

    public final List BKR() {
        return A08(-1110417409, ImmutablePandoProductArtsLabelInformationDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ProductArtsLabelsDictIntf, com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductArtsLabelsDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44257Cbs.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductArtsLabelsDict F7o() {
        ArrayList arrayList;
        List<ProductArtsLabelInformationDict> BKR = BKR();
        if (BKR != null) {
            arrayList = AnonymousClass7TG.A0r(BKR);
            for (ProductArtsLabelInformationDict F7n : BKR) {
                arrayList.add(F7n.F7n());
            }
        } else {
            arrayList = null;
        }
        return new ProductArtsLabelsDict(arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductArtsLabelsDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
