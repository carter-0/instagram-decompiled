package X;

import android.view.ViewGroup;

/* renamed from: X.PbY  reason: case insensitive filesystem */
public final class C73375PbY implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C68080Mzl A02;
    public final /* synthetic */ boolean A03;

    public C73375PbY(C68080Mzl mzl, float f, float f2, boolean z) {
        this.A02 = mzl;
        this.A03 = z;
        this.A01 = f;
        this.A00 = f2;
    }

    public final void run() {
        C68080Mzl mzl = this.A02;
        boolean z = this.A03;
        float f = this.A01;
        float f2 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass0eM r2 = mzl.A0C;
        ViewGroup.LayoutParams layoutParams = AnonymousClass7TE.A0c(r2).getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C71492dQ r5 = (C71492dQ) layoutParams;
        AnonymousClass0eM r1 = mzl.A0B;
        ViewGroup.LayoutParams layoutParams2 = AnonymousClass7TE.A0c(r1).getLayoutParams();
        0qQ.A0C(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C71492dQ r6 = (C71492dQ) layoutParams2;
        float f3 = r5.A02;
        if (f != f3 || f2 != r6.A02) {
            if (!z) {
                r5.A02 = f;
                r6.A02 = f2;
                AnonymousClass7TE.A0c(r2).setLayoutParams(r5);
                AnonymousClass7TE.A0c(r1).setLayoutParams(r6);
                return;
            }
            C67684MsM msM = new C67684MsM(r5, r6, mzl, f3, f, r6.A02, f2);
            msM.setDuration(300);
            AnonymousClass7TE.A0c(r2).startAnimation(msM);
        }
    }
}
