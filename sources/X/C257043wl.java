package X;

/* renamed from: X.3wl  reason: invalid class name and case insensitive filesystem */
public final class C257043wl implements 29y {
    public long A00;
    public final int A01;
    public final /* synthetic */ 29t A02;

    public final void Dlu(C251073mW r1, 2R9 r2, 2R9 r3, Integer num) {
    }

    public C257043wl(29t r1, int i) {
        this.A02 = r1;
        this.A01 = i;
    }

    public final void Dlr(C251073mW r12, 2R9 r13) {
        long j = r13.A04;
        long j2 = (long) this.A01;
        if (j < j2) {
            long j3 = this.A00;
            long j4 = r13.A03;
            if (j + j4 > j2) {
                j4 = j2 - j;
            }
            this.A00 = j3 + j4;
        }
    }

    public final void Dls(C251073mW r6, 2R9 r7) {
        if (!(r7.A04 != 0 || this.A02.A07 == null || 2RB.A00(r7.A06) == null)) {
            27B.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", new Object[0]);
        }
        29t r1 = this.A02;
        if (r1.A03() != null) {
            r1.A03().EDy(this, r7.A06);
        }
    }

    public final void Dlt(C251073mW r1, 2R9 r2, 2R9 r3) {
    }
}
