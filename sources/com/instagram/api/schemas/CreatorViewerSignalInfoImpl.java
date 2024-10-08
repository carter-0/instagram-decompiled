package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44125CWq;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerSignalInfoImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerSignalInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(41);
    public final CreatorViewerSignalType A00;
    public final String A01;

    public final CreatorViewerSignalInfoImpl F2T() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalInfoImpl) {
                CreatorViewerSignalInfoImpl creatorViewerSignalInfoImpl = (CreatorViewerSignalInfoImpl) obj;
                if (this.A00 != creatorViewerSignalInfoImpl.A00 || !0qQ.A0K(this.A01, creatorViewerSignalInfoImpl.A01)) {
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
        parcel.writeString(this.A01);
    }

    public final CreatorViewerSignalType BwL() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerSignalInfo", C44125CWq.A00(this));
    }

    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public CreatorViewerSignalInfoImpl(CreatorViewerSignalType creatorViewerSignalType, String str) {
        AnonymousClass7TG.A1O(creatorViewerSignalType, str);
        this.A00 = creatorViewerSignalType;
        this.A01 = str;
    }
}
