package X;

/* renamed from: X.1G8  reason: invalid class name */
public final class AnonymousClass1G8 implements C63991Bi {
    public static AnonymousClass1G8 A02;
    public AnonymousClass1G9 A00 = new AnonymousClass1G9();
    public AnonymousClass1G9 A01 = new AnonymousClass1G9();

    public final void Cxm(double d, long j, long j2) {
    }

    public final void EFp(double d) {
    }

    public static synchronized AnonymousClass1G8 A00() {
        AnonymousClass1G8 r0;
        synchronized (AnonymousClass1G8.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new AnonymousClass1G8();
                A02 = r0;
            }
        }
        return r0;
    }

    public final void Cxl(double d, long j, long j2) {
        this.A00.A00(d);
    }
}
