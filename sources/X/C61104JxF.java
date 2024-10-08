package X;

import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;

/* renamed from: X.JxF  reason: case insensitive filesystem */
public final class C61104JxF extends AnonymousClass0T0 implements YBG {
    public final FanClubNextStepsCompletionState A00;
    public final FanClubNextStepsRecommendationsType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;

    public C61104JxF(FanClubNextStepsCompletionState fanClubNextStepsCompletionState, FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        String str17 = str13;
        C51969G9p.A1P(fanClubNextStepsCompletionState, 1, str17);
        String str18 = str15;
        String str19 = str16;
        C51969G9p.A1S(str18, 16, str19);
        0qQ.A0B(fanClubNextStepsRecommendationsType, 18);
        this.A00 = fanClubNextStepsCompletionState;
        this.A02 = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A03 = str4;
        this.A0E = str5;
        this.A04 = str6;
        this.A05 = str7;
        this.A06 = str8;
        this.A07 = str9;
        this.A0F = str10;
        this.A0G = str11;
        this.A08 = str12;
        this.A09 = str17;
        this.A0H = str14;
        this.A0A = str18;
        this.A0B = str19;
        this.A01 = fanClubNextStepsRecommendationsType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61104JxF) {
                C61104JxF jxF = (C61104JxF) obj;
                if (this.A00 != jxF.A00 || !0qQ.A0K(this.A02, jxF.A02) || !0qQ.A0K(this.A0C, jxF.A0C) || !0qQ.A0K(this.A0D, jxF.A0D) || !0qQ.A0K(this.A03, jxF.A03) || !0qQ.A0K(this.A0E, jxF.A0E) || !0qQ.A0K(this.A04, jxF.A04) || !0qQ.A0K(this.A05, jxF.A05) || !0qQ.A0K(this.A06, jxF.A06) || !0qQ.A0K(this.A07, jxF.A07) || !0qQ.A0K(this.A0F, jxF.A0F) || !0qQ.A0K(this.A0G, jxF.A0G) || !0qQ.A0K(this.A08, jxF.A08) || !0qQ.A0K(this.A09, jxF.A09) || !0qQ.A0K(this.A0H, jxF.A0H) || !0qQ.A0K(this.A0A, jxF.A0A) || !0qQ.A0K(this.A0B, jxF.A0B) || this.A01 != jxF.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A09;
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A08(this.A0A, (AnonymousClass7TF.A08(str, (((((((((((((((((((((((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A0H)) * 31)));
    }
}
