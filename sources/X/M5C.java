package X;

import android.view.ViewGroup;

public final class M5C implements Runnable {
    public final /* synthetic */ C62245Kcf A00;

    public M5C(C62245Kcf kcf) {
        this.A00 = kcf;
    }

    public final void run() {
        C62245Kcf kcf = this.A00;
        if (kcf.A04.mView != null) {
            AnonymousClass0eM r3 = kcf.A0B;
            ViewGroup.LayoutParams layoutParams = AnonymousClass7TE.A0c(r3).getLayoutParams();
            0qQ.A0C(layoutParams, AnonymousClass000.A00(49));
            layoutParams.height = AnonymousClass7TE.A0c(kcf.A0A).getMeasuredHeight() + JTR.A0U(kcf.A03).getMeasuredHeight();
            AnonymousClass7TE.A0c(r3).setLayoutParams(layoutParams);
        }
    }
}
