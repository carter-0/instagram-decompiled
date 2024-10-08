package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44127CWs;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerSignalModelImpl extends AnonymousClass0T0 implements CreatorViewerSignalModel, Parcelable {
    public static final Parcelable.Creator CREATOR = DE7.A00(42);
    public final CreatorViewerSignalDetails A00;
    public final InspirationSignalType A01;
    public final String A02;

    public final CreatorViewerSignalModelImpl F2U(1E9 r1) {
        return this;
    }

    public final CreatorViewerSignalModelImpl F2V(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalModelImpl) {
                CreatorViewerSignalModelImpl creatorViewerSignalModelImpl = (CreatorViewerSignalModelImpl) obj;
                if (!0qQ.A0K(this.A00, creatorViewerSignalModelImpl.A00) || this.A01 != creatorViewerSignalModelImpl.A01 || !0qQ.A0K(this.A02, creatorViewerSignalModelImpl.A02)) {
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
        parcel.writeString(this.A02);
    }

    public final CreatorViewerSignalDetails Awl() {
        return this.A00;
    }

    public final InspirationSignalType BwM() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerSignalModel", C44127CWs.A00(this));
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public CreatorViewerSignalModelImpl(CreatorViewerSignalDetails creatorViewerSignalDetails, InspirationSignalType inspirationSignalType, String str) {
        AnonymousClass7TG.A1U(creatorViewerSignalDetails, inspirationSignalType, str);
        this.A00 = creatorViewerSignalDetails;
        this.A01 = inspirationSignalType;
        this.A02 = str;
    }

    public final CreatorViewerSignalModel E7L(1E9 r1) {
        return this;
    }
}
