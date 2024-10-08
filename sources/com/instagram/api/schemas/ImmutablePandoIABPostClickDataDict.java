package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44161CYa;
import X.C46058DKp;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoIABPostClickDataDict extends 17P implements IABPostClickDataDict {
    public static final C3035269k CREATOR = CTC.A00(87);

    public final IGBWPIABPostClickDataExtensionDict Aj6() {
        return (IGBWPIABPostClickDataExtensionDict) A05(-1299739516, ImmutablePandoIGBWPIABPostClickDataExtensionDict.class);
    }

    public final List B0f() {
        return A0p(1178408536, C46058DKp.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIABPostClickDataDict, com.instagram.api.schemas.IABPostClickDataDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44161CYa.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IABPostClickDataDictImpl F3l() {
        IGBWPIABPostClickDataExtensionDictImpl iGBWPIABPostClickDataExtensionDictImpl;
        IGBWPIABPostClickDataExtensionDict Aj6 = Aj6();
        if (Aj6 != null) {
            iGBWPIABPostClickDataExtensionDictImpl = Aj6.F41();
        } else {
            iGBWPIABPostClickDataExtensionDictImpl = null;
        }
        return new IABPostClickDataDictImpl(iGBWPIABPostClickDataExtensionDictImpl, B0f());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIABPostClickDataDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
