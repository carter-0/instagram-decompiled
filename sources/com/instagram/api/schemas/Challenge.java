package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C51969G9p;
import X.C51970G9q;
import X.C51972G9s;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class Challenge extends AnonymousClass0T0 implements Parcelable, ChallengeIntf {
    public static final Parcelable.Creator CREATOR = new SWT(84);
    public final int A00;
    public final int A01;
    public final long A02;
    public final ChallengeButtonInfo A03;
    public final ChallengeButtonInfo A04;
    public final ChallengeName A05;
    public final ChallengeState A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final ChallengeButtonInfo A0H;
    public final ChallengeButtonInfo A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Challenge) {
                Challenge challenge = (Challenge) obj;
                if (!0qQ.A0K(this.A0J, challenge.A0J) || !0qQ.A0K(this.A08, challenge.A08) || !0qQ.A0K(this.A03, challenge.A03) || !0qQ.A0K(this.A0K, challenge.A0K) || !0qQ.A0K(this.A0L, challenge.A0L) || this.A02 != challenge.A02 || !0qQ.A0K(this.A0H, challenge.A0H) || !0qQ.A0K(this.A0I, challenge.A0I) || !0qQ.A0K(this.A09, challenge.A09) || this.A0G != challenge.A0G || !0qQ.A0K(this.A0A, challenge.A0A) || !0qQ.A0K(this.A04, challenge.A04) || !0qQ.A0K(this.A0B, challenge.A0B) || !0qQ.A0K(this.A0C, challenge.A0C) || !0qQ.A0K(this.A0D, challenge.A0D) || !0qQ.A0K(this.A0E, challenge.A0E) || !0qQ.A0K(this.A07, challenge.A07) || this.A05 != challenge.A05 || this.A00 != challenge.A00 || !0qQ.A0K(this.A0M, challenge.A0M) || this.A06 != challenge.A06 || !0qQ.A0K(this.A0F, challenge.A0F) || this.A01 != challenge.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeLong(this.A02);
        parcel.writeParcelable(this.A0H, i);
        parcel.writeParcelable(this.A0I, i);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(C41847B3o.A00(parcel, this.A07));
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0M);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A01);
    }

    public Challenge(ChallengeButtonInfo challengeButtonInfo, ChallengeButtonInfo challengeButtonInfo2, ChallengeButtonInfo challengeButtonInfo3, ChallengeButtonInfo challengeButtonInfo4, ChallengeName challengeName, ChallengeState challengeState, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, long j, boolean z) {
        String str13 = str8;
        String str14 = str10;
        C51969G9p.A1R(str13, 14, str14);
        C51970G9q.A1N(challengeName, 18, challengeState);
        String str15 = str12;
        0qQ.A0B(str15, 22);
        this.A0J = str;
        this.A08 = str2;
        this.A03 = challengeButtonInfo;
        this.A0K = str3;
        this.A0L = str4;
        this.A02 = j;
        this.A0H = challengeButtonInfo2;
        this.A0I = challengeButtonInfo3;
        this.A09 = str5;
        this.A0G = z;
        this.A0A = str6;
        this.A04 = challengeButtonInfo4;
        this.A0B = str7;
        this.A0C = str13;
        this.A0D = str9;
        this.A0E = str14;
        this.A07 = num;
        this.A05 = challengeName;
        this.A00 = i;
        this.A0M = str11;
        this.A06 = challengeState;
        this.A0F = str15;
        this.A01 = i2;
    }

    public final int hashCode() {
        long j = this.A02;
        boolean z = this.A0G;
        String str = this.A0C;
        String str2 = this.A0E;
        ChallengeName challengeName = this.A05;
        return AnonymousClass7TF.A08(this.A0F, AnonymousClass7TF.A07(this.A06, (((AnonymousClass7TF.A07(challengeName, (AnonymousClass7TF.A08(str2, (AnonymousClass7TF.A08(str, (((((AnonymousClass7TF.A09(z, (((((C51972G9s.A07(j, ((((((((AnonymousClass7TG.A0E(this.A0J) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A0H)) * 31) + AnonymousClass7TG.A0C(this.A0I)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + this.A00) * 31) + C41845B3m.A00(this.A0M)) * 31)) + this.A01;
    }
}
