package X;

import android.view.View;

/* renamed from: X.OhO  reason: case insensitive filesystem */
public final class C71283OhO implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass90H A00;

    public C71283OhO(AnonymousClass90H r1) {
        this.A00 = r1;
    }

    public final void onViewAttachedToWindow(View view) {
        C66819MdB mdB = this.A00.A01;
        if (mdB != null) {
            mdB.Dyu();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        AnonymousClass90H r1 = this.A00;
        C66819MdB mdB = r1.A01;
        if (mdB != null) {
            mdB.Dyt();
            mdB.Dds();
            r1.A01 = null;
        }
    }
}
