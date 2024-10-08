package com.instagram.common.textwithentities.model;

import X.17P;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import X.Ci3;
import X.DNU;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict;
import com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict;
import com.instagram.api.schemas.ImmutablePandoRange;
import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.RangeIntf;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoTextWithEntities extends 17P implements TextWithEntitiesIntf {
    public static final C3035269k CREATOR = CTA.A00(24);

    public final List Ap2() {
        return A08(-1924319438, ImmutablePandoColorAtTextRangeDict.class);
    }

    public final List BHJ() {
        return A08(-288113398, ImmutablePandoInlineStyleAtRangeDict.class);
    }

    public final LinkAction BMj() {
        return (LinkAction) A0N(1874837019, DNU.A00);
    }

    public final List BjD() {
        return A08(-938283306, ImmutablePandoRange.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.common.textwithentities.model.TextWithEntitiesIntf, com.instagram.common.textwithentities.model.ImmutablePandoTextWithEntities] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, Ci3.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Long C7Y() {
        return A0L(55126294);
    }

    public final TextWithEntities FDs() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<ColorAtTextRangeDictIntf> Ap2 = Ap2();
        ArrayList arrayList3 = null;
        if (Ap2 != null) {
            arrayList = AnonymousClass7TF.A0p(Ap2);
            for (ColorAtTextRangeDictIntf F1t : Ap2) {
                arrayList.add(F1t.F1t());
            }
        } else {
            arrayList = null;
        }
        List<InlineStyleAtRangeDictIntf> BHJ = BHJ();
        if (BHJ != null) {
            arrayList2 = AnonymousClass7TF.A0p(BHJ);
            for (InlineStyleAtRangeDictIntf F5D : BHJ) {
                arrayList2.add(F5D.F5D());
            }
        } else {
            arrayList2 = null;
        }
        LinkAction BMj = BMj();
        List<RangeIntf> BjD = BjD();
        if (BjD != null) {
            arrayList3 = AnonymousClass7TF.A0p(BjD);
            for (RangeIntf F8U : BjD) {
                arrayList3.add(F8U.F8U());
            }
        }
        return new TextWithEntities(BMj, A0L(55126294), A0X(), arrayList, arrayList2, arrayList3);
    }

    public final String getText() {
        return A0X();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.common.textwithentities.model.ImmutablePandoTextWithEntities] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
