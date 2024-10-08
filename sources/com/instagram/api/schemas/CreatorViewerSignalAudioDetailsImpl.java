package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44121CWm;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerSignalAudioDetailsImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerSignalAudioDetails {
    public static final Parcelable.Creator CREATOR = DE7.A00(39);
    public final FormattedString A00;
    public final TrackOrOriginalSoundSchema A01;

    public final CreatorViewerSignalAudioDetailsImpl F2P(1E9 r1) {
        return this;
    }

    public final CreatorViewerSignalAudioDetailsImpl F2Q(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalAudioDetailsImpl) {
                CreatorViewerSignalAudioDetailsImpl creatorViewerSignalAudioDetailsImpl = (CreatorViewerSignalAudioDetailsImpl) obj;
                if (!0qQ.A0K(this.A01, creatorViewerSignalAudioDetailsImpl.A01) || !0qQ.A0K(this.A00, creatorViewerSignalAudioDetailsImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ TrackOrOriginalSoundSchemaIntf Adg() {
        return this.A01;
    }

    public final FormattedString C2X() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerSignalAudioDetails", C44121CWm.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public CreatorViewerSignalAudioDetailsImpl(FormattedString formattedString, TrackOrOriginalSoundSchema trackOrOriginalSoundSchema) {
        this.A01 = trackOrOriginalSoundSchema;
        this.A00 = formattedString;
    }

    public final CreatorViewerSignalAudioDetails E7J(1E9 r1) {
        return this;
    }
}
