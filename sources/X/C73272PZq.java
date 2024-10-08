package X;

import android.view.ViewGroup;
import com.instagram.ui.widget.search.ImeBackButtonHandlerFrameLayout;

/* renamed from: X.PZq  reason: case insensitive filesystem */
public final /* synthetic */ class C73272PZq implements Runnable {
    public final /* synthetic */ ViewGroup.LayoutParams A00;
    public final /* synthetic */ OIK A01;

    public /* synthetic */ C73272PZq(ViewGroup.LayoutParams layoutParams, OIK oik) {
        this.A01 = oik;
        this.A00 = layoutParams;
    }

    public final void run() {
        OIK oik = this.A01;
        ViewGroup.LayoutParams layoutParams = this.A00;
        ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = oik.A0E;
        if (imeBackButtonHandlerFrameLayout != null) {
            imeBackButtonHandlerFrameLayout.setLayoutParams(layoutParams);
        }
    }
}
