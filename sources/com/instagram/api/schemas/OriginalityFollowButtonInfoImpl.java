package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.CbC;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class OriginalityFollowButtonInfoImpl extends AnonymousClass0T0 implements Parcelable, OriginalityFollowButtonInfo {
    public static final Parcelable.Creator CREATOR = DE6.A00(1);
    public final Boolean A00;
    public final Boolean A01;

    public final OriginalityFollowButtonInfoImpl F7G() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalityFollowButtonInfoImpl) {
                OriginalityFollowButtonInfoImpl originalityFollowButtonInfoImpl = (OriginalityFollowButtonInfoImpl) obj;
                if (!0qQ.A0K(this.A00, originalityFollowButtonInfoImpl.A00) || !0qQ.A0K(this.A01, originalityFollowButtonInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C41848B3p.A1I(parcel, this.A00);
        C41848B3p.A1I(parcel, this.A01);
    }

    public final Boolean BvP() {
        return this.A01;
    }

    public final Boolean CYi() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTOriginalityFollowButtonInfo", CbC.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public OriginalityFollowButtonInfoImpl(Boolean bool, Boolean bool2) {
        this.A00 = bool;
        this.A01 = bool2;
    }
}
