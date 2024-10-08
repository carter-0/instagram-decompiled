package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CYA;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GoalsToastInfoImpl extends AnonymousClass0T0 implements Parcelable, GoalsToastInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(85);
    public final GoalsToastType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final GoalsToastInfoImpl F3S() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsToastInfoImpl) {
                GoalsToastInfoImpl goalsToastInfoImpl = (GoalsToastInfoImpl) obj;
                if (!0qQ.A0K(this.A01, goalsToastInfoImpl.A01) || !0qQ.A0K(this.A02, goalsToastInfoImpl.A02) || !0qQ.A0K(this.A03, goalsToastInfoImpl.A03) || !0qQ.A0K(this.A04, goalsToastInfoImpl.A04) || this.A00 != goalsToastInfoImpl.A00) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }

    public final String Air() {
        return this.A01;
    }

    public final String Avk() {
        return this.A02;
    }

    public final String B9c() {
        return this.A03;
    }

    public final String C7x() {
        return this.A04;
    }

    public final GoalsToastType C81() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGoalsToastInfo", CYA.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public GoalsToastInfoImpl(GoalsToastType goalsToastType, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = goalsToastType;
    }
}
