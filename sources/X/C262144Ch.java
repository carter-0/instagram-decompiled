package X;

/* renamed from: X.4Ch  reason: invalid class name and case insensitive filesystem */
public abstract class C262144Ch extends AnonymousClass4CZ {
    public long A00;
    public 01W A01;
    public boolean A02;

    public abstract long A0P();

    public abstract void A0Q();

    public final void A0R(1F0 r2) {
        01W r0 = this.A01;
        if (r0 == null) {
            r0 = new 01W();
            this.A01 = r0;
        }
        r0.addLast(r2);
    }

    public final void A0S(boolean z) {
        long j;
        long j2 = this.A00;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.A00 = j3;
        if (j3 <= 0 && this.A02) {
            A0Q();
        }
    }

    public final boolean A0T() {
        1F0 r0;
        01W r02 = this.A01;
        if (r02 == null || (r0 = (1F0) r02.A0S()) == null) {
            return false;
        }
        r0.run();
        return true;
    }

    public final AnonymousClass4CZ A0M(int i) {
        C634812u.A00(i);
        return this;
    }
}
