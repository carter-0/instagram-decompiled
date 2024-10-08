package X;

import android.view.View;

/* renamed from: X.AmZ  reason: case insensitive filesystem */
public final class C40989AmZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass80G A01;

    public C40989AmZ(AnonymousClass80G r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public final void run() {
        View A05 = this.A01.A05();
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.creation.base.ui.ConstrainedView");
        ((B1I) A05).setAspectRatio(this.A00);
    }
}
