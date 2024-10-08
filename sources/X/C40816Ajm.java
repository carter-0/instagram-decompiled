package X;

/* renamed from: X.Ajm  reason: case insensitive filesystem */
public final class C40816Ajm implements Runnable {
    public final /* synthetic */ C353438Hq A00;

    public C40816Ajm(C353438Hq r1) {
        this.A00 = r1;
    }

    public final void run() {
        C3498081w B6T;
        C353438Hq r4 = this.A00;
        C352888Fl r3 = r4.A09;
        C3498081w.A00(r3);
        C3508086k r1 = r4.A0A;
        r1.A00().CHo();
        AnonymousClass8DD r0 = r4.A0B;
        if (r0 != null) {
            AnonymousClass8DM r02 = r0.A0O;
            if (r02 != null) {
                r02.ARV();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (r4.A03 != null) {
            r1.A00().EKb(r4.A03, true);
            r4.A03 = null;
        }
        if (!r3.A0Y() && (B6T = r3.A19.A00().B6T()) != null) {
            B6T.getView().setVisibility(0);
        }
    }
}
