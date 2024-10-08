package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44131CWw;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerSignalReelsTextDetailsImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerSignalReelsTextDetails {
    public static final Parcelable.Creator CREATOR = DE7.A00(44);
    public final ClipsTextFormatType A00;
    public final FormattedString A01;

    public final CreatorViewerSignalReelsTextDetailsImpl F2X() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalReelsTextDetailsImpl) {
                CreatorViewerSignalReelsTextDetailsImpl creatorViewerSignalReelsTextDetailsImpl = (CreatorViewerSignalReelsTextDetailsImpl) obj;
                if (!0qQ.A0K(this.A01, creatorViewerSignalReelsTextDetailsImpl.A01) || this.A00 != creatorViewerSignalReelsTextDetailsImpl.A00) {
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

    public final FormattedString C2X() {
        return this.A01;
    }

    public final ClipsTextFormatType C5D() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerSignalReelsTextDetails", C44131CWw.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public CreatorViewerSignalReelsTextDetailsImpl(ClipsTextFormatType clipsTextFormatType, FormattedString formattedString) {
        this.A01 = formattedString;
        this.A00 = clipsTextFormatType;
    }
}
