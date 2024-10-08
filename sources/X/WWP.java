package X;

import java.util.List;

public final class WWP implements AnonymousClass1Xn {
    public C17997VjZ A00;
    public final C15039UKs A01;

    public final C17997VjZ A00() {
        C17997VjZ vjZ = this.A00;
        if (vjZ == null) {
            List list = this.A01.A0B;
            if (list != null) {
                vjZ = new C17997VjZ((C15059UNc) 00k.A0I(list));
            } else {
                vjZ = null;
            }
            this.A00 = vjZ;
        }
        0qQ.A0C(vjZ, "null cannot be cast to non-null type com.instagram.genericsurvey.model.base.SurveyQuestion");
        return vjZ;
    }

    public final 1UQ B5J() {
        return 1UQ.A0K;
    }

    public final Integer B9V() {
        return this.A01.A03;
    }

    public final C67241sS BJP() {
        C67241sS r0 = this.A01.A00;
        if (r0 != null) {
            return r0.F8M();
        }
        return null;
    }

    public final String C9L() {
        String str = this.A01.A09;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0C;
    }

    public final Integer CEl() {
        return this.A01.A04;
    }

    public final String getId() {
        String str = this.A01.A06;
        if (str == null) {
            return "";
        }
        return str;
    }

    public WWP(C15039UKs uKs) {
        this.A01 = uKs;
    }
}
