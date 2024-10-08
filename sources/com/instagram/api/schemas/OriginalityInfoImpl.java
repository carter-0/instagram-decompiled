package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.CbE;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class OriginalityInfoImpl extends AnonymousClass0T0 implements Parcelable, OriginalityInfo {
    public static final Parcelable.Creator CREATOR = DE6.A00(2);
    public final OriginalityFollowButtonInfo A00;
    public final OriginalitySourceMediaInfo A01;
    public final Boolean A02;

    public final OriginalityInfoImpl F7H(1E9 r1) {
        return this;
    }

    public final OriginalityInfoImpl F7I(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalityInfoImpl) {
                OriginalityInfoImpl originalityInfoImpl = (OriginalityInfoImpl) obj;
                if (!0qQ.A0K(this.A02, originalityInfoImpl.A02) || !0qQ.A0K(this.A00, originalityInfoImpl.A00) || !0qQ.A0K(this.A01, originalityInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A02) ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final Boolean AkQ() {
        return this.A02;
    }

    public final OriginalityFollowButtonInfo B6k() {
        return this.A00;
    }

    public final OriginalitySourceMediaInfo BZ4() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTOriginalityInfo", CbE.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public OriginalityInfoImpl(OriginalityFollowButtonInfo originalityFollowButtonInfo, OriginalitySourceMediaInfo originalitySourceMediaInfo, Boolean bool) {
        this.A02 = bool;
        this.A00 = originalityFollowButtonInfo;
        this.A01 = originalitySourceMediaInfo;
    }

    public final OriginalityInfo E7r(1E9 r1) {
        return this;
    }
}
