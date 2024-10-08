package X;

/* renamed from: X.VeP  reason: case insensitive filesystem */
public final class C17750VeP {
    public final synchronized C18451Vrz A00() {
        Throwable th;
        C18451Vrz vrz;
        if (C18451Vrz.A03) {
            vrz = C18451Vrz.A02;
            if (vrz == null) {
                0qQ.A0F("grootSessionManager");
                th = AnonymousClass00P.createAndThrow();
            }
        } else {
            th = new RuntimeException("GrootSessionManager has not been configured yet");
        }
        throw th;
        return vrz;
    }
}
