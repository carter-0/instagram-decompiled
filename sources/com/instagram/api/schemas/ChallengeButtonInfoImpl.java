package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class ChallengeButtonInfoImpl extends AnonymousClass0T0 implements ChallengeButtonInfo, Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(86);
    public final ChallengeButtonAction A00;
    public final String A01;
    public final String A02;

    public final ChallengeButtonInfoImpl F1I() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChallengeButtonInfoImpl) {
                ChallengeButtonInfoImpl challengeButtonInfoImpl = (ChallengeButtonInfoImpl) obj;
                if (this.A00 != challengeButtonInfoImpl.A00 || !0qQ.A0K(this.A01, challengeButtonInfoImpl.A01) || !0qQ.A0K(this.A02, challengeButtonInfoImpl.A02)) {
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
        parcel.writeString(this.A02);
    }

    public final ChallengeButtonAction Aig() {
        return this.A00;
    }

    public final String Air() {
        return this.A01;
    }

    public final String Avk() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public ChallengeButtonInfoImpl(ChallengeButtonAction challengeButtonAction, String str, String str2) {
        AnonymousClass7TG.A1U(challengeButtonAction, str, str2);
        this.A00 = challengeButtonAction;
        this.A01 = str;
        this.A02 = str2;
    }
}
