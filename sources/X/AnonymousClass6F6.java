package X;

/* renamed from: X.6F6  reason: invalid class name */
public abstract class AnonymousClass6F6 implements 1aL, AnonymousClass66o {
    public int A00;
    public AnonymousClass66o A01;
    public C65051aA A02;
    public boolean A03;
    public final 1aL A04;

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A02, r2)) {
            this.A02 = r2;
            if (r2 instanceof AnonymousClass66o) {
                this.A01 = (AnonymousClass66o) r2;
            }
            this.A04.Do4(this);
        }
    }

    public final void clear() {
        this.A01.clear();
    }

    public final void dispose() {
        this.A02.dispose();
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onComplete() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.A03) {
            C318176oW.A01(th);
            return;
        }
        this.A03 = true;
        this.A04.onError(th);
    }

    public AnonymousClass6F6(1aL r1) {
        this.A04 = r1;
    }

    public final void A00(Throwable th) {
        C9877Riq.A00(th);
        this.A02.dispose();
        onError(th);
    }
}
