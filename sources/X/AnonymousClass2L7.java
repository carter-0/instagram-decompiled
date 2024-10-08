package X;

/* renamed from: X.2L7  reason: invalid class name */
public final class AnonymousClass2L7 implements AnonymousClass1EO {
    public AnonymousClass1EO A00;
    public boolean A01;

    public final synchronized void cancel() {
        this.A01 = true;
        AnonymousClass1EO r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
    }
}
