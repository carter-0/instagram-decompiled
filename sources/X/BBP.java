package X;

import com.instagram.api.schemas.RankingInfo;
import java.util.HashMap;
import java.util.List;

public final class BBP extends AnonymousClass0T0 {
    public final C239773Ic A00;
    public final C276104sZ A01;
    public final RankingInfo A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final String A06;
    public final HashMap A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBP) {
                BBP bbp = (BBP) obj;
                if (!0qQ.A0K(this.A00, bbp.A00) || !0qQ.A0K(this.A06, bbp.A06) || !0qQ.A0K(this.A03, bbp.A03) || !0qQ.A0K(this.A09, bbp.A09) || !0qQ.A0K(this.A0A, bbp.A0A) || !0qQ.A0K(this.A08, bbp.A08) || !0qQ.A0K(this.A07, bbp.A07) || !0qQ.A0K(this.A01, bbp.A01) || !0qQ.A0K(this.A05, bbp.A05) || !0qQ.A0K(this.A02, bbp.A02) || !0qQ.A0K(this.A04, bbp.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A09;
        return ((((AnonymousClass7TF.A07(this.A01, (((((AnonymousClass7TF.A07(list, ((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public BBP(C239773Ic r1, C276104sZ r2, RankingInfo rankingInfo, Boolean bool, Boolean bool2, Integer num, String str, HashMap hashMap, List list, List list2, List list3) {
        this.A00 = r1;
        this.A06 = str;
        this.A03 = bool;
        this.A09 = list;
        this.A0A = list2;
        this.A08 = list3;
        this.A07 = hashMap;
        this.A01 = r2;
        this.A05 = num;
        this.A02 = rankingInfo;
        this.A04 = bool2;
    }
}
