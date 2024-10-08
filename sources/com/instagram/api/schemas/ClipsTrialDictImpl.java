package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C44099CVq;
import X.C55797Hnd;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ClipsTrialDictImpl extends AnonymousClass0T0 implements ClipsTrialDict, Parcelable {
    public static final Parcelable.Creator CREATOR = DE7.A00(8);
    public final MediaTrialGraduationStrategy A00;
    public final MediaTrialStatus A01;
    public final Boolean A02;
    public final Boolean A03;

    public final ClipsTrialDictImpl F1p() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTrialDictImpl) {
                ClipsTrialDictImpl clipsTrialDictImpl = (ClipsTrialDictImpl) obj;
                if (!0qQ.A0K(this.A02, clipsTrialDictImpl.A02) || this.A00 != clipsTrialDictImpl.A00 || !0qQ.A0K(this.A03, clipsTrialDictImpl.A03) || this.A01 != clipsTrialDictImpl.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C41848B3p.A1I(parcel, this.A02);
        parcel.writeParcelable(this.A00, i);
        C41848B3p.A1I(parcel, this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public final /* bridge */ /* synthetic */ C55797Hnd AK8() {
        return new C55797Hnd(this);
    }

    public final Boolean Akq() {
        return this.A02;
    }

    public final MediaTrialGraduationStrategy B9i() {
        return this.A00;
    }

    public final MediaTrialStatus BzK() {
        return this.A01;
    }

    public final Boolean Cay() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsTrialDict", C44099CVq.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public ClipsTrialDictImpl(MediaTrialGraduationStrategy mediaTrialGraduationStrategy, MediaTrialStatus mediaTrialStatus, Boolean bool, Boolean bool2) {
        this.A02 = bool;
        this.A00 = mediaTrialGraduationStrategy;
        this.A03 = bool2;
        this.A01 = mediaTrialStatus;
    }
}
