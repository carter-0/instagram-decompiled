package com.instagram.clips.model.metadata;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41878B4w;
import X.CTA;
import X.DNR;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualHighlightType;

public final class ImmutablePandoClipsContextualHighlightInfo extends 17P implements ClipsContextualHighlightInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(23);

    public final ContextualHighlightType Ar9() {
        return (ContextualHighlightType) A0M(-25701741, DNR.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf, com.instagram.clips.model.metadata.ImmutablePandoClipsContextualHighlightInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41878B4w.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ClipsContextualHighlightInfo FDg() {
        return new ClipsContextualHighlightInfo(Ar9(), A0i(1019042900), A0h(473715380), A0h(-797226465));
    }

    public final String getChainingMediaId() {
        return A0i(1019042900);
    }

    public final String getContextualHighlightId() {
        return A0h(473715380);
    }

    public final String getContextualHighlightTitle() {
        return A0h(-797226465);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.clips.model.metadata.ImmutablePandoClipsContextualHighlightInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
