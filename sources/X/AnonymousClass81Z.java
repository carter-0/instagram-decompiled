package X;

/* renamed from: X.81Z  reason: invalid class name */
public final class AnonymousClass81Z implements C3496081a {
    public final /* synthetic */ AnonymousClass80R A00;

    public AnonymousClass81Z(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final void CZj(Runnable runnable) {
        AnonymousClass80R r2 = this.A00;
        C356848Vl r0 = r2.A18;
        if (r0 == null) {
            return;
        }
        if (r0.A00().A02 == 3) {
            runnable.run();
        } else {
            r2.A06 = new C338657iJ(this, runnable);
        }
    }
}
