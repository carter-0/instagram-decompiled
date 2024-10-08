package X;

import com.instagram.api.schemas.GraphGuardianContentImpl;
import java.util.List;

public final class N5F extends AnonymousClass0T0 implements C74528PwN {
    public final GraphGuardianContentImpl A00;
    public final 1Xj A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5F) {
                N5F n5f = (N5F) obj;
                if (!0qQ.A0K(this.A02, n5f.A02) || !0qQ.A0K(this.A06, n5f.A06) || !0qQ.A0K(this.A01, n5f.A01) || !0qQ.A0K(this.A03, n5f.A03) || !0qQ.A0K(this.A00, n5f.A00) || !0qQ.A0K(this.A04, n5f.A04) || !0qQ.A0K(this.A05, n5f.A05) || !0qQ.A0K(this.A07, n5f.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A07);
    }

    public N5F(GraphGuardianContentImpl graphGuardianContentImpl, 1Xj r2, Integer num, Integer num2, Integer num3, Integer num4, String str, List list) {
        this.A02 = num;
        this.A06 = str;
        this.A01 = r2;
        this.A03 = num2;
        this.A00 = graphGuardianContentImpl;
        this.A04 = num3;
        this.A05 = num4;
        this.A07 = list;
    }
}
