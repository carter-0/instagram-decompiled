package X;

public final /* synthetic */ class TPW implements C61910qF, C13622Tdo {
    public final /* synthetic */ C62320sa A00;

    public TPW(C62320sa r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ void DYU() {
        this.A00.invoke();
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13622Tdo) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C61910qF) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
