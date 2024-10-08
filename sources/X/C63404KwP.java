package X;

/* renamed from: X.KwP  reason: case insensitive filesystem */
public abstract class C63404KwP {
    public static final C62593KiQ A00(String str) {
        C62593KiQ kiQ = C62593KiQ.LUNA;
        if (0qQ.A0K(str, "LUNA")) {
            return kiQ;
        }
        C62593KiQ kiQ2 = C62593KiQ.HUGO;
        if (0qQ.A0K(str, "HUGO")) {
            return kiQ2;
        }
        C62593KiQ kiQ3 = C62593KiQ.ZIGGY;
        if (!0qQ.A0K(str, "ZIGGY")) {
            return C62593KiQ.RUPERT;
        }
        return kiQ3;
    }
}
