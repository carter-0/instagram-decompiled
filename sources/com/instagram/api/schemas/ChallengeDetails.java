package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51969G9p;
import X.C51973G9u;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class ChallengeDetails extends AnonymousClass0T0 implements Parcelable, ChallengeDetailsIntf {
    public static final Parcelable.Creator CREATOR = new SWT(87);
    public final int A00;
    public final int A01;
    public final ChallengeButtonInfo A02;
    public final ChallengeButtonInfo A03;
    public final ChallengeButtonInfo A04;
    public final ChallengeName A05;
    public final ChallengeState A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public ChallengeDetails(ChallengeButtonInfo challengeButtonInfo, ChallengeButtonInfo challengeButtonInfo2, ChallengeButtonInfo challengeButtonInfo3, ChallengeName challengeName, ChallengeState challengeState, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z) {
        C51973G9u.A0r(1, str, str3, challengeName);
        C51969G9p.A1Q(challengeState, 13, str8);
        this.A07 = str;
        this.A08 = str2;
        this.A0F = z;
        this.A09 = str3;
        this.A05 = challengeName;
        this.A02 = challengeButtonInfo;
        this.A00 = i;
        this.A0A = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A03 = challengeButtonInfo2;
        this.A04 = challengeButtonInfo3;
        this.A06 = challengeState;
        this.A0D = str7;
        this.A0E = str8;
        this.A01 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChallengeDetails) {
                ChallengeDetails challengeDetails = (ChallengeDetails) obj;
                if (!0qQ.A0K(this.A07, challengeDetails.A07) || !0qQ.A0K(this.A08, challengeDetails.A08) || this.A0F != challengeDetails.A0F || !0qQ.A0K(this.A09, challengeDetails.A09) || this.A05 != challengeDetails.A05 || !0qQ.A0K(this.A02, challengeDetails.A02) || this.A00 != challengeDetails.A00 || !0qQ.A0K(this.A0A, challengeDetails.A0A) || !0qQ.A0K(this.A0B, challengeDetails.A0B) || !0qQ.A0K(this.A0C, challengeDetails.A0C) || !0qQ.A0K(this.A03, challengeDetails.A03) || !0qQ.A0K(this.A04, challengeDetails.A04) || this.A06 != challengeDetails.A06 || !0qQ.A0K(this.A0D, challengeDetails.A0D) || !0qQ.A0K(this.A0E, challengeDetails.A0E) || this.A01 != challengeDetails.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A01);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A09(this.A0F, (AnonymousClass7TE.A0O(this.A07) + AnonymousClass7TG.A0E(this.A08)) * 31));
        ChallengeState challengeState = this.A06;
        return AnonymousClass7TF.A08(this.A0E, (AnonymousClass7TF.A07(challengeState, (((((((((((((AnonymousClass7TF.A07(this.A05, A082) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C41845B3m.A00(this.A0D)) * 31) + this.A01;
    }
}
