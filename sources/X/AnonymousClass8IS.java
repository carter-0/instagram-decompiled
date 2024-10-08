package X;

/* renamed from: X.8IS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8IS implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ 0sP A00;

    public AnonymousClass8IS(0sP r1) {
        this.A00 = r1;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.A00;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.A00.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C61910qF) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
