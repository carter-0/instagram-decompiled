package X;

/* renamed from: X.VjA  reason: case insensitive filesystem */
public final class C17973VjA {
    public VQW A00;
    public final C15046UKz A01;
    public final VQO A02;

    public final void A00(X27 x27) {
        VQW vqw = this.A00;
        if (vqw == null) {
            0qQ.A0F("aleBridge");
            throw AnonymousClass00P.createAndThrow();
        }
        synchronized (vqw) {
            vqw.A01.add(x27);
        }
    }

    public final void A01(X27 x27) {
        VQW vqw = this.A00;
        if (vqw == null) {
            0qQ.A0F("aleBridge");
            throw AnonymousClass00P.createAndThrow();
        }
        synchronized (vqw) {
            vqw.A01.remove(x27);
        }
    }

    public C17973VjA(C15046UKz uKz, VQO vqo) {
        this.A02 = vqo;
        this.A01 = uKz;
    }
}
