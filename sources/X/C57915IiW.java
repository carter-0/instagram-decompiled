package X;

import android.view.ViewGroup;

/* renamed from: X.IiW  reason: case insensitive filesystem */
public final class C57915IiW implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C316906mP A02;

    public C57915IiW(C255773uh r1, C255783ui r2, C316906mP r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C316906mP r6 = this.A02;
        C255773uh r4 = this.A00;
        C255783ui r3 = this.A01;
        boolean CcK = r4.CcK();
        AnonymousClass0eM r5 = r6.A04;
        if (CcK) {
            ViewGroup A012 = C3019160o.A01(AnonymousClass7TE.A0c(r5));
            C306406Ma.A02(AnonymousClass7TE.A0c(r5), (AnonymousClass7TE.A02(A012) * 0.5f) - (AnonymousClass7TE.A02(AnonymousClass7TE.A0c(r5)) * 0.5f), (float) ((A012.getHeight() - AnonymousClass7TE.A0c(r5).getHeight()) - AnonymousClass7TG.A02(r6.A01)), true);
            return;
        }
        C51975G9x.A10(AnonymousClass7TE.A0c(r5), r4, r3, r6.A02.getWidth(), C3019160o.A01(AnonymousClass7TE.A0c(r5)).getHeight());
    }
}
