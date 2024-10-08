package X;

/* renamed from: X.4Y2  reason: invalid class name */
public abstract class AnonymousClass4Y2 extends C266194Xx {
    public final long A00;

    public AnonymousClass4Y2(C256683wB r14, C257113ws r15, C257263x7 r16, Object obj, int i, long j, long j2, long j3) {
        super(r14, r15, r16, obj, 1, i, j, j2);
        r14.getClass();
        this.A00 = j3;
    }

    public boolean A01() {
        return ((AnonymousClass4YR) this).A00;
    }

    public final long A00() {
        if (this instanceof AnonymousClass4YR) {
            AnonymousClass4YR r0 = (AnonymousClass4YR) this;
            return r0.A00 + ((long) r0.A02);
        }
        long j = this.A00;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }
}
