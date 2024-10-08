package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44555Cgp;
import X.CTA;
import X.DN4;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoUntaggableReason extends 17P implements UntaggableReasonIntf {
    public static final C3035269k CREATOR = CTA.A00(13);

    public final LinkWithTextIntf AYC() {
        return (LinkWithTextIntf) A05(-1422950858, ImmutablePandoLinkWithText.class);
    }

    public final LinkWithTextIntf BCz() {
        return (LinkWithTextIntf) A05(1297152568, ImmutablePandoLinkWithText.class);
    }

    public final InstagramProductTaggabilityState C3w() {
        return (InstagramProductTaggabilityState) A0N(180641359, DN4.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.UntaggableReasonIntf, com.instagram.api.schemas.ImmutablePandoUntaggableReason] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44555Cgp.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final UntaggableReason FCz() {
        LinkWithText linkWithText;
        LinkWithTextIntf AYC = AYC();
        LinkWithText linkWithText2 = null;
        if (AYC != null) {
            linkWithText = AYC.F5P();
        } else {
            linkWithText = null;
        }
        String A0T = A0T();
        LinkWithTextIntf BCz = BCz();
        if (BCz != null) {
            linkWithText2 = BCz.F5P();
        }
        return new UntaggableReason(C3w(), linkWithText, linkWithText2, A0T, A0Y());
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoUntaggableReason] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
