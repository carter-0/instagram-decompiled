package X;

/* renamed from: X.8B3  reason: invalid class name */
public final class AnonymousClass8B3 implements AnonymousClass07g, AnonymousClass07P {
    public final C587707f A00;
    public final 2YS A01;
    public final AnonymousClass8B4 A02 = new Object();
    public final AnonymousClass8Z0 A03;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.8B4, java.lang.Object] */
    public AnonymousClass8B3(C587707f r3, AnonymousClass8Z0 r4) {
        0qQ.A0B(r4, 2);
        this.A00 = r3;
        this.A03 = r4;
        2YS r1 = new 2YS(AnonymousClass2YP.A00);
        r1.A01(AnonymousClass8B5.A00, r4);
        this.A01 = r1;
    }

    public final AnonymousClass2YQ getDefaultViewModelCreationExtras() {
        return this.A01;
    }

    public final 2YM getDefaultViewModelProviderFactory() {
        return this.A02;
    }

    public final C587707f getViewModelStore() {
        return this.A00;
    }
}
