package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.FPi  reason: case insensitive filesystem */
public final class C50118FPi implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C61082JwK A01;
    public final /* synthetic */ AnonymousClass70R A02;
    public final /* synthetic */ C46992Dok A03;
    public final /* synthetic */ C47235DtM A04;

    public C50118FPi(View view, C61082JwK jwK, AnonymousClass70R r3, C46992Dok dok, C47235DtM dtM) {
        this.A02 = r3;
        this.A03 = dok;
        this.A04 = dtM;
        this.A01 = jwK;
        this.A00 = view;
    }

    public final void onGlobalLayout() {
        this.A02.DLB(this.A03.A00, this.A01, this.A04.A01);
        this.A00.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
