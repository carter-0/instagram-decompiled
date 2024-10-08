package X;

/* renamed from: X.2yP  reason: invalid class name and case insensitive filesystem */
public final class C234652yP implements C229222n2 {
    public final String BK2(AnonymousClass30Y r5) {
        String id;
        0qQ.A0B(r5, 0);
        1Xj r3 = (1Xj) r5.A03;
        1Xj A1c = r3.A1c(((AnonymousClass4HA) r5.A04).A00);
        StringBuilder sb = new StringBuilder();
        if (A1c != null) {
            sb.append("carousel_");
            id = A1c.getId();
        } else {
            sb.append("carousel_");
            id = r3.getId();
        }
        sb.append(id);
        return sb.toString();
    }
}
