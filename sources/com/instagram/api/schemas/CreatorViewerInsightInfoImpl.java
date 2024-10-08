package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44116CWh;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CreatorViewerInsightInfoImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerInsightInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(36);
    public final CreatorViewerInsightTypeV2 A00;
    public final FormattedString A01;
    public final String A02;

    public final CreatorViewerInsightInfoImpl F2M() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerInsightInfoImpl) {
                CreatorViewerInsightInfoImpl creatorViewerInsightInfoImpl = (CreatorViewerInsightInfoImpl) obj;
                if (!0qQ.A0K(this.A01, creatorViewerInsightInfoImpl.A01) || this.A00 != creatorViewerInsightInfoImpl.A00 || !0qQ.A0K(this.A02, creatorViewerInsightInfoImpl.A02)) {
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
        parcel.writeString(this.A02);
    }

    public final FormattedString B7m() {
        return this.A01;
    }

    public final CreatorViewerInsightTypeV2 BHi() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerInsightInfo", C44116CWh.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0C(this.A01) * 31));
    }

    public CreatorViewerInsightInfoImpl(CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2, FormattedString formattedString, String str) {
        AnonymousClass7TG.A1Q(creatorViewerInsightTypeV2, str);
        this.A01 = formattedString;
        this.A00 = creatorViewerInsightTypeV2;
        this.A02 = str;
    }
}
