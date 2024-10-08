package X;

public final class Q2U extends AnonymousClass5AE {
    public final /* synthetic */ Q2S A00;

    public Q2U(Q2S q2s) {
        this.A00 = q2s;
    }

    public final String A05() {
        Q2R q2r = (Q2R) this.A00.A01.get();
        if (q2r == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("tag=[");
        return Pxg.A0r(q2r.A02, A1A);
    }
}
