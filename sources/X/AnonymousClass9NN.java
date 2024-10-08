package X;

import android.view.View;

/* renamed from: X.9NN  reason: invalid class name */
public final class AnonymousClass9NN implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass4EZ A00;
    public final /* synthetic */ AnonymousClass4EA A01;

    public AnonymousClass9NN(AnonymousClass4EZ r1, AnonymousClass4EA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onViewAttachedToWindow(View view) {
        AnonymousClass4EA r4 = this.A01;
        AnonymousClass3W1 r3 = r4.A04;
        if ((r3 == null || !r3.A2i) && r4.A05 && r3 != null) {
            ((C292555j9) this.A00.A04.A01(C292555j9.class, C292545j8.A00)).A01(r3, r4.A00);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C292555j9 r1 = (C292555j9) this.A00.A04.A01(C292555j9.class, C292545j8.A00);
        AnonymousClass3W1 r0 = this.A01.A04;
        if (r0 != null) {
            r1.A00(r0);
        }
    }
}
