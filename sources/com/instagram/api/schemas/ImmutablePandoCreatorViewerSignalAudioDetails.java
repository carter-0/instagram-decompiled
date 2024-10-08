package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44121CWm;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerSignalAudioDetails extends 17P implements CreatorViewerSignalAudioDetails {
    public static final C3035269k CREATOR = CTC.A00(48);
    public TrackOrOriginalSoundSchemaIntf A00;

    public final TrackOrOriginalSoundSchemaIntf Adg() {
        TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf = this.A00;
        if (trackOrOriginalSoundSchemaIntf == null) {
            return (TrackOrOriginalSoundSchemaIntf) A05(1549039479, ImmutablePandoTrackOrOriginalSoundSchema.class);
        }
        return trackOrOriginalSoundSchemaIntf;
    }

    public final FormattedString C2X() {
        return (FormattedString) A05(-2060497896, ImmutablePandoFormattedString.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalAudioDetails, com.instagram.api.schemas.CreatorViewerSignalAudioDetails] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44121CWm.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorViewerSignalAudioDetails E7J(1E9 r2) {
        TrackOrOriginalSoundSchemaIntf Adg = Adg();
        if (Adg != null) {
            Adg.E9T(r2);
        } else {
            Adg = null;
        }
        this.A00 = Adg;
        return this;
    }

    public final CreatorViewerSignalAudioDetailsImpl F2P(1E9 r4) {
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema;
        TrackOrOriginalSoundSchemaIntf Adg = Adg();
        FormattedStringImpl formattedStringImpl = null;
        if (Adg != null) {
            trackOrOriginalSoundSchema = Adg.FCx(r4);
        } else {
            trackOrOriginalSoundSchema = null;
        }
        FormattedString C2X = C2X();
        if (C2X != null) {
            formattedStringImpl = C2X.F3F();
        }
        return new CreatorViewerSignalAudioDetailsImpl(formattedStringImpl, trackOrOriginalSoundSchema);
    }

    public final CreatorViewerSignalAudioDetailsImpl F2Q(1E6 r2) {
        return F2P(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalAudioDetails] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
