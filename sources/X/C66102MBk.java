package X;

/* renamed from: X.MBk  reason: case insensitive filesystem */
public final /* synthetic */ class C66102MBk implements C61910qF, AnonymousClass8J8 {
    public final /* synthetic */ C59936Jc0 A00;

    public C66102MBk(C59936Jc0 jc0) {
        this.A00 = jc0;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C59936Jc0.class, "onTick", "onTick(I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final void DrY(int i) {
        C59936Jc0 jc0 = this.A00;
        if (i != 1) {
            JTQ.A0A(jc0.A04).setText(String.valueOf(i - 1));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8J8) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
