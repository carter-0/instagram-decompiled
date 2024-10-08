package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44133CWy;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class CreatorViewerSignalWithInsightsInfoImpl extends AnonymousClass0T0 implements Parcelable, CreatorViewerSignalWithInsightsInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(46);
    public final CreatorViewerSignalInfo A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public CreatorViewerSignalWithInsightsInfoImpl(CreatorViewerSignalInfo creatorViewerSignalInfo, String str, String str2, List list) {
        0qQ.A0B(creatorViewerSignalInfo, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = creatorViewerSignalInfo;
    }

    public final CreatorViewerSignalWithInsightsInfoImpl F2Y() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalWithInsightsInfoImpl) {
                CreatorViewerSignalWithInsightsInfoImpl creatorViewerSignalWithInsightsInfoImpl = (CreatorViewerSignalWithInsightsInfoImpl) obj;
                if (!0qQ.A0K(this.A01, creatorViewerSignalWithInsightsInfoImpl.A01) || !0qQ.A0K(this.A02, creatorViewerSignalWithInsightsInfoImpl.A02) || !0qQ.A0K(this.A03, creatorViewerSignalWithInsightsInfoImpl.A03) || !0qQ.A0K(this.A00, creatorViewerSignalWithInsightsInfoImpl.A00)) {
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
        parcel.writeString(this.A02);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final String BE9() {
        return this.A01;
    }

    public final String BFx() {
        return this.A02;
    }

    public final List BHj() {
        return this.A03;
    }

    public final CreatorViewerSignalInfo BwI() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCreatorViewerSignalWithInsightsInfo", C44133CWy.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
    }
}
