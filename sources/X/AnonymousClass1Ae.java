package X;

/* renamed from: X.1Ae  reason: invalid class name */
public final class AnonymousClass1Ae implements AnonymousClass0eK {
    public final AnonymousClass0eK A00;
    public volatile Object A01 = null;

    public final Object get() {
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 != null) {
                Object obj = this.A01;
                return obj;
            }
            this.A01 = this.A00.get();
            Object obj2 = this.A01;
            return obj2;
        }
    }

    public AnonymousClass1Ae(AnonymousClass0eK r2) {
        this.A00 = r2;
    }
}
