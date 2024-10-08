package X;

/* renamed from: X.65H  reason: invalid class name */
public final class AnonymousClass65H implements 1aL, C65051aA {
    public long A00;
    public C65051aA A01;
    public boolean A02;
    public final 1aL A03;

    public final void DUK(Object obj) {
        if (!this.A02) {
            long j = this.A00;
            long j2 = j - 1;
            this.A00 = j2;
            if (j > 0) {
                boolean z = false;
                if (j2 == 0) {
                    z = true;
                }
                this.A03.DUK(obj);
                if (z) {
                    onComplete();
                }
            }
        }
    }

    public final void Do4(C65051aA r6) {
        if (1af.A02(this.A01, r6)) {
            this.A01 = r6;
            if (this.A00 == 0) {
                this.A02 = true;
                r6.dispose();
                1aL r1 = this.A03;
                r1.Do4(AnonymousClass6F8.INSTANCE);
                r1.onComplete();
                return;
            }
            this.A03.Do4(this);
        }
    }

    public final void dispose() {
        this.A01.dispose();
    }

    public final void onComplete() {
        if (!this.A02) {
            this.A02 = true;
            this.A01.dispose();
            this.A03.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.A02) {
            C318176oW.A01(th);
            return;
        }
        this.A02 = true;
        this.A01.dispose();
        this.A03.onError(th);
    }

    public AnonymousClass65H(1aL r1, long j) {
        this.A03 = r1;
        this.A00 = j;
    }
}
