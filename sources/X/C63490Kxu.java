package X;

/* renamed from: X.Kxu  reason: case insensitive filesystem */
public abstract class C63490Kxu {
    public static final String A00(C268654dm r3) {
        AnonymousClass1XT r1;
        if ((r3 instanceof C268674do) && (r1 = (AnonymousClass1XT) ((C268674do) r3).A00) != null && r1.getErrorMessage() != null) {
            return r1.getErrorMessage();
        }
        Throwable A01 = r3.A01();
        if (A01 != null) {
            return A01.getMessage();
        }
        return null;
    }
}
