package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44116CWh;
import X.C46043DKa;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerInsightInfo extends 17P implements CreatorViewerInsightInfo {
    public static final C3035269k CREATOR = CTC.A00(47);

    public final FormattedString B7m() {
        return (FormattedString) A05(-1686936880, ImmutablePandoFormattedString.class);
    }

    public final CreatorViewerInsightTypeV2 BHi() {
        return (CreatorViewerInsightTypeV2) A0M(-476664838, C46043DKa.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerInsightInfo, com.instagram.api.schemas.CreatorViewerInsightInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44116CWh.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorViewerInsightInfoImpl F2M() {
        FormattedStringImpl formattedStringImpl;
        FormattedString B7m = B7m();
        if (B7m != null) {
            formattedStringImpl = B7m.F3F();
        } else {
            formattedStringImpl = null;
        }
        return new CreatorViewerInsightInfoImpl(BHi(), formattedStringImpl, A0P());
    }

    public final String getText() {
        return A0P();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerInsightInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
