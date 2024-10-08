package X;

/* renamed from: X.MBf  reason: case insensitive filesystem */
public final /* synthetic */ class C66097MBf implements C61910qF, C3495480u {
    public final /* synthetic */ C64710Lgj A00;

    public C66097MBf(C64710Lgj lgj) {
        this.A00 = lgj;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C64710Lgj.class, "onCameraDestinationChanged", "onCameraDestinationChanged(Lcom/instagram/creation/cameraconfiguration/CameraDestination;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        0qQ.A0B(obj, 0);
        C60312JjF A002 = C64710Lgj.A00(this.A00);
        if (obj.equals(AnonymousClass80L.A00)) {
            C60312JjF.A02(A002);
            05G r0 = A002.A0L;
            Boolean A0v = AnonymousClass7TE.A0v();
            r0.Epw(A0v);
            A002.A0N.Epw(A0v);
            A002.A0Q.Epw(Double.valueOf(1.0d));
            MGU.A02(A002, JTP.A0K(A002, A002.A0C.A00(A002.A08), A002.A0S), 27);
        } else if (obj.equals(AnonymousClass9QA.A00)) {
            C60312JjF.A03(A002);
            MGU.A02(A002, C318116oQ.A00(A002), 28);
            A002.A0Q.Epw(Double.valueOf(1.0d));
        } else {
            C60312JjF.A03(A002);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3495480u) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
