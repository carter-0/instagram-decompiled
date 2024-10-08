package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44129CWu;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerSignalPlainDetailsImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerSignalPlainDetails {
    public static final Parcelable.Creator CREATOR = DE7.A00(43);
    public final FormattedString A00;
    public final String A01;

    public final CreatorViewerSignalPlainDetailsImpl F2W() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalPlainDetailsImpl) {
                CreatorViewerSignalPlainDetailsImpl creatorViewerSignalPlainDetailsImpl = (CreatorViewerSignalPlainDetailsImpl) obj;
                if (!0qQ.A0K(this.A01, creatorViewerSignalPlainDetailsImpl.A01) || !0qQ.A0K(this.A00, creatorViewerSignalPlainDetailsImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final String BE9() {
        return this.A01;
    }

    public final FormattedString C2X() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerSignalPlainDetails", C44129CWu.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public CreatorViewerSignalPlainDetailsImpl(FormattedString formattedString, String str) {
        this.A01 = str;
        this.A00 = formattedString;
    }
}
