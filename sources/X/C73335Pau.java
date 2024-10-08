package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.Pau  reason: case insensitive filesystem */
public final class C73335Pau implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C71139Odj A02;

    public C73335Pau(C71139Odj odj, int i, int i2) {
        this.A02 = odj;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        C71139Odj odj = this.A02;
        ReboundHorizontalScrollView reboundHorizontalScrollView = odj.A09;
        if (reboundHorizontalScrollView.isLaidOut()) {
            C71139Odj.A06(odj, this.A00, this.A01, false);
            return;
        }
        C73334Pat pat = new C73334Pat(odj, this.A00, this.A01);
        View.OnLayoutChangeListener onLayoutChangeListener = odj.A00;
        if (onLayoutChangeListener != null) {
            reboundHorizontalScrollView.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        C71414OkD okD = new C71414OkD(3, odj, pat);
        odj.A00 = okD;
        reboundHorizontalScrollView.addOnLayoutChangeListener(okD);
    }
}
