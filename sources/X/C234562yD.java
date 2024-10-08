package X;

/* renamed from: X.2yD  reason: invalid class name and case insensitive filesystem */
public final class C234562yD implements C229222n2 {
    public static final C234562yD A00 = new C234562yD();

    public final String BK2(AnonymousClass30Y r4) {
        String str;
        String BOq;
        0qQ.A0B(r4, 0);
        1Xj r2 = (1Xj) r4.A03;
        if (!r2.A5D() || (BOq = r2.A0C.BOq()) == null || BOq.length() == 0) {
            str = r2.getId();
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            str = r2.A0C.BOq();
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return str;
    }
}
