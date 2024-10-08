package X;

/* renamed from: X.4TX  reason: invalid class name */
public final class AnonymousClass4TX implements AnonymousClass4TD {
    public boolean A00;
    public final AnonymousClass4TD A01;
    public final /* synthetic */ AnonymousClass4TW A02;

    public AnonymousClass4TX(AnonymousClass4TW r1, AnonymousClass4TD r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public final long C96(int i) {
        return this.A01.C96(i);
    }

    public final boolean CaO() {
        if (this.A02.A01 != -9223372036854775807L || !this.A01.CaO()) {
            return false;
        }
        return true;
    }

    public final void Cnj() {
        this.A01.Cnj();
    }

    public final int E6J(AnonymousClass4PO r13, AnonymousClass4PQ r14, int i) {
        AnonymousClass4TW r7 = this.A02;
        boolean z = false;
        if (r7.A01 != -9223372036854775807L) {
            z = true;
        }
        if (z) {
            return -3;
        }
        if (this.A00) {
            r14.A00 = 4;
            return -4;
        }
        int E6J = this.A01.E6J(r13, r14, i);
        if (E6J == -5) {
            C256683wB r9 = r13.A00;
            r9.getClass();
            int i2 = r9.A08;
            if (!(i2 == 0 && r9.A09 == 0)) {
                int i3 = 0;
                if (r7.A02 != 0) {
                    i2 = 0;
                }
                if (r7.A00 == Long.MIN_VALUE) {
                    i3 = r9.A09;
                }
                C256653w8 r1 = new C256653w8(r9);
                r1.A06 = i2;
                r1.A07 = i3;
                r13.A00 = new C256683wB(r1);
            }
            return -5;
        }
        long j = r7.A00;
        if (j == Long.MIN_VALUE || (E6J != -4 ? !(E6J == -3 && r7.AiU() == Long.MIN_VALUE && !r14.A04) : r14.A01 < j)) {
            return E6J;
        }
        r14.clear();
        r14.A00 = 4;
        this.A00 = true;
        return -4;
    }

    public final int Evj(long j) {
        if (this.A02.A01 != -9223372036854775807L) {
            return -3;
        }
        return this.A01.Evj(j);
    }
}
