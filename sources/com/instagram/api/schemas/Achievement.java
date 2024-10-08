package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.C51970G9q;
import X.C51972G9s;
import X.C51973G9u;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class Achievement extends AnonymousClass0T0 implements AchievementIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(18);
    public final int A00;
    public final long A01;
    public final AchievementCategory A02;
    public final AchievementName A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final AchievementButtonInfo A0C;
    public final AchievementButtonInfo A0D;
    public final AchievementButtonInfo A0E;
    public final EarnedOnMediaState A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;

    public Achievement(AchievementButtonInfo achievementButtonInfo, AchievementButtonInfo achievementButtonInfo2, AchievementButtonInfo achievementButtonInfo3, AchievementCategory achievementCategory, AchievementName achievementName, EarnedOnMediaState earnedOnMediaState, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, int i, long j) {
        String str14 = str;
        String str15 = str2;
        AnonymousClass7TG.A0w(1, str14, str15, achievementCategory);
        String str16 = str9;
        String str17 = str10;
        C51973G9u.A0v(14, str16, str17, achievementName);
        String str18 = str12;
        String str19 = str13;
        C51970G9q.A1O(str18, 22, str19);
        this.A06 = str14;
        this.A01 = j;
        this.A0G = str15;
        this.A02 = achievementCategory;
        this.A0N = list;
        this.A0H = str3;
        this.A07 = str4;
        this.A0I = str5;
        this.A0J = str6;
        this.A0K = str7;
        this.A0F = earnedOnMediaState;
        this.A0L = str8;
        this.A0C = achievementButtonInfo;
        this.A08 = str16;
        this.A09 = str17;
        this.A03 = achievementName;
        this.A0D = achievementButtonInfo2;
        this.A04 = num;
        this.A0E = achievementButtonInfo3;
        this.A0M = str11;
        this.A05 = num2;
        this.A0A = str18;
        this.A0B = str19;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Achievement) {
                Achievement achievement = (Achievement) obj;
                if (!0qQ.A0K(this.A06, achievement.A06) || this.A01 != achievement.A01 || !0qQ.A0K(this.A0G, achievement.A0G) || this.A02 != achievement.A02 || !0qQ.A0K(this.A0N, achievement.A0N) || !0qQ.A0K(this.A0H, achievement.A0H) || !0qQ.A0K(this.A07, achievement.A07) || !0qQ.A0K(this.A0I, achievement.A0I) || !0qQ.A0K(this.A0J, achievement.A0J) || !0qQ.A0K(this.A0K, achievement.A0K) || this.A0F != achievement.A0F || !0qQ.A0K(this.A0L, achievement.A0L) || !0qQ.A0K(this.A0C, achievement.A0C) || !0qQ.A0K(this.A08, achievement.A08) || !0qQ.A0K(this.A09, achievement.A09) || this.A03 != achievement.A03 || !0qQ.A0K(this.A0D, achievement.A0D) || !0qQ.A0K(this.A04, achievement.A04) || !0qQ.A0K(this.A0E, achievement.A0E) || !0qQ.A0K(this.A0M, achievement.A0M) || !0qQ.A0K(this.A05, achievement.A05) || !0qQ.A0K(this.A0A, achievement.A0A) || !0qQ.A0K(this.A0B, achievement.A0B) || this.A00 != achievement.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A02, i);
        List list = this.A0N;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A1F = C41848B3p.A1F(parcel, list);
            while (A1F.hasNext()) {
                C41847B3o.A1I(parcel, A1F, i);
            }
        }
        parcel.writeString(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A0D, i);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeString(this.A0M);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A00);
    }

    public final String AXc() {
        return this.A06;
    }

    public final long AY3() {
        return this.A01;
    }

    public final String Abp() {
        return this.A0G;
    }

    public final List AoO() {
        return this.A0N;
    }

    public final String AtG() {
        return this.A0H;
    }

    public final String Azn() {
        return this.A07;
    }

    public final String Azo() {
        return this.A0I;
    }

    public final String Azp() {
        return this.A0J;
    }

    public final String Azq() {
        return this.A0K;
    }

    public final EarnedOnMediaState Azr() {
        return this.A0F;
    }

    public final String Azs() {
        return this.A0L;
    }

    public final AchievementButtonInfo BDq() {
        return this.A0C;
    }

    public final String BGL() {
        return this.A09;
    }

    public final AchievementName BVI() {
        return this.A03;
    }

    public final AchievementButtonInfo BfP() {
        return this.A0D;
    }

    public final Integer BhT() {
        return this.A04;
    }

    public final AchievementButtonInfo BqT() {
        return this.A0E;
    }

    public final Integer C7F() {
        return this.A05;
    }

    public final String CBQ() {
        return this.A0B;
    }

    public final String getSecondaryText() {
        return this.A0M;
    }

    public final String getTitle() {
        return this.A0A;
    }

    public final int getValue() {
        return this.A00;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A0G, C51972G9s.A07(this.A01, AnonymousClass7TE.A0O(this.A06)));
        int A083 = AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A08(this.A08, (((((((((((((((((AnonymousClass7TF.A07(this.A02, A082) + AnonymousClass7TG.A0C(this.A0N)) * 31) + AnonymousClass7TG.A0E(this.A0H)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0I)) * 31) + AnonymousClass7TG.A0E(this.A0J)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31));
        return AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A08(this.A0A, (((((((((AnonymousClass7TF.A07(this.A03, A083) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0M)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31)) + this.A00;
    }
}
