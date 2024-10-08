package X;

/* renamed from: X.7YW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7YW implements C61910qF, 1aV {
    public final /* synthetic */ AnonymousClass7TI A00;

    public AnonymousClass7YW(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof 1aV) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, AnonymousClass7TI.class, "onEnterThreadLogging", "onEnterThreadLogging(Lcom/instagram/model/direct/threadkey/intf/ThreadId;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AnonymousClass7TI.A0A(this.A00, (C254793t3) obj);
    }
}
