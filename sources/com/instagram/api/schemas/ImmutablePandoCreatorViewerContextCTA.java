package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44114CWf;
import X.CTC;
import X.DKW;
import X.DKX;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerContextCTA extends 17P implements CreatorViewerContextCTA {
    public static final C3035269k CREATOR = CTC.A00(46);

    public final CreatorViewerContextCTAType Aqw() {
        return (CreatorViewerContextCTAType) A0M(-1400078183, DKW.A00);
    }

    public final CreatorViewerContextCTATarget AtQ() {
        return (CreatorViewerContextCTATarget) A0N(1890155168, DKX.A00);
    }

    public final FormattedString B31() {
        return (FormattedString) A05(1708780659, ImmutablePandoFormattedString.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerContextCTA, com.instagram.api.schemas.CreatorViewerContextCTA] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44114CWf.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BE9() {
        return C41847B3o.A1D(this);
    }

    public final CreatorViewerContextCTAImpl F2K() {
        FormattedStringImpl formattedStringImpl;
        CreatorViewerContextCTAType Aqw = Aqw();
        CreatorViewerContextCTATarget AtQ = AtQ();
        FormattedString B31 = B31();
        if (B31 != null) {
            formattedStringImpl = B31.F3F();
        } else {
            formattedStringImpl = null;
        }
        return new CreatorViewerContextCTAImpl(AtQ, Aqw, formattedStringImpl, C41847B3o.A1D(this), A0P());
    }

    public final String getText() {
        return A0P();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerContextCTA] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
