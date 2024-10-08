package X;

/* renamed from: X.7ho  reason: invalid class name and case insensitive filesystem */
public final class C338347ho extends C338357hp {
    public final C251263mp A00;
    public final 2Sg A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.7hM] */
    public static C338347ho A00() {
        ? obj = new Object();
        obj.A00 = new AnonymousClass3XA();
        return new C338347ho(obj);
    }

    public final String getName() {
        return this.A00.A0J();
    }

    public C338347ho(C338067hM r3) {
        this.A00 = r3.A00;
        C251263mp r0 = r3.A00;
        if (r0 != null) {
            this.A00 = r0;
            this.A01 = r3.A01;
            return;
        }
        throw new IllegalStateException("Component must be provided.");
    }
}
