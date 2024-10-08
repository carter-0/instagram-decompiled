package X;

/* renamed from: X.7HW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7HW implements C61910qF, C227182im {
    public final /* synthetic */ 0sL A00;

    public AnonymousClass7HW(0sL r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ void DmH(int i, int i2) {
        this.A00.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C227182im) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C61910qF) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
