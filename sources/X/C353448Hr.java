package X;

/* renamed from: X.8Hr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C353448Hr implements C61910qF, C3495480u {
    public final /* synthetic */ C353398Hl A00;

    public C353448Hr(C353398Hl r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3495480u) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C353398Hl.class, "onCameraDestinationChanged", "onCameraDestinationChanged(Lcom/instagram/creation/cameraconfiguration/CameraDestination;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C279284yO r2 = (C279284yO) obj;
        0qQ.A0B(r2, 0);
        C353398Hl.A02(r2, this.A00);
    }
}
