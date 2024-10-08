package X;

/* renamed from: X.96L  reason: invalid class name */
public final class AnonymousClass96L implements C3734495k {
    public static final Object A02 = new Object();
    public volatile C3734495k A00;
    public volatile Object A01 = A02;

    public final Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.get();
                this.A01 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }

    public AnonymousClass96L(C3734495k r2) {
        this.A00 = r2;
    }
}
