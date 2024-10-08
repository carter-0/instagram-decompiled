package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44129CWu;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerSignalPlainDetails extends 17P implements CreatorViewerSignalPlainDetails {
    public static final C3035269k CREATOR = CTC.A00(52);

    public final FormattedString C2X() {
        return (FormattedString) A05(-2060497896, ImmutablePandoFormattedString.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.CreatorViewerSignalPlainDetails, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalPlainDetails] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44129CWu.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BE9() {
        return C41847B3o.A1D(this);
    }

    public final CreatorViewerSignalPlainDetailsImpl F2W() {
        FormattedStringImpl formattedStringImpl;
        String A1D = C41847B3o.A1D(this);
        FormattedString C2X = C2X();
        if (C2X != null) {
            formattedStringImpl = C2X.F3F();
        } else {
            formattedStringImpl = null;
        }
        return new CreatorViewerSignalPlainDetailsImpl(formattedStringImpl, A1D);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalPlainDetails] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
