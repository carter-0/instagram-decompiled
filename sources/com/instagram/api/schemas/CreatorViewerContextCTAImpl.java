package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44114CWf;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerContextCTAImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerContextCTA {
    public static final Parcelable.Creator CREATOR = DE7.A00(32);
    public final CreatorViewerContextCTATarget A00;
    public final CreatorViewerContextCTAType A01;
    public final FormattedString A02;
    public final String A03;
    public final String A04;

    public CreatorViewerContextCTAImpl(CreatorViewerContextCTATarget creatorViewerContextCTATarget, CreatorViewerContextCTAType creatorViewerContextCTAType, FormattedString formattedString, String str, String str2) {
        0qQ.A0B(creatorViewerContextCTAType, 1);
        0qQ.A0B(str2, 5);
        this.A01 = creatorViewerContextCTAType;
        this.A00 = creatorViewerContextCTATarget;
        this.A02 = formattedString;
        this.A03 = str;
        this.A04 = str2;
    }

    public final CreatorViewerContextCTAImpl F2K() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerContextCTAImpl) {
                CreatorViewerContextCTAImpl creatorViewerContextCTAImpl = (CreatorViewerContextCTAImpl) obj;
                if (this.A01 != creatorViewerContextCTAImpl.A01 || this.A00 != creatorViewerContextCTAImpl.A00 || !0qQ.A0K(this.A02, creatorViewerContextCTAImpl.A02) || !0qQ.A0K(this.A03, creatorViewerContextCTAImpl.A03) || !0qQ.A0K(this.A04, creatorViewerContextCTAImpl.A04)) {
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
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final CreatorViewerContextCTAType Aqw() {
        return this.A01;
    }

    public final CreatorViewerContextCTATarget AtQ() {
        return this.A00;
    }

    public final FormattedString B31() {
        return this.A02;
    }

    public final String BE9() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerContextCTA", C44114CWf.A00(this));
    }

    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A04, (((((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A03)) * 31);
    }
}
