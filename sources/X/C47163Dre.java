package X;

import com.instagram.api.schemas.RankingAlgorithm;
import java.util.List;

/* renamed from: X.Dre  reason: case insensitive filesystem */
public final class C47163Dre extends AnonymousClass0T0 {
    public final Boolean A00;
    public final List A01;
    public final RankingAlgorithm A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47163Dre) {
                C47163Dre dre = (C47163Dre) obj;
                if (!0qQ.A0K(this.A0A, dre.A0A) || !0qQ.A0K(this.A03, dre.A03) || !0qQ.A0K(this.A07, dre.A07) || !0qQ.A0K(this.A04, dre.A04) || !0qQ.A0K(this.A00, dre.A00) || !0qQ.A0K(this.A01, dre.A01) || !0qQ.A0K(this.A08, dre.A08) || !0qQ.A0K(this.A05, dre.A05) || this.A02 != dre.A02 || !0qQ.A0K(this.A09, dre.A09) || !0qQ.A0K(this.A06, dre.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((AnonymousClass7TG.A0C(this.A0A) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public C47163Dre(RankingAlgorithm rankingAlgorithm, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, List list, List list2) {
        this.A0A = list;
        this.A03 = bool;
        this.A07 = str;
        this.A04 = bool2;
        this.A00 = bool3;
        this.A01 = list2;
        this.A08 = str2;
        this.A05 = bool4;
        this.A02 = rankingAlgorithm;
        this.A09 = str3;
        this.A06 = bool5;
    }
}
