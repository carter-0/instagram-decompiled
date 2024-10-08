package X;

/* renamed from: X.MBd  reason: case insensitive filesystem */
public final /* synthetic */ class C66095MBd implements C61910qF, MRO {
    public final /* synthetic */ C60348Jjt A00;

    public C66095MBd(C60348Jjt jjt) {
        this.A00 = jjt;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(0, this.A00, C60348Jjt.class, "invalidate", "invalidate()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final void DLZ() {
        this.A00.A03();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MRO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
