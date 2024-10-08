package X;

/* renamed from: X.5qV  reason: invalid class name and case insensitive filesystem */
public final class C296705qV implements AnonymousClass4TD {
    public int A00;
    public boolean A01;
    public final /* synthetic */ C284835Ol A02;

    public C296705qV(C284835Ol r1) {
        this.A02 = r1;
    }

    private void A00() {
        if (!this.A01) {
            C284835Ol r0 = this.A02;
            C265174Sv r1 = r0.A05;
            C256683wB r2 = r0.A04;
            r1.A06(r2, (Object) null, 2Kn.A00(r2.A0W), 0, 0);
            this.A01 = true;
        }
    }

    public final boolean CaO() {
        return this.A02.A01;
    }

    public final void Cnj() {
    }

    public final int E6J(AnonymousClass4PO r8, AnonymousClass4PQ r9, int i) {
        A00();
        C284835Ol r5 = this.A02;
        boolean z = r5.A01;
        if (z && r5.A02 == null) {
            this.A00 = 2;
        }
        int i2 = this.A00;
        if (i2 == 2) {
            r9.A00 |= 4;
        } else if ((i & 2) != 0 || i2 == 0) {
            r8.A00 = r5.A04;
            this.A00 = 1;
            return -5;
        } else if (!z) {
            return -3;
        } else {
            r5.A02.getClass();
            r9.A00 |= 1;
            r9.A01 = 0;
            if ((i & 4) == 0) {
                r9.A01(r5.A00);
                r9.A02.put(r5.A02, 0, r5.A00);
            }
            if ((i & 1) == 0) {
                this.A00 = 2;
                return -4;
            }
        }
        return -4;
    }

    public final int Evj(long j) {
        A00();
        if (j <= 0 || this.A00 == 2) {
            return 0;
        }
        this.A00 = 2;
        return 1;
    }

    public final /* synthetic */ long C96(int i) {
        return -9223372036854775807L;
    }
}
