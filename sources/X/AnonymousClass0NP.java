package X;

/* renamed from: X.0NP  reason: invalid class name */
public final class AnonymousClass0NP implements AnonymousClass0Gc {
    public Object A00;
    public boolean A01 = false;
    public final AnonymousClass0Gc A02;

    public final Object get() {
        if (!this.A01) {
            this.A00 = this.A02.get();
            this.A01 = true;
        }
        return this.A00;
    }

    public AnonymousClass0NP(AnonymousClass0Gc r2) {
        this.A02 = r2;
    }
}
