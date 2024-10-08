package X;

public abstract class RT1 {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        String str;
        String A0D;
        String A0g = 002.A0g(DbY.A0g(r5), "\tBKScriptExecutionId:", r4.A0A);
        C276544tV r3 = (C276544tV) DbT.A0p(r5, 1);
        if (r3 == null || (str = r3.A0F()) == null) {
            str = C273654mx.A00(567);
        }
        String str2 = "debug";
        if (!(r3 == null || (A0D = r3.A0D()) == null)) {
            str2 = A0D;
        }
        switch (str2.hashCode()) {
            case 3641990:
                if (!str2.equals("warn")) {
                    return null;
                }
                0KC.A0D(str, A0g);
                return null;
            case 96784904:
                if (!str2.equals("error")) {
                    return null;
                }
                0KC.A0C(str, A0g);
                return null;
            default:
                return null;
        }
    }
}
