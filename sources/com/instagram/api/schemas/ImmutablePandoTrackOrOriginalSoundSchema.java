package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44545Cgf;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoTrackOrOriginalSoundSchema extends 17P implements TrackOrOriginalSoundSchemaIntf {
    public static final C3035269k CREATOR = CTA.A00(12);
    public OriginalSoundDataIntf A00;

    public final TrackMetadata BSi() {
        return (TrackMetadata) A05(-450004177, ImmutablePandoTrackMetadata.class);
    }

    public final OriginalSoundDataIntf BZA() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A00;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1929598241, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    public final TrackData C92() {
        return (TrackData) A05(110621003, ImmutablePandoTrackData.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf, com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44545Cgf.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final TrackOrOriginalSoundSchemaIntf E9T(1E9 r2) {
        OriginalSoundDataIntf BZA = BZA();
        if (BZA != null) {
            BZA.E7q(r2);
        } else {
            BZA = null;
        }
        this.A00 = BZA;
        return this;
    }

    public final TrackOrOriginalSoundSchema FCx(1E9 r5) {
        TrackMetadataImpl trackMetadataImpl;
        OriginalSoundData originalSoundData;
        TrackMetadata BSi = BSi();
        TrackDataImpl trackDataImpl = null;
        if (BSi != null) {
            trackMetadataImpl = BSi.FCw();
        } else {
            trackMetadataImpl = null;
        }
        OriginalSoundDataIntf BZA = BZA();
        if (BZA != null) {
            originalSoundData = BZA.F7E(r5);
        } else {
            originalSoundData = null;
        }
        TrackData C92 = C92();
        if (C92 != null) {
            trackDataImpl = C92.FCv();
        }
        return new TrackOrOriginalSoundSchema(originalSoundData, trackDataImpl, trackMetadataImpl);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
