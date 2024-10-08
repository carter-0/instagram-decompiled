package X;

/* renamed from: X.Er3  reason: case insensitive filesystem */
public abstract class C49198Er3 {
    public static final EW4 A00(String str) {
        0qQ.A0B(str, 0);
        for (EW4 ew4 : EW4.values()) {
            if (str.equalsIgnoreCase(ew4.A00)) {
                return ew4;
            }
        }
        throw AnonymousClass7TE.A0z(002.A0g("Prefill source '", str, "' not supported."));
    }
}
