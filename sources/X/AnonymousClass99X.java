package X;

/* renamed from: X.99X  reason: invalid class name */
public abstract class AnonymousClass99X {
    public static final AnonymousClass99S A00;
    public static final AnonymousClass99S A01;
    public static final C3743599d A02;
    public static final C3743599d A03;
    public static final C3743299a A04;
    public static final C3743299a A05;
    public static final C3744099i A06 = new C3744099i(C3743999h.A03);
    public static final C3744299k A07 = new C3744299k(C3744199j.A03);

    static {
        try {
            AnonymousClass99Y r1 = AnonymousClass99Y.A03;
            A04 = AnonymousClass99Z.A00(r1, 16);
            try {
                A05 = AnonymousClass99Z.A00(r1, 32);
                try {
                    C3743399b r12 = C3743399b.A03;
                    A02 = C3743499c.A00(r12, 16, 16);
                    try {
                        A03 = C3743499c.A00(r12, 16, 32);
                        try {
                            C3743699e r13 = C3743699e.A03;
                            C3743799f r2 = C3743799f.A03;
                            A00 = C3743899g.A00(r13, r2, 16, 32, 16, 16);
                            try {
                                A01 = C3743899g.A00(r13, r2, 32, 32, 16, 32);
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
