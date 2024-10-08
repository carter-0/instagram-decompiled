package X;

/* renamed from: X.MBj  reason: case insensitive filesystem */
public final /* synthetic */ class C66101MBj implements C61910qF, AnonymousClass8JA {
    public final /* synthetic */ C59936Jc0 A00;

    public C66101MBj(C59936Jc0 jc0) {
        this.A00 = jc0;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(0, this.A00, C59936Jc0.class, "onFinish", AnonymousClass000.A00(3690), 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8JA) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }

    public final void onFinish() {
        C59936Jc0 jc0 = this.A00;
        C51969G9p.A1M(AnonymousClass7TE.A14(jc0.A03));
        jc0.A05.invoke();
    }
}
