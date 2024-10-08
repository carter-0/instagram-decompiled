package X;

/* renamed from: X.0ul  reason: invalid class name and case insensitive filesystem */
public final class C62640ul implements AnonymousClass0u2 {
    public long A00;
    public AnonymousClass0u1 A01;
    public final long A02;

    public final void AWE() {
        AnonymousClass0u1 r1 = this.A01;
        if (r1 != null) {
            r1.E0V(3);
        }
    }

    public final void Ent(AnonymousClass0u1 r1) {
        this.A01 = r1;
    }

    public C62640ul(long j) {
        this.A02 = j;
    }

    public final void EHI() {
        if (System.currentTimeMillis() - this.A00 > this.A02) {
            AnonymousClass0u1 r1 = this.A01;
            if (r1 != null) {
                r1.E0V(3);
            }
            this.A00 = System.currentTimeMillis();
        }
    }

    public C62640ul() {
        this(1000);
    }
}
