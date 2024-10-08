package X;

/* renamed from: X.4nV  reason: invalid class name and case insensitive filesystem */
public final class C273984nV {
    public static final C273984nV A02 = new C273984nV(0);
    public final ThreadLocal A00;
    public volatile int A01;

    public final C257443xP A00(0SG r3) {
        C257443xP r1 = (C257443xP) this.A00.get();
        if (r1.A06() || (r3 != null && this.A01 >= 0 && (r1 = (C257443xP) r3.BXj(this.A01, 1)) != null && r1.A06())) {
            return r1;
        }
        C2612848z r12 = C2612848z.A00;
        0qQ.A07(r12);
        return r12;
    }

    public C273984nV(int i) {
        this.A01 = -1;
        this.A00 = new C273994nW();
    }

    public C273984nV() {
        this(0);
    }
}
