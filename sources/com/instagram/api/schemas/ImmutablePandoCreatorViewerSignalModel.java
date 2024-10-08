package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44127CWs;
import X.C46045DKc;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerSignalModel extends 17P implements CreatorViewerSignalModel {
    public static final C3035269k CREATOR = CTC.A00(51);
    public CreatorViewerSignalDetails A00;

    public final CreatorViewerSignalDetails Awl() {
        CreatorViewerSignalDetails creatorViewerSignalDetails = this.A00;
        if (creatorViewerSignalDetails == null) {
            return (CreatorViewerSignalDetails) A04(1557721666, ImmutablePandoCreatorViewerSignalDetails.class);
        }
        return creatorViewerSignalDetails;
    }

    public final InspirationSignalType BwM() {
        return (InspirationSignalType) A0M(673104497, C46045DKc.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalModel, com.instagram.api.schemas.CreatorViewerSignalModel] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44127CWs.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorViewerSignalModel E7L(1E9 r2) {
        CreatorViewerSignalDetails Awl = Awl();
        Awl.E7K(r2);
        this.A00 = Awl;
        return this;
    }

    public final CreatorViewerSignalModelImpl F2U(1E9 r5) {
        return new CreatorViewerSignalModelImpl(Awl().F2R(r5), BwM(), A0S());
    }

    public final CreatorViewerSignalModelImpl F2V(1E6 r2) {
        return F2U(C41847B3o.A0q(r2));
    }

    public final String getTitle() {
        return A0S();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalModel] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
