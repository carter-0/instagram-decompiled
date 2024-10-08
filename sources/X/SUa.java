package X;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

public final class SUa {
    public Map A00 = null;
    public final String A01;

    public static C11357SOt A04(RDN rdn, SUa sUa) {
        sUa.A0M(new SyL(rdn, 1));
        return sUa.A0L();
    }

    public static C11357SOt A0C(RDO rdo, SUa sUa) {
        sUa.A0M(new SyP(rdo, 1));
        return sUa.A0L();
    }

    public static SUa A00() {
        return new SUa("errorCode");
    }

    public static SUa A01() {
        return new SUa("logEventKey");
    }

    public static SUa A02() {
        return new SUa("inferenceCommonLogEvent");
    }

    public static SUa A03(String str) {
        return new SUa(str);
    }

    public static C11357SOt A05(RDN rdn, SUa sUa, int i) {
        sUa.A0M(new SyL(rdn, i));
        return sUa.A0L();
    }

    public static C11357SOt A06(RDN rdn, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyL(rdn, 2));
        return sUa.A0L();
    }

    public static C11357SOt A07(RDN rdn, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyL(rdn, 3));
        return sUa.A0L();
    }

    public static C11357SOt A08(RDN rdn, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyL(rdn, 4));
        return sUa.A0L();
    }

    public static C11357SOt A09(RDN rdn, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyL(rdn, 5));
        return sUa.A0L();
    }

    public static C11357SOt A0A(RDN rdn, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyL(rdn, 6));
        return sUa.A0L();
    }

    public static C11357SOt A0B(RDN rdn, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyL(rdn, 7));
        return sUa.A0L();
    }

    public static C11357SOt A0D(RDO rdo, SUa sUa, int i) {
        sUa.A0M(new SyP(rdo, i));
        return sUa.A0L();
    }

    public static C11357SOt A0E(RDO rdo, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyP(rdo, 2));
        return sUa.A0L();
    }

    public static C11357SOt A0F(RDO rdo, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyP(rdo, 3));
        return sUa.A0L();
    }

    public static C11357SOt A0G(RDO rdo, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyP(rdo, 4));
        return sUa.A0L();
    }

    public static C11357SOt A0H(RDO rdo, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyP(rdo, 5));
        return sUa.A0L();
    }

    public static C11357SOt A0I(RDO rdo, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyP(rdo, 6));
        return sUa.A0L();
    }

    public static C11357SOt A0J(RDO rdo, String str) {
        SUa sUa = new SUa(str);
        sUa.A0M(new SyP(rdo, 7));
        return sUa.A0L();
    }

    public static C11357SOt A0K(SUa sUa, C8863RDe rDe, int i) {
        sUa.A0M(new C12731T4p(rDe, i));
        return sUa.A0L();
    }

    public final C11357SOt A0L() {
        Map unmodifiableMap;
        String str = this.A01;
        Map map = this.A00;
        if (map == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(Pxe.A19(map));
        }
        return new C11357SOt(str, unmodifiableMap);
    }

    public final void A0M(Annotation annotation) {
        Map map = this.A00;
        if (map == null) {
            map = AnonymousClass7TE.A1E();
            this.A00 = map;
        }
        map.put(annotation.annotationType(), annotation);
    }

    public SUa(String str) {
        this.A01 = str;
    }
}
