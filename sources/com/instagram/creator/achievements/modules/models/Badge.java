package com.instagram.creator.achievements.modules.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C51969G9p;
import X.C51974G9v;
import X.C51975G9x;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import java.util.Iterator;
import java.util.List;

public abstract class Badge implements Parcelable {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;

    public final class AchievementBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LVP(50);
        public final long A00;
        public final Achievement A01;
        public final Integer A02;
        public final Integer A03;
        public final Integer A04;
        public final String A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final boolean A09;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AchievementBadge) {
                    AchievementBadge achievementBadge = (AchievementBadge) obj;
                    if (this.A00 != achievementBadge.A00 || !0qQ.A0K(this.A07, achievementBadge.A07) || !0qQ.A0K(this.A08, achievementBadge.A08) || !0qQ.A0K(this.A05, achievementBadge.A05) || !0qQ.A0K(this.A06, achievementBadge.A06) || !0qQ.A0K(this.A03, achievementBadge.A03) || !0qQ.A0K(this.A02, achievementBadge.A02) || !0qQ.A0K(this.A04, achievementBadge.A04) || this.A09 != achievementBadge.A09 || !0qQ.A0K(this.A01, achievementBadge.A01)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A07);
            parcel.writeString(this.A08);
            parcel.writeString(this.A05);
            parcel.writeString(this.A06);
            AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
            AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
            AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
            parcel.writeInt(this.A09 ? 1 : 0);
            parcel.writeParcelable(this.A01, i);
        }

        public final int hashCode() {
            int A082 = AnonymousClass7TF.A08(this.A07, C51975G9x.A03(this.A00));
            String str = this.A06;
            return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A09, (((((AnonymousClass7TF.A08(str, (AnonymousClass7TF.A08(this.A08, A082) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AchievementBadge(Achievement achievement, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, long j, boolean z) {
            super(num2, num3, true);
            AnonymousClass7TG.A1Q(str, str2);
            C51969G9p.A1N(str4, 5, achievement);
            this.A00 = j;
            this.A07 = str;
            this.A08 = str2;
            this.A05 = str3;
            this.A06 = str4;
            this.A03 = num;
            this.A02 = num2;
            this.A04 = num3;
            this.A09 = z;
            this.A01 = achievement;
        }
    }

    public final class AchievementTieredBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LVP(51);
        public final long A00;
        public final Integer A01;
        public final String A02;
        public final String A03;
        public final List A04;
        public final List A05;
        public final String A06;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AchievementTieredBadge) {
                    AchievementTieredBadge achievementTieredBadge = (AchievementTieredBadge) obj;
                    if (this.A00 != achievementTieredBadge.A00 || !0qQ.A0K(this.A06, achievementTieredBadge.A06) || !0qQ.A0K(this.A03, achievementTieredBadge.A03) || !0qQ.A0K(this.A02, achievementTieredBadge.A02) || !0qQ.A0K(this.A01, achievementTieredBadge.A01) || !0qQ.A0K(this.A04, achievementTieredBadge.A04) || !0qQ.A0K(this.A05, achievementTieredBadge.A05)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A06);
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
            Iterator A1F = C41848B3p.A1F(parcel, this.A04);
            while (A1F.hasNext()) {
                ((AchievementBadge) A1F.next()).writeToParcel(parcel, i);
            }
            List list = this.A05;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            Iterator A1F2 = C41848B3p.A1F(parcel, list);
            while (A1F2.hasNext()) {
                ((AchievementBadge) A1F2.next()).writeToParcel(parcel, i);
            }
        }

        public final int hashCode() {
            int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A06, C51975G9x.A03(this.A00)));
            return AnonymousClass7TF.A07(this.A04, (AnonymousClass7TF.A08(this.A02, A08) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A05);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AchievementTieredBadge(Integer num, String str, String str2, String str3, List list, List list2, long j) {
            super((Integer) null, (Integer) null, false);
            C51974G9v.A1M(str, str2, str3);
            this.A00 = j;
            this.A06 = str;
            this.A03 = str2;
            this.A02 = str3;
            this.A01 = num;
            this.A04 = list;
            this.A05 = list2;
        }
    }

    public final class ChallengeBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LVP(52);
        public final long A00;
        public final Challenge A01;
        public final Integer A02;
        public final Integer A03;
        public final Integer A04;
        public final String A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final String A09;
        public final String A0A;
        public final String A0B;
        public final String A0C;
        public final boolean A0D;
        public final String A0E;
        public final boolean A0F;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ChallengeBadge) {
                    ChallengeBadge challengeBadge = (ChallengeBadge) obj;
                    if (this.A00 != challengeBadge.A00 || !0qQ.A0K(this.A08, challengeBadge.A08) || !0qQ.A0K(this.A0C, challengeBadge.A0C) || !0qQ.A0K(this.A07, challengeBadge.A07) || !0qQ.A0K(this.A0E, challengeBadge.A0E) || !0qQ.A0K(this.A05, challengeBadge.A05) || !0qQ.A0K(this.A06, challengeBadge.A06) || !0qQ.A0K(this.A09, challengeBadge.A09) || !0qQ.A0K(this.A03, challengeBadge.A03) || !0qQ.A0K(this.A02, challengeBadge.A02) || !0qQ.A0K(this.A04, challengeBadge.A04) || this.A0F != challengeBadge.A0F || this.A0D != challengeBadge.A0D || !0qQ.A0K(this.A0A, challengeBadge.A0A) || !0qQ.A0K(this.A0B, challengeBadge.A0B) || !0qQ.A0K(this.A01, challengeBadge.A01)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A08);
            parcel.writeString(this.A0C);
            parcel.writeString(this.A07);
            parcel.writeString(this.A0E);
            parcel.writeString(this.A05);
            parcel.writeString(this.A06);
            parcel.writeString(this.A09);
            AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
            AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
            AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
            parcel.writeInt(this.A0F ? 1 : 0);
            parcel.writeInt(this.A0D ? 1 : 0);
            parcel.writeString(this.A0A);
            parcel.writeString(this.A0B);
            parcel.writeParcelable(this.A01, i);
        }

        public final int hashCode() {
            int A082 = AnonymousClass7TF.A08(this.A0C, AnonymousClass7TF.A08(this.A08, C51975G9x.A03(this.A00)));
            String str = this.A06;
            int A092 = AnonymousClass7TF.A09(this.A0F, (((((((AnonymousClass7TF.A08(str, (((AnonymousClass7TF.A08(this.A07, A082) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31);
            return AnonymousClass7TE.A0N(this.A01, (((AnonymousClass7TF.A09(this.A0D, A092) + AnonymousClass7TG.A0E(this.A0A)) * 31) + C41845B3m.A00(this.A0B)) * 31);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ChallengeBadge(com.instagram.api.schemas.Challenge r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, long r17, boolean r19, boolean r20) {
            /*
                r3 = this;
                X.C51974G9v.A1M(r8, r9, r10)
                r0 = 7
                X.C51969G9p.A1R(r13, r0, r4)
                r2 = r20
                r3.<init>(r6, r7, r2)
                r0 = r17
                r3.A00 = r0
                r3.A08 = r8
                r3.A0C = r9
                r3.A07 = r10
                r3.A0E = r11
                r3.A05 = r12
                r3.A06 = r13
                r3.A09 = r14
                r3.A03 = r5
                r3.A02 = r6
                r3.A04 = r7
                r0 = r19
                r3.A0F = r0
                r3.A0D = r2
                r3.A0A = r15
                r0 = r16
                r3.A0B = r0
                r3.A01 = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.achievements.modules.models.Badge.ChallengeBadge.<init>(com.instagram.api.schemas.Challenge, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean, boolean):void");
        }
    }

    public final class ChallengeTieredBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LVP(53);
        public final long A00;
        public final Integer A01;
        public final String A02;
        public final String A03;
        public final List A04;
        public final String A05;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ChallengeTieredBadge) {
                    ChallengeTieredBadge challengeTieredBadge = (ChallengeTieredBadge) obj;
                    if (this.A00 != challengeTieredBadge.A00 || !0qQ.A0K(this.A05, challengeTieredBadge.A05) || !0qQ.A0K(this.A03, challengeTieredBadge.A03) || !0qQ.A0K(this.A02, challengeTieredBadge.A02) || !0qQ.A0K(this.A01, challengeTieredBadge.A01) || !0qQ.A0K(this.A04, challengeTieredBadge.A04)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A05);
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            parcel.writeInt(C41847B3o.A00(parcel, this.A01));
            Iterator A1F = C41848B3p.A1F(parcel, this.A04);
            while (A1F.hasNext()) {
                ((ChallengeBadge) A1F.next()).writeToParcel(parcel, i);
            }
        }

        public final int hashCode() {
            int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A05, C51975G9x.A03(this.A00)));
            return AnonymousClass7TE.A0N(this.A04, (AnonymousClass7TF.A08(this.A02, A08) + AnonymousClass7TG.A0C(this.A01)) * 31);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChallengeTieredBadge(Integer num, String str, String str2, String str3, List list, long j) {
            super((Integer) null, (Integer) null, false);
            C51974G9v.A1M(str, str2, str3);
            this.A00 = j;
            this.A05 = str;
            this.A03 = str2;
            this.A02 = str3;
            this.A01 = num;
            this.A04 = list;
        }
    }

    public final long A00() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A00;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A00;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A00;
        }
        return ((AchievementBadge) this).A00;
    }

    public final Integer A01() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A01;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A03;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A01;
        }
        return ((AchievementBadge) this).A03;
    }

    public final String A02() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A02;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A06;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A02;
        }
        return ((AchievementBadge) this).A06;
    }

    public final String A03() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A03;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A0C;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A03;
        }
        return ((AchievementBadge) this).A08;
    }

    public Badge(Integer num, Integer num2, boolean z) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = z;
    }
}
