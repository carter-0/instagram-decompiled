package X;

public abstract class SAI {
    public static final String A00(String str) {
        if (C66581MXm.A04(str) == 0 || !00l.A0d(str, "_", false) || DbW.A0o(str, "_").toArray(new String[0]).length < 2) {
            return "";
        }
        return DbU.A1b(DbW.A0o(C66580MXl.A0z(str, 00l.A08(str, "_", 0, false) + 1), "&"), 0)[0];
    }

    public static final String A01(String str) {
        if (C66581MXm.A04(str) == 0 || !00l.A0d(str, "_", false)) {
            return "";
        }
        return DbU.A1b(DbW.A0o(str, "_"), 0)[0];
    }
}
