package X;

/* renamed from: X.XwN  reason: case insensitive filesystem */
public final class C22158XwN implements Y9E {
    public final 01r A00;

    /* renamed from: A00 */
    public final XIR BSt() {
        XIR xir = new XIR();
        01r r5 = this.A00;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            Object A05 = r5.A05(i);
            Object A06 = r5.A06(i);
            A06.getClass();
            xir.A00.put(A05, ((Y9E) A06).BSt());
        }
        return xir;
    }

    public C22158XwN(01r r3) {
        01r r0 = new 01r(0);
        this.A00 = r0;
        r0.A09(r3);
    }
}
