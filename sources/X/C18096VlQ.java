package X;

/* renamed from: X.VlQ  reason: case insensitive filesystem */
public abstract class C18096VlQ {
    public static final C16547Uwu A00(int i) {
        if (i == 1) {
            return C16547Uwu.HIGH;
        }
        if (i == 2) {
            return C16547Uwu.HIGH31;
        }
        if (i != 3) {
            return C16547Uwu.BASELINE;
        }
        return C16547Uwu.MAIN;
    }

    public static final C16547Uwu A01(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("high31")) {
                return C16547Uwu.HIGH31;
            }
            if (str.equalsIgnoreCase("high")) {
                return C16547Uwu.HIGH;
            }
        }
        return C16547Uwu.BASELINE;
    }
}
