package X;

/* renamed from: X.Di4  reason: case insensitive filesystem */
public abstract class C46624Di4 {
    public static final C46626Di6 A00(String str) {
        for (C46626Di6 di6 : C46626Di6.A02) {
            if (0qQ.A0K(di6.toString(), str)) {
                return di6;
            }
        }
        2SK.A02(C46471DfZ.A0U, 002.A0R("Error finding Mode enum value for ", str));
        return C46626Di6.FULL_SHEET;
    }
}
