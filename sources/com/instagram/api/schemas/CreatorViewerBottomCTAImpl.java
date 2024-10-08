package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44112CWd;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerBottomCTAImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerBottomCTA {
    public static final Parcelable.Creator CREATOR = DE7.A00(30);
    public final CreatorViewerBottomCTAType A00;
    public final String A01;

    public final CreatorViewerBottomCTAImpl F2J() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerBottomCTAImpl) {
                CreatorViewerBottomCTAImpl creatorViewerBottomCTAImpl = (CreatorViewerBottomCTAImpl) obj;
                if (this.A00 != creatorViewerBottomCTAImpl.A00 || !0qQ.A0K(this.A01, creatorViewerBottomCTAImpl.A01)) {
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

    public final CreatorViewerBottomCTAType AhL() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerBottomCTA", C44112CWd.A00(this));
    }

    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public CreatorViewerBottomCTAImpl(CreatorViewerBottomCTAType creatorViewerBottomCTAType, String str) {
        AnonymousClass7TG.A1O(creatorViewerBottomCTAType, str);
        this.A00 = creatorViewerBottomCTAType;
        this.A01 = str;
    }
}
