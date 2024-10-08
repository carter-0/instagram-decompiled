package X;

import com.facebook.litho.LithoView;

/* renamed from: X.Ihr  reason: case insensitive filesystem */
public final class C57874Ihr implements Runnable {
    public final /* synthetic */ LithoView A00;
    public final /* synthetic */ AnonymousClass6LP A01;

    public C57874Ihr(LithoView lithoView, AnonymousClass6LP r2) {
        this.A00 = lithoView;
        this.A01 = r2;
    }

    public final void run() {
        LithoView lithoView = this.A00;
        lithoView.getViewTreeObserver().addOnGlobalLayoutListener(new C56824IDv(2, lithoView, this.A01));
    }
}
