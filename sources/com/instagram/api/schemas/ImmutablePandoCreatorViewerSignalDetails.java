package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44123CWo;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerSignalDetails extends 17P implements CreatorViewerSignalDetails {
    public static final C3035269k CREATOR = CTC.A00(49);
    public CreatorViewerSignalAudioDetails A00;

    public final CreatorViewerSignalAudioDetails Ada() {
        CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails = this.A00;
        if (creatorViewerSignalAudioDetails == null) {
            return (CreatorViewerSignalAudioDetails) A05(1918893785, ImmutablePandoCreatorViewerSignalAudioDetails.class);
        }
        return creatorViewerSignalAudioDetails;
    }

    public final CreatorViewerSignalPlainDetails Bcu() {
        return (CreatorViewerSignalPlainDetails) A05(-740554547, ImmutablePandoCreatorViewerSignalPlainDetails.class);
    }

    public final CreatorViewerSignalReelsTextDetails BlA() {
        return (CreatorViewerSignalReelsTextDetails) A05(300614166, ImmutablePandoCreatorViewerSignalReelsTextDetails.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalDetails, com.instagram.api.schemas.CreatorViewerSignalDetails] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44123CWo.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorViewerSignalDetails E7K(1E9 r2) {
        CreatorViewerSignalAudioDetails Ada = Ada();
        if (Ada != null) {
            Ada.E7J(r2);
        } else {
            Ada = null;
        }
        this.A00 = Ada;
        return this;
    }

    public final CreatorViewerSignalDetailsImpl F2R(1E9 r5) {
        CreatorViewerSignalAudioDetailsImpl creatorViewerSignalAudioDetailsImpl;
        CreatorViewerSignalPlainDetailsImpl creatorViewerSignalPlainDetailsImpl;
        CreatorViewerSignalAudioDetails Ada = Ada();
        CreatorViewerSignalReelsTextDetailsImpl creatorViewerSignalReelsTextDetailsImpl = null;
        if (Ada != null) {
            creatorViewerSignalAudioDetailsImpl = Ada.F2P(r5);
        } else {
            creatorViewerSignalAudioDetailsImpl = null;
        }
        CreatorViewerSignalPlainDetails Bcu = Bcu();
        if (Bcu != null) {
            creatorViewerSignalPlainDetailsImpl = Bcu.F2W();
        } else {
            creatorViewerSignalPlainDetailsImpl = null;
        }
        CreatorViewerSignalReelsTextDetails BlA = BlA();
        if (BlA != null) {
            creatorViewerSignalReelsTextDetailsImpl = BlA.F2X();
        }
        return new CreatorViewerSignalDetailsImpl(creatorViewerSignalAudioDetailsImpl, creatorViewerSignalPlainDetailsImpl, creatorViewerSignalReelsTextDetailsImpl);
    }

    public final CreatorViewerSignalDetailsImpl F2S(1E6 r2) {
        return F2R(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalDetails] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
