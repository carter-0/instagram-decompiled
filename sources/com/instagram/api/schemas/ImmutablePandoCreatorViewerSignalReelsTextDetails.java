package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44131CWw;
import X.C46046DKd;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerSignalReelsTextDetails extends 17P implements CreatorViewerSignalReelsTextDetails {
    public static final C3035269k CREATOR = CTC.A00(53);

    public final FormattedString C2X() {
        return (FormattedString) A05(-2060497896, ImmutablePandoFormattedString.class);
    }

    public final ClipsTextFormatType C5D() {
        return (ClipsTextFormatType) A0N(-824444304, C46046DKd.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalReelsTextDetails] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44131CWw.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorViewerSignalReelsTextDetailsImpl F2X() {
        FormattedStringImpl formattedStringImpl;
        FormattedString C2X = C2X();
        if (C2X != null) {
            formattedStringImpl = C2X.F3F();
        } else {
            formattedStringImpl = null;
        }
        return new CreatorViewerSignalReelsTextDetailsImpl(C5D(), formattedStringImpl);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalReelsTextDetails] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
