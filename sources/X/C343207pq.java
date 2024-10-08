package X;

/* renamed from: X.7pq  reason: invalid class name and case insensitive filesystem */
public final class C343207pq implements C340917m2 {
    public final /* synthetic */ C343187po A00;

    public C343207pq(C343187po r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.7v2, java.lang.RuntimeException] */
    public final void Drj() {
        C341877nf r1;
        C343187po r4 = this.A00;
        if (!r4.A0J) {
            return;
        }
        if (r4.A0H == 1 || r4.A0H == 7) {
            r4.A0H = 0;
            r4.A0B = false;
            r4.A01 = new RuntimeException("Failed to start operation. Operation timed out.");
            C340677le r0 = r4.A03;
            if (r0 != null && (r1 = r0.A00.A0l) != null && !r1.A00.isEmpty()) {
                C342057ny.A00(new C40745Aib(r1));
            }
        } else if (r4.A0H == 2 || r4.A0H == 3 || r4.A0H == 4) {
            r4.A0H = 0;
        }
    }
}
