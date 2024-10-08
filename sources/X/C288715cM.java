package X;

/* renamed from: X.5cM  reason: invalid class name and case insensitive filesystem */
public final class C288715cM extends C267794cD implements C267824cH, C268824e3 {
    public AnonymousClass6JF A00;
    public boolean A01;

    public final void A0D() {
        AnonymousClass6JF r0 = this.A00;
        if (r0 != null) {
            r0.release();
        }
        this.A00 = null;
    }

    public final boolean A0G() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    public final void DUu() {
        AnonymousClass6JE r0;
        ? obj = new Object();
        AnonymousClass6GW.A00(this, new AnonymousClass9M0(0, obj, this));
        AnonymousClass6JG r1 = (AnonymousClass6JG) obj.A00;
        if (this.A01) {
            AnonymousClass6JF r02 = this.A00;
            if (r02 != null) {
                r02.release();
            }
            if (r1 != null) {
                r0 = r1.E2i();
            } else {
                r0 = null;
            }
            this.A00 = r0;
        }
    }
}
