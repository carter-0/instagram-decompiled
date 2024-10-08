package X;

import android.view.View;

/* renamed from: X.Fqk  reason: case insensitive filesystem */
public final class C51229Fqk implements Runnable {
    public final /* synthetic */ C60692Jpd A00;

    public C51229Fqk(C60692Jpd jpd) {
        this.A00 = jpd;
    }

    public final void run() {
        C60692Jpd jpd = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass0eM r1 = jpd.A0A;
        View A0c = AnonymousClass7TE.A0c(r1);
        if (A0c != null) {
            A0c.requestFocus();
        }
        View A0c2 = AnonymousClass7TE.A0c(r1);
        if (A0c2 != null) {
            0nA.A0Q(A0c2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
