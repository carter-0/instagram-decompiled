package X;

/* renamed from: X.85i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3505985i implements C61910qF, C3495480u {
    public final /* synthetic */ 0sP A00;

    public C3505985i(0sP r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.A00;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.A00.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3495480u) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C61910qF) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
