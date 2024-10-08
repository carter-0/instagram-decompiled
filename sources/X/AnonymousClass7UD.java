package X;

/* renamed from: X.7UD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7UD implements C61910qF, AnonymousClass7UE {
    public final /* synthetic */ C62320sa A00;

    public AnonymousClass7UD(C62320sa r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ Object get() {
        return this.A00.invoke();
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7UE) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C61910qF) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
