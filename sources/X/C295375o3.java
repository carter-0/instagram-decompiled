package X;

/* renamed from: X.5o3  reason: invalid class name and case insensitive filesystem */
public final class C295375o3 {
    public static final C267324bN A01(C376699Iz r2, AnonymousClass3OA r3) {
        0qQ.A0B(r3, 1);
        return new C267324bN((C267334bO) new C57031ILx(r2, r3));
    }

    public static final C267324bN A02(1Xj r2) {
        0qQ.A0B(r2, 0);
        return new C267324bN((C267334bO) new C295355o1(r2, (AnonymousClass3OA) null));
    }

    public static final C267324bN A03(AnonymousClass3OA r2) {
        0qQ.A0B(r2, 0);
        return new C267324bN((C267334bO) new C52364GPk(C295365o2.AD, r2));
    }

    public final C267324bN A04(1Xl r3) {
        AnonymousClass3OA A00;
        0qQ.A0B(r3, 0);
        if (r3 instanceof AnonymousClass3OA) {
            A00 = (AnonymousClass3OA) r3;
        } else if (r3 instanceof 1Xj) {
            boolean CcK = r3.BPf().CcK();
            1Xj BPf = r3.BPf();
            if (!CcK) {
                return A02(BPf);
            }
            A00 = C250913mG.A00(BPf);
        } else {
            throw new IllegalArgumentException("Unsupported ModelWithMedia type");
        }
        return A03(A00);
    }

    public static final C267324bN A00() {
        return new C267324bN(new GEC(C295365o2.GHOST, (1Xj) null));
    }
}
