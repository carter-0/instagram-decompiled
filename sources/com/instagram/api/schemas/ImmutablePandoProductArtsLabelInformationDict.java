package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44255Cbq;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoProductArtsLabelInformationDict extends 17P implements ProductArtsLabelInformationDict {
    public static final C3035269k CREATOR = CTB.A00(43);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductArtsLabelInformationDict, com.instagram.api.schemas.ProductArtsLabelInformationDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44255Cbq.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductArtsLabelInformationDictImpl F7n() {
        return new ProductArtsLabelInformationDictImpl(A0i(-2125526615), A0i(-1649475163));
    }

    public final String getLabelDisplayValue() {
        return A0i(-2125526615);
    }

    public final String getLabelType() {
        return A0i(-1649475163);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductArtsLabelInformationDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
