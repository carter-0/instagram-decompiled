package X;

import android.view.View;

/* renamed from: X.3UC  reason: invalid class name */
public final class AnonymousClass3UC implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass3TC A00;
    public final /* synthetic */ AnonymousClass3TR A01;

    public AnonymousClass3UC(AnonymousClass3TC r1, AnonymousClass3TR r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onViewAttachedToWindow(View view) {
        AnonymousClass3TR r4 = this.A01;
        AnonymousClass3W1 r3 = r4.A02;
        if ((r3 == null || !r3.A2i) && r4.A05 && r3 != null) {
            ((C292555j9) this.A00.A02.A01(C292555j9.class, C292545j8.A00)).A01(r3, r4.A00);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C292555j9 r1 = (C292555j9) this.A00.A02.A01(C292555j9.class, C292545j8.A00);
        AnonymousClass3W1 r0 = this.A01.A02;
        if (r0 != null) {
            r1.A00(r0);
        }
    }
}
