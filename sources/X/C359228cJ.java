package X;

/* renamed from: X.8cJ  reason: invalid class name and case insensitive filesystem */
public final class C359228cJ {
    public static final C359218cI A00(AnonymousClass84A r3) {
        0qQ.A0B(r3, 0);
        int ordinal = r3.ordinal();
        if (ordinal == 5 || ordinal == 4 || ordinal == 6 || ordinal == 8) {
            r3 = AnonymousClass84A.STORIES;
        } else if (ordinal == 2) {
            r3 = AnonymousClass84A.DIRECT;
        }
        return new C359218cI(r3, "SAVED");
    }

    public final C359218cI A01(AnonymousClass84A r2, String str) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(str, 1);
        if (str.equals("SAVED")) {
            return A00(r2);
        }
        return new C359218cI(r2, str);
    }
}
