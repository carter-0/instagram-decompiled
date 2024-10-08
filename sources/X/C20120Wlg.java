package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;

/* renamed from: X.Wlg  reason: case insensitive filesystem */
public final class C20120Wlg implements Runnable {
    public final /* synthetic */ C15173UTy A00;
    public final /* synthetic */ WJo A01;

    public C20120Wlg(C15173UTy uTy, WJo wJo) {
        this.A01 = wJo;
        this.A00 = uTy;
    }

    public final void run() {
        WJo wJo = this.A01;
        FrameLayout.LayoutParams layoutParams = WJo.A0c;
        OverScroller overScroller = wJo.A0W;
        overScroller.computeScrollOffset();
        wJo.A04 = (float) overScroller.getCurrX();
        wJo.A05 = (float) overScroller.getCurrY();
        float currX = (float) overScroller.getCurrX();
        float currY = (float) overScroller.getCurrY();
        View A002 = WJo.A00(wJo);
        A002.setTranslationX(currX);
        A002.setTranslationY(currY);
        if (!overScroller.isFinished()) {
            this.A00.postOnAnimation(this);
        } else {
            WJo.A02(wJo);
        }
    }
}
