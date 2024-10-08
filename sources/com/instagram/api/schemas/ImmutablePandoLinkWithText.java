package com.instagram.api.schemas;

import X.0Yt;
import X.17P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoLinkWithText extends 17P implements LinkWithTextIntf {
    public static final C3035269k CREATOR = CTB.A00(9);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.LinkWithTextIntf, com.instagram.api.schemas.ImmutablePandoLinkWithText] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getText() != null) {
            C41845B3m.A10(getText(), A1H);
        }
        if (getUrl() != null) {
            C41845B3m.A0y(getUrl(), A1H);
        }
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final LinkWithText F5P() {
        return new LinkWithText(A0P(), A0R());
    }

    public final String getText() {
        return A0P();
    }

    public final String getUrl() {
        return A0R();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLinkWithText] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
