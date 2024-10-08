package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.LYt  reason: case insensitive filesystem */
public final class C64293LYt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass4HC A02;

    public C64293LYt(View view, AnonymousClass4HC r2, float f) {
        this.A01 = view;
        this.A02 = r2;
        this.A00 = f;
    }

    public final void onGlobalLayout() {
        View view = this.A01;
        C51967G9n.A0y(view, this);
        AnonymousClass4HC.A00(view, this.A00);
    }
}
