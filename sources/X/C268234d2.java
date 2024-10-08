package X;

/* renamed from: X.4d2  reason: invalid class name and case insensitive filesystem */
public final class C268234d2 implements AnonymousClass4D6 {
    public final C61480nO A00;

    public final void schedule(AnonymousClass11X r8) {
        r8.getClass();
        int runnableId = r8.getRunnableId();
        C61480nO r0 = this.A00;
        r8.onStart();
        r0.ATE(new C291025gO(r8, runnableId, 3, false, false));
    }

    public C268234d2(C61480nO r1) {
        this.A00 = r1;
    }

    public final void schedule(AnonymousClass11X r8, int i, int i2, boolean z, boolean z2) {
        r8.getClass();
        C61480nO r0 = this.A00;
        r8.onStart();
        r0.ATE(new C291025gO(r8, i, i2, z, z2));
    }
}
