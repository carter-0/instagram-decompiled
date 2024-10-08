package X;

public final class T6S implements AnonymousClass1Cy {
    public final AnonymousClass1Cy A00;

    public T6S(AnonymousClass1Cy r1) {
        this.A00 = r1;
    }

    public final AnonymousClass1T9 startRequest(1QS r3, 1QU r4, 1Qe r5) {
        String A002 = C9867Rig.A00();
        if (A002 != null && !A002.isEmpty()) {
            r3.A01("Zero-E2E-Dogfood-Carrier-Id", A002);
        }
        return this.A00.startRequest(r3, r4, r5);
    }
}
