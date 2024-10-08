package X;

/* renamed from: X.64n  reason: invalid class name */
public final class AnonymousClass64n implements C3026164i {
    public C287725af A00;
    public C287725af A01;
    public C287725af A02;
    public final C3026264j A03;

    public final C287725af B1n(C287725af r9, C287725af r10, C287725af r11) {
        C287725af r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass6GZ.A01(r11);
            this.A00 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A012 = r0.A01();
            while (true) {
                if (i < A012) {
                    C287725af r4 = this.A00;
                    if (r4 == null) {
                        break;
                    }
                    r4.A03(i, this.A03.AX0(i).B1m(r9.A00(i), r10.A00(i), r11.A00(i)));
                    i++;
                } else {
                    C287725af r02 = this.A00;
                    if (r02 != null) {
                        return r02;
                    }
                }
            }
        }
        0qQ.A0F("endVelocityVector");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C287725af CDS(C287725af r12, C287725af r13, C287725af r14, long j) {
        C287725af r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass6GZ.A01(r12);
            this.A01 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A012 = r0.A01();
            while (true) {
                if (i < A012) {
                    C287725af r1 = this.A01;
                    if (r1 == null) {
                        break;
                    }
                    r1.A03(i, this.A03.AX0(i).CDR(r12.A00(i), r13.A00(i), r14.A00(i), j));
                    i++;
                } else {
                    C287725af r02 = this.A01;
                    if (r02 != null) {
                        return r02;
                    }
                }
            }
        }
        0qQ.A0F("valueVector");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C287725af CDd(C287725af r12, C287725af r13, C287725af r14, long j) {
        C287725af r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass6GZ.A01(r14);
            this.A02 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A012 = r0.A01();
            while (true) {
                if (i < A012) {
                    C287725af r1 = this.A02;
                    if (r1 == null) {
                        break;
                    }
                    r1.A03(i, this.A03.AX0(i).CDc(r12.A00(i), r13.A00(i), r14.A00(i), j));
                    i++;
                } else {
                    C287725af r02 = this.A02;
                    if (r02 != null) {
                        return r02;
                    }
                }
            }
        }
        0qQ.A0F("velocityVector");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean CVL() {
        return false;
    }

    public AnonymousClass64n(C3026264j r1) {
        this.A03 = r1;
    }

    public final long AzR(C287725af r9, C287725af r10, C287725af r11) {
        0sh it = C229632nm.A0C(0, r9.A01()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int A002 = it.A00();
            j = Math.max(j, this.A03.AX0(A002).AzQ(r9.A00(A002), r10.A00(A002), r11.A00(A002)));
        }
        return j;
    }
}
