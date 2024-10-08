package X;

import android.view.View;
import android.widget.VideoView;

/* renamed from: X.Mph  reason: case insensitive filesystem */
public final class C67547Mph implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass50C A00;
    public final /* synthetic */ AnonymousClass4AL A01;

    public final void onViewAttachedToWindow(View view) {
    }

    public C67547Mph(AnonymousClass50C r1, AnonymousClass4AL r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        if (182.A06(0Tu.A05, this.A01.A02, 36326025935861208L)) {
            0nY.A00().ATE(new NRO(this.A00));
            return;
        }
        AnonymousClass50C r1 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        ((VideoView) r1.A0B.A0E.getView()).pause();
    }
}
