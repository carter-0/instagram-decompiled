package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44123CWo;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerSignalDetailsImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerSignalDetails {
    public static final Parcelable.Creator CREATOR = DE7.A00(40);
    public final CreatorViewerSignalAudioDetails A00;
    public final CreatorViewerSignalPlainDetails A01;
    public final CreatorViewerSignalReelsTextDetails A02;

    public final CreatorViewerSignalDetailsImpl F2R(1E9 r1) {
        return this;
    }

    public final CreatorViewerSignalDetailsImpl F2S(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalDetailsImpl) {
                CreatorViewerSignalDetailsImpl creatorViewerSignalDetailsImpl = (CreatorViewerSignalDetailsImpl) obj;
                if (!0qQ.A0K(this.A00, creatorViewerSignalDetailsImpl.A00) || !0qQ.A0K(this.A01, creatorViewerSignalDetailsImpl.A01) || !0qQ.A0K(this.A02, creatorViewerSignalDetailsImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public final CreatorViewerSignalAudioDetails Ada() {
        return this.A00;
    }

    public final CreatorViewerSignalPlainDetails Bcu() {
        return this.A01;
    }

    public final CreatorViewerSignalReelsTextDetails BlA() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerSignalDetails", C44123CWo.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public CreatorViewerSignalDetailsImpl(CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails, CreatorViewerSignalPlainDetails creatorViewerSignalPlainDetails, CreatorViewerSignalReelsTextDetails creatorViewerSignalReelsTextDetails) {
        this.A00 = creatorViewerSignalAudioDetails;
        this.A01 = creatorViewerSignalPlainDetails;
        this.A02 = creatorViewerSignalReelsTextDetails;
    }

    public final CreatorViewerSignalDetails E7K(1E9 r1) {
        return this;
    }
}
