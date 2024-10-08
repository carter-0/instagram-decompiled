package X;

/* renamed from: X.M3v  reason: case insensitive filesystem */
public final class C65906M3v implements Runnable {
    public final /* synthetic */ C63955LFb A00;

    public C65906M3v(C63955LFb lFb) {
        this.A00 = lFb;
    }

    public final void run() {
        C63955LFb lFb = this.A00;
        C378369Pn r2 = lFb.A03;
        AnonymousClass3Q2 A03 = 28K.A00(lFb.A07).A03(lFb.A08.E2M());
        if (A03 != null) {
            r2.A08(A03, 0);
            lFb.A00().setVisibility(0);
            DbT.A1A(lFb.A05.getResources(), lFb.A00(), 2131976403);
            03v.A0B(lFb.A00(), new C60078JfK(lFb, 1));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
