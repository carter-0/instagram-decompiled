package X;

/* renamed from: X.3BY  reason: invalid class name */
public final class AnonymousClass3BY implements C232652uA {
    public final /* synthetic */ AnonymousClass2rI A00;

    public AnonymousClass3BY(AnonymousClass2rI r1) {
        this.A00 = r1;
    }

    public final C232652uA A9P(C231642s0 r3, Object obj, Object obj2) {
        AnonymousClass2rI r0 = this.A00;
        if (r3 != null) {
            r0.addModel(obj, obj2, r3);
            return this;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
