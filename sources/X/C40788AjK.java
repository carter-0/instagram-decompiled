package X;

/* renamed from: X.AjK  reason: case insensitive filesystem */
public final class C40788AjK implements Runnable {
    public final /* synthetic */ C342837pF A00;

    public C40788AjK(C342837pF r1) {
        this.A00 = r1;
    }

    public final void run() {
        C342837pF r6 = this.A00;
        C331157Pu A002 = new C331127Pr(r6.A01).A00();
        String str = r6.A03;
        String A003 = C273654mx.A00(2848);
        String A004 = C273654mx.A00(745);
        DxB dxB = new DxB();
        dxB.setArguments(Q21.A00(AnonymousClass7TE.A1L(AnonymousClass000.A00(43), A003), AnonymousClass7TE.A1L(AnonymousClass000.A00(509), A004), AnonymousClass7TE.A1L(AnonymousClass000.A00(253), str)));
        dxB.A00 = new AXG(0, r6, A002);
        A002.A02(r6.A00, dxB);
    }
}
