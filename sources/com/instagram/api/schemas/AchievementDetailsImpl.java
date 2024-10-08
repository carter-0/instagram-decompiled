package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AchievementDetailsImpl extends AnonymousClass0T0 implements Parcelable, AchievementDetails {
    public static final Parcelable.Creator CREATOR = SWT.A00(22);
    public final int A00;
    public final AchievementButtonInfo A01;
    public final AchievementButtonInfo A02;
    public final AchievementCategory A03;
    public final AchievementName A04;
    public final EarnedOnMedia A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AchievementDetailsImpl) {
                AchievementDetailsImpl achievementDetailsImpl = (AchievementDetailsImpl) obj;
                if (!0qQ.A0K(this.A08, achievementDetailsImpl.A08) || this.A03 != achievementDetailsImpl.A03 || !0qQ.A0K(this.A0E, achievementDetailsImpl.A0E) || !0qQ.A0K(this.A09, achievementDetailsImpl.A09) || !0qQ.A0K(this.A0A, achievementDetailsImpl.A0A) || !0qQ.A0K(this.A05, achievementDetailsImpl.A05) || !0qQ.A0K(this.A0B, achievementDetailsImpl.A0B) || this.A00 != achievementDetailsImpl.A00 || this.A04 != achievementDetailsImpl.A04 || !0qQ.A0K(this.A01, achievementDetailsImpl.A01) || !0qQ.A0K(this.A06, achievementDetailsImpl.A06) || !0qQ.A0K(this.A0C, achievementDetailsImpl.A0C) || !0qQ.A0K(this.A02, achievementDetailsImpl.A02) || !0qQ.A0K(this.A07, achievementDetailsImpl.A07) || !0qQ.A0K(this.A0D, achievementDetailsImpl.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A03, i);
        List list = this.A0E;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A01, i);
        AnonymousClass7TG.A16(parcel, this.A06, 0, 1);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A02, i);
        AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
        parcel.writeString(this.A0D);
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A08);
        String str = this.A0B;
        AchievementName achievementName = this.A04;
        return C41845B3m.A01(this.A0D, (((((((((AnonymousClass7TF.A07(achievementName, (AnonymousClass7TF.A08(str, (((((((AnonymousClass7TF.A07(this.A03, A0O) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A07)) * 31);
    }

    public AchievementDetailsImpl(AchievementButtonInfo achievementButtonInfo, AchievementButtonInfo achievementButtonInfo2, AchievementCategory achievementCategory, AchievementName achievementName, EarnedOnMedia earnedOnMedia, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, int i) {
        AnonymousClass7TG.A1O(str, achievementCategory);
        0qQ.A0B(str4, 7);
        0qQ.A0B(achievementName, 9);
        0qQ.A0B(str6, 15);
        this.A08 = str;
        this.A03 = achievementCategory;
        this.A0E = list;
        this.A09 = str2;
        this.A0A = str3;
        this.A05 = earnedOnMedia;
        this.A0B = str4;
        this.A00 = i;
        this.A04 = achievementName;
        this.A01 = achievementButtonInfo;
        this.A06 = num;
        this.A0C = str5;
        this.A02 = achievementButtonInfo2;
        this.A07 = num2;
        this.A0D = str6;
    }
}
