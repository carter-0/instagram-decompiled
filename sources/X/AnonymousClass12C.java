package X;

/* renamed from: X.12C  reason: invalid class name */
public final class AnonymousClass12C extends 122 {
    public final String A06() {
        return "LiteProviderInitializer";
    }

    public final void A07() {
        AnonymousClass185 r1 = AnonymousClass185.A01;
        synchronized (r1) {
            r1.A00 = true;
            r1.notifyAll();
        }
    }
}
