package X;

/* renamed from: X.7Oo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C330867Oo implements C61910qF, C74336PtC {
    public final /* synthetic */ AnonymousClass7V0 A00;

    public C330867Oo(AnonymousClass7V0 r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C74336PtC) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(0, this.A00, AnonymousClass7V0.class, "retrieveEnforcementNoticeInfo", "retrieveEnforcementNoticeInfo()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final void Dnd() {
        AnonymousClass7V0.A01(this.A00);
    }
}
