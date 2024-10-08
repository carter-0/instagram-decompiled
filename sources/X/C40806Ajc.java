package X;

import android.widget.ImageView;

/* renamed from: X.Ajc  reason: case insensitive filesystem */
public final /* synthetic */ class C40806Ajc implements Runnable {
    public final /* synthetic */ C3503684j A00;

    public /* synthetic */ C40806Ajc(C3503684j r1) {
        this.A00 = r1;
    }

    public final void run() {
        C3503684j r1 = this.A00;
        ImageView imageView = r1.A04;
        if (imageView != null) {
            imageView.setY((AnonymousClass7TE.A03(r1.A0A) * 0.25f) - (AnonymousClass7TE.A03(r1.A04) * 0.5f));
        }
    }
}
