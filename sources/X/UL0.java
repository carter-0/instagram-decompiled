package X;

import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class UL0 extends AnonymousClass0T0 {
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AdvantageAudienceData A05;
    public final TargetingRelaxationConstants A06;
    public final XIGIGBoostDestination A07;
    public final UserSession A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL0) {
                UL0 ul0 = (UL0) obj;
                if (!0qQ.A0K(this.A08, ul0.A08) || !0qQ.A0K(this.A0L, ul0.A0L) || !0qQ.A0K(this.A0A, ul0.A0A) || !0qQ.A0K(this.A0B, ul0.A0B) || this.A03 != ul0.A03 || this.A02 != ul0.A02 || !0qQ.A0K(this.A0H, ul0.A0H) || !0qQ.A0K(this.A0I, ul0.A0I) || this.A06 != ul0.A06 || !0qQ.A0K(this.A05, ul0.A05) || !0qQ.A0K(this.A0C, ul0.A0C) || !0qQ.A0K(this.A0G, ul0.A0G) || !0qQ.A0K(this.A0J, ul0.A0J) || !0qQ.A0K(this.A0F, ul0.A0F) || !0qQ.A0K(this.A0K, ul0.A0K) || Double.compare(this.A00, ul0.A00) != 0 || Double.compare(this.A01, ul0.A01) != 0 || this.A04 != ul0.A04 || !0qQ.A0K(this.A09, ul0.A09) || !0qQ.A0K(this.A0D, ul0.A0D) || this.A07 != ul0.A07 || !0qQ.A0K(this.A0E, ul0.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AnonymousClass7TF.A08(this.A0C, (((((((((((((((((AnonymousClass7TE.A0K(this.A08) + AnonymousClass7TG.A0C(this.A0L)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + this.A03) * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A0H)) * 31) + AnonymousClass7TG.A0C(this.A0I)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A0J)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0K)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + this.A04) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A0E);
    }

    public UL0(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, double d, double d2, int i, int i2, int i3) {
        this.A08 = userSession;
        this.A0L = list;
        this.A0A = str;
        this.A0B = str2;
        this.A03 = i;
        this.A02 = i2;
        this.A0H = list2;
        this.A0I = list3;
        this.A06 = targetingRelaxationConstants;
        this.A05 = advantageAudienceData;
        this.A0C = str3;
        this.A0G = list4;
        this.A0J = list5;
        this.A0F = list6;
        this.A0K = list7;
        this.A00 = d;
        this.A01 = d2;
        this.A04 = i3;
        this.A09 = str4;
        this.A0D = str5;
        this.A07 = xIGIGBoostDestination;
        this.A0E = list8;
    }
}
