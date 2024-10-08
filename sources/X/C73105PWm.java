package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* renamed from: X.PWm  reason: case insensitive filesystem */
public final class C73105PWm implements Runnable {
    public final /* synthetic */ C68050MzH A00;

    public C73105PWm(C68050MzH mzH) {
        this.A00 = mzH;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.NR1, android.view.View] */
    public final void run() {
        Rect A0W = AnonymousClass7TE.A0W();
        C68050MzH mzH = this.A00;
        if (!mzH.itemView.getGlobalVisibleRect(A0W) || A0W.width() < mzH.itemView.getWidth()) {
            NR1 A002 = mzH.A00();
            if (A002 != null) {
                A002.A04 = false;
                A002.A0I();
                return;
            }
            return;
        }
        ? A003 = mzH.A00();
        if (A003 != 0) {
            boolean z = C68478NJv.A03(mzH.A02).A00;
            ValueAnimator valueAnimator = A003.A08;
            if (!valueAnimator.isRunning() && !A003.A05) {
                A003.A04 = z;
                A003.A05 = false;
                A003.A00 = 1.0f;
                if (z) {
                    valueAnimator.cancel();
                    valueAnimator.start();
                    return;
                }
                A003.invalidate();
            }
        }
    }
}
