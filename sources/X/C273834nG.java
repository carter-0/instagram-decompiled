package X;

/* renamed from: X.4nG  reason: invalid class name and case insensitive filesystem */
public final class C273834nG {
    public RBB A00;
    public C273854nI A01;
    public RBC A02;

    public static final synchronized void A00(C273864nJ r2, C273834nG r3) {
        synchronized (r3) {
            r3.A01 = null;
            r3.A02 = null;
            r3.A00 = null;
            if (r2 instanceof RBB) {
                r3.A00 = (RBB) r2;
            } else if (r2 instanceof C273854nI) {
                r3.A01 = (C273854nI) r2;
            } else if (r2 instanceof RBC) {
                r3.A02 = (RBC) r2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown configuration type: ");
                sb.append(r2.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
